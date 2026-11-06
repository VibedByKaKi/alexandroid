package org.slf4j.impl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import org.slf4j.ILoggerFactory;
import org.slf4j.Logger;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes12.dex */
public class AlexaSlf4jAndroidLoggerFactory implements ILoggerFactory {
    private ConcurrentMap<String, AlexaSlf4jAndroidLogger> loggerMap = new ConcurrentHashMap();
    public static final AlexaSlf4jAndroidLoggerFactory SINGLETON = new AlexaSlf4jAndroidLoggerFactory();
    private static final List<ILoggerFactory> LOGGER_FACTORIES = new ArrayList();

    public static synchronized void subscribe(ILoggerFactory iLoggerFactory) {
        synchronized (AlexaSlf4jAndroidLoggerFactory.class) {
            List<ILoggerFactory> list = LOGGER_FACTORIES;
            if (list.contains(iLoggerFactory)) {
                return;
            }
            list.add(iLoggerFactory);
            Iterator<Map.Entry<String, AlexaSlf4jAndroidLogger>> it2 = SINGLETON.loggerMap.entrySet().iterator();
            while (it2.hasNext()) {
                it2.next().getValue().subscribe(iLoggerFactory);
            }
        }
    }

    private void subscribeFactories(AlexaSlf4jAndroidLogger alexaSlf4jAndroidLogger) {
        Iterator<ILoggerFactory> it2 = LOGGER_FACTORIES.iterator();
        while (it2.hasNext()) {
            alexaSlf4jAndroidLogger.subscribe(it2.next());
        }
    }

    public static synchronized void unsubscribe(ILoggerFactory iLoggerFactory) {
        synchronized (AlexaSlf4jAndroidLoggerFactory.class) {
            List<ILoggerFactory> list = LOGGER_FACTORIES;
            if (list.contains(iLoggerFactory)) {
                list.remove(iLoggerFactory);
                Iterator<Map.Entry<String, AlexaSlf4jAndroidLogger>> it2 = SINGLETON.loggerMap.entrySet().iterator();
                while (it2.hasNext()) {
                    it2.next().getValue().unsubscribe(iLoggerFactory);
                }
            }
        }
    }

    @Override // org.slf4j.ILoggerFactory
    public Logger getLogger(String str) {
        AlexaSlf4jAndroidLogger alexaSlf4jAndroidLogger = this.loggerMap.get(str);
        if (alexaSlf4jAndroidLogger != null) {
            return alexaSlf4jAndroidLogger;
        }
        AlexaSlf4jAndroidLogger alexaSlf4jAndroidLogger2 = new AlexaSlf4jAndroidLogger(str);
        AlexaSlf4jAndroidLogger putIfAbsent = this.loggerMap.putIfAbsent(str, alexaSlf4jAndroidLogger2);
        if (putIfAbsent == null) {
            subscribeFactories(alexaSlf4jAndroidLogger2);
        }
        return putIfAbsent == null ? alexaSlf4jAndroidLogger2 : putIfAbsent;
    }
}
