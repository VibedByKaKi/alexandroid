package com.amazon.alexa.assistant.profile;

import kotlin.Metadata;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class ProfileManagerBuilder$build$1 implements AccountSnapshotProvider {
    final /* synthetic */ DefaultProfileServiceClient $client;

    public ProfileManagerBuilder$build$1(DefaultProfileServiceClient defaultProfileServiceClient) {
        this.$client = defaultProfileServiceClient;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // com.amazon.alexa.assistant.profile.AccountSnapshotProvider
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object getAccountSnapshot(kotlin.coroutines.Continuation<? super com.amazon.alexa.assistant.profile.AccountSnapshot> r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof com.amazon.alexa.assistant.profile.ProfileManagerBuilder$build$1$getAccountSnapshot$1
            if (r0 == 0) goto L13
            r0 = r5
            com.amazon.alexa.assistant.profile.ProfileManagerBuilder$build$1$getAccountSnapshot$1 r0 = (com.amazon.alexa.assistant.profile.ProfileManagerBuilder$build$1$getAccountSnapshot$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.amazon.alexa.assistant.profile.ProfileManagerBuilder$build$1$getAccountSnapshot$1 r0 = new com.amazon.alexa.assistant.profile.ProfileManagerBuilder$build$1$getAccountSnapshot$1
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L36
            if (r2 != r3) goto L2f
            kotlin.ResultKt.throwOnFailure(r5)
            kotlin.Result r5 = (kotlin.Result) r5
            java.lang.Object r4 = r5.getValue()
            goto L44
        L2f:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            rx.Single$$ExternalSyntheticBUOutline0.m$2(r4)
            r4 = 0
            return r4
        L36:
            kotlin.ResultKt.throwOnFailure(r5)
            com.amazon.alexa.assistant.profile.DefaultProfileServiceClient r4 = r4.$client
            r0.label = r3
            java.lang.Object r4 = r4.m15069getAccountSnapshotIoAF18A$voice_release(r0)
            if (r4 != r1) goto L44
            return r1
        L44:
            kotlin.ResultKt.throwOnFailure(r4)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.alexa.assistant.profile.ProfileManagerBuilder$build$1.getAccountSnapshot(kotlin.coroutines.Continuation):java.lang.Object");
    }
}
