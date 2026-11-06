package com.amazon.comms.calling.data.dataSource;

import com.amazon.comms.calling.data.util.Constants;
import com.amazon.comms.calling.data.util.SharedPrefConstants;
import com.amazon.comms.calling.data.util.SipConstants;
import com.amazon.comms.calling.foundation.features.FeatureCheck;
import com.amazon.comms.calling.foundation.features.providers.IdentityServiceProvider;
import com.amazon.comms.calling.foundation.storage.providers.StorageProvider;
import com.amazon.comms.log.CommsLogger;
import java.util.List;
import javax.inject.Inject;
import javax.inject.Named;
import javax.inject.Singleton;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Singleton
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B+\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0001\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\u001c\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t\u0018\u00010\u0011H\u0086@¢\u0006\u0002\u0010\u0013J\u001c\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t\u0018\u00010\u0011H\u0082@¢\u0006\u0002\u0010\u0013J\u0006\u0010\u0015\u001a\u00020\u0016J&\u0010\u0017\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t\u0018\u00010\u00112\u0006\u0010\u0018\u001a\u00020\t2\u0006\u0010\u0019\u001a\u00020\rH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t\u0018\u00010\u0011X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001a"}, d2 = {"Lcom/amazon/comms/calling/data/dataSource/AORDataSource;", "", "identityServiceProvider", "Lcom/amazon/comms/calling/foundation/features/providers/IdentityServiceProvider;", "sharedPreferenceStorageProvider", "Lcom/amazon/comms/calling/foundation/storage/providers/StorageProvider;", "featureCheck", "Lcom/amazon/comms/calling/foundation/features/FeatureCheck;", "baseUrl", "", "<init>", "(Lcom/amazon/comms/calling/foundation/features/providers/IdentityServiceProvider;Lcom/amazon/comms/calling/foundation/storage/providers/StorageProvider;Lcom/amazon/comms/calling/foundation/features/FeatureCheck;Ljava/lang/String;)V", "LOG", "Lcom/amazon/comms/log/CommsLogger;", "getLOG", "()Lcom/amazon/comms/log/CommsLogger;", "userNameAndDomainNamePair", "Lkotlin/Pair;", "getAor", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "fetchAor", "clearCache", "", "getUserNameAndDomainNameFromAOR", "userAOR", "logger", "AlexaCommsCallingUI-Android_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nAORDataSource.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AORDataSource.kt\ncom/amazon/comms/calling/data/dataSource/AORDataSource\n+ 2 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,106:1\n37#2:107\n36#2,3:108\n37#2:111\n36#2,3:112\n*S KotlinDebug\n*F\n+ 1 AORDataSource.kt\ncom/amazon/comms/calling/data/dataSource/AORDataSource\n*L\n76#1:107\n76#1:108,3\n81#1:111\n81#1:112,3\n*E\n"})
/* loaded from: classes20.dex */
public final class AORDataSource {

    @NotNull
    private final CommsLogger LOG;

    @NotNull
    private final String baseUrl;

    @NotNull
    private final FeatureCheck featureCheck;

    @NotNull
    private final IdentityServiceProvider identityServiceProvider;

    @NotNull
    private final StorageProvider sharedPreferenceStorageProvider;

    @Nullable
    private Pair<String, String> userNameAndDomainNamePair;

    @Inject
    public AORDataSource(@NotNull IdentityServiceProvider identityServiceProvider, @NotNull StorageProvider storageProvider, @NotNull FeatureCheck featureCheck, @Named("baseUrl") @NotNull String str) {
        identityServiceProvider.getClass();
        storageProvider.getClass();
        featureCheck.getClass();
        str.getClass();
        this.identityServiceProvider = identityServiceProvider;
        this.sharedPreferenceStorageProvider = storageProvider;
        this.featureCheck = featureCheck;
        this.baseUrl = str;
        CommsLogger logger = CommsLogger.getLogger(Constants.LOG_TAG, AORDataSource.class);
        logger.getClass();
        this.LOG = logger;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x005f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object fetchAor(kotlin.coroutines.Continuation<? super kotlin.Pair<java.lang.String, java.lang.String>> r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof com.amazon.comms.calling.data.dataSource.AORDataSource$fetchAor$1
            if (r0 == 0) goto L13
            r0 = r5
            com.amazon.comms.calling.data.dataSource.AORDataSource$fetchAor$1 r0 = (com.amazon.comms.calling.data.dataSource.AORDataSource$fetchAor$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.amazon.comms.calling.data.dataSource.AORDataSource$fetchAor$1 r0 = new com.amazon.comms.calling.data.dataSource.AORDataSource$fetchAor$1
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L34
            if (r2 != r3) goto L2d
            java.lang.Object r4 = r0.L$0
            com.amazon.comms.calling.data.dataSource.AORDataSource r4 = (com.amazon.comms.calling.data.dataSource.AORDataSource) r4
            kotlin.ResultKt.throwOnFailure(r5)
            goto L44
        L2d:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            rx.Single$$ExternalSyntheticBUOutline0.m$2(r4)
            r4 = 0
            return r4
        L34:
            kotlin.ResultKt.throwOnFailure(r5)
            com.amazon.comms.calling.foundation.features.providers.IdentityServiceProvider r5 = r4.identityServiceProvider
            r0.L$0 = r4
            r0.label = r3
            java.lang.Object r5 = r5.getAor(r0)
            if (r5 != r1) goto L44
            return r1
        L44:
            java.lang.String r5 = (java.lang.String) r5
            if (r5 == 0) goto L5f
            com.amazon.comms.log.CommsLogger r0 = r4.LOG
            java.lang.String r1 = "[Calling]: fetched AOR and saved to cache"
            r0.i(r1)
            com.amazon.comms.calling.foundation.storage.providers.StorageProvider r0 = r4.sharedPreferenceStorageProvider
            java.lang.String r1 = "aor_key"
            r0.put(r1, r5)
            com.amazon.comms.log.CommsLogger r0 = r4.LOG
            kotlin.Pair r5 = r4.getUserNameAndDomainNameFromAOR(r5, r0)
            r4.userNameAndDomainNamePair = r5
            return r5
        L5f:
            r4 = 0
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.comms.calling.data.dataSource.AORDataSource.fetchAor(kotlin.coroutines.Continuation):java.lang.Object");
    }

    private final Pair<String, String> getUserNameAndDomainNameFromAOR(String userAOR, CommsLogger logger) {
        List split$default;
        List split$default2;
        String str;
        boolean contains$default;
        split$default = StringsKt__StringsKt.split$default(userAOR, new String[]{"@"}, false, 0, 6, (Object) null);
        String[] strArr = (String[]) split$default.toArray(new String[0]);
        if (strArr.length != 2) {
            logger.e("Cannot find userName and domainName from AOR");
            return null;
        }
        split$default2 = StringsKt__StringsKt.split$default(strArr[0], new String[]{":"}, false, 0, 6, (Object) null);
        String[] strArr2 = (String[]) split$default2.toArray(new String[0]);
        if (strArr2.length != 2) {
            logger.e("Cannot find userName from AOR");
            return null;
        }
        String str2 = strArr2[1];
        if (this.featureCheck.isSIPModernizationEnabled()) {
            contains$default = StringsKt__StringsKt.contains$default(this.baseUrl, "gamma", false, 2, (Object) null);
            if (contains$default) {
                logger.i("SIPModernization is enabled >> routing to gamma");
                str = SipConstants.SIP_EDGE_GAMMA_DOMAIN;
            } else {
                logger.i("SIPModernization is enabled >> routing to prod");
                str = SipConstants.SIP_EDGE_PROD_DOMAIN;
            }
        } else {
            logger.i("SIPModernization is disabled");
            str = strArr[1];
        }
        return new Pair<>(str2, str);
    }

    public final void clearCache() {
        this.userNameAndDomainNamePair = null;
        this.sharedPreferenceStorageProvider.put(SharedPrefConstants.AOR_KEY, "");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object getAor(@org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super kotlin.Pair<java.lang.String, java.lang.String>> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof com.amazon.comms.calling.data.dataSource.AORDataSource$getAor$1
            if (r0 == 0) goto L13
            r0 = r6
            com.amazon.comms.calling.data.dataSource.AORDataSource$getAor$1 r0 = (com.amazon.comms.calling.data.dataSource.AORDataSource$getAor$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.amazon.comms.calling.data.dataSource.AORDataSource$getAor$1 r0 = new com.amazon.comms.calling.data.dataSource.AORDataSource$getAor$1
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L34
            if (r2 != r3) goto L2d
            java.lang.Object r5 = r0.L$0
            com.amazon.comms.calling.data.dataSource.AORDataSource r5 = (com.amazon.comms.calling.data.dataSource.AORDataSource) r5
            kotlin.ResultKt.throwOnFailure(r6)
            goto L6b
        L2d:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            rx.Single$$ExternalSyntheticBUOutline0.m$2(r5)
            r5 = 0
            return r5
        L34:
            kotlin.ResultKt.throwOnFailure(r6)
            kotlin.Pair<java.lang.String, java.lang.String> r6 = r5.userNameAndDomainNamePair
            if (r6 != 0) goto L6e
            com.amazon.comms.calling.foundation.storage.providers.StorageProvider r6 = r5.sharedPreferenceStorageProvider
            java.lang.String r2 = "aor_key"
            java.lang.String r4 = ""
            java.lang.Object r6 = r6.get(r2, r4)
            if (r6 == 0) goto L6b
            java.lang.String r6 = (java.lang.String) r6
            boolean r2 = org.apache.commons.lang3.StringUtils.isEmpty(r6)
            if (r2 == 0) goto L5a
            r0.L$0 = r5
            r0.label = r3
            java.lang.Object r6 = r5.fetchAor(r0)
            if (r6 != r1) goto L6b
            return r1
        L5a:
            com.amazon.comms.log.CommsLogger r0 = r5.LOG
            java.lang.String r1 = "[Calling]: return AOR from pref cache."
            r0.i(r1)
            com.amazon.comms.log.CommsLogger r0 = r5.LOG
            kotlin.Pair r6 = r5.getUserNameAndDomainNameFromAOR(r6, r0)
            r5.userNameAndDomainNamePair = r6
            kotlin.Unit r6 = kotlin.Unit.INSTANCE
        L6b:
            kotlin.Pair<java.lang.String, java.lang.String> r5 = r5.userNameAndDomainNamePair
            return r5
        L6e:
            com.amazon.comms.log.CommsLogger r6 = r5.LOG
            java.lang.String r0 = "[Calling]: return AOR from cache."
            r6.i(r0)
            kotlin.Pair<java.lang.String, java.lang.String> r5 = r5.userNameAndDomainNamePair
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.comms.calling.data.dataSource.AORDataSource.getAor(kotlin.coroutines.Continuation):java.lang.Object");
    }

    @NotNull
    public final CommsLogger getLOG() {
        return this.LOG;
    }
}
