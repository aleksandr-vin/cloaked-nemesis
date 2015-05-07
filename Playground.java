

import java.io.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.slf4j.MDC;

class Playground {

    static final Logger logger = LoggerFactory.getLogger(Playground.class);

    public static void main(String args[]) {
        System.out.println("Welcome to playground");

        MDC.put("main", "running");

        logger.debug("Starting main func");
        for (int i = 0; i < 3; ++i) {
            logger.trace("Kinda tracing the main func, i: {}", i);
            MDC.put("i", String.valueOf(i));
            foo(i);
            MDC.remove("i");
        }
        logger.info("Main func accomplished");
        logger.error("About to shutdown");
    }

    static void foo(int i) {
        logger.debug("Starting foo func");
        logger.trace("Kinda tracing the foo func, i: {}", i);
        logger.info("Foo func accomplished");
    }
}
