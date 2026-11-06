package com.amazon.comms.calling.foundation.network.model;

import com.amazon.devicesetupservice.reporting.State;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u0000 \b2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\bB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\t"}, d2 = {"Lcom/amazon/comms/calling/foundation/network/model/CommsProvisionStatus;", "", "<init>", "(Ljava/lang/String;I)V", "UNKNOWN", "AUTO_PROVISIONED", State.PROVISIONED, "DEPROVISIONED", "Companion", "AlexaCommsCallingUI-Android_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes20.dex */
public final class CommsProvisionStatus {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ CommsProvisionStatus[] $VALUES;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE;
    public static final CommsProvisionStatus UNKNOWN = new CommsProvisionStatus("UNKNOWN", 0);
    public static final CommsProvisionStatus AUTO_PROVISIONED = new CommsProvisionStatus("AUTO_PROVISIONED", 1);
    public static final CommsProvisionStatus PROVISIONED = new CommsProvisionStatus(State.PROVISIONED, 2);
    public static final CommsProvisionStatus DEPROVISIONED = new CommsProvisionStatus("DEPROVISIONED", 3);

    private static final /* synthetic */ CommsProvisionStatus[] $values() {
        return new CommsProvisionStatus[]{UNKNOWN, AUTO_PROVISIONED, PROVISIONED, DEPROVISIONED};
    }

    static {
        CommsProvisionStatus[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
        INSTANCE = new Companion(null);
    }

    private CommsProvisionStatus(String str, int i) {
    }

    @NotNull
    public static EnumEntries<CommsProvisionStatus> getEntries() {
        return $ENTRIES;
    }

    public static CommsProvisionStatus valueOf(String str) {
        return (CommsProvisionStatus) Enum.valueOf(CommsProvisionStatus.class, str);
    }

    public static CommsProvisionStatus[] values() {
        return (CommsProvisionStatus[]) $VALUES.clone();
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007J\u000e\u0010\b\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007J\u0018\u0010\t\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u000bH\u0002¨\u0006\f"}, d2 = {"Lcom/amazon/comms/calling/foundation/network/model/CommsProvisionStatus$Companion;", "", "<init>", "()V", "isProvisioned", "", "status", "", "isProvisionedOrAutoProvisioned", "compare", "value", "Lcom/amazon/comms/calling/foundation/network/model/CommsProvisionStatus;", "AlexaCommsCallingUI-Android_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final boolean compare(String value, CommsProvisionStatus status) {
            try {
                return CommsProvisionStatus.valueOf(value) == status;
            } catch (IllegalArgumentException unused) {
                return false;
            }
        }

        public final boolean isProvisioned(@NotNull String status) {
            status.getClass();
            return compare(status, CommsProvisionStatus.PROVISIONED);
        }

        public final boolean isProvisionedOrAutoProvisioned(@NotNull String status) {
            status.getClass();
            return compare(status, CommsProvisionStatus.PROVISIONED) || compare(status, CommsProvisionStatus.AUTO_PROVISIONED);
        }

        private Companion() {
        }
    }
}
