package com.amazon.alexa.ra.core.data.fragments;

import androidx.compose.runtime.internal.StabilityInferred;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\b\u0018\u0000 !2\u00020\u0001:\u0001!B9\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0003J\t\u0010\u0017\u001a\u00020\bHÆ\u0003J\t\u0010\u0018\u001a\u00020\nHÆ\u0003J;\u0010\u0019\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\nHÆ\u0001J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001J\t\u0010\u001f\u001a\u00020 HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0019\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006\""}, d2 = {"Lcom/amazon/alexa/ra/core/data/fragments/SmartFragmentPolicy;", "", "expand", "Lcom/amazon/alexa/ra/core/data/fragments/FragmentExpandPolicyType;", "expansionPriority", "", "Lcom/amazon/alexa/ra/core/data/fragments/FragmentExpansionPriorityPolicyType;", SmartFragmentPolicy.LOAD_STATUS, "Lcom/amazon/alexa/ra/core/data/fragments/LoadStatus;", SmartFragmentPolicy.RESPOND_TO_TOUCH, "Lcom/amazon/alexa/ra/core/data/fragments/RespondToTouch;", "<init>", "(Lcom/amazon/alexa/ra/core/data/fragments/FragmentExpandPolicyType;Ljava/util/List;Lcom/amazon/alexa/ra/core/data/fragments/LoadStatus;Lcom/amazon/alexa/ra/core/data/fragments/RespondToTouch;)V", "getExpand", "()Lcom/amazon/alexa/ra/core/data/fragments/FragmentExpandPolicyType;", "getExpansionPriority", "()Ljava/util/List;", "getLoadStatus", "()Lcom/amazon/alexa/ra/core/data/fragments/LoadStatus;", "getRespondToTouch", "()Lcom/amazon/alexa/ra/core/data/fragments/RespondToTouch;", "component1", "component2", "component3", "component4", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "hashCode", "", "toString", "", "SpecificationKeys", "ui-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes18.dex */
public final /* data */ class SmartFragmentPolicy {

    @NotNull
    public static final String EXPAND = "expand";

    @NotNull
    public static final String EXPANSION_PRIORITY = "expansionPriority";

    @NotNull
    public static final String LOAD_STATUS = "loadStatus";

    @NotNull
    public static final String RESPOND_TO_TOUCH = "respondToTouch";

    @Nullable
    private final FragmentExpandPolicyType expand;

    @Nullable
    private final List<FragmentExpansionPriorityPolicyType> expansionPriority;

    @NotNull
    private final LoadStatus loadStatus;

    @NotNull
    private final RespondToTouch respondToTouch;
    public static final int $stable = 8;

    public /* synthetic */ SmartFragmentPolicy(FragmentExpandPolicyType fragmentExpandPolicyType, List list, LoadStatus loadStatus, RespondToTouch respondToTouch, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : fragmentExpandPolicyType, (i & 2) != 0 ? null : list, (i & 4) != 0 ? LoadStatus.NONE : loadStatus, (i & 8) != 0 ? RespondToTouch.NONE : respondToTouch);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SmartFragmentPolicy copy$default(SmartFragmentPolicy smartFragmentPolicy, FragmentExpandPolicyType fragmentExpandPolicyType, List list, LoadStatus loadStatus, RespondToTouch respondToTouch, int i, Object obj) {
        if ((i & 1) != 0) {
            fragmentExpandPolicyType = smartFragmentPolicy.expand;
        }
        if ((i & 2) != 0) {
            list = smartFragmentPolicy.expansionPriority;
        }
        if ((i & 4) != 0) {
            loadStatus = smartFragmentPolicy.loadStatus;
        }
        if ((i & 8) != 0) {
            respondToTouch = smartFragmentPolicy.respondToTouch;
        }
        return smartFragmentPolicy.copy(fragmentExpandPolicyType, list, loadStatus, respondToTouch);
    }

    @Nullable
    /* renamed from: component1, reason: from getter */
    public final FragmentExpandPolicyType getExpand() {
        return this.expand;
    }

    @Nullable
    public final List<FragmentExpansionPriorityPolicyType> component2() {
        return this.expansionPriority;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final LoadStatus getLoadStatus() {
        return this.loadStatus;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final RespondToTouch getRespondToTouch() {
        return this.respondToTouch;
    }

    @NotNull
    public final SmartFragmentPolicy copy(@Nullable FragmentExpandPolicyType expand, @Nullable List<? extends FragmentExpansionPriorityPolicyType> expansionPriority, @NotNull LoadStatus loadStatus, @NotNull RespondToTouch respondToTouch) {
        loadStatus.getClass();
        respondToTouch.getClass();
        return new SmartFragmentPolicy(expand, expansionPriority, loadStatus, respondToTouch);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SmartFragmentPolicy)) {
            return false;
        }
        SmartFragmentPolicy smartFragmentPolicy = (SmartFragmentPolicy) other;
        return this.expand == smartFragmentPolicy.expand && Intrinsics.areEqual(this.expansionPriority, smartFragmentPolicy.expansionPriority) && this.loadStatus == smartFragmentPolicy.loadStatus && this.respondToTouch == smartFragmentPolicy.respondToTouch;
    }

    @Nullable
    public final FragmentExpandPolicyType getExpand() {
        return this.expand;
    }

    @Nullable
    public final List<FragmentExpansionPriorityPolicyType> getExpansionPriority() {
        return this.expansionPriority;
    }

    @NotNull
    public final LoadStatus getLoadStatus() {
        return this.loadStatus;
    }

    @NotNull
    public final RespondToTouch getRespondToTouch() {
        return this.respondToTouch;
    }

    public int hashCode() {
        FragmentExpandPolicyType fragmentExpandPolicyType = this.expand;
        int hashCode = (fragmentExpandPolicyType == null ? 0 : fragmentExpandPolicyType.hashCode()) * 31;
        List<FragmentExpansionPriorityPolicyType> list = this.expansionPriority;
        return this.respondToTouch.hashCode() + ((this.loadStatus.hashCode() + ((hashCode + (list != null ? list.hashCode() : 0)) * 31)) * 31);
    }

    @NotNull
    public String toString() {
        return "SmartFragmentPolicy(expand=" + this.expand + ", expansionPriority=" + this.expansionPriority + ", loadStatus=" + this.loadStatus + ", respondToTouch=" + this.respondToTouch + MarkdownConstants.RIGHT_PARENTHESIS;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SmartFragmentPolicy(@Nullable FragmentExpandPolicyType fragmentExpandPolicyType, @Nullable List<? extends FragmentExpansionPriorityPolicyType> list, @NotNull LoadStatus loadStatus, @NotNull RespondToTouch respondToTouch) {
        loadStatus.getClass();
        respondToTouch.getClass();
        this.expand = fragmentExpandPolicyType;
        this.expansionPriority = list;
        this.loadStatus = loadStatus;
        this.respondToTouch = respondToTouch;
    }

    public SmartFragmentPolicy() {
        this(null, null, null, null, 15, null);
    }
}
