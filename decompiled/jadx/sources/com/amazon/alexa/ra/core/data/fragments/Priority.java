package com.amazon.alexa.ra.core.data.fragments;

import com.amazon.devicesetupservice.scap.v1.BleConnectionPriority;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u0000 \u00062\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0006B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0007"}, d2 = {"Lcom/amazon/alexa/ra/core/data/fragments/Priority;", "", "<init>", "(Ljava/lang/String;I)V", BleConnectionPriority.LOW, BleConnectionPriority.HIGH, "Companion", "ui-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes18.dex */
public final class Priority {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ Priority[] $VALUES;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE;
    public static final Priority LOW = new Priority(BleConnectionPriority.LOW, 0);
    public static final Priority HIGH = new Priority(BleConnectionPriority.HIGH, 1);

    private static final /* synthetic */ Priority[] $values() {
        return new Priority[]{LOW, HIGH};
    }

    static {
        Priority[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
        INSTANCE = new Companion(null);
    }

    private Priority(String str, int i) {
    }

    @NotNull
    public static EnumEntries<Priority> getEntries() {
        return $ENTRIES;
    }

    public static Priority valueOf(String str) {
        return (Priority) Enum.valueOf(Priority.class, str);
    }

    public static Priority[] values() {
        return (Priority[]) $VALUES.clone();
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, d2 = {"Lcom/amazon/alexa/ra/core/data/fragments/Priority$Companion;", "", "<init>", "()V", "from", "Lcom/amazon/alexa/ra/core/data/fragments/Priority;", "priority", "", "ui-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final Priority from(@NotNull String priority) {
            priority.getClass();
            Locale locale = Locale.US;
            locale.getClass();
            String upperCase = priority.toUpperCase(locale);
            upperCase.getClass();
            return Intrinsics.areEqual(upperCase, BleConnectionPriority.LOW) ? Priority.LOW : Intrinsics.areEqual(upperCase, BleConnectionPriority.HIGH) ? Priority.HIGH : Priority.LOW;
        }

        private Companion() {
        }
    }
}
