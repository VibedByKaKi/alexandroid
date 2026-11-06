package com.amazon.alexa.marketplace.api;

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
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u001b\b\u0086\u0081\u0002\u0018\u0000 \u001d2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u001dB\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0003H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001c¨\u0006\u001e"}, d2 = {"Lcom/amazon/alexa/marketplace/api/MarketplaceName;", "", "marketplaceName", "", "(Ljava/lang/String;ILjava/lang/String;)V", "toString", "AU", "AU_DEVO", "BR", "BR_DEVO", "CA", "CN", "DE", "ES", "ES_DEVO", "FR", "GB", "ID", "ID_DEVO", "IN", "IT", "JP", "MX", "MX_DEVO", "NL", "NL_DEVO", "RU", "RU_DEVO", "US", "Companion", "AlexaMobileAndroidMarketplaceApi_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class MarketplaceName {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ MarketplaceName[] $VALUES;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE;

    @NotNull
    private final String marketplaceName;
    public static final MarketplaceName AU = new MarketplaceName("AU", 0, "AU");
    public static final MarketplaceName AU_DEVO = new MarketplaceName("AU_DEVO", 1, "AU_DEVO");
    public static final MarketplaceName BR = new MarketplaceName("BR", 2, "BR");
    public static final MarketplaceName BR_DEVO = new MarketplaceName("BR_DEVO", 3, "BR_DEVO");
    public static final MarketplaceName CA = new MarketplaceName("CA", 4, "CA");
    public static final MarketplaceName CN = new MarketplaceName("CN", 5, "CN");
    public static final MarketplaceName DE = new MarketplaceName("DE", 6, "DE");
    public static final MarketplaceName ES = new MarketplaceName("ES", 7, "ES");
    public static final MarketplaceName ES_DEVO = new MarketplaceName("ES_DEVO", 8, "ES_DEVO");
    public static final MarketplaceName FR = new MarketplaceName("FR", 9, "FR");
    public static final MarketplaceName GB = new MarketplaceName("GB", 10, "GB");
    public static final MarketplaceName ID = new MarketplaceName("ID", 11, "ID");
    public static final MarketplaceName ID_DEVO = new MarketplaceName("ID_DEVO", 12, "ID_DEVO");
    public static final MarketplaceName IN = new MarketplaceName("IN", 13, "IN");
    public static final MarketplaceName IT = new MarketplaceName("IT", 14, "IT");
    public static final MarketplaceName JP = new MarketplaceName("JP", 15, "JP");
    public static final MarketplaceName MX = new MarketplaceName("MX", 16, "MX");
    public static final MarketplaceName MX_DEVO = new MarketplaceName("MX_DEVO", 17, "MX_DEVO");
    public static final MarketplaceName NL = new MarketplaceName("NL", 18, "NL");
    public static final MarketplaceName NL_DEVO = new MarketplaceName("NL_DEVO", 19, "NL_DEVO");
    public static final MarketplaceName RU = new MarketplaceName("RU", 20, "RU");
    public static final MarketplaceName RU_DEVO = new MarketplaceName("RU_DEVO", 21, "RU_DEVO");
    public static final MarketplaceName US = new MarketplaceName("US", 22, "US");

    private static final /* synthetic */ MarketplaceName[] $values() {
        return new MarketplaceName[]{AU, AU_DEVO, BR, BR_DEVO, CA, CN, DE, ES, ES_DEVO, FR, GB, ID, ID_DEVO, IN, IT, JP, MX, MX_DEVO, NL, NL_DEVO, RU, RU_DEVO, US};
    }

    static {
        MarketplaceName[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
        INSTANCE = new Companion(null);
    }

    private MarketplaceName(String str, int i, String str2) {
        this.marketplaceName = str2;
    }

    @JvmStatic
    @Nullable
    public static final MarketplaceName fromString(@Nullable String str) {
        return INSTANCE.fromString(str);
    }

    @NotNull
    public static EnumEntries<MarketplaceName> getEntries() {
        return $ENTRIES;
    }

    public static MarketplaceName valueOf(String str) {
        return (MarketplaceName) Enum.valueOf(MarketplaceName.class, str);
    }

    public static MarketplaceName[] values() {
        return (MarketplaceName[]) $VALUES.clone();
    }

    @Override // java.lang.Enum
    @NotNull
    public String toString() {
        return this.marketplaceName;
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0014\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0007¨\u0006\u0007"}, d2 = {"Lcom/amazon/alexa/marketplace/api/MarketplaceName$Companion;", "", "()V", "fromString", "Lcom/amazon/alexa/marketplace/api/MarketplaceName;", "marketplaceName", "", "AlexaMobileAndroidMarketplaceApi_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nMarketplaceName.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MarketplaceName.kt\ncom/amazon/alexa/marketplace/api/MarketplaceName$Companion\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,108:1\n1282#2,2:109\n*S KotlinDebug\n*F\n+ 1 MarketplaceName.kt\ncom/amazon/alexa/marketplace/api/MarketplaceName$Companion\n*L\n105#1:109,2\n*E\n"})
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        @Nullable
        public final MarketplaceName fromString(@Nullable String marketplaceName) {
            for (MarketplaceName marketplaceName2 : MarketplaceName.values()) {
                if (Intrinsics.areEqual(marketplaceName2.toString(), marketplaceName)) {
                    return marketplaceName2;
                }
            }
            return null;
        }

        private Companion() {
        }
    }
}
