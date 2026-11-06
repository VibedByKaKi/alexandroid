package com.amazon.alexa.ra.core.data.fragments;

import java.util.Locale;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u0000 \b2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\bB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\t"}, d2 = {"Lcom/amazon/alexa/ra/core/data/fragments/Display;", "", "<init>", "(Ljava/lang/String;I)V", "BLOCK", "CONTAINER", "ITEM", "UNSUPPORTED", "Companion", "ui-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes18.dex */
public final class Display {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ Display[] $VALUES;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE;
    public static final Display BLOCK = new Display("BLOCK", 0);
    public static final Display CONTAINER = new Display("CONTAINER", 1);
    public static final Display ITEM = new Display("ITEM", 2);
    public static final Display UNSUPPORTED = new Display("UNSUPPORTED", 3);

    private static final /* synthetic */ Display[] $values() {
        return new Display[]{BLOCK, CONTAINER, ITEM, UNSUPPORTED};
    }

    static {
        Display[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
        INSTANCE = new Companion(null);
    }

    private Display(String str, int i) {
    }

    @NotNull
    public static EnumEntries<Display> getEntries() {
        return $ENTRIES;
    }

    public static Display valueOf(String str) {
        return (Display) Enum.valueOf(Display.class, str);
    }

    public static Display[] values() {
        return (Display[]) $VALUES.clone();
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, d2 = {"Lcom/amazon/alexa/ra/core/data/fragments/Display$Companion;", "", "<init>", "()V", "from", "Lcom/amazon/alexa/ra/core/data/fragments/Display;", "displayType", "", "ui-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final Display from(@NotNull String displayType) {
            displayType.getClass();
            Locale locale = Locale.US;
            locale.getClass();
            String upperCase = displayType.toUpperCase(locale);
            upperCase.getClass();
            int hashCode = upperCase.hashCode();
            if (hashCode != -1919329183) {
                if (hashCode != 2257683) {
                    if (hashCode == 63294573 && upperCase.equals("BLOCK")) {
                        return Display.BLOCK;
                    }
                } else if (upperCase.equals("ITEM")) {
                    return Display.ITEM;
                }
            } else if (upperCase.equals("CONTAINER")) {
                return Display.CONTAINER;
            }
            return Display.UNSUPPORTED;
        }

        private Companion() {
        }
    }
}
