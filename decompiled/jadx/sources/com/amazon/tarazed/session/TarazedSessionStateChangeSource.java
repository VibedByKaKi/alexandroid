package com.amazon.tarazed.session;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u000b\b\u0086\u0081\u0002\u0018\u0000 \u000b2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000bB\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\f"}, d2 = {"Lcom/amazon/tarazed/session/TarazedSessionStateChangeSource;", "", "(Ljava/lang/String;I)V", "SOURCE_CUSTOMER", "SOURCE_AGENT", "SOURCE_OTHER", "SOURCE_DEVICE_SHUTDOWN", "SOURCE_PROFILE_SWITCH", "SOURCE_3P_APP_EVENT", "SOURCE_PRIVACY_EVENT", "SOURCE_INACTIVE", "Companion", "TarazedAndroidLibrary_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes19.dex */
public final class TarazedSessionStateChangeSource {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ TarazedSessionStateChangeSource[] $VALUES;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE;
    public static final TarazedSessionStateChangeSource SOURCE_CUSTOMER = new TarazedSessionStateChangeSource("SOURCE_CUSTOMER", 0);
    public static final TarazedSessionStateChangeSource SOURCE_AGENT = new TarazedSessionStateChangeSource("SOURCE_AGENT", 1);
    public static final TarazedSessionStateChangeSource SOURCE_OTHER = new TarazedSessionStateChangeSource("SOURCE_OTHER", 2);
    public static final TarazedSessionStateChangeSource SOURCE_DEVICE_SHUTDOWN = new TarazedSessionStateChangeSource("SOURCE_DEVICE_SHUTDOWN", 3);
    public static final TarazedSessionStateChangeSource SOURCE_PROFILE_SWITCH = new TarazedSessionStateChangeSource("SOURCE_PROFILE_SWITCH", 4);
    public static final TarazedSessionStateChangeSource SOURCE_3P_APP_EVENT = new TarazedSessionStateChangeSource("SOURCE_3P_APP_EVENT", 5);
    public static final TarazedSessionStateChangeSource SOURCE_PRIVACY_EVENT = new TarazedSessionStateChangeSource("SOURCE_PRIVACY_EVENT", 6);
    public static final TarazedSessionStateChangeSource SOURCE_INACTIVE = new TarazedSessionStateChangeSource("SOURCE_INACTIVE", 7);

    private static final /* synthetic */ TarazedSessionStateChangeSource[] $values() {
        return new TarazedSessionStateChangeSource[]{SOURCE_CUSTOMER, SOURCE_AGENT, SOURCE_OTHER, SOURCE_DEVICE_SHUTDOWN, SOURCE_PROFILE_SWITCH, SOURCE_3P_APP_EVENT, SOURCE_PRIVACY_EVENT, SOURCE_INACTIVE};
    }

    static {
        TarazedSessionStateChangeSource[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
        INSTANCE = new Companion(null);
    }

    private TarazedSessionStateChangeSource(String str, int i) {
    }

    @NotNull
    public static EnumEntries<TarazedSessionStateChangeSource> getEntries() {
        return $ENTRIES;
    }

    public static TarazedSessionStateChangeSource valueOf(String str) {
        return (TarazedSessionStateChangeSource) Enum.valueOf(TarazedSessionStateChangeSource.class, str);
    }

    public static TarazedSessionStateChangeSource[] values() {
        return (TarazedSessionStateChangeSource[]) $VALUES.clone();
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¨\u0006\u0007"}, d2 = {"Lcom/amazon/tarazed/session/TarazedSessionStateChangeSource$Companion;", "", "()V", "fromString", "Lcom/amazon/tarazed/session/TarazedSessionStateChangeSource;", "source", "", "TarazedAndroidLibrary_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nTarazedSessionStateChangeSource.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TarazedSessionStateChangeSource.kt\ncom/amazon/tarazed/session/TarazedSessionStateChangeSource$Companion\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,54:1\n1282#2,2:55\n*S KotlinDebug\n*F\n+ 1 TarazedSessionStateChangeSource.kt\ncom/amazon/tarazed/session/TarazedSessionStateChangeSource$Companion\n*L\n50#1:55,2\n*E\n"})
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Nullable
        public final TarazedSessionStateChangeSource fromString(@Nullable String source) {
            for (TarazedSessionStateChangeSource tarazedSessionStateChangeSource : TarazedSessionStateChangeSource.values()) {
                if (Intrinsics.areEqual(tarazedSessionStateChangeSource.name(), source)) {
                    return tarazedSessionStateChangeSource;
                }
            }
            return null;
        }

        private Companion() {
        }
    }
}
