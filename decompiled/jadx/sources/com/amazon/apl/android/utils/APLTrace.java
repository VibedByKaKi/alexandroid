package com.amazon.apl.android.utils;

import android.os.Trace;
import java.util.EnumMap;
import java.util.Map;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class APLTrace {
    private static final char AGENT_CLASS_SEPARATOR = '-';
    private static final char CLASS_METHOD_SEPARATOR = '.';
    private String mAgentName;
    private final Map<TracePoint, String> mTracePointSectionNameMap = new EnumMap(TracePoint.class);

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public class AutoTrace implements AutoCloseable {
        public AutoTrace(TracePoint tracePoint) {
            APLTrace.this.startTrace(tracePoint);
        }

        @Override // java.lang.AutoCloseable
        public void close() {
            Trace.endSection();
        }
    }

    public APLTrace(String str) {
        setAgentName(str);
    }

    private String createSectionName(TracePoint tracePoint) {
        return this.mAgentName + '-' + tracePoint.getClassName() + '.' + tracePoint.getMethodName();
    }

    public void endTrace() {
        Trace.endSection();
    }

    public String getAgentName() {
        return this.mAgentName;
    }

    public void setAgentName(String str) {
        if (!str.equals(this.mAgentName)) {
            for (TracePoint tracePoint : TracePoint.values()) {
                this.mTracePointSectionNameMap.put(tracePoint, createSectionName(tracePoint));
            }
        }
        this.mAgentName = str;
    }

    public AutoTrace startAutoTrace(TracePoint tracePoint) {
        return new AutoTrace(tracePoint);
    }

    public void startTrace(TracePoint tracePoint) {
        Trace.beginSection(this.mTracePointSectionNameMap.get(tracePoint));
    }
}
