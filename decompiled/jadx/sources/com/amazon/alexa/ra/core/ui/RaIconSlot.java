package com.amazon.alexa.ra.core.ui;

import com.amazon.clouddrive.cdasdk.cds.common.MediaType;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b&\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001fj\u0002\b j\u0002\b!j\u0002\b\"j\u0002\b#j\u0002\b$j\u0002\b%j\u0002\b&¨\u0006'"}, d2 = {"Lcom/amazon/alexa/ra/core/ui/RaIconSlot;", "", "<init>", "(Ljava/lang/String;I)V", "MICROPHONE", "SEND", "STOP", "ATTACHMENT", "SEARCH", "MICROPHONE_UNMUTED", "MICROPHONE_MUTED", "CANCEL", "VIDEO", "SCREEN_SHARE", "FLIP_CAMERA", "CAPTION_ON", "CAPTION_OFF", "NEW_CHAT", "HISTORY", "SETTINGS", "PRIVACY", "BACK", "EXPAND", "COLLAPSE", "OVERFLOW", "CLOSE", "DELETE", "COPY", "DOWNLOAD", "DONE", "DOCUMENT", "REFRESH", "CAMERA", MediaType.PHOTOS, "DOCUMENT_SHARE", "ALEXA_LOGO", "NOTIFICATION_ICON", "NOTIFICATION_MUTED", "NOTIFICATION_UNMUTED", "ui-common_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes18.dex */
public final class RaIconSlot {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ RaIconSlot[] $VALUES;
    public static final RaIconSlot MICROPHONE = new RaIconSlot("MICROPHONE", 0);
    public static final RaIconSlot SEND = new RaIconSlot("SEND", 1);
    public static final RaIconSlot STOP = new RaIconSlot("STOP", 2);
    public static final RaIconSlot ATTACHMENT = new RaIconSlot("ATTACHMENT", 3);
    public static final RaIconSlot SEARCH = new RaIconSlot("SEARCH", 4);
    public static final RaIconSlot MICROPHONE_UNMUTED = new RaIconSlot("MICROPHONE_UNMUTED", 5);
    public static final RaIconSlot MICROPHONE_MUTED = new RaIconSlot("MICROPHONE_MUTED", 6);
    public static final RaIconSlot CANCEL = new RaIconSlot("CANCEL", 7);
    public static final RaIconSlot VIDEO = new RaIconSlot("VIDEO", 8);
    public static final RaIconSlot SCREEN_SHARE = new RaIconSlot("SCREEN_SHARE", 9);
    public static final RaIconSlot FLIP_CAMERA = new RaIconSlot("FLIP_CAMERA", 10);
    public static final RaIconSlot CAPTION_ON = new RaIconSlot("CAPTION_ON", 11);
    public static final RaIconSlot CAPTION_OFF = new RaIconSlot("CAPTION_OFF", 12);
    public static final RaIconSlot NEW_CHAT = new RaIconSlot("NEW_CHAT", 13);
    public static final RaIconSlot HISTORY = new RaIconSlot("HISTORY", 14);
    public static final RaIconSlot SETTINGS = new RaIconSlot("SETTINGS", 15);
    public static final RaIconSlot PRIVACY = new RaIconSlot("PRIVACY", 16);
    public static final RaIconSlot BACK = new RaIconSlot("BACK", 17);
    public static final RaIconSlot EXPAND = new RaIconSlot("EXPAND", 18);
    public static final RaIconSlot COLLAPSE = new RaIconSlot("COLLAPSE", 19);
    public static final RaIconSlot OVERFLOW = new RaIconSlot("OVERFLOW", 20);
    public static final RaIconSlot CLOSE = new RaIconSlot("CLOSE", 21);
    public static final RaIconSlot DELETE = new RaIconSlot("DELETE", 22);
    public static final RaIconSlot COPY = new RaIconSlot("COPY", 23);
    public static final RaIconSlot DOWNLOAD = new RaIconSlot("DOWNLOAD", 24);
    public static final RaIconSlot DONE = new RaIconSlot("DONE", 25);
    public static final RaIconSlot DOCUMENT = new RaIconSlot("DOCUMENT", 26);
    public static final RaIconSlot REFRESH = new RaIconSlot("REFRESH", 27);
    public static final RaIconSlot CAMERA = new RaIconSlot("CAMERA", 28);
    public static final RaIconSlot PHOTOS = new RaIconSlot(MediaType.PHOTOS, 29);
    public static final RaIconSlot DOCUMENT_SHARE = new RaIconSlot("DOCUMENT_SHARE", 30);
    public static final RaIconSlot ALEXA_LOGO = new RaIconSlot("ALEXA_LOGO", 31);
    public static final RaIconSlot NOTIFICATION_ICON = new RaIconSlot("NOTIFICATION_ICON", 32);
    public static final RaIconSlot NOTIFICATION_MUTED = new RaIconSlot("NOTIFICATION_MUTED", 33);
    public static final RaIconSlot NOTIFICATION_UNMUTED = new RaIconSlot("NOTIFICATION_UNMUTED", 34);

    private static final /* synthetic */ RaIconSlot[] $values() {
        return new RaIconSlot[]{MICROPHONE, SEND, STOP, ATTACHMENT, SEARCH, MICROPHONE_UNMUTED, MICROPHONE_MUTED, CANCEL, VIDEO, SCREEN_SHARE, FLIP_CAMERA, CAPTION_ON, CAPTION_OFF, NEW_CHAT, HISTORY, SETTINGS, PRIVACY, BACK, EXPAND, COLLAPSE, OVERFLOW, CLOSE, DELETE, COPY, DOWNLOAD, DONE, DOCUMENT, REFRESH, CAMERA, PHOTOS, DOCUMENT_SHARE, ALEXA_LOGO, NOTIFICATION_ICON, NOTIFICATION_MUTED, NOTIFICATION_UNMUTED};
    }

    static {
        RaIconSlot[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
    }

    private RaIconSlot(String str, int i) {
    }

    @NotNull
    public static EnumEntries<RaIconSlot> getEntries() {
        return $ENTRIES;
    }

    public static RaIconSlot valueOf(String str) {
        return (RaIconSlot) Enum.valueOf(RaIconSlot.class, str);
    }

    public static RaIconSlot[] values() {
        return (RaIconSlot[]) $VALUES.clone();
    }
}
