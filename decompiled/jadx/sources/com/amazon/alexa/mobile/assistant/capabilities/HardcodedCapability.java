package com.amazon.alexa.mobile.assistant.capabilities;

import com.amazon.alexa.assistant.foundation.model.BasicCapability;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lcom/amazon/alexa/mobile/assistant/capabilities/HardcodedCapability;", "", "serviceClassName", "", "capability", "Lcom/amazon/alexa/assistant/foundation/model/BasicCapability;", "<init>", "(Ljava/lang/String;Lcom/amazon/alexa/assistant/foundation/model/BasicCapability;)V", "getServiceClassName", "()Ljava/lang/String;", "getCapability", "()Lcom/amazon/alexa/assistant/foundation/model/BasicCapability;", "component1", "component2", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "hashCode", "", "toString", "capabilities_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes18.dex */
public final /* data */ class HardcodedCapability {

    @NotNull
    private final BasicCapability capability;

    @NotNull
    private final String serviceClassName;

    public HardcodedCapability(@NotNull String str, @NotNull BasicCapability basicCapability) {
        str.getClass();
        basicCapability.getClass();
        this.serviceClassName = str;
        this.capability = basicCapability;
    }

    public static /* synthetic */ HardcodedCapability copy$default(HardcodedCapability hardcodedCapability, String str, BasicCapability basicCapability, int i, Object obj) {
        if ((i & 1) != 0) {
            str = hardcodedCapability.serviceClassName;
        }
        if ((i & 2) != 0) {
            basicCapability = hardcodedCapability.capability;
        }
        return hardcodedCapability.copy(str, basicCapability);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getServiceClassName() {
        return this.serviceClassName;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final BasicCapability getCapability() {
        return this.capability;
    }

    @NotNull
    public final HardcodedCapability copy(@NotNull String serviceClassName, @NotNull BasicCapability capability) {
        serviceClassName.getClass();
        capability.getClass();
        return new HardcodedCapability(serviceClassName, capability);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HardcodedCapability)) {
            return false;
        }
        HardcodedCapability hardcodedCapability = (HardcodedCapability) other;
        return Intrinsics.areEqual(this.serviceClassName, hardcodedCapability.serviceClassName) && Intrinsics.areEqual(this.capability, hardcodedCapability.capability);
    }

    @NotNull
    public final BasicCapability getCapability() {
        return this.capability;
    }

    @NotNull
    public final String getServiceClassName() {
        return this.serviceClassName;
    }

    public int hashCode() {
        return this.capability.hashCode() + (this.serviceClassName.hashCode() * 31);
    }

    @NotNull
    public String toString() {
        return "HardcodedCapability(serviceClassName=" + this.serviceClassName + ", capability=" + this.capability + MarkdownConstants.RIGHT_PARENTHESIS;
    }
}
