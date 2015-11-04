package com.kaznowski.hugh.homepage;

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
/*
        ServletOutputStream os = resp.getOutputStream();
        os.println("Test 1 2 3");
*/
        req.setAttribute("msg", "this is the message");
        req.getRequestDispatcher("/WEB-INF/index.jsp").forward(req, resp);
//        resp.setStatus(200);
    }
}
