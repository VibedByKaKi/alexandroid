package com.amazon.alexa.assistant.ui.conversation.ftux;

import io.ktor.util.PathKt$$ExternalSyntheticBUOutline0;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0006\u001a\u00020\u0007H\u0000¢\u0006\u0002\b\bj\u0002\b\u0004j\u0002\b\u0005¨\u0006\t"}, d2 = {"Lcom/amazon/alexa/assistant/ui/conversation/ftux/FtuxViewStyle;", "", "<init>", "(Ljava/lang/String;I)V", "FULL_ONBOARDING", "FOLDED_RETURNING", "toPath", "Lcom/amazon/alexa/assistant/ui/conversation/ftux/FtuxPath;", "toPath$ui_release", "ui_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class FtuxViewStyle {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ FtuxViewStyle[] $VALUES;
    public static final FtuxViewStyle FULL_ONBOARDING = new FtuxViewStyle("FULL_ONBOARDING", 0);
    public static final FtuxViewStyle FOLDED_RETURNING = new FtuxViewStyle("FOLDED_RETURNING", 1);

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[FtuxViewStyle.values().length];
            try {
                iArr[FtuxViewStyle.FULL_ONBOARDING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[FtuxViewStyle.FOLDED_RETURNING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private static final /* synthetic */ FtuxViewStyle[] $values() {
        return new FtuxViewStyle[]{FULL_ONBOARDING, FOLDED_RETURNING};
    }

    static {
        FtuxViewStyle[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
    }

    private FtuxViewStyle(String str, int i) {
    }

    @NotNull
    public static EnumEntries<FtuxViewStyle> getEntries() {
        return $ENTRIES;
    }

    public static FtuxViewStyle valueOf(String str) {
        return (FtuxViewStyle) Enum.valueOf(FtuxViewStyle.class, str);
    }

    public static FtuxViewStyle[] values() {
        return (FtuxViewStyle[]) $VALUES.clone();
    }

    @NotNull
    public final FtuxPath toPath$ui_release() {
        int i = WhenMappings.$EnumSwitchMapping$0[ordinal()];
        if (i == 1) {
            return FtuxPath.NET_NEW;
        }
        if (i == 2) {
            return FtuxPath.RETURNING;
        }
        PathKt$$ExternalSyntheticBUOutline0.m();
        return null;
    }
}
