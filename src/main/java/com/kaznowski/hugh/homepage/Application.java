package com.kaznowski.hugh.homepage;

import com.kaznowski.hugh.homepage.implementation.ServerWrapperWrapperImplementation;
import com.kaznowski.hugh.homepage.interfaces.ServerWrapperInterface;
import org.eclipse.jetty.server.Handler;

/**
 * Created by hugh on 27/10/15.
 */
public class Application {

    private final ServerWrapperInterface server;

    /**
     * Having the constructor accept interfaces allows for testing of the embedded server
     * @param server
     */
    public Application(ServerWrapperInterface server) {
        this.server = server;
    }

    public static void main(String[] args) {
        Application app = new Application(new ServerWrapperWrapperImplementation(80));
        app.server.setHandler(app.getHandler());
    }

    private Handler getHandler() {
        return null;
    }

}
