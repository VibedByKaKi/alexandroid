package com.amazon.alexa.ra.core.data.model;

import androidx.annotation.Keep;
import com.amazon.alexa.biloba.storage.CareActorsStore;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Keep
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lcom/amazon/alexa/ra/core/data/model/MediaState;", "", "<init>", "(Ljava/lang/String;I)V", "PLAYING", CareActorsStore.SubscriptionStatus.PAUSED, "LOADING", "FINISHED", "ERROR", "ui-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes18.dex */
public final class MediaState {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ MediaState[] $VALUES;

    @SerializedName("PLAYING")
    public static final MediaState PLAYING = new MediaState("PLAYING", 0);

    @SerializedName(CareActorsStore.SubscriptionStatus.PAUSED)
    public static final MediaState PAUSED = new MediaState(CareActorsStore.SubscriptionStatus.PAUSED, 1);

    @SerializedName("LOADING")
    public static final MediaState LOADING = new MediaState("LOADING", 2);

    @SerializedName("FINISHED")
    public static final MediaState FINISHED = new MediaState("FINISHED", 3);

    @SerializedName("ERROR")
    public static final MediaState ERROR = new MediaState("ERROR", 4);

    private static final /* synthetic */ MediaState[] $values() {
        return new MediaState[]{PLAYING, PAUSED, LOADING, FINISHED, ERROR};
    }

    static {
        MediaState[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
    }

    private MediaState(String str, int i) {
    }

    @NotNull
    public static EnumEntries<MediaState> getEntries() {
        return $ENTRIES;
    }

    public static MediaState valueOf(String str) {
        return (MediaState) Enum.valueOf(MediaState.class, str);
    }

    public static MediaState[] values() {
        return (MediaState[]) $VALUES.clone();
    }
}
