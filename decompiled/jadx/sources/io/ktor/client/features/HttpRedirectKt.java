package io.ktor.client.features;

import io.ktor.http.HttpStatusCode;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0002¨\u0006\u0003"}, d2 = {"isRedirect", "", "Lio/ktor/http/HttpStatusCode;", "ktor-client-core"}, k = 2, mv = {1, 1, 13})
/* loaded from: classes9.dex */
public final class HttpRedirectKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean isRedirect(@NotNull HttpStatusCode httpStatusCode) {
        int value = httpStatusCode.getValue();
        HttpStatusCode.Companion companion = HttpStatusCode.INSTANCE;
        return value == companion.getMovedPermanently().getValue() || value == companion.getFound().getValue() || value == companion.getTemporaryRedirect().getValue() || value == companion.getPermanentRedirect().getValue();
    }
}
