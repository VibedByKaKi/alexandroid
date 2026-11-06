package com.amazon.comms.calling.foundation.identity.providers;

import com.amazon.alexa.devicesetup.sdk.whisperjoin.helper.ProvisioningConstants;
import com.amazon.commscore.api.identity.AlexaCommsCoreIdentityService;
import com.amazon.commscore.api.identity.CommsCoreIdentity;
import com.amazon.commscore.api.identity.MarketplaceInfo;
import com.amazon.deecomms.contacts.database.provider.ContactProviderContract;
import kotlin.Lazy;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u001c\u0010\t\u001a\u0004\u0018\u00010\nX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001e\u0010\u000f\u001a\u0004\u0018\u00010\n8VX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\f\"\u0004\b\u0011\u0010\u000eR\u001e\u0010\u0012\u001a\u0004\u0018\u00010\n8VX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\f\"\u0004\b\u0014\u0010\u000eR\u001e\u0010\u0015\u001a\u0004\u0018\u00010\n8VX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\f\"\u0004\b\u0017\u0010\u000eR\u001e\u0010\u0018\u001a\u0004\u0018\u00010\n8VX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\f\"\u0004\b\u001a\u0010\u000eR\u001e\u0010\u001b\u001a\u0004\u0018\u00010\u001c8VX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\u001e\u0010!\u001a\u0004\u0018\u00010\n8VX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\f\"\u0004\b#\u0010\u000e¨\u0006$"}, d2 = {"Lcom/amazon/comms/calling/foundation/identity/providers/CommsCoreIdentityProvider;", "Lcom/amazon/comms/calling/foundation/identity/providers/IdentityProvider;", "alexaCommsCoreIdentityService", "Lkotlin/Lazy;", "Lcom/amazon/commscore/api/identity/AlexaCommsCoreIdentityService;", "<init>", "(Lkotlin/Lazy;)V", "getAlexaCommsCoreIdentityService", "()Lkotlin/Lazy;", ContactProviderContract.PhoneNumberEntry.COLUMN_AOR, "", "getAor", "()Ljava/lang/String;", "setAor", "(Ljava/lang/String;)V", "commsID", "getCommsID", "setCommsID", "homeGroupID", "getHomeGroupID", "setHomeGroupID", "directedID", "getDirectedID", "setDirectedID", ProvisioningConstants.DEVICE_SETUP_PROVISIONING_STATUS, "getProvisioningStatus", "setProvisioningStatus", "marketplaceInfo", "Lcom/amazon/commscore/api/identity/MarketplaceInfo;", "getMarketplaceInfo", "()Lcom/amazon/commscore/api/identity/MarketplaceInfo;", "setMarketplaceInfo", "(Lcom/amazon/commscore/api/identity/MarketplaceInfo;)V", "primaryDirectedID", "getPrimaryDirectedID", "setPrimaryDirectedID", "AlexaCommsCallingUI-Android_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes20.dex */
public final class CommsCoreIdentityProvider implements IdentityProvider {

    @NotNull
    private final Lazy<AlexaCommsCoreIdentityService> alexaCommsCoreIdentityService;

    @Nullable
    private String aor;

    @Nullable
    private String commsID;

    @Nullable
    private String directedID;

    @Nullable
    private String homeGroupID;

    @Nullable
    private MarketplaceInfo marketplaceInfo;

    @Nullable
    private String primaryDirectedID;

    @Nullable
    private String provisioningStatus;

    /* JADX WARN: Multi-variable type inference failed */
    public CommsCoreIdentityProvider(@NotNull Lazy<? extends AlexaCommsCoreIdentityService> lazy) {
        lazy.getClass();
        this.alexaCommsCoreIdentityService = lazy;
    }

    @NotNull
    public final Lazy<AlexaCommsCoreIdentityService> getAlexaCommsCoreIdentityService() {
        return this.alexaCommsCoreIdentityService;
    }

    @Override // com.amazon.comms.calling.foundation.identity.providers.IdentityProvider
    @Nullable
    public String getAor() {
        return this.aor;
    }

    @Override // com.amazon.comms.calling.foundation.identity.providers.IdentityProvider
    @Nullable
    public String getCommsID() {
        CommsCoreIdentity identity = this.alexaCommsCoreIdentityService.getValue().getIdentity();
        if (identity != null) {
            return identity.getCommsId();
        }
        return null;
    }

    @Override // com.amazon.comms.calling.foundation.identity.providers.IdentityProvider
    @Nullable
    public String getDirectedID() {
        CommsCoreIdentity identity = this.alexaCommsCoreIdentityService.getValue().getIdentity();
        if (identity != null) {
            return identity.getDirectedId();
        }
        return null;
    }

    @Override // com.amazon.comms.calling.foundation.identity.providers.IdentityProvider
    @Nullable
    public String getHomeGroupID() {
        CommsCoreIdentity identity = this.alexaCommsCoreIdentityService.getValue().getIdentity();
        if (identity != null) {
            return identity.getHomegroupId();
        }
        return null;
    }

    @Override // com.amazon.comms.calling.foundation.identity.providers.IdentityProvider
    @Nullable
    public MarketplaceInfo getMarketplaceInfo() {
        CommsCoreIdentity identity = this.alexaCommsCoreIdentityService.getValue().getIdentity();
        if (identity != null) {
            return identity.getMarketplaceInfo();
        }
        return null;
    }

    @Override // com.amazon.comms.calling.foundation.identity.providers.IdentityProvider
    @Nullable
    public String getPrimaryDirectedID() {
        CommsCoreIdentity identity = this.alexaCommsCoreIdentityService.getValue().getIdentity();
        if (identity != null) {
            return identity.getDirectedId();
        }
        return null;
    }

    @Override // com.amazon.comms.calling.foundation.identity.providers.IdentityProvider
    @Nullable
    public String getProvisioningStatus() {
        CommsCoreIdentity identity = this.alexaCommsCoreIdentityService.getValue().getIdentity();
        if (identity != null) {
            return identity.getProvisioningStatus();
        }
        return null;
    }

    @Override // com.amazon.comms.calling.foundation.identity.providers.IdentityProvider
    public void setAor(@Nullable String str) {
        this.aor = str;
    }

    @Override // com.amazon.comms.calling.foundation.identity.providers.IdentityProvider
    public void setCommsID(@Nullable String str) {
        this.commsID = str;
    }

    @Override // com.amazon.comms.calling.foundation.identity.providers.IdentityProvider
    public void setDirectedID(@Nullable String str) {
        this.directedID = str;
    }

    @Override // com.amazon.comms.calling.foundation.identity.providers.IdentityProvider
    public void setHomeGroupID(@Nullable String str) {
        this.homeGroupID = str;
    }

    @Override // com.amazon.comms.calling.foundation.identity.providers.IdentityProvider
    public void setMarketplaceInfo(@Nullable MarketplaceInfo marketplaceInfo) {
        this.marketplaceInfo = marketplaceInfo;
    }

    @Override // com.amazon.comms.calling.foundation.identity.providers.IdentityProvider
    public void setPrimaryDirectedID(@Nullable String str) {
        this.primaryDirectedID = str;
    }

    @Override // com.amazon.comms.calling.foundation.identity.providers.IdentityProvider
    public void setProvisioningStatus(@Nullable String str) {
        this.provisioningStatus = str;
    }
}
