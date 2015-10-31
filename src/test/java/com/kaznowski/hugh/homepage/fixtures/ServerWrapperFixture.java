package com.kaznowski.hugh.homepage.fixtures;

import org.eclipse.jetty.server.Handler;

import java.util.HashSet;
import java.util.Set;
import java.util.function.BiConsumer;

/**
 * Created by hugh on 28/10/15.
 */
public class ServerWrapperFixture {
    private Handler handler;
    private final Set<BiConsumer<String, Object[]>> methodListenerSet;

    public ServerWrapperFixture() {
        methodListenerSet = new HashSet<>();
    }

    /**
     * Add a listener that will be called every time a method is called
     * @param listener
     */
    public void addMethodListener(BiConsumer<String, Object[]> listener) {
        methodListenerSet.add(listener);
    }

    public void setHandler(Handler h) {
        for (BiConsumer<String, Object[]> listener: methodListenerSet) {
            listener.accept("setHandler", new Object[] {h});
        }
        handler = h;
    }

    public Handler getHandler() {
        return handler;
    }
}
