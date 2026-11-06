package com.bugsnag.android;

import com.dee.app.metrics.MetricsConstants;
import java.util.Map;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
class StackframeDeserializer implements MapDeserializer<Stackframe> {
    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.bugsnag.android.MapDeserializer
    public Stackframe deserialize(Map<String, Object> map) {
        return new Stackframe((String) MapUtils.getOrNull(map, MetricsConstants.NativeFetch.METHOD), (String) MapUtils.getOrNull(map, "file"), (Number) MapUtils.getOrNull(map, "lineNumber"), (Boolean) MapUtils.getOrNull(map, "inProject"), (Map) MapUtils.getOrNull(map, "code"), (Number) MapUtils.getOrNull(map, "columnNumber"));
    }

    @Override // com.bugsnag.android.MapDeserializer
    public /* bridge */ /* synthetic */ Stackframe deserialize(Map map) {
        return deserialize((Map<String, Object>) map);
    }
}
