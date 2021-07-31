package com.example.user.utils;

import org.slf4j.LoggerFactory;

public class Logger {

    public static void info(Object object, String msg) {
        org.slf4j.Logger logger = LoggerFactory.getLogger(object.getClass());
        logger.info(msg);
    }
}
