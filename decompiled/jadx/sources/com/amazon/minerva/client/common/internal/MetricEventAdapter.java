package com.amazon.minerva.client.common.internal;

import com.amazon.minerva.client.common.api.Predefined;
import java.util.Date;
import java.util.TimeZone;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public interface MetricEventAdapter {
    void addBoolean(String str, boolean z);

    void addDouble(String str, double d);

    void addLong(String str, long j);

    void addPredefined(Predefined predefined);

    void addString(String str, String str2);

    void addTimestamp(String str, Date date);

    void addTimestamp(String str, Date date, TimeZone timeZone);

    String getMetricGroupId();

    String getSchemaId();

    boolean isLowPrioritySet();

    void setLowPriority();
}
