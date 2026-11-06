package com.bugsnag.android;

import com.amazon.deecomms.common.metrics.MetricKeys;
import java.util.Map;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\b\u0006\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0014\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0005¢\u0006\u0002\u0010\u0006R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u001f\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/bugsnag/android/DeliveryParams;", "", MetricKeys.META_ENDPOINT, "", "headers", "", "(Ljava/lang/String;Ljava/util/Map;)V", "getEndpoint", "()Ljava/lang/String;", "getHeaders", "()Ljava/util/Map;", "bugsnag-android-core_release"}, k = 1, mv = {1, 4, 2})
/* loaded from: classes6.dex */
public final class DeliveryParams {

    @NotNull
    private final String endpoint;

    @NotNull
    private final Map<String, String> headers;

    public DeliveryParams(@NotNull String str, @NotNull Map<String, String> map) {
        str.getClass();
        map.getClass();
        this.endpoint = str;
        this.headers = map;
    }

    @NotNull
    public final String getEndpoint() {
        return this.endpoint;
    }

    @NotNull
    public final Map<String, String> getHeaders() {
        return this.headers;
    }
}
