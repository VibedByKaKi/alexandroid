package com.amazon.tarazed.metrics;

import android.content.Context;
import androidx.annotation.VisibleForTesting;
import com.amazon.dee.app.services.shortcut.ShortcutConstants;
import com.amazon.dee.app.storage.BobDispatchEndpointContentProvider;
import com.amazon.minerva.client.common.api.MinervaVersion;
import com.amazon.minerva.client.common.api.MinervaVersionChecker;
import com.amazon.tarazed.logging.TarazedSessionLogger;
import com.amazon.tarazed.registry.TarazedComponentRegistry;
import com.amazon.tarazed.registry.component.AccountMetadataProvider;
import com.amazon.tarazed.type.Account;
import com.amazon.tarazed.type.SharedPrefsConstants;
import com.amazon.tarazed.utility.DeviceInfoUtility;
import com.amazon.tarazed.utility.TarazedSharedPreferences;
import com.dee.app.contacts.common.constants.Constants;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u000f\u0018\u0000 82\u00020\u0001:\u00018B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0002\u0010\fJ\u001e\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u000f2\u0006\u0010\u001c\u001a\u00020\u000f2\u0006\u0010\u001d\u001a\u00020\u001eJ(\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u000f2\u0006\u0010\u001c\u001a\u00020\u000f2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 H\u0002J\u001e\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u000f2\u0006\u0010\u001c\u001a\u00020\u000f2\u0006\u0010\u001d\u001a\u00020\u0010J\u001e\u0010!\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u000f2\u0006\u0010\u001c\u001a\u00020\u000f2\u0006\u0010\u001d\u001a\u00020\u001eJ&\u0010\"\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u000f2\u0006\u0010\u001c\u001a\u00020\u000f2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 J&\u0010#\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u000f2\u0006\u0010\u001c\u001a\u00020\u000f2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 J(\u0010$\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u000f2\u0006\u0010\u001c\u001a\u00020\u000f2\u0006\u0010%\u001a\u00020\u001e2\b\b\u0002\u0010\u001f\u001a\u00020 J\u0016\u0010&\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u000f2\u0006\u0010'\u001a\u00020\u001eJ\u0016\u0010(\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u000f2\u0006\u0010\u001c\u001a\u00020\u000fJ%\u0010)\u001a\u00020*2\u0006\u0010\u001b\u001a\u00020\u000f2\u0006\u0010\u001c\u001a\u00020\u000f2\u0006\u0010\u001f\u001a\u00020 H\u0001¢\u0006\u0002\b+J\b\u0010,\u001a\u00020\u000fH\u0002J\b\u0010-\u001a\u00020\u000fH\u0002J\r\u0010.\u001a\u00020\u000fH\u0001¢\u0006\u0002\b/J(\u00100\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u000f2\u0006\u0010\u001c\u001a\u00020\u000f2\u0006\u0010'\u001a\u00020\u001e2\b\b\u0002\u0010\u001f\u001a\u00020 J\u0015\u00101\u001a\u00020\u001a2\u0006\u00102\u001a\u00020*H\u0001¢\u0006\u0002\b3J\r\u00104\u001a\u00020\u001aH\u0000¢\u0006\u0002\b5J\u0016\u00106\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u000f2\u0006\u0010\u001c\u001a\u00020\u000fJ \u00107\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u000f2\u0006\u0010\u001c\u001a\u00020\u000f2\b\b\u0002\u0010\u001f\u001a\u00020 R8\u0010\r\u001a\u001e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\u000ej\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u0010`\u00118\u0000X\u0081\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0016\u001a\n \u0018*\u0004\u0018\u00010\u00170\u0017X\u0082\u0004¢\u0006\u0002\n\u0000¨\u00069"}, d2 = {"Lcom/amazon/tarazed/metrics/TarazedMetricsHelper;", "", "context", "Landroid/content/Context;", "logger", "Lcom/amazon/tarazed/logging/TarazedSessionLogger;", "deviceInfoUtility", "Lcom/amazon/tarazed/utility/DeviceInfoUtility;", "sharedPreferences", "Lcom/amazon/tarazed/utility/TarazedSharedPreferences;", "minervaClient", "Lcom/amazon/tarazed/metrics/MinervaClient;", "(Landroid/content/Context;Lcom/amazon/tarazed/logging/TarazedSessionLogger;Lcom/amazon/tarazed/utility/DeviceInfoUtility;Lcom/amazon/tarazed/utility/TarazedSharedPreferences;Lcom/amazon/tarazed/metrics/MinervaClient;)V", "activeMetricTimers", "Ljava/util/HashMap;", "", "", "Lkotlin/collections/HashMap;", "getActiveMetricTimers$TarazedAndroidLibrary_release$annotations", "()V", "getActiveMetricTimers$TarazedAndroidLibrary_release", "()Ljava/util/HashMap;", "versionChecker", "Lcom/amazon/minerva/client/common/api/MinervaVersionChecker;", "kotlin.jvm.PlatformType", "addCount", "", "methodName", ShortcutConstants.METRIC_NAME_KEY, "count", "", "sampleRate", "", "addCountHighPriority", "addCountHighPrioritySampled", "addCountSampled", "addMetricTimer", "time", "addNetworkExceptionCount", "increment", "cancelMetricTimer", "createMinervaMetricEvent", "Lcom/amazon/tarazed/metrics/BareMinervaMetric;", "createMinervaMetricEvent$TarazedAndroidLibrary_release", "getDeviceType", "getPreferredMarketplace", "getSchemaId", "getSchemaId$TarazedAndroidLibrary_release", "incrementMetricCounter", "recordMinervaEvent", "bareMinervaMetric", "recordMinervaEvent$TarazedAndroidLibrary_release", "shutdownMinervaClient", "shutdownMinervaClient$TarazedAndroidLibrary_release", "startMetricTimer", "stopMetricTimer", "Companion", "TarazedAndroidLibrary_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nTarazedMetricsHelper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TarazedMetricsHelper.kt\ncom/amazon/tarazed/metrics/TarazedMetricsHelper\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,279:1\n1#2:280\n*E\n"})
/* loaded from: classes18.dex */
public final class TarazedMetricsHelper {

    @NotNull
    public static final String DEFAULT_VALUE_UNKNOWN = "Unknown";

    @NotNull
    public static final String METRIC_NETWORK_EXCEPTION = "NetworkException";

    @NotNull
    public static final String METRIC_SESSION_REQUEST_RECEIPT_DELAY = "SessionRequestReceiptDelay";

    @NotNull
    public static final String MINERVA_COUNTER_KEY = "Counter";
    private static final int MINERVA_DEFAULT_SAMPLE_RATE = 100;

    @NotNull
    public static final String MINERVA_GROUP_ID = "f5dd7pug";

    @NotNull
    public static final String MINERVA_MARKETPLACE_ID_KEY = "MarketplaceId";

    @NotNull
    public static final String MINERVA_METHOD_NAME_KEY = "MethodName";

    @NotNull
    public static final String MINERVA_METRIC_NAME_KEY = "Metric";

    @NotNull
    private static final String MINERVA_REGION = "us-east-1";

    @NotNull
    public static final String MINERVA_SOFTWARE_VERSION_KEY = "TarazedSoftwareVersion";

    @NotNull
    public static final String MINERVA_TIMER_KEY = "Timer";

    @NotNull
    private static final String TAG = "TarazedMetricsHelper";

    @NotNull
    private final HashMap<String, Long> activeMetricTimers;

    @NotNull
    private final Context context;

    @NotNull
    private final DeviceInfoUtility deviceInfoUtility;

    @NotNull
    private final TarazedSessionLogger logger;

    @NotNull
    private MinervaClient minervaClient;

    @NotNull
    private final TarazedSharedPreferences sharedPreferences;
    private final MinervaVersionChecker versionChecker;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final String MINERVA_SCHEMA_BETA_ID = "p7vo/2/01330400";

    @NotNull
    private static final String MINERVA_SCHEMA_GAMMA_ID = "9a26/2/01330400";

    @NotNull
    private static final String MINERVA_SCHEMA_PROD_ID = "eoo7/2/02330400";

    @NotNull
    private static final HashMap<String, String> MINERVA_SCHEMA_MAP = MapsKt.hashMapOf(TuplesKt.to("BETA", MINERVA_SCHEMA_BETA_ID), TuplesKt.to(BobDispatchEndpointContentProvider.GAMMA, MINERVA_SCHEMA_GAMMA_ID), TuplesKt.to(BobDispatchEndpointContentProvider.PROD, MINERVA_SCHEMA_PROD_ID));

    public TarazedMetricsHelper(@NotNull Context context, @NotNull TarazedSessionLogger tarazedSessionLogger, @NotNull DeviceInfoUtility deviceInfoUtility, @NotNull TarazedSharedPreferences tarazedSharedPreferences, @NotNull MinervaClient minervaClient) {
        context.getClass();
        tarazedSessionLogger.getClass();
        deviceInfoUtility.getClass();
        tarazedSharedPreferences.getClass();
        minervaClient.getClass();
        this.context = context;
        this.logger = tarazedSessionLogger;
        this.deviceInfoUtility = deviceInfoUtility;
        this.sharedPreferences = tarazedSharedPreferences;
        this.minervaClient = minervaClient;
        this.versionChecker = MinervaVersionChecker.getInstance(context);
        this.activeMetricTimers = new HashMap<>();
    }

    public static /* synthetic */ void addMetricTimer$default(TarazedMetricsHelper tarazedMetricsHelper, String str, String str2, double d, int i, int i2, Object obj) {
        if ((i2 & 8) != 0) {
            i = 100;
        }
        tarazedMetricsHelper.addMetricTimer(str, str2, d, i);
    }

    private final String getDeviceType() {
        Account accountMetadata;
        String deviceType;
        AccountMetadataProvider accountMetadataProvider = (AccountMetadataProvider) TarazedComponentRegistry.INSTANCE.getComponent(AccountMetadataProvider.class);
        return (accountMetadataProvider == null || (accountMetadata = accountMetadataProvider.getAccountMetadata()) == null || (deviceType = accountMetadata.getDeviceType()) == null) ? "Unknown" : deviceType;
    }

    private final String getPreferredMarketplace() {
        Account accountMetadata;
        AccountMetadataProvider accountMetadataProvider = (AccountMetadataProvider) TarazedComponentRegistry.INSTANCE.getComponent(AccountMetadataProvider.class);
        String preferredMarketplace = (accountMetadataProvider == null || (accountMetadata = accountMetadataProvider.getAccountMetadata()) == null) ? null : accountMetadata.getPreferredMarketplace();
        return (preferredMarketplace == null || preferredMarketplace.length() == 0) ? "Unknown" : preferredMarketplace;
    }

    public static /* synthetic */ void incrementMetricCounter$default(TarazedMetricsHelper tarazedMetricsHelper, String str, String str2, double d, int i, int i2, Object obj) {
        if ((i2 & 8) != 0) {
            i = 100;
        }
        tarazedMetricsHelper.incrementMetricCounter(str, str2, d, i);
    }

    public static /* synthetic */ void stopMetricTimer$default(TarazedMetricsHelper tarazedMetricsHelper, String str, String str2, int i, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            i = 100;
        }
        tarazedMetricsHelper.stopMetricTimer(str, str2, i);
    }

    public final void addCount(@NotNull String methodName, @NotNull String metricName, double count) {
        methodName.getClass();
        metricName.getClass();
        addCount(methodName, metricName, count, 100);
    }

    public final void addCountHighPriority(@NotNull String methodName, @NotNull String metricName, double count) {
        methodName.getClass();
        metricName.getClass();
        addCount(methodName, metricName, count, 100);
    }

    public final void addCountHighPrioritySampled(@NotNull String methodName, @NotNull String metricName, double count, int sampleRate) {
        methodName.getClass();
        metricName.getClass();
        addCount(methodName, metricName, count, sampleRate);
    }

    public final void addCountSampled(@NotNull String methodName, @NotNull String metricName, double count, int sampleRate) {
        methodName.getClass();
        metricName.getClass();
        addCount(methodName, metricName, count, sampleRate);
    }

    public final void addMetricTimer(@NotNull String methodName, @NotNull String metricName, double time, int sampleRate) {
        methodName.getClass();
        metricName.getClass();
        BareMinervaMetric createMinervaMetricEvent$TarazedAndroidLibrary_release = createMinervaMetricEvent$TarazedAndroidLibrary_release(methodName, metricName, sampleRate);
        createMinervaMetricEvent$TarazedAndroidLibrary_release.addDouble$TarazedAndroidLibrary_release("Timer", time);
        recordMinervaEvent$TarazedAndroidLibrary_release(createMinervaMetricEvent$TarazedAndroidLibrary_release);
    }

    public final void addNetworkExceptionCount(@NotNull String methodName, double increment) {
        methodName.getClass();
        addCountHighPriority(methodName, METRIC_NETWORK_EXCEPTION, increment);
    }

    public final void cancelMetricTimer(@NotNull String methodName, @NotNull String metricName) {
        methodName.getClass();
        metricName.getClass();
        this.activeMetricTimers.remove(metricName);
    }

    /* JADX WARN: Code restructure failed: missing block: B:3:0x0034, code lost:
    
        r7 = kotlin.text.StringsKt__StringsKt.substringBefore$default(r7, '-', (java.lang.String) null, 2, (java.lang.Object) null);
     */
    @androidx.annotation.VisibleForTesting
    @org.jetbrains.annotations.NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.amazon.tarazed.metrics.BareMinervaMetric createMinervaMetricEvent$TarazedAndroidLibrary_release(@org.jetbrains.annotations.NotNull java.lang.String r7, @org.jetbrains.annotations.NotNull java.lang.String r8, int r9) {
        /*
            r6 = this;
            r7.getClass()
            r8.getClass()
            com.amazon.minerva.client.common.api.Predefined r0 = com.amazon.minerva.client.common.api.Predefined.BUILD_TYPE
            com.amazon.minerva.client.common.api.Predefined r1 = com.amazon.minerva.client.common.api.Predefined.DEVICE_TYPE
            com.amazon.minerva.client.common.api.Predefined r2 = com.amazon.minerva.client.common.api.Predefined.HARDWARE
            com.amazon.minerva.client.common.api.Predefined r3 = com.amazon.minerva.client.common.api.Predefined.MODEL
            com.amazon.minerva.client.common.api.Predefined r4 = com.amazon.minerva.client.common.api.Predefined.PLATFORM
            com.amazon.minerva.client.common.api.Predefined r5 = com.amazon.minerva.client.common.api.Predefined.SOFTWARE_VERSION
            com.amazon.minerva.client.common.api.Predefined[] r0 = new com.amazon.minerva.client.common.api.Predefined[]{r0, r1, r2, r3, r4, r5}
            java.util.List r0 = kotlin.collections.CollectionsKt.listOf(r0)
            com.amazon.tarazed.metrics.BareMinervaMetric r1 = new com.amazon.tarazed.metrics.BareMinervaMetric
            r1.<init>(r9)
            r1.addPredefineds$TarazedAndroidLibrary_release(r0)
            java.lang.String r9 = "Metric"
            r1.addString$TarazedAndroidLibrary_release(r9, r8)
            java.lang.String r8 = "MethodName"
            r1.addString$TarazedAndroidLibrary_release(r8, r7)
            com.amazon.tarazed.utility.DeviceInfoUtility r7 = r6.deviceInfoUtility
            java.lang.String r7 = r7.getSoftwareVersion()
            if (r7 == 0) goto L41
            r8 = 45
            java.lang.String r7 = kotlin.text.StringsKt.substringBefore$default(r7, r8)
            if (r7 == 0) goto L41
            java.lang.String r8 = "TarazedSoftwareVersion"
            r1.addString$TarazedAndroidLibrary_release(r8, r7)
        L41:
            java.lang.String r7 = "MarketplaceId"
            java.lang.String r6 = r6.getPreferredMarketplace()
            r1.addString$TarazedAndroidLibrary_release(r7, r6)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.tarazed.metrics.TarazedMetricsHelper.createMinervaMetricEvent$TarazedAndroidLibrary_release(java.lang.String, java.lang.String, int):com.amazon.tarazed.metrics.BareMinervaMetric");
    }

    @NotNull
    public final HashMap<String, Long> getActiveMetricTimers$TarazedAndroidLibrary_release() {
        return this.activeMetricTimers;
    }

    @VisibleForTesting
    @NotNull
    public final String getSchemaId$TarazedAndroidLibrary_release() {
        TarazedSharedPreferences tarazedSharedPreferences = this.sharedPreferences;
        String str = BobDispatchEndpointContentProvider.PROD;
        String string = tarazedSharedPreferences.getString(SharedPrefsConstants.DEVICE_ENVIRONMENT, BobDispatchEndpointContentProvider.PROD);
        if (string != null) {
            str = string;
        }
        String str2 = MINERVA_SCHEMA_MAP.get(str);
        return str2 == null ? MINERVA_SCHEMA_PROD_ID : str2;
    }

    public final void incrementMetricCounter(@NotNull String methodName, @NotNull String metricName, double increment, int sampleRate) {
        methodName.getClass();
        metricName.getClass();
        BareMinervaMetric createMinervaMetricEvent$TarazedAndroidLibrary_release = createMinervaMetricEvent$TarazedAndroidLibrary_release(methodName, metricName, sampleRate);
        createMinervaMetricEvent$TarazedAndroidLibrary_release.addDouble$TarazedAndroidLibrary_release("Counter", increment);
        recordMinervaEvent$TarazedAndroidLibrary_release(createMinervaMetricEvent$TarazedAndroidLibrary_release);
    }

    @VisibleForTesting
    public final void recordMinervaEvent$TarazedAndroidLibrary_release(@NotNull BareMinervaMetric bareMinervaMetric) {
        bareMinervaMetric.getClass();
        if (this.versionChecker.isVersionSupported(MinervaVersion.BASE)) {
            this.minervaClient.record$TarazedAndroidLibrary_release(bareMinervaMetric.populateMinervaMetric$TarazedAndroidLibrary_release(MINERVA_GROUP_ID, getSchemaId$TarazedAndroidLibrary_release()));
        }
    }

    public final void shutdownMinervaClient$TarazedAndroidLibrary_release() {
        this.minervaClient.shutdown$TarazedAndroidLibrary_release();
    }

    public final void startMetricTimer(@NotNull String methodName, @NotNull String metricName) {
        methodName.getClass();
        metricName.getClass();
        this.activeMetricTimers.put(metricName, Long.valueOf(System.currentTimeMillis()));
    }

    public final void stopMetricTimer(@NotNull String methodName, @NotNull String metricName, int sampleRate) {
        TarazedMetricsHelper tarazedMetricsHelper;
        String str;
        Long l;
        methodName.getClass();
        metricName.getClass();
        if (this.activeMetricTimers.get(metricName) != null) {
            tarazedMetricsHelper = this;
            str = metricName;
            tarazedMetricsHelper.addMetricTimer(methodName, str, (System.currentTimeMillis() - r0.longValue()) / 1000.0d, sampleRate);
            l = tarazedMetricsHelper.activeMetricTimers.remove(str);
        } else {
            tarazedMetricsHelper = this;
            str = metricName;
            l = null;
        }
        if (l == null) {
            tarazedMetricsHelper.logger.w(TAG, "Stopping a metric timer that was never started: " + str);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0080T¢\u0006\u0002\n\u0000R\u0016\u0010\u0005\u001a\u00020\u00048\u0000X\u0081T¢\u0006\b\n\u0000\u0012\u0004\b\u0006\u0010\u0002R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0004X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R*\u0010\u0012\u001a\u001e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0013j\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004`\u0014X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0004X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0004X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0019"}, d2 = {"Lcom/amazon/tarazed/metrics/TarazedMetricsHelper$Companion;", "", "()V", "DEFAULT_VALUE_UNKNOWN", "", "METRIC_NETWORK_EXCEPTION", "getMETRIC_NETWORK_EXCEPTION$TarazedAndroidLibrary_release$annotations", "METRIC_SESSION_REQUEST_RECEIPT_DELAY", "MINERVA_COUNTER_KEY", "MINERVA_DEFAULT_SAMPLE_RATE", "", "MINERVA_GROUP_ID", "MINERVA_MARKETPLACE_ID_KEY", "MINERVA_METHOD_NAME_KEY", "MINERVA_METRIC_NAME_KEY", "MINERVA_REGION", "MINERVA_SCHEMA_BETA_ID", "MINERVA_SCHEMA_GAMMA_ID", "MINERVA_SCHEMA_MAP", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "MINERVA_SCHEMA_PROD_ID", "MINERVA_SOFTWARE_VERSION_KEY", "MINERVA_TIMER_KEY", Constants.LOG_TAG, "TarazedAndroidLibrary_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @VisibleForTesting
        public static /* synthetic */ void getMETRIC_NETWORK_EXCEPTION$TarazedAndroidLibrary_release$annotations() {
        }
    }

    @VisibleForTesting
    public static /* synthetic */ void getActiveMetricTimers$TarazedAndroidLibrary_release$annotations() {
    }

    public final void addCount(@NotNull String methodName, @NotNull String metricName, long count) {
        methodName.getClass();
        metricName.getClass();
        addCount(methodName, metricName, count, 100);
    }

    private final void addCount(String methodName, String metricName, double count, int sampleRate) {
        BareMinervaMetric createMinervaMetricEvent$TarazedAndroidLibrary_release = createMinervaMetricEvent$TarazedAndroidLibrary_release(methodName, metricName, sampleRate);
        createMinervaMetricEvent$TarazedAndroidLibrary_release.addDouble$TarazedAndroidLibrary_release("Counter", count);
        recordMinervaEvent$TarazedAndroidLibrary_release(createMinervaMetricEvent$TarazedAndroidLibrary_release);
    }
}
