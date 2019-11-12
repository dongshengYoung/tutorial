package com.young;

// Import log4j classes.

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class App {

    // Define a static logger variable so that it references the
    // Logger instance named "MyApp".
    private static final Logger logger = LogManager.getLogger(App.class);

    public static void main(final String... args) {

        // Set up a simple configuration that logs on the console.

        logger.trace("Entering application.");
        Bar bar = new Bar();
        for (int i = 0; i < 100000; i++) {
            if (!bar.doIt()) {
                logger.error("Didn't do it.");
            }
        }
        logger.trace("Exiting application.");
    }
}
