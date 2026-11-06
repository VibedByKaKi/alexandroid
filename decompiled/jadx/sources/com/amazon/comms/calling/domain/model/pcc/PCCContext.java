package com.amazon.comms.calling.domain.model.pcc;

import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import com.amazon.deecomms.calling.phonecallcontroller.PCCConstants;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\n0\tHÆ\u0003J9\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tHÆ\u0001J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001J\t\u0010\u001f\u001a\u00020 HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u001c\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006!"}, d2 = {"Lcom/amazon/comms/calling/domain/model/pcc/PCCContext;", "", "device", "Lcom/amazon/comms/calling/domain/model/pcc/ConnectionState;", "configuration", "Lcom/amazon/comms/calling/domain/model/pcc/PCCConfiguration;", PCCConstants.PHONE_CALL_CONTROLLER_CURRENT_CALL_KEY, "Lcom/amazon/comms/calling/domain/model/pcc/ActiveCall;", PCCConstants.PHONE_CALL_CONTROLLER_ALL_CALLS_KEY, "", "Lcom/amazon/comms/calling/domain/model/pcc/CurrentCall;", "<init>", "(Lcom/amazon/comms/calling/domain/model/pcc/ConnectionState;Lcom/amazon/comms/calling/domain/model/pcc/PCCConfiguration;Lcom/amazon/comms/calling/domain/model/pcc/ActiveCall;Ljava/util/List;)V", "getDevice", "()Lcom/amazon/comms/calling/domain/model/pcc/ConnectionState;", "getConfiguration", "()Lcom/amazon/comms/calling/domain/model/pcc/PCCConfiguration;", "getCurrentCall", "()Lcom/amazon/comms/calling/domain/model/pcc/ActiveCall;", "getAllCalls", "()Ljava/util/List;", "component1", "component2", "component3", "component4", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "hashCode", "", "toString", "", "AlexaCommsCallingUI-Android_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes20.dex */
public final /* data */ class PCCContext {

    @SerializedName(PCCConstants.PHONE_CALL_CONTROLLER_ALL_CALLS_KEY)
    @NotNull
    private final List<CurrentCall> allCalls;

    @SerializedName("configuration")
    @NotNull
    private final PCCConfiguration configuration;

    @SerializedName(PCCConstants.PHONE_CALL_CONTROLLER_CURRENT_CALL_KEY)
    @Nullable
    private final ActiveCall currentCall;

    @SerializedName("device")
    @NotNull
    private final ConnectionState device;

    public PCCContext(@NotNull ConnectionState connectionState, @NotNull PCCConfiguration pCCConfiguration, @Nullable ActiveCall activeCall, @NotNull List<CurrentCall> list) {
        connectionState.getClass();
        pCCConfiguration.getClass();
        list.getClass();
        this.device = connectionState;
        this.configuration = pCCConfiguration;
        this.currentCall = activeCall;
        this.allCalls = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ PCCContext copy$default(PCCContext pCCContext, ConnectionState connectionState, PCCConfiguration pCCConfiguration, ActiveCall activeCall, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            connectionState = pCCContext.device;
        }
        if ((i & 2) != 0) {
            pCCConfiguration = pCCContext.configuration;
        }
        if ((i & 4) != 0) {
            activeCall = pCCContext.currentCall;
        }
        if ((i & 8) != 0) {
            list = pCCContext.allCalls;
        }
        return pCCContext.copy(connectionState, pCCConfiguration, activeCall, list);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final ConnectionState getDevice() {
        return this.device;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final PCCConfiguration getConfiguration() {
        return this.configuration;
    }

    @Nullable
    /* renamed from: component3, reason: from getter */
    public final ActiveCall getCurrentCall() {
        return this.currentCall;
    }

    @NotNull
    public final List<CurrentCall> component4() {
        return this.allCalls;
    }

    @NotNull
    public final PCCContext copy(@NotNull ConnectionState device, @NotNull PCCConfiguration configuration, @Nullable ActiveCall currentCall, @NotNull List<CurrentCall> allCalls) {
        device.getClass();
        configuration.getClass();
        allCalls.getClass();
        return new PCCContext(device, configuration, currentCall, allCalls);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PCCContext)) {
            return false;
        }
        PCCContext pCCContext = (PCCContext) other;
        return Intrinsics.areEqual(this.device, pCCContext.device) && Intrinsics.areEqual(this.configuration, pCCContext.configuration) && Intrinsics.areEqual(this.currentCall, pCCContext.currentCall) && Intrinsics.areEqual(this.allCalls, pCCContext.allCalls);
    }

    @NotNull
    public final List<CurrentCall> getAllCalls() {
        return this.allCalls;
    }

    @NotNull
    public final PCCConfiguration getConfiguration() {
        return this.configuration;
    }

    @Nullable
    public final ActiveCall getCurrentCall() {
        return this.currentCall;
    }

    @NotNull
    public final ConnectionState getDevice() {
        return this.device;
    }

    public int hashCode() {
        int hashCode = (this.configuration.hashCode() + (this.device.hashCode() * 31)) * 31;
        ActiveCall activeCall = this.currentCall;
        return this.allCalls.hashCode() + ((hashCode + (activeCall == null ? 0 : activeCall.hashCode())) * 31);
    }

    @NotNull
    public String toString() {
        return "PCCContext(device=" + this.device + ", configuration=" + this.configuration + ", currentCall=" + this.currentCall + ", allCalls=" + this.allCalls + MarkdownConstants.RIGHT_PARENTHESIS;
    }
}
