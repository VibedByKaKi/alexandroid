package com.amazon.comms.calling.domain.model;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\b\u0086\u0081\u0002\u0018\u0000 \u000e2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000eB\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000f"}, d2 = {"Lcom/amazon/comms/calling/domain/model/AssistCspId;", "", "cspId", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getCspId", "()Ljava/lang/String;", "setCspId", "(Ljava/lang/String;)V", "RAPID_RESPONSE", "SHERLOCK", "W_CSP", "MYCROFT", "Companion", "AlexaCommsCallingUI-Android_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes20.dex */
public final class AssistCspId {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ AssistCspId[] $VALUES;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE;

    @NotNull
    private String cspId;
    public static final AssistCspId RAPID_RESPONSE = new AssistCspId("RAPID_RESPONSE", 0, "a2ny6394v53528");
    public static final AssistCspId SHERLOCK = new AssistCspId("SHERLOCK", 1, "sh1b1v8yxvtoukw");
    public static final AssistCspId W_CSP = new AssistCspId("W_CSP", 2, "WA23DL45CMGYECU");
    public static final AssistCspId MYCROFT = new AssistCspId("MYCROFT", 3, "MY3CQGWSDN6AJ8O");

    private static final /* synthetic */ AssistCspId[] $values() {
        return new AssistCspId[]{RAPID_RESPONSE, SHERLOCK, W_CSP, MYCROFT};
    }

    static {
        AssistCspId[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
        INSTANCE = new Companion(null);
    }

    private AssistCspId(String str, int i, String str2) {
        this.cspId = str2;
    }

    @NotNull
    public static EnumEntries<AssistCspId> getEntries() {
        return $ENTRIES;
    }

    public static AssistCspId valueOf(String str) {
        return (AssistCspId) Enum.valueOf(AssistCspId.class, str);
    }

    public static AssistCspId[] values() {
        return (AssistCspId[]) $VALUES.clone();
    }

    @NotNull
    public final String getCspId() {
        return this.cspId;
    }

    public final void setCspId(@NotNull String str) {
        str.getClass();
        this.cspId = str;
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, d2 = {"Lcom/amazon/comms/calling/domain/model/AssistCspId$Companion;", "", "<init>", "()V", "isValidCsp", "", "cspId", "", "AlexaCommsCallingUI-Android_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final boolean isValidCsp(@NotNull String cspId) {
            cspId.getClass();
            for (AssistCspId assistCspId : AssistCspId.values()) {
                if (Intrinsics.areEqual(assistCspId.getCspId(), cspId)) {
                    return true;
                }
            }
            return false;
        }

        private Companion() {
        }
    }
}
