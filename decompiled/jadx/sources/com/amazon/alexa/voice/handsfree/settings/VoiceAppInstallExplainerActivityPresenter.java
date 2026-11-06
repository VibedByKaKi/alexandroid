package com.amazon.alexa.voice.handsfree.settings;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.amazon.alexa.handsfree.devices.AMPDInformationProvider;
import com.amazon.alexa.handsfree.protocols.utils.Log;
import com.amazon.alexa.voice.handsfree.metrics.MetricType;
import com.amazon.alexa.voice.handsfree.metrics.MetricsConstants;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
class VoiceAppInstallExplainerActivityPresenter {

    @VisibleForTesting
    static final String GOOGLE_PLAY_STORE_DEEPLINK_TEMPLATE = "https://play.google.com/store/apps/details?id=%s";

    @VisibleForTesting
    static final String GOOGLE_PLAY_STORE_PACKAGE_NAME = "com.android.vending";

    @VisibleForTesting
    static final String LG_APP_DETAIL_PAGE_CANONICAL_CLASSNAME = "com.lge.appbox.client.AppBoxClient";

    @VisibleForTesting
    static final String LG_EXTRA_KEY_PACKAGENAME = "packagename";

    @VisibleForTesting
    static final String LG_EXTRA_KEY_TYPE = "type";

    @VisibleForTesting
    static final String LG_EXTRA_VALUE_DOWNLOAD = "download";

    @VisibleForTesting
    static final String LG_UPDATE_CENTER_PACKAGE_NAME = "com.lge.appbox.client";
    private static final String TAG = "VoiceAppInstallExplainerActivityPresenter";
    private final AMPDInformationProvider mAMPDInformationProvider;
    private final VoiceAppInstallExplainerMetricRecorder mVoiceAppInstallExplainerMetricRecorder;

    public VoiceAppInstallExplainerActivityPresenter(@NonNull Context context) {
        this(new VoiceAppInstallExplainerMetricRecorder(context), AMPDInformationProvider.getInstance(context));
    }

    @NonNull
    public Intent constructDownloadIntent(@NonNull String str) {
        Intent intent = new Intent();
        if (str.equals(VoiceAppInfo.QUALCOMM.getPackageName())) {
            intent.setComponent(new ComponentName(LG_UPDATE_CENTER_PACKAGE_NAME, LG_APP_DETAIL_PAGE_CANONICAL_CLASSNAME));
            intent.putExtra("type", LG_EXTRA_VALUE_DOWNLOAD);
            intent.putExtra(LG_EXTRA_KEY_PACKAGENAME, str);
            return intent;
        }
        String concat = "https://play.google.com/store/apps/details?id=".concat(str);
        intent.setAction("android.intent.action.VIEW");
        intent.setData(Uri.parse(concat));
        intent.setPackage("com.android.vending");
        return intent;
    }

    @Nullable
    public VoiceAppInfo getVoiceAppInfoForDevice() {
        String str = this.mAMPDInformationProvider.getDeviceInformation().get("manufacturer");
        if (str == null) {
            Log.e(TAG, "Unable to detect device manufacturer");
            this.mVoiceAppInstallExplainerMetricRecorder.reportOperationalMetric(MetricType.MANUFACTURER_NOT_DETECTED.getValue());
            return null;
        }
        VoiceAppInfo voiceAppInfo = VoiceAppInfo.getVoiceAppInfo(str);
        if (voiceAppInfo == null) {
            this.mVoiceAppInstallExplainerMetricRecorder.reportOperationalMetric(MetricType.MANUFACTURER_NOT_SUPPORTED.getValue());
        }
        return voiceAppInfo;
    }

    public void onClick(@NonNull MetricsConstants.SubPageType subPageType) {
        this.mVoiceAppInstallExplainerMetricRecorder.recordClick(subPageType);
    }

    public void onPageView() {
        this.mVoiceAppInstallExplainerMetricRecorder.recordPageView();
    }

    @VisibleForTesting
    public VoiceAppInstallExplainerActivityPresenter(@NonNull VoiceAppInstallExplainerMetricRecorder voiceAppInstallExplainerMetricRecorder, @NonNull AMPDInformationProvider aMPDInformationProvider) {
        this.mVoiceAppInstallExplainerMetricRecorder = voiceAppInstallExplainerMetricRecorder;
        this.mAMPDInformationProvider = aMPDInformationProvider;
    }
}
