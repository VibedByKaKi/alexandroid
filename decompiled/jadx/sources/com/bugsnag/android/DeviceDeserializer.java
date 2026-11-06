package com.bugsnag.android;

import com.bugsnag.android.internal.DateUtils;
import com.mapbox.maps.plugin.locationcomponent.ModelSourceWrapper;
import java.util.Map;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
class DeviceDeserializer implements MapDeserializer<DeviceWithState> {
    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.bugsnag.android.MapDeserializer
    public DeviceWithState deserialize(Map<String, Object> map) {
        DeviceBuildInfo deviceBuildInfo = new DeviceBuildInfo((String) MapUtils.getOrNull(map, "manufacturer"), (String) MapUtils.getOrNull(map, "model"), (String) MapUtils.getOrNull(map, "osVersion"), MapUtils.getInt(map, "apiLevel"), (String) MapUtils.getOrNull(map, "osBuild"), (String) MapUtils.getOrNull(map, "fingerprint"), (String) MapUtils.getOrNull(map, "tags"), (String) MapUtils.getOrNull(map, "brand"), (String[]) MapUtils.getOrNull(map, "cpuAbis"));
        String str = (String) MapUtils.getOrNull(map, "time");
        return new DeviceWithState(deviceBuildInfo, (Boolean) MapUtils.getOrNull(map, "jailbroken"), (String) MapUtils.getOrNull(map, "id"), (String) MapUtils.getOrNull(map, "locale"), MapUtils.getLong(map, "totalMemory"), (Map) MapUtils.getOrNull(map, "runtimeVersions"), MapUtils.getLong(map, "freeDisk"), MapUtils.getLong(map, "freeMemory"), (String) MapUtils.getOrNull(map, ModelSourceWrapper.ORIENTATION), str != null ? DateUtils.fromIso8601(str) : null);
    }

    @Override // com.bugsnag.android.MapDeserializer
    public /* bridge */ /* synthetic */ DeviceWithState deserialize(Map map) {
        return deserialize((Map<String, Object>) map);
    }
}
