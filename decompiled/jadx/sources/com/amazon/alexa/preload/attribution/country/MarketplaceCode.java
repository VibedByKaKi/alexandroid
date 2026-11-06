package com.amazon.alexa.preload.attribution.country;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import org.jetbrains.kotlin.konan.target.Android;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes18.dex */
public class MarketplaceCode {
    private final String mRegionId;
    public static final MarketplaceCode US = new MarketplaceCode("US", 0, "20");
    public static final MarketplaceCode MX = new MarketplaceCode("MX", 1, "20");
    public static final MarketplaceCode BR = new MarketplaceCode("BR", 2, "20");
    public static final MarketplaceCode CA = new MarketplaceCode("CA", 3, "20");
    public static final MarketplaceCode DE = new MarketplaceCode("DE", 4, Android.API);
    public static final MarketplaceCode GB = new AnonymousClass1();
    public static final MarketplaceCode FR = new MarketplaceCode("FR", 6, Android.API);
    public static final MarketplaceCode IT = new MarketplaceCode("IT", 7, Android.API);
    public static final MarketplaceCode ES = new MarketplaceCode("ES", 8, Android.API);
    public static final MarketplaceCode IN = new MarketplaceCode("IN", 9, Android.API);
    public static final MarketplaceCode TR = new MarketplaceCode("TR", 10, Android.API);
    public static final MarketplaceCode JP = new MarketplaceCode("JP", 11, "22");
    public static final MarketplaceCode AU = new MarketplaceCode("AU", 12, "22");
    public static final MarketplaceCode CN = new MarketplaceCode("CN", 13, "23");
    private static final /* synthetic */ MarketplaceCode[] $VALUES = $values();

    private static /* synthetic */ MarketplaceCode[] $values() {
        return new MarketplaceCode[]{US, MX, BR, CA, DE, GB, FR, IT, ES, IN, TR, JP, AU, CN};
    }

    private MarketplaceCode(@NonNull String str, int i, String str2) {
        this.mRegionId = str2;
    }

    @Nullable
    public static MarketplaceCode fromString(@NonNull String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        for (MarketplaceCode marketplaceCode : values()) {
            if (marketplaceCode.toString().equalsIgnoreCase(str)) {
                return marketplaceCode;
            }
        }
        return null;
    }

    public static MarketplaceCode valueOf(String str) {
        return (MarketplaceCode) Enum.valueOf(MarketplaceCode.class, str);
    }

    public static MarketplaceCode[] values() {
        return (MarketplaceCode[]) $VALUES.clone();
    }

    public String getCountryCode() {
        return name().toLowerCase();
    }

    public String getRegionId() {
        return this.mRegionId;
    }

    public /* synthetic */ MarketplaceCode(String str, int i, String str2, int i2) {
        this(str, i, str2);
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    /* renamed from: com.amazon.alexa.preload.attribution.country.MarketplaceCode$1, reason: invalid class name */
    public enum AnonymousClass1 extends MarketplaceCode {
        public /* synthetic */ AnonymousClass1() {
            this("GB", 5, Android.API);
        }

        @Override // com.amazon.alexa.preload.attribution.country.MarketplaceCode
        public String getCountryCode() {
            return "uk";
        }

        private AnonymousClass1(String str, int i, String str2) {
            super(str, i, str2, 0);
        }
    }
}
