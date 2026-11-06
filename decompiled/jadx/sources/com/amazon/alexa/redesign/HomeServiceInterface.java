package com.amazon.alexa.redesign;

import com.amazon.alexa.redesign.client.CosmoServiceClient;
import com.amazon.alexa.redesign.client.HomeFeedServiceClient;
import com.amazon.alexa.redesign.entity.cosmo.ListParams;
import io.branch.rnbranch.RNBranchModule;
import io.reactivex.rxjava3.core.Single;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0005H&J\b\u0010\u0006\u001a\u00020\u0007H&J\u0016\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u000b\u001a\u00020\fH&J\u0016\u0010\r\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u000e\u001a\u00020\nH&J&\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u000e\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\nH&J2\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u000e\u001a\u00020\n2\u0006\u0010\u0013\u001a\u00020\n2\b\u0010\u0014\u001a\u0004\u0018\u00010\n2\b\u0010\u0015\u001a\u0004\u0018\u00010\nH&J\b\u0010\u0016\u001a\u00020\u0017H&J(\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u0019\u001a\u00020\n2\u0006\u0010\u001a\u001a\u00020\n2\b\u0010\u001b\u001a\u0004\u0018\u00010\nH&¨\u0006\u001c"}, d2 = {"Lcom/amazon/alexa/redesign/HomeServiceInterface;", "", "initialize", "", "getHomeServiceClient", "Lcom/amazon/alexa/redesign/client/HomeFeedServiceClient;", "cosmoServiceClient", "Lcom/amazon/alexa/redesign/client/CosmoServiceClient;", "listCards", "Lio/reactivex/rxjava3/core/Single;", "", RNBranchModule.NATIVE_INIT_SESSION_FINISHED_EVENT_PARAMS, "Lcom/amazon/alexa/redesign/entity/cosmo/ListParams;", "getItem", "itemId", "invokeAction", "operation", "stateVersion", "reorder", "version", "beforeItemId", "afterItemId", "isCardStudioHome", "", "createItem", "providerId", "createdTs", "token", "AlexaMobileAndroidHomeChannel_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes19.dex */
public interface HomeServiceInterface {
    @NotNull
    CosmoServiceClient cosmoServiceClient();

    @NotNull
    Single<String> createItem(@NotNull String providerId, @NotNull String createdTs, @Nullable String token);

    @NotNull
    HomeFeedServiceClient getHomeServiceClient();

    @NotNull
    Single<String> getItem(@NotNull String itemId);

    void initialize();

    @NotNull
    Single<String> invokeAction(@NotNull String itemId, @NotNull String operation, @NotNull String stateVersion);

    boolean isCardStudioHome();

    @NotNull
    Single<String> listCards(@NotNull ListParams params);

    @NotNull
    Single<String> reorder(@NotNull String itemId, @NotNull String version, @Nullable String beforeItemId, @Nullable String afterItemId);
}
