package com.kaznowski.hugh.homepage;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Logger;

/**
 * Created by hugh on 27/10/15.
 */
public class MyServlet extends HttpServlet {

    private static final Logger logger = Logger.getLogger(MyServlet.class.getName());

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doGet(req, resp);
        logger.info("Received get request");
        PrintWriter out = resp.getWriter();
        out.write("Test 1 2 3");
        out.flush();
        out.close();
        resp.setStatus(200);
    }
}
