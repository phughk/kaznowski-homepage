package com.kaznowski.hugh.homepage;

import com.kaznowski.hugh.homepage.fixtures.ServerWrapperFixture;
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
    ServerWrapperFixture serverWrapper;
    final List<String> methodsCalled = new ArrayList<>();

    /**
     * Needs to be initialised before the server, therefore server init calls this
     */
    public void initServerWrapper() {
        serverWrapper = new ServerWrapperFixture();
        serverWrapper.addMethodListener((methodName, params) -> methodsCalled.add(methodName));
    }

    @Before
    public void initApplication() {
        initServerWrapper();
        myServlet = new MyServlet(serverWrapper);
    }

    @Test
    public void applicationSetsHandler() {
        Assert.assertTrue("The myServlet must set the handler in the constructor", methodsCalled.contains("setHandler"));
    }

    @After
    public void clearMethodCalls() {
        methodsCalled.clear();
    }

}
