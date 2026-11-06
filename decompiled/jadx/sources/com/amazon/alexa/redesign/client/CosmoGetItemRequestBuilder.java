package com.amazon.alexa.redesign.client;

import android.net.Uri;
import androidx.compose.runtime.internal.StabilityInferred;
import com.amazon.alexa.identity.api.IdentityService;
import com.dee.app.http.CoralService;
import java.util.UUID;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000e\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tJ\u0016\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\tR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/amazon/alexa/redesign/client/CosmoGetItemRequestBuilder;", "", "identityService", "Lcom/amazon/alexa/identity/api/IdentityService;", "<init>", "(Lcom/amazon/alexa/identity/api/IdentityService;)V", "buildUri", "Landroid/net/Uri;", "itemId", "", "buildCoralRequest", "Lcom/dee/app/http/CoralService$Request;", "coralService", "Lcom/dee/app/http/CoralService;", "url", "AlexaMobileAndroidHomeChannel_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes19.dex */
public final class CosmoGetItemRequestBuilder {
    public static final int $stable = 8;

    @NotNull
    private final IdentityService identityService;

    public CosmoGetItemRequestBuilder(@NotNull IdentityService identityService) {
        identityService.getClass();
        this.identityService = identityService;
    }

    @NotNull
    public final CoralService.Request buildCoralRequest(@NotNull CoralService coralService, @NotNull String url) {
        String accessTokenForPerson;
        coralService.getClass();
        url.getClass();
        CoralService.Request withHeader = coralService.request(url).withHeader("Accept", "application/json").withHeader("x-amzn-channel-id", "MOBILE").withHeader("X-Amzn-RequestId", UUID.randomUUID().toString());
        if (this.identityService.isAuthenticated("CosmoServiceClient") && (accessTokenForPerson = this.identityService.getAccessTokenForPerson("CosmoServiceClient")) != null && accessTokenForPerson.length() != 0) {
            withHeader.withHeader("Authorization", "Bearer " + accessTokenForPerson);
        }
        withHeader.getClass();
        return withHeader;
    }

    @NotNull
    public final Uri buildUri(@NotNull String itemId) {
        itemId.getClass();
        Uri build = new Uri.Builder().scheme("https").authority(Endpoint.INSTANCE.cosmoBaseUrl()).appendEncodedPath("v1/surfaces/items/" + itemId).build();
        build.getClass();
        return build;
    }
}
