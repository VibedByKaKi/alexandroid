package com.amazon.alexa.ra.core.data.fragments;

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
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u0000 \u00052\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0005B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004¨\u0006\u0006"}, d2 = {"Lcom/amazon/alexa/ra/core/data/fragments/DataPolicyType;", "", "<init>", "(Ljava/lang/String;I)V", "POLL", "Companion", "ui-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes18.dex */
public final class DataPolicyType {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ DataPolicyType[] $VALUES;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE;
    public static final DataPolicyType POLL = new DataPolicyType("POLL", 0);

    private static final /* synthetic */ DataPolicyType[] $values() {
        return new DataPolicyType[]{POLL};
    }

    static {
        DataPolicyType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
        INSTANCE = new Companion(null);
    }

    private DataPolicyType(String str, int i) {
    }

    @NotNull
    public static EnumEntries<DataPolicyType> getEntries() {
        return $ENTRIES;
    }

    public static DataPolicyType valueOf(String str) {
        return (DataPolicyType) Enum.valueOf(DataPolicyType.class, str);
    }

    public static DataPolicyType[] values() {
        return (DataPolicyType[]) $VALUES.clone();
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, d2 = {"Lcom/amazon/alexa/ra/core/data/fragments/DataPolicyType$Companion;", "", "<init>", "()V", "from", "Lcom/amazon/alexa/ra/core/data/fragments/DataPolicyType;", "value", "", "ui-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final DataPolicyType from(@NotNull String value) {
            value.getClass();
            Locale locale = Locale.US;
            locale.getClass();
            String upperCase = value.toUpperCase(locale);
            upperCase.getClass();
            return Intrinsics.areEqual(upperCase, "POLL") ? DataPolicyType.POLL : DataPolicyType.POLL;
        }

        private Companion() {
        }
    }
}
