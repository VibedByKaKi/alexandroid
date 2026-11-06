package com.amazon.alexa.assistant.media.model;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u000e\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u000f"}, d2 = {"Lcom/amazon/alexa/assistant/media/model/MediaControlName;", "", "<init>", "(Ljava/lang/String;I)V", "PLAY", "PAUSE", "NEXT", "PREVIOUS", "SKIP_FORWARD", "SKIP_BACKWARD", "SHUFFLE", "LOOP", "REPEAT", "THUMBS_UP", "THUMBS_DOWN", "voice_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class MediaControlName {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ MediaControlName[] $VALUES;
    public static final MediaControlName PLAY = new MediaControlName("PLAY", 0);
    public static final MediaControlName PAUSE = new MediaControlName("PAUSE", 1);
    public static final MediaControlName NEXT = new MediaControlName("NEXT", 2);
    public static final MediaControlName PREVIOUS = new MediaControlName("PREVIOUS", 3);
    public static final MediaControlName SKIP_FORWARD = new MediaControlName("SKIP_FORWARD", 4);
    public static final MediaControlName SKIP_BACKWARD = new MediaControlName("SKIP_BACKWARD", 5);
    public static final MediaControlName SHUFFLE = new MediaControlName("SHUFFLE", 6);
    public static final MediaControlName LOOP = new MediaControlName("LOOP", 7);
    public static final MediaControlName REPEAT = new MediaControlName("REPEAT", 8);
    public static final MediaControlName THUMBS_UP = new MediaControlName("THUMBS_UP", 9);
    public static final MediaControlName THUMBS_DOWN = new MediaControlName("THUMBS_DOWN", 10);

    private static final /* synthetic */ MediaControlName[] $values() {
        return new MediaControlName[]{PLAY, PAUSE, NEXT, PREVIOUS, SKIP_FORWARD, SKIP_BACKWARD, SHUFFLE, LOOP, REPEAT, THUMBS_UP, THUMBS_DOWN};
    }

    static {
        MediaControlName[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
    }

    private MediaControlName(String str, int i) {
    }

    @NotNull
    public static EnumEntries<MediaControlName> getEntries() {
        return $ENTRIES;
    }

    public static MediaControlName valueOf(String str) {
        return (MediaControlName) Enum.valueOf(MediaControlName.class, str);
    }

    public static MediaControlName[] values() {
        return (MediaControlName[]) $VALUES.clone();
    }
}
