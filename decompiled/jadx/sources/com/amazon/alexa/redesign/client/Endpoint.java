package com.amazon.alexa.redesign.client;

import androidx.compose.runtime.internal.StabilityInferred;
import com.amazon.alexa.identity.api.IdentityService;
import com.amazon.alexa.identity.api.UserIdentity;
import com.amazon.alexa.marketplace.api.Marketplace;
import com.amazon.alexa.marketplace.api.MarketplaceId;
import com.amazon.alexa.protocols.environment.EnvironmentService;
import com.amazon.alexa.protocols.service.api.ComponentRegistry;
import com.amazon.credentiallocker.CustomerRegion;
import com.amazon.whisperjoin.common.sharedtypes.provisioning.data.locale.LocaleInfo;
import defpackage.a$$ExternalSyntheticOutline0;
import java.util.Map;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u000b\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u000b\u001a\u00020\u0006J\u0010\u0010\f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u0006H\u0002J\u0010\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u0006H\u0002J\u0018\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u0006H\u0002R\u001d\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u001d\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b¨\u0006\u0011"}, d2 = {"Lcom/amazon/alexa/redesign/client/Endpoint;", "", "<init>", "()V", "REALM_BY_MARKETPLACE", "", "", "getREALM_BY_MARKETPLACE", "()Ljava/util/Map;", "REGION_BY_REALM", "getREGION_BY_REALM", "cosmoBaseUrl", "realmForMarketplace", "marketplaceId", "resolveStage", "stage", "region", "AlexaMobileAndroidHomeChannel_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes19.dex */
public final class Endpoint {

    @NotNull
    public static final Endpoint INSTANCE = new Endpoint();

    @NotNull
    private static final Map<String, String> REALM_BY_MARKETPLACE = MapsKt.mapOf(TuplesKt.to(LocaleInfo.ObfuscatedMarketplaceId.US_MARKETPLACE_ID, CustomerRegion.NA), TuplesKt.to(LocaleInfo.ObfuscatedMarketplaceId.CA_MARKETPLACE_ID, CustomerRegion.NA), TuplesKt.to(LocaleInfo.ObfuscatedMarketplaceId.CN_MARKETPLACE_ID, CustomerRegion.NA), TuplesKt.to(LocaleInfo.ObfuscatedMarketplaceId.BR_MARKETPLACE_ID, CustomerRegion.NA), TuplesKt.to("AZXD3QD5B39HD", CustomerRegion.NA), TuplesKt.to(LocaleInfo.ObfuscatedMarketplaceId.MX_MARKETPLACE_ID, CustomerRegion.NA), TuplesKt.to("A3P3J5A7D2ZVXI", CustomerRegion.NA), TuplesKt.to(LocaleInfo.ObfuscatedMarketplaceId.UK_MARKETPLACE_ID, CustomerRegion.EU), TuplesKt.to(LocaleInfo.ObfuscatedMarketplaceId.DE_MARKETPLACE_ID, CustomerRegion.EU), TuplesKt.to(LocaleInfo.ObfuscatedMarketplaceId.FR_MARKETPLACE_ID, CustomerRegion.EU), TuplesKt.to(LocaleInfo.ObfuscatedMarketplaceId.ES_MARKETPLACE_ID, CustomerRegion.EU), TuplesKt.to("AJZF8LZ1EJVJN", CustomerRegion.EU), TuplesKt.to(LocaleInfo.ObfuscatedMarketplaceId.IT_MARKETPLACE_ID, CustomerRegion.EU), TuplesKt.to("A3HOBANJMCMD83", CustomerRegion.EU), TuplesKt.to(LocaleInfo.ObfuscatedMarketplaceId.NL_MARKETPLACE_ID, CustomerRegion.EU), TuplesKt.to("A1M3WC0SJ3A38T", CustomerRegion.EU), TuplesKt.to(LocaleInfo.ObfuscatedMarketplaceId.IN_MARKETPLACE_ID, CustomerRegion.EU), TuplesKt.to("A2XZLSVIQ0F4JT", CustomerRegion.EU), TuplesKt.to(LocaleInfo.ObfuscatedMarketplaceId.JP_MARKETPLACE_ID, "FE"), TuplesKt.to(LocaleInfo.ObfuscatedMarketplaceId.AU_MARKETPLACE_ID, "FE"), TuplesKt.to("A1RNPCQ4K8U27I", "FE"));

    @NotNull
    private static final Map<String, String> REGION_BY_REALM = MapsKt.mapOf(TuplesKt.to(CustomerRegion.NA, "iad"), TuplesKt.to(CustomerRegion.EU, "zaz"), TuplesKt.to("FE", "pdx"));
    public static final int $stable = 8;

    private Endpoint() {
    }

    private final String realmForMarketplace(String marketplaceId) {
        return REALM_BY_MARKETPLACE.getOrDefault(marketplaceId, CustomerRegion.NA);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x002e A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.String resolveStage(java.lang.String r2) {
        /*
            r1 = this;
            int r1 = r2.hashCode()
            java.lang.String r0 = "beta"
            switch(r1) {
                case 99349: goto L23;
                case 3020272: goto L1c;
                case 92909918: goto L13;
                case 103145323: goto La;
                default: goto L9;
            }
        L9:
            goto L2b
        La:
            java.lang.String r1 = "local"
            boolean r1 = r2.equals(r1)
            if (r1 == 0) goto L2b
            goto L2e
        L13:
            java.lang.String r1 = "alpha"
            boolean r1 = r2.equals(r1)
            if (r1 != 0) goto L2e
            goto L2b
        L1c:
            boolean r1 = r2.equals(r0)
            if (r1 != 0) goto L2e
            goto L2b
        L23:
            java.lang.String r1 = "dev"
            boolean r1 = r2.equals(r1)
            if (r1 != 0) goto L2e
        L2b:
            java.lang.String r1 = "prod"
            return r1
        L2e:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.alexa.redesign.client.Endpoint.resolveStage(java.lang.String):java.lang.String");
    }

    @NotNull
    public final String cosmoBaseUrl() {
        Object obj;
        Object obj2;
        String str;
        MarketplaceId obfuscatedId;
        obj = ComponentRegistry.getInstance().get(IdentityService.class).get();
        obj2 = ComponentRegistry.getInstance().get(EnvironmentService.class).get();
        EnvironmentService environmentService = (EnvironmentService) obj2;
        UserIdentity user = ((IdentityService) obj).getUser("AlexaMobileHome");
        Marketplace marketplace = user != null ? user.getMarketplace() : null;
        if (marketplace == null || (obfuscatedId = marketplace.getObfuscatedId()) == null || (str = obfuscatedId.getMarketplaceId()) == null) {
            str = CustomerRegion.NA;
        }
        String orDefault = REGION_BY_REALM.getOrDefault(realmForMarketplace(str), "iad");
        String buildStage = environmentService.getBuildStage();
        buildStage.getClass();
        return cosmoBaseUrl(resolveStage(buildStage), orDefault);
    }

    @NotNull
    public final Map<String, String> getREALM_BY_MARKETPLACE() {
        return REALM_BY_MARKETPLACE;
    }

    @NotNull
    public final Map<String, String> getREGION_BY_REALM() {
        return REGION_BY_REALM;
    }

    private final String cosmoBaseUrl(String stage, String region) {
        return a$$ExternalSyntheticOutline0.m("api.", stage, "-", region, ".cosmo.alexa.amazon.dev");
    }
}
