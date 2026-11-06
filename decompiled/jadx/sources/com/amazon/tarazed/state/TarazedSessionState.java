package com.amazon.tarazed.state;

import com.amazon.alexa.biloba.storage.CareActorsStore;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.debug.internal.DebugCoroutineInfoImplKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0011\b\u0086\u0081\u0002\u0018\u0000 \u00112\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0011B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010¨\u0006\u0012"}, d2 = {"Lcom/amazon/tarazed/state/TarazedSessionState;", "", "(Ljava/lang/String;I)V", "INACTIVE", "PENDING_SIGNAL_CONNECTION", "PENDING_SESSION_VERIFICATION", "PENDING_SIGNAL_VERIFICATION", "PENDING_PERMISSION", "PENDING_MEDIA_CONNECTION", "PLAYING", CareActorsStore.SubscriptionStatus.PAUSED, "RECONNECTING", "SUSPENDING", DebugCoroutineInfoImplKt.SUSPENDED, "PENDING_END", "ENDING", "ENDED", "Companion", "TarazedAndroidLibrary_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes19.dex */
public final class TarazedSessionState {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ TarazedSessionState[] $VALUES;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE;
    public static final TarazedSessionState INACTIVE = new TarazedSessionState("INACTIVE", 0);
    public static final TarazedSessionState PENDING_SIGNAL_CONNECTION = new TarazedSessionState("PENDING_SIGNAL_CONNECTION", 1);
    public static final TarazedSessionState PENDING_SESSION_VERIFICATION = new TarazedSessionState("PENDING_SESSION_VERIFICATION", 2);
    public static final TarazedSessionState PENDING_SIGNAL_VERIFICATION = new TarazedSessionState("PENDING_SIGNAL_VERIFICATION", 3);
    public static final TarazedSessionState PENDING_PERMISSION = new TarazedSessionState("PENDING_PERMISSION", 4);
    public static final TarazedSessionState PENDING_MEDIA_CONNECTION = new TarazedSessionState("PENDING_MEDIA_CONNECTION", 5);
    public static final TarazedSessionState PLAYING = new TarazedSessionState("PLAYING", 6);
    public static final TarazedSessionState PAUSED = new TarazedSessionState(CareActorsStore.SubscriptionStatus.PAUSED, 7);
    public static final TarazedSessionState RECONNECTING = new TarazedSessionState("RECONNECTING", 8);
    public static final TarazedSessionState SUSPENDING = new TarazedSessionState("SUSPENDING", 9);
    public static final TarazedSessionState SUSPENDED = new TarazedSessionState(DebugCoroutineInfoImplKt.SUSPENDED, 10);
    public static final TarazedSessionState PENDING_END = new TarazedSessionState("PENDING_END", 11);
    public static final TarazedSessionState ENDING = new TarazedSessionState("ENDING", 12);
    public static final TarazedSessionState ENDED = new TarazedSessionState("ENDED", 13);

    private static final /* synthetic */ TarazedSessionState[] $values() {
        return new TarazedSessionState[]{INACTIVE, PENDING_SIGNAL_CONNECTION, PENDING_SESSION_VERIFICATION, PENDING_SIGNAL_VERIFICATION, PENDING_PERMISSION, PENDING_MEDIA_CONNECTION, PLAYING, PAUSED, RECONNECTING, SUSPENDING, SUSPENDED, PENDING_END, ENDING, ENDED};
    }

    static {
        TarazedSessionState[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
        INSTANCE = new Companion(null);
    }

    private TarazedSessionState(String str, int i) {
    }

    @NotNull
    public static EnumEntries<TarazedSessionState> getEntries() {
        return $ENTRIES;
    }

    public static TarazedSessionState valueOf(String str) {
        return (TarazedSessionState) Enum.valueOf(TarazedSessionState.class, str);
    }

    public static TarazedSessionState[] values() {
        return (TarazedSessionState[]) $VALUES.clone();
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¨\u0006\u0007"}, d2 = {"Lcom/amazon/tarazed/state/TarazedSessionState$Companion;", "", "()V", "fromString", "Lcom/amazon/tarazed/state/TarazedSessionState;", "state", "", "TarazedAndroidLibrary_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nTarazedSessionState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TarazedSessionState.kt\ncom/amazon/tarazed/state/TarazedSessionState$Companion\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,86:1\n1282#2,2:87\n*S KotlinDebug\n*F\n+ 1 TarazedSessionState.kt\ncom/amazon/tarazed/state/TarazedSessionState$Companion\n*L\n82#1:87,2\n*E\n"})
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Nullable
        public final TarazedSessionState fromString(@Nullable String state) {
            for (TarazedSessionState tarazedSessionState : TarazedSessionState.values()) {
                if (Intrinsics.areEqual(tarazedSessionState.name(), state)) {
                    return tarazedSessionState;
                }
            }
            return null;
        }

        private Companion() {
        }
    }
}
