package com.amazon.alexa.marketplace.api;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\"\b\u0086\u0081\u0002\u0018\u0000 *2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001*B'\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001fj\u0002\b j\u0002\b!j\u0002\b\"j\u0002\b#j\u0002\b$j\u0002\b%j\u0002\b&j\u0002\b'j\u0002\b(j\u0002\b)¨\u0006+"}, d2 = {"Lcom/amazon/alexa/marketplace/api/Marketplace;", "", "marketplaceName", "Lcom/amazon/alexa/marketplace/api/MarketplaceName;", "countryCode", "Lcom/amazon/alexa/marketplace/api/CountryCode;", "obfuscatedId", "Lcom/amazon/alexa/marketplace/api/MarketplaceId;", "region", "Lcom/amazon/alexa/marketplace/api/Region;", "(Ljava/lang/String;ILcom/amazon/alexa/marketplace/api/MarketplaceName;Lcom/amazon/alexa/marketplace/api/CountryCode;Lcom/amazon/alexa/marketplace/api/MarketplaceId;Lcom/amazon/alexa/marketplace/api/Region;)V", "getCountryCode", "()Lcom/amazon/alexa/marketplace/api/CountryCode;", "getMarketplaceName", "()Lcom/amazon/alexa/marketplace/api/MarketplaceName;", "getObfuscatedId", "()Lcom/amazon/alexa/marketplace/api/MarketplaceId;", "getRegion", "()Lcom/amazon/alexa/marketplace/api/Region;", "AUSTRALIA_DEVELOPMENT", "AUSTRALIA_PRODUCTION", "BRAZIL_DEVELOPMENT", "BRAZIL_PRODUCTION", "CANADA", "CHINA", "FRANCE", "GERMANY", "INDIA", "INDONESIA_DEVELOPMENT", "INDONESIA_PRODUCTION", "ITALY_PRODUCTION", "JAPAN", "MEXICO_DEVELOPMENT", "MEXICO_PRODUCTION", "NETHERLANDS_DEVELOPMENT", "NETHERLANDS_PRODUCTION", "RUSSIA_DEVELOPMENT", "RUSSIA_PRODUCTION", "SPAIN", "SPAIN_DEVELOPMENT", "UNITED_KINGDOM", "USA", "Companion", "AlexaMobileAndroidMarketplaceApi_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class Marketplace {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ Marketplace[] $VALUES;
    public static final Marketplace AUSTRALIA_DEVELOPMENT;
    public static final Marketplace AUSTRALIA_PRODUCTION;
    public static final Marketplace BRAZIL_DEVELOPMENT;
    public static final Marketplace BRAZIL_PRODUCTION;
    public static final Marketplace CANADA;
    public static final Marketplace CHINA;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE;
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

    @NotNull
    private final CountryCode countryCode;

    @NotNull
    private final MarketplaceName marketplaceName;

    @NotNull
    private final MarketplaceId obfuscatedId;

    @NotNull
    private final Region region;

    private static final /* synthetic */ Marketplace[] $values() {
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
        Marketplace[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
        INSTANCE = new Companion(null);
    }

    private Marketplace(String str, int i, MarketplaceName marketplaceName, CountryCode countryCode, MarketplaceId marketplaceId, Region region) {
        this.marketplaceName = marketplaceName;
        this.countryCode = countryCode;
        this.obfuscatedId = marketplaceId;
        this.region = region;
    }

    @JvmStatic
    @Nullable
    public static final Marketplace findMarketplaceById(@Nullable String str, @Nullable Marketplace marketplace) {
        return INSTANCE.findMarketplaceById(str, marketplace);
    }

    @JvmStatic
    @Nullable
    public static final Marketplace findMarketplaceByName(@Nullable String str, @Nullable Marketplace marketplace) {
        return INSTANCE.findMarketplaceByName(str, marketplace);
    }

    @NotNull
    public static EnumEntries<Marketplace> getEntries() {
        return $ENTRIES;
    }

    public static Marketplace valueOf(String str) {
        return (Marketplace) Enum.valueOf(Marketplace.class, str);
    }

    public static Marketplace[] values() {
        return (Marketplace[]) $VALUES.clone();
    }

    @NotNull
    public final CountryCode getCountryCode() {
        return this.countryCode;
    }

    @NotNull
    public final MarketplaceName getMarketplaceName() {
        return this.marketplaceName;
    }

    @NotNull
    public final MarketplaceId getObfuscatedId() {
        return this.obfuscatedId;
    }

    @NotNull
    public final Region getRegion() {
        return this.region;
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001e\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004H\u0007J\u001e\u0010\b\u001a\u0004\u0018\u00010\u00042\b\u0010\t\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004H\u0007¨\u0006\n"}, d2 = {"Lcom/amazon/alexa/marketplace/api/Marketplace$Companion;", "", "()V", "findMarketplaceById", "Lcom/amazon/alexa/marketplace/api/Marketplace;", "obfuscatedMarketplaceIdString", "", "defaultMarketplace", "findMarketplaceByName", "marketplaceNameString", "AlexaMobileAndroidMarketplaceApi_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        @Nullable
        public final Marketplace findMarketplaceById(@Nullable String obfuscatedMarketplaceIdString, @Nullable Marketplace defaultMarketplace) {
            for (Marketplace marketplace : Marketplace.values()) {
                if (marketplace.getObfuscatedId() == MarketplaceId.INSTANCE.fromString(obfuscatedMarketplaceIdString)) {
                    return marketplace;
                }
            }
            return defaultMarketplace;
        }

        @JvmStatic
        @Nullable
        public final Marketplace findMarketplaceByName(@Nullable String marketplaceNameString, @Nullable Marketplace defaultMarketplace) {
            for (Marketplace marketplace : Marketplace.values()) {
                if (marketplace.getMarketplaceName() == MarketplaceName.INSTANCE.fromString(marketplaceNameString)) {
                    return marketplace;
                }
            }
            return Intrinsics.areEqual("UK", marketplaceNameString) ? Marketplace.UNITED_KINGDOM : defaultMarketplace;
        }

        private Companion() {
        }
    }
}
