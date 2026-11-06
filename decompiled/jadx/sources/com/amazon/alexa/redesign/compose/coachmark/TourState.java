package com.amazon.alexa.redesign.compose.coachmark;

import com.amazon.clouddrive.model.ResumeState;
import com.amazon.devicesetup.common.v1.WifiConnectionState;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u000b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"Lcom/amazon/alexa/redesign/compose/coachmark/TourState;", "", "<init>", "(Ljava/lang/String;I)V", WifiConnectionState.IDLE, "READY", "WAITING", "ACTIVE", ResumeState.COMPLETED, "DISMISSED", "ERROR", "DISABLED", "AlexaMobileAndroidHomeChannel_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes19.dex */
public final class TourState {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ TourState[] $VALUES;
    public static final TourState IDLE = new TourState(WifiConnectionState.IDLE, 0);
    public static final TourState READY = new TourState("READY", 1);
    public static final TourState WAITING = new TourState("WAITING", 2);
    public static final TourState ACTIVE = new TourState("ACTIVE", 3);
    public static final TourState COMPLETED = new TourState(ResumeState.COMPLETED, 4);
    public static final TourState DISMISSED = new TourState("DISMISSED", 5);
    public static final TourState ERROR = new TourState("ERROR", 6);
    public static final TourState DISABLED = new TourState("DISABLED", 7);

    private static final /* synthetic */ TourState[] $values() {
        return new TourState[]{IDLE, READY, WAITING, ACTIVE, COMPLETED, DISMISSED, ERROR, DISABLED};
    }

    static {
        TourState[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
    }

    private TourState(String str, int i) {
    }

    @NotNull
    public static EnumEntries<TourState> getEntries() {
        return $ENTRIES;
    }

    public static TourState valueOf(String str) {
        return (TourState) Enum.valueOf(TourState.class, str);
    }

    public static TourState[] values() {
        return (TourState[]) $VALUES.clone();
    }
}
