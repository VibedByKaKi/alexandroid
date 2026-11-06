package com.amazon.alexa.ra.sdk.capability;

import androidx.annotation.Keep;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Keep
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/amazon/alexa/ra/sdk/capability/FeatureType;", "", "<init>", "(Ljava/lang/String;I)V", "ALLOW_EXPAND", "ALLOW_UPDATE", "ALLOW_SCROLL_TO", "AVSMobileFramework-ra-android-ui_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes19.dex */
public final class FeatureType {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ FeatureType[] $VALUES;
    public static final FeatureType ALLOW_EXPAND = new FeatureType("ALLOW_EXPAND", 0);
    public static final FeatureType ALLOW_UPDATE = new FeatureType("ALLOW_UPDATE", 1);
    public static final FeatureType ALLOW_SCROLL_TO = new FeatureType("ALLOW_SCROLL_TO", 2);

    private static final /* synthetic */ FeatureType[] $values() {
        return new FeatureType[]{ALLOW_EXPAND, ALLOW_UPDATE, ALLOW_SCROLL_TO};
    }

    static {
        FeatureType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
    }

    private FeatureType(String str, int i) {
    }

    @NotNull
    public static EnumEntries<FeatureType> getEntries() {
        return $ENTRIES;
    }

    public static FeatureType valueOf(String str) {
        return (FeatureType) Enum.valueOf(FeatureType.class, str);
    }

    public static FeatureType[] values() {
        return (FeatureType[]) $VALUES.clone();
    }
}
