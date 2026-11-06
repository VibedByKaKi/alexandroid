package com.amazon.alexa.accessory.notificationpublisher.conversation.audio.capturing;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/amazon/alexa/accessory/notificationpublisher/conversation/audio/capturing/VoiceStreamControlFailure;", "", "<init>", "(Ljava/lang/String;I)V", "NO_ACCESSORY", "DENIED", "TIMED_OUT", "REQUEST_FAILED", "AlexaAccessoryNotificationPublisherAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class VoiceStreamControlFailure {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ VoiceStreamControlFailure[] $VALUES;
    public static final VoiceStreamControlFailure NO_ACCESSORY = new VoiceStreamControlFailure("NO_ACCESSORY", 0);
    public static final VoiceStreamControlFailure DENIED = new VoiceStreamControlFailure("DENIED", 1);
    public static final VoiceStreamControlFailure TIMED_OUT = new VoiceStreamControlFailure("TIMED_OUT", 2);
    public static final VoiceStreamControlFailure REQUEST_FAILED = new VoiceStreamControlFailure("REQUEST_FAILED", 3);

    private static final /* synthetic */ VoiceStreamControlFailure[] $values() {
        return new VoiceStreamControlFailure[]{NO_ACCESSORY, DENIED, TIMED_OUT, REQUEST_FAILED};
    }

    static {
        VoiceStreamControlFailure[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
    }

    private VoiceStreamControlFailure(String str, int i) {
    }

    @NotNull
    public static EnumEntries<VoiceStreamControlFailure> getEntries() {
        return $ENTRIES;
    }

    public static VoiceStreamControlFailure valueOf(String str) {
        return (VoiceStreamControlFailure) Enum.valueOf(VoiceStreamControlFailure.class, str);
    }

    public static VoiceStreamControlFailure[] values() {
        return (VoiceStreamControlFailure[]) $VALUES.clone();
    }
}
