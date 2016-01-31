package com.kaznowski.hugh.homepage;

import com.kaznowski.hugh.homepage.models.HomepageResponse;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.logging.Logger;

/**
 * Created by hugh on 27/10/15.
 */
public class MyServlet extends HttpServlet {

    private static final Logger logger = Logger.getLogger(MyServlet.class.getName());

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        logger.info("Received get request");
        ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
        HomepageResponse hResp = (HomepageResponse) context.getBean("response");
        logger.info("Homepage response message: " + hResp.getMsg());

        req.setAttribute("msg", "this is the message");
        req.getRequestDispatcher("/WEB-INF/index.jsp").forward(req, resp);
    }
}
