package com.facebook.react.uimanager;

import java.util.Locale;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.text.StringsKt__StringsJVMKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u0000 \b2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\bB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\t"}, d2 = {"Lcom/facebook/react/uimanager/PointerEvents;", "", "<init>", "(Ljava/lang/String;I)V", "NONE", "BOX_NONE", "BOX_ONLY", "AUTO", "Companion", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class PointerEvents {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ PointerEvents[] $VALUES;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE;
    public static final PointerEvents NONE = new PointerEvents("NONE", 0);
    public static final PointerEvents BOX_NONE = new PointerEvents("BOX_NONE", 1);
    public static final PointerEvents BOX_ONLY = new PointerEvents("BOX_ONLY", 2);
    public static final PointerEvents AUTO = new PointerEvents("AUTO", 3);

    private static final /* synthetic */ PointerEvents[] $values() {
        return new PointerEvents[]{NONE, BOX_NONE, BOX_ONLY, AUTO};
    }

    static {
        PointerEvents[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
        INSTANCE = new Companion(null);
    }

    private PointerEvents(String str, int i) {
    }

    @JvmStatic
    public static final boolean canBeTouchTarget(@NotNull PointerEvents pointerEvents) {
        return INSTANCE.canBeTouchTarget(pointerEvents);
    }

    @JvmStatic
    public static final boolean canChildrenBeTouchTarget(@NotNull PointerEvents pointerEvents) {
        return INSTANCE.canChildrenBeTouchTarget(pointerEvents);
    }

    @NotNull
    public static EnumEntries<PointerEvents> getEntries() {
        return $ENTRIES;
    }

    @JvmStatic
    @NotNull
    public static final PointerEvents parsePointerEvents(@Nullable String str) {
        return INSTANCE.parsePointerEvents(str);
    }

    public static PointerEvents valueOf(String str) {
        return (PointerEvents) Enum.valueOf(PointerEvents.class, str);
    }

    public static PointerEvents[] values() {
        return (PointerEvents[]) $VALUES.clone();
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0007J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0005H\u0007J\u0010\u0010\u000b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0005H\u0007¨\u0006\f"}, d2 = {"Lcom/facebook/react/uimanager/PointerEvents$Companion;", "", "<init>", "()V", "parsePointerEvents", "Lcom/facebook/react/uimanager/PointerEvents;", "pointerEventsStr", "", "canBeTouchTarget", "", ViewProps.POINTER_EVENTS, "canChildrenBeTouchTarget", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        public final boolean canBeTouchTarget(@NotNull PointerEvents pointerEvents) {
            pointerEvents.getClass();
            return pointerEvents == PointerEvents.AUTO || pointerEvents == PointerEvents.BOX_ONLY;
        }

        @JvmStatic
        public final boolean canChildrenBeTouchTarget(@NotNull PointerEvents pointerEvents) {
            pointerEvents.getClass();
            return pointerEvents == PointerEvents.AUTO || pointerEvents == PointerEvents.BOX_NONE;
        }

        @JvmStatic
        @NotNull
        public final PointerEvents parsePointerEvents(@Nullable String pointerEventsStr) {
            String replace$default;
            if (pointerEventsStr == null) {
                return PointerEvents.AUTO;
            }
            Locale locale = Locale.US;
            locale.getClass();
            String upperCase = pointerEventsStr.toUpperCase(locale);
            upperCase.getClass();
            replace$default = StringsKt__StringsJVMKt.replace$default(upperCase, "-", "_", false, 4, (Object) null);
            return PointerEvents.valueOf(replace$default);
        }

        private Companion() {
        }
    }
}
