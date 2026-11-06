package com.amazon.minerva.client.thirdparty;

import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import com.amazon.minerva.client.thirdparty.configuration.DenyListConfiguration;
import com.amazon.minerva.client.thirdparty.kpi.PeriodicKPIReporter;
import com.amazon.minerva.client.thirdparty.metric.DataPoint;
import com.amazon.minerva.client.thirdparty.metric.IonMetricEvent;
import com.amazon.minerva.client.thirdparty.metric.IonMetricEventBuilder;
import com.amazon.minerva.client.thirdparty.utils.CustomDeviceUtil;
import com.amazon.minerva.client.thirdparty.utils.MinervaLogger;
import com.amazon.minerva.client.thirdparty.utils.PredefinedKeyUtil;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public class MinervaServiceAndroidAdapter {
    private static final long SHUTDOWN_TIMEOUT_MS = 120000;
    private static final String THREAD_NAME = "MetricsServiceAndroid3rdParty";
    private static final MinervaLogger log = new MinervaLogger("MinervaServiceAndroidAdapter");
    private static final MinervaServiceAndroidAdapter sMinervaServiceAndroidAdapter = new MinervaServiceAndroidAdapter();
    private CustomDeviceUtil mCustomDeviceUtil;
    private DenyListConfiguration mDenyListConfiguration;
    private Handler mHandler;
    private final AtomicBoolean mIsInitialized = new AtomicBoolean(false);
    private HandlerThread mMainThread;
    private MinervaServiceManager mMinervaServiceManager;
    private PeriodicKPIReporter mPeriodicKPIReporter;

    private MinervaServiceAndroidAdapter() {
    }

    public static MinervaServiceAndroidAdapter getInstance() {
        return sMinervaServiceAndroidAdapter;
    }

    public void flush() {
        PeriodicKPIReporter periodicKPIReporter = this.mPeriodicKPIReporter;
        if (periodicKPIReporter != null) {
            periodicKPIReporter.flush();
        }
        MinervaServiceManager minervaServiceManager = this.mMinervaServiceManager;
        if (minervaServiceManager != null) {
            minervaServiceManager.flush();
        }
    }

    public Handler getHandler() {
        return this.mHandler;
    }

    public MinervaServiceManager getMinervaServiceManager() {
        return this.mMinervaServiceManager;
    }

    public PeriodicKPIReporter getPeriodicKPIReporter() {
        return this.mPeriodicKPIReporter;
    }

    public boolean handleMessageForService(Message message) {
        MinervaServiceManager minervaServiceManager;
        Object obj = message.obj;
        if (obj != null && (obj instanceof IonMetricEvent) && (minervaServiceManager = this.mMinervaServiceManager) != null) {
            minervaServiceManager.record((IonMetricEvent) obj);
            return true;
        }
        log.error("handleMessageForService received unknown android.os.Message " + message);
        return false;
    }

    public synchronized void initialize(Context context, boolean z) {
        try {
            if (!this.mIsInitialized.get()) {
                log.info("Initialize(context) -- MinervaServiceAndroidAdapter");
                HandlerThread handlerThread = new HandlerThread(THREAD_NAME, 0);
                this.mMainThread = handlerThread;
                handlerThread.start();
                this.mHandler = new Handler(this.mMainThread.getLooper(), new Handler.Callback() { // from class: com.amazon.minerva.client.thirdparty.MinervaServiceAndroidAdapter.1
                    @Override // android.os.Handler.Callback
                    public boolean handleMessage(Message message) {
                        return MinervaServiceAndroidAdapter.this.handleMessageForService(message);
                    }
                });
                CustomDeviceUtil customDeviceUtil = CustomDeviceUtil.getInstance();
                this.mCustomDeviceUtil = customDeviceUtil;
                if (!customDeviceUtil.isInitialized()) {
                    this.mCustomDeviceUtil.initialize();
                }
                MinervaServiceManager minervaServiceManager = MinervaServiceManager.getInstance();
                this.mMinervaServiceManager = minervaServiceManager;
                if (!minervaServiceManager.isInitialized()) {
                    this.mMinervaServiceManager.initialize(context, new PredefinedKeyUtil(context, this.mCustomDeviceUtil), z);
                }
                PeriodicKPIReporter periodicKPIReporter = new PeriodicKPIReporter();
                this.mPeriodicKPIReporter = periodicKPIReporter;
                periodicKPIReporter.setMinervaServiceAndroidAdapter(sMinervaServiceAndroidAdapter);
                this.mIsInitialized.set(true);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public boolean isInitialized() {
        return this.mIsInitialized.get();
    }

    public void record(String str, String str2, String str3, String str4, long j, int i, List<DataPoint> list) {
        IonMetricEvent ionMetricEvent;
        if (!this.mIsInitialized.get()) {
            log.error("Minerva Client not properly initialized! Dropping metric event");
            return;
        }
        DenyListConfiguration denyListConfiguration = this.mMinervaServiceManager.getConfigurationManager().getMetricsConfigurationHelper().getDenyListConfiguration();
        this.mDenyListConfiguration = denyListConfiguration;
        if (denyListConfiguration.isDenylisted(str2, str3)) {
            MinervaLogger minervaLogger = log;
            Locale locale = Locale.US;
            minervaLogger.debug("The GroupID#SchemaID has been Denylisted. Metrics data will be dropped, GroupID: " + str2 + "; SchemaID: " + str3);
            return;
        }
        MinervaLogger minervaLogger2 = log;
        if (minervaLogger2.isDebugEnabled()) {
            StringBuffer stringBuffer = new StringBuffer("*****record, region:");
            stringBuffer.append(str);
            stringBuffer.append(", metricGroupId:");
            stringBuffer.append(str2);
            stringBuffer.append(", metricSchemaId:");
            stringBuffer.append(str3);
            stringBuffer.append(", metricEventId:");
            stringBuffer.append(str4);
            stringBuffer.append(", utcTimestamp:");
            stringBuffer.append(j);
            stringBuffer.append(", localOffsetMinutes:");
            stringBuffer.append(i);
            stringBuffer.append(", dataPoints size:");
            stringBuffer.append(list.size());
            minervaLogger2.debug(stringBuffer.toString());
        }
        try {
            ionMetricEvent = new IonMetricEventBuilder().withRegion(str).withMetricGroupId(str2).withSchemaId(str3).withMetricEventId(str4).withUtcTimestamp(j).withLocalOffsetMinutes(i).withDataPoints(list).build();
        } catch (Exception e) {
            log.error("record: failed to create IonMetricEvent from IPC parameters. " + e.getMessage());
            ionMetricEvent = null;
        }
        if (ionMetricEvent == null) {
            return;
        }
        log.debug("metricEvent:" + ionMetricEvent.toString());
        Handler handler = getHandler();
        Message obtainMessage = handler.obtainMessage();
        obtainMessage.obj = ionMetricEvent;
        handler.sendMessage(obtainMessage);
    }

    public synchronized void resetForTesting() {
        try {
            if (this.mIsInitialized.get()) {
                this.mPeriodicKPIReporter.shutdown();
                MinervaServiceManager minervaServiceManager = this.mMinervaServiceManager;
                if (minervaServiceManager != null) {
                    minervaServiceManager.shutdown();
                }
                HandlerThread handlerThread = this.mMainThread;
                if (handlerThread == null) {
                    log.warn("Shutdown: HandlerThread is null - nothing to do in shutdown.");
                } else {
                    handlerThread.quitSafely();
                    try {
                        this.mMainThread.join(120000L);
                        log.info("Shutdown: (super) Shutting down...");
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                        log.error("System service shutdown failed" + e.getMessage());
                    }
                }
                this.mIsInitialized.set(false);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Deprecated
    public synchronized void shutdown() {
        flush();
    }

    @Deprecated
    public void shutdownWithUpload() {
        flush();
    }

    public Future<Void> upload() {
        return this.mMinervaServiceManager.upload();
    }
}
