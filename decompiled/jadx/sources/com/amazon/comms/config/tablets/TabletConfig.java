package com.amazon.comms.config.tablets;

import android.content.Context;
import com.amazon.comms.calling.service.VideoCodecConfigInfo;
import com.amazon.comms.calling.service.VideoEncoderBitrateAdjustmentType;
import com.amazon.comms.config.base.MultiModalConfig;
import com.amazon.comms.config.util.DeviceConfigConstants;
import com.amazon.comms.config.util.SimJobScheduler;
import com.amazon.comms.config.util.VideoCodecConfigInfoUtil;
import com.amazon.comms.policy.CallingServiceRuntimePolicy;
import java.util.ArrayList;
import java.util.List;
import okio.Buffer$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class TabletConfig extends MultiModalConfig {
    private static final String WEBRTC_FIELD_TRIALS = "WebRTC-Rfc5389StunRetransmissions/Enabled/WebRTC-LegacyTlsProtocols/Enabled/";
    private static TabletConfig tabletConfig = new TabletConfig();

    public static TabletConfig getDeviceConfigInstance() {
        return tabletConfig;
    }

    @Override // com.amazon.comms.config.DeviceConfig
    public boolean acceptPresenceBroadcast() {
        return false;
    }

    @Override // com.amazon.comms.config.DeviceConfig
    public SimJobScheduler getJobScheduler(Context context) {
        try {
            return (SimJobScheduler) Class.forName(DeviceConfigConstants.DEVICE_JOBSCHEDULER_IMPL_MULTIMODALTACHYONARM).newInstance();
        } catch (Exception e) {
            Buffer$$ExternalSyntheticBUOutline0.m((Throwable) e);
            return null;
        }
    }

    @Override // com.amazon.comms.config.DeviceConfig
    public synchronized CallingServiceRuntimePolicy getRuntimePolicy(Context context) {
        try {
            try {
                if (this.runtimePolicy == null) {
                    this.runtimePolicy = (CallingServiceRuntimePolicy) Class.forName(DeviceConfigConstants.SLIMFAST_RUNTIME_POLICY).getDeclaredConstructor(Context.class).newInstance(context);
                }
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.runtimePolicy;
    }

    @Override // com.amazon.comms.config.DeviceConfig
    public List<VideoCodecConfigInfo> getVideoCodecConfigInfoList() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(VideoCodecConfigInfoUtil.buildMTKH264VideoCodecConfigInfo(VideoEncoderBitrateAdjustmentType.FRAMERATE_ADJUSTMENT));
        return arrayList;
    }

    @Override // com.amazon.comms.config.DeviceConfig
    public int getVideoFps() {
        return 24;
    }

    @Override // com.amazon.comms.config.DeviceConfig
    public int getVideoHeight() {
        return 480;
    }

    @Override // com.amazon.comms.config.DeviceConfig
    public int getVideoMaxBitrate() {
        return 1000;
    }

    @Override // com.amazon.comms.config.DeviceConfig
    public int getVideoStartBitrate() {
        return 800;
    }

    @Override // com.amazon.comms.config.DeviceConfig
    public int getVideoWidth() {
        return 640;
    }

    @Override // com.amazon.comms.config.DeviceConfig
    public String getWebRTCFieldTrials() {
        return WEBRTC_FIELD_TRIALS;
    }

    @Override // com.amazon.comms.config.DeviceConfig
    public boolean ignoreCameraEvictionError() {
        return true;
    }

    @Override // com.amazon.comms.config.base.MultiModalConfig, com.amazon.comms.config.DeviceConfig
    public boolean isBackgroundFloatingPIPCapable() {
        return false;
    }

    @Override // com.amazon.comms.config.DeviceConfig
    public boolean preferCamera1API() {
        return false;
    }

    @Override // com.amazon.comms.config.DeviceConfig
    public boolean shouldEnableAMZNBAudioFilter() {
        return false;
    }

    @Override // com.amazon.comms.config.DeviceConfig
    public boolean shouldPersistSimDeviceContext() {
        return false;
    }

    @Override // com.amazon.comms.config.DeviceConfig
    public boolean simulateFirstFrameReceived() {
        return true;
    }

    @Override // com.amazon.comms.config.base.MultiModalConfig, com.amazon.comms.config.DeviceConfig
    public boolean supportsCallReconnection() {
        return false;
    }

    @Override // com.amazon.comms.config.DeviceConfig
    public boolean supportsHints() {
        return true;
    }

    @Override // com.amazon.comms.config.base.MultiModalConfig, com.amazon.comms.config.DeviceConfig
    public boolean waitForAcceptBeforeSettingSDP() {
        return true;
    }
}
