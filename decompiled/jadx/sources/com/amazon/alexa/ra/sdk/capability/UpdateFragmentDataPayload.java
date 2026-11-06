package com.amazon.alexa.ra.sdk.capability;

import androidx.annotation.Keep;
import androidx.compose.runtime.internal.StabilityInferred;
import com.amazon.alexa.api.AlexaMetricsName$Pryon$$ExternalSyntheticOutline0;
import com.amazon.alexa.ra.core.data.fragments.FragmentDataOperation;
import com.amazon.alexa.ra.core.data.utils.JSONConvertible;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@StabilityInferred(parameters = 0)
@Keep
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J#\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u001c\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0017"}, d2 = {"Lcom/amazon/alexa/ra/sdk/capability/UpdateFragmentDataPayload;", "Lcom/amazon/alexa/ra/core/data/utils/JSONConvertible;", ConversationCapability.INTENT_EXTRA_FRAGMENT_URI, "", "operations", "", "Lcom/amazon/alexa/ra/core/data/fragments/FragmentDataOperation;", "<init>", "(Ljava/lang/String;Ljava/util/List;)V", "getFragmentUri", "()Ljava/lang/String;", "getOperations", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "", "hashCode", "", "toString", "AVSMobileFramework-ra-android-ui_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes19.dex */
public final /* data */ class UpdateFragmentDataPayload implements JSONConvertible {
    public static final int $stable = 8;

    @SerializedName(ConversationCapability.INTENT_EXTRA_FRAGMENT_URI)
    @NotNull
    private final String fragmentUri;

    @SerializedName("operations")
    @NotNull
    private final List<FragmentDataOperation> operations;

    public UpdateFragmentDataPayload(@NotNull String str, @NotNull List<FragmentDataOperation> list) {
        str.getClass();
        list.getClass();
        this.fragmentUri = str;
        this.operations = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ UpdateFragmentDataPayload copy$default(UpdateFragmentDataPayload updateFragmentDataPayload, String str, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = updateFragmentDataPayload.fragmentUri;
        }
        if ((i & 2) != 0) {
            list = updateFragmentDataPayload.operations;
        }
        return updateFragmentDataPayload.copy(str, list);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getFragmentUri() {
        return this.fragmentUri;
    }

    @NotNull
    public final List<FragmentDataOperation> component2() {
        return this.operations;
    }

    @NotNull
    public final UpdateFragmentDataPayload copy(@NotNull String fragmentUri, @NotNull List<FragmentDataOperation> operations) {
        fragmentUri.getClass();
        operations.getClass();
        return new UpdateFragmentDataPayload(fragmentUri, operations);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UpdateFragmentDataPayload)) {
            return false;
        }
        UpdateFragmentDataPayload updateFragmentDataPayload = (UpdateFragmentDataPayload) other;
        return Intrinsics.areEqual(this.fragmentUri, updateFragmentDataPayload.fragmentUri) && Intrinsics.areEqual(this.operations, updateFragmentDataPayload.operations);
    }

    @NotNull
    public final String getFragmentUri() {
        return this.fragmentUri;
    }

    @NotNull
    public final List<FragmentDataOperation> getOperations() {
        return this.operations;
    }

    public int hashCode() {
        return this.operations.hashCode() + (this.fragmentUri.hashCode() * 31);
    }

    @NotNull
    public String toString() {
        return AlexaMetricsName$Pryon$$ExternalSyntheticOutline0.m("UpdateFragmentDataPayload(fragmentUri=", this.fragmentUri, ", operations=", (List) this.operations, MarkdownConstants.RIGHT_PARENTHESIS);
    }
}
