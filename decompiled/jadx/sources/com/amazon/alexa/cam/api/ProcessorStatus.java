package com.amazon.alexa.cam.api;

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
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u0000 \u00062\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0006B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0007"}, d2 = {"Lcom/amazon/alexa/cam/api/ProcessorStatus;", "", "(Ljava/lang/String;I)V", "IN_PROGRESS", "DONE", "FAILED", "Companion", "AlexaMobileAndroidSimbaClient_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class ProcessorStatus {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ ProcessorStatus[] $VALUES;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE;
    public static final ProcessorStatus IN_PROGRESS = new ProcessorStatus("IN_PROGRESS", 0);
    public static final ProcessorStatus DONE = new ProcessorStatus("DONE", 1);
    public static final ProcessorStatus FAILED = new ProcessorStatus("FAILED", 2);

    private static final /* synthetic */ ProcessorStatus[] $values() {
        return new ProcessorStatus[]{IN_PROGRESS, DONE, FAILED};
    }

    static {
        ProcessorStatus[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
        INSTANCE = new Companion(null);
    }

    private ProcessorStatus(String str, int i) {
    }

    @NotNull
    public static EnumEntries<ProcessorStatus> getEntries() {
        return $ENTRIES;
    }

    public static ProcessorStatus valueOf(String str) {
        return (ProcessorStatus) Enum.valueOf(ProcessorStatus.class, str);
    }

    public static ProcessorStatus[] values() {
        return (ProcessorStatus[]) $VALUES.clone();
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, d2 = {"Lcom/amazon/alexa/cam/api/ProcessorStatus$Companion;", "", "()V", "fromStatusString", "Lcom/amazon/alexa/cam/api/ProcessorStatus;", "status", "", "AlexaMobileAndroidSimbaClient_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final ProcessorStatus fromStatusString(@NotNull String status) {
            status.getClass();
            String upperCase = status.toUpperCase(Locale.ROOT);
            upperCase.getClass();
            return Intrinsics.areEqual(upperCase, "IN_PROGRESS") ? ProcessorStatus.IN_PROGRESS : Intrinsics.areEqual(upperCase, "DONE") ? ProcessorStatus.DONE : ProcessorStatus.FAILED;
        }

        private Companion() {
        }
    }
}
