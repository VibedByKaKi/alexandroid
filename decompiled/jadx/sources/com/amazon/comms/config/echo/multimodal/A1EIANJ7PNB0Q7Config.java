package com.amazon.comms.config.echo.multimodal;

import com.amazon.alexa.client.alexaservice.audio.core.VolumeCalculatingInputStream;
import com.amazon.comms.calling.service.VideoCodecConfigInfo;
import com.amazon.comms.calling.service.VideoConstraints;
import com.amazon.comms.calling.service.VideoEncoderBitrateAdjustmentType;
import com.amazon.comms.config.util.VideoCodecConfigInfoUtil;
import com.amazon.credentiallocker.CredentialConfig$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import org.joda.time.DateTimeConstants;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class A1EIANJ7PNB0Q7Config extends A1Z88NGR2BK6A2Config {
    private static final String WEBRTC_FIELD_TRIALS = "WebRTC-Rfc5389StunRetransmissions/Enabled/VideoFrameEmit/Enabled/WebRTC-LegacyTlsProtocols/Enabled/";
    private static A1EIANJ7PNB0Q7Config a1EIANJ7PNB0Q7Config;
    private static final Map<Integer, VideoConstraints> supportedVideoConstraints;

    static {
        TreeMap treeMap = new TreeMap();
        CredentialConfig$$ExternalSyntheticOutline0.m(640, 360, 24, treeMap, (Integer) 21600);
        CredentialConfig$$ExternalSyntheticOutline0.m(640, 360, 30, treeMap, (Integer) 27600);
        CredentialConfig$$ExternalSyntheticOutline0.m(VolumeCalculatingInputStream.BUFFER_SIZE_IN_BYTES, 540, 24, treeMap, (Integer) 48600);
        CredentialConfig$$ExternalSyntheticOutline0.m(VolumeCalculatingInputStream.BUFFER_SIZE_IN_BYTES, 540, 30, treeMap, (Integer) 61200);
        CredentialConfig$$ExternalSyntheticOutline0.m(1280, 720, 24, treeMap, Integer.valueOf(DateTimeConstants.SECONDS_PER_DAY));
        CredentialConfig$$ExternalSyntheticOutline0.m(1280, 720, 30, treeMap, (Integer) 108000);
        supportedVideoConstraints = Collections.unmodifiableMap(treeMap);
        a1EIANJ7PNB0Q7Config = new A1EIANJ7PNB0Q7Config();
    }

    public static A1EIANJ7PNB0Q7Config getDeviceConfigInstance() {
        return a1EIANJ7PNB0Q7Config;
    }

    @Override // com.amazon.comms.config.base.MultiModalConfig, com.amazon.comms.config.DeviceConfig
    public Map<Integer, VideoConstraints> getSupportedResolutions() {
        return supportedVideoConstraints;
    }

    @Override // com.amazon.comms.config.echo.multimodal.A1Z88NGR2BK6A2Config, com.amazon.comms.config.DeviceConfig
    public List<VideoCodecConfigInfo> getVideoCodecConfigInfoList() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(VideoCodecConfigInfoUtil.buildAmlogicH264VideoCodecConfigInfo(VideoEncoderBitrateAdjustmentType.FRAMERATE_ADJUSTMENT));
        return arrayList;
    }

    @Override // com.amazon.comms.config.echo.multimodal.A1Z88NGR2BK6A2Config, com.amazon.comms.config.DeviceConfig
    public String getWebRTCFieldTrials() {
        return WEBRTC_FIELD_TRIALS;
    }

    @Override // com.amazon.comms.config.DeviceConfig
    public boolean isPipSwitchSupported() {
        return true;
    }

    @Override // com.amazon.comms.config.DeviceConfig
    public boolean isSmartMotionTrackingSupported() {
        return true;
    }

    @Override // com.amazon.comms.config.echo.multimodal.A1Z88NGR2BK6A2Config, com.amazon.comms.config.DeviceConfig
    public boolean loadWeblabCommsFeaturesThroughSubProcess() {
        return true;
    }

    @Override // com.amazon.comms.config.echo.multimodal.A1Z88NGR2BK6A2Config, com.amazon.comms.config.DeviceConfig
    public boolean preferCamera1API() {
        return false;
    }

    @Override // com.amazon.comms.config.echo.multimodal.A1Z88NGR2BK6A2Config, com.amazon.comms.config.DeviceConfig
    public boolean updateCameraHalFramerateAllowed() {
        return false;
    }
}
