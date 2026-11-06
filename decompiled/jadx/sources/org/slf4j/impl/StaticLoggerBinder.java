package org.slf4j.impl;

import org.slf4j.ILoggerFactory;
import org.slf4j.spi.LoggerFactoryBinder;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes12.dex */
public class StaticLoggerBinder implements LoggerFactoryBinder {
    private static final StaticLoggerBinder SINGLETON = new StaticLoggerBinder();
    public static String REQUESTED_API_VERSION = "1.7.7";
    private static final String FACTORY_CLASS = AlexaSlf4jAndroidLoggerFactory.class.getName();

    private StaticLoggerBinder() {
    }

    public static final StaticLoggerBinder getSingleton() {
        return SINGLETON;
    }

    @Override // org.slf4j.spi.LoggerFactoryBinder
    public ILoggerFactory getLoggerFactory() {
        return AlexaSlf4jAndroidLoggerFactory.SINGLETON;
    }

    @Override // org.slf4j.spi.LoggerFactoryBinder
    public String getLoggerFactoryClassStr() {
        return FACTORY_CLASS;
    }
}
