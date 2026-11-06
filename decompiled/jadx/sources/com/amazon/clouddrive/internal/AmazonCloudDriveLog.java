package com.amazon.clouddrive.internal;

import java.util.Enumeration;
import java.util.logging.Level;
import java.util.logging.LogManager;
import java.util.logging.Logger;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
class AmazonCloudDriveLog {
    private static Logger LOG = getLogger();
    static final String LOGGER_NAME = "AmazonCloudDrive";

    private AmazonCloudDriveLog() {
        throw new UnsupportedOperationException("Do not instantiate this.");
    }

    private static Logger getLogger() {
        Enumeration<String> loggerNames = LogManager.getLogManager().getLoggerNames();
        while (loggerNames.hasMoreElements()) {
            if (loggerNames.nextElement().equals(LOGGER_NAME)) {
                return Logger.getLogger(LOGGER_NAME);
            }
        }
        Logger logger = Logger.getLogger(LOGGER_NAME);
        logger.setLevel(Level.SEVERE);
        return logger;
    }

    public static void w(String str, Throwable th) {
        LOG.log(Level.WARNING, str, th);
    }
}
