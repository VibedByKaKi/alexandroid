package com.amazon.alexa.mobile.assistant.capabilities.external;

import io.ktor.util.PathKt$$ExternalSyntheticBUOutline0;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0000\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0007\u001a\u00020\bj\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\t"}, d2 = {"Lcom/amazon/alexa/mobile/assistant/capabilities/external/DirectiveStage;", "", "<init>", "(Ljava/lang/String;I)V", "PREPARE", "CONSUME", "CANCEL", "legacyName", "", "capabilities_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes18.dex */
public final class DirectiveStage {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ DirectiveStage[] $VALUES;
    public static final DirectiveStage PREPARE = new DirectiveStage("PREPARE", 0);
    public static final DirectiveStage CONSUME = new DirectiveStage("CONSUME", 1);
    public static final DirectiveStage CANCEL = new DirectiveStage("CANCEL", 2);

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[DirectiveStage.values().length];
            try {
                iArr[DirectiveStage.PREPARE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[DirectiveStage.CONSUME.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[DirectiveStage.CANCEL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private static final /* synthetic */ DirectiveStage[] $values() {
        return new DirectiveStage[]{PREPARE, CONSUME, CANCEL};
    }

    static {
        DirectiveStage[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
    }

    private DirectiveStage(String str, int i) {
    }

    @NotNull
    public static EnumEntries<DirectiveStage> getEntries() {
        return $ENTRIES;
    }

    public static DirectiveStage valueOf(String str) {
        return (DirectiveStage) Enum.valueOf(DirectiveStage.class, str);
    }

    public static DirectiveStage[] values() {
        return (DirectiveStage[]) $VALUES.clone();
    }

    @NotNull
    public final String legacyName() {
        int i = WhenMappings.$EnumSwitchMapping$0[ordinal()];
        if (i == 1) {
            return "PREPROCESS";
        }
        if (i == 2) {
            return "PROCESS";
        }
        if (i == 3) {
            return "CANCEL";
        }
        PathKt$$ExternalSyntheticBUOutline0.m();
        return null;
    }
}
