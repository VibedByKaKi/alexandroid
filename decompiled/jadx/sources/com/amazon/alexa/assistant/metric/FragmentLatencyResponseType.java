package com.amazon.alexa.assistant.metric;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0080\u0081\u0002\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\tB\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\b¨\u0006\n"}, d2 = {"Lcom/amazon/alexa/assistant/metric/FragmentLatencyResponseType;", "", "value", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "PRIVATE_CONTENT", "Companion", "voice_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class FragmentLatencyResponseType {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ FragmentLatencyResponseType[] $VALUES;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE;
    public static final FragmentLatencyResponseType PRIVATE_CONTENT = new FragmentLatencyResponseType("PRIVATE_CONTENT", 0, "Fragment.PrivateContent");

    @NotNull
    private static final String WIRE_TYPE_PRIVATE = "Private";

    @NotNull
    private final String value;

    private static final /* synthetic */ FragmentLatencyResponseType[] $values() {
        return new FragmentLatencyResponseType[]{PRIVATE_CONTENT};
    }

    static {
        FragmentLatencyResponseType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
        INSTANCE = new Companion(null);
    }

    private FragmentLatencyResponseType(String str, int i, String str2) {
        this.value = str2;
    }

    @NotNull
    public static EnumEntries<FragmentLatencyResponseType> getEntries() {
        return $ENTRIES;
    }

    public static FragmentLatencyResponseType valueOf(String str) {
        return (FragmentLatencyResponseType) Enum.valueOf(FragmentLatencyResponseType.class, str);
    }

    public static FragmentLatencyResponseType[] values() {
        return (FragmentLatencyResponseType[]) $VALUES.clone();
    }

    @NotNull
    public final String getValue() {
        return this.value;
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007R\u000e\u0010\b\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/amazon/alexa/assistant/metric/FragmentLatencyResponseType$Companion;", "", "<init>", "()V", "fromContentType", "Lcom/amazon/alexa/assistant/metric/FragmentLatencyResponseType;", "contentType", "", "WIRE_TYPE_PRIVATE", "voice_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Nullable
        public final FragmentLatencyResponseType fromContentType(@Nullable String contentType) {
            if (Intrinsics.areEqual(contentType, FragmentLatencyResponseType.WIRE_TYPE_PRIVATE)) {
                return FragmentLatencyResponseType.PRIVATE_CONTENT;
            }
            return null;
        }

        private Companion() {
        }
    }
}
