package com.amazon.comms.config;

import android.content.Context;
import android.media.MediaCodecInfo;
import android.os.Build;
import com.amazon.comms.calling.service.AudioConfig;
import com.amazon.comms.calling.service.CandidateNetworkPolicy;
import com.amazon.comms.calling.service.DynamicAcousticParams;
import com.amazon.comms.calling.service.PlatformVoIPSelection;
import com.amazon.comms.calling.service.UniqueIdentifier;
import com.amazon.comms.calling.service.VideoCodecConfigInfo;
import com.amazon.comms.calling.service.VideoConstraints;
import com.amazon.comms.config.util.DeviceConfigConstants;
import com.amazon.comms.config.util.LedControllerType;
import com.amazon.comms.config.util.SimJobScheduler;
import com.amazon.comms.config.util.UniqueIdentifierGeneratedByUUID;
import com.amazon.comms.device.AvsDeviceFacade;
import com.amazon.comms.device.DeviceFacadeType;
import com.amazon.comms.log.CommsLogger;
import com.amazon.comms.policy.CallingServiceRuntimePolicy;
import com.google.common.base.Predicate;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public abstract class DeviceConfig {
    protected static final CommsLogger log = CommsLogger.getLogger(DeviceConfig.class);
    protected CallingServiceRuntimePolicy runtimePolicy = null;
    protected UniqueIdentifier uniqueIdentifier = null;

    public boolean acceptPresenceBroadcast() {
        return true;
    }

    public boolean canReceiveRemoteFaceCoordinates() {
        return false;
    }

    public boolean captureToTexture() {
        return true;
    }

    public boolean enableMediaCodecVideoDecoderFrameDropWorkaround() {
        return false;
    }

    public boolean forceCamera2API() {
        return false;
    }

    public int getAudioCaptureSampleRateToUse() {
        return 16000;
    }

    public int getAudioRenderBufferSizeBytes() {
        return -1;
    }

    public int getAudioRenderSampleRateToUse() {
        return 48000;
    }

    public int getAudioStartBitrateKbps() {
        return 48;
    }

    public abstract AvsDeviceFacade getAvsDeviceFacade(Context context);

    public DeviceFacadeType getAvsDeviceFacadeType() {
        return null;
    }

    public String getBuildVersion() {
        try {
            String[] split = Build.VERSION.INCREMENTAL.split("_");
            if (split.length > 2) {
                return split[2];
            }
        } catch (Exception e) {
            log.w("Exception in finding build version", e);
        }
        return String.valueOf(Long.MAX_VALUE);
    }

    public long getCallEndToShutdownTimeout() {
        return 3000L;
    }

    public long getCallStandByToShutdownTimeout() {
        return DeviceConfigConstants.DEFAULT_CALL_STANDBY_TO_SHUTDOWN_TIMEOUT_MS;
    }

    public CandidateNetworkPolicy getCandidateNetworkPolicy() {
        return CandidateNetworkPolicy.ALL;
    }

    public long getDeferredBeginCallTimeout() {
        return 5000L;
    }

    public DynamicAcousticParams.ConfigPath getDynamicAcousticParamsConfigPath() {
        return DeviceConfigConstants.DYNAMIC_ACOUSTIC_PARAMS_CONFIG_PATH_NONE;
    }

    public int getFaceCoordinatesYOffset() {
        return 0;
    }

    public AudioConfig.FastRenderPath getFastAudioRenderPath() {
        return DeviceConfigConstants.DEFAULT_FAST_RENDER_PATH_OPTION;
    }

    public abstract SimJobScheduler getJobScheduler(Context context);

    public LedControllerType getLedControllerType() {
        return DeviceConfigConstants.DEFAULT_LED_CONTROLLER_TYPE;
    }

    public String getLocalSurfaceViewShape() {
        return "none";
    }

    public VideoConstraints getMaxVideoConstraintsToRequestFromRemote() {
        return null;
    }

    public int getNonH264VideoFps() {
        return 0;
    }

    public int getNonH264VideoHeight() {
        return 0;
    }

    public int getNonH264VideoWidth() {
        return 0;
    }

    public PlatformVoIPSelection getPlatformVoIPSelection() {
        return null;
    }

    public String getRemoteSurfaceViewShape() {
        return "none";
    }

    public synchronized CallingServiceRuntimePolicy getRuntimePolicy(Context context) {
        try {
            try {
                if (this.runtimePolicy == null) {
                    this.runtimePolicy = (CallingServiceRuntimePolicy) Class.forName(DeviceConfigConstants.ALWAYS_ON_RUNTIME_POLICY).getDeclaredConstructor(Context.class).newInstance(context);
                }
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.runtimePolicy;
    }

    public Map<Integer, VideoConstraints> getSupportedResolutions() {
        return null;
    }

    public abstract String getUILauncherName();

    public abstract String getUIMainActivity();

    public abstract String getUINotificationManagerName();

    public synchronized UniqueIdentifier getUniqueIdentifier() {
        try {
            if (this.uniqueIdentifier == null) {
                this.uniqueIdentifier = new UniqueIdentifierGeneratedByUUID();
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.uniqueIdentifier;
    }

    public List<VideoCodecConfigInfo> getVideoCodecConfigInfoList() {
        return new ArrayList();
    }

    public Predicate<MediaCodecInfo> getVideoCodecPredicate() {
        return null;
    }

    public String getVideoFileInjectionPath() {
        return null;
    }

    public int getVideoFps() {
        return 0;
    }

    public int getVideoFramerateBeforeIceConnection() {
        return 0;
    }

    public int getVideoHeight() {
        return 0;
    }

    public int getVideoHeightBeforeIceConnection() {
        return 0;
    }

    public int getVideoMaxBitrate() {
        return 0;
    }

    public int getVideoStartBitrate() {
        return 0;
    }

    public int getVideoWidth() {
        return 0;
    }

    public int getVideoWidthBeforeIceConnection() {
        return 0;
    }

    public String getWebRTCFieldTrials() {
        return "";
    }

    public int getWebRTCStatsLoggingFrequency() {
        return -1;
    }

    public int getWebRTCStatsPollingFrequency() {
        return 3000;
    }

    public boolean hasBuiltInSpeaker() {
        return true;
    }

    public boolean hasVDNA() {
        return false;
    }

    public boolean ignoreCameraEvictionError() {
        return false;
    }

    public boolean isAudioCaptureSampleRateOverriden() {
        return true;
    }

    public boolean isAudioRenderSampleRateOverriden() {
        return false;
    }

    public boolean isBackgroundFloatingPIPCapable() {
        return false;
    }

    public boolean isCameraMetricsReportingEnabled() {
        return false;
    }

    public boolean isCameraSelectorCapability() {
        return false;
    }

    public boolean isCameraShutterPresent() {
        return false;
    }

    public boolean isDataChannelSupportedWithEnhancedProcessing() {
        return true;
    }

    public boolean isForceReceiveOnlyVideo() {
        return false;
    }

    public boolean isPipSwitchSupported() {
        return false;
    }

    public boolean isPresencePublishCapable() {
        return true;
    }

    public boolean isRealTimeTextCapable() {
        return false;
    }

    public boolean isSmartMotionMotorRotationSupported() {
        return false;
    }

    public boolean isSmartMotionTrackingSupported() {
        return false;
    }

    public boolean isWebRTCAcousticEchoCancelerPreferred() {
        return false;
    }

    public boolean loadWeblabCommsFeaturesThroughSubProcess() {
        return false;
    }

    public boolean preferCamera1API() {
        return false;
    }

    public boolean processParkedCallToken() {
        return true;
    }

    public boolean provideCallingServiceHalParameter() {
        return false;
    }

    public boolean requiresCallAcknowledgement() {
        return false;
    }

    public boolean shouldConstraintVideoBeforeIceConnection() {
        return false;
    }

    public boolean shouldDelayCameraStartupTillLocalSdpGenerated() {
        return false;
    }

    public boolean shouldEnableAMZNBAudioFilter() {
        return true;
    }

    public boolean shouldPersistSimDeviceContext() {
        return true;
    }

    public boolean simulateFirstFrameReceived() {
        return false;
    }

    public boolean supportBackgroundFloatingPIPForAllUsers() {
        return false;
    }

    public boolean supportDeferredBeginCall() {
        return true;
    }

    public boolean supportGloriaUi() {
        return false;
    }

    public boolean supportsCallReconnection() {
        return false;
    }

    public boolean supportsHandsFreeProfileEnabledDock() {
        return false;
    }

    public boolean supportsHints() {
        return false;
    }

    public boolean supportsInsights(Context context) {
        return true;
    }

    public boolean supportsOneWayVideoCalling() {
        return false;
    }

    public boolean supportsReducedRegistrationTraffic() {
        return false;
    }

    public boolean updateCameraHalFramerateAllowed() {
        return false;
    }

    public boolean waitForAcceptBeforeSettingSDP() {
        return true;
    }
}
