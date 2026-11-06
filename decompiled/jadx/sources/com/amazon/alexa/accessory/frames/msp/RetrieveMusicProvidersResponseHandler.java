package com.amazon.alexa.accessory.frames.msp;

import com.amazon.alexa.accessory.frames.msp.models.SkillDisplayMetadata;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import okhttp3.Response;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes15.dex */
public interface RetrieveMusicProvidersResponseHandler {
    void handleRetrieveMusicProvidersFailedResponse(Response response, CompletableFuture<List<SkillDisplayMetadata>> completableFuture);

    void handleRetrieveMusicProvidersSucceedResponse(Response response, CompletableFuture<List<SkillDisplayMetadata>> completableFuture);
}
