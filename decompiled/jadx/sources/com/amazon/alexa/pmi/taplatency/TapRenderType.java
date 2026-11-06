package com.amazon.alexa.pmi.taplatency;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lcom/amazon/alexa/pmi/taplatency/TapRenderType;", "", "suffix", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getSuffix", "()Ljava/lang/String;", "NATIVE", "REACT_NATIVE", "AlexaMobileAndroidPerfMetricsInstrumentationAPI_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes18.dex */
public final class TapRenderType {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ TapRenderType[] $VALUES;
    public static final TapRenderType NATIVE = new TapRenderType("NATIVE", 0, "");
    public static final TapRenderType REACT_NATIVE = new TapRenderType("REACT_NATIVE", 1, ".rn");

    @NotNull
    private final String suffix;

    private static final /* synthetic */ TapRenderType[] $values() {
        return new TapRenderType[]{NATIVE, REACT_NATIVE};
    }

    static {
        TapRenderType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
    }

    private TapRenderType(String str, int i, String str2) {
        this.suffix = str2;
    }

    @NotNull
    public static EnumEntries<TapRenderType> getEntries() {
        return $ENTRIES;
    }

    public static TapRenderType valueOf(String str) {
        return (TapRenderType) Enum.valueOf(TapRenderType.class, str);
    }

    public static TapRenderType[] values() {
        return (TapRenderType[]) $VALUES.clone();
    }

    @NotNull
    public final String getSuffix() {
        return this.suffix;
    }
}
