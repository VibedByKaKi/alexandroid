package com.amazon.alexa.protocols.marketplace;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'AUSTRALIA_DEVELOPMENT' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByField(EnumVisitor.java:372)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByWrappedInsn(EnumVisitor.java:337)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:322)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInvoke(EnumVisitor.java:293)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:266)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes18.dex */
public final class Marketplace {
    private static final /* synthetic */ Marketplace[] $VALUES;
    public static final Marketplace AUSTRALIA_DEVELOPMENT;
    public static final Marketplace AUSTRALIA_PRODUCTION;
    public static final Marketplace BRAZIL_DEVELOPMENT;
    public static final Marketplace BRAZIL_PRODUCTION;
    public static final Marketplace CANADA;
    public static final Marketplace CHINA;
    public static final Marketplace FRANCE;
    public static final Marketplace GERMANY;
    public static final Marketplace INDIA;
    public static final Marketplace INDONESIA_DEVELOPMENT;
    public static final Marketplace INDONESIA_PRODUCTION;
    public static final Marketplace ITALY_PRODUCTION;
    public static final Marketplace JAPAN;
    public static final Marketplace MEXICO_DEVELOPMENT;
    public static final Marketplace MEXICO_PRODUCTION;
    public static final Marketplace NETHERLANDS_DEVELOPMENT;
    public static final Marketplace NETHERLANDS_PRODUCTION;
    public static final Marketplace RUSSIA_DEVELOPMENT;
    public static final Marketplace RUSSIA_PRODUCTION;
    public static final Marketplace SPAIN;
    public static final Marketplace SPAIN_DEVELOPMENT;
    public static final Marketplace UNITED_KINGDOM;
    public static final Marketplace USA;
    private final CountryCode countryCode;
    private final MarketplaceName marketplaceName;
    private final MarketplaceId obfuscatedId;
    private final Region region;

    private static /* synthetic */ Marketplace[] $values() {
        return new Marketplace[]{AUSTRALIA_DEVELOPMENT, AUSTRALIA_PRODUCTION, BRAZIL_DEVELOPMENT, BRAZIL_PRODUCTION, CANADA, CHINA, FRANCE, GERMANY, INDIA, INDONESIA_DEVELOPMENT, INDONESIA_PRODUCTION, ITALY_PRODUCTION, JAPAN, MEXICO_DEVELOPMENT, MEXICO_PRODUCTION, NETHERLANDS_DEVELOPMENT, NETHERLANDS_PRODUCTION, RUSSIA_DEVELOPMENT, RUSSIA_PRODUCTION, SPAIN, SPAIN_DEVELOPMENT, UNITED_KINGDOM, USA};
    }

    static {
        MarketplaceName marketplaceName = MarketplaceName.AU_DEVO;
        CountryCode countryCode = CountryCode.AU;
        MarketplaceId marketplaceId = MarketplaceId.COM_AU_DEVO;
        Region region = Region.FAR_EAST;
        AUSTRALIA_DEVELOPMENT = new Marketplace("AUSTRALIA_DEVELOPMENT", 0, marketplaceName, countryCode, marketplaceId, region);
        AUSTRALIA_PRODUCTION = new Marketplace("AUSTRALIA_PRODUCTION", 1, MarketplaceName.AU, countryCode, MarketplaceId.COM_AU_PROD, region);
        MarketplaceName marketplaceName2 = MarketplaceName.BR_DEVO;
        CountryCode countryCode2 = CountryCode.BR;
        MarketplaceId marketplaceId2 = MarketplaceId.COM_BR_DEVO;
        Region region2 = Region.NORTH_AMERICA_AND_WORLD;
        BRAZIL_DEVELOPMENT = new Marketplace("BRAZIL_DEVELOPMENT", 2, marketplaceName2, countryCode2, marketplaceId2, region2);
        BRAZIL_PRODUCTION = new Marketplace("BRAZIL_PRODUCTION", 3, MarketplaceName.BR, countryCode2, MarketplaceId.COM_BR_PROD, region2);
        CANADA = new Marketplace("CANADA", 4, MarketplaceName.CA, CountryCode.CA, MarketplaceId.CA, region2);
        CHINA = new Marketplace("CHINA", 5, MarketplaceName.CN, CountryCode.CN, MarketplaceId.CN, region2);
        MarketplaceName marketplaceName3 = MarketplaceName.FR;
        CountryCode countryCode3 = CountryCode.FR;
        MarketplaceId marketplaceId3 = MarketplaceId.FR;
        Region region3 = Region.EUROPE;
        FRANCE = new Marketplace("FRANCE", 6, marketplaceName3, countryCode3, marketplaceId3, region3);
        GERMANY = new Marketplace("GERMANY", 7, MarketplaceName.DE, CountryCode.DE, MarketplaceId.DE, region3);
        INDIA = new Marketplace("INDIA", 8, MarketplaceName.IN, CountryCode.IN, MarketplaceId.IN, region3);
        MarketplaceName marketplaceName4 = MarketplaceName.ID_DEVO;
        CountryCode countryCode4 = CountryCode.US;
        INDONESIA_DEVELOPMENT = new Marketplace("INDONESIA_DEVELOPMENT", 9, marketplaceName4, countryCode4, MarketplaceId.CO_ID_DEVO, region2);
        INDONESIA_PRODUCTION = new Marketplace("INDONESIA_PRODUCTION", 10, MarketplaceName.ID, countryCode4, MarketplaceId.CO_ID_PROD, region2);
        ITALY_PRODUCTION = new Marketplace("ITALY_PRODUCTION", 11, MarketplaceName.IT, CountryCode.IT, MarketplaceId.IT_PROD, region3);
        JAPAN = new Marketplace("JAPAN", 12, MarketplaceName.JP, CountryCode.JP, MarketplaceId.CO_JP, region);
        MarketplaceName marketplaceName5 = MarketplaceName.MX_DEVO;
        CountryCode countryCode5 = CountryCode.MX;
        MEXICO_DEVELOPMENT = new Marketplace("MEXICO_DEVELOPMENT", 13, marketplaceName5, countryCode5, MarketplaceId.COM_MX_DEVO, region2);
        MEXICO_PRODUCTION = new Marketplace("MEXICO_PRODUCTION", 14, MarketplaceName.MX, countryCode5, MarketplaceId.COM_MX_PROD, region2);
        MarketplaceName marketplaceName6 = MarketplaceName.NL_DEVO;
        CountryCode countryCode6 = CountryCode.NL;
        NETHERLANDS_DEVELOPMENT = new Marketplace("NETHERLANDS_DEVELOPMENT", 15, marketplaceName6, countryCode6, MarketplaceId.NL_DEVO, region3);
        NETHERLANDS_PRODUCTION = new Marketplace("NETHERLANDS_PRODUCTION", 16, MarketplaceName.NL, countryCode6, MarketplaceId.NL_PROD, region3);
        MarketplaceName marketplaceName7 = MarketplaceName.RU_DEVO;
        CountryCode countryCode7 = CountryCode.GB;
        RUSSIA_DEVELOPMENT = new Marketplace("RUSSIA_DEVELOPMENT", 17, marketplaceName7, countryCode7, MarketplaceId.RU_DEVO, region3);
        RUSSIA_PRODUCTION = new Marketplace("RUSSIA_PRODUCTION", 18, MarketplaceName.RU, countryCode7, MarketplaceId.RU_PROD, region3);
        MarketplaceName marketplaceName8 = MarketplaceName.ES;
        CountryCode countryCode8 = CountryCode.ES;
        SPAIN = new Marketplace("SPAIN", 19, marketplaceName8, countryCode8, MarketplaceId.ES_PROD, region3);
        SPAIN_DEVELOPMENT = new Marketplace("SPAIN_DEVELOPMENT", 20, MarketplaceName.ES_DEVO, countryCode8, MarketplaceId.ES_DEVO, region3);
        UNITED_KINGDOM = new Marketplace("UNITED_KINGDOM", 21, MarketplaceName.GB, countryCode7, MarketplaceId.CO_UK, region3);
        USA = new Marketplace("USA", 22, MarketplaceName.US, countryCode4, MarketplaceId.COM, region2);
        $VALUES = $values();
    }

    private Marketplace(@NonNull String str, @NonNull int i, @NonNull MarketplaceName marketplaceName, @NonNull CountryCode countryCode, MarketplaceId marketplaceId, Region region) {
        this.marketplaceName = marketplaceName;
        this.countryCode = countryCode;
        this.obfuscatedId = marketplaceId;
        this.region = region;
    }

    @Nullable
    public static Marketplace findMarketplaceById(@Nullable String str, @Nullable Marketplace marketplace) {
        for (Marketplace marketplace2 : values()) {
            if (marketplace2.getObfuscatedId().equals(MarketplaceId.fromString(str))) {
                return marketplace2;
            }
        }
        return marketplace;
    }

    @Nullable
    public static Marketplace findMarketplaceByName(@Nullable String str, @Nullable Marketplace marketplace) {
        for (Marketplace marketplace2 : values()) {
            if (marketplace2.getMarketplaceName().equals(MarketplaceName.fromString(str))) {
                return marketplace2;
            }
        }
        return "UK".equals(str) ? UNITED_KINGDOM : marketplace;
    }

    public static Marketplace valueOf(String str) {
        return (Marketplace) Enum.valueOf(Marketplace.class, str);
    }

    public static Marketplace[] values() {
        return (Marketplace[]) $VALUES.clone();
    }

    @NonNull
    public CountryCode getCountryCode() {
        return this.countryCode;
    }

    @NonNull
    public MarketplaceName getMarketplaceName() {
        return this.marketplaceName;
    }

    @NonNull
    public MarketplaceId getObfuscatedId() {
        return this.obfuscatedId;
    }

    @NonNull
    public Region getRegion() {
        return this.region;
    }
}
