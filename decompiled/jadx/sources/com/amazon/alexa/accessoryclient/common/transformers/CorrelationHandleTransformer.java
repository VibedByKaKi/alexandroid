package com.amazon.alexa.accessoryclient.common.transformers;

import android.os.Bundle;
import com.dee.app.metrics.MetricsConstants;
import kotlin.Metadata;
import kotlin.text.Charsets;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0004J\u001e\u0010\b\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u0004¨\u0006\u000b"}, d2 = {"Lcom/amazon/alexa/accessoryclient/common/transformers/CorrelationHandleTransformer;", "", "()V", MetricsConstants.Method.CACHE_GET, "", "bundle", "Landroid/os/Bundle;", "key", MetricsConstants.Method.CACHE_PUT, "", "handle", "AlexaAccessoryAndroidClient_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class CorrelationHandleTransformer {

    @NotNull
    public static final CorrelationHandleTransformer INSTANCE = new CorrelationHandleTransformer();

    private CorrelationHandleTransformer() {
    }

    @NotNull
    public final String get(@NotNull Bundle bundle, @NotNull String key) {
        bundle.getClass();
        key.getClass();
        byte[] byteArray = bundle.getByteArray(key);
        byteArray.getClass();
        return new String(byteArray, Charsets.UTF_8);
    }

    public final void put(@NotNull Bundle bundle, @NotNull String key, @NotNull String handle) {
        bundle.getClass();
        key.getClass();
        handle.getClass();
        byte[] bytes = handle.getBytes(Charsets.UTF_8);
        bytes.getClass();
        bundle.putByteArray(key, bytes);
    }
}
