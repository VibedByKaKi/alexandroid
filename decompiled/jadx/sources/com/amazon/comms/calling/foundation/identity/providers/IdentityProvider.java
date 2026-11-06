package com.amazon.comms.calling.foundation.identity.providers;

import com.amazon.alexa.devicesetup.sdk.whisperjoin.helper.ProvisioningConstants;
import com.amazon.commscore.api.identity.MarketplaceInfo;
import com.amazon.deecomms.contacts.database.provider.ContactProviderContract;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\b\bf\u0018\u00002\u00020\u0001R\u001a\u0010\u0002\u001a\u0004\u0018\u00010\u0003X¦\u000e¢\u0006\f\u001a\u0004\b\u0004\u0010\u0005\"\u0004\b\u0006\u0010\u0007R\u001a\u0010\b\u001a\u0004\u0018\u00010\u0003X¦\u000e¢\u0006\f\u001a\u0004\b\t\u0010\u0005\"\u0004\b\n\u0010\u0007R\u001a\u0010\u000b\u001a\u0004\u0018\u00010\u0003X¦\u000e¢\u0006\f\u001a\u0004\b\f\u0010\u0005\"\u0004\b\r\u0010\u0007R\u001a\u0010\u000e\u001a\u0004\u0018\u00010\u0003X¦\u000e¢\u0006\f\u001a\u0004\b\u000f\u0010\u0005\"\u0004\b\u0010\u0010\u0007R\u001a\u0010\u0011\u001a\u0004\u0018\u00010\u0003X¦\u000e¢\u0006\f\u001a\u0004\b\u0012\u0010\u0005\"\u0004\b\u0013\u0010\u0007R\u001a\u0010\u0014\u001a\u0004\u0018\u00010\u0015X¦\u000e¢\u0006\f\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001a\u001a\u0004\u0018\u00010\u0003X¦\u000e¢\u0006\f\u001a\u0004\b\u001b\u0010\u0005\"\u0004\b\u001c\u0010\u0007¨\u0006\u001d"}, d2 = {"Lcom/amazon/comms/calling/foundation/identity/providers/IdentityProvider;", "", "commsID", "", "getCommsID", "()Ljava/lang/String;", "setCommsID", "(Ljava/lang/String;)V", ContactProviderContract.PhoneNumberEntry.COLUMN_AOR, "getAor", "setAor", "homeGroupID", "getHomeGroupID", "setHomeGroupID", "directedID", "getDirectedID", "setDirectedID", ProvisioningConstants.DEVICE_SETUP_PROVISIONING_STATUS, "getProvisioningStatus", "setProvisioningStatus", "marketplaceInfo", "Lcom/amazon/commscore/api/identity/MarketplaceInfo;", "getMarketplaceInfo", "()Lcom/amazon/commscore/api/identity/MarketplaceInfo;", "setMarketplaceInfo", "(Lcom/amazon/commscore/api/identity/MarketplaceInfo;)V", "primaryDirectedID", "getPrimaryDirectedID", "setPrimaryDirectedID", "AlexaCommsCallingUI-Android_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes20.dex */
public interface IdentityProvider {
    @Nullable
    String getAor();

    @Nullable
    String getCommsID();

    @Nullable
    String getDirectedID();

    @Nullable
    String getHomeGroupID();

    @Nullable
    MarketplaceInfo getMarketplaceInfo();

    @Nullable
    String getPrimaryDirectedID();

    @Nullable
    String getProvisioningStatus();

    void setAor(@Nullable String str);

    void setCommsID(@Nullable String str);

    void setDirectedID(@Nullable String str);

    void setHomeGroupID(@Nullable String str);

    void setMarketplaceInfo(@Nullable MarketplaceInfo marketplaceInfo);

    void setPrimaryDirectedID(@Nullable String str);

    void setProvisioningStatus(@Nullable String str);
}
