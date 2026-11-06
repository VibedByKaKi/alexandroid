package com.amazon.alexa.marketplace.api;

import com.amazon.credentiallocker.CustomerRegion;
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
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\tB\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0003H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\n"}, d2 = {"Lcom/amazon/alexa/marketplace/api/Region;", "", "region", "", "(Ljava/lang/String;ILjava/lang/String;)V", "toString", "EUROPE", "FAR_EAST", "NORTH_AMERICA_AND_WORLD", "Companion", "AlexaMobileAndroidMarketplaceApi_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class Region {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ Region[] $VALUES;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE;
    public static final Region EUROPE = new Region("EUROPE", 0, CustomerRegion.EU);
    public static final Region FAR_EAST = new Region("FAR_EAST", 1, "FE");
    public static final Region NORTH_AMERICA_AND_WORLD = new Region("NORTH_AMERICA_AND_WORLD", 2, CustomerRegion.NA);

    @NotNull
    private final String region;

    private static final /* synthetic */ Region[] $values() {
        return new Region[]{EUROPE, FAR_EAST, NORTH_AMERICA_AND_WORLD};
    }

    static {
        Region[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
        INSTANCE = new Companion(null);
    }

    private Region(String str, int i, String str2) {
        this.region = str2;
    }

    @JvmStatic
    @Nullable
    public static final Region fromString(@Nullable String str) {
        return INSTANCE.fromString(str);
    }

    @NotNull
    public static EnumEntries<Region> getEntries() {
        return $ENTRIES;
    }

    public static Region valueOf(String str) {
        return (Region) Enum.valueOf(Region.class, str);
    }

    public static Region[] values() {
        return (Region[]) $VALUES.clone();
    }

    @Override // java.lang.Enum
    @NotNull
    public String toString() {
        return this.region;
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0014\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0007¨\u0006\u0007"}, d2 = {"Lcom/amazon/alexa/marketplace/api/Region$Companion;", "", "()V", "fromString", "Lcom/amazon/alexa/marketplace/api/Region;", "region", "", "AlexaMobileAndroidMarketplaceApi_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nRegion.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Region.kt\ncom/amazon/alexa/marketplace/api/Region$Companion\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,48:1\n1282#2,2:49\n*S KotlinDebug\n*F\n+ 1 Region.kt\ncom/amazon/alexa/marketplace/api/Region$Companion\n*L\n45#1:49,2\n*E\n"})
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        @Nullable
        public final Region fromString(@Nullable String region) {
            for (Region region2 : Region.values()) {
                if (Intrinsics.areEqual(region2.toString(), region)) {
                    return region2;
                }
            }
            return null;
        }

        private Companion() {
        }
    }
}
