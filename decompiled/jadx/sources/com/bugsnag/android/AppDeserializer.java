package com.bugsnag.android;

import java.util.Map;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
class AppDeserializer implements MapDeserializer<AppWithState> {
    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.bugsnag.android.MapDeserializer
    public AppWithState deserialize(Map<String, Object> map) {
        return new AppWithState((String) MapUtils.getOrNull(map, "binaryArch"), (String) MapUtils.getOrNull(map, "id"), (String) MapUtils.getOrNull(map, "releaseStage"), (String) MapUtils.getOrNull(map, "version"), (String) MapUtils.getOrNull(map, "codeBundleId"), (String) MapUtils.getOrNull(map, "buildUuid"), (String) MapUtils.getOrNull(map, "type"), (Number) MapUtils.getOrNull(map, "versionCode"), (Number) MapUtils.getOrNull(map, "duration"), (Number) MapUtils.getOrNull(map, "durationInForeground"), (Boolean) MapUtils.getOrNull(map, "inForeground"), (Boolean) MapUtils.getOrNull(map, "isLaunching"));
    }

    @Override // com.bugsnag.android.MapDeserializer
    public /* bridge */ /* synthetic */ AppWithState deserialize(Map map) {
        return deserialize((Map<String, Object>) map);
    }
}
