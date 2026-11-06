package com.amazon.alexa.sharing.broadcast;

import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import androidx.annotation.VisibleForTesting;
import com.amazon.alexa.mobilytics.event.userinteraction.InteractionType;
import com.amazon.alexa.sharing.Constants;
import com.amazon.alexa.sharing.MetricKeys;
import com.amazon.alexa.sharing.comms.CommsMetricsEmitter;
import com.amazon.alexa.sharing.comms.dependencies.AlexaSharingClientComponentWrapper;
import com.amazon.alexa.sharing.metrics.SocialAndroidMetricsHelper;
import com.amazon.comms.log.CommsLogger;
import com.amazon.commscore.api.metrics.AlexaCommsCoreMetricsService;
import dagger.Lazy;
import defpackage.a$$ExternalSyntheticOutline0;
import java.util.Collections;
import java.util.Map;
import javax.inject.Inject;
import javax.inject.Singleton;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Singleton
/* loaded from: classes19.dex */
public class ShareSheetIntentBroadcastReceiver extends BroadcastReceiver {
    private static final String SHARE_SHEET_USER_EVENT_APP_UNKNOWN = "unknown";
    private static final String SHARE_SHEET_USER_EVENT_CLICKED = "initiated";
    private static final String SHARE_SHEET_USER_EVENT_COMPLETED = "completed";
    private static final String SHARE_SHEET_USER_EVENT_ERROR = "error";
    private static final CommsLogger LOG = CommsLogger.getLogger(Constants.LOG_TAG, ShareSheetIntentBroadcastReceiver.class);
    private static final String TAG = "ShareSheetIntentBroadcastReceiver";

    @Inject
    public Lazy<AlexaCommsCoreMetricsService> metricsServiceLazy;
    private CommsMetricsEmitter metricsEmitter = new CommsMetricsEmitter(this.metricsServiceLazy, TAG);

    @Inject
    public ShareSheetIntentBroadcastReceiver() {
    }

    @VisibleForTesting
    public SocialAndroidMetricsHelper getBizMetricsInstance() {
        return SocialAndroidMetricsHelper.getInstance();
    }

    @VisibleForTesting
    public CommsMetricsEmitter getMetricsEmitter() {
        return this.metricsEmitter;
    }

    @VisibleForTesting
    public void inject() {
        AlexaSharingClientComponentWrapper.getComponent().inject(this);
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        inject();
        SocialAndroidMetricsHelper bizMetricsInstance = getBizMetricsInstance();
        try {
            bizMetricsInstance.recordUserInteractionEvent("ShareSheet.ShareViaMobile.initiated", InteractionType.DEEP_LINK_CLICK, MetricKeys.BIZ_METRICS_COMPONENT_NAME, "unknown");
            getMetricsEmitter().setMetricsServiceLazy(this.metricsServiceLazy);
            ComponentName componentName = (ComponentName) intent.getParcelableExtra("android.intent.extra.CHOSEN_COMPONENT");
            CommsLogger commsLogger = LOG;
            commsLogger.i("ShareSheetIntentBroadcastReceiver clickedComponent: " + componentName);
            if (componentName == null) {
                getMetricsEmitter().recordOccurrenceMetric(MetricKeys.METRICS_KEY_SHARE_SHEET_BROADCAST_RECEIVER_CLICK_COMPONENT_IS_NULL, Collections.EMPTY_MAP);
                bizMetricsInstance.recordUserInteractionEvent("ShareSheet.ShareViaMobile.error", InteractionType.DEEP_LINK_CLICK, MetricKeys.BIZ_METRICS_COMPONENT_NAME, "unknown");
                return;
            }
            CommsMetricsEmitter metricsEmitter = getMetricsEmitter();
            Map<String, Object> map = Collections.EMPTY_MAP;
            metricsEmitter.recordNonOccurrenceMetric(MetricKeys.METRICS_KEY_SHARE_SHEET_BROADCAST_RECEIVER_CLICK_COMPONENT_IS_NULL, map);
            String packageName = componentName.getPackageName();
            commsLogger.i("Following app has been selected in sharing sheet: " + packageName);
            getMetricsEmitter().recordOccurrenceMetric("alexa.sharing.shareSheet.app.selected." + packageName, map);
            bizMetricsInstance.recordUserInteractionEvent("ShareSheet.ShareViaMobile.completed", InteractionType.DEEP_LINK_CLICK, MetricKeys.BIZ_METRICS_COMPONENT_NAME, packageName);
        } catch (Exception e) {
            getMetricsEmitter().recordOccurrenceMetric(a$$ExternalSyntheticOutline0.m("alexa.sharing.ShareSheetIntentBroadcastReceiver.failed.", e.getClass().getSimpleName(), ".count"), Collections.EMPTY_MAP);
            bizMetricsInstance.recordUserInteractionEvent("ShareSheet.ShareViaMobile.error", InteractionType.DEEP_LINK_CLICK, MetricKeys.BIZ_METRICS_COMPONENT_NAME, "unknown");
            throw e;
        }
    }
}
