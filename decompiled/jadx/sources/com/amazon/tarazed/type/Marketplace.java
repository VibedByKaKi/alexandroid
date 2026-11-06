package com.amazon.tarazed.type;

import com.amazon.whisperjoin.common.sharedtypes.provisioning.data.locale.LocaleInfo;
import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public enum Marketplace {
    US(LocaleInfo.ObfuscatedMarketplaceId.US_MARKETPLACE_ID),
    UK(LocaleInfo.ObfuscatedMarketplaceId.UK_MARKETPLACE_ID),
    DE(LocaleInfo.ObfuscatedMarketplaceId.DE_MARKETPLACE_ID),
    FR(LocaleInfo.ObfuscatedMarketplaceId.FR_MARKETPLACE_ID),
    ES(LocaleInfo.ObfuscatedMarketplaceId.ES_MARKETPLACE_ID, "AJZF8LZ1EJVJN"),
    IN(LocaleInfo.ObfuscatedMarketplaceId.IN_MARKETPLACE_ID, "A2XZLSVIQ0F4JT"),
    IT(LocaleInfo.ObfuscatedMarketplaceId.IT_MARKETPLACE_ID, "A3HOBANJMCMD83"),
    JP(LocaleInfo.ObfuscatedMarketplaceId.JP_MARKETPLACE_ID),
    CA(LocaleInfo.ObfuscatedMarketplaceId.CA_MARKETPLACE_ID),
    AU(LocaleInfo.ObfuscatedMarketplaceId.AU_MARKETPLACE_ID, "A1RNPCQ4K8U27I"),
    BR(LocaleInfo.ObfuscatedMarketplaceId.BR_MARKETPLACE_ID, "AZXD3QD5B39HD"),
    MX(LocaleInfo.ObfuscatedMarketplaceId.MX_MARKETPLACE_ID, "A3P3J5A7D2ZVXI"),
    AE(LocaleInfo.ObfuscatedMarketplaceId.AE_MARKETPLACE_ID, "A34GYYCZVDBSIK"),
    BE("AMEN7PMS3EDWL", "A1YFOMBPFBRY22"),
    EG("ARBP9OOSHTCHU", "AUJPM9XGFJRC7"),
    NL(LocaleInfo.ObfuscatedMarketplaceId.NL_MARKETPLACE_ID, "A1M3WC0SJ3A38T"),
    PL("A1C3SOZRARQ6R3", "AKY4K4WKH21YQ"),
    SA(LocaleInfo.ObfuscatedMarketplaceId.SA_MARKETPLACE_ID, "A1MQPSGJ6U9Q54"),
    SG("A19VAU5U5O7RUS", "A1DQ6JV7I20JSG"),
    SE("A2NODRKZP88ZB9", "AT614YYYNOC1S"),
    TR(LocaleInfo.ObfuscatedMarketplaceId.TR_MARKETPLACE_ID, "A3CQBQD3RGPJR8"),
    IE("A28R8C7NBKEWEA", "AQGJ466SKA0F0");

    private static final Map<String, Marketplace> MARKETPLACE_ID_MAP = new HashMap();
    private final String devoMarketplaceId;
    private final String prodMarketplaceId;

    static {
        for (Marketplace marketplace : values()) {
            Map<String, Marketplace> map = MARKETPLACE_ID_MAP;
            map.put(marketplace.getProdMarketplaceId(), marketplace);
            map.put(marketplace.getDevoMarketplaceId(), marketplace);
        }
    }

    Marketplace(String str) {
        this.prodMarketplaceId = str;
        this.devoMarketplaceId = str;
    }

    public static Marketplace fromMarketplaceId(String str) {
        Marketplace marketplace = MARKETPLACE_ID_MAP.get(str);
        if (marketplace != null) {
            return marketplace;
        }
        throw new UnknownMarketplaceException("Unknown marketplaceId requested");
    }

    public String getDevoMarketplaceId() {
        return this.devoMarketplaceId;
    }

    public String getProdMarketplaceId() {
        return this.prodMarketplaceId;
    }

    Marketplace(String str, String str2) {
        this.prodMarketplaceId = str;
        this.devoMarketplaceId = str2;
    }
}
