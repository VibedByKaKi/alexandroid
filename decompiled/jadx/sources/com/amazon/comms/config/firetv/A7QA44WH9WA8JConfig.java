package com.amazon.comms.config.firetv;

import com.amazon.comms.calling.service.VideoCodecConfigInfo;
import com.amazon.comms.calling.service.VideoEncoderBitrateAdjustmentType;
import com.amazon.comms.config.util.VideoCodecConfigInfoUtil;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class A7QA44WH9WA8JConfig extends FireTVEditionsConfig {
    private static A7QA44WH9WA8JConfig a7QA44WH9WA8JConfig = new A7QA44WH9WA8JConfig();

    public static A7QA44WH9WA8JConfig getDeviceConfigInstance() {
        return a7QA44WH9WA8JConfig;
    }

    @Override // com.amazon.comms.config.firetv.FireTVEditionsConfig, com.amazon.comms.config.DeviceConfig
    public List<VideoCodecConfigInfo> getVideoCodecConfigInfoList() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(VideoCodecConfigInfoUtil.buildMTKH264VideoCodecConfigInfo(VideoEncoderBitrateAdjustmentType.NO_ADJUSTMENT));
        return arrayList;
    }
}
