package com.amazon.alexa.redesign.client;

import android.net.Uri;
import androidx.compose.runtime.internal.StabilityInferred;
import com.amazon.alexa.identity.api.IdentityService;
import com.amazon.alexa.redesign.entity.cosmo.ListParams;
import com.amazon.deecomms.nativemodules.util.ReactBridgeSerializer;
import com.dee.app.http.CoralService;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000e\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tJ\u001e\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\b\u001a\u00020\tR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/amazon/alexa/redesign/client/CosmoListCardsRequestBuilder;", "", "identityService", "Lcom/amazon/alexa/identity/api/IdentityService;", "<init>", "(Lcom/amazon/alexa/identity/api/IdentityService;)V", "buildUri", "Landroid/net/Uri;", "listParams", "Lcom/amazon/alexa/redesign/entity/cosmo/ListParams;", "buildCoralRequest", "Lcom/dee/app/http/CoralService$Request;", "coralService", "Lcom/dee/app/http/CoralService;", "url", "", "AlexaMobileAndroidHomeChannel_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nCosmoServiceClient.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CosmoServiceClient.kt\ncom/amazon/alexa/redesign/client/CosmoListCardsRequestBuilder\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,648:1\n1863#2,2:649\n1863#2,2:651\n1863#2,2:653\n*S KotlinDebug\n*F\n+ 1 CosmoServiceClient.kt\ncom/amazon/alexa/redesign/client/CosmoListCardsRequestBuilder\n*L\n44#1:649,2\n47#1:651,2\n50#1:653,2\n*E\n"})
/* loaded from: classes19.dex */
public final class CosmoListCardsRequestBuilder {
    public static final int $stable = 8;

    @NotNull
    private final IdentityService identityService;

    public CosmoListCardsRequestBuilder(@NotNull IdentityService identityService) {
        identityService.getClass();
        this.identityService = identityService;
    }

    @NotNull
    public final CoralService.Request buildCoralRequest(@NotNull CoralService coralService, @NotNull String url, @NotNull ListParams listParams) {
        String accessTokenForPerson;
        coralService.getClass();
        url.getClass();
        listParams.getClass();
        CoralService.Request withHeader = coralService.request(url).withHeader("Accept", "application/json").withHeader("x-amzn-channel-id", "MOBILE").withHeader("X-Amzn-RequestId", UUID.randomUUID().toString());
        if (this.identityService.isAuthenticated("CosmoServiceClient") && (accessTokenForPerson = this.identityService.getAccessTokenForPerson("CosmoServiceClient")) != null && accessTokenForPerson.length() != 0) {
            withHeader.withHeader("Authorization", "Bearer " + accessTokenForPerson);
        }
        withHeader.getClass();
        return withHeader;
    }

    @NotNull
    public final Uri buildUri(@NotNull ListParams listParams) {
        listParams.getClass();
        Uri.Builder appendEncodedPath = new Uri.Builder().scheme("https").authority(Endpoint.INSTANCE.cosmoBaseUrl()).appendEncodedPath("v1/surfaces/card-studio/items");
        appendEncodedPath.appendQueryParameter("reason", listParams.getReason());
        List<String> status = listParams.getStatus();
        if (status != null) {
            Iterator<T> it2 = status.iterator();
            while (it2.hasNext()) {
                appendEncodedPath.appendQueryParameter("status", (String) it2.next());
            }
        }
        List<String> tag = listParams.getTag();
        if (tag != null) {
            Iterator<T> it3 = tag.iterator();
            while (it3.hasNext()) {
                appendEncodedPath.appendQueryParameter("tag", (String) it3.next());
            }
        }
        List<String> kind = listParams.getKind();
        if (kind != null) {
            Iterator<T> it4 = kind.iterator();
            while (it4.hasNext()) {
                appendEncodedPath.appendQueryParameter(ReactBridgeSerializer.CONTACT_DISCRIMINATOR_PROPERTY_NAME, (String) it4.next());
            }
        }
        if (listParams.getArchived() != null) {
            appendEncodedPath.appendQueryParameter("archived", listParams.getArchived().toString());
        }
        if (listParams.getPinned() != null) {
            appendEncodedPath.appendQueryParameter("pinned", listParams.getPinned());
        }
        if (listParams.getSort() != null) {
            appendEncodedPath.appendQueryParameter("sort", listParams.getSort());
        }
        if (listParams.getOrigin() != null) {
            appendEncodedPath.appendQueryParameter("origin", listParams.getOrigin());
        }
        Integer limit = listParams.getLimit();
        appendEncodedPath.appendQueryParameter("limit", String.valueOf(limit != null ? limit.intValue() : 25));
        if (listParams.getCursor() != null) {
            appendEncodedPath.appendQueryParameter("cursor", listParams.getCursor());
        }
        Uri build = appendEncodedPath.build();
        build.getClass();
        return build;
    }
}
