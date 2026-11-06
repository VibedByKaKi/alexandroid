package com.amazon.alexa.ra.core.ui;

import com.amazon.alexa.voice.tta.metrics.SimbaEventProcessor;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/amazon/alexa/ra/core/ui/RaSendButtonStyle;", "", "<init>", "(Ljava/lang/String;I)V", "CIRCULAR", SimbaEventProcessor.SOURCE_PILL, "ui-common_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes18.dex */
public final class RaSendButtonStyle {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ RaSendButtonStyle[] $VALUES;
    public static final RaSendButtonStyle CIRCULAR = new RaSendButtonStyle("CIRCULAR", 0);
    public static final RaSendButtonStyle PILL = new RaSendButtonStyle(SimbaEventProcessor.SOURCE_PILL, 1);

    private static final /* synthetic */ RaSendButtonStyle[] $values() {
        return new RaSendButtonStyle[]{CIRCULAR, PILL};
    }

    static {
        RaSendButtonStyle[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
    }

    private RaSendButtonStyle(String str, int i) {
    }

    @NotNull
    public static EnumEntries<RaSendButtonStyle> getEntries() {
        return $ENTRIES;
    }

    public static RaSendButtonStyle valueOf(String str) {
        return (RaSendButtonStyle) Enum.valueOf(RaSendButtonStyle.class, str);
    }

    public static RaSendButtonStyle[] values() {
        return (RaSendButtonStyle[]) $VALUES.clone();
    }
}
