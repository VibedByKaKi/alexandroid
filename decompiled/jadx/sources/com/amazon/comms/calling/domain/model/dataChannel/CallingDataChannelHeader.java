package com.amazon.comms.calling.domain.model.dataChannel;

import com.amazon.alexa.api.compat.model.assistant.subcomponent.AlexaEventBundleKeys;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import com.google.gson.annotations.SerializedName;
import defpackage.b;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fJ\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001f\u001a\u00020\tHÆ\u0003J\t\u0010 \u001a\u00020\u000bHÆ\u0003J\t\u0010!\u001a\u00020\rHÆ\u0003JE\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\rHÆ\u0001J\u0013\u0010#\u001a\u00020$2\b\u0010%\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010&\u001a\u00020'HÖ\u0001J\t\u0010(\u001a\u00020\tHÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0016\u0010\b\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0016\u0010\n\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0016\u0010\f\u001a\u00020\r8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001b¨\u0006)"}, d2 = {"Lcom/amazon/comms/calling/domain/model/dataChannel/CallingDataChannelHeader;", "", "namespace", "Lcom/amazon/comms/calling/domain/model/dataChannel/NameSpace;", AlexaEventBundleKeys.INSTANCE, "Lcom/amazon/comms/calling/domain/model/dataChannel/InstanceName;", "capability", "Lcom/amazon/comms/calling/domain/model/dataChannel/Capability;", "name", "", "payloadVersion", "Lcom/amazon/comms/calling/domain/model/dataChannel/PayloadVersion;", "timestamp", "", "<init>", "(Lcom/amazon/comms/calling/domain/model/dataChannel/NameSpace;Lcom/amazon/comms/calling/domain/model/dataChannel/InstanceName;Lcom/amazon/comms/calling/domain/model/dataChannel/Capability;Ljava/lang/String;Lcom/amazon/comms/calling/domain/model/dataChannel/PayloadVersion;J)V", "getNamespace", "()Lcom/amazon/comms/calling/domain/model/dataChannel/NameSpace;", "getInstance", "()Lcom/amazon/comms/calling/domain/model/dataChannel/InstanceName;", "getCapability", "()Lcom/amazon/comms/calling/domain/model/dataChannel/Capability;", "getName", "()Ljava/lang/String;", "getPayloadVersion", "()Lcom/amazon/comms/calling/domain/model/dataChannel/PayloadVersion;", "getTimestamp", "()J", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "hashCode", "", "toString", "AlexaCommsCallingUI-Android_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes20.dex */
public final /* data */ class CallingDataChannelHeader {

    @SerializedName("capability")
    @NotNull
    private final Capability capability;

    @SerializedName(AlexaEventBundleKeys.INSTANCE)
    @NotNull
    private final InstanceName instance;

    @SerializedName("name")
    @NotNull
    private final String name;

    @SerializedName("namespace")
    @NotNull
    private final NameSpace namespace;

    @SerializedName("payloadVersion")
    @NotNull
    private final PayloadVersion payloadVersion;

    @SerializedName("timestamp")
    private final long timestamp;

    public CallingDataChannelHeader(@NotNull NameSpace nameSpace, @NotNull InstanceName instanceName, @NotNull Capability capability, @NotNull String str, @NotNull PayloadVersion payloadVersion, long j) {
        nameSpace.getClass();
        instanceName.getClass();
        capability.getClass();
        str.getClass();
        payloadVersion.getClass();
        this.namespace = nameSpace;
        this.instance = instanceName;
        this.capability = capability;
        this.name = str;
        this.payloadVersion = payloadVersion;
        this.timestamp = j;
    }

    public static /* synthetic */ CallingDataChannelHeader copy$default(CallingDataChannelHeader callingDataChannelHeader, NameSpace nameSpace, InstanceName instanceName, Capability capability, String str, PayloadVersion payloadVersion, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            nameSpace = callingDataChannelHeader.namespace;
        }
        if ((i & 2) != 0) {
            instanceName = callingDataChannelHeader.instance;
        }
        if ((i & 4) != 0) {
            capability = callingDataChannelHeader.capability;
        }
        if ((i & 8) != 0) {
            str = callingDataChannelHeader.name;
        }
        if ((i & 16) != 0) {
            payloadVersion = callingDataChannelHeader.payloadVersion;
        }
        if ((i & 32) != 0) {
            j = callingDataChannelHeader.timestamp;
        }
        long j2 = j;
        PayloadVersion payloadVersion2 = payloadVersion;
        Capability capability2 = capability;
        return callingDataChannelHeader.copy(nameSpace, instanceName, capability2, str, payloadVersion2, j2);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final NameSpace getNamespace() {
        return this.namespace;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final InstanceName getInstance() {
        return this.instance;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final Capability getCapability() {
        return this.capability;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final String getName() {
        return this.name;
    }

    @NotNull
    /* renamed from: component5, reason: from getter */
    public final PayloadVersion getPayloadVersion() {
        return this.payloadVersion;
    }

    /* renamed from: component6, reason: from getter */
    public final long getTimestamp() {
        return this.timestamp;
    }

    @NotNull
    public final CallingDataChannelHeader copy(@NotNull NameSpace namespace, @NotNull InstanceName instance, @NotNull Capability capability, @NotNull String name, @NotNull PayloadVersion payloadVersion, long timestamp) {
        namespace.getClass();
        instance.getClass();
        capability.getClass();
        name.getClass();
        payloadVersion.getClass();
        return new CallingDataChannelHeader(namespace, instance, capability, name, payloadVersion, timestamp);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CallingDataChannelHeader)) {
            return false;
        }
        CallingDataChannelHeader callingDataChannelHeader = (CallingDataChannelHeader) other;
        return this.namespace == callingDataChannelHeader.namespace && this.instance == callingDataChannelHeader.instance && this.capability == callingDataChannelHeader.capability && Intrinsics.areEqual(this.name, callingDataChannelHeader.name) && this.payloadVersion == callingDataChannelHeader.payloadVersion && this.timestamp == callingDataChannelHeader.timestamp;
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
    public final String getName() {
        return this.name;
    }

    @NotNull
    public final NameSpace getNamespace() {
        return this.namespace;
    }

    @NotNull
    public final PayloadVersion getPayloadVersion() {
        return this.payloadVersion;
    }

    public final long getTimestamp() {
        return this.timestamp;
    }

    public int hashCode() {
        return Long.hashCode(this.timestamp) + ((this.payloadVersion.hashCode() + b.a(this.name, (this.capability.hashCode() + ((this.instance.hashCode() + (this.namespace.hashCode() * 31)) * 31)) * 31, 31)) * 31);
    }

    @NotNull
    public String toString() {
        return "CallingDataChannelHeader(namespace=" + this.namespace + ", instance=" + this.instance + ", capability=" + this.capability + ", name=" + this.name + ", payloadVersion=" + this.payloadVersion + ", timestamp=" + this.timestamp + MarkdownConstants.RIGHT_PARENTHESIS;
    }
}
