package com.amazon.tarazed.session;

import com.amazon.tarazed.session.sessionEvents.SessionEvents;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.MapsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\b\u0086\u0081\u0002\u0018\u0000 \u00122\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0012B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011¨\u0006\u0013"}, d2 = {"Lcom/amazon/tarazed/session/TarazedSessionStateChangeType;", "", SessionEvents.STATE_CHANGE, "", "(Ljava/lang/String;ILjava/lang/String;)V", "getStateChange", "()Ljava/lang/String;", "CONNECT_IOT", "REQUEST_START_SESSION", "START_SESSION", "RESUME_SESSION", "REQUEST_RESUME_SESSION", "PAUSE_SESSION", "BEGIN_SUSPENDING_SESSION", "SUSPEND_SESSION", "CONFIRM_END_SESSION", "BEGIN_ENDING_SESSION", "END_SESSION", "Companion", "TarazedAndroidLibrary_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nTarazedSessionStateChangeType.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TarazedSessionStateChangeType.kt\ncom/amazon/tarazed/session/TarazedSessionStateChangeType\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,73:1\n8541#2,2:74\n8801#2,4:76\n*S KotlinDebug\n*F\n+ 1 TarazedSessionStateChangeType.kt\ncom/amazon/tarazed/session/TarazedSessionStateChangeType\n*L\n63#1:74,2\n63#1:76,4\n*E\n"})
/* loaded from: classes19.dex */
public final class TarazedSessionStateChangeType {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ TarazedSessionStateChangeType[] $VALUES;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE;

    @NotNull
    private static final Map<String, TarazedSessionStateChangeType> VALUE_MAP;

    @NotNull
    private final String stateChange;
    public static final TarazedSessionStateChangeType CONNECT_IOT = new TarazedSessionStateChangeType("CONNECT_IOT", 0, "connectIot");
    public static final TarazedSessionStateChangeType REQUEST_START_SESSION = new TarazedSessionStateChangeType("REQUEST_START_SESSION", 1, "requestStartSession");
    public static final TarazedSessionStateChangeType START_SESSION = new TarazedSessionStateChangeType("START_SESSION", 2, "startSession");
    public static final TarazedSessionStateChangeType RESUME_SESSION = new TarazedSessionStateChangeType("RESUME_SESSION", 3, "resumeSession");
    public static final TarazedSessionStateChangeType REQUEST_RESUME_SESSION = new TarazedSessionStateChangeType("REQUEST_RESUME_SESSION", 4, "requestResumeSession");
    public static final TarazedSessionStateChangeType PAUSE_SESSION = new TarazedSessionStateChangeType("PAUSE_SESSION", 5, "pauseSession");
    public static final TarazedSessionStateChangeType BEGIN_SUSPENDING_SESSION = new TarazedSessionStateChangeType("BEGIN_SUSPENDING_SESSION", 6, "beginSuspendingSession");
    public static final TarazedSessionStateChangeType SUSPEND_SESSION = new TarazedSessionStateChangeType("SUSPEND_SESSION", 7, "suspendSession");
    public static final TarazedSessionStateChangeType CONFIRM_END_SESSION = new TarazedSessionStateChangeType("CONFIRM_END_SESSION", 8, "confirmEndSession");
    public static final TarazedSessionStateChangeType BEGIN_ENDING_SESSION = new TarazedSessionStateChangeType("BEGIN_ENDING_SESSION", 9, "beginEndingSession");
    public static final TarazedSessionStateChangeType END_SESSION = new TarazedSessionStateChangeType("END_SESSION", 10, "endSession");

    private static final /* synthetic */ TarazedSessionStateChangeType[] $values() {
        return new TarazedSessionStateChangeType[]{CONNECT_IOT, REQUEST_START_SESSION, START_SESSION, RESUME_SESSION, REQUEST_RESUME_SESSION, PAUSE_SESSION, BEGIN_SUSPENDING_SESSION, SUSPEND_SESSION, CONFIRM_END_SESSION, BEGIN_ENDING_SESSION, END_SESSION};
    }

    static {
        TarazedSessionStateChangeType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
        INSTANCE = new Companion(null);
        TarazedSessionStateChangeType[] values = values();
        LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(values.length), 16));
        for (TarazedSessionStateChangeType tarazedSessionStateChangeType : values) {
            linkedHashMap.put(tarazedSessionStateChangeType.stateChange, tarazedSessionStateChangeType);
        }
        VALUE_MAP = linkedHashMap;
    }

    private TarazedSessionStateChangeType(String str, int i, String str2) {
        this.stateChange = str2;
    }

    @NotNull
    public static EnumEntries<TarazedSessionStateChangeType> getEntries() {
        return $ENTRIES;
    }

    public static TarazedSessionStateChangeType valueOf(String str) {
        return (TarazedSessionStateChangeType) Enum.valueOf(TarazedSessionStateChangeType.class, str);
    }

    public static TarazedSessionStateChangeType[] values() {
        return (TarazedSessionStateChangeType[]) $VALUES.clone();
    }

    @NotNull
    public final String getStateChange() {
        return this.stateChange;
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\u0005R\u001a\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/amazon/tarazed/session/TarazedSessionStateChangeType$Companion;", "", "()V", "VALUE_MAP", "", "", "Lcom/amazon/tarazed/session/TarazedSessionStateChangeType;", "lookupStateChange", SessionEvents.STATE_CHANGE, "TarazedAndroidLibrary_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Nullable
        public final TarazedSessionStateChangeType lookupStateChange(@NotNull String stateChange) {
            stateChange.getClass();
            return (TarazedSessionStateChangeType) TarazedSessionStateChangeType.VALUE_MAP.get(stateChange);
        }

        private Companion() {
        }
    }
}
