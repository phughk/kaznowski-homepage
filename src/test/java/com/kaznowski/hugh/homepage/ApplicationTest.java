package com.kaznowski.hugh.homepage;

import com.kaznowski.hugh.homepage.fixtures.ServerWrapperFixture;
import com.kaznowski.hugh.homepage.interfaces.ServerWrapperInterface;
import junit.framework.Assert;
import org.eclipse.jetty.server.Server;
import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.RuleChain;
import org.junit.rules.TestRule;
import org.junit.runner.Description;
import org.junit.runners.model.Statement;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/**
 * Created by hugh on 27/10/15.
 */
public class ApplicationTest {

    Application application;
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
        application = new Application(serverWrapper);
    }

    @Test
    public void applicationSetsHandler() {
        Assert.assertTrue("The application must set the handler in the constructor", methodsCalled.contains("setHandler"));
    }

    @After
    public void clearMethodCalls() {
        methodsCalled.clear();
    }

}
