package com.amazon.alexa.redesign.client;

import kotlin.Metadata;
import kotlin.text.StringsKt;
import okhttp3.Response;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002¨\u0006\u0003"}, d2 = {"headersContentLength", "", "Lokhttp3/Response;", "AlexaMobileAndroidHomeChannel_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes19.dex */
public final class HomeFeedServiceClientKt {
    public static final long headersContentLength(@NotNull Response response) {
        Long longOrNull;
        response.getClass();
        String header$default = Response.header$default(response, "Content-Length", null, 2, null);
        if (header$default == null || (longOrNull = StringsKt.toLongOrNull(header$default)) == null) {
            return -1L;
        }
        return longOrNull.longValue();
    }
}
