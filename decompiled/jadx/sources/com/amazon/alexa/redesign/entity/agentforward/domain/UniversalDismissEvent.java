package com.amazon.alexa.redesign.entity.agentforward.domain;

import androidx.compose.runtime.internal.StabilityInferred;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import defpackage.a$$ExternalSyntheticOutline0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@StabilityInferred(parameters = 0)
@JsonInclude(JsonInclude.Include.NON_NULL)
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B!\b\u0007\u0012\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J!\u0010\u000f\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\b\"\u0004\b\f\u0010\n¨\u0006\u0017"}, d2 = {"Lcom/amazon/alexa/redesign/entity/agentforward/domain/UniversalDismissEvent;", "Lcom/amazon/alexa/redesign/entity/agentforward/domain/ContentAction;", "upc", "", "ppcId", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getUpc", "()Ljava/lang/String;", "setUpc", "(Ljava/lang/String;)V", "getPpcId", "setPpcId", "component1", "component2", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "", "hashCode", "", "toString", "AlexaMobileAndroidHomeChannel_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes19.dex */
public final /* data */ class UniversalDismissEvent implements ContentAction {
    public static final int $stable = 8;

    @Nullable
    private String ppcId;

    @Nullable
    private String upc;

    public /* synthetic */ UniversalDismissEvent(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2);
    }

    public static /* synthetic */ UniversalDismissEvent copy$default(UniversalDismissEvent universalDismissEvent, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = universalDismissEvent.upc;
        }
        if ((i & 2) != 0) {
            str2 = universalDismissEvent.ppcId;
        }
        return universalDismissEvent.copy(str, str2);
    }

    @Nullable
    /* renamed from: component1, reason: from getter */
    public final String getUpc() {
        return this.upc;
    }

    @Nullable
    /* renamed from: component2, reason: from getter */
    public final String getPpcId() {
        return this.ppcId;
    }

    @NotNull
    public final UniversalDismissEvent copy(@JsonProperty("upc") @Nullable String upc, @JsonProperty("ppcId") @Nullable String ppcId) {
        return new UniversalDismissEvent(upc, ppcId);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UniversalDismissEvent)) {
            return false;
        }
        UniversalDismissEvent universalDismissEvent = (UniversalDismissEvent) other;
        return Intrinsics.areEqual(this.upc, universalDismissEvent.upc) && Intrinsics.areEqual(this.ppcId, universalDismissEvent.ppcId);
    }

    @Nullable
    public final String getPpcId() {
        return this.ppcId;
    }

    @Nullable
    public final String getUpc() {
        return this.upc;
    }

    public int hashCode() {
        String str = this.upc;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.ppcId;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final void setPpcId(@Nullable String str) {
        this.ppcId = str;
    }

    public final void setUpc(@Nullable String str) {
        this.upc = str;
    }

    @NotNull
    public String toString() {
        return a$$ExternalSyntheticOutline0.m("UniversalDismissEvent(upc=", this.upc, ", ppcId=", this.ppcId, MarkdownConstants.RIGHT_PARENTHESIS);
    }

    @JsonCreator
    public UniversalDismissEvent(@JsonProperty("upc") @Nullable String str, @JsonProperty("ppcId") @Nullable String str2) {
        this.upc = str;
        this.ppcId = str2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @JsonCreator
    public UniversalDismissEvent() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }
}
