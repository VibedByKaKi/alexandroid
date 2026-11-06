package com.amazon.comms.calling.domain.model.dataChannel;

import androidx.biometric.ErrorUtils$$ExternalSyntheticOutline0;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import com.google.gson.annotations.SerializedName;
import defpackage.b;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003J7\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001b\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u001c\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001c"}, d2 = {"Lcom/amazon/comms/calling/domain/model/dataChannel/ApplyEffectEvent;", "", "requestId", "", "effectsSessionId", "effectId", "parameters", "", "Lcom/amazon/comms/calling/domain/model/dataChannel/SepiaParameter;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "getRequestId", "()Ljava/lang/String;", "getEffectsSessionId", "getEffectId", "getParameters", "()Ljava/util/List;", "component1", "component2", "component3", "component4", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "hashCode", "", "toString", "AlexaCommsCallingUI-Android_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes20.dex */
public final /* data */ class ApplyEffectEvent {

    @SerializedName("effectId")
    @NotNull
    private final String effectId;

    @SerializedName("effectsSessionId")
    @NotNull
    private final String effectsSessionId;

    @SerializedName("parameters")
    @NotNull
    private final List<SepiaParameter> parameters;

    @SerializedName("requestId")
    @NotNull
    private final String requestId;

    public ApplyEffectEvent(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull List<SepiaParameter> list) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        list.getClass();
        this.requestId = str;
        this.effectsSessionId = str2;
        this.effectId = str3;
        this.parameters = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ApplyEffectEvent copy$default(ApplyEffectEvent applyEffectEvent, String str, String str2, String str3, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = applyEffectEvent.requestId;
        }
        if ((i & 2) != 0) {
            str2 = applyEffectEvent.effectsSessionId;
        }
        if ((i & 4) != 0) {
            str3 = applyEffectEvent.effectId;
        }
        if ((i & 8) != 0) {
            list = applyEffectEvent.parameters;
        }
        return applyEffectEvent.copy(str, str2, str3, list);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getRequestId() {
        return this.requestId;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getEffectsSessionId() {
        return this.effectsSessionId;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final String getEffectId() {
        return this.effectId;
    }

    @NotNull
    public final List<SepiaParameter> component4() {
        return this.parameters;
    }

    @NotNull
    public final ApplyEffectEvent copy(@NotNull String requestId, @NotNull String effectsSessionId, @NotNull String effectId, @NotNull List<SepiaParameter> parameters) {
        requestId.getClass();
        effectsSessionId.getClass();
        effectId.getClass();
        parameters.getClass();
        return new ApplyEffectEvent(requestId, effectsSessionId, effectId, parameters);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ApplyEffectEvent)) {
            return false;
        }
        ApplyEffectEvent applyEffectEvent = (ApplyEffectEvent) other;
        return Intrinsics.areEqual(this.requestId, applyEffectEvent.requestId) && Intrinsics.areEqual(this.effectsSessionId, applyEffectEvent.effectsSessionId) && Intrinsics.areEqual(this.effectId, applyEffectEvent.effectId) && Intrinsics.areEqual(this.parameters, applyEffectEvent.parameters);
    }

    @NotNull
    public final String getEffectId() {
        return this.effectId;
    }

    @NotNull
    public final String getEffectsSessionId() {
        return this.effectsSessionId;
    }

    @NotNull
    public final List<SepiaParameter> getParameters() {
        return this.parameters;
    }

    @NotNull
    public final String getRequestId() {
        return this.requestId;
    }

    public int hashCode() {
        return this.parameters.hashCode() + b.a(this.effectId, b.a(this.effectsSessionId, this.requestId.hashCode() * 31, 31), 31);
    }

    @NotNull
    public String toString() {
        String str = this.requestId;
        String str2 = this.effectsSessionId;
        String str3 = this.effectId;
        List<SepiaParameter> list = this.parameters;
        StringBuilder m = ErrorUtils$$ExternalSyntheticOutline0.m("ApplyEffectEvent(requestId=", str, ", effectsSessionId=", str2, ", effectId=");
        m.append(str3);
        m.append(", parameters=");
        m.append(list);
        m.append(MarkdownConstants.RIGHT_PARENTHESIS);
        return m.toString();
    }
}
