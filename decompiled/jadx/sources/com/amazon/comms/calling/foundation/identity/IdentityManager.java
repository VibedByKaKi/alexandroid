package com.amazon.comms.calling.foundation.identity;

import com.amazon.alexa.devicesetup.sdk.whisperjoin.helper.ProvisioningConstants;
import com.amazon.comms.calling.foundation.identity.providers.IdentityProvider;
import com.amazon.comms.calling.foundation.network.recipes.NetworkConstants;
import com.amazon.comms.calling.foundation.repository.IdentifierRepository;
import com.amazon.comms.calling.foundation.repository.network.recipes.GetIdentity;
import com.amazon.commscore.api.identity.MarketplaceInfo;
import com.amazon.deecomms.contacts.database.provider.ContactProviderContract;
import javax.inject.Inject;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\u00020\u0001B!\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u000e\u0010\u0015\u001a\u00020\u0016H\u0086@¢\u0006\u0002\u0010\u0017J\u000e\u0010\u0018\u001a\u00020\u0019H\u0086@¢\u0006\u0002\u0010\u0017J\u001a\u00104\u001a\u0004\u0018\u00010\u00192\b\u0010%\u001a\u0004\u0018\u00010\u0019H\u0086@¢\u0006\u0002\u00105R\u001a\u0010\u0002\u001a\u00020\u0001X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R(\u0010\u001b\u001a\u0004\u0018\u00010\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019@VX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u001c\"\u0004\b\u001d\u0010\u001eR(\u0010\u001f\u001a\u0004\u0018\u00010\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u00198V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b \u0010\u001c\"\u0004\b!\u0010\u001eR(\u0010\"\u001a\u0004\u0018\u00010\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u00198V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b#\u0010\u001c\"\u0004\b$\u0010\u001eR(\u0010%\u001a\u0004\u0018\u00010\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u00198V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b&\u0010\u001c\"\u0004\b'\u0010\u001eR(\u0010(\u001a\u0004\u0018\u00010\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u00198V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b)\u0010\u001c\"\u0004\b*\u0010\u001eR(\u0010,\u001a\u0004\u0018\u00010+2\b\u0010\u001a\u001a\u0004\u0018\u00010+8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R(\u00101\u001a\u0004\u0018\u00010\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u00198V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b2\u0010\u001c\"\u0004\b3\u0010\u001e¨\u00066"}, d2 = {"Lcom/amazon/comms/calling/foundation/identity/IdentityManager;", "Lcom/amazon/comms/calling/foundation/identity/providers/IdentityProvider;", "identityProvider", "identifierRepository", "Lcom/amazon/comms/calling/foundation/repository/IdentifierRepository;", NetworkConstants.NAMES.GET_IDENTITY, "Lcom/amazon/comms/calling/foundation/repository/network/recipes/GetIdentity;", "<init>", "(Lcom/amazon/comms/calling/foundation/identity/providers/IdentityProvider;Lcom/amazon/comms/calling/foundation/repository/IdentifierRepository;Lcom/amazon/comms/calling/foundation/repository/network/recipes/GetIdentity;)V", "getIdentityProvider", "()Lcom/amazon/comms/calling/foundation/identity/providers/IdentityProvider;", "setIdentityProvider", "(Lcom/amazon/comms/calling/foundation/identity/providers/IdentityProvider;)V", "getIdentifierRepository", "()Lcom/amazon/comms/calling/foundation/repository/IdentifierRepository;", "setIdentifierRepository", "(Lcom/amazon/comms/calling/foundation/repository/IdentifierRepository;)V", "getGetIdentity", "()Lcom/amazon/comms/calling/foundation/repository/network/recipes/GetIdentity;", "setGetIdentity", "(Lcom/amazon/comms/calling/foundation/repository/network/recipes/GetIdentity;)V", "initializeIdentity", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getCommsID", "", "value", "commsID", "()Ljava/lang/String;", "setCommsID", "(Ljava/lang/String;)V", ContactProviderContract.PhoneNumberEntry.COLUMN_AOR, "getAor", "setAor", "homeGroupID", "getHomeGroupID", "setHomeGroupID", "directedID", "getDirectedID", "setDirectedID", ProvisioningConstants.DEVICE_SETUP_PROVISIONING_STATUS, "getProvisioningStatus", "setProvisioningStatus", "Lcom/amazon/commscore/api/identity/MarketplaceInfo;", "marketplaceInfo", "getMarketplaceInfo", "()Lcom/amazon/commscore/api/identity/MarketplaceInfo;", "setMarketplaceInfo", "(Lcom/amazon/commscore/api/identity/MarketplaceInfo;)V", "primaryDirectedID", "getPrimaryDirectedID", "setPrimaryDirectedID", "getCommsIDFromNetwork", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "AlexaCommsCallingUI-Android_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes20.dex */
public final class IdentityManager implements IdentityProvider {

    @Nullable
    private String commsID;

    @NotNull
    private GetIdentity getIdentity;

    @NotNull
    private IdentifierRepository identifierRepository;

    @NotNull
    private IdentityProvider identityProvider;

    @Inject
    public IdentityManager(@NotNull IdentityProvider identityProvider, @NotNull IdentifierRepository identifierRepository, @NotNull GetIdentity getIdentity) {
        identityProvider.getClass();
        identifierRepository.getClass();
        getIdentity.getClass();
        this.identityProvider = identityProvider;
        this.identifierRepository = identifierRepository;
        this.getIdentity = getIdentity;
    }

    @Override // com.amazon.comms.calling.foundation.identity.providers.IdentityProvider
    @Nullable
    public String getAor() {
        return this.identityProvider.getAor();
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0066, code lost:
    
        if (r6 == r1) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0068, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0052, code lost:
    
        if (r6 == r1) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object getCommsID(@org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super java.lang.String> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof com.amazon.comms.calling.foundation.identity.IdentityManager$getCommsID$1
            if (r0 == 0) goto L13
            r0 = r6
            com.amazon.comms.calling.foundation.identity.IdentityManager$getCommsID$1 r0 = (com.amazon.comms.calling.foundation.identity.IdentityManager$getCommsID$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.amazon.comms.calling.foundation.identity.IdentityManager$getCommsID$1 r0 = new com.amazon.comms.calling.foundation.identity.IdentityManager$getCommsID$1
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3b
            if (r2 == r4) goto L33
            if (r2 != r3) goto L2c
            kotlin.ResultKt.throwOnFailure(r6)
            goto L69
        L2c:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            rx.Single$$ExternalSyntheticBUOutline0.m$2(r5)
            r5 = 0
            return r5
        L33:
            java.lang.Object r5 = r0.L$0
            com.amazon.comms.calling.foundation.identity.IdentityManager r5 = (com.amazon.comms.calling.foundation.identity.IdentityManager) r5
            kotlin.ResultKt.throwOnFailure(r6)
            goto L55
        L3b:
            kotlin.ResultKt.throwOnFailure(r6)
            com.amazon.comms.calling.foundation.identity.providers.IdentityProvider r6 = r5.identityProvider
            java.lang.String r6 = r6.getCommsID()
            if (r6 != 0) goto L70
            java.lang.String r6 = r5.getDirectedID()
            r0.L$0 = r5
            r0.label = r4
            java.lang.Object r6 = r5.getCommsIDFromNetwork(r6, r0)
            if (r6 != r1) goto L55
            goto L68
        L55:
            java.lang.String r6 = (java.lang.String) r6
            if (r6 != 0) goto L70
            java.lang.String r6 = r5.getPrimaryDirectedID()
            r2 = 0
            r0.L$0 = r2
            r0.label = r3
            java.lang.Object r6 = r5.getCommsIDFromNetwork(r6, r0)
            if (r6 != r1) goto L69
        L68:
            return r1
        L69:
            java.lang.String r6 = (java.lang.String) r6
            if (r6 != 0) goto L70
            java.lang.String r5 = ""
            return r5
        L70:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.comms.calling.foundation.identity.IdentityManager.getCommsID(kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0047 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object getCommsIDFromNetwork(@org.jetbrains.annotations.Nullable java.lang.String r4, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super java.lang.String> r5) {
        /*
            r3 = this;
            boolean r4 = r5 instanceof com.amazon.comms.calling.foundation.identity.IdentityManager$getCommsIDFromNetwork$1
            if (r4 == 0) goto L13
            r4 = r5
            com.amazon.comms.calling.foundation.identity.IdentityManager$getCommsIDFromNetwork$1 r4 = (com.amazon.comms.calling.foundation.identity.IdentityManager$getCommsIDFromNetwork$1) r4
            int r0 = r4.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = r0 & r1
            if (r2 == 0) goto L13
            int r0 = r0 - r1
            r4.label = r0
            goto L18
        L13:
            com.amazon.comms.calling.foundation.identity.IdentityManager$getCommsIDFromNetwork$1 r4 = new com.amazon.comms.calling.foundation.identity.IdentityManager$getCommsIDFromNetwork$1
            r4.<init>(r3, r5)
        L18:
            java.lang.Object r5 = r4.result
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r4.label
            r2 = 1
            if (r1 == 0) goto L30
            if (r1 != r2) goto L29
            kotlin.ResultKt.throwOnFailure(r5)
            goto L3e
        L29:
            java.lang.String r3 = "call to 'resume' before 'invoke' with coroutine"
            rx.Single$$ExternalSyntheticBUOutline0.m$2(r3)
            r3 = 0
            return r3
        L30:
            kotlin.ResultKt.throwOnFailure(r5)
            com.amazon.comms.calling.foundation.repository.network.recipes.GetIdentity r3 = r3.getIdentity
            r4.label = r2
            java.lang.Object r5 = r3.execute(r4)
            if (r5 != r0) goto L3e
            return r0
        L3e:
            com.amazon.comms.calling.foundation.network.model.CommsProfile r5 = (com.amazon.comms.calling.foundation.network.model.CommsProfile) r5
            if (r5 == 0) goto L47
            java.lang.String r3 = r5.getCommsId()
            return r3
        L47:
            r3 = 0
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.comms.calling.foundation.identity.IdentityManager.getCommsIDFromNetwork(java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // com.amazon.comms.calling.foundation.identity.providers.IdentityProvider
    @Nullable
    public String getDirectedID() {
        return this.identityProvider.getDirectedID();
    }

    @NotNull
    public final GetIdentity getGetIdentity() {
        return this.getIdentity;
    }

    @Override // com.amazon.comms.calling.foundation.identity.providers.IdentityProvider
    @Nullable
    public String getHomeGroupID() {
        return this.identityProvider.getHomeGroupID();
    }

    @NotNull
    public final IdentifierRepository getIdentifierRepository() {
        return this.identifierRepository;
    }

    @NotNull
    public final IdentityProvider getIdentityProvider() {
        return this.identityProvider;
    }

    @Override // com.amazon.comms.calling.foundation.identity.providers.IdentityProvider
    @Nullable
    public MarketplaceInfo getMarketplaceInfo() {
        return this.identityProvider.getMarketplaceInfo();
    }

    @Override // com.amazon.comms.calling.foundation.identity.providers.IdentityProvider
    @Nullable
    public String getPrimaryDirectedID() {
        return this.identityProvider.getPrimaryDirectedID();
    }

    @Override // com.amazon.comms.calling.foundation.identity.providers.IdentityProvider
    @Nullable
    public String getProvisioningStatus() {
        return this.identityProvider.getProvisioningStatus();
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object initializeIdentity(@org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super kotlin.Unit> r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof com.amazon.comms.calling.foundation.identity.IdentityManager$initializeIdentity$1
            if (r0 == 0) goto L13
            r0 = r5
            com.amazon.comms.calling.foundation.identity.IdentityManager$initializeIdentity$1 r0 = (com.amazon.comms.calling.foundation.identity.IdentityManager$initializeIdentity$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.amazon.comms.calling.foundation.identity.IdentityManager$initializeIdentity$1 r0 = new com.amazon.comms.calling.foundation.identity.IdentityManager$initializeIdentity$1
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L34
            if (r2 != r3) goto L2d
            java.lang.Object r4 = r0.L$0
            com.amazon.comms.calling.foundation.identity.IdentityManager r4 = (com.amazon.comms.calling.foundation.identity.IdentityManager) r4
            kotlin.ResultKt.throwOnFailure(r5)
            goto L44
        L2d:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            rx.Single$$ExternalSyntheticBUOutline0.m$2(r4)
            r4 = 0
            return r4
        L34:
            kotlin.ResultKt.throwOnFailure(r5)
            com.amazon.comms.calling.foundation.repository.network.recipes.GetIdentity r5 = r4.getIdentity
            r0.L$0 = r4
            r0.label = r3
            java.lang.Object r5 = r5.execute(r0)
            if (r5 != r1) goto L44
            return r1
        L44:
            com.amazon.comms.calling.foundation.network.model.CommsProfile r5 = (com.amazon.comms.calling.foundation.network.model.CommsProfile) r5
            r0 = 0
            if (r5 == 0) goto L4e
            java.lang.String r1 = r5.getAor()
            goto L4f
        L4e:
            r1 = r0
        L4f:
            r4.setAor(r1)
            if (r5 == 0) goto L59
            java.lang.String r1 = r5.getCommsId()
            goto L5a
        L59:
            r1 = r0
        L5a:
            r4.setCommsID(r1)
            if (r5 == 0) goto L63
            java.lang.String r0 = r5.getHomeGroupId()
        L63:
            r4.setHomeGroupID(r0)
            kotlin.Unit r4 = kotlin.Unit.INSTANCE
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.comms.calling.foundation.identity.IdentityManager.initializeIdentity(kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // com.amazon.comms.calling.foundation.identity.providers.IdentityProvider
    public void setAor(@Nullable String str) {
        this.identityProvider.setAor(str);
    }

    @Override // com.amazon.comms.calling.foundation.identity.providers.IdentityProvider
    public void setCommsID(@Nullable String str) {
        this.identityProvider.setCommsID(str);
    }

    @Override // com.amazon.comms.calling.foundation.identity.providers.IdentityProvider
    public void setDirectedID(@Nullable String str) {
        this.identityProvider.setDirectedID(str);
    }

    public final void setGetIdentity(@NotNull GetIdentity getIdentity) {
        getIdentity.getClass();
        this.getIdentity = getIdentity;
    }

    @Override // com.amazon.comms.calling.foundation.identity.providers.IdentityProvider
    public void setHomeGroupID(@Nullable String str) {
        this.identityProvider.setHomeGroupID(str);
    }

    public final void setIdentifierRepository(@NotNull IdentifierRepository identifierRepository) {
        identifierRepository.getClass();
        this.identifierRepository = identifierRepository;
    }

    public final void setIdentityProvider(@NotNull IdentityProvider identityProvider) {
        identityProvider.getClass();
        this.identityProvider = identityProvider;
    }

    @Override // com.amazon.comms.calling.foundation.identity.providers.IdentityProvider
    public void setMarketplaceInfo(@Nullable MarketplaceInfo marketplaceInfo) {
        this.identityProvider.setMarketplaceInfo(marketplaceInfo);
    }

    @Override // com.amazon.comms.calling.foundation.identity.providers.IdentityProvider
    public void setPrimaryDirectedID(@Nullable String str) {
        this.identityProvider.setPrimaryDirectedID(str);
    }

    @Override // com.amazon.comms.calling.foundation.identity.providers.IdentityProvider
    public void setProvisioningStatus(@Nullable String str) {
        this.identityProvider.setProvisioningStatus(str);
    }

    @Override // com.amazon.comms.calling.foundation.identity.providers.IdentityProvider
    @Nullable
    public String getCommsID() {
        return this.commsID;
    }
}
