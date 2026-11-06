package com.amazon.alexa.ra.core.data.network;

import java.util.Map;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0006\u001a\u0004\u0018\u00010\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u001e\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\f0\u000bX¦\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000e\u0082\u0001\u0002\u000f\u0010¨\u0006\u0011À\u0006\u0003"}, d2 = {"Lcom/amazon/alexa/ra/core/data/network/RaApiResponse;", "", "statusCode", "", "getStatusCode", "()I", "body", "Lcom/amazon/alexa/ra/core/data/network/RaApiResponseBody;", "getBody", "()Lcom/amazon/alexa/ra/core/data/network/RaApiResponseBody;", "headers", "", "", "getHeaders", "()Ljava/util/Map;", "Lcom/amazon/alexa/ra/core/data/network/RaApiErrorResponse;", "Lcom/amazon/alexa/ra/core/data/network/RaApiSuccessResponse;", "ui-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes18.dex */
public interface RaApiResponse {
    @Nullable
    RaApiResponseBody getBody();

    @NotNull
    Map<String, String> getHeaders();

    int getStatusCode();
}
