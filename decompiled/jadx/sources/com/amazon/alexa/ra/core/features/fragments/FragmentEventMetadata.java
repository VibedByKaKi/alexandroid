package com.amazon.alexa.ra.core.features.fragments;

import androidx.biometric.ErrorUtils$$ExternalSyntheticOutline0;
import androidx.compose.animation.core.ArcMode$$ExternalSyntheticOutline0;
import androidx.compose.runtime.internal.StabilityInferred;
import com.amazon.alexa.api.compat.model.assistant.subcomponent.AlexaFragmentsMetadataBundleKeys;
import com.amazon.alexa.ra.core.data.fragments.Purpose;
import com.amazon.alexa.ra.core.data.model.Source;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010#\u001a\u00020\u0003HÆ\u0003J\t\u0010$\u001a\u00020\u0003HÆ\u0003J\t\u0010%\u001a\u00020\u0006HÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\nHÆ\u0003J?\u0010(\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\nHÆ\u0001J\u0013\u0010)\u001a\u00020*2\b\u0010+\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010,\u001a\u00020-HÖ\u0001J\t\u0010.\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u000e\"\u0004\b\u0018\u0010\u0019R\u001c\u0010\u001a\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u000e\"\u0004\b\u001c\u0010\u0019R\u001c\u0010\u001d\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u000e\"\u0004\b\u001f\u0010\u0019R\u001c\u0010 \u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\u000e\"\u0004\b\"\u0010\u0019¨\u0006/"}, d2 = {"Lcom/amazon/alexa/ra/core/features/fragments/FragmentEventMetadata;", "", "conversationId", "", "dialogRequestId", "source", "Lcom/amazon/alexa/ra/core/data/model/Source;", "paginationContext", "Lcom/amazon/alexa/ra/core/features/fragments/PaginationContextData;", "purpose", "Lcom/amazon/alexa/ra/core/data/fragments/Purpose;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/amazon/alexa/ra/core/data/model/Source;Lcom/amazon/alexa/ra/core/features/fragments/PaginationContextData;Lcom/amazon/alexa/ra/core/data/fragments/Purpose;)V", "getConversationId", "()Ljava/lang/String;", "getDialogRequestId", "getSource", "()Lcom/amazon/alexa/ra/core/data/model/Source;", "getPaginationContext", "()Lcom/amazon/alexa/ra/core/features/fragments/PaginationContextData;", "getPurpose", "()Lcom/amazon/alexa/ra/core/data/fragments/Purpose;", AlexaFragmentsMetadataBundleKeys.LAST_SIGNIFICANT_TURN_FRAGMENT_URI, "getLastSignificantTurnFragmentUri", "setLastSignificantTurnFragmentUri", "(Ljava/lang/String;)V", AlexaFragmentsMetadataBundleKeys.LAST_SIGNIFICANT_TURN_TIMESTAMP, "getLastSignificantTurnTimestamp", "setLastSignificantTurnTimestamp", "itemId", "getItemId", "setItemId", "topicId", "getTopicId", "setTopicId", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "hashCode", "", "toString", "ui-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes18.dex */
public final /* data */ class FragmentEventMetadata {
    public static final int $stable = 8;

    @NotNull
    private final String conversationId;

    @NotNull
    private final String dialogRequestId;

    @Nullable
    private String itemId;

    @Nullable
    private String lastSignificantTurnFragmentUri;

    @Nullable
    private String lastSignificantTurnTimestamp;

    @Nullable
    private final PaginationContextData paginationContext;

    @Nullable
    private final Purpose purpose;

    @NotNull
    private final Source source;

    @Nullable
    private String topicId;

    public FragmentEventMetadata(@NotNull String str, @NotNull String str2, @NotNull Source source, @Nullable PaginationContextData paginationContextData, @Nullable Purpose purpose) {
        str.getClass();
        str2.getClass();
        source.getClass();
        this.conversationId = str;
        this.dialogRequestId = str2;
        this.source = source;
        this.paginationContext = paginationContextData;
        this.purpose = purpose;
    }

    public static /* synthetic */ FragmentEventMetadata copy$default(FragmentEventMetadata fragmentEventMetadata, String str, String str2, Source source, PaginationContextData paginationContextData, Purpose purpose, int i, Object obj) {
        if ((i & 1) != 0) {
            str = fragmentEventMetadata.conversationId;
        }
        if ((i & 2) != 0) {
            str2 = fragmentEventMetadata.dialogRequestId;
        }
        if ((i & 4) != 0) {
            source = fragmentEventMetadata.source;
        }
        if ((i & 8) != 0) {
            paginationContextData = fragmentEventMetadata.paginationContext;
        }
        if ((i & 16) != 0) {
            purpose = fragmentEventMetadata.purpose;
        }
        Purpose purpose2 = purpose;
        Source source2 = source;
        return fragmentEventMetadata.copy(str, str2, source2, paginationContextData, purpose2);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getConversationId() {
        return this.conversationId;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getDialogRequestId() {
        return this.dialogRequestId;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final Source getSource() {
        return this.source;
    }

    @Nullable
    /* renamed from: component4, reason: from getter */
    public final PaginationContextData getPaginationContext() {
        return this.paginationContext;
    }

    @Nullable
    /* renamed from: component5, reason: from getter */
    public final Purpose getPurpose() {
        return this.purpose;
    }

    @NotNull
    public final FragmentEventMetadata copy(@NotNull String conversationId, @NotNull String dialogRequestId, @NotNull Source source, @Nullable PaginationContextData paginationContext, @Nullable Purpose purpose) {
        conversationId.getClass();
        dialogRequestId.getClass();
        source.getClass();
        return new FragmentEventMetadata(conversationId, dialogRequestId, source, paginationContext, purpose);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FragmentEventMetadata)) {
            return false;
        }
        FragmentEventMetadata fragmentEventMetadata = (FragmentEventMetadata) other;
        return Intrinsics.areEqual(this.conversationId, fragmentEventMetadata.conversationId) && Intrinsics.areEqual(this.dialogRequestId, fragmentEventMetadata.dialogRequestId) && this.source == fragmentEventMetadata.source && Intrinsics.areEqual(this.paginationContext, fragmentEventMetadata.paginationContext) && this.purpose == fragmentEventMetadata.purpose;
    }

    @NotNull
    public final String getConversationId() {
        return this.conversationId;
    }

    @NotNull
    public final String getDialogRequestId() {
        return this.dialogRequestId;
    }

    @Nullable
    public final String getItemId() {
        return this.itemId;
    }

    @Nullable
    public final String getLastSignificantTurnFragmentUri() {
        return this.lastSignificantTurnFragmentUri;
    }

    @Nullable
    public final String getLastSignificantTurnTimestamp() {
        return this.lastSignificantTurnTimestamp;
    }

    @Nullable
    public final PaginationContextData getPaginationContext() {
        return this.paginationContext;
    }

    @Nullable
    public final Purpose getPurpose() {
        return this.purpose;
    }

    @NotNull
    public final Source getSource() {
        return this.source;
    }

    @Nullable
    public final String getTopicId() {
        return this.topicId;
    }

    public int hashCode() {
        int hashCode = (this.source.hashCode() + ArcMode$$ExternalSyntheticOutline0.m(this.conversationId.hashCode() * 31, 31, this.dialogRequestId)) * 31;
        PaginationContextData paginationContextData = this.paginationContext;
        int hashCode2 = (hashCode + (paginationContextData == null ? 0 : paginationContextData.hashCode())) * 31;
        Purpose purpose = this.purpose;
        return hashCode2 + (purpose != null ? purpose.hashCode() : 0);
    }

    public final void setItemId(@Nullable String str) {
        this.itemId = str;
    }

    public final void setLastSignificantTurnFragmentUri(@Nullable String str) {
        this.lastSignificantTurnFragmentUri = str;
    }

    public final void setLastSignificantTurnTimestamp(@Nullable String str) {
        this.lastSignificantTurnTimestamp = str;
    }

    public final void setTopicId(@Nullable String str) {
        this.topicId = str;
    }

    @NotNull
    public String toString() {
        String str = this.conversationId;
        String str2 = this.dialogRequestId;
        Source source = this.source;
        PaginationContextData paginationContextData = this.paginationContext;
        Purpose purpose = this.purpose;
        StringBuilder m = ErrorUtils$$ExternalSyntheticOutline0.m("FragmentEventMetadata(conversationId=", str, ", dialogRequestId=", str2, ", source=");
        m.append(source);
        m.append(", paginationContext=");
        m.append(paginationContextData);
        m.append(", purpose=");
        m.append(purpose);
        m.append(MarkdownConstants.RIGHT_PARENTHESIS);
        return m.toString();
    }

    public /* synthetic */ FragmentEventMetadata(String str, String str2, Source source, PaginationContextData paginationContextData, Purpose purpose, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, source, (i & 8) != 0 ? null : paginationContextData, (i & 16) != 0 ? null : purpose);
    }
}
