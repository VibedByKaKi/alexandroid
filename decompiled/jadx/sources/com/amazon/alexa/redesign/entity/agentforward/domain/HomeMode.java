package com.amazon.alexa.redesign.entity.agentforward.domain;

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
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u0000 \f2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\fB\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\r"}, d2 = {"Lcom/amazon/alexa/redesign/entity/agentforward/domain/HomeMode;", "", "value", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "HOME", "AWAY", "NIGHT", "VACATION", "Companion", "AlexaMobileAndroidHomeChannel_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes19.dex */
public final class HomeMode {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ HomeMode[] $VALUES;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE;

    @NotNull
    private final String value;
    public static final HomeMode HOME = new HomeMode("HOME", 0, "HOME");
    public static final HomeMode AWAY = new HomeMode("AWAY", 1, "AWAY");
    public static final HomeMode NIGHT = new HomeMode("NIGHT", 2, "NIGHT");
    public static final HomeMode VACATION = new HomeMode("VACATION", 3, "VACATION");

    private static final /* synthetic */ HomeMode[] $values() {
        return new HomeMode[]{HOME, AWAY, NIGHT, VACATION};
    }

    static {
        HomeMode[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
        INSTANCE = new Companion(null);
    }

    private HomeMode(String str, int i, String str2) {
        this.value = str2;
    }

    @NotNull
    public static EnumEntries<HomeMode> getEntries() {
        return $ENTRIES;
    }

    public static HomeMode valueOf(String str) {
        return (HomeMode) Enum.valueOf(HomeMode.class, str);
    }

    public static HomeMode[] values() {
        return (HomeMode[]) $VALUES.clone();
    }

    @NotNull
    public final String getValue() {
        return this.value;
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¨\u0006\b"}, d2 = {"Lcom/amazon/alexa/redesign/entity/agentforward/domain/HomeMode$Companion;", "", "<init>", "()V", "fromString", "Lcom/amazon/alexa/redesign/entity/agentforward/domain/HomeMode;", "value", "", "AlexaMobileAndroidHomeChannel_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nGetHomeContentResponse.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GetHomeContentResponse.kt\ncom/amazon/alexa/redesign/entity/agentforward/domain/HomeMode$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,657:1\n1#2:658\n*E\n"})
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Nullable
        public final HomeMode fromString(@Nullable String value) {
            for (HomeMode homeMode : HomeMode.values()) {
                if (Intrinsics.areEqual(homeMode.getValue(), value)) {
                    return homeMode;
                }
            }
            return null;
        }

        private Companion() {
        }
    }
}
