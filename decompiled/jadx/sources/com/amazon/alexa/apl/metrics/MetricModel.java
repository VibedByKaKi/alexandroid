package com.amazon.alexa.apl.metrics;

import android.util.Log;
import com.amazon.apl.android.providers.ITelemetryProvider;
import com.amazon.dee.app.services.shortcut.ShortcutConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0010\u0018\u0000 $2\u00020\u0001:\u0001$B\u0005¢\u0006\u0002\u0010\u0002J\u0006\u0010\u000f\u001a\u00020\u0004J\u0006\u0010\u0010\u001a\u00020\u0006J\u0006\u0010\u0011\u001a\u00020\tJ\b\u0010\u0012\u001a\u0004\u0018\u00010\tJ\u0006\u0010\u0013\u001a\u00020\u000eJ\u000e\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0004J\u0006\u0010\u0017\u001a\u00020\u0015J\u000e\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0019\u001a\u00020\u0006J\u000e\u0010\u001a\u001a\u00020\u00152\u0006\u0010\u001b\u001a\u00020\u0006J\u000e\u0010\u001c\u001a\u00020\u00152\u0006\u0010\u001d\u001a\u00020\tJ\u0010\u0010\u001e\u001a\u00020\u00152\b\u0010\u001f\u001a\u0004\u0018\u00010\tJ\u000e\u0010 \u001a\u00020\u00152\u0006\u0010!\u001a\u00020\u000eJ\u0006\u0010\"\u001a\u00020\u0015J\u0006\u0010#\u001a\u00020\u0015R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082.¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082.¢\u0006\u0002\n\u0000¨\u0006%"}, d2 = {"Lcom/amazon/alexa/apl/metrics/MetricModel;", "", "()V", "mCounter", "", "mInitialElapsedTime", "", "mLatency", "mMetricName", "", "mRequestId", "mStartTimer", "mStopTimer", "mTelemetryProviderType", "Lcom/amazon/apl/android/providers/ITelemetryProvider$Type;", "getCounter", "getLatency", "getName", "getRequestId", "getTelemetryProviderType", "incrementCounterBy", "", "by", "reset", "setInitialElapsedTime", "elapsedTime", "setLatencyTime", "finalTime", "setName", ShortcutConstants.METRIC_NAME_KEY, "setRequestId", "requestId", "setTelemetryProviderType", "telemetryProvider", "startTimer", "stopTimer", "Companion", "AVSMobileFramework-android-apl_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class MetricModel {

    @NotNull
    private static final String DEFAULT_NAME = "No_name_has_been_set";
    private long mInitialElapsedTime;
    private String mMetricName;

    @Nullable
    private String mRequestId;
    private long mStopTimer;
    private ITelemetryProvider.Type mTelemetryProviderType;

    @NotNull
    private static final String TAG = "MetricModel";
    private long mStartTimer = -1;
    private int mCounter = Integer.MIN_VALUE;
    private long mLatency = Long.MIN_VALUE;

    /* renamed from: getCounter, reason: from getter */
    public final int getMCounter() {
        return this.mCounter;
    }

    /* renamed from: getLatency, reason: from getter */
    public final long getMLatency() {
        return this.mLatency;
    }

    @NotNull
    public final String getName() {
        String str = this.mMetricName;
        if (str == null) {
            Log.e(TAG, "getName - no name has been set, returning default.");
            return DEFAULT_NAME;
        }
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mMetricName");
        return null;
    }

    @Nullable
    /* renamed from: getRequestId, reason: from getter */
    public final String getMRequestId() {
        return this.mRequestId;
    }

    @NotNull
    public final ITelemetryProvider.Type getTelemetryProviderType() {
        ITelemetryProvider.Type type = this.mTelemetryProviderType;
        if (type == null) {
            Log.e(TAG, "getTelemetryProviderType - no Type has been set, returning COUNTER as default.");
            return ITelemetryProvider.Type.COUNTER;
        }
        if (type != null) {
            return type;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mTelemetryProviderType");
        return null;
    }

    public final void incrementCounterBy(int by) {
        if (this.mCounter == Integer.MIN_VALUE) {
            this.mCounter = 0;
        }
        this.mCounter += by;
    }

    public final void reset() {
        this.mStartTimer = -1L;
        this.mStopTimer = 0L;
        this.mLatency = Long.MIN_VALUE;
        this.mCounter = Integer.MIN_VALUE;
        this.mRequestId = null;
    }

    public final void setInitialElapsedTime(long elapsedTime) {
        this.mInitialElapsedTime = elapsedTime;
    }

    public final void setLatencyTime(long finalTime) {
        this.mLatency = finalTime;
    }

    public final void setName(@NotNull String metricName) {
        metricName.getClass();
        this.mMetricName = metricName;
    }

    public final void setRequestId(@Nullable String requestId) {
        this.mRequestId = requestId;
    }

    public final void setTelemetryProviderType(@NotNull ITelemetryProvider.Type telemetryProvider) {
        telemetryProvider.getClass();
        this.mTelemetryProviderType = telemetryProvider;
    }

    public final void startTimer() {
        this.mStartTimer = System.currentTimeMillis();
    }

    public final void stopTimer() {
        if (this.mStartTimer == -1) {
            Log.e(TAG, "You need to start the timer first");
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        this.mStopTimer = currentTimeMillis;
        this.mLatency = (currentTimeMillis - this.mStartTimer) + this.mInitialElapsedTime;
    }
}
