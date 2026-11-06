package com.amazon.comms.config.echo.multimodal;

import com.amazon.comms.calling.service.VideoCodecConfigInfo;
import com.amazon.comms.calling.service.VideoEncoderBitrateAdjustmentType;
import com.amazon.comms.config.util.VideoCodecConfigInfoUtil;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class AK0S5GURWA3ZSConfig extends AQ24620N8QD5QConfig {
    private static AK0S5GURWA3ZSConfig aK0S5GURWA3ZSConfig = new AK0S5GURWA3ZSConfig();

    public static AK0S5GURWA3ZSConfig getDeviceConfigInstance() {
        return aK0S5GURWA3ZSConfig;
    }

    @Override // com.amazon.comms.config.DeviceConfig
    public boolean enableMediaCodecVideoDecoderFrameDropWorkaround() {
        return true;
    }

    @Override // com.amazon.comms.config.echo.multimodal.A1EIANJ7PNB0Q7Config, com.amazon.comms.config.echo.multimodal.A1Z88NGR2BK6A2Config, com.amazon.comms.config.DeviceConfig
    public List<VideoCodecConfigInfo> getVideoCodecConfigInfoList() {
        ArrayList arrayList = new ArrayList();
        VideoEncoderBitrateAdjustmentType videoEncoderBitrateAdjustmentType = VideoEncoderBitrateAdjustmentType.FRAMERATE_ADJUSTMENT;
        VideoCodecConfigInfo buildC2MTKH264VideoCodecConfigInfo = VideoCodecConfigInfoUtil.buildC2MTKH264VideoCodecConfigInfo(videoEncoderBitrateAdjustmentType);
        VideoCodecConfigInfo buildMTKH264VideoCodecConfigInfo = VideoCodecConfigInfoUtil.buildMTKH264VideoCodecConfigInfo(videoEncoderBitrateAdjustmentType);
        arrayList.add(buildC2MTKH264VideoCodecConfigInfo);
        arrayList.add(buildMTKH264VideoCodecConfigInfo);
        return arrayList;
    }

    @Override // com.amazon.comms.config.DeviceConfig
    public boolean supportBackgroundFloatingPIPForAllUsers() {
        return true;
    }
}
