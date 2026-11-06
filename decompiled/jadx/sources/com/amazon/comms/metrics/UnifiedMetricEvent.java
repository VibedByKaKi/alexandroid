package com.amazon.comms.metrics;

import java.util.Date;
import java.util.List;
import java.util.TimeZone;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public interface UnifiedMetricEvent {
    void addBoolean(String str, boolean z);

    void addCounter(String str, double d);

    void addDouble(String str, double d);

    void addLong(String str, long j);

    void addMetadata(String str, String str2);

    void addTimer(String str, double d);

    void addTimer(String str, double d, int i);

    void addTimestamp(String str, Date date);

    void addTimestamp(String str, Date date, TimeZone timeZone);

    void appendMetadata(String str, String str2);

    void clear();

    String getDomainName();

    List<MetricDataPoint> getMetricDataPoints();

    String getMetricName();

    Priority getPriority();

    String getSourceName();

    boolean hasMetricDataPoints();

    void incrementCounter(String str, double d);

    void removeCounter(String str);

    void removeMetricDataPoint(String str);

    void removeTimer(String str);

    void setDomainName(String str);

    void setMetricName(String str);

    void setPriority(Priority priority);

    void setSourceName(String str);

    void startTimer(String str);

    void stopTimer(String str);
}
