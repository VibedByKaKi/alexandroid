package com.amazon.tarazed.type;

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
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u0000 \u00052\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0005B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0006"}, d2 = {"Lcom/amazon/tarazed/type/RoleType;", "", "(Ljava/lang/String;I)V", "Watcher", "Sharer", "Companion", "TarazedAndroidLibrary_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes19.dex */
public final class RoleType {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ RoleType[] $VALUES;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE;
    public static final RoleType Watcher = new RoleType("Watcher", 0);
    public static final RoleType Sharer = new RoleType("Sharer", 1);

    private static final /* synthetic */ RoleType[] $values() {
        return new RoleType[]{Watcher, Sharer};
    }

    static {
        RoleType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
        INSTANCE = new Companion(null);
    }

    private RoleType(String str, int i) {
    }

    @NotNull
    public static EnumEntries<RoleType> getEntries() {
        return $ENTRIES;
    }

    public static RoleType valueOf(String str) {
        return (RoleType) Enum.valueOf(RoleType.class, str);
    }

    public static RoleType[] values() {
        return (RoleType[]) $VALUES.clone();
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¨\u0006\u0007"}, d2 = {"Lcom/amazon/tarazed/type/RoleType$Companion;", "", "()V", "fromString", "Lcom/amazon/tarazed/type/RoleType;", "source", "", "TarazedAndroidLibrary_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nRoleType.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RoleType.kt\ncom/amazon/tarazed/type/RoleType$Companion\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,12:1\n1282#2,2:13\n*S KotlinDebug\n*F\n+ 1 RoleType.kt\ncom/amazon/tarazed/type/RoleType$Companion\n*L\n9#1:13,2\n*E\n"})
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Nullable
        public final RoleType fromString(@Nullable String source) {
            for (RoleType roleType : RoleType.values()) {
                if (Intrinsics.areEqual(roleType.name(), source)) {
                    return roleType;
                }
            }
            return null;
        }

        private Companion() {
        }
    }
}
