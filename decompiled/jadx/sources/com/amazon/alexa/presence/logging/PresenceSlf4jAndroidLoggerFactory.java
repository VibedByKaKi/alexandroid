package com.amazon.alexa.presence.logging;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import org.slf4j.ILoggerFactory;
import org.slf4j.Logger;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes18.dex */
public class PresenceSlf4jAndroidLoggerFactory implements ILoggerFactory {
    public static final PresenceSlf4jAndroidLoggerFactory DEFAULT = new PresenceSlf4jAndroidLoggerFactory();
    private ConcurrentMap<String, Logger> loggerMap = new ConcurrentHashMap();

    @Override // org.slf4j.ILoggerFactory
    public Logger getLogger(String str) {
        Logger logger = this.loggerMap.get(str);
        if (logger != null) {
            return logger;
        }
        PresenceSlf4jAndroidLogger presenceSlf4jAndroidLogger = new PresenceSlf4jAndroidLogger(str);
        Logger putIfAbsent = this.loggerMap.putIfAbsent(str, presenceSlf4jAndroidLogger);
        return putIfAbsent == null ? presenceSlf4jAndroidLogger : putIfAbsent;
    }
}
