package com.amazon.comms.calling.domain.model.dataChannel;

import com.amazon.alexa.api.compat.model.assistant.subcomponent.AlexaEventBundleKeys;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B1\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001b¨\u0006\u001c"}, d2 = {"Lcom/amazon/comms/calling/domain/model/dataChannel/DataChannelType;", "", "label", "Lcom/amazon/comms/calling/domain/model/dataChannel/DataChannelLabel;", "nameSpace", "Lcom/amazon/comms/calling/domain/model/dataChannel/NameSpace;", AlexaEventBundleKeys.INSTANCE, "Lcom/amazon/comms/calling/domain/model/dataChannel/InstanceName;", "capability", "Lcom/amazon/comms/calling/domain/model/dataChannel/Capability;", "payloadVersion", "Lcom/amazon/comms/calling/domain/model/dataChannel/PayloadVersion;", "<init>", "(Ljava/lang/String;ILcom/amazon/comms/calling/domain/model/dataChannel/DataChannelLabel;Lcom/amazon/comms/calling/domain/model/dataChannel/NameSpace;Lcom/amazon/comms/calling/domain/model/dataChannel/InstanceName;Lcom/amazon/comms/calling/domain/model/dataChannel/Capability;Lcom/amazon/comms/calling/domain/model/dataChannel/PayloadVersion;)V", "getLabel", "()Lcom/amazon/comms/calling/domain/model/dataChannel/DataChannelLabel;", "getNameSpace", "()Lcom/amazon/comms/calling/domain/model/dataChannel/NameSpace;", "getInstance", "()Lcom/amazon/comms/calling/domain/model/dataChannel/InstanceName;", "getCapability", "()Lcom/amazon/comms/calling/domain/model/dataChannel/Capability;", "getPayloadVersion", "()Lcom/amazon/comms/calling/domain/model/dataChannel/PayloadVersion;", "IN_CALL_PIP", "IN_CALL_CAPABILITY_SEPIA", "IN_CALL_CAPABILITY_CALLING", "REAL_TIME_TEXT", "AlexaCommsCallingUI-Android_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes20.dex */
public final class DataChannelType {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ DataChannelType[] $VALUES;
    public static final DataChannelType IN_CALL_CAPABILITY_CALLING;
    public static final DataChannelType IN_CALL_CAPABILITY_SEPIA;
    public static final DataChannelType IN_CALL_PIP;
    public static final DataChannelType REAL_TIME_TEXT;

    @NotNull
    private final Capability capability;

    @NotNull
    private final InstanceName instance;

    @NotNull
    private final DataChannelLabel label;

    @NotNull
    private final NameSpace nameSpace;

    @NotNull
    private final PayloadVersion payloadVersion;

    private static final /* synthetic */ DataChannelType[] $values() {
        return new DataChannelType[]{IN_CALL_PIP, IN_CALL_CAPABILITY_SEPIA, IN_CALL_CAPABILITY_CALLING, REAL_TIME_TEXT};
    }

    static {
        DataChannelLabel dataChannelLabel = DataChannelLabel.IN_CALL_APPLICATION;
        NameSpace nameSpace = NameSpace.IN_CALL_PIP;
        InstanceName instanceName = InstanceName.CALLING;
        Capability capability = Capability.SCREEN_EVENTS;
        PayloadVersion payloadVersion = PayloadVersion.VERSION_1_0;
        IN_CALL_PIP = new DataChannelType("IN_CALL_PIP", 0, dataChannelLabel, nameSpace, instanceName, capability, payloadVersion);
        NameSpace nameSpace2 = NameSpace.IN_CALL_CAPABILITY;
        IN_CALL_CAPABILITY_SEPIA = new DataChannelType("IN_CALL_CAPABILITY_SEPIA", 1, dataChannelLabel, nameSpace2, InstanceName.SEPIA, capability, payloadVersion);
        IN_CALL_CAPABILITY_CALLING = new DataChannelType("IN_CALL_CAPABILITY_CALLING", 2, dataChannelLabel, nameSpace2, instanceName, capability, payloadVersion);
        REAL_TIME_TEXT = new DataChannelType("REAL_TIME_TEXT", 3, dataChannelLabel, nameSpace2, instanceName, capability, PayloadVersion.LATEST);
        DataChannelType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
    }

    private DataChannelType(String str, int i, DataChannelLabel dataChannelLabel, NameSpace nameSpace, InstanceName instanceName, Capability capability, PayloadVersion payloadVersion) {
        this.label = dataChannelLabel;
        this.nameSpace = nameSpace;
        this.instance = instanceName;
        this.capability = capability;
        this.payloadVersion = payloadVersion;
    }

    @NotNull
    public static EnumEntries<DataChannelType> getEntries() {
        return $ENTRIES;
    }

    public static DataChannelType valueOf(String str) {
        return (DataChannelType) Enum.valueOf(DataChannelType.class, str);
    }

    public static DataChannelType[] values() {
        return (DataChannelType[]) $VALUES.clone();
    }

    @NotNull
    public final Capability getCapability() {
        return this.capability;
    }

    @NotNull
    public final InstanceName getInstance() {
        return this.instance;
    }

    @NotNull
    public final DataChannelLabel getLabel() {
        return this.label;
    }

    @NotNull
    public final NameSpace getNameSpace() {
        return this.nameSpace;
    }

    @NotNull
    public final PayloadVersion getPayloadVersion() {
        return this.payloadVersion;
    }
}
