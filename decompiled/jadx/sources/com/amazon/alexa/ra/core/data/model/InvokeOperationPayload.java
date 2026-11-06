package com.amazon.alexa.ra.core.data.model;

import androidx.annotation.Keep;
import androidx.compose.runtime.internal.StabilityInferred;
import com.amazon.alexa.ra.core.data.utils.JSONConvertible;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@StabilityInferred(parameters = 0)
@Keep
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0005HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lcom/amazon/alexa/ra/core/data/model/InvokeOperationPayload;", "Lcom/amazon/alexa/ra/core/data/utils/JSONConvertible;", "invocation", "Lcom/amazon/alexa/ra/core/data/model/InvokeData;", "text", "", "<init>", "(Lcom/amazon/alexa/ra/core/data/model/InvokeData;Ljava/lang/String;)V", "getInvocation", "()Lcom/amazon/alexa/ra/core/data/model/InvokeData;", "getText", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "", "hashCode", "", "toString", "ui-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes18.dex */
public final /* data */ class InvokeOperationPayload implements JSONConvertible {
    public static final int $stable = 8;

    @SerializedName("invocation")
    @NotNull
    private final InvokeData invocation;

    @SerializedName("text")
    @Nullable
    private final String text;

    public InvokeOperationPayload(@NotNull InvokeData invokeData, @Nullable String str) {
        invokeData.getClass();
        this.invocation = invokeData;
        this.text = str;
    }

    public static /* synthetic */ InvokeOperationPayload copy$default(InvokeOperationPayload invokeOperationPayload, InvokeData invokeData, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            invokeData = invokeOperationPayload.invocation;
        }
        if ((i & 2) != 0) {
            str = invokeOperationPayload.text;
        }
        return invokeOperationPayload.copy(invokeData, str);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final InvokeData getInvocation() {
        return this.invocation;
    }

    @Nullable
    /* renamed from: component2, reason: from getter */
    public final String getText() {
        return this.text;
    }

    @NotNull
    public final InvokeOperationPayload copy(@NotNull InvokeData invocation, @Nullable String text) {
        invocation.getClass();
        return new InvokeOperationPayload(invocation, text);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof InvokeOperationPayload)) {
            return false;
        }
        InvokeOperationPayload invokeOperationPayload = (InvokeOperationPayload) other;
        return Intrinsics.areEqual(this.invocation, invokeOperationPayload.invocation) && Intrinsics.areEqual(this.text, invokeOperationPayload.text);
    }

    @NotNull
    public final InvokeData getInvocation() {
        return this.invocation;
    }

    @Nullable
    public final String getText() {
        return this.text;
    }

    public int hashCode() {
        int hashCode = this.invocation.hashCode() * 31;
        String str = this.text;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    @NotNull
    public String toString() {
        return "InvokeOperationPayload(invocation=" + this.invocation + ", text=" + this.text + MarkdownConstants.RIGHT_PARENTHESIS;
    }

    public /* synthetic */ InvokeOperationPayload(InvokeData invokeData, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(invokeData, (i & 2) != 0 ? null : str);
    }
}
