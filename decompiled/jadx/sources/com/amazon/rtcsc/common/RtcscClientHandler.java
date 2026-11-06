package com.amazon.rtcsc.common;

import android.content.Context;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;
import android.os.RemoteException;
import android.view.Surface;
import com.amazon.rtcsc.common.BaseClient;
import com.amazon.rtcsc.interfaces.IRtcscAppClientListener;
import com.amazon.rtcsc.interfaces.IRtcscCustomMetricsPublisherAdapter;
import com.amazon.rtcsc.interfaces.IRtcscDataChannelListener;
import com.amazon.rtcsc.interfaces.IRtcscEventListener;
import com.amazon.rtcsc.interfaces.IRtcscScreenCapturerListener;
import com.amazon.rtcsc.interfaces.IRtcscServiceHandler;
import com.amazon.rtcsc.interfaces.IRtcscViewRendererListener;
import com.amazon.rtcsc.interfaces.RtcscAppDisconnectCode;
import com.amazon.rtcsc.interfaces.RtcscAppInfo;
import com.amazon.rtcsc.interfaces.RtcscAudioFocusConfig;
import com.amazon.rtcsc.interfaces.RtcscErrorCode;
import com.amazon.rtcsc.interfaces.RtcscMediaDirection;
import com.amazon.rtcsc.interfaces.RtcscScalingType;
import com.amazon.rtcsc.interfaces.RtcscTimestampRetrievalParams;
import com.amazon.rtcsc.interfaces.RtcscVideoEffect;
import com.amazon.rtcsc.interfaces.RtcscVideoEffectRequest;
import com.amazon.rtcsc.interfaces.RtcscViewDirection;
import com.amazon.rtcsc.utils.RtcscLogger;
import com.amazon.rtcsc.utils.Util;
import com.amazonaws.regions.RegionDefaults$$ExternalSyntheticOutline0;
import java.util.Locale;
import lombok.NonNull;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public class RtcscClientHandler extends BaseClient<IRtcscServiceHandler> {
    private static RtcscLogger mLog = RtcscLogger.getLogger(RtcscClientHandler.class);

    public RtcscClientHandler(@NonNull Context context, @NonNull ServiceConnectionManager serviceConnectionManager, @NonNull Intent intent) {
        super(IRtcscServiceHandler.class, (Context) Util.nullCheck(context, "context"), (Intent) Util.nullCheck(intent, "intent"), RtcscServiceInfo.PERMISSION, (ServiceConnectionManager) Util.nullCheck(serviceConnectionManager, "serviceConnectionManager"));
        if (context == null) {
            Single$$ExternalSyntheticBUOutline0.m$3("context is marked non-null but is null");
            throw null;
        }
        if (serviceConnectionManager == null) {
            Single$$ExternalSyntheticBUOutline0.m$3("serviceConnectionManager is marked non-null but is null");
            throw null;
        }
        if (intent != null) {
            return;
        }
        Single$$ExternalSyntheticBUOutline0.m$3("intent is marked non-null but is null");
        throw null;
    }

    public RtcscErrorCode acceptSession(@NonNull String str) {
        if (str == null) {
            Single$$ExternalSyntheticBUOutline0.m$3("sessionId is marked non-null but is null");
            return null;
        }
        mLog.i("acceptSession called. Forwarding call to the service. SessionId: " + str + ".");
        try {
            IRtcscServiceHandler service = getService();
            if (service == null) {
                return RtcscErrorCode.NULL_CLIENT_HANDLER;
            }
            service.acceptSession(str);
            mLog.i("Service request for acceptSession sent successfully");
            return RtcscErrorCode.SUCCESS;
        } catch (RemoteException e) {
            mLog.e("Exception in acceptSession", e);
            return RtcscErrorCode.REMOTE_ERROR;
        }
    }

    public RtcscErrorCode clearImage(String str, String str2) {
        mLog.i("clearImage called. Forwarding call to the service. SessionId: " + str + ". Label: " + str2);
        try {
            IRtcscServiceHandler service = getService();
            if (service == null) {
                return RtcscErrorCode.NULL_CLIENT_HANDLER;
            }
            service.clearImage(str, str2);
            mLog.i("Service request for clearImage returned successfully");
            return RtcscErrorCode.SUCCESS;
        } catch (RemoteException e) {
            mLog.e("Exception in clearImage", e);
            return RtcscErrorCode.REMOTE_ERROR;
        }
    }

    @Override // com.amazon.rtcsc.common.BaseClient
    public BaseClient<IRtcscServiceHandler>.BaseClientServiceConnection createServiceConnection() {
        return new BaseClient<IRtcscServiceHandler>.BaseClientServiceConnection() { // from class: com.amazon.rtcsc.common.RtcscClientHandler.1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.amazon.rtcsc.common.BaseClient.BaseClientServiceConnection
            public IRtcscServiceHandler convertIBinderToService(IBinder iBinder) {
                return IRtcscServiceHandler.Stub.asInterface(iBinder);
            }
        };
    }

    public RtcscErrorCode disableVideoFrameTimestampRetrieval(@NonNull String str) {
        if (str == null) {
            Single$$ExternalSyntheticBUOutline0.m$3("sessionId is marked non-null but is null");
            return null;
        }
        mLog.i("disableVideoFrameTimestampRetrieval called. Forwarding call to the service. SessionId: " + str + ".");
        try {
            IRtcscServiceHandler service = getService();
            if (service == null) {
                return RtcscErrorCode.NULL_CLIENT_HANDLER;
            }
            service.disableVideoFrameTimestampRetrieval(str);
            mLog.i("Service request for disableVideoFrameTimestampRetrieval sent successfully");
            return RtcscErrorCode.SUCCESS;
        } catch (RemoteException e) {
            mLog.e("Exception in disableVideoFrameTimestampRetrieval", e);
            return RtcscErrorCode.REMOTE_ERROR;
        }
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
        mLog.i("disconnectSession called. Forwarding call to the service. SessionId: " + str + ".");
        try {
            IRtcscServiceHandler service = getService();
            if (service == null) {
                return RtcscErrorCode.NULL_CLIENT_HANDLER;
            }
            service.disconnectSession(str, rtcscAppDisconnectCode);
            mLog.i("Service request for disconnectSession sent successfully");
            return RtcscErrorCode.SUCCESS;
        } catch (RemoteException e) {
            mLog.e("Exception in disconnectSession", e);
            return RtcscErrorCode.REMOTE_ERROR;
        }
    }

    public RtcscErrorCode enableVideoFrameTimestampRetrieval(@NonNull String str, RtcscTimestampRetrievalParams rtcscTimestampRetrievalParams) {
        if (str == null) {
            Single$$ExternalSyntheticBUOutline0.m$3("sessionId is marked non-null but is null");
            return null;
        }
        mLog.i("enableVideoFrameTimestampRetrieval called. Forwarding call to the service. SessionId: " + str + ".");
        try {
            IRtcscServiceHandler service = getService();
            if (service == null) {
                return RtcscErrorCode.NULL_CLIENT_HANDLER;
            }
            service.enableVideoFrameTimestampRetrieval(str, rtcscTimestampRetrievalParams);
            mLog.i("Service request for enableVideoFrameTimestampRetrieval sent successfully");
            return RtcscErrorCode.SUCCESS;
        } catch (RemoteException e) {
            mLog.e("Exception in enableVideoFrameTimestampRetrieval", e);
            return RtcscErrorCode.REMOTE_ERROR;
        }
    }

    public RtcscErrorCode forceRemoteMicrophoneAsSource(@NonNull String str, boolean z) {
        if (str == null) {
            Single$$ExternalSyntheticBUOutline0.m$3("sessionId is marked non-null but is null");
            return null;
        }
        mLog.i("forceRemoteMicrophoneAsSource called. Forwarding call to the service. SessionId: " + str + ".");
        try {
            IRtcscServiceHandler service = getService();
            if (service == null) {
                return RtcscErrorCode.NULL_CLIENT_HANDLER;
            }
            service.forceRemoteMicrophoneAsSource(str, z);
            mLog.i("Service request for forceRemoteMicrophoneAsSource sent successfully");
            return RtcscErrorCode.SUCCESS;
        } catch (RemoteException e) {
            mLog.e("Exception in forceRemoteMicrophoneAsSource", e);
            return RtcscErrorCode.REMOTE_ERROR;
        }
    }

    public RtcscErrorCode handleDirective(@NonNull String str, @NonNull String str2) {
        if (str == null) {
            Single$$ExternalSyntheticBUOutline0.m$3("directiveName is marked non-null but is null");
            return null;
        }
        if (str2 == null) {
            Single$$ExternalSyntheticBUOutline0.m$3("directivePayload is marked non-null but is null");
            return null;
        }
        mLog.i("handleDirective called. Forwarding call to the service. DirectiveName: ".concat(str));
        try {
            IRtcscServiceHandler service = getService();
            if (service == null) {
                return RtcscErrorCode.NULL_CLIENT_HANDLER;
            }
            service.handleDirective(str, str2);
            mLog.i("Service request for handleDirective sent successfully");
            return RtcscErrorCode.SUCCESS;
        } catch (RemoteException e) {
            mLog.e("Exception in handleDirective", e);
            return RtcscErrorCode.REMOTE_ERROR;
        }
    }

    public RtcscErrorCode initRenderer(String str, String str2, IRtcscViewRendererListener iRtcscViewRendererListener, RtcscViewDirection rtcscViewDirection, String str3) {
        mLog.i("initRenderer called. Forwarding call to the service. SessionId: " + str + ". Label: " + str2);
        try {
            IRtcscServiceHandler service = getService();
            if (service == null) {
                return RtcscErrorCode.NULL_CLIENT_HANDLER;
            }
            service.initRenderer(str, str2, iRtcscViewRendererListener, rtcscViewDirection, str3);
            mLog.i("Service request for initRenderer returned successfully");
            return RtcscErrorCode.SUCCESS;
        } catch (RemoteException e) {
            mLog.e("Exception in initRenderer", e);
            return RtcscErrorCode.REMOTE_ERROR;
        }
    }

    public RtcscErrorCode onRendererLayout(String str, String str2, boolean z, int i, int i2, int i3, int i4) {
        mLog.i("onRendererLayout called. Forwarding call to the service. SessionId: " + str + ". Label: " + str2);
        try {
            IRtcscServiceHandler service = getService();
            if (service == null) {
                return RtcscErrorCode.NULL_CLIENT_HANDLER;
            }
            service.onRendererLayout(str, str2, z, i, i2, i3, i4);
            mLog.i("Service request for onRendererLayout returned successfully");
            return RtcscErrorCode.SUCCESS;
        } catch (RemoteException e) {
            mLog.e("Exception in onRendererLayout", e);
            return RtcscErrorCode.REMOTE_ERROR;
        }
    }

    public RtcscErrorCode onRendererMeasure(String str, String str2, int i, int i2) {
        mLog.i("onRendererMeasure called. Forwarding call to the service. SessionId: " + str + ". Label: " + str2);
        try {
            IRtcscServiceHandler service = getService();
            if (service == null) {
                return RtcscErrorCode.NULL_CLIENT_HANDLER;
            }
            service.onRendererMeasure(str, str2, i, i2);
            mLog.i("Service request for onRendererMeasure returned successfully");
            return RtcscErrorCode.SUCCESS;
        } catch (RemoteException e) {
            mLog.e("Exception in onRendererMeasure", e);
            return RtcscErrorCode.REMOTE_ERROR;
        } catch (RuntimeException unused) {
            mLog.i("Could not get RTCSC service. Service has been already torn down. Ignoring onRendererMeasure() callback.");
            return RtcscErrorCode.SUCCESS;
        }
    }

    public RtcscErrorCode putScreenCapturerData(String str, Intent intent) {
        RtcscLogger rtcscLogger = mLog;
        Locale locale = Locale.US;
        RegionDefaults$$ExternalSyntheticOutline0.m("putScreenCapturerData called. Forwarding call to the service. SessionId: ", str, rtcscLogger);
        try {
            IRtcscServiceHandler service = getService();
            if (service == null) {
                return RtcscErrorCode.NULL_CLIENT_HANDLER;
            }
            service.putScreenCapturerData(str, intent);
            mLog.i("Service request for putScreenCapturerData sent successfully");
            return RtcscErrorCode.SUCCESS;
        } catch (RemoteException e) {
            mLog.e("Exception in putScreenCapturerData", e);
            return RtcscErrorCode.REMOTE_ERROR;
        }
    }

    public RtcscErrorCode registerCAEventListener(@NonNull RtcscAppInfo rtcscAppInfo, @NonNull IRtcscEventListener iRtcscEventListener) {
        if (rtcscAppInfo == null) {
            Single$$ExternalSyntheticBUOutline0.m$3("rtcscAppInfo is marked non-null but is null");
            return null;
        }
        if (iRtcscEventListener == null) {
            Single$$ExternalSyntheticBUOutline0.m$3("listener is marked non-null but is null");
            return null;
        }
        mLog.i("registerCAEventListener called. Forwarding call to the service");
        try {
            IRtcscServiceHandler service = getService();
            if (service == null) {
                return RtcscErrorCode.NULL_CLIENT_HANDLER;
            }
            service.registerCAEventListener(rtcscAppInfo, iRtcscEventListener);
            mLog.i("Service request for registerCAEventListener sent successfully");
            return RtcscErrorCode.SUCCESS;
        } catch (RemoteException e) {
            mLog.e("Exception in registerCAEventListener", e);
            return RtcscErrorCode.REMOTE_ERROR;
        }
    }

    public void registerClientDeathListener(@NonNull RtcscAppInfo rtcscAppInfo) {
        if (rtcscAppInfo == null) {
            Single$$ExternalSyntheticBUOutline0.m$3("rtcscAppInfo is marked non-null but is null");
            return;
        }
        RtcscLogger rtcscLogger = mLog;
        Locale locale = Locale.US;
        RegionDefaults$$ExternalSyntheticOutline0.m("registerClientDeathListener called. Forwarding call to the service. SessionDomain: ", rtcscAppInfo.getAppIdentifier(), rtcscLogger);
        try {
            IRtcscServiceHandler service = getService();
            if (service == null) {
                return;
            }
            service.registerClientDeathListener(rtcscAppInfo, new Binder());
            mLog.i("Service request for registerClientDeathListener sent successfully");
        } catch (RemoteException e) {
            mLog.e("Exception in registerClientDeathListener", e);
        }
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
        mLog.i("registerDataChannelListener called. Forwarding call to RtcscService. SessionId: ".concat(str));
        boolean z = false;
        if (!isRealServiceConnected()) {
            mLog.w("non-void method registerDataChannelListener cannot be issued as real service is not connected");
            return false;
        }
        try {
            IRtcscServiceHandler service = getService();
            if (service == null) {
                return false;
            }
            z = service.registerDataChannelListener(str, iRtcscDataChannelListener);
            mLog.i("Service request for registerDataChannelListener returned successfully");
            return z;
        } catch (RemoteException e) {
            mLog.e("Exception in registerDataChannelListener", e);
            return z;
        } catch (BaseClient.ReturnValueMethodInvocationException e2) {
            mLog.e("Exception in registerDataChannelListener as it is non-void and invoked when real service is not connected", e2);
            return z;
        }
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
        mLog.i("registerRtcscAppClientListener called for SessionDomain - " + rtcscAppInfo.getAppIdentifier() + ". Forwarding call to the service");
        try {
            IRtcscServiceHandler service = getService();
            if (service == null) {
                return RtcscErrorCode.NULL_CLIENT_HANDLER;
            }
            service.registerRtcscAppClientListener(rtcscAppInfo, iRtcscAppClientListener);
            mLog.i("Service request for registerRtcscAppClientListener sent successfully");
            return RtcscErrorCode.SUCCESS;
        } catch (RemoteException e) {
            mLog.e("Exception in registerRtcscAppClientListener", e);
            return RtcscErrorCode.REMOTE_ERROR;
        }
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
        mLog.i("registerRtcscCustomMetricsPublisherAdapter called for app client: " + rtcscAppInfo.getAppIdentifier() + ". Forwarding call to the service.");
        try {
            IRtcscServiceHandler service = getService();
            if (service == null) {
                return RtcscErrorCode.NULL_CLIENT_HANDLER;
            }
            service.registerRtcscCustomMetricsPublisherAdapter(rtcscAppInfo, iRtcscCustomMetricsPublisherAdapter);
            mLog.i("Service request for registerRtcscCustomMetricsPublisherAdapter sent successfully");
            return RtcscErrorCode.SUCCESS;
        } catch (RemoteException e) {
            mLog.e("Exception in registerRtcscCustomMetricsPublisherAdapter", e);
            return RtcscErrorCode.REMOTE_ERROR;
        }
    }

    public RtcscErrorCode registerScreenCapturerListener(String str, IRtcscScreenCapturerListener iRtcscScreenCapturerListener) {
        RtcscLogger rtcscLogger = mLog;
        Locale locale = Locale.US;
        RegionDefaults$$ExternalSyntheticOutline0.m("registerScreenCapturerListener called. Forwarding call to the service. SessionId: ", str, rtcscLogger);
        try {
            IRtcscServiceHandler service = getService();
            if (service == null) {
                return RtcscErrorCode.NULL_CLIENT_HANDLER;
            }
            service.registerScreenCapturerListener(str, iRtcscScreenCapturerListener);
            mLog.i("Service request for registerScreenCapturerListener sent successfully");
            return RtcscErrorCode.SUCCESS;
        } catch (RemoteException e) {
            mLog.e("Exception in registerScreenCapturerListener", e);
            return RtcscErrorCode.REMOTE_ERROR;
        }
    }

    public RtcscErrorCode releaseAudioFocus(@NonNull String str) {
        if (str == null) {
            Single$$ExternalSyntheticBUOutline0.m$3("sessionId is marked non-null but is null");
            return null;
        }
        mLog.i("releaseAudioFocus called. Forwarding call to the service. SessionId: " + str + ".");
        try {
            IRtcscServiceHandler service = getService();
            if (service == null) {
                return RtcscErrorCode.NULL_CLIENT_HANDLER;
            }
            service.releaseAudioFocus(str);
            mLog.i("Service request for releaseAudioFocus sent successfully");
            return RtcscErrorCode.SUCCESS;
        } catch (RemoteException e) {
            mLog.e("Exception in releaseAudioFocus", e);
            return RtcscErrorCode.REMOTE_ERROR;
        }
    }

    public RtcscErrorCode releaseRenderer(String str, String str2) {
        mLog.i("releaseRenderer called. Forwarding call to the service. SessionId: " + str + ". Label: " + str2);
        try {
            IRtcscServiceHandler service = getService();
            if (service == null) {
                return RtcscErrorCode.NULL_CLIENT_HANDLER;
            }
            service.releaseRenderer(str, str2);
            mLog.i("Service request for releaseRenderer returned successfully");
            return RtcscErrorCode.SUCCESS;
        } catch (RemoteException e) {
            mLog.e("Exception in releaseRenderer", e);
            return RtcscErrorCode.REMOTE_ERROR;
        }
    }

    public RtcscErrorCode requestAudioFocus(@NonNull String str, RtcscAudioFocusConfig rtcscAudioFocusConfig) {
        if (str == null) {
            Single$$ExternalSyntheticBUOutline0.m$3("sessionId is marked non-null but is null");
            return null;
        }
        mLog.i("requestAudioFocus called. Forwarding call to the service. SessionId: " + str + ". AudioFocusConfig: " + rtcscAudioFocusConfig);
        try {
            IRtcscServiceHandler service = getService();
            if (service == null) {
                return RtcscErrorCode.NULL_CLIENT_HANDLER;
            }
            service.requestAudioFocus(str, rtcscAudioFocusConfig);
            mLog.i("Service request for requestAudioFocus sent successfully.");
            return RtcscErrorCode.SUCCESS;
        } catch (RemoteException e) {
            mLog.e("Exception in requestAudioFocus", e);
            return RtcscErrorCode.REMOTE_ERROR;
        }
    }

    public RtcscErrorCode requestAudioFocusBlocking(@NonNull String str, RtcscAudioFocusConfig rtcscAudioFocusConfig) {
        if (str == null) {
            Single$$ExternalSyntheticBUOutline0.m$3("sessionId is marked non-null but is null");
            return null;
        }
        mLog.i("requestAudioFocusBlocking called. Forwarding call to the service. SessionId: " + str + ". AudioFocusConfig: " + rtcscAudioFocusConfig);
        try {
            IRtcscServiceHandler service = getService();
            if (service == null) {
                return RtcscErrorCode.NULL_CLIENT_HANDLER;
            }
            if (service.requestAudioFocusBlocking(str, rtcscAudioFocusConfig) == 1) {
                mLog.i("Service request for requestAudioFocusBlocking sent successfully.");
                return RtcscErrorCode.SUCCESS;
            }
            mLog.e("Service request for requestAudioFocusBlocking failed.");
            return RtcscErrorCode.API_NOT_AVAILABLE;
        } catch (RemoteException e) {
            mLog.e("Exception in requestAudioFocusBlocking", e);
            return RtcscErrorCode.REMOTE_ERROR;
        } catch (BaseClient.ReturnValueMethodInvocationException e2) {
            mLog.e("Exception in requestAudioFocusBlocking as it is non-void and invoked when real service is not connected", e2);
            return RtcscErrorCode.REMOTE_ERROR;
        }
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
        mLog.i("sendData called. Forwarding call to the service. SessionId: " + str + ". Label: " + str2);
        boolean z2 = false;
        if (!isRealServiceConnected()) {
            mLog.w("non-void method sendData cannot be issued as real service is not connected");
            return false;
        }
        try {
            IRtcscServiceHandler service = getService();
            if (service == null) {
                return false;
            }
            z2 = service.sendData(str, str2, bArr, z);
            mLog.i("Service request for sendData returned successfully");
            return z2;
        } catch (RemoteException e) {
            mLog.e("Exception in sendData", e);
            return z2;
        } catch (BaseClient.ReturnValueMethodInvocationException e2) {
            mLog.e("Exception in sendData as it is non-void and invoked when real service is not connected", e2);
            return z2;
        }
    }

    public RtcscErrorCode setEnableHardwareScaler(String str, String str2, boolean z) {
        mLog.i("setEnableHardwareScaler called. Forwarding call to the service. SessionId: " + str + ". Label: " + str2);
        try {
            IRtcscServiceHandler service = getService();
            if (service == null) {
                return RtcscErrorCode.NULL_CLIENT_HANDLER;
            }
            service.setEnableHardwareScaler(str, str2, z);
            mLog.i("Service request for setEnableHardwareScaler returned successfully");
            return RtcscErrorCode.SUCCESS;
        } catch (RemoteException e) {
            mLog.e("Exception in setEnableHardwareScaler", e);
            return RtcscErrorCode.REMOTE_ERROR;
        }
    }

    public RtcscErrorCode setLocalAudioState(@NonNull String str, boolean z) {
        if (str == null) {
            Single$$ExternalSyntheticBUOutline0.m$3("sessionId is marked non-null but is null");
            return null;
        }
        mLog.i("setLocalAudioState called. Forwarding call to the service. SessionId: " + str + ". AudioState: " + z);
        try {
            IRtcscServiceHandler service = getService();
            if (service == null) {
                return RtcscErrorCode.NULL_CLIENT_HANDLER;
            }
            service.setLocalAudioState(str, z);
            mLog.i("Service request for setLocalAudioState sent successfully");
            return RtcscErrorCode.SUCCESS;
        } catch (RemoteException e) {
            mLog.e("Exception in setLocalAudioState", e);
            return RtcscErrorCode.REMOTE_ERROR;
        }
    }

    public RtcscErrorCode setLocalVideoState(@NonNull String str, boolean z) {
        if (str == null) {
            Single$$ExternalSyntheticBUOutline0.m$3("sessionId is marked non-null but is null");
            return null;
        }
        mLog.i("setLocalVideoState called. Forwarding call to the service. SessionId: " + str + ". videoEnabled: " + z);
        try {
            IRtcscServiceHandler service = getService();
            if (service == null) {
                return RtcscErrorCode.NULL_CLIENT_HANDLER;
            }
            service.setLocalVideoState(str, z);
            mLog.i("Service request for setLocalVideoState sent successfully");
            return RtcscErrorCode.SUCCESS;
        } catch (RemoteException e) {
            mLog.e("Exception in setLocalVideoState", e);
            return RtcscErrorCode.REMOTE_ERROR;
        }
    }

    public RtcscErrorCode setMirror(String str, String str2, boolean z) {
        mLog.i("setMirror called. Forwarding call to the service. SessionId: " + str + ". Label: " + str2);
        try {
            IRtcscServiceHandler service = getService();
            if (service == null) {
                return RtcscErrorCode.NULL_CLIENT_HANDLER;
            }
            service.setMirror(str, str2, z);
            mLog.i("Service request for setMirror returned successfully");
            return RtcscErrorCode.SUCCESS;
        } catch (RemoteException e) {
            mLog.e("Exception in setMirror", e);
            return RtcscErrorCode.REMOTE_ERROR;
        }
    }

    public RtcscErrorCode setRemoteAudioState(@NonNull String str, boolean z) {
        if (str == null) {
            Single$$ExternalSyntheticBUOutline0.m$3("sessionId is marked non-null but is null");
            return null;
        }
        mLog.i("setRemoteAudioState called. Forwarding call to the service. SessionId: " + str + ". AudioState: " + z);
        try {
            IRtcscServiceHandler service = getService();
            if (service == null) {
                return RtcscErrorCode.NULL_CLIENT_HANDLER;
            }
            service.setRemoteAudioState(str, z);
            mLog.i("Service request for setRemoteAudioState sent successfully");
            return RtcscErrorCode.SUCCESS;
        } catch (RemoteException e) {
            mLog.e("Exception in setRemoteAudioState", e);
            return RtcscErrorCode.REMOTE_ERROR;
        }
    }

    public RtcscErrorCode setScalingType(String str, String str2, RtcscScalingType rtcscScalingType) {
        mLog.i("setScalingType called. Forwarding call to the service. SessionId: " + str + ". Label: " + str2);
        try {
            IRtcscServiceHandler service = getService();
            if (service == null) {
                return RtcscErrorCode.NULL_CLIENT_HANDLER;
            }
            service.setScalingType(str, str2, rtcscScalingType);
            mLog.i("Service request for setScalingType returned successfully");
            return RtcscErrorCode.SUCCESS;
        } catch (RemoteException e) {
            mLog.e("Exception in setScalingType", e);
            return RtcscErrorCode.REMOTE_ERROR;
        }
    }

    public RtcscErrorCode setScreenCapturerDimensions(String str, int i, int i2) {
        RtcscLogger rtcscLogger = mLog;
        Locale locale = Locale.US;
        RegionDefaults$$ExternalSyntheticOutline0.m("setScreenCapturerDimensions called. Forwarding call to the service. SessionId: ", str, rtcscLogger);
        try {
            IRtcscServiceHandler service = getService();
            if (service == null) {
                return RtcscErrorCode.NULL_CLIENT_HANDLER;
            }
            service.setScreenCapturerDimensions(str, i, i2);
            mLog.i("Service request for setScreenCapturerDimensions sent successfully");
            return RtcscErrorCode.SUCCESS;
        } catch (RemoteException e) {
            mLog.e("Exception in setScreenCapturerDimensions", e);
            return RtcscErrorCode.REMOTE_ERROR;
        }
    }

    public RtcscErrorCode setVideoEffect(@NonNull String str, @NonNull RtcscVideoEffect rtcscVideoEffect, int i) {
        if (str == null) {
            Single$$ExternalSyntheticBUOutline0.m$3("sessionId is marked non-null but is null");
            return null;
        }
        if (rtcscVideoEffect == null) {
            Single$$ExternalSyntheticBUOutline0.m$3("videoEffect is marked non-null but is null");
            return null;
        }
        RtcscLogger rtcscLogger = mLog;
        Locale locale = Locale.US;
        rtcscLogger.i("setVideoEffect called. Forwarding call to the service. SessionId: " + str + ".");
        try {
            IRtcscServiceHandler service = getService();
            if (service == null) {
                return RtcscErrorCode.NULL_CLIENT_HANDLER;
            }
            service.setVideoEffect(str, rtcscVideoEffect, i);
            mLog.i("Service request for setVideoEffect sent successfully");
            return RtcscErrorCode.SUCCESS;
        } catch (RemoteException e) {
            mLog.e("Exception in setVideoEffect", e);
            return RtcscErrorCode.REMOTE_ERROR;
        }
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
        mLog.i("signalReadyForSession called. Forwarding call to the service. SessionId: " + str + ", AudioDirection: " + rtcscMediaDirection + ", VideoDirection: " + rtcscMediaDirection2);
        try {
            IRtcscServiceHandler service = getService();
            if (service == null) {
                return RtcscErrorCode.NULL_CLIENT_HANDLER;
            }
            service.signalReadyWithMediaDirection(str, rtcscMediaDirection, rtcscMediaDirection2);
            mLog.i("Service request for signalReadyForSession sent successfully");
            return RtcscErrorCode.SUCCESS;
        } catch (RemoteException e) {
            mLog.e("Exception in signalReadyForSession", e);
            return RtcscErrorCode.REMOTE_ERROR;
        }
    }

    public RtcscErrorCode surfaceChanged(String str, String str2, Surface surface, int i, int i2, int i3) {
        mLog.i("surfaceChanged called. Forwarding call to the service. SessionId: " + str + ". Label: " + str2);
        try {
            IRtcscServiceHandler service = getService();
            if (service == null) {
                return RtcscErrorCode.NULL_CLIENT_HANDLER;
            }
            service.surfaceChanged(str, str2, surface, i, i2, i3);
            mLog.i("Service request for surfaceChanged returned successfully");
            return RtcscErrorCode.SUCCESS;
        } catch (RemoteException e) {
            mLog.e("Exception in surfaceChanged", e);
            return RtcscErrorCode.REMOTE_ERROR;
        }
    }

    public RtcscErrorCode surfaceCreated(String str, String str2, Surface surface) {
        mLog.i("surfaceCreated called. Forwarding call to the service. SessionId: " + str + ". Label: " + str2);
        try {
            IRtcscServiceHandler service = getService();
            if (service == null) {
                return RtcscErrorCode.NULL_CLIENT_HANDLER;
            }
            service.surfaceCreated(str, str2, surface);
            mLog.i("Service request for surfaceCreated returned successfully");
            return RtcscErrorCode.SUCCESS;
        } catch (RemoteException e) {
            mLog.e("Exception in surfaceCreated", e);
            return RtcscErrorCode.REMOTE_ERROR;
        }
    }

    public RtcscErrorCode surfaceDestroyed(String str, String str2, Surface surface) {
        mLog.i("surfaceDestroyed called. Forwarding call to the service. SessionId: " + str + ". Label: " + str2);
        try {
            IRtcscServiceHandler service = getService();
            if (service == null) {
                return RtcscErrorCode.NULL_CLIENT_HANDLER;
            }
            service.surfaceDestroyed(str, str2, surface);
            mLog.i("Service request for surfaceDestroyed returned successfully");
            return RtcscErrorCode.SUCCESS;
        } catch (RemoteException e) {
            mLog.e("Exception in surfaceDestroyed", e);
            return RtcscErrorCode.REMOTE_ERROR;
        }
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
        mLog.i("switchCamera called. Forwarding call to the service. SessionId: " + str + ". CameraName: " + str2);
        try {
            IRtcscServiceHandler service = getService();
            if (service == null) {
                return RtcscErrorCode.NULL_CLIENT_HANDLER;
            }
            service.switchCamera(str, str2);
            mLog.i("Service request for switchCamera sent successfully");
            return RtcscErrorCode.SUCCESS;
        } catch (RemoteException e) {
            mLog.e("Exception in switchCamera", e);
            return RtcscErrorCode.REMOTE_ERROR;
        }
    }

    public RtcscErrorCode unregisterCAEventListener(@NonNull RtcscAppInfo rtcscAppInfo) {
        if (rtcscAppInfo == null) {
            Single$$ExternalSyntheticBUOutline0.m$3("rtcscAppInfo is marked non-null but is null");
            return null;
        }
        mLog.i("unregisterCAEventListener called. Forwarding call to the service");
        try {
            IRtcscServiceHandler service = getService();
            if (service == null) {
                return RtcscErrorCode.NULL_CLIENT_HANDLER;
            }
            service.unregisterCAEventListener(rtcscAppInfo);
            mLog.i("Service request for unregisterCAEventListener sent successfully");
            return RtcscErrorCode.SUCCESS;
        } catch (RemoteException e) {
            mLog.e("Exception in unregisterCAEventListener", e);
            return RtcscErrorCode.REMOTE_ERROR;
        }
    }

    public boolean unregisterDataChannelListener(@NonNull String str) {
        if (str == null) {
            Single$$ExternalSyntheticBUOutline0.m$3("sessionId is marked non-null but is null");
            return false;
        }
        mLog.i("unregisterDataChannelListener called. Forwarding call to RtcscService. SessionId: ".concat(str));
        boolean z = false;
        if (!isRealServiceConnected()) {
            mLog.w("non-void method unregisterDataChannelListener cannot be issued as real service is not connected");
            return false;
        }
        try {
            IRtcscServiceHandler service = getService();
            if (service == null) {
                return false;
            }
            z = service.unregisterDataChannelListener(str);
            mLog.i("Service request for unregisterDataChannelListener returned successfully");
            return z;
        } catch (RemoteException e) {
            mLog.e("Exception in unregisterDataChannelListener", e);
            return z;
        } catch (BaseClient.ReturnValueMethodInvocationException e2) {
            mLog.e("Exception in unregisterDataChannelListener as it is non-void and invoked when real service is not connected", e2);
            return z;
        }
    }

    public RtcscErrorCode unregisterRtcscAppClientListener(@NonNull RtcscAppInfo rtcscAppInfo) {
        if (rtcscAppInfo == null) {
            Single$$ExternalSyntheticBUOutline0.m$3("rtcscAppInfo is marked non-null but is null");
            return null;
        }
        mLog.i("unregisterRtcscAppClientListener called for SessionDomain - " + rtcscAppInfo.getAppIdentifier() + ". Forwarding call to the service");
        try {
            IRtcscServiceHandler service = getService();
            if (service == null) {
                return RtcscErrorCode.NULL_CLIENT_HANDLER;
            }
            service.unregisterRtcscAppClientListener(rtcscAppInfo);
            mLog.i("Service request for unregisterRtcscAppClientListener sent successfully");
            return RtcscErrorCode.SUCCESS;
        } catch (RemoteException e) {
            mLog.e("Exception in unregisterRtcscAppClientListener", e);
            return RtcscErrorCode.REMOTE_ERROR;
        }
    }

    public RtcscErrorCode unregisterRtcscCustomMetricsPublisherAdapter(@NonNull RtcscAppInfo rtcscAppInfo) {
        if (rtcscAppInfo == null) {
            Single$$ExternalSyntheticBUOutline0.m$3("rtcscAppInfo is marked non-null but is null");
            return null;
        }
        mLog.i("unregisterRtcscCustomMetricsPublisherAdapter called for app client: " + rtcscAppInfo.getAppIdentifier() + ". Forwarding call to the service");
        try {
            IRtcscServiceHandler service = getService();
            if (service == null) {
                return RtcscErrorCode.NULL_CLIENT_HANDLER;
            }
            service.unregisterRtcscCustomMetricsPublisherAdapter(rtcscAppInfo);
            mLog.i("Service request for unregisterRtcscCustomMetricsPublisherAdapter sent successfully");
            return RtcscErrorCode.SUCCESS;
        } catch (RemoteException e) {
            mLog.e("Exception in unregisterRtcscCustomMetricsPublisherAdapter", e);
            return RtcscErrorCode.REMOTE_ERROR;
        }
    }

    public RtcscErrorCode unregisterScreenCapturerListener(String str) {
        RtcscLogger rtcscLogger = mLog;
        Locale locale = Locale.US;
        RegionDefaults$$ExternalSyntheticOutline0.m("unregisterScreenCapturerListener called. Forwarding call to the service. SessionId: ", str, rtcscLogger);
        try {
            IRtcscServiceHandler service = getService();
            if (service == null) {
                return RtcscErrorCode.NULL_CLIENT_HANDLER;
            }
            service.unregisterScreenCapturerListener(str);
            mLog.i("Service request for unregisterScreenCapturerListener sent successfully");
            return RtcscErrorCode.SUCCESS;
        } catch (RemoteException e) {
            mLog.e("Exception in unregisterScreenCapturerListener", e);
            return RtcscErrorCode.REMOTE_ERROR;
        }
    }

    public RtcscClientHandler(@NonNull Context context, @NonNull ServiceConnectionManager serviceConnectionManager) {
        this(context, serviceConnectionManager, new Intent(RtcscServiceInfo.createRtcscServiceBindIntent(context)));
        if (context == null) {
            Single$$ExternalSyntheticBUOutline0.m$3("context is marked non-null but is null");
            throw null;
        }
        if (serviceConnectionManager != null) {
            return;
        }
        Single$$ExternalSyntheticBUOutline0.m$3("serviceConnectionManager is marked non-null but is null");
        throw null;
    }

    public RtcscClientHandler(@NonNull Context context) {
        this(context, new AsyncServiceConnectionManager());
        if (context != null) {
            return;
        }
        Single$$ExternalSyntheticBUOutline0.m$3("context is marked non-null but is null");
        throw null;
    }

    public RtcscErrorCode setVideoEffect(@NonNull String str, @NonNull RtcscVideoEffectRequest rtcscVideoEffectRequest) {
        if (str == null) {
            Single$$ExternalSyntheticBUOutline0.m$3("sessionId is marked non-null but is null");
            return null;
        }
        if (rtcscVideoEffectRequest != null) {
            RtcscLogger rtcscLogger = mLog;
            Locale locale = Locale.US;
            rtcscLogger.i("setVideoEffect (with request) called. Forwarding call to the service. SessionId: " + str + ".");
            try {
                IRtcscServiceHandler service = getService();
                if (service == null) {
                    return RtcscErrorCode.NULL_CLIENT_HANDLER;
                }
                service.setVideoEffectWithRequest(str, rtcscVideoEffectRequest);
                mLog.i("Service request for setVideoEffectWithRequest sent successfully");
                return RtcscErrorCode.SUCCESS;
            } catch (RemoteException e) {
                mLog.e("Exception in setVideoEffectWithRequest", e);
                return RtcscErrorCode.REMOTE_ERROR;
            }
        }
        Single$$ExternalSyntheticBUOutline0.m$3("videoEffectRequest is marked non-null but is null");
        return null;
    }

    public RtcscErrorCode signalReadyForSession(@NonNull String str) {
        if (str != null) {
            mLog.i("signalReadyForSession called. Forwarding call to the service. SessionId: " + str + ".");
            try {
                IRtcscServiceHandler service = getService();
                if (service == null) {
                    return RtcscErrorCode.NULL_CLIENT_HANDLER;
                }
                service.signalReadyForSession(str);
                mLog.i("Service request for signalReadyForSession sent successfully");
                return RtcscErrorCode.SUCCESS;
            } catch (RemoteException e) {
                mLog.e("Exception in signalReadyForSession", e);
                return RtcscErrorCode.REMOTE_ERROR;
            }
        }
        Single$$ExternalSyntheticBUOutline0.m$3("sessionId is marked non-null but is null");
        return null;
    }
}
