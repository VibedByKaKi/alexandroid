package com.amazon.alexa.mobilytics.configuration;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.amazonaws.regions.Regions;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'US' uses external variables
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
public final class Region {
    private static final /* synthetic */ Region[] $VALUES;
    public static final Region AU;
    public static final Region BR;
    public static final Region CA;
    public static final Region CN;
    public static final Region DE;
    public static final Region DEFAULT;
    public static final Region ES;
    public static final Region FR;
    public static final Region GB;
    public static final Region IN;
    public static final Region IT;
    public static final Region JP;
    public static final Region MX;
    public static final Region NL;
    public static final Region US;
    private Regions awsRegion;

    private static /* synthetic */ Region[] $values() {
        return new Region[]{US, CA, MX, BR, CN, GB, DE, IN, FR, IT, NL, ES, JP, AU, DEFAULT};
    }

    static {
        Regions regions = Regions.US_EAST_1;
        Region region = new Region("US", 0, regions);
        US = region;
        CA = new Region("CA", 1, regions);
        MX = new Region("MX", 2, regions);
        BR = new Region("BR", 3, regions);
        CN = new Region("CN", 4, regions);
        Regions regions2 = Regions.EU_WEST_1;
        GB = new Region("GB", 5, regions2);
        DE = new Region("DE", 6, regions2);
        IN = new Region("IN", 7, regions2);
        FR = new Region("FR", 8, regions2);
        IT = new Region("IT", 9, regions2);
        NL = new Region("NL", 10, regions2);
        ES = new Region("ES", 11, regions2);
        Regions regions3 = Regions.US_WEST_2;
        JP = new Region("JP", 12, regions3);
        AU = new Region("AU", 13, regions3);
        DEFAULT = new Region("DEFAULT", 14, region);
        $VALUES = $values();
    }

    private Region(@NonNull String str, int i, Region region) {
        this.awsRegion = region.awsRegion;
    }

    @NonNull
    public static Region fromCountryCode(@Nullable String str) {
        if (str == null) {
            return DEFAULT;
        }
        for (Region region : values()) {
            if (region.name().equalsIgnoreCase(str)) {
                return region;
            }
        }
        return DEFAULT;
    }

    public static Region valueOf(String str) {
        return (Region) Enum.valueOf(Region.class, str);
    }

    public static Region[] values() {
        return (Region[]) $VALUES.clone();
    }

    @NonNull
    public Regions awsRegion() {
        return this.awsRegion;
    }

    private Region(@NonNull String str, int i, Regions regions) {
        this.awsRegion = regions;
    }
}
