package com.amazon.alexa.assistant.ui.theme;

import com.amazon.clouddrive.cdasdk.cds.common.MediaType;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u001f\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001f¨\u0006 "}, d2 = {"Lcom/amazon/alexa/assistant/ui/theme/IconSlot;", "", "<init>", "(Ljava/lang/String;I)V", "MICROPHONE", "SEND", "STOP", "ATTACHMENT", "MICROPHONE_UNMUTED", "MICROPHONE_MUTED", "CANCEL", "NEW_CHAT", "HISTORY", "SETTINGS", "PRIVACY", "BACK", "EXPAND", "COLLAPSE", "OVERFLOW", "CLOSE", "DELETE", "COPY", "DOWNLOAD", "DONE", "DOCUMENT", "REFRESH", "CAMERA", MediaType.PHOTOS, "DOCUMENT_SHARE", "NOTIFICATION_ICON", "NOTIFICATION_MUTED", "NOTIFICATION_UNMUTED", "ui_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class IconSlot {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ IconSlot[] $VALUES;
    public static final IconSlot MICROPHONE = new IconSlot("MICROPHONE", 0);
    public static final IconSlot SEND = new IconSlot("SEND", 1);
    public static final IconSlot STOP = new IconSlot("STOP", 2);
    public static final IconSlot ATTACHMENT = new IconSlot("ATTACHMENT", 3);
    public static final IconSlot MICROPHONE_UNMUTED = new IconSlot("MICROPHONE_UNMUTED", 4);
    public static final IconSlot MICROPHONE_MUTED = new IconSlot("MICROPHONE_MUTED", 5);
    public static final IconSlot CANCEL = new IconSlot("CANCEL", 6);
    public static final IconSlot NEW_CHAT = new IconSlot("NEW_CHAT", 7);
    public static final IconSlot HISTORY = new IconSlot("HISTORY", 8);
    public static final IconSlot SETTINGS = new IconSlot("SETTINGS", 9);
    public static final IconSlot PRIVACY = new IconSlot("PRIVACY", 10);
    public static final IconSlot BACK = new IconSlot("BACK", 11);
    public static final IconSlot EXPAND = new IconSlot("EXPAND", 12);
    public static final IconSlot COLLAPSE = new IconSlot("COLLAPSE", 13);
    public static final IconSlot OVERFLOW = new IconSlot("OVERFLOW", 14);
    public static final IconSlot CLOSE = new IconSlot("CLOSE", 15);
    public static final IconSlot DELETE = new IconSlot("DELETE", 16);
    public static final IconSlot COPY = new IconSlot("COPY", 17);
    public static final IconSlot DOWNLOAD = new IconSlot("DOWNLOAD", 18);
    public static final IconSlot DONE = new IconSlot("DONE", 19);
    public static final IconSlot DOCUMENT = new IconSlot("DOCUMENT", 20);
    public static final IconSlot REFRESH = new IconSlot("REFRESH", 21);
    public static final IconSlot CAMERA = new IconSlot("CAMERA", 22);
    public static final IconSlot PHOTOS = new IconSlot(MediaType.PHOTOS, 23);
    public static final IconSlot DOCUMENT_SHARE = new IconSlot("DOCUMENT_SHARE", 24);
    public static final IconSlot NOTIFICATION_ICON = new IconSlot("NOTIFICATION_ICON", 25);
    public static final IconSlot NOTIFICATION_MUTED = new IconSlot("NOTIFICATION_MUTED", 26);
    public static final IconSlot NOTIFICATION_UNMUTED = new IconSlot("NOTIFICATION_UNMUTED", 27);

    private static final /* synthetic */ IconSlot[] $values() {
        return new IconSlot[]{MICROPHONE, SEND, STOP, ATTACHMENT, MICROPHONE_UNMUTED, MICROPHONE_MUTED, CANCEL, NEW_CHAT, HISTORY, SETTINGS, PRIVACY, BACK, EXPAND, COLLAPSE, OVERFLOW, CLOSE, DELETE, COPY, DOWNLOAD, DONE, DOCUMENT, REFRESH, CAMERA, PHOTOS, DOCUMENT_SHARE, NOTIFICATION_ICON, NOTIFICATION_MUTED, NOTIFICATION_UNMUTED};
    }

    static {
        IconSlot[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
    }

    private IconSlot(String str, int i) {
    }

    @NotNull
    public static EnumEntries<IconSlot> getEntries() {
        return $ENTRIES;
    }

    public static IconSlot valueOf(String str) {
        return (IconSlot) Enum.valueOf(IconSlot.class, str);
    }

    public static IconSlot[] values() {
        return (IconSlot[]) $VALUES.clone();
    }
}
