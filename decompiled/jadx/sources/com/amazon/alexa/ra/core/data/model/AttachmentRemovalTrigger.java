package com.amazon.alexa.ra.core.data.model;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/amazon/alexa/ra/core/data/model/AttachmentRemovalTrigger;", "", "<init>", "(Ljava/lang/String;I)V", "MANUALLY_BEFORE_SEND", "AUTOMATIC_DURING_SEND", "ui-ingress_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes18.dex */
public final class AttachmentRemovalTrigger {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ AttachmentRemovalTrigger[] $VALUES;
    public static final AttachmentRemovalTrigger MANUALLY_BEFORE_SEND = new AttachmentRemovalTrigger("MANUALLY_BEFORE_SEND", 0);
    public static final AttachmentRemovalTrigger AUTOMATIC_DURING_SEND = new AttachmentRemovalTrigger("AUTOMATIC_DURING_SEND", 1);

    private static final /* synthetic */ AttachmentRemovalTrigger[] $values() {
        return new AttachmentRemovalTrigger[]{MANUALLY_BEFORE_SEND, AUTOMATIC_DURING_SEND};
    }

    static {
        AttachmentRemovalTrigger[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
    }

    private AttachmentRemovalTrigger(String str, int i) {
    }

    @NotNull
    public static EnumEntries<AttachmentRemovalTrigger> getEntries() {
        return $ENTRIES;
    }

    public static AttachmentRemovalTrigger valueOf(String str) {
        return (AttachmentRemovalTrigger) Enum.valueOf(AttachmentRemovalTrigger.class, str);
    }

    public static AttachmentRemovalTrigger[] values() {
        return (AttachmentRemovalTrigger[]) $VALUES.clone();
    }
}
