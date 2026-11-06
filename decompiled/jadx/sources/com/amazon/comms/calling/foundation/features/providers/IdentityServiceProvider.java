package com.amazon.comms.calling.foundation.features.providers;

import com.amazon.comms.calling.domain.model.DeviceModel;
import com.amazon.commscore.api.identity.MarketplaceInfo;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\n\u0010\u0002\u001a\u0004\u0018\u00010\u0003H&J\n\u0010\u0004\u001a\u0004\u0018\u00010\u0003H&J\n\u0010\u0005\u001a\u0004\u0018\u00010\u0006H&J\u0010\u0010\u0007\u001a\u0004\u0018\u00010\u0003H¦@¢\u0006\u0002\u0010\bJ\u001e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n2\u0006\u0010\f\u001a\u00020\u0003H¦@¢\u0006\u0002\u0010\rJ\u0018\u0010\u000e\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u000f\u001a\u00020\u0003H¦@¢\u0006\u0002\u0010\rJ\u000e\u0010\u0010\u001a\u00020\u0011H¦@¢\u0006\u0002\u0010\bJ\b\u0010\u0012\u001a\u00020\u0011H&J\b\u0010\u0013\u001a\u00020\u0014H&J\b\u0010\u0015\u001a\u00020\u0011H&J\b\u0010\u0016\u001a\u00020\u0011H&¨\u0006\u0017"}, d2 = {"Lcom/amazon/comms/calling/foundation/features/providers/IdentityServiceProvider;", "", "getCommsId", "", "getHomegroupId", "getMarketplaceInfo", "Lcom/amazon/commscore/api/identity/MarketplaceInfo;", "getAor", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getDevices", "", "Lcom/amazon/comms/calling/domain/model/DeviceModel;", "commsId", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getNameForCommsID", "queryCommsId", "hasValidProvisioningStatus", "", "isSignedInUser", "getProvisionStatus", "Lcom/amazon/comms/calling/foundation/features/providers/ProvisionStatus;", "isCommsProvisioned", "isChildProfile", "AlexaCommsCallingUI-Android_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes20.dex */
public interface IdentityServiceProvider {
    @Nullable
    Object getAor(@NotNull Continuation<? super String> continuation);

    @Nullable
    String getCommsId();

    @Nullable
    Object getDevices(@NotNull String str, @NotNull Continuation<? super List<DeviceModel>> continuation);

    @Nullable
    String getHomegroupId();

    @Nullable
    MarketplaceInfo getMarketplaceInfo();

    @Nullable
    Object getNameForCommsID(@NotNull String str, @NotNull Continuation<? super String> continuation);

    @NotNull
    ProvisionStatus getProvisionStatus();

    @Nullable
    Object hasValidProvisioningStatus(@NotNull Continuation<? super Boolean> continuation);

    boolean isChildProfile();

    boolean isCommsProvisioned();

    boolean isSignedInUser();
}
