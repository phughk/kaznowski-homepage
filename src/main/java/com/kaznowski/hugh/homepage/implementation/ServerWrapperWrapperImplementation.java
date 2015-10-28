package com.kaznowski.hugh.homepage.implementation;

import com.kaznowski.hugh.homepage.interfaces.ServerWrapperInterface;
import org.eclipse.jetty.server.Handler;
import org.eclipse.jetty.server.Server;

/**
 * Created by hugh on 27/10/15.
 */
public class ServerWrapperWrapperImplementation implements ServerWrapperInterface {
    Server server;

    public ServerWrapperWrapperImplementation(int port) {
        server = new Server(port);
    }

    public void setHandler(Handler h) {
        server.setHandler(h);
    }
}
