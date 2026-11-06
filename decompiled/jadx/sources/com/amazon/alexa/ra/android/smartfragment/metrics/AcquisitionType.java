package com.amazon.alexa.ra.android.smartfragment.metrics;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lcom/amazon/alexa/ra/android/smartfragment/metrics/AcquisitionType;", "", "dimensionValue", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getDimensionValue", "()Ljava/lang/String;", "PREWARMED", "COLD", "AVSMobileFramework-ra-android-smart-fragment-runtime_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes18.dex */
public final class AcquisitionType {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ AcquisitionType[] $VALUES;

    @NotNull
    private final String dimensionValue;
    public static final AcquisitionType PREWARMED = new AcquisitionType("PREWARMED", 0, "prewarmed");
    public static final AcquisitionType COLD = new AcquisitionType("COLD", 1, "cold");

    private static final /* synthetic */ AcquisitionType[] $values() {
        return new AcquisitionType[]{PREWARMED, COLD};
    }

    static {
        AcquisitionType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
    }

    private AcquisitionType(String str, int i, String str2) {
        this.dimensionValue = str2;
    }

    @NotNull
    public static EnumEntries<AcquisitionType> getEntries() {
        return $ENTRIES;
    }

    public static AcquisitionType valueOf(String str) {
        return (AcquisitionType) Enum.valueOf(AcquisitionType.class, str);
    }

    public static AcquisitionType[] values() {
        return (AcquisitionType[]) $VALUES.clone();
    }

    @NotNull
    public final String getDimensionValue() {
        return this.dimensionValue;
    }
}
