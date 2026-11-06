package com.amazon.alexa.capabilityagent.deviceproximity.common.util;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.Log;
import com.amazon.alexa.assistant.transport.TransportClientBuilder$$ExternalSyntheticLambda2;
import com.amazon.alexa.mobilytics.Mobilytics;
import com.amazon.alexa.mobilytics.event.operational.MobilyticsMetricsCounter;
import com.amazon.alexa.mobilytics.event.operational.MobilyticsMetricsTimer;
import com.amazon.alexa.protocols.service.api.ComponentRegistry;
import com.amazon.dee.app.services.shortcut.ShortcutConstants;
import com.dee.app.contacts.common.constants.Constants;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fJ(\u0010\u0010\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u00122\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0007J \u0010\"\u001a\u00020\r2\u0006\u0010#\u001a\u00020\u00052\u0006\u0010$\u001a\u00020\u00052\b\b\u0002\u0010%\u001a\u00020&J\u0018\u0010'\u001a\u0004\u0018\u00010(2\u0006\u0010#\u001a\u00020\u00052\u0006\u0010$\u001a\u00020\u0005J\u0010\u0010)\u001a\u00020\r2\b\u0010*\u001a\u0004\u0018\u00010(R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u001a\u0010\u0006\u001a\u00020\u0007X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR \u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00180\u0017X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u0014\u0010\u001d\u001a\u00020\u00188BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001fR\u000e\u0010 \u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006+"}, d2 = {"Lcom/amazon/alexa/capabilityagent/deviceproximity/common/util/Logger;", "", "<init>", "()V", Constants.LOG_TAG, "", "bypassLogLevelFilter", "", "getBypassLogLevelFilter$AlexaMobileAndroidCapabilityAgent_DeviceProximity_release", "()Z", "setBypassLogLevelFilter$AlexaMobileAndroidCapabilityAgent_DeviceProximity_release", "(Z)V", "init", "", "context", "Landroid/content/Context;", "log", "logLevel", "", "message", "throwable", "", "metricLoggerProvider", "Lkotlin/Function0;", "Lcom/amazon/alexa/mobilytics/Mobilytics;", "getMetricLoggerProvider$AlexaMobileAndroidCapabilityAgent_DeviceProximity_release", "()Lkotlin/jvm/functions/Function0;", "setMetricLoggerProvider$AlexaMobileAndroidCapabilityAgent_DeviceProximity_release", "(Lkotlin/jvm/functions/Function0;)V", "metricLogger", "getMetricLogger", "()Lcom/amazon/alexa/mobilytics/Mobilytics;", "METRIC_OWNER_ID", "UNKNOWN_METRIC_GROUP", "logCountMetric", ShortcutConstants.METRIC_NAME_KEY, "metricGroup", "countValue", "", "getTimer", "Lcom/amazon/alexa/mobilytics/event/operational/MobilyticsMetricsTimer;", "logTimeMetric", "timer", "AlexaMobileAndroidCapabilityAgent-DeviceProximity_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nLogger.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Logger.kt\ncom/amazon/alexa/capabilityagent/deviceproximity/common/util/Logger\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,104:1\n1#2:105\n*E\n"})
/* loaded from: classes17.dex */
public final class Logger {

    @NotNull
    private static final String METRIC_OWNER_ID = "4c22bd9e-f936-44d2-95c3-249c93bd6042";

    @NotNull
    public static final String TAG = "DeviceProximityCapabilityAgent";

    @NotNull
    public static final String UNKNOWN_METRIC_GROUP = "Unknown";
    private static boolean bypassLogLevelFilter;

    @NotNull
    public static final Logger INSTANCE = new Logger();

    @NotNull
    private static Function0<? extends Mobilytics> metricLoggerProvider = new TransportClientBuilder$$ExternalSyntheticLambda2(25);

    private Logger() {
    }

    private final Mobilytics getMetricLogger() {
        return metricLoggerProvider.invoke();
    }

    public static /* synthetic */ void log$default(Logger logger, int i, String str, Throwable th, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            str = null;
        }
        if ((i2 & 4) != 0) {
            th = null;
        }
        logger.log(i, str, th);
    }

    public static /* synthetic */ void logCountMetric$default(Logger logger, String str, String str2, long j, int i, Object obj) {
        if ((i & 4) != 0) {
            j = 1;
        }
        logger.logCountMetric(str, str2, j);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Mobilytics metricLoggerProvider$lambda$0() {
        Object obj;
        obj = ComponentRegistry.getInstance().getLazy(Mobilytics.class).get();
        return (Mobilytics) obj;
    }

    public final boolean getBypassLogLevelFilter$AlexaMobileAndroidCapabilityAgent_DeviceProximity_release() {
        return bypassLogLevelFilter;
    }

    @NotNull
    public final Function0<Mobilytics> getMetricLoggerProvider$AlexaMobileAndroidCapabilityAgent_DeviceProximity_release() {
        return metricLoggerProvider;
    }

    @Nullable
    public final MobilyticsMetricsTimer getTimer(@NotNull String metricName, @NotNull String metricGroup) {
        metricName.getClass();
        metricGroup.getClass();
        try {
            return getMetricLogger().createTimer(metricGroup + "_" + metricName, TAG, metricGroup, "4c22bd9e-f936-44d2-95c3-249c93bd6042");
        } catch (Exception e) {
            Log.e(TAG, "Exception while creating timer", e);
            return null;
        }
    }

    public final void init(@NotNull Context context) {
        context.getClass();
        bypassLogLevelFilter = (context.getApplicationInfo().flags & 2) != 0;
    }

    @SuppressLint({"Range"})
    public final void log(int logLevel, @Nullable String message, @Nullable Throwable throwable) {
        try {
            if (bypassLogLevelFilter || Log.isLoggable(TAG, logLevel)) {
                switch (logLevel) {
                    case 2:
                    case 3:
                        break;
                    case 4:
                        Log.i(TAG, message, throwable);
                        break;
                    case 5:
                        Log.w(TAG, message, throwable);
                        break;
                    case 6:
                        Log.e(TAG, message, throwable);
                        break;
                    case 7:
                        Log.wtf(TAG, message, throwable);
                        break;
                    default:
                        Log.wtf(TAG, "Unknown log level: " + logLevel);
                        break;
                }
            }
        } catch (Exception e) {
            Log.e(TAG, "Exception while trying to log", e);
        }
    }

    public final void logCountMetric(@NotNull String metricName, @NotNull String metricGroup, long countValue) {
        metricName.getClass();
        metricGroup.getClass();
        try {
            MobilyticsMetricsCounter createCounter = getMetricLogger().createCounter(metricGroup + "_" + metricName, TAG, metricGroup, "4c22bd9e-f936-44d2-95c3-249c93bd6042");
            createCounter.incrementCounterByValue(countValue);
            getMetricLogger().recordCounter(createCounter);
        } catch (Exception e) {
            Log.e(TAG, "Exception while logging count metric", e);
        }
    }

    public final void logTimeMetric(@Nullable MobilyticsMetricsTimer timer) {
        if (timer == null) {
            return;
        }
        try {
            getMetricLogger().recordTimer(timer);
        } catch (Exception e) {
            Log.e(TAG, "Exception while logging time metric", e);
        }
    }

    public final void setBypassLogLevelFilter$AlexaMobileAndroidCapabilityAgent_DeviceProximity_release(boolean z) {
        bypassLogLevelFilter = z;
    }

    public final void setMetricLoggerProvider$AlexaMobileAndroidCapabilityAgent_DeviceProximity_release(@NotNull Function0<? extends Mobilytics> function0) {
        function0.getClass();
        metricLoggerProvider = function0;
    }
}
