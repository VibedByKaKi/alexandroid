package org.slf4j.spi;

import org.slf4j.Logger;
import org.slf4j.Marker;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes12.dex */
public interface LocationAwareLogger extends Logger {
    public static final int DEBUG_INT = 10;
    public static final int ERROR_INT = 40;
    public static final int INFO_INT = 20;
    public static final int TRACE_INT = 0;
    public static final int WARN_INT = 30;

    void log(Marker marker, String str, int i, String str2, Object[] objArr, Throwable th);
}
