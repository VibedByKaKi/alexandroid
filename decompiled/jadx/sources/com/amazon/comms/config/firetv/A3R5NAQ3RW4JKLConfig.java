package com.amazon.comms.config.firetv;

import com.amazon.comms.calling.service.VideoCodecConfigInfo;
import com.amazon.comms.calling.service.VideoEncoderBitrateAdjustmentType;
import com.amazon.comms.config.util.VideoCodecConfigInfoUtil;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class A3R5NAQ3RW4JKLConfig extends FireTVEditionsConfig {
    private static A3R5NAQ3RW4JKLConfig a3R5NAQ3RW4JKLConfig = new A3R5NAQ3RW4JKLConfig();

    private A3R5NAQ3RW4JKLConfig() {
    }

    public static A3R5NAQ3RW4JKLConfig getDeviceConfigInstance() {
        return a3R5NAQ3RW4JKLConfig;
    }

    @Override // com.amazon.comms.config.firetv.FireTVEditionsConfig, com.amazon.comms.config.DeviceConfig
    public List<VideoCodecConfigInfo> getVideoCodecConfigInfoList() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(VideoCodecConfigInfoUtil.buildAmlogicH264VideoCodecConfigInfo(VideoEncoderBitrateAdjustmentType.FRAMERATE_ADJUSTMENT));
        return arrayList;
    }
}
