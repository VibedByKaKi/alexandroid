package com.amazon.alexa.assistant.capability.speechrecognizer.model.speechProvider;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/amazon/alexa/assistant/capability/speechrecognizer/model/speechProvider/DialogDenialReason;", "", "<init>", "(Ljava/lang/String;I)V", "BUSY", "REDUNDANT", "voice_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class DialogDenialReason {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ DialogDenialReason[] $VALUES;
    public static final DialogDenialReason BUSY = new DialogDenialReason("BUSY", 0);
    public static final DialogDenialReason REDUNDANT = new DialogDenialReason("REDUNDANT", 1);

    private static final /* synthetic */ DialogDenialReason[] $values() {
        return new DialogDenialReason[]{BUSY, REDUNDANT};
    }

    static {
        DialogDenialReason[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
    }

    private DialogDenialReason(String str, int i) {
    }

    @NotNull
    public static EnumEntries<DialogDenialReason> getEntries() {
        return $ENTRIES;
    }

    public static DialogDenialReason valueOf(String str) {
        return (DialogDenialReason) Enum.valueOf(DialogDenialReason.class, str);
    }

    public static DialogDenialReason[] values() {
        return (DialogDenialReason[]) $VALUES.clone();
    }
}
