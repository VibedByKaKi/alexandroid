package com.amazon.rtcsc.appclient;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import androidx.collection.DoubleList$$ExternalSyntheticOutline0;
import com.amazon.alexa.api.compat.migration.sdk.SdkSelectionProvider;
import com.amazon.rtcsc.common.AsyncServiceConnectionManager;
import com.amazon.rtcsc.common.RtcscClientHandler;
import com.amazon.rtcsc.common.ServiceConnectionManager;
import com.amazon.rtcsc.interfaces.IRtcscAppClientListener;
import com.amazon.rtcsc.interfaces.IRtcscCustomMetricsPublisherAdapter;
import com.amazon.rtcsc.interfaces.IRtcscDataChannelListener;
import com.amazon.rtcsc.interfaces.IRtcscScreenCapturerListener;
import com.amazon.rtcsc.interfaces.RtcscAppDisconnectCode;
import com.amazon.rtcsc.interfaces.RtcscAppInfo;
import com.amazon.rtcsc.interfaces.RtcscAudioFocusConfig;
import com.amazon.rtcsc.interfaces.RtcscErrorCode;
import com.amazon.rtcsc.interfaces.RtcscMediaDirection;
import com.amazon.rtcsc.interfaces.RtcscVideoEffect;
import com.amazon.rtcsc.interfaces.RtcscVideoEffectRequest;
import com.amazon.rtcsc.utils.RtcscLogger;
import com.amazonaws.regions.RegionDefaults$$ExternalSyntheticOutline0;
import java.util.List;
import java.util.Locale;
import lombok.NonNull;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public abstract class RtcscAppClient {
    private static final String AVSCA_SERVICE_CLASS_NAME = "com.amazon.rtcsc.capabilityagent.avs.RtcscCapabilityAgentServiceAVS";
    private static final String AVSCA_SERVICE_EARLYPREVIEW_PACKAGE_NAME = "com.amazon.dee.app.beta";
    private static final String AVSCA_SERVICE_PACKAGE_NAME = "com.amazon.dee.app";
    private static final String HELIX_SERVICE_CLASS_NAME = "com.amazon.rtcsc.capabilityagent.avs.RtcscCapabilityAgentServiceHelix";
    private static final String SDK_PROVIDER_CLASS_NAME = "com.amazon.alexa.api.compat.migration.sdk.SdkSelectionProvider";
    private static final String SDK_TYPE_ASSISTANT = "ASSISTANT";
    private static final int SERVICE_VERSION_2 = 2;
    private static final int SERVICE_VERSION_3 = 3;
    private static final int SERVICE_VERSION_4 = 4;
    private static final int SERVICE_VERSION_5 = 5;
    private static final int SERVICE_VERSION_6 = 6;
    private static final int SERVICE_VERSION_7 = 7;
    private static final int SERVICE_VERSION_8 = 8;
    private static final int SERVICE_VERSION_9 = 9;
    private static RtcscClientHandler mRtcscClientHandler;
    private final Context mContext;
    private RtcscLogger mLog = RtcscLogger.getLogger(RtcscAppClient.class);
    private RtcscAppInfo mRtcscAppInfo = null;
    private int mRtcscServiceVersion = 1;

    public RtcscAppClient(@NonNull Context context, RtcscClientHandler rtcscClientHandler) {
        if (context == null) {
            Single$$ExternalSyntheticBUOutline0.m$3("context is marked non-null but is null");
            throw null;
        }
        this.mContext = context;
        mRtcscClientHandler = rtcscClientHandler;
    }

    public static RtcscClientHandler getClientHandler() {
        RtcscClientHandler rtcscClientHandler = mRtcscClientHandler;
        if (rtcscClientHandler != null) {
            return rtcscClientHandler;
        }
        Single$$ExternalSyntheticBUOutline0.m$2("RtcscClientHandler is null. Call registerRtcscAppClientListener() first.");
        return null;
    }

    private boolean isServicePresent(Intent intent) {
        this.mLog.i("isServicePresent");
        List<ResolveInfo> queryIntentServices = this.mContext.getPackageManager().queryIntentServices(intent, 0);
        if (queryIntentServices != null && !queryIntentServices.isEmpty()) {
            return true;
        }
        this.mLog.w("No service found that matches the provided Intent");
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void registerClientDeathListener() {
        if (this.mRtcscServiceVersion >= 2) {
            mRtcscClientHandler.registerClientDeathListener(this.mRtcscAppInfo);
        }
    }

    public RtcscErrorCode acceptSession(@NonNull String str) {
        if (str == null) {
            Single$$ExternalSyntheticBUOutline0.m$3("sessionId is marked non-null but is null");
            return null;
        }
        this.mLog.i("acceptSession called for session with id: ".concat(str));
        RtcscClientHandler rtcscClientHandler = mRtcscClientHandler;
        if (rtcscClientHandler != null) {
            return rtcscClientHandler.acceptSession(str);
        }
        this.mLog.e("RtcscClientHandler is null. Call registerRtcscAppClientListener() first.");
        return RtcscErrorCode.NULL_CLIENT_HANDLER;
    }

    public RtcscErrorCode disconnectSession(@NonNull String str, @NonNull RtcscAppDisconnectCode rtcscAppDisconnectCode) {
        if (str == null) {
            Single$$ExternalSyntheticBUOutline0.m$3("sessionId is marked non-null but is null");
            return null;
        }
        if (rtcscAppDisconnectCode == null) {
            Single$$ExternalSyntheticBUOutline0.m$3("appDisconnectCode is marked non-null but is null");
            return null;
        }
        this.mLog.i("disconnectSession called for session with id: ".concat(str));
        RtcscClientHandler rtcscClientHandler = mRtcscClientHandler;
        if (rtcscClientHandler != null) {
            return rtcscClientHandler.disconnectSession(str, rtcscAppDisconnectCode);
        }
        this.mLog.e("RtcscClientHandler is null. Call registerRtcscAppClientListener() first.");
        return RtcscErrorCode.NULL_CLIENT_HANDLER;
    }

    public RtcscErrorCode forceRemoteMicrophoneAsSource(@NonNull String str, boolean z) {
        if (str == null) {
            Single$$ExternalSyntheticBUOutline0.m$3("sessionId is marked non-null but is null");
            return null;
        }
        RtcscLogger rtcscLogger = this.mLog;
        Locale locale = Locale.US;
        rtcscLogger.i("forceRemoteMicrophoneAsSource called for session with id: " + str + ", forceRemoteMicrophoneEnabled: " + z);
        RtcscClientHandler rtcscClientHandler = mRtcscClientHandler;
        if (rtcscClientHandler == null) {
            this.mLog.e("RtcscClientHandler is null. Call registerRtcscAppClientListener() first.");
            return RtcscErrorCode.NULL_CLIENT_HANDLER;
        }
        if (this.mRtcscServiceVersion >= 8) {
            return rtcscClientHandler.forceRemoteMicrophoneAsSource(str, z);
        }
        this.mLog.w("forceRemoteMicrophoneAsSource API isn't available in current RTCSC Service.");
        return RtcscErrorCode.API_NOT_AVAILABLE;
    }

    public String getServiceClassName() {
        try {
            SdkSelectionProvider.Companion companion = SdkSelectionProvider.INSTANCE;
            Object obj = SdkSelectionProvider.class.getField("Companion").get(null);
            Object invoke = obj.getClass().getMethod("read", Context.class).invoke(obj, this.mContext);
            if (invoke == null || !SDK_TYPE_ASSISTANT.equals(invoke.toString())) {
                return "com.amazon.rtcsc.capabilityagent.avs.RtcscCapabilityAgentServiceAVS";
            }
            this.mLog.i("Using Helix CapabilityAgent service");
            return HELIX_SERVICE_CLASS_NAME;
        } catch (ClassNotFoundException unused) {
            this.mLog.i("Compat SDK not available, using AVS path");
            return "com.amazon.rtcsc.capabilityagent.avs.RtcscCapabilityAgentServiceAVS";
        } catch (Exception e) {
            this.mLog.w("Failed to determine SDK type, falling back to AVS: " + e);
            return "com.amazon.rtcsc.capabilityagent.avs.RtcscCapabilityAgentServiceAVS";
        }
    }

    public abstract void onRtcscServiceConnected();

    public abstract void onRtcscServiceDisconnected();

    public RtcscErrorCode putScreenCapturerData(@NonNull String str, @NonNull Intent intent) {
        if (str == null) {
            Single$$ExternalSyntheticBUOutline0.m$3("sessionId is marked non-null but is null");
            return null;
        }
        if (intent == null) {
            Single$$ExternalSyntheticBUOutline0.m$3("mediaProjectionPermissionData is marked non-null but is null");
            return null;
        }
        RtcscLogger rtcscLogger = this.mLog;
        Locale locale = Locale.US;
        rtcscLogger.i("putScreenCapturerData called for sessionId: ".concat(str));
        if (mRtcscClientHandler == null) {
            this.mLog.e("RtcscClientHandler is null. Call registerRtcscAppClientListener() first.");
            return RtcscErrorCode.NULL_CLIENT_HANDLER;
        }
        if (!str.trim().isEmpty()) {
            return mRtcscClientHandler.putScreenCapturerData(str, intent);
        }
        this.mLog.e("sessionId should be a valid non-empty string");
        return RtcscErrorCode.EMPTY_SESSION_ID;
    }

    public boolean registerDataChannelListener(@NonNull String str, @NonNull IRtcscDataChannelListener iRtcscDataChannelListener) {
        if (str == null) {
            Single$$ExternalSyntheticBUOutline0.m$3("sessionId is marked non-null but is null");
            return false;
        }
        if (iRtcscDataChannelListener == null) {
            Single$$ExternalSyntheticBUOutline0.m$3("listener is marked non-null but is null");
            return false;
        }
        this.mLog.i("registerDataChannelListener called for sessionId: ".concat(str));
        RtcscClientHandler rtcscClientHandler = mRtcscClientHandler;
        if (rtcscClientHandler != null) {
            return rtcscClientHandler.registerDataChannelListener(str, iRtcscDataChannelListener);
        }
        this.mLog.e("RtcscClientHandler is null. Call registerRtcscAppClientListener() first.");
        return false;
    }

    public RtcscErrorCode registerRtcscAppClientListener(@NonNull RtcscAppInfo rtcscAppInfo, @NonNull IRtcscAppClientListener iRtcscAppClientListener) {
        if (rtcscAppInfo == null) {
            Single$$ExternalSyntheticBUOutline0.m$3("rtcscAppInfo is marked non-null but is null");
            return null;
        }
        if (iRtcscAppClientListener == null) {
            Single$$ExternalSyntheticBUOutline0.m$3("rtcAppClientListener is marked non-null but is null");
            return null;
        }
        RegionDefaults$$ExternalSyntheticOutline0.m("registerRtcscAppClientListener called with SessionDomain : ", rtcscAppInfo.getAppIdentifier(), this.mLog);
        this.mRtcscAppInfo = rtcscAppInfo;
        Intent className = new Intent().setClassName("com.amazon.dee.app.beta".equals(this.mContext.getPackageName()) ? "com.amazon.dee.app.beta" : "com.amazon.dee.app", getServiceClassName());
        if (isServicePresent(className)) {
            this.mLog.i("Starting AVS CapabilityAgent service");
            this.mContext.startService(className);
        }
        if (mRtcscClientHandler == null) {
            mRtcscClientHandler = setupRtcscClientHandler();
        }
        return mRtcscClientHandler.registerRtcscAppClientListener(rtcscAppInfo, iRtcscAppClientListener);
    }

    public RtcscErrorCode registerRtcscCustomMetricsPublisherAdapter(@NonNull RtcscAppInfo rtcscAppInfo, @NonNull IRtcscCustomMetricsPublisherAdapter iRtcscCustomMetricsPublisherAdapter) {
        if (rtcscAppInfo == null) {
            Single$$ExternalSyntheticBUOutline0.m$3("rtcscAppInfo is marked non-null but is null");
            return null;
        }
        if (iRtcscCustomMetricsPublisherAdapter == null) {
            Single$$ExternalSyntheticBUOutline0.m$3("rtcCustomMetricsPublisherAdapter is marked non-null but is null");
            return null;
        }
        this.mLog.i("registerRtcscCustomMetricsPublisherAdapter called");
        RtcscClientHandler rtcscClientHandler = mRtcscClientHandler;
        if (rtcscClientHandler != null) {
            return rtcscClientHandler.registerRtcscCustomMetricsPublisherAdapter(rtcscAppInfo, iRtcscCustomMetricsPublisherAdapter);
        }
        this.mLog.e("RtcscClientHandler is null. Call registerRtcscAppClientListener() first.");
        return RtcscErrorCode.NULL_CLIENT_HANDLER;
    }

    public RtcscErrorCode registerScreenCapturerListener(@NonNull String str, @NonNull IRtcscScreenCapturerListener iRtcscScreenCapturerListener) {
        if (str == null) {
            Single$$ExternalSyntheticBUOutline0.m$3("sessionId is marked non-null but is null");
            return null;
        }
        if (iRtcscScreenCapturerListener == null) {
            Single$$ExternalSyntheticBUOutline0.m$3("listener is marked non-null but is null");
            return null;
        }
        RtcscLogger rtcscLogger = this.mLog;
        Locale locale = Locale.US;
        rtcscLogger.i("registerScreenCapturerListener called for sessionId: ".concat(str));
        if (mRtcscClientHandler == null) {
            this.mLog.e("RtcscClientHandler is null. Call registerRtcscAppClientListener() first.");
            return RtcscErrorCode.NULL_CLIENT_HANDLER;
        }
        if (!str.trim().isEmpty()) {
            return mRtcscClientHandler.registerScreenCapturerListener(str, iRtcscScreenCapturerListener);
        }
        this.mLog.e("sessionId should be a valid non-empty string");
        return RtcscErrorCode.EMPTY_SESSION_ID;
    }

    public RtcscErrorCode releaseAudioFocus(@NonNull String str) {
        if (str == null) {
            Single$$ExternalSyntheticBUOutline0.m$3("sessionId is marked non-null but is null");
            return null;
        }
        RtcscLogger rtcscLogger = this.mLog;
        Locale locale = Locale.US;
        rtcscLogger.i("releaseAudioFocus called for session with id: ".concat(str));
        RtcscClientHandler rtcscClientHandler = mRtcscClientHandler;
        if (rtcscClientHandler == null) {
            this.mLog.e("RtcscClientHandler is null. Call registerRtcscAppClientListener() first.");
            return RtcscErrorCode.NULL_CLIENT_HANDLER;
        }
        if (this.mRtcscServiceVersion >= 5) {
            return rtcscClientHandler.releaseAudioFocus(str);
        }
        this.mLog.w("releaseAudioFocus API isn't available in current RTCSC Service.");
        return RtcscErrorCode.API_NOT_AVAILABLE;
    }

    public RtcscErrorCode requestAudioFocus(@NonNull String str, @NonNull RtcscAudioFocusConfig rtcscAudioFocusConfig) {
        if (str == null) {
            Single$$ExternalSyntheticBUOutline0.m$3("sessionId is marked non-null but is null");
            return null;
        }
        if (rtcscAudioFocusConfig == null) {
            Single$$ExternalSyntheticBUOutline0.m$3("audioFocusConfig is marked non-null but is null");
            return null;
        }
        RtcscLogger rtcscLogger = this.mLog;
        Locale locale = Locale.US;
        rtcscLogger.i("requestAudioFocus called for session with id: " + str + ", audioFocusConfig: " + rtcscAudioFocusConfig);
        RtcscClientHandler rtcscClientHandler = mRtcscClientHandler;
        if (rtcscClientHandler == null) {
            this.mLog.e("RtcscClientHandler is null. Call registerRtcscAppClientListener() first.");
            return RtcscErrorCode.NULL_CLIENT_HANDLER;
        }
        int i = this.mRtcscServiceVersion;
        if (i >= 5) {
            return i < 7 ? rtcscClientHandler.requestAudioFocus(str, rtcscAudioFocusConfig) : rtcscClientHandler.requestAudioFocusBlocking(str, rtcscAudioFocusConfig);
        }
        this.mLog.w("requestAudioFocus API isn't available in current RTCSC Service.");
        return RtcscErrorCode.API_NOT_AVAILABLE;
    }

    public boolean sendData(@NonNull String str, @NonNull String str2, @NonNull byte[] bArr, boolean z) {
        if (str == null) {
            Single$$ExternalSyntheticBUOutline0.m$3("sessionId is marked non-null but is null");
            return false;
        }
        if (str2 == null) {
            Single$$ExternalSyntheticBUOutline0.m$3("label is marked non-null but is null");
            return false;
        }
        if (bArr == null) {
            Single$$ExternalSyntheticBUOutline0.m$3("data is marked non-null but is null");
            return false;
        }
        this.mLog.i("sendData called for sessionId: " + str + ", Label: " + str2);
        this.mLog.d(String.format("Data Length: %d, isBinary: %s", Integer.valueOf(bArr.length), Boolean.valueOf(z)));
        RtcscClientHandler rtcscClientHandler = mRtcscClientHandler;
        if (rtcscClientHandler != null) {
            return rtcscClientHandler.sendData(str, str2, bArr, z);
        }
        this.mLog.e("RtcscClientHandler is null. Call registerRtcscAppClientListener() first.");
        return false;
    }

    public RtcscErrorCode setLocalAudioState(@NonNull String str, boolean z) {
        if (str == null) {
            Single$$ExternalSyntheticBUOutline0.m$3("sessionId is marked non-null but is null");
            return null;
        }
        this.mLog.i("setLocalAudioState called for session with id: " + str + " with audioEnabled: " + z);
        RtcscClientHandler rtcscClientHandler = mRtcscClientHandler;
        if (rtcscClientHandler != null) {
            return rtcscClientHandler.setLocalAudioState(str, z);
        }
        this.mLog.e("RtcscClientHandler is null. Call registerRtcscAppClientListener() first.");
        return RtcscErrorCode.NULL_CLIENT_HANDLER;
    }

    public RtcscErrorCode setLocalVideoState(@NonNull String str, boolean z) {
        if (str == null) {
            Single$$ExternalSyntheticBUOutline0.m$3("sessionId is marked non-null but is null");
            return null;
        }
        this.mLog.i("setLocalVideoState called for session with id: " + str + " with videoEnabled: " + z);
        RtcscClientHandler rtcscClientHandler = mRtcscClientHandler;
        if (rtcscClientHandler != null) {
            return rtcscClientHandler.setLocalVideoState(str, z);
        }
        this.mLog.e("RtcscClientHandler is null. Call registerRtcscAppClientListener() first.");
        return RtcscErrorCode.NULL_CLIENT_HANDLER;
    }

    public RtcscErrorCode setRemoteAudioState(@NonNull String str, boolean z) {
        if (str == null) {
            Single$$ExternalSyntheticBUOutline0.m$3("sessionId is marked non-null but is null");
            return null;
        }
        this.mLog.i("setRemoteAudioState called for session with id: " + str + " with audioEnabled: " + z);
        RtcscClientHandler rtcscClientHandler = mRtcscClientHandler;
        if (rtcscClientHandler == null) {
            this.mLog.e("RtcscClientHandler is null. Call registerRtcscAppClientListener() first.");
            return RtcscErrorCode.NULL_CLIENT_HANDLER;
        }
        if (this.mRtcscServiceVersion >= 3) {
            return rtcscClientHandler.setRemoteAudioState(str, z);
        }
        this.mLog.w("setRemoteAudioState API isn't available in current RTCSC Service.");
        return RtcscErrorCode.API_NOT_AVAILABLE;
    }

    public RtcscErrorCode setScreenCapturerDimensions(@NonNull String str, int i, int i2) {
        if (str == null) {
            Single$$ExternalSyntheticBUOutline0.m$3("sessionId is marked non-null but is null");
            return null;
        }
        RtcscLogger rtcscLogger = this.mLog;
        Locale locale = Locale.US;
        StringBuilder m = DoubleList$$ExternalSyntheticOutline0.m(i, "setScreenCapturerDimensions called for sessionId: ", str, " with width: ", " and height: ");
        m.append(i2);
        rtcscLogger.i(m.toString());
        if (mRtcscClientHandler == null) {
            this.mLog.e("RtcscClientHandler is null. Call registerRtcscAppClientListener() first.");
            return RtcscErrorCode.NULL_CLIENT_HANDLER;
        }
        if (!str.trim().isEmpty()) {
            return mRtcscClientHandler.setScreenCapturerDimensions(str, i, i2);
        }
        this.mLog.e("sessionId should be a valid non-empty string");
        return RtcscErrorCode.EMPTY_SESSION_ID;
    }

    public RtcscErrorCode setVideoEffect(@NonNull String str, @NonNull RtcscVideoEffectRequest rtcscVideoEffectRequest) {
        if (str == null) {
            Single$$ExternalSyntheticBUOutline0.m$3("sessionId is marked non-null but is null");
            return null;
        }
        if (rtcscVideoEffectRequest == null) {
            Single$$ExternalSyntheticBUOutline0.m$3("videoEffectRequest is marked non-null but is null");
            return null;
        }
        int i = this.mRtcscServiceVersion;
        RtcscLogger rtcscLogger = this.mLog;
        if (i < 9) {
            rtcscLogger.w("setVideoEffect API with videoEffectRequest isn't available in current RTCSC Service.");
            return RtcscErrorCode.API_NOT_AVAILABLE;
        }
        Locale locale = Locale.US;
        rtcscLogger.i("setVideoEffect (with request) called for session with id: " + str + ", request: " + rtcscVideoEffectRequest);
        if (rtcscVideoEffectRequest.getVideoEffect() == RtcscVideoEffect.UNKNOWN_EFFECT) {
            Single$$ExternalSyntheticBUOutline0.m$3("AppClients are not expected to call setVideoEffect() with UNKNOWN_EFFECT.");
            return null;
        }
        if (rtcscVideoEffectRequest.getSide() == null) {
            Single$$ExternalSyntheticBUOutline0.m$3("VideoEffectRequest side must not be null.");
            return null;
        }
        RtcscClientHandler rtcscClientHandler = mRtcscClientHandler;
        if (rtcscClientHandler != null) {
            return rtcscClientHandler.setVideoEffect(str, rtcscVideoEffectRequest);
        }
        this.mLog.e("RtcscClientHandler is null. Call registerRtcscAppClientListener() first.");
        return RtcscErrorCode.NULL_CLIENT_HANDLER;
    }

    public RtcscClientHandler setupRtcscClientHandler() {
        AsyncServiceConnectionManager asyncServiceConnectionManager = new AsyncServiceConnectionManager();
        asyncServiceConnectionManager.addCallback(new ServiceConnectionManager.Callback() { // from class: com.amazon.rtcsc.appclient.RtcscAppClient.1
            @Override // com.amazon.rtcsc.common.ServiceConnectionManager.Callback
            public void onBind(boolean z) {
                RtcscAppClient.this.mLog.i("onBind callback received. bindSuccess value: " + z);
            }

            @Override // com.amazon.rtcsc.common.ServiceConnectionManager.Callback
            public void onServiceConnected(int i) {
                RtcscAppClient.this.mLog.i("onServiceConnected callback received with Service Version : " + i);
                RtcscAppClient.this.mRtcscServiceVersion = i;
                RtcscAppClient.this.registerClientDeathListener();
                RtcscAppClient.this.onRtcscServiceConnected();
            }

            @Override // com.amazon.rtcsc.common.ServiceConnectionManager.Callback
            public void onServiceDisconnected() {
                RtcscAppClient.this.mLog.i("onServiceDisconnected callback received");
                RtcscAppClient.this.onRtcscServiceDisconnected();
            }

            @Override // com.amazon.rtcsc.common.ServiceConnectionManager.Callback
            public void onUnbind() {
                RtcscAppClient.this.mLog.i("onUnbind callback received");
            }

            @Override // com.amazon.rtcsc.common.ServiceConnectionManager.Callback
            @Deprecated
            public void onServiceConnected() {
                RtcscAppClient.this.mLog.i("onServiceConnected callback received");
            }
        });
        return new RtcscClientHandler(this.mContext, asyncServiceConnectionManager);
    }

    public RtcscErrorCode signalReadyForSession(@NonNull String str, @NonNull RtcscMediaDirection rtcscMediaDirection, @NonNull RtcscMediaDirection rtcscMediaDirection2) {
        if (str == null) {
            Single$$ExternalSyntheticBUOutline0.m$3("sessionId is marked non-null but is null");
            return null;
        }
        if (rtcscMediaDirection == null) {
            Single$$ExternalSyntheticBUOutline0.m$3("audioDirection is marked non-null but is null");
            return null;
        }
        if (rtcscMediaDirection2 == null) {
            Single$$ExternalSyntheticBUOutline0.m$3("videoDirection is marked non-null but is null");
            return null;
        }
        RtcscLogger rtcscLogger = this.mLog;
        Locale locale = Locale.US;
        rtcscLogger.i("signalReadyForSession called for session with id: " + str + ", audioDirection: " + rtcscMediaDirection + ", videoDirection: " + rtcscMediaDirection2);
        RtcscClientHandler rtcscClientHandler = mRtcscClientHandler;
        if (rtcscClientHandler == null) {
            this.mLog.e("RtcscClientHandler is null. Call registerRtcscAppClientListener() first.");
            return RtcscErrorCode.NULL_CLIENT_HANDLER;
        }
        if (this.mRtcscServiceVersion >= 4) {
            return rtcscClientHandler.signalReadyForSession(str, rtcscMediaDirection, rtcscMediaDirection2);
        }
        this.mLog.w("signalReadyForSession API accepting audio & video direction isn't available in current RTCSC Service.");
        return RtcscErrorCode.API_NOT_AVAILABLE;
    }

    public RtcscErrorCode switchCamera(@NonNull String str, @NonNull String str2) {
        if (str == null) {
            Single$$ExternalSyntheticBUOutline0.m$3("sessionId is marked non-null but is null");
            return null;
        }
        if (str2 == null) {
            Single$$ExternalSyntheticBUOutline0.m$3("cameraName is marked non-null but is null");
            return null;
        }
        this.mLog.i("switchCamera called for session with id: " + str + " with cameraName: " + str2);
        RtcscClientHandler rtcscClientHandler = mRtcscClientHandler;
        if (rtcscClientHandler != null) {
            return rtcscClientHandler.switchCamera(str, str2);
        }
        this.mLog.e("RtcscClientHandler is null. Call registerRtcscAppClientListener() first.");
        return RtcscErrorCode.NULL_CLIENT_HANDLER;
    }

    public boolean unregisterDataChannelListener(@NonNull String str) {
        if (str == null) {
            Single$$ExternalSyntheticBUOutline0.m$3("sessionId is marked non-null but is null");
            return false;
        }
        this.mLog.i("unregisterDataChannelListener called for sessionId: ".concat(str));
        RtcscClientHandler rtcscClientHandler = mRtcscClientHandler;
        if (rtcscClientHandler != null) {
            return rtcscClientHandler.unregisterDataChannelListener(str);
        }
        this.mLog.e("RtcscClientHandler is null. Call registerRtcscAppClientListener() first.");
        return false;
    }

    public RtcscErrorCode unregisterRtcscAppClientListener(@NonNull RtcscAppInfo rtcscAppInfo) {
        if (rtcscAppInfo == null) {
            Single$$ExternalSyntheticBUOutline0.m$3("rtcscAppInfo is marked non-null but is null");
            return null;
        }
        RegionDefaults$$ExternalSyntheticOutline0.m("unregisterRtcscAppClientListener called with SessionDomain : ", rtcscAppInfo.getAppIdentifier(), this.mLog);
        RtcscClientHandler rtcscClientHandler = mRtcscClientHandler;
        if (rtcscClientHandler == null) {
            this.mLog.e("RtcscClientHandler is null. Call registerRtcscAppClientListener() first.");
            return RtcscErrorCode.NULL_CLIENT_HANDLER;
        }
        RtcscErrorCode unregisterRtcscAppClientListener = rtcscClientHandler.unregisterRtcscAppClientListener(rtcscAppInfo);
        mRtcscClientHandler.teardown();
        mRtcscClientHandler = null;
        return unregisterRtcscAppClientListener;
    }

    public RtcscErrorCode unregisterRtcscCustomMetricsPublisherAdapter(@NonNull RtcscAppInfo rtcscAppInfo) {
        if (rtcscAppInfo == null) {
            Single$$ExternalSyntheticBUOutline0.m$3("rtcscAppInfo is marked non-null but is null");
            return null;
        }
        this.mLog.i("unregisterRtcscCustomMetricsPublisherAdapter called");
        RtcscClientHandler rtcscClientHandler = mRtcscClientHandler;
        if (rtcscClientHandler != null) {
            return rtcscClientHandler.unregisterRtcscCustomMetricsPublisherAdapter(rtcscAppInfo);
        }
        this.mLog.e("RtcscClientHandler is null. Call registerRtcscAppClientListener() first.");
        return RtcscErrorCode.NULL_CLIENT_HANDLER;
    }

    public RtcscErrorCode unregisterScreenCapturerListener(@NonNull String str) {
        if (str == null) {
            Single$$ExternalSyntheticBUOutline0.m$3("sessionId is marked non-null but is null");
            return null;
        }
        RtcscLogger rtcscLogger = this.mLog;
        Locale locale = Locale.US;
        rtcscLogger.i("unregisterScreenCapturerListener called for sessionId: ".concat(str));
        if (mRtcscClientHandler == null) {
            this.mLog.e("RtcscClientHandler is null. Call registerRtcscAppClientListener() first.");
            return RtcscErrorCode.NULL_CLIENT_HANDLER;
        }
        if (!str.trim().isEmpty()) {
            return mRtcscClientHandler.unregisterScreenCapturerListener(str);
        }
        this.mLog.e("sessionId should be a valid non-empty string");
        return RtcscErrorCode.EMPTY_SESSION_ID;
    }

    public RtcscAppClient(@NonNull Context context) {
        if (context != null) {
            this.mContext = context;
        } else {
            Single$$ExternalSyntheticBUOutline0.m$3("context is marked non-null but is null");
            throw null;
        }
    }

    public RtcscErrorCode signalReadyForSession(@NonNull String str) {
        if (str != null) {
            this.mLog.i("signalReadyForSession called for session with id: ".concat(str));
            RtcscClientHandler rtcscClientHandler = mRtcscClientHandler;
            if (rtcscClientHandler == null) {
                this.mLog.e("RtcscClientHandler is null. Call registerRtcscAppClientListener() first.");
                return RtcscErrorCode.NULL_CLIENT_HANDLER;
            }
            return rtcscClientHandler.signalReadyForSession(str);
        }
        Single$$ExternalSyntheticBUOutline0.m$3("sessionId is marked non-null but is null");
        return null;
    }

    public RtcscErrorCode setVideoEffect(@NonNull String str, @NonNull RtcscVideoEffect rtcscVideoEffect, int i) {
        if (str == null) {
            Single$$ExternalSyntheticBUOutline0.m$3("sessionId is marked non-null but is null");
            return null;
        }
        if (rtcscVideoEffect != null) {
            RtcscLogger rtcscLogger = this.mLog;
            Locale locale = Locale.US;
            rtcscLogger.i("setVideoEffect called for session with id: ".concat(str));
            if (rtcscVideoEffect != RtcscVideoEffect.FROST_EFFECT && rtcscVideoEffect != RtcscVideoEffect.UNKNOWN_EFFECT) {
                RtcscClientHandler rtcscClientHandler = mRtcscClientHandler;
                if (rtcscClientHandler == null) {
                    this.mLog.e("RtcscClientHandler is null. Call registerRtcscAppClientListener() first.");
                    return RtcscErrorCode.NULL_CLIENT_HANDLER;
                }
                return rtcscClientHandler.setVideoEffect(str, rtcscVideoEffect, i);
            }
            Single$$ExternalSyntheticBUOutline0.m$3("AppClients are not expected to call setVideoEffect() with effect FROST_EFFECT OR UNKNOWN_EFFECT.");
            return null;
        }
        Single$$ExternalSyntheticBUOutline0.m$3("videoEffect is marked non-null but is null");
        return null;
    }
}
