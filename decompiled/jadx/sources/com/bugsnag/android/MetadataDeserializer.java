package com.bugsnag.android;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
class MetadataDeserializer implements MapDeserializer<Metadata> {
    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.bugsnag.android.MapDeserializer
    public Metadata deserialize(Map<String, Object> map) {
        return new Metadata(new ConcurrentHashMap(map));
    }

    @Override // com.bugsnag.android.MapDeserializer
    public /* bridge */ /* synthetic */ Metadata deserialize(Map map) {
        return deserialize((Map<String, Object>) map);
    }
}
