package com.amazon.alexa.accessory.frames.media.autoimport;

import com.amazon.clouddrive.model.ResumeState;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/amazon/alexa/accessory/frames/media/autoimport/AutoImportReplayStatus;", "", "<init>", "(Ljava/lang/String;I)V", "ENABLED_IDLE", "PREPARING", "IN_PROGRESS", ResumeState.COMPLETED, "AlexaAccessoryEchoFramesAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class AutoImportReplayStatus {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ AutoImportReplayStatus[] $VALUES;
    public static final AutoImportReplayStatus ENABLED_IDLE = new AutoImportReplayStatus("ENABLED_IDLE", 0);
    public static final AutoImportReplayStatus PREPARING = new AutoImportReplayStatus("PREPARING", 1);
    public static final AutoImportReplayStatus IN_PROGRESS = new AutoImportReplayStatus("IN_PROGRESS", 2);
    public static final AutoImportReplayStatus COMPLETED = new AutoImportReplayStatus(ResumeState.COMPLETED, 3);

    private static final /* synthetic */ AutoImportReplayStatus[] $values() {
        return new AutoImportReplayStatus[]{ENABLED_IDLE, PREPARING, IN_PROGRESS, COMPLETED};
    }

    static {
        AutoImportReplayStatus[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
    }

    private AutoImportReplayStatus(String str, int i) {
    }

    @NotNull
    public static EnumEntries<AutoImportReplayStatus> getEntries() {
        return $ENTRIES;
    }

    public static AutoImportReplayStatus valueOf(String str) {
        return (AutoImportReplayStatus) Enum.valueOf(AutoImportReplayStatus.class, str);
    }

    public static AutoImportReplayStatus[] values() {
        return (AutoImportReplayStatus[]) $VALUES.clone();
    }
}
