package org.slf4j.event;

import org.slf4j.Marker;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes12.dex */
public interface LoggingEvent {
    Object[] getArgumentArray();

    Level getLevel();

    String getLoggerName();

    Marker getMarker();

    String getMessage();

    String getThreadName();

    Throwable getThrowable();

    long getTimeStamp();
}
