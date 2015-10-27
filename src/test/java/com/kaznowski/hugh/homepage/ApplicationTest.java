package com.kaznowski.hugh.homepage;

import junit.framework.Assert;
import org.eclipse.jetty.server.Server;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by hugh on 27/10/15.
 */
public class ApplicationTest {

    Application application;

    @Before
    public void initApplication() {
        application = new Application();
    }

    @Test
    public void testApplicationInstanceOfServer() {
        Assert.assertTrue("The application class should be an instance of jetty server", application instanceof Server);
    }
}
