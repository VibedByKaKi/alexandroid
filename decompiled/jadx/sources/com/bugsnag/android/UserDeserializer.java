package com.bugsnag.android;

import java.util.Map;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
class UserDeserializer implements MapDeserializer<User> {
    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.bugsnag.android.MapDeserializer
    public User deserialize(Map<String, Object> map) {
        return new User((String) MapUtils.getOrNull(map, "id"), (String) MapUtils.getOrNull(map, "email"), (String) MapUtils.getOrNull(map, "name"));
    }

    @Override // com.bugsnag.android.MapDeserializer
    public /* bridge */ /* synthetic */ User deserialize(Map map) {
        return deserialize((Map<String, Object>) map);
    }
}
