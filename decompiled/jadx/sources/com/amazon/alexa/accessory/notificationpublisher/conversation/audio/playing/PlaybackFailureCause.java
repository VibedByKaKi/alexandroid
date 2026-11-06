package com.amazon.alexa.accessory.notificationpublisher.conversation.audio.playing;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"Lcom/amazon/alexa/accessory/notificationpublisher/conversation/audio/playing/PlaybackFailureCause;", "", "label", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getLabel", "()Ljava/lang/String;", "DOWNLOAD_FAILED", "PLAYBACK_FAILED", "INTERRUPTED", "NO_AUDIO_OUTPUT", "AlexaAccessoryNotificationPublisherAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class PlaybackFailureCause {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ PlaybackFailureCause[] $VALUES;

    @NotNull
    private final String label;
    public static final PlaybackFailureCause DOWNLOAD_FAILED = new PlaybackFailureCause("DOWNLOAD_FAILED", 0, "downloadFailed");
    public static final PlaybackFailureCause PLAYBACK_FAILED = new PlaybackFailureCause("PLAYBACK_FAILED", 1, "playbackFailed");
    public static final PlaybackFailureCause INTERRUPTED = new PlaybackFailureCause("INTERRUPTED", 2, "interrupted");
    public static final PlaybackFailureCause NO_AUDIO_OUTPUT = new PlaybackFailureCause("NO_AUDIO_OUTPUT", 3, "noAudioOutput");

    private static final /* synthetic */ PlaybackFailureCause[] $values() {
        return new PlaybackFailureCause[]{DOWNLOAD_FAILED, PLAYBACK_FAILED, INTERRUPTED, NO_AUDIO_OUTPUT};
    }

    static {
        PlaybackFailureCause[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
    }

    private PlaybackFailureCause(String str, int i, String str2) {
        this.label = str2;
    }

    @NotNull
    public static EnumEntries<PlaybackFailureCause> getEntries() {
        return $ENTRIES;
    }

    public static PlaybackFailureCause valueOf(String str) {
        return (PlaybackFailureCause) Enum.valueOf(PlaybackFailureCause.class, str);
    }

    public static PlaybackFailureCause[] values() {
        return (PlaybackFailureCause[]) $VALUES.clone();
    }

    @NotNull
    public final String getLabel() {
        return this.label;
    }
}
