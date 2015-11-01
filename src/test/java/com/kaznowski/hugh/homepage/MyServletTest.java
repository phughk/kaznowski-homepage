package com.kaznowski.hugh.homepage;

import junit.framework.Assert;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by hugh on 27/10/15.
 */
public class MyServletTest {

    MyServlet myServlet;
    final List<String> methodsCalled = new ArrayList<>();

    /**
     * Needs to be initialised before the server, therefore server init calls this
     */
    public void initServerWrapper() {
    }

    @Before
    public void initApplication() {
        initServerWrapper();
    }

    @After
    public void clearMethodCalls() {
        methodsCalled.clear();
    }

}
