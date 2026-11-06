package com.amazon.alexa.marketplace.api;

import com.amazon.whisperjoin.common.sharedtypes.provisioning.data.locale.LocaleInfo;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u001b\b\u0086\u0081\u0002\u0018\u0000 \u001d2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u001dB\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0003H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001c¨\u0006\u001e"}, d2 = {"Lcom/amazon/alexa/marketplace/api/MarketplaceId;", "", "marketplaceId", "", "(Ljava/lang/String;ILjava/lang/String;)V", "toString", "CA", "CN", "COM", "COM_AU_DEVO", "COM_AU_PROD", "COM_BR_DEVO", "COM_BR_PROD", "COM_MX_DEVO", "COM_MX_PROD", "CO_ID_DEVO", "CO_ID_PROD", "CO_JP", "CO_UK", "DE", "ES_DEVO", "ES_PROD", "FR", "IN", "IT_PROD", "NL_DEVO", "NL_PROD", "RU_DEVO", "RU_PROD", "Companion", "AlexaMobileAndroidMarketplaceApi_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class MarketplaceId {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ MarketplaceId[] $VALUES;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE;

    @NotNull
    private final String marketplaceId;
    public static final MarketplaceId CA = new MarketplaceId("CA", 0, LocaleInfo.ObfuscatedMarketplaceId.CA_MARKETPLACE_ID);
    public static final MarketplaceId CN = new MarketplaceId("CN", 1, LocaleInfo.ObfuscatedMarketplaceId.CN_MARKETPLACE_ID);
    public static final MarketplaceId COM = new MarketplaceId("COM", 2, LocaleInfo.ObfuscatedMarketplaceId.US_MARKETPLACE_ID);
    public static final MarketplaceId COM_AU_DEVO = new MarketplaceId("COM_AU_DEVO", 3, "A1RNPCQ4K8U27I");
    public static final MarketplaceId COM_AU_PROD = new MarketplaceId("COM_AU_PROD", 4, LocaleInfo.ObfuscatedMarketplaceId.AU_MARKETPLACE_ID);
    public static final MarketplaceId COM_BR_DEVO = new MarketplaceId("COM_BR_DEVO", 5, "AZXD3QD5B39HD");
    public static final MarketplaceId COM_BR_PROD = new MarketplaceId("COM_BR_PROD", 6, LocaleInfo.ObfuscatedMarketplaceId.BR_MARKETPLACE_ID);
    public static final MarketplaceId COM_MX_DEVO = new MarketplaceId("COM_MX_DEVO", 7, "A3P3J5A7D2ZVXI");
    public static final MarketplaceId COM_MX_PROD = new MarketplaceId("COM_MX_PROD", 8, LocaleInfo.ObfuscatedMarketplaceId.MX_MARKETPLACE_ID);
    public static final MarketplaceId CO_ID_DEVO = new MarketplaceId("CO_ID_DEVO", 9, "A3AXUV5MEX8R86");
    public static final MarketplaceId CO_ID_PROD = new MarketplaceId("CO_ID_PROD", 10, "A3BUE4CVFSERTV");
    public static final MarketplaceId CO_JP = new MarketplaceId("CO_JP", 11, LocaleInfo.ObfuscatedMarketplaceId.JP_MARKETPLACE_ID);
    public static final MarketplaceId CO_UK = new MarketplaceId("CO_UK", 12, LocaleInfo.ObfuscatedMarketplaceId.UK_MARKETPLACE_ID);
    public static final MarketplaceId DE = new MarketplaceId("DE", 13, LocaleInfo.ObfuscatedMarketplaceId.DE_MARKETPLACE_ID);
    public static final MarketplaceId ES_DEVO = new MarketplaceId("ES_DEVO", 14, "AJZF8LZ1EJVJN");
    public static final MarketplaceId ES_PROD = new MarketplaceId("ES_PROD", 15, LocaleInfo.ObfuscatedMarketplaceId.ES_MARKETPLACE_ID);
    public static final MarketplaceId FR = new MarketplaceId("FR", 16, LocaleInfo.ObfuscatedMarketplaceId.FR_MARKETPLACE_ID);
    public static final MarketplaceId IN = new MarketplaceId("IN", 17, LocaleInfo.ObfuscatedMarketplaceId.IN_MARKETPLACE_ID);
    public static final MarketplaceId IT_PROD = new MarketplaceId("IT_PROD", 18, LocaleInfo.ObfuscatedMarketplaceId.IT_MARKETPLACE_ID);
    public static final MarketplaceId NL_DEVO = new MarketplaceId("NL_DEVO", 19, "A1M3WC0SJ3A38T");
    public static final MarketplaceId NL_PROD = new MarketplaceId("NL_PROD", 20, LocaleInfo.ObfuscatedMarketplaceId.NL_MARKETPLACE_ID);
    public static final MarketplaceId RU_DEVO = new MarketplaceId("RU_DEVO", 21, "A38NPJYVS5YHNH");
    public static final MarketplaceId RU_PROD = new MarketplaceId("RU_PROD", 22, LocaleInfo.ObfuscatedMarketplaceId.RU_MARKETPLACE_ID);

    private static final /* synthetic */ MarketplaceId[] $values() {
        return new MarketplaceId[]{CA, CN, COM, COM_AU_DEVO, COM_AU_PROD, COM_BR_DEVO, COM_BR_PROD, COM_MX_DEVO, COM_MX_PROD, CO_ID_DEVO, CO_ID_PROD, CO_JP, CO_UK, DE, ES_DEVO, ES_PROD, FR, IN, IT_PROD, NL_DEVO, NL_PROD, RU_DEVO, RU_PROD};
    }

    static {
        MarketplaceId[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
        INSTANCE = new Companion(null);
    }

    private MarketplaceId(String str, int i, String str2) {
        this.marketplaceId = str2;
    }

    @JvmStatic
    @Nullable
    public static final MarketplaceId fromString(@Nullable String str) {
        return INSTANCE.fromString(str);
    }

    @NotNull
    public static EnumEntries<MarketplaceId> getEntries() {
        return $ENTRIES;
    }

    public static MarketplaceId valueOf(String str) {
        return (MarketplaceId) Enum.valueOf(MarketplaceId.class, str);
    }

    public static MarketplaceId[] values() {
        return (MarketplaceId[]) $VALUES.clone();
    }

    @Override // java.lang.Enum
    @NotNull
    public String toString() {
        return this.marketplaceId;
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0014\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0007¨\u0006\u0007"}, d2 = {"Lcom/amazon/alexa/marketplace/api/MarketplaceId$Companion;", "", "()V", "fromString", "Lcom/amazon/alexa/marketplace/api/MarketplaceId;", "marketplaceId", "", "AlexaMobileAndroidMarketplaceApi_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nMarketplaceId.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MarketplaceId.kt\ncom/amazon/alexa/marketplace/api/MarketplaceId$Companion\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,110:1\n1282#2,2:111\n*S KotlinDebug\n*F\n+ 1 MarketplaceId.kt\ncom/amazon/alexa/marketplace/api/MarketplaceId$Companion\n*L\n107#1:111,2\n*E\n"})
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        @Nullable
        public final MarketplaceId fromString(@Nullable String marketplaceId) {
            for (MarketplaceId marketplaceId2 : MarketplaceId.values()) {
                if (Intrinsics.areEqual(marketplaceId2.toString(), marketplaceId)) {
                    return marketplaceId2;
                }
            }
            return null;
        }

        private Companion() {
        }
    }
}
