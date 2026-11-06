package com.amazon.comms.config.tablets;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class HDTabletConfig extends TabletConfig {
    private static final String WEBRTC_FIELD_TRIALS = "WebRTC-Rfc5389StunRetransmissions/Enabled/VideoFrameEmit/Enabled/WebRTC-LegacyTlsProtocols/Enabled/";
    private static HDTabletConfig hDTabletConfig = new HDTabletConfig();

    public static HDTabletConfig getDeviceConfigInstance() {
        return hDTabletConfig;
    }

    @Override // com.amazon.comms.config.tablets.TabletConfig, com.amazon.comms.config.DeviceConfig
    public int getVideoFps() {
        return 30;
    }

    @Override // com.amazon.comms.config.tablets.TabletConfig, com.amazon.comms.config.DeviceConfig
    public int getVideoHeight() {
        return 720;
    }

    @Override // com.amazon.comms.config.tablets.TabletConfig, com.amazon.comms.config.DeviceConfig
    public int getVideoMaxBitrate() {
        return 2000;
    }

    @Override // com.amazon.comms.config.tablets.TabletConfig, com.amazon.comms.config.DeviceConfig
    public int getVideoStartBitrate() {
        return 900;
    }

    @Override // com.amazon.comms.config.tablets.TabletConfig, com.amazon.comms.config.DeviceConfig
    public int getVideoWidth() {
        return 1280;
    }

    @Override // com.amazon.comms.config.tablets.TabletConfig, com.amazon.comms.config.DeviceConfig
    public String getWebRTCFieldTrials() {
        return WEBRTC_FIELD_TRIALS;
    }
}
