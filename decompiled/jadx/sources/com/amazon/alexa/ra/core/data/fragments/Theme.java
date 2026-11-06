package com.amazon.alexa.ra.core.data.fragments;

import com.facebook.infer.annotation.ThreadConfined;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u0000 \u00072\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0007B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\b"}, d2 = {"Lcom/amazon/alexa/ra/core/data/fragments/Theme;", "", "<init>", "(Ljava/lang/String;I)V", "LIGHT", "DARK", ThreadConfined.ANY, "Companion", "ui-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes18.dex */
public final class Theme {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ Theme[] $VALUES;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE;
    public static final Theme LIGHT = new Theme("LIGHT", 0);
    public static final Theme DARK = new Theme("DARK", 1);
    public static final Theme ANY = new Theme(ThreadConfined.ANY, 2);

    private static final /* synthetic */ Theme[] $values() {
        return new Theme[]{LIGHT, DARK, ANY};
    }

    static {
        Theme[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
        INSTANCE = new Companion(null);
    }

    private Theme(String str, int i) {
    }

    @NotNull
    public static EnumEntries<Theme> getEntries() {
        return $ENTRIES;
    }

    public static Theme valueOf(String str) {
        return (Theme) Enum.valueOf(Theme.class, str);
    }

    public static Theme[] values() {
        return (Theme[]) $VALUES.clone();
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, d2 = {"Lcom/amazon/alexa/ra/core/data/fragments/Theme$Companion;", "", "<init>", "()V", "from", "Lcom/amazon/alexa/ra/core/data/fragments/Theme;", "theme", "", "ui-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final Theme from(@NotNull String theme) {
            theme.getClass();
            Locale locale = Locale.US;
            locale.getClass();
            String upperCase = theme.toUpperCase(locale);
            upperCase.getClass();
            int hashCode = upperCase.hashCode();
            if (hashCode != 64972) {
                if (hashCode != 2090870) {
                    if (hashCode == 72432886 && upperCase.equals("LIGHT")) {
                        return Theme.LIGHT;
                    }
                } else if (upperCase.equals("DARK")) {
                    return Theme.DARK;
                }
            } else if (upperCase.equals(ThreadConfined.ANY)) {
                return Theme.ANY;
            }
            return Theme.ANY;
        }

        private Companion() {
        }
    }
}
