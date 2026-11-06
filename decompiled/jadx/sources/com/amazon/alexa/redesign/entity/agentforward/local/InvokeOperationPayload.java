package com.amazon.alexa.redesign.entity.agentforward.local;

import androidx.compose.runtime.internal.StabilityInferred;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001f\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lcom/amazon/alexa/redesign/entity/agentforward/local/InvokeOperationPayload;", "", "text", "", "invocation", "Lcom/amazon/alexa/redesign/entity/agentforward/local/Invocation;", "<init>", "(Ljava/lang/String;Lcom/amazon/alexa/redesign/entity/agentforward/local/Invocation;)V", "getText", "()Ljava/lang/String;", "getInvocation", "()Lcom/amazon/alexa/redesign/entity/agentforward/local/Invocation;", "component1", "component2", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "hashCode", "", "toString", "AlexaMobileAndroidHomeChannel_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes19.dex */
public final /* data */ class InvokeOperationPayload {
    public static final int $stable = 8;

    @NotNull
    private final Invocation invocation;

    @Nullable
    private final String text;

    public InvokeOperationPayload(@Nullable String str, @NotNull Invocation invocation) {
        invocation.getClass();
        this.text = str;
        this.invocation = invocation;
    }

    public static /* synthetic */ InvokeOperationPayload copy$default(InvokeOperationPayload invokeOperationPayload, String str, Invocation invocation, int i, Object obj) {
        if ((i & 1) != 0) {
            str = invokeOperationPayload.text;
        }
        if ((i & 2) != 0) {
            invocation = invokeOperationPayload.invocation;
        }
        return invokeOperationPayload.copy(str, invocation);
    }

    @Nullable
    /* renamed from: component1, reason: from getter */
    public final String getText() {
        return this.text;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final Invocation getInvocation() {
        return this.invocation;
    }

    @NotNull
    public final InvokeOperationPayload copy(@Nullable String text, @NotNull Invocation invocation) {
        invocation.getClass();
        return new InvokeOperationPayload(text, invocation);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof InvokeOperationPayload)) {
            return false;
        }
        InvokeOperationPayload invokeOperationPayload = (InvokeOperationPayload) other;
        return Intrinsics.areEqual(this.text, invokeOperationPayload.text) && Intrinsics.areEqual(this.invocation, invokeOperationPayload.invocation);
    }

    @NotNull
    public final Invocation getInvocation() {
        return this.invocation;
    }

    @Nullable
    public final String getText() {
        return this.text;
    }

    public int hashCode() {
        String str = this.text;
        return this.invocation.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
    }

    @NotNull
    public String toString() {
        return "InvokeOperationPayload(text=" + this.text + ", invocation=" + this.invocation + MarkdownConstants.RIGHT_PARENTHESIS;
    }

    public /* synthetic */ InvokeOperationPayload(String str, Invocation invocation, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, invocation);
    }
}
