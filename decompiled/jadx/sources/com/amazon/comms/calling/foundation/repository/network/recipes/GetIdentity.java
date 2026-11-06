package com.amazon.comms.calling.foundation.repository.network.recipes;

import com.amazon.comms.calling.foundation.CommonConstants;
import com.amazon.comms.calling.foundation.network.NetworkGateway;
import com.amazon.comms.log.CommsLogger;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0086@¢\u0006\u0002\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/amazon/comms/calling/foundation/repository/network/recipes/GetIdentity;", "", "networkGateway", "Lcom/amazon/comms/calling/foundation/network/NetworkGateway;", "<init>", "(Lcom/amazon/comms/calling/foundation/network/NetworkGateway;)V", "getNetworkGateway", "()Lcom/amazon/comms/calling/foundation/network/NetworkGateway;", "LOG", "Lcom/amazon/comms/log/CommsLogger;", "execute", "Lcom/amazon/comms/calling/foundation/network/model/CommsProfile;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "AlexaCommsCallingUI-Android_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes20.dex */
public final class GetIdentity {

    @NotNull
    private final CommsLogger LOG;

    @NotNull
    private final NetworkGateway networkGateway;

    public GetIdentity(@NotNull NetworkGateway networkGateway) {
        networkGateway.getClass();
        this.networkGateway = networkGateway;
        CommsLogger logger = CommsLogger.getLogger(CommonConstants.LOG_TAG, GetIdentity.class);
        logger.getClass();
        this.LOG = logger;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object execute(@org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super com.amazon.comms.calling.foundation.network.model.CommsProfile> r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof com.amazon.comms.calling.foundation.repository.network.recipes.GetIdentity$execute$1
            if (r0 == 0) goto L13
            r0 = r8
            com.amazon.comms.calling.foundation.repository.network.recipes.GetIdentity$execute$1 r0 = (com.amazon.comms.calling.foundation.repository.network.recipes.GetIdentity$execute$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.amazon.comms.calling.foundation.repository.network.recipes.GetIdentity$execute$1 r0 = new com.amazon.comms.calling.foundation.repository.network.recipes.GetIdentity$execute$1
            r0.<init>(r7, r8)
        L18:
            java.lang.Object r8 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L36
            if (r2 != r3) goto L2f
            java.lang.Object r7 = r0.L$0
            com.amazon.comms.calling.foundation.repository.network.recipes.GetIdentity r7 = (com.amazon.comms.calling.foundation.repository.network.recipes.GetIdentity) r7
            kotlin.ResultKt.throwOnFailure(r8)     // Catch: com.amazon.commsnetworking.NetworkException -> L2d
            goto L55
        L2d:
            r8 = move-exception
            goto L67
        L2f:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            rx.Single$$ExternalSyntheticBUOutline0.m$2(r7)
        L34:
            r7 = 0
            return r7
        L36:
            kotlin.ResultKt.throwOnFailure(r8)
            com.amazon.comms.calling.foundation.network.NetworkGateway r8 = r7.networkGateway     // Catch: com.amazon.commsnetworking.NetworkException -> L2d
            com.amazon.comms.calling.foundation.network.model.API r2 = new com.amazon.comms.calling.foundation.network.model.API     // Catch: com.amazon.commsnetworking.NetworkException -> L2d
            java.lang.String r4 = "getIdentity"
            java.lang.String r5 = "/users/{0}/identities"
            java.lang.String r6 = "comms.api.getIdentity"
            r2.<init>(r4, r5, r6)     // Catch: com.amazon.commsnetworking.NetworkException -> L2d
            java.lang.String r4 = ""
            com.amazon.commsnetworking.CommsNetworkRequest$Method r5 = com.amazon.commsnetworking.CommsNetworkRequest.Method.GET     // Catch: com.amazon.commsnetworking.NetworkException -> L2d
            r0.L$0 = r7     // Catch: com.amazon.commsnetworking.NetworkException -> L2d
            r0.label = r3     // Catch: com.amazon.commsnetworking.NetworkException -> L2d
            java.lang.Object r8 = r8.execute(r2, r4, r5, r0)     // Catch: com.amazon.commsnetworking.NetworkException -> L2d
            if (r8 != r1) goto L55
            return r1
        L55:
            com.amazon.commsnetworking.CommsNetworkResponse r8 = (com.amazon.commsnetworking.CommsNetworkResponse) r8     // Catch: com.amazon.commsnetworking.NetworkException -> L2d
            com.google.gson.Gson r0 = new com.google.gson.Gson     // Catch: com.amazon.commsnetworking.NetworkException -> L2d
            r0.<init>()     // Catch: com.amazon.commsnetworking.NetworkException -> L2d
            java.lang.String r8 = r8.getBody()     // Catch: com.amazon.commsnetworking.NetworkException -> L2d
            java.lang.Class<com.amazon.comms.calling.foundation.network.model.CommsProfile> r1 = com.amazon.comms.calling.foundation.network.model.CommsProfile.class
            java.lang.Object r7 = r0.fromJson(r8, r1)     // Catch: com.amazon.commsnetworking.NetworkException -> L2d
            return r7
        L67:
            com.amazon.comms.log.CommsLogger r0 = r7.LOG
            java.lang.String r1 = r8.getMessage()
            java.lang.String r2 = "Network error while getting identity info : "
            com.amazon.credentiallocker.CredentialConfig$$ExternalSyntheticOutline0.m(r0, r2, r1)
            com.amazon.comms.log.CommsLogger r0 = r7.LOG
            com.amazon.commsnetworking.api.INetworkRequest r1 = r8.getRequest()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Request : "
            r2.<init>(r3)
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            r0.d(r1)
            com.amazon.comms.log.CommsLogger r7 = r7.LOG
            com.amazon.commsnetworking.api.INetworkResponse r8 = r8.getResponse()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Response : "
            r0.<init>(r1)
            r0.append(r8)
            java.lang.String r8 = r0.toString()
            r7.d(r8)
            goto L34
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.comms.calling.foundation.repository.network.recipes.GetIdentity.execute(kotlin.coroutines.Continuation):java.lang.Object");
    }

    @NotNull
    public final NetworkGateway getNetworkGateway() {
        return this.networkGateway;
    }
}
