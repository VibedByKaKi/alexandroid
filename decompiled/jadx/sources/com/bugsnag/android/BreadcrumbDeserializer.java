package com.bugsnag.android;

import com.bugsnag.android.internal.DateUtils;
import java.util.Locale;
import java.util.Map;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
class BreadcrumbDeserializer implements MapDeserializer<Breadcrumb> {
    private final Logger logger;

    public BreadcrumbDeserializer(Logger logger) {
        this.logger = logger;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.bugsnag.android.MapDeserializer
    public Breadcrumb deserialize(Map<String, Object> map) {
        return new Breadcrumb((String) MapUtils.getOrThrow(map, "message"), BreadcrumbType.valueOf(((String) MapUtils.getOrThrow(map, "type")).toUpperCase(Locale.US)), (Map) MapUtils.getOrNull(map, "metadata"), DateUtils.fromIso8601((String) MapUtils.getOrThrow(map, "timestamp")), this.logger);
    }

    @Override // com.bugsnag.android.MapDeserializer
    public /* bridge */ /* synthetic */ Breadcrumb deserialize(Map map) {
        return deserialize((Map<String, Object>) map);
    }
}
