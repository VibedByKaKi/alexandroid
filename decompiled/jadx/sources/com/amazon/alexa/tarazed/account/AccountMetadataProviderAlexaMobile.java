package com.amazon.alexa.tarazed.account;

import com.amazon.alexa.device.api.DeviceInformation;
import com.amazon.alexa.device.api.DeviceInformationException;
import com.amazon.alexa.identity.api.IdentityService;
import com.amazon.alexa.identity.api.UserIdentity;
import com.amazon.alexa.marketplace.api.Marketplace;
import com.amazon.alexa.marketplace.api.MarketplaceId;
import com.amazon.alexa.tarazed.dagger.scope.TarazedIntegrationScope;
import com.amazon.tarazed.registry.component.AccountMetadataProvider;
import com.amazon.tarazed.type.Account;
import com.amazon.tarazed.utility.AccountPreferences;
import javax.inject.Inject;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \r2\u00020\u0001:\u0001\rB\u001f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bR\u0014\u0010\t\u001a\u00020\n8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/amazon/alexa/tarazed/account/AccountMetadataProviderAlexaMobile;", "Lcom/amazon/tarazed/registry/component/AccountMetadataProvider;", "identityService", "Lcom/amazon/alexa/identity/api/IdentityService;", "alexaMobileDeviceInformation", "Lcom/amazon/alexa/device/api/DeviceInformation;", "accountPreferences", "Lcom/amazon/tarazed/utility/AccountPreferences;", "(Lcom/amazon/alexa/identity/api/IdentityService;Lcom/amazon/alexa/device/api/DeviceInformation;Lcom/amazon/tarazed/utility/AccountPreferences;)V", "accountMetadata", "Lcom/amazon/tarazed/type/Account;", "getAccountMetadata", "()Lcom/amazon/tarazed/type/Account;", "Companion", "AlexaMobileAndroidTarazedIntegration_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@TarazedIntegrationScope
/* loaded from: classes19.dex */
public final class AccountMetadataProviderAlexaMobile implements AccountMetadataProvider {

    @NotNull
    private static final String TAG = "AccountMetadataTarazed";

    @NotNull
    private final AccountPreferences accountPreferences;

    @NotNull
    private final DeviceInformation alexaMobileDeviceInformation;

    @NotNull
    private final IdentityService identityService;

    @Inject
    public AccountMetadataProviderAlexaMobile(@NotNull IdentityService identityService, @NotNull DeviceInformation deviceInformation, @NotNull AccountPreferences accountPreferences) {
        identityService.getClass();
        deviceInformation.getClass();
        accountPreferences.getClass();
        this.identityService = identityService;
        this.alexaMobileDeviceInformation = deviceInformation;
        this.accountPreferences = accountPreferences;
    }

    @Override // com.amazon.tarazed.registry.component.AccountMetadataProvider
    @NotNull
    public Account getAccountMetadata() {
        String str;
        Marketplace marketplace;
        String str2 = "Unknown";
        UserIdentity user = this.identityService.getUser(TAG);
        MarketplaceId marketplaceId = null;
        String directedId = user != null ? user.getDirectedId() : null;
        try {
            str = this.alexaMobileDeviceInformation.getDeviceType();
        } catch (DeviceInformationException unused) {
            str = "Unknown";
        }
        UserIdentity user2 = this.identityService.getUser(TAG);
        if (user2 != null && (marketplace = user2.getMarketplace()) != null) {
            marketplaceId = marketplace.getObfuscatedId();
        }
        String valueOf = String.valueOf(marketplaceId);
        try {
            str2 = this.alexaMobileDeviceInformation.getDeviceSerialNumber();
        } catch (DeviceInformationException unused2) {
        }
        return new Account(directedId, valueOf, str, str2, this.accountPreferences.getDeviceEnvironment());
    }
}
