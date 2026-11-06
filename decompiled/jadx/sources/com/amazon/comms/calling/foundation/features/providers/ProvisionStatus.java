package com.amazon.comms.calling.foundation.features.providers;

import com.amazon.devicesetupservice.reporting.State;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/amazon/comms/calling/foundation/features/providers/ProvisionStatus;", "", "<init>", "(Ljava/lang/String;I)V", "AUTO_PROVISIONED", State.PROVISIONED, "DEPROVISIONED", "UNKNOWN", "AlexaCommsCallingUI-Android_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes20.dex */
public final class ProvisionStatus {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ ProvisionStatus[] $VALUES;
    public static final ProvisionStatus AUTO_PROVISIONED = new ProvisionStatus("AUTO_PROVISIONED", 0);
    public static final ProvisionStatus PROVISIONED = new ProvisionStatus(State.PROVISIONED, 1);
    public static final ProvisionStatus DEPROVISIONED = new ProvisionStatus("DEPROVISIONED", 2);
    public static final ProvisionStatus UNKNOWN = new ProvisionStatus("UNKNOWN", 3);

    private static final /* synthetic */ ProvisionStatus[] $values() {
        return new ProvisionStatus[]{AUTO_PROVISIONED, PROVISIONED, DEPROVISIONED, UNKNOWN};
    }

    static {
        ProvisionStatus[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
    }

    private ProvisionStatus(String str, int i) {
    }

    @NotNull
    public static EnumEntries<ProvisionStatus> getEntries() {
        return $ENTRIES;
    }

    public static ProvisionStatus valueOf(String str) {
        return (ProvisionStatus) Enum.valueOf(ProvisionStatus.class, str);
    }

    public static ProvisionStatus[] values() {
        return (ProvisionStatus[]) $VALUES.clone();
    }
}
