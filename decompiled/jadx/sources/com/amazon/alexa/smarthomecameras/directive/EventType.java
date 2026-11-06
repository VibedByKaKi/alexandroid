package com.amazon.alexa.smarthomecameras.directive;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lcom/amazon/alexa/smarthomecameras/directive/EventType;", "", "<init>", "(Ljava/lang/String;I)V", "MOTION", "DOORBELL", "PERSON", "PACKAGE", "VEHICLE", "ANIMAL", "UNKNOWN", "AlexaMobileAndroidSmartHomeCameras_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes19.dex */
public final class EventType {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ EventType[] $VALUES;
    public static final EventType MOTION = new EventType("MOTION", 0);
    public static final EventType DOORBELL = new EventType("DOORBELL", 1);
    public static final EventType PERSON = new EventType("PERSON", 2);
    public static final EventType PACKAGE = new EventType("PACKAGE", 3);
    public static final EventType VEHICLE = new EventType("VEHICLE", 4);
    public static final EventType ANIMAL = new EventType("ANIMAL", 5);
    public static final EventType UNKNOWN = new EventType("UNKNOWN", 6);

    private static final /* synthetic */ EventType[] $values() {
        return new EventType[]{MOTION, DOORBELL, PERSON, PACKAGE, VEHICLE, ANIMAL, UNKNOWN};
    }

    static {
        EventType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
    }

    private EventType(String str, int i) {
    }

    @NotNull
    public static EnumEntries<EventType> getEntries() {
        return $ENTRIES;
    }

    public static EventType valueOf(String str) {
        return (EventType) Enum.valueOf(EventType.class, str);
    }

    public static EventType[] values() {
        return (EventType[]) $VALUES.clone();
    }
}
