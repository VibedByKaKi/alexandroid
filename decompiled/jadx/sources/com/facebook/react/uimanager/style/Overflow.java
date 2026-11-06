package com.facebook.react.uimanager.style;

import com.facebook.react.uimanager.ViewProps;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0080\u0081\u0002\u0018\u0000 \u00072\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0007B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\b"}, d2 = {"Lcom/facebook/react/uimanager/style/Overflow;", "", "<init>", "(Ljava/lang/String;I)V", "VISIBLE", "HIDDEN", "SCROLL", "Companion", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class Overflow {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ Overflow[] $VALUES;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE;
    public static final Overflow VISIBLE = new Overflow("VISIBLE", 0);
    public static final Overflow HIDDEN = new Overflow("HIDDEN", 1);
    public static final Overflow SCROLL = new Overflow("SCROLL", 2);

    private static final /* synthetic */ Overflow[] $values() {
        return new Overflow[]{VISIBLE, HIDDEN, SCROLL};
    }

    static {
        Overflow[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
        INSTANCE = new Companion(null);
    }

    private Overflow(String str, int i) {
    }

    @JvmStatic
    @Nullable
    public static final Overflow fromString(@NotNull String str) {
        return INSTANCE.fromString(str);
    }

    @NotNull
    public static EnumEntries<Overflow> getEntries() {
        return $ENTRIES;
    }

    public static Overflow valueOf(String str) {
        return (Overflow) Enum.valueOf(Overflow.class, str);
    }

    public static Overflow[] values() {
        return (Overflow[]) $VALUES.clone();
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0007¨\u0006\b"}, d2 = {"Lcom/facebook/react/uimanager/style/Overflow$Companion;", "", "<init>", "()V", "fromString", "Lcom/facebook/react/uimanager/style/Overflow;", "overflow", "", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        @Nullable
        public final Overflow fromString(@NotNull String overflow) {
            overflow.getClass();
            String lowerCase = overflow.toLowerCase(Locale.ROOT);
            lowerCase.getClass();
            int hashCode = lowerCase.hashCode();
            if (hashCode == -1217487446) {
                if (lowerCase.equals("hidden")) {
                    return Overflow.HIDDEN;
                }
                return null;
            }
            if (hashCode == -907680051) {
                if (lowerCase.equals(ViewProps.SCROLL)) {
                    return Overflow.SCROLL;
                }
                return null;
            }
            if (hashCode == 466743410 && lowerCase.equals(ViewProps.VISIBLE)) {
                return Overflow.VISIBLE;
            }
            return null;
        }

        private Companion() {
        }
    }
}
