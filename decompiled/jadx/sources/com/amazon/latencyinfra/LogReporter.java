package com.amazon.latencyinfra;

import android.util.Log;
import java.util.Map;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public class LogReporter extends DefaultLatencyReporter {
    public LogReporter() {
        super(LatencyReporterType.LOG);
    }

    @Override // com.amazon.latencyinfra.LatencyReporter
    public void report(LatencyReporterArgument latencyReporterArgument) {
        String str;
        Map<String, Long> events = latencyReporterArgument.getEvents();
        String metaData = latencyReporterArgument.getMetaData();
        String str2 = "";
        if (events == null || events.size() == 0) {
            str = "";
        } else {
            str = " events: " + events.toString();
        }
        String concat = metaData == null ? "" : " metaData: ".concat(metaData);
        String str3 = " " + latencyReporterArgument.getName();
        if (latencyReporterArgument.getStartTime() != null) {
            str2 = "  start timestamp: " + latencyReporterArgument.getStartTime();
        }
        Log.i("[PERF PROFILE]", latencyReporterArgument.getNamespace() + str + concat + str3 + " " + latencyReporterArgument.getTimeInterval() + str2);
    }
}
