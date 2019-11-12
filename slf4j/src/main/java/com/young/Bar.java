package com.young;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Bar {
    private static final Logger logger = LoggerFactory.getLogger(Bar.class);

    public boolean doIt() {
        logger.error("Did it again!");
        return true;
    }
}
