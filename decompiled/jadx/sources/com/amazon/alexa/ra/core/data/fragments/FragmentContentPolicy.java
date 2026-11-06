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
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\b\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B%\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0003J'\u0010\u000f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0019\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0018"}, d2 = {"Lcom/amazon/alexa/ra/core/data/fragments/FragmentContentPolicy;", "", "expand", "Lcom/amazon/alexa/ra/core/data/fragments/FragmentExpandPolicyType;", "expansionPriority", "", "Lcom/amazon/alexa/ra/core/data/fragments/FragmentExpansionPriorityPolicyType;", "<init>", "(Lcom/amazon/alexa/ra/core/data/fragments/FragmentExpandPolicyType;Ljava/util/List;)V", "getExpand", "()Lcom/amazon/alexa/ra/core/data/fragments/FragmentExpandPolicyType;", "getExpansionPriority", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "hashCode", "", "toString", "", "Companion", "ui-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes18.dex */
public final /* data */ class FragmentContentPolicy {

    @NotNull
    public static final String EXPAND = "expand";

    @NotNull
    public static final String EXPANSION_PRIORITY = "expansionPriority";

    @Nullable
    private final FragmentExpandPolicyType expand;

    @Nullable
    private final List<FragmentExpansionPriorityPolicyType> expansionPriority;
    public static final int $stable = 8;

    public /* synthetic */ FragmentContentPolicy(FragmentExpandPolicyType fragmentExpandPolicyType, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : fragmentExpandPolicyType, (i & 2) != 0 ? null : list);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ FragmentContentPolicy copy$default(FragmentContentPolicy fragmentContentPolicy, FragmentExpandPolicyType fragmentExpandPolicyType, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            fragmentExpandPolicyType = fragmentContentPolicy.expand;
        }
        if ((i & 2) != 0) {
            list = fragmentContentPolicy.expansionPriority;
        }
        return fragmentContentPolicy.copy(fragmentExpandPolicyType, list);
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
    public final FragmentContentPolicy copy(@Nullable FragmentExpandPolicyType expand, @Nullable List<? extends FragmentExpansionPriorityPolicyType> expansionPriority) {
        return new FragmentContentPolicy(expand, expansionPriority);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FragmentContentPolicy)) {
            return false;
        }
        FragmentContentPolicy fragmentContentPolicy = (FragmentContentPolicy) other;
        return this.expand == fragmentContentPolicy.expand && Intrinsics.areEqual(this.expansionPriority, fragmentContentPolicy.expansionPriority);
    }

    @Nullable
    public final FragmentExpandPolicyType getExpand() {
        return this.expand;
    }

    @Nullable
    public final List<FragmentExpansionPriorityPolicyType> getExpansionPriority() {
        return this.expansionPriority;
    }

    public int hashCode() {
        FragmentExpandPolicyType fragmentExpandPolicyType = this.expand;
        int hashCode = (fragmentExpandPolicyType == null ? 0 : fragmentExpandPolicyType.hashCode()) * 31;
        List<FragmentExpansionPriorityPolicyType> list = this.expansionPriority;
        return hashCode + (list != null ? list.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "FragmentContentPolicy(expand=" + this.expand + ", expansionPriority=" + this.expansionPriority + MarkdownConstants.RIGHT_PARENTHESIS;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public FragmentContentPolicy(@Nullable FragmentExpandPolicyType fragmentExpandPolicyType, @Nullable List<? extends FragmentExpansionPriorityPolicyType> list) {
        this.expand = fragmentExpandPolicyType;
        this.expansionPriority = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public FragmentContentPolicy() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }
}
