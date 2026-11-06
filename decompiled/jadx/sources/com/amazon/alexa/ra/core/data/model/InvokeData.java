package com.amazon.alexa.ra.core.data.model;

import androidx.annotation.Keep;
import androidx.biometric.ErrorUtils$$ExternalSyntheticOutline0;
import androidx.compose.animation.core.ArcMode$$ExternalSyntheticOutline0;
import androidx.compose.runtime.internal.StabilityInferred;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.JsonElement;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@StabilityInferred(parameters = 0)
@Keep
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÆ\u0003J\u0011\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007HÆ\u0003J/\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0005HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u001e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001b"}, d2 = {"Lcom/amazon/alexa/ra/core/data/model/InvokeData;", "", "service", "Lcom/amazon/alexa/ra/core/data/model/InvokeServiceData;", "operation", "", "arguments", "", "Lkotlinx/serialization/json/JsonElement;", "<init>", "(Lcom/amazon/alexa/ra/core/data/model/InvokeServiceData;Ljava/lang/String;Ljava/util/List;)V", "getService", "()Lcom/amazon/alexa/ra/core/data/model/InvokeServiceData;", "getOperation", "()Ljava/lang/String;", "getArguments", "()Ljava/util/List;", "component1", "component2", "component3", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "hashCode", "", "toString", "ui-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes18.dex */
public final /* data */ class InvokeData {
    public static final int $stable = 8;

    @SerializedName("arguments")
    @Nullable
    private final List<JsonElement> arguments;

    @SerializedName("operation")
    @NotNull
    private final String operation;

    @SerializedName("service")
    @NotNull
    private final InvokeServiceData service;

    /* JADX WARN: Multi-variable type inference failed */
    public InvokeData(@NotNull InvokeServiceData invokeServiceData, @NotNull String str, @Nullable List<? extends JsonElement> list) {
        invokeServiceData.getClass();
        str.getClass();
        this.service = invokeServiceData;
        this.operation = str;
        this.arguments = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ InvokeData copy$default(InvokeData invokeData, InvokeServiceData invokeServiceData, String str, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            invokeServiceData = invokeData.service;
        }
        if ((i & 2) != 0) {
            str = invokeData.operation;
        }
        if ((i & 4) != 0) {
            list = invokeData.arguments;
        }
        return invokeData.copy(invokeServiceData, str, list);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final InvokeServiceData getService() {
        return this.service;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getOperation() {
        return this.operation;
    }

    @Nullable
    public final List<JsonElement> component3() {
        return this.arguments;
    }

    @NotNull
    public final InvokeData copy(@NotNull InvokeServiceData service, @NotNull String operation, @Nullable List<? extends JsonElement> arguments) {
        service.getClass();
        operation.getClass();
        return new InvokeData(service, operation, arguments);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof InvokeData)) {
            return false;
        }
        InvokeData invokeData = (InvokeData) other;
        return Intrinsics.areEqual(this.service, invokeData.service) && Intrinsics.areEqual(this.operation, invokeData.operation) && Intrinsics.areEqual(this.arguments, invokeData.arguments);
    }

    @Nullable
    public final List<JsonElement> getArguments() {
        return this.arguments;
    }

    @NotNull
    public final String getOperation() {
        return this.operation;
    }

    @NotNull
    public final InvokeServiceData getService() {
        return this.service;
    }

    public int hashCode() {
        int m = ArcMode$$ExternalSyntheticOutline0.m(this.service.hashCode() * 31, 31, this.operation);
        List<JsonElement> list = this.arguments;
        return m + (list == null ? 0 : list.hashCode());
    }

    @NotNull
    public String toString() {
        InvokeServiceData invokeServiceData = this.service;
        String str = this.operation;
        List<JsonElement> list = this.arguments;
        StringBuilder sb = new StringBuilder("InvokeData(service=");
        sb.append(invokeServiceData);
        sb.append(", operation=");
        sb.append(str);
        sb.append(", arguments=");
        return ErrorUtils$$ExternalSyntheticOutline0.m(MarkdownConstants.RIGHT_PARENTHESIS, list, sb);
    }

    public /* synthetic */ InvokeData(InvokeServiceData invokeServiceData, String str, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(invokeServiceData, str, (i & 4) != 0 ? null : list);
    }
}
