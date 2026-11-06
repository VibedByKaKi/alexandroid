package com.amazon.minerva.client.common.api;

import com.amazon.minerva.client.common.internal.MetricEventAdapter;
import com.amazon.minerva.client.common.internal.android.AndroidMetricEventAdapter;
import com.amazon.minerva.client.common.internal.fireos.FireOSMetricEventAdapter;
import com.amazon.minerva.client.common.internal.util.DevicePlatformIdentifierUtil;
import java.util.Date;
import java.util.TimeZone;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public class MetricEvent {
    private DevicePlatformIdentifierUtil mDevicePlatformIdentifierUtil;
    private MetricEventAdapter mMetricEventDelegate;

    public MetricEvent(String str, String str2, int i) {
        DevicePlatformIdentifierUtil devicePlatformIdentifierUtil = DevicePlatformIdentifierUtil.getInstance();
        this.mDevicePlatformIdentifierUtil = devicePlatformIdentifierUtil;
        if (devicePlatformIdentifierUtil.isDevicePlatformFireOS()) {
            this.mMetricEventDelegate = new FireOSMetricEventAdapter(str, str2, i);
        } else {
            this.mMetricEventDelegate = new AndroidMetricEventAdapter(str, str2, i);
        }
    }

    public void addBoolean(String str, boolean z) {
        this.mMetricEventDelegate.addBoolean(str, z);
    }

    public void addDouble(String str, double d) {
        this.mMetricEventDelegate.addDouble(str, d);
    }

    public void addLong(String str, long j) {
        this.mMetricEventDelegate.addLong(str, j);
    }

    public void addPredefined(Predefined predefined) {
        this.mMetricEventDelegate.addPredefined(predefined);
    }

    public void addString(String str, String str2) {
        this.mMetricEventDelegate.addString(str, str2);
    }

    public void addTimestamp(String str, Date date) {
        this.mMetricEventDelegate.addTimestamp(str, date);
    }

    public DevicePlatformIdentifierUtil getDevicePlatformIdentifierUtil() {
        return this.mDevicePlatformIdentifierUtil;
    }

    public MetricEventAdapter getMetricEventDelegate() {
        return this.mMetricEventDelegate;
    }

    public String getMetricGroupId() {
        return this.mMetricEventDelegate.getMetricGroupId();
    }

    public String getSchemaId() {
        return this.mMetricEventDelegate.getSchemaId();
    }

    public boolean isLowPrioritySet() {
        return this.mMetricEventDelegate.isLowPrioritySet();
    }

    public void setLowPriority() {
        this.mMetricEventDelegate.setLowPriority();
    }

    public void setMetricEventDelegate(MetricEventAdapter metricEventAdapter) {
        this.mMetricEventDelegate = metricEventAdapter;
    }

    public void addTimestamp(String str, Date date, TimeZone timeZone) {
        this.mMetricEventDelegate.addTimestamp(str, date, timeZone);
    }

    public MetricEvent(String str, String str2) {
        DevicePlatformIdentifierUtil devicePlatformIdentifierUtil = DevicePlatformIdentifierUtil.getInstance();
        this.mDevicePlatformIdentifierUtil = devicePlatformIdentifierUtil;
        if (devicePlatformIdentifierUtil.isDevicePlatformFireOS()) {
            this.mMetricEventDelegate = new FireOSMetricEventAdapter(str, str2);
        } else {
            this.mMetricEventDelegate = new AndroidMetricEventAdapter(str, str2);
        }
    }

    public MetricEvent(MetricEventAdapter metricEventAdapter) {
        this.mMetricEventDelegate = metricEventAdapter;
    }

    public MetricEvent() {
        this.mDevicePlatformIdentifierUtil = DevicePlatformIdentifierUtil.getInstance();
    }
}
