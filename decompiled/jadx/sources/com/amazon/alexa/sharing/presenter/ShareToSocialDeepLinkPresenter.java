package com.amazon.alexa.sharing.presenter;

import android.annotation.SuppressLint;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import androidx.annotation.VisibleForTesting;
import com.amazon.alexa.sharing.Constants;
import com.amazon.alexa.sharing.MetricKeys;
import com.amazon.alexa.sharing.broadcast.ShareSheetIntentBroadcastReceiver;
import com.amazon.alexa.sharing.comms.CommsMetricsEmitter;
import com.amazon.alexa.sharing.util.DeviceInfoUtil;
import com.amazon.comms.log.CommsLogger;
import com.amazon.commscore.api.metrics.AlexaCommsCoreMetricsService;
import dagger.Lazy;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.Collections;
import java.util.Map;
import java.util.Random;
import javax.inject.Inject;
import javax.inject.Singleton;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Singleton
/* loaded from: classes19.dex */
public class ShareToSocialDeepLinkPresenter {
    private static final String KEY_SHARING_CONTENT = "shareContent";
    private DeviceInfoUtil deviceInfoUtil;
    private CommsMetricsEmitter metricsEmitter;
    public Lazy<AlexaCommsCoreMetricsService> metricsServiceLazy;
    private static final CommsLogger LOG = CommsLogger.getLogger(Constants.LOG_TAG, ShareToSocialDeepLinkPresenter.class);
    private static final String TAG = "ShareToSocialDeepLinkPresenter";
    private static final int PENDING_INTENT_REQUEST_CODE = new Random(System.currentTimeMillis()).nextInt();

    @Inject
    public ShareToSocialDeepLinkPresenter(Lazy<AlexaCommsCoreMetricsService> lazy, DeviceInfoUtil deviceInfoUtil) {
        this.metricsEmitter = new CommsMetricsEmitter(lazy, TAG);
        this.deviceInfoUtil = deviceInfoUtil;
    }

    private Intent constructMobileShareSheetIntent(String str) {
        Intent intent = new Intent();
        intent.setAction("android.intent.action.SEND");
        intent.putExtra("android.intent.extra.TEXT", str);
        intent.putExtra("android.intent.extra.TITLE", str);
        intent.setType("text/plain");
        return intent;
    }

    @SuppressLint({"UnspecifiedImmutableFlag"})
    @VisibleForTesting
    public PendingIntent getPendingIntent(Context context) {
        return this.deviceInfoUtil.isSAndAbove() ? PendingIntent.getBroadcast(context, PENDING_INTENT_REQUEST_CODE, new Intent(context, (Class<?>) ShareSheetIntentBroadcastReceiver.class), 167772160) : PendingIntent.getBroadcast(context, PENDING_INTENT_REQUEST_CODE, new Intent(context, (Class<?>) ShareSheetIntentBroadcastReceiver.class), 134217728);
    }

    public Intent prepareMobileShareSheet(Intent intent, Context context) throws UnsupportedEncodingException {
        Uri data = intent.getData();
        CommsLogger commsLogger = LOG;
        commsLogger.i("Sharing URI:" + data.toString());
        try {
            String decode = URLDecoder.decode(data.getQueryParameter(KEY_SHARING_CONTENT), "UTF-8");
            commsLogger.i("Decoded share content:" + decode);
            Intent constructMobileShareSheetIntent = constructMobileShareSheetIntent(decode);
            this.metricsEmitter.recordOccurrenceMetric(MetricKeys.METRICS_KEY_SHARE_SHEET_SUCCEED_COUNT, Collections.EMPTY_MAP);
            return Intent.createChooser(constructMobileShareSheetIntent, null, getPendingIntent(context).getIntentSender());
        } catch (Throwable th) {
            LOG.e("Share sheet did not open due to: " + th.getMessage(), th);
            CommsMetricsEmitter commsMetricsEmitter = this.metricsEmitter;
            Map<String, Object> map = Collections.EMPTY_MAP;
            commsMetricsEmitter.recordOccurrenceMetric(MetricKeys.METRICS_KEY_SHARE_SHEET_FAILED_COUNT, map);
            this.metricsEmitter.recordOccurrenceMetric("alexa.sharing.ShareToSocialDeepLinkPresenter.constructMobileShareSheetIntent.shareSheetFailed.".concat(th.getClass().getSimpleName()), map);
            throw th;
        }
    }
}
