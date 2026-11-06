package com.amazon.tarazed.sessionclient.model.sessionstatus;

import com.amazon.alexa.voice.tta.metrics.SimbaEventProcessor;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlinx.coroutines.debug.internal.DebugCoroutineInfoImplKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/amazon/tarazed/sessionclient/model/sessionstatus/SessionStatus;", "", "(Ljava/lang/String;I)V", DebugCoroutineInfoImplKt.CREATED, "PENDING", SimbaEventProcessor.SOURCE_STARTED, "TERMINATED", "TarazedAndroidLibrary_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes19.dex */
public final class SessionStatus {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ SessionStatus[] $VALUES;
    public static final SessionStatus CREATED = new SessionStatus(DebugCoroutineInfoImplKt.CREATED, 0);
    public static final SessionStatus PENDING = new SessionStatus("PENDING", 1);
    public static final SessionStatus STARTED = new SessionStatus(SimbaEventProcessor.SOURCE_STARTED, 2);
    public static final SessionStatus TERMINATED = new SessionStatus("TERMINATED", 3);

    private static final /* synthetic */ SessionStatus[] $values() {
        return new SessionStatus[]{CREATED, PENDING, STARTED, TERMINATED};
    }

    static {
        SessionStatus[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
    }

    private SessionStatus(String str, int i) {
    }

    @NotNull
    public static EnumEntries<SessionStatus> getEntries() {
        return $ENTRIES;
    }

    public static SessionStatus valueOf(String str) {
        return (SessionStatus) Enum.valueOf(SessionStatus.class, str);
    }

    public static SessionStatus[] values() {
        return (SessionStatus[]) $VALUES.clone();
    }
}
