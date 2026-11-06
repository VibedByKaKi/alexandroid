package com.amazon.alexa.smarthomecameras.directive;

import com.amazon.alexa.smarthomecameras.constants.ErrorConstants;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\f\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, d2 = {"Lcom/amazon/alexa/smarthomecameras/directive/Status;", "", "<init>", "(Ljava/lang/String;I)V", "STOP_LIVE_VIEW_REQUESTED", ErrorConstants.MEDIA_SOURCE_NOT_FOUND, ErrorConstants.UNAUTHORIZED, "BATTERY_LEVEL_TOO_LOW", "MEDIA_SOURCE_ASLEEP", ErrorConstants.MEDIA_SOURCE_TURNED_OFF, "SESSION_TIMEOUT", "CAMERAS_DISCONNECTED", "VIEWERS_DISCONNECTED", "AlexaMobileAndroidSmartHomeCameras_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes19.dex */
public final class Status {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ Status[] $VALUES;
    public static final Status STOP_LIVE_VIEW_REQUESTED = new Status("STOP_LIVE_VIEW_REQUESTED", 0);
    public static final Status MEDIA_SOURCE_NOT_FOUND = new Status(ErrorConstants.MEDIA_SOURCE_NOT_FOUND, 1);
    public static final Status UNAUTHORIZED = new Status(ErrorConstants.UNAUTHORIZED, 2);
    public static final Status BATTERY_LEVEL_TOO_LOW = new Status("BATTERY_LEVEL_TOO_LOW", 3);
    public static final Status MEDIA_SOURCE_ASLEEP = new Status("MEDIA_SOURCE_ASLEEP", 4);
    public static final Status MEDIA_SOURCE_TURNED_OFF = new Status(ErrorConstants.MEDIA_SOURCE_TURNED_OFF, 5);
    public static final Status SESSION_TIMEOUT = new Status("SESSION_TIMEOUT", 6);
    public static final Status CAMERAS_DISCONNECTED = new Status("CAMERAS_DISCONNECTED", 7);
    public static final Status VIEWERS_DISCONNECTED = new Status("VIEWERS_DISCONNECTED", 8);

    private static final /* synthetic */ Status[] $values() {
        return new Status[]{STOP_LIVE_VIEW_REQUESTED, MEDIA_SOURCE_NOT_FOUND, UNAUTHORIZED, BATTERY_LEVEL_TOO_LOW, MEDIA_SOURCE_ASLEEP, MEDIA_SOURCE_TURNED_OFF, SESSION_TIMEOUT, CAMERAS_DISCONNECTED, VIEWERS_DISCONNECTED};
    }

    static {
        Status[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
    }

    private Status(String str, int i) {
    }

    @NotNull
    public static EnumEntries<Status> getEntries() {
        return $ENTRIES;
    }

    public static Status valueOf(String str) {
        return (Status) Enum.valueOf(Status.class, str);
    }

    public static Status[] values() {
        return (Status[]) $VALUES.clone();
    }
}
