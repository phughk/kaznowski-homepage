package com.kaznowski.hugh.homepage.interfaces;

import org.eclipse.jetty.server.Handler;

/**
 * Created by hugh on 27/10/15.
 */
public interface ServerWrapperInterface {

    /**
     * Set the request handler for the embedded jetty server
     * @param h the jetty handler
     */
    void setHandler(Handler h);
}
