package com.amazon.alexa.ra.cards.ui;

import androidx.compose.ui.unit.TextUnitKt;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u000e\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0019\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007R\u0013\u0010\u0002\u001a\u00020\u0003¢\u0006\n\n\u0002\u0010\n\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012¨\u0006\u0013"}, d2 = {"Lcom/amazon/alexa/ra/cards/ui/MosaicIconSize;", "", "textSize", "Landroidx/compose/ui/unit/TextUnit;", "sizeInt", "", "<init>", "(Ljava/lang/String;IJI)V", "getTextSize-XSAIIZE", "()J", "J", "getSizeInt", "()I", "XSMALL", "MSMALL", "SMALL", "MEDIUM", "LARGE", "XLARGE", "AVSMobileFramework-ra-cards-runtime_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes18.dex */
public final class MosaicIconSize {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ MosaicIconSize[] $VALUES;
    private final int sizeInt;
    private final long textSize;
    public static final MosaicIconSize XSMALL = new MosaicIconSize("XSMALL", 0, TextUnitKt.getSp(12), 0);
    public static final MosaicIconSize MSMALL = new MosaicIconSize("MSMALL", 1, TextUnitKt.getSp(18), 1);
    public static final MosaicIconSize SMALL = new MosaicIconSize("SMALL", 2, TextUnitKt.getSp(24), 2);
    public static final MosaicIconSize MEDIUM = new MosaicIconSize("MEDIUM", 3, TextUnitKt.getSp(36), 3);
    public static final MosaicIconSize LARGE = new MosaicIconSize("LARGE", 4, TextUnitKt.getSp(48), 4);
    public static final MosaicIconSize XLARGE = new MosaicIconSize("XLARGE", 5, TextUnitKt.getSp(72), 5);

    private static final /* synthetic */ MosaicIconSize[] $values() {
        return new MosaicIconSize[]{XSMALL, MSMALL, SMALL, MEDIUM, LARGE, XLARGE};
    }

    static {
        MosaicIconSize[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
    }

    private MosaicIconSize(String str, int i, long j, int i2) {
        this.textSize = j;
        this.sizeInt = i2;
    }

    @NotNull
    public static EnumEntries<MosaicIconSize> getEntries() {
        return $ENTRIES;
    }

    public static MosaicIconSize valueOf(String str) {
        return (MosaicIconSize) Enum.valueOf(MosaicIconSize.class, str);
    }

    public static MosaicIconSize[] values() {
        return (MosaicIconSize[]) $VALUES.clone();
    }

    public final int getSizeInt() {
        return this.sizeInt;
    }

    /* renamed from: getTextSize-XSAIIZE, reason: not valid java name and from getter */
    public final long getTextSize() {
        return this.textSize;
    }
}
