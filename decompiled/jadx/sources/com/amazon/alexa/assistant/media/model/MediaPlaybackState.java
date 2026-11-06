package com.amazon.alexa.assistant.media.model;

import com.amazon.alexa.biloba.storage.CareActorsStore;
import com.amazon.devicesetup.common.v1.WifiConnectionState;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lcom/amazon/alexa/assistant/media/model/MediaPlaybackState;", "", "<init>", "(Ljava/lang/String;I)V", WifiConnectionState.IDLE, CareActorsStore.SubscriptionStatus.PAUSED, "FINISHED", "BUFFERING", "PLAYING", "voice_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class MediaPlaybackState {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ MediaPlaybackState[] $VALUES;
    public static final MediaPlaybackState IDLE = new MediaPlaybackState(WifiConnectionState.IDLE, 0);
    public static final MediaPlaybackState PAUSED = new MediaPlaybackState(CareActorsStore.SubscriptionStatus.PAUSED, 1);
    public static final MediaPlaybackState FINISHED = new MediaPlaybackState("FINISHED", 2);
    public static final MediaPlaybackState BUFFERING = new MediaPlaybackState("BUFFERING", 3);
    public static final MediaPlaybackState PLAYING = new MediaPlaybackState("PLAYING", 4);

    private static final /* synthetic */ MediaPlaybackState[] $values() {
        return new MediaPlaybackState[]{IDLE, PAUSED, FINISHED, BUFFERING, PLAYING};
    }

    static {
        MediaPlaybackState[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
    }

    private MediaPlaybackState(String str, int i) {
    }

    @NotNull
    public static EnumEntries<MediaPlaybackState> getEntries() {
        return $ENTRIES;
    }

    public static MediaPlaybackState valueOf(String str) {
        return (MediaPlaybackState) Enum.valueOf(MediaPlaybackState.class, str);
    }

    public static MediaPlaybackState[] values() {
        return (MediaPlaybackState[]) $VALUES.clone();
    }
}
