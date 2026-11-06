package com.amazon.comms.calling.service;

import android.media.MediaCodecInfo;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.comms.calling.service.AudioConfig;
import com.amazon.comms.calling.service.DynamicAcousticParams;
import com.amazon.comms.calling.service.MediaParams;
import com.amazon.comms.calling.sipclient.SipHeaders;
import com.amazon.comms.device.AvsDeviceFacade;
import com.amazon.comms.util.Size;
import com.google.common.base.Predicate;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public final class DeviceCallingServiceParams {
    private static final int AUDIO_RENDER_BUFFER_SIZE_DEFAULT = -1;
    private static final int DEFAULT_SAMPLE_RATE = 48000;
    private static final int NHD_MAX_VIDEO_FPS = 24;
    private static final int NHD_VIDEO_HEIGHT = 360;
    private static final int NHD_VIDEO_WIDTH = 640;
    private static final int STATS_POLLING_FREQUENCY = 15000;
    private final AcousticParams acousticParams;
    private final AudioConfig audioCaptureAndRenderConfig;
    private int audioStartBitrateInKbps;
    private final AvsDeviceFacade avsDeviceFacade;
    private final String buildVersion;
    private final boolean builtInSpeakerPresent;
    private final boolean cameraShutterPresent;
    private final CandidateNetworkPolicy candidateNetworkPolicy;
    private boolean constraintVideoUntilIceConnection;
    private final boolean delayCameraStartupTillSDPGenerated;
    private final DynamicAcousticParams.ConfigPath dynamicAcousticParamsConfigPath;
    private final boolean enableCameraMetricsReporting;
    private final boolean enableMediaCodecVideoDecoderFrameDropWorkaround;
    private final boolean forceReceiveOnlyVideo;
    private VideoConstraints maxVideoConstraintsOnReducedResolution;
    private final VideoConstraints maxVideoConstraintsToRequestFromRemote;
    private final MediaParams mediaParams;
    private final PlatformVoIPSelection platformVoIPSelection;
    private final boolean presencePublishCapable;
    private final boolean realTimeTextCapable;
    private final boolean reduceVideoResolutionOnNoH264Remote;
    private final SipHeaders registrationHeaders;
    private final boolean relayOnlyIceTransport;
    private final boolean renderRemoteVideoSupported;
    private final boolean requireCallAcknowledgement;
    private final String screenShape;
    private final Size screenSize;
    private final Map<Integer, VideoConstraints> supportedVideoResolutions;
    private final boolean translucentRemoteVideoRendererSupported;
    private final boolean useAlarmManagerAuthTokenManager;
    private final boolean useTextureViewForRendering;
    private final String userAgentStackVersionCode;
    private final String userAgentStackVersionCodePrepend;
    private final boolean usingReworkedCallCleanup;
    private final List<VideoCodecConfigInfo> videoCodecConfigInfoList;
    private final Predicate<MediaCodecInfo> videoCodecPredicate;
    private final VideoConfiguration videoConfiguration;
    private VideoConstraints videoConstraintsUntilIceConnection;
    private final String videoFileInjectionPath;
    private final boolean waitForAcceptBeforeInitSDP;
    private final boolean webRTCAcousticEchoCancelerPreferred;
    private final String webRTCFieldTrials;
    private final int webRTCStatsLoggingFrequency;
    private final int webRTCStatsPollingFrequency;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class DeviceCallingServiceParamsBuilder {
        private AudioConfig audioCaptureAndRenderConfig;
        private AvsDeviceFacade avsDeviceFacade;
        private boolean candidateNetworkPolicy$set;
        private CandidateNetworkPolicy candidateNetworkPolicy$value;
        private Predicate<MediaCodecInfo> codecPredicate;
        private boolean delayCameraStartupTillSDPGenerated;
        private DynamicAcousticParams.ConfigPath dynamicAcousticParamsConfigPath;
        private DynamicAcousticParams.ConfigPath dynamicMediaConfigPath;
        private boolean enableCameraMetricsReporting;
        private boolean enableMediaCodecVideoDecoderFrameDropWorkaround;
        private boolean enableMediaCodecVideoDecoderFrameDropWorkaround$set;
        private boolean enableMediaCodecVideoDecoderFrameDropWorkaround$value;
        private VideoConstraints maxVideoConstraintsToRequestFromRemote;
        private MediaParams mediaParams;
        private PlatformVoIPSelection platformVoIPSelection;
        private boolean presencePublishCapable;
        private boolean realTimeTextCapable;
        private Map<Integer, VideoConstraints> supportedVideoResolutions;
        private boolean translucentRemoteVideoRendererSupported$set;
        private boolean translucentRemoteVideoRendererSupported$value;
        private boolean useAlarmManagerAuthTokenManager;
        private boolean useTextureViewForRendering$set;
        private boolean useTextureViewForRendering$value;
        private String userAgentStackVersionCode;
        private String userAgentStackVersionCodePrepend;
        private boolean usingReworkedCallCleanup;
        private boolean usingReworkedCallCleanup$set;
        private boolean usingReworkedCallCleanup$value;
        private List<VideoCodecConfigInfo> videoCodecConfigInfoList;
        private Predicate<MediaCodecInfo> videoCodecPredicate;
        private VideoConfiguration videoConfiguration;
        private VideoConstraints videoConstraintsUntilIceConnection;
        private String videoFileInjectionPath;
        private boolean waitForAcceptBeforeInitSDP;
        private boolean webRTCAcousticEchoCancelerPreferred;
        private String webRTCFieldTrials;
        private int webRTCStatsLoggingFrequency;
        private int webRTCStatsPollingFrequency;
        private AcousticParams acousticParams = AcousticParams.enabled();
        private boolean relayOnlyIceTransport = false;
        private boolean requireCallAcknowledgement = false;
        private boolean builtInSpeakerPresent = true;
        private boolean cameraShutterPresent = false;
        private boolean renderRemoteVideoSupported = false;
        private boolean forceReceiveOnlyVideo = false;
        private String screenShape = "";
        private Size screenSize = null;
        private String buildVersion = null;
        private int audioStartBitrateInKbps = 20;
        private boolean reduceVideoResolutionOnNoH264Remote = false;
        private boolean constraintVideoUntilIceConnection = false;
        private VideoConstraints maxVideoConstraintsOnReducedResolution = new VideoConstraints(640, 360, 24);
        private SipHeaders registrationHeaders = new SipHeaders();

        public DeviceCallingServiceParamsBuilder() {
            MediaParams.LastFrameClearOption lastFrameClearOption = MediaParams.LastFrameClearOption.NONE;
            this.mediaParams = new MediaParams(lastFrameClearOption, lastFrameClearOption, 0.0f);
            this.webRTCFieldTrials = null;
            this.webRTCStatsPollingFrequency = 15000;
            this.webRTCStatsLoggingFrequency = -1;
            this.webRTCAcousticEchoCancelerPreferred = false;
            this.audioCaptureAndRenderConfig = new AudioConfig(false, 48000, false, 48000, AudioConfig.FastRenderPath.NONE, -1);
            this.presencePublishCapable = true;
            this.useAlarmManagerAuthTokenManager = false;
            this.dynamicMediaConfigPath = DynamicAcousticParams.ConfigPath.NONE;
            this.realTimeTextCapable = false;
            this.enableCameraMetricsReporting = false;
            this.waitForAcceptBeforeInitSDP = true;
            this.platformVoIPSelection = null;
            this.videoCodecConfigInfoList = null;
            this.codecPredicate = null;
            this.enableMediaCodecVideoDecoderFrameDropWorkaround = false;
            this.usingReworkedCallCleanup = false;
        }

        public DeviceCallingServiceParamsBuilder acousticParams(AcousticParams acousticParams) {
            this.acousticParams = acousticParams;
            return this;
        }

        public DeviceCallingServiceParamsBuilder audioCaptureAndRenderConfig(AudioConfig audioConfig) {
            this.audioCaptureAndRenderConfig = audioConfig;
            return this;
        }

        public DeviceCallingServiceParamsBuilder audioStartBitrateInKbps(int i) {
            this.audioStartBitrateInKbps = i;
            return this;
        }

        public DeviceCallingServiceParamsBuilder avsDeviceFacade(AvsDeviceFacade avsDeviceFacade) {
            this.avsDeviceFacade = avsDeviceFacade;
            return this;
        }

        public DeviceCallingServiceParams build() {
            boolean z = this.useTextureViewForRendering$value;
            if (!this.useTextureViewForRendering$set) {
                z = DeviceCallingServiceParams.$default$useTextureViewForRendering();
            }
            boolean z2 = z;
            boolean z3 = this.enableMediaCodecVideoDecoderFrameDropWorkaround$value;
            if (!this.enableMediaCodecVideoDecoderFrameDropWorkaround$set) {
                z3 = DeviceCallingServiceParams.$default$enableMediaCodecVideoDecoderFrameDropWorkaround();
            }
            boolean z4 = z3;
            boolean z5 = this.usingReworkedCallCleanup$value;
            if (!this.usingReworkedCallCleanup$set) {
                z5 = DeviceCallingServiceParams.$default$usingReworkedCallCleanup();
            }
            boolean z6 = z5;
            boolean z7 = this.translucentRemoteVideoRendererSupported$value;
            if (!this.translucentRemoteVideoRendererSupported$set) {
                z7 = DeviceCallingServiceParams.$default$translucentRemoteVideoRendererSupported();
            }
            boolean z8 = z7;
            CandidateNetworkPolicy candidateNetworkPolicy = this.candidateNetworkPolicy$value;
            if (!this.candidateNetworkPolicy$set) {
                candidateNetworkPolicy = DeviceCallingServiceParams.$default$candidateNetworkPolicy();
            }
            return new DeviceCallingServiceParams(this.acousticParams, this.avsDeviceFacade, this.requireCallAcknowledgement, this.relayOnlyIceTransport, this.reduceVideoResolutionOnNoH264Remote, this.maxVideoConstraintsOnReducedResolution, this.constraintVideoUntilIceConnection, this.videoConstraintsUntilIceConnection, this.audioStartBitrateInKbps, this.registrationHeaders, this.mediaParams, this.webRTCFieldTrials, this.videoConfiguration, this.supportedVideoResolutions, this.maxVideoConstraintsToRequestFromRemote, this.webRTCStatsPollingFrequency, this.webRTCStatsLoggingFrequency, this.webRTCAcousticEchoCancelerPreferred, this.audioCaptureAndRenderConfig, this.builtInSpeakerPresent, this.cameraShutterPresent, this.renderRemoteVideoSupported, this.forceReceiveOnlyVideo, this.buildVersion, this.screenShape, this.screenSize, this.presencePublishCapable, this.userAgentStackVersionCodePrepend, this.userAgentStackVersionCode, this.useAlarmManagerAuthTokenManager, this.dynamicAcousticParamsConfigPath, this.realTimeTextCapable, this.enableCameraMetricsReporting, this.waitForAcceptBeforeInitSDP, this.videoFileInjectionPath, this.platformVoIPSelection, z2, this.videoCodecConfigInfoList, this.videoCodecPredicate, z4, z6, z8, this.delayCameraStartupTillSDPGenerated, candidateNetworkPolicy);
        }

        public DeviceCallingServiceParamsBuilder buildVersion(String str) {
            this.buildVersion = str;
            return this;
        }

        public DeviceCallingServiceParamsBuilder builtInSpeakerPresent(boolean z) {
            this.builtInSpeakerPresent = z;
            return this;
        }

        public DeviceCallingServiceParamsBuilder cameraShutterPresent(boolean z) {
            this.cameraShutterPresent = z;
            return this;
        }

        public DeviceCallingServiceParamsBuilder candidateNetworkPolicy(CandidateNetworkPolicy candidateNetworkPolicy) {
            this.candidateNetworkPolicy$value = candidateNetworkPolicy;
            this.candidateNetworkPolicy$set = true;
            return this;
        }

        public DeviceCallingServiceParamsBuilder constraintVideoUntilIceConnection(boolean z) {
            this.constraintVideoUntilIceConnection = z;
            return this;
        }

        public DeviceCallingServiceParamsBuilder delayCameraStartupTillSDPGenerated(boolean z) {
            this.delayCameraStartupTillSDPGenerated = z;
            return this;
        }

        public DeviceCallingServiceParamsBuilder dynamicAcousticParamsConfigPath(DynamicAcousticParams.ConfigPath configPath) {
            this.dynamicAcousticParamsConfigPath = configPath;
            return this;
        }

        public DeviceCallingServiceParamsBuilder enableCameraMetricsReporting(boolean z) {
            this.enableCameraMetricsReporting = z;
            return this;
        }

        public DeviceCallingServiceParamsBuilder enableMediaCodecVideoDecoderFrameDropWorkaround(boolean z) {
            this.enableMediaCodecVideoDecoderFrameDropWorkaround$value = z;
            this.enableMediaCodecVideoDecoderFrameDropWorkaround$set = true;
            return this;
        }

        public DeviceCallingServiceParamsBuilder forceReceiveOnlyVideo(boolean z) {
            this.forceReceiveOnlyVideo = z;
            return this;
        }

        public DeviceCallingServiceParamsBuilder maxVideoConstraintsOnReducedResolution(VideoConstraints videoConstraints) {
            this.maxVideoConstraintsOnReducedResolution = videoConstraints;
            return this;
        }

        public DeviceCallingServiceParamsBuilder maxVideoConstraintsToRequestFromRemote(VideoConstraints videoConstraints) {
            this.maxVideoConstraintsToRequestFromRemote = videoConstraints;
            return this;
        }

        public DeviceCallingServiceParamsBuilder mediaParams(MediaParams mediaParams) {
            this.mediaParams = mediaParams;
            return this;
        }

        public DeviceCallingServiceParamsBuilder platformVoIPSelection(PlatformVoIPSelection platformVoIPSelection) {
            this.platformVoIPSelection = platformVoIPSelection;
            return this;
        }

        public DeviceCallingServiceParamsBuilder presencePublishCapable(boolean z) {
            this.presencePublishCapable = z;
            return this;
        }

        public DeviceCallingServiceParamsBuilder realTimeTextCapable(boolean z) {
            this.realTimeTextCapable = z;
            return this;
        }

        public DeviceCallingServiceParamsBuilder reduceVideoResolutionOnNoH264Remote(boolean z) {
            this.reduceVideoResolutionOnNoH264Remote = z;
            return this;
        }

        public DeviceCallingServiceParamsBuilder registrationHeaders(SipHeaders sipHeaders) {
            this.registrationHeaders = sipHeaders;
            return this;
        }

        public DeviceCallingServiceParamsBuilder relayOnlyIceTransport(boolean z) {
            this.relayOnlyIceTransport = z;
            return this;
        }

        public DeviceCallingServiceParamsBuilder renderRemoteVideoSupported(boolean z) {
            this.renderRemoteVideoSupported = z;
            return this;
        }

        public DeviceCallingServiceParamsBuilder requireCallAcknowledgement(boolean z) {
            this.requireCallAcknowledgement = z;
            return this;
        }

        public DeviceCallingServiceParamsBuilder screenShape(String str) {
            this.screenShape = str;
            return this;
        }

        public DeviceCallingServiceParamsBuilder screenSize(Size size) {
            this.screenSize = size;
            return this;
        }

        public DeviceCallingServiceParamsBuilder supportedVideoResolutions(Map<Integer, VideoConstraints> map) {
            this.supportedVideoResolutions = map;
            return this;
        }

        public String toString() {
            return "DeviceCallingServiceParams.DeviceCallingServiceParamsBuilder(acousticParams=" + this.acousticParams + ", avsDeviceFacade=" + this.avsDeviceFacade + ", requireCallAcknowledgement=" + this.requireCallAcknowledgement + ", relayOnlyIceTransport=" + this.relayOnlyIceTransport + ", reduceVideoResolutionOnNoH264Remote=" + this.reduceVideoResolutionOnNoH264Remote + ", maxVideoConstraintsOnReducedResolution=" + this.maxVideoConstraintsOnReducedResolution + ", constraintVideoUntilIceConnection=" + this.constraintVideoUntilIceConnection + ", videoConstraintsUntilIceConnection=" + this.videoConstraintsUntilIceConnection + ", audioStartBitrateInKbps=" + this.audioStartBitrateInKbps + ", registrationHeaders=" + this.registrationHeaders + ", mediaParams=" + this.mediaParams + ", webRTCFieldTrials=" + this.webRTCFieldTrials + ", videoConfiguration=" + this.videoConfiguration + ", supportedVideoResolutions=" + this.supportedVideoResolutions + ", maxVideoConstraintsToRequestFromRemote=" + this.maxVideoConstraintsToRequestFromRemote + ", webRTCStatsPollingFrequency=" + this.webRTCStatsPollingFrequency + ", webRTCStatsLoggingFrequency=" + this.webRTCStatsLoggingFrequency + ", webRTCAcousticEchoCancelerPreferred=" + this.webRTCAcousticEchoCancelerPreferred + ", audioCaptureAndRenderConfig=" + this.audioCaptureAndRenderConfig + ", builtInSpeakerPresent=" + this.builtInSpeakerPresent + ", cameraShutterPresent=" + this.cameraShutterPresent + ", renderRemoteVideoSupported=" + this.renderRemoteVideoSupported + ", forceReceiveOnlyVideo=" + this.forceReceiveOnlyVideo + ", buildVersion=" + this.buildVersion + ", screenShape=" + this.screenShape + ", screenSize=" + this.screenSize + ", presencePublishCapable=" + this.presencePublishCapable + ", userAgentStackVersionCodePrepend=" + this.userAgentStackVersionCodePrepend + ", userAgentStackVersionCode=" + this.userAgentStackVersionCode + ", useAlarmManagerAuthTokenManager=" + this.useAlarmManagerAuthTokenManager + ", dynamicAcousticParamsConfigPath=" + this.dynamicAcousticParamsConfigPath + ", realTimeTextCapable=" + this.realTimeTextCapable + ", enableCameraMetricsReporting=" + this.enableCameraMetricsReporting + ", waitForAcceptBeforeInitSDP=" + this.waitForAcceptBeforeInitSDP + ", videoFileInjectionPath=" + this.videoFileInjectionPath + ", platformVoIPSelection=" + this.platformVoIPSelection + ", useTextureViewForRendering$value=" + this.useTextureViewForRendering$value + ", videoCodecConfigInfoList=" + this.videoCodecConfigInfoList + ", videoCodecPredicate=" + this.videoCodecPredicate + ", enableMediaCodecVideoDecoderFrameDropWorkaround$value=" + this.enableMediaCodecVideoDecoderFrameDropWorkaround$value + ", usingReworkedCallCleanup$value=" + this.usingReworkedCallCleanup$value + ", translucentRemoteVideoRendererSupported$value=" + this.translucentRemoteVideoRendererSupported$value + ", delayCameraStartupTillSDPGenerated=" + this.delayCameraStartupTillSDPGenerated + ", candidateNetworkPolicy$value=" + this.candidateNetworkPolicy$value + MarkdownConstants.RIGHT_PARENTHESIS;
        }

        public DeviceCallingServiceParamsBuilder translucentRemoteVideoRendererSupported(boolean z) {
            this.translucentRemoteVideoRendererSupported$value = z;
            this.translucentRemoteVideoRendererSupported$set = true;
            return this;
        }

        public DeviceCallingServiceParamsBuilder useAlarmManagerAuthTokenManager(boolean z) {
            this.useAlarmManagerAuthTokenManager = z;
            return this;
        }

        public DeviceCallingServiceParamsBuilder useTextureViewForRendering(boolean z) {
            this.useTextureViewForRendering$value = z;
            this.useTextureViewForRendering$set = true;
            return this;
        }

        public DeviceCallingServiceParamsBuilder userAgentStackVersionCode(String str) {
            this.userAgentStackVersionCode = str;
            return this;
        }

        public DeviceCallingServiceParamsBuilder userAgentStackVersionCodePrepend(String str) {
            this.userAgentStackVersionCodePrepend = str;
            return this;
        }

        public DeviceCallingServiceParamsBuilder usingReworkedCallCleanup(boolean z) {
            this.usingReworkedCallCleanup$value = z;
            this.usingReworkedCallCleanup$set = true;
            return this;
        }

        public DeviceCallingServiceParamsBuilder videoCodecConfigInfoList(List<VideoCodecConfigInfo> list) {
            this.videoCodecConfigInfoList = list;
            return this;
        }

        public DeviceCallingServiceParamsBuilder videoCodecPredicate(Predicate<MediaCodecInfo> predicate) {
            this.videoCodecPredicate = predicate;
            return this;
        }

        public DeviceCallingServiceParamsBuilder videoConfiguration(VideoConfiguration videoConfiguration) {
            this.videoConfiguration = videoConfiguration;
            return this;
        }

        public DeviceCallingServiceParamsBuilder videoConstraintsUntilIceConnection(VideoConstraints videoConstraints) {
            this.videoConstraintsUntilIceConnection = videoConstraints;
            return this;
        }

        public DeviceCallingServiceParamsBuilder videoFileInjectionPath(String str) {
            this.videoFileInjectionPath = str;
            return this;
        }

        public DeviceCallingServiceParamsBuilder waitForAcceptBeforeInitSDP(boolean z) {
            this.waitForAcceptBeforeInitSDP = z;
            return this;
        }

        public DeviceCallingServiceParamsBuilder webRTCAcousticEchoCancelerPreferred(boolean z) {
            this.webRTCAcousticEchoCancelerPreferred = z;
            return this;
        }

        public DeviceCallingServiceParamsBuilder webRTCFieldTrials(String str) {
            this.webRTCFieldTrials = str;
            return this;
        }

        public DeviceCallingServiceParamsBuilder webRTCStatsLoggingFrequency(int i) {
            this.webRTCStatsLoggingFrequency = i;
            return this;
        }

        public DeviceCallingServiceParamsBuilder webRTCStatsPollingFrequency(int i) {
            this.webRTCStatsPollingFrequency = i;
            return this;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static CandidateNetworkPolicy $default$candidateNetworkPolicy() {
        return CandidateNetworkPolicy.ALL;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean $default$enableMediaCodecVideoDecoderFrameDropWorkaround() {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean $default$translucentRemoteVideoRendererSupported() {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean $default$useTextureViewForRendering() {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean $default$usingReworkedCallCleanup() {
        return false;
    }

    public DeviceCallingServiceParams(AcousticParams acousticParams, AvsDeviceFacade avsDeviceFacade, boolean z, boolean z2, boolean z3, VideoConstraints videoConstraints, boolean z4, VideoConstraints videoConstraints2, int i, SipHeaders sipHeaders, MediaParams mediaParams, String str, VideoConfiguration videoConfiguration, Map<Integer, VideoConstraints> map, VideoConstraints videoConstraints3, int i2, int i3, boolean z5, AudioConfig audioConfig, boolean z6, boolean z7, boolean z8, boolean z9, String str2, String str3, Size size, boolean z10, String str4, String str5, boolean z11, DynamicAcousticParams.ConfigPath configPath, boolean z12, boolean z13, boolean z14, String str6, PlatformVoIPSelection platformVoIPSelection, boolean z15, List<VideoCodecConfigInfo> list, Predicate<MediaCodecInfo> predicate, boolean z16, boolean z17, boolean z18, boolean z19, CandidateNetworkPolicy candidateNetworkPolicy) {
        this.acousticParams = acousticParams;
        this.avsDeviceFacade = avsDeviceFacade;
        this.requireCallAcknowledgement = z;
        this.relayOnlyIceTransport = z2;
        this.reduceVideoResolutionOnNoH264Remote = z3;
        this.maxVideoConstraintsOnReducedResolution = videoConstraints;
        this.constraintVideoUntilIceConnection = z4;
        this.videoConstraintsUntilIceConnection = videoConstraints2;
        this.audioStartBitrateInKbps = i;
        this.registrationHeaders = sipHeaders;
        this.mediaParams = mediaParams;
        this.webRTCFieldTrials = str;
        this.videoConfiguration = videoConfiguration;
        this.supportedVideoResolutions = map;
        this.maxVideoConstraintsToRequestFromRemote = videoConstraints3;
        this.webRTCStatsPollingFrequency = i2;
        this.webRTCStatsLoggingFrequency = i3;
        this.webRTCAcousticEchoCancelerPreferred = z5;
        this.audioCaptureAndRenderConfig = audioConfig;
        this.builtInSpeakerPresent = z6;
        this.cameraShutterPresent = z7;
        this.renderRemoteVideoSupported = z8;
        this.forceReceiveOnlyVideo = z9;
        this.buildVersion = str2;
        this.screenShape = str3;
        this.screenSize = size;
        this.presencePublishCapable = z10;
        this.userAgentStackVersionCodePrepend = str4;
        this.userAgentStackVersionCode = str5;
        this.useAlarmManagerAuthTokenManager = z11;
        this.dynamicAcousticParamsConfigPath = configPath;
        this.realTimeTextCapable = z12;
        this.enableCameraMetricsReporting = z13;
        this.waitForAcceptBeforeInitSDP = z14;
        this.videoFileInjectionPath = str6;
        this.platformVoIPSelection = platformVoIPSelection;
        this.useTextureViewForRendering = z15;
        this.videoCodecConfigInfoList = list;
        this.videoCodecPredicate = predicate;
        this.enableMediaCodecVideoDecoderFrameDropWorkaround = z16;
        this.usingReworkedCallCleanup = z17;
        this.translucentRemoteVideoRendererSupported = z18;
        this.delayCameraStartupTillSDPGenerated = z19;
        this.candidateNetworkPolicy = candidateNetworkPolicy;
    }

    public static DeviceCallingServiceParamsBuilder builder() {
        return new DeviceCallingServiceParamsBuilder();
    }

    public AcousticParams getAcousticParams() {
        return this.acousticParams;
    }

    public AudioConfig getAudioCaptureAndRenderConfig() {
        return this.audioCaptureAndRenderConfig;
    }

    public int getAudioStartBitrateInKbps() {
        return this.audioStartBitrateInKbps;
    }

    public AvsDeviceFacade getAvsDeviceFacade() {
        return this.avsDeviceFacade;
    }

    public String getBuildVersion() {
        return this.buildVersion;
    }

    public CandidateNetworkPolicy getCandidateNetworkPolicy() {
        return this.candidateNetworkPolicy;
    }

    public DynamicAcousticParams.ConfigPath getDynamicAcousticParamsConfigPath() {
        return this.dynamicAcousticParamsConfigPath;
    }

    public VideoConstraints getMaxVideoConstraintsOnReducedResolution() {
        return this.maxVideoConstraintsOnReducedResolution;
    }

    public VideoConstraints getMaxVideoConstraintsToRequestFromRemote() {
        return this.maxVideoConstraintsToRequestFromRemote;
    }

    public MediaParams getMediaParams() {
        return this.mediaParams;
    }

    public PlatformVoIPSelection getPlatformVoIPSelection() {
        return this.platformVoIPSelection;
    }

    public SipHeaders getRegistrationHeaders() {
        return this.registrationHeaders;
    }

    public String getScreenShape() {
        return this.screenShape;
    }

    public Size getScreenSize() {
        return this.screenSize;
    }

    public Map<Integer, VideoConstraints> getSupportedVideoResolutions() {
        return this.supportedVideoResolutions;
    }

    public String getUserAgentStackVersionCode() {
        return this.userAgentStackVersionCode;
    }

    public String getUserAgentStackVersionCodePrepend() {
        return this.userAgentStackVersionCodePrepend;
    }

    public List<VideoCodecConfigInfo> getVideoCodecConfigInfoList() {
        return this.videoCodecConfigInfoList;
    }

    public Predicate<MediaCodecInfo> getVideoCodecPredicate() {
        return this.videoCodecPredicate;
    }

    public VideoConfiguration getVideoConfiguration() {
        return this.videoConfiguration;
    }

    public VideoConstraints getVideoConstraintsUntilIceConnection() {
        return this.videoConstraintsUntilIceConnection;
    }

    public String getVideoFileInjectionPath() {
        return this.videoFileInjectionPath;
    }

    public String getWebRTCFieldTrials() {
        return this.webRTCFieldTrials;
    }

    public int getWebRTCStatsLoggingFrequency() {
        return this.webRTCStatsLoggingFrequency;
    }

    public int getWebRTCStatsPollingFrequency() {
        return this.webRTCStatsPollingFrequency;
    }

    public boolean isBuiltInSpeakerPresent() {
        return this.builtInSpeakerPresent;
    }

    public boolean isCameraShutterPresent() {
        return this.cameraShutterPresent;
    }

    public boolean isConstraintVideoUntilIceConnection() {
        return this.constraintVideoUntilIceConnection;
    }

    public boolean isDelayCameraStartupTillSDPGenerated() {
        return this.delayCameraStartupTillSDPGenerated;
    }

    public boolean isEnableCameraMetricsReporting() {
        return this.enableCameraMetricsReporting;
    }

    public boolean isEnableMediaCodecVideoDecoderFrameDropWorkaround() {
        return this.enableMediaCodecVideoDecoderFrameDropWorkaround;
    }

    public boolean isForceReceiveOnlyVideo() {
        return this.forceReceiveOnlyVideo;
    }

    public boolean isPresencePublishCapable() {
        return this.presencePublishCapable;
    }

    public boolean isRealTimeTextCapable() {
        return this.realTimeTextCapable;
    }

    public boolean isReduceVideoResolutionOnNoH264Remote() {
        return this.reduceVideoResolutionOnNoH264Remote;
    }

    public boolean isRelayOnlyIceTransport() {
        return this.relayOnlyIceTransport;
    }

    public boolean isRenderRemoteVideoSupported() {
        return this.renderRemoteVideoSupported;
    }

    public boolean isRequireCallAcknowledgement() {
        return this.requireCallAcknowledgement;
    }

    public boolean isTranslucentRemoteVideoRendererSupported() {
        return this.translucentRemoteVideoRendererSupported;
    }

    public boolean isUseAlarmManagerAuthTokenManager() {
        return this.useAlarmManagerAuthTokenManager;
    }

    public boolean isUseTextureViewForRendering() {
        return this.useTextureViewForRendering;
    }

    public boolean isUsingReworkedCallCleanup() {
        return this.usingReworkedCallCleanup;
    }

    public boolean isWaitForAcceptBeforeInitSDP() {
        return this.waitForAcceptBeforeInitSDP;
    }

    public boolean isWebRTCAcousticEchoCancelerPreferred() {
        return this.webRTCAcousticEchoCancelerPreferred;
    }

    public void setAudioStartBitrateInKbps(int i) {
        this.audioStartBitrateInKbps = i;
    }
}
