package com.amazon.alexa.api.compat.model;

import com.amazon.alexa.biloba.storage.CareActorsStore;
import com.amazon.devicesetup.common.v1.WifiConnectionState;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lcom/amazon/alexa/api/compat/model/AlexaPlayerInfoState;", "", "<init>", "(Ljava/lang/String;I)V", "PLAYING", CareActorsStore.SubscriptionStatus.PAUSED, "DONE", "BUFFERING", "ERROR", "CANCELLED", WifiConnectionState.IDLE, "AlexaMobileAndroidVoiceSDKApiCompatModel_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class AlexaPlayerInfoState {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ AlexaPlayerInfoState[] $VALUES;
    public static final AlexaPlayerInfoState PLAYING = new AlexaPlayerInfoState("PLAYING", 0);
    public static final AlexaPlayerInfoState PAUSED = new AlexaPlayerInfoState(CareActorsStore.SubscriptionStatus.PAUSED, 1);
    public static final AlexaPlayerInfoState DONE = new AlexaPlayerInfoState("DONE", 2);
    public static final AlexaPlayerInfoState BUFFERING = new AlexaPlayerInfoState("BUFFERING", 3);
    public static final AlexaPlayerInfoState ERROR = new AlexaPlayerInfoState("ERROR", 4);
    public static final AlexaPlayerInfoState CANCELLED = new AlexaPlayerInfoState("CANCELLED", 5);
    public static final AlexaPlayerInfoState IDLE = new AlexaPlayerInfoState(WifiConnectionState.IDLE, 6);

    private static final /* synthetic */ AlexaPlayerInfoState[] $values() {
        return new AlexaPlayerInfoState[]{PLAYING, PAUSED, DONE, BUFFERING, ERROR, CANCELLED, IDLE};
    }

    static {
        AlexaPlayerInfoState[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
    }

    private AlexaPlayerInfoState(String str, int i) {
    }

    @NotNull
    public static EnumEntries<AlexaPlayerInfoState> getEntries() {
        return $ENTRIES;
    }

    public static AlexaPlayerInfoState valueOf(String str) {
        return (AlexaPlayerInfoState) Enum.valueOf(AlexaPlayerInfoState.class, str);
    }

    public static AlexaPlayerInfoState[] values() {
        return (AlexaPlayerInfoState[]) $VALUES.clone();
    }
}
