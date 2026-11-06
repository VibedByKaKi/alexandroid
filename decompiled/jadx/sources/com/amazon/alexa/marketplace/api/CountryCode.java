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
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0013\b\u0086\u0081\u0002\u0018\u0000 \u00152\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0015B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0003H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014¨\u0006\u0016"}, d2 = {"Lcom/amazon/alexa/marketplace/api/CountryCode;", "", "countryCode", "", "(Ljava/lang/String;ILjava/lang/String;)V", "toString", "AU", "BR", "CA", "CN", "DE", "ES", "FR", "GB", "IN", "IT", "JP", "MX", "NL", "US", "SA", "Companion", "AlexaMobileAndroidMarketplaceApi_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class CountryCode {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ CountryCode[] $VALUES;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE;

    @NotNull
    private final String countryCode;
    public static final CountryCode AU = new CountryCode("AU", 0, "AU");
    public static final CountryCode BR = new CountryCode("BR", 1, "BR");
    public static final CountryCode CA = new CountryCode("CA", 2, "CA");
    public static final CountryCode CN = new CountryCode("CN", 3, "CN");
    public static final CountryCode DE = new CountryCode("DE", 4, "DE");
    public static final CountryCode ES = new CountryCode("ES", 5, "ES");
    public static final CountryCode FR = new CountryCode("FR", 6, "FR");
    public static final CountryCode GB = new CountryCode("GB", 7, "GB");
    public static final CountryCode IN = new CountryCode("IN", 8, "IN");
    public static final CountryCode IT = new CountryCode("IT", 9, "IT");
    public static final CountryCode JP = new CountryCode("JP", 10, "JP");
    public static final CountryCode MX = new CountryCode("MX", 11, "MX");
    public static final CountryCode NL = new CountryCode("NL", 12, "NL");
    public static final CountryCode US = new CountryCode("US", 13, "US");
    public static final CountryCode SA = new CountryCode("SA", 14, "SA");

    private static final /* synthetic */ CountryCode[] $values() {
        return new CountryCode[]{AU, BR, CA, CN, DE, ES, FR, GB, IN, IT, JP, MX, NL, US, SA};
    }

    static {
        CountryCode[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
        INSTANCE = new Companion(null);
    }

    private CountryCode(String str, int i, String str2) {
        this.countryCode = str2;
    }

    @JvmStatic
    @Nullable
    public static final CountryCode fromString(@Nullable String str) {
        return INSTANCE.fromString(str);
    }

    @NotNull
    public static EnumEntries<CountryCode> getEntries() {
        return $ENTRIES;
    }

    public static CountryCode valueOf(String str) {
        return (CountryCode) Enum.valueOf(CountryCode.class, str);
    }

    public static CountryCode[] values() {
        return (CountryCode[]) $VALUES.clone();
    }

    @Override // java.lang.Enum
    @NotNull
    public String toString() {
        return this.countryCode;
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0014\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0007¨\u0006\u0007"}, d2 = {"Lcom/amazon/alexa/marketplace/api/CountryCode$Companion;", "", "()V", "fromString", "Lcom/amazon/alexa/marketplace/api/CountryCode;", "countryCode", "", "AlexaMobileAndroidMarketplaceApi_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nCountryCode.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CountryCode.kt\ncom/amazon/alexa/marketplace/api/CountryCode$Companion\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,82:1\n1282#2,2:83\n*S KotlinDebug\n*F\n+ 1 CountryCode.kt\ncom/amazon/alexa/marketplace/api/CountryCode$Companion\n*L\n79#1:83,2\n*E\n"})
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        @Nullable
        public final CountryCode fromString(@Nullable String countryCode) {
            for (CountryCode countryCode2 : CountryCode.values()) {
                if (Intrinsics.areEqual(countryCode2.toString(), countryCode)) {
                    return countryCode2;
                }
            }
            return null;
        }

        private Companion() {
        }
    }
}
