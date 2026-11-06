package com.amazon.alexa.accessory.metrics;

import androidx.biometric.ErrorUtils$$ExternalSyntheticOutline0;
import androidx.core.app.AppLaunchChecker$$ExternalSyntheticOutline0;
import com.amazon.alexa.accessory.internal.util.Logger;
import java.util.Map;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes15.dex */
public class NoOpMetricsService implements AccessoryMetricsService {
    private static final String DUMMY_OWNER_ID = "dummy_owner_id";
    private Logger.Level logLevel;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    /* renamed from: com.amazon.alexa.accessory.metrics.NoOpMetricsService$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$amazon$alexa$accessory$internal$util$Logger$Level;

        static {
            int[] iArr = new int[Logger.Level.values().length];
            $SwitchMap$com$amazon$alexa$accessory$internal$util$Logger$Level = iArr;
            try {
                iArr[Logger.Level.VERBOSE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$amazon$alexa$accessory$internal$util$Logger$Level[Logger.Level.DEBUG.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public NoOpMetricsService() {
        this(Logger.Level.INFO);
    }

    @Override // com.amazon.alexa.accessory.metrics.AccessoryMetricsService
    public void createTimer(String str, String str2, String str3, String str4, String str5) {
        int i = AnonymousClass1.$SwitchMap$com$amazon$alexa$accessory$internal$util$Logger$Level[this.logLevel.ordinal()];
        if (i == 1) {
            StringBuilder m = ErrorUtils$$ExternalSyntheticOutline0.m("AccessoryMetricsService was not set, NO-OP impl is used to print createTimer. metricIdentifier:", str, " timerName:", str2, " component:");
            AppLaunchChecker$$ExternalSyntheticOutline0.m(m, str3, " subComponent:", str4, " ownerId:");
            m.append(str5);
            Logger.v(m.toString());
            return;
        }
        if (i != 2) {
            StringBuilder m2 = ErrorUtils$$ExternalSyntheticOutline0.m("AccessoryMetricsService was not set, NO-OP impl is used to print createTimer. metricIdentifier:", str, " timerName:", str2, " component:");
            AppLaunchChecker$$ExternalSyntheticOutline0.m(m2, str3, " subComponent:", str4, " ownerId:");
            m2.append(str5);
            Logger.w(m2.toString());
            return;
        }
        StringBuilder m3 = ErrorUtils$$ExternalSyntheticOutline0.m("AccessoryMetricsService was not set, NO-OP impl is used to print createTimer. metricIdentifier:", str, " timerName:", str2, " component:");
        AppLaunchChecker$$ExternalSyntheticOutline0.m(m3, str3, " subComponent:", str4, " ownerId:");
        m3.append(str5);
        Logger.d(m3.toString());
    }

    @Override // com.amazon.alexa.accessory.metrics.AccessoryMetricsService
    public void recordCounter(String str, String str2, double d, Map<String, Object> map, String str3) {
        int i = AnonymousClass1.$SwitchMap$com$amazon$alexa$accessory$internal$util$Logger$Level[this.logLevel.ordinal()];
        if (i == 1) {
            StringBuilder m = ErrorUtils$$ExternalSyntheticOutline0.m("AccessoryMetricsService was not set, NO-OP impl is used to print this metrics. eventName:", str, " componentName:", str2, " counter:");
            m.append(d);
            m.append(" ownerId:");
            m.append(str3);
            Logger.v(m.toString());
            return;
        }
        if (i != 2) {
            StringBuilder m2 = ErrorUtils$$ExternalSyntheticOutline0.m("AccessoryMetricsService was not set, NO-OP impl is used to print this metrics. eventName:", str, " componentName:", str2, " counter:");
            m2.append(d);
            m2.append(" ownerId:");
            m2.append(str3);
            Logger.w(m2.toString());
            return;
        }
        StringBuilder m3 = ErrorUtils$$ExternalSyntheticOutline0.m("AccessoryMetricsService was not set, NO-OP impl is used to print this metrics. eventName:", str, " componentName:", str2, " counter:");
        m3.append(d);
        m3.append(" ownerId:");
        m3.append(str3);
        Logger.d(m3.toString());
    }

    @Override // com.amazon.alexa.accessory.metrics.AccessoryMetricsService
    public void recordCriticalEvent(String str, String str2, String str3, Throwable th, String str4) {
        StringBuilder m = ErrorUtils$$ExternalSyntheticOutline0.m("AccessoryMetricsService was not set, NO-OP impl is used to print this metrics. eventName:", str, " subComponent:", str3, " error:");
        m.append(th);
        m.append(" ownerId:");
        m.append(str4);
        Logger.e(m.toString());
    }

    @Override // com.amazon.alexa.accessory.metrics.AccessoryMetricsService
    public void recordDem(String str, String str2, Map<String, String> map) {
        StringBuilder m = ErrorUtils$$ExternalSyntheticOutline0.m("AccessoryMetricsService was not set, NO-OP impl is used to print this metric. eventName: ", str, " componentName: ", str2, " protoMetrics: ");
        m.append(map.toString());
        Logger.w(m.toString());
    }

    @Override // com.amazon.alexa.accessory.metrics.AccessoryMetricsService
    public void recordOccurrence(String str, String str2, boolean z, Map<String, Object> map, String str3) {
        int i = AnonymousClass1.$SwitchMap$com$amazon$alexa$accessory$internal$util$Logger$Level[this.logLevel.ordinal()];
        if (i == 1) {
            StringBuilder m = ErrorUtils$$ExternalSyntheticOutline0.m("AccessoryMetricsService was not set, NO-OP impl is used to print this metrics. eventName:", str, " componentName:", str2, " eventOccurred:");
            m.append(z);
            m.append(" ownerId:");
            m.append(str3);
            Logger.v(m.toString());
            return;
        }
        if (i != 2) {
            StringBuilder m2 = ErrorUtils$$ExternalSyntheticOutline0.m("AccessoryMetricsService was not set, NO-OP impl is used to print this metrics. eventName:", str, " componentName:", str2, " eventOccurred:");
            m2.append(z);
            m2.append(" ownerId:");
            m2.append(str3);
            Logger.w(m2.toString());
            return;
        }
        StringBuilder m3 = ErrorUtils$$ExternalSyntheticOutline0.m("AccessoryMetricsService was not set, NO-OP impl is used to print this metrics. eventName:", str, " componentName:", str2, " eventOccurred:");
        m3.append(z);
        m3.append(" ownerId:");
        m3.append(str3);
        Logger.d(m3.toString());
    }

    @Override // com.amazon.alexa.accessory.metrics.AccessoryMetricsService
    public void recordTime(String str, String str2, long j, Map<String, Object> map, String str3) {
        int i = AnonymousClass1.$SwitchMap$com$amazon$alexa$accessory$internal$util$Logger$Level[this.logLevel.ordinal()];
        if (i == 1) {
            StringBuilder m = ErrorUtils$$ExternalSyntheticOutline0.m("AccessoryMetricsService was not set, NO-OP impl is used to print this metrics. eventName:", str, " componentName:", str2, " timeInterval:");
            m.append(j);
            m.append(" ownerId:");
            m.append(str3);
            Logger.v(m.toString());
            return;
        }
        if (i != 2) {
            StringBuilder m2 = ErrorUtils$$ExternalSyntheticOutline0.m("AccessoryMetricsService was not set, NO-OP impl is used to print this metrics. eventName:", str, " componentName:", str2, " timeInterval:");
            m2.append(j);
            m2.append(" ownerId:");
            m2.append(str3);
            Logger.w(m2.toString());
            return;
        }
        StringBuilder m3 = ErrorUtils$$ExternalSyntheticOutline0.m("AccessoryMetricsService was not set, NO-OP impl is used to print this metrics. eventName:", str, " componentName:", str2, " timeInterval:");
        m3.append(j);
        m3.append(" ownerId:");
        m3.append(str3);
        Logger.d(m3.toString());
    }

    @Override // com.amazon.alexa.accessory.metrics.AccessoryMetricsService
    public void recordTimer(String str) {
        int i = AnonymousClass1.$SwitchMap$com$amazon$alexa$accessory$internal$util$Logger$Level[this.logLevel.ordinal()];
        if (i == 1) {
            Logger.v("AccessoryMetricsService was not set, NO-OP impl is used to print recordTimer. metricIdentifier:" + str);
        } else if (i != 2) {
            Logger.w("AccessoryMetricsService was not set, NO-OP impl is used to print recordTimer. metricIdentifier:" + str);
        } else {
            Logger.d("AccessoryMetricsService was not set, NO-OP impl is used to print recordTimer. metricIdentifier:" + str);
        }
    }

    @Override // com.amazon.alexa.accessory.metrics.AccessoryMetricsService
    public void recordUpl(String str, String str2, long j, Map<String, Object> map) {
        recordTime(str, str2, j, map);
    }

    @Override // com.amazon.alexa.accessory.metrics.AccessoryMetricsService
    public void recordWarningEvent(String str, String str2, String str3, Throwable th, String str4) {
        StringBuilder m = ErrorUtils$$ExternalSyntheticOutline0.m("AccessoryMetricsService was not set, NO-OP impl is used to print this metrics. eventName:", str, " subComponent:", str3, " error:");
        m.append(th);
        m.append(" ownerId:");
        m.append(str4);
        Logger.w(m.toString());
    }

    public NoOpMetricsService(Logger.Level level) {
        this.logLevel = level;
    }

    @Override // com.amazon.alexa.accessory.metrics.AccessoryMetricsService
    public void recordCriticalEvent(String str, String str2, String str3, Throwable th) {
        recordCriticalEvent(str, str2, str3, th, DUMMY_OWNER_ID);
    }

    @Override // com.amazon.alexa.accessory.metrics.AccessoryMetricsService
    public void recordWarningEvent(String str, String str2, String str3, Throwable th) {
        recordWarningEvent(str, str2, str3, th, DUMMY_OWNER_ID);
    }

    @Override // com.amazon.alexa.accessory.metrics.AccessoryMetricsService
    public void createTimer(String str, String str2, String str3, String str4) {
        createTimer(str, str2, str3, str4, DUMMY_OWNER_ID);
    }

    @Override // com.amazon.alexa.accessory.metrics.AccessoryMetricsService
    public void recordCounter(String str, String str2, double d, Map<String, Object> map) {
        recordCounter(str, str2, d, map, DUMMY_OWNER_ID);
    }

    @Override // com.amazon.alexa.accessory.metrics.AccessoryMetricsService
    public void recordOccurrence(String str, String str2, boolean z, Map<String, Object> map) {
        recordOccurrence(str, str2, z, map, DUMMY_OWNER_ID);
    }

    @Override // com.amazon.alexa.accessory.metrics.AccessoryMetricsService
    public void recordTime(String str, String str2, long j, Map<String, Object> map) {
        recordTime(str, str2, j, map, DUMMY_OWNER_ID);
    }
}
