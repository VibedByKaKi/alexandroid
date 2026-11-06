package com.amazon.alexa.redesign.entity;

import androidx.compose.runtime.internal.StabilityInferred;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@StabilityInferred(parameters = 0)
@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u000e\b\u0001\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u000e\b\u0001\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J)\u0010\r\u001a\u00020\u00002\u000e\b\u0003\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0003\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0004HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\t¨\u0006\u0014"}, d2 = {"Lcom/amazon/alexa/redesign/entity/AllMembers;", "", "endpointIds", "", "", "groupIds", "<init>", "(Ljava/util/List;Ljava/util/List;)V", "getEndpointIds", "()Ljava/util/List;", "getGroupIds", "component1", "component2", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "hashCode", "", "toString", "AlexaMobileAndroidHomeChannel_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes19.dex */
public final /* data */ class AllMembers {
    public static final int $stable = 8;

    @NotNull
    private final List<String> endpointIds;

    @NotNull
    private final List<String> groupIds;

    public AllMembers(@JsonProperty("endpointIds") @NotNull List<String> list, @JsonProperty("groupIds") @NotNull List<String> list2) {
        list.getClass();
        list2.getClass();
        this.endpointIds = list;
        this.groupIds = list2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AllMembers copy$default(AllMembers allMembers, List list, List list2, int i, Object obj) {
        if ((i & 1) != 0) {
            list = allMembers.endpointIds;
        }
        if ((i & 2) != 0) {
            list2 = allMembers.groupIds;
        }
        return allMembers.copy(list, list2);
    }

    @NotNull
    public final List<String> component1() {
        return this.endpointIds;
    }

    @NotNull
    public final List<String> component2() {
        return this.groupIds;
    }

    @NotNull
    public final AllMembers copy(@JsonProperty("endpointIds") @NotNull List<String> endpointIds, @JsonProperty("groupIds") @NotNull List<String> groupIds) {
        endpointIds.getClass();
        groupIds.getClass();
        return new AllMembers(endpointIds, groupIds);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AllMembers)) {
            return false;
        }
        AllMembers allMembers = (AllMembers) other;
        return Intrinsics.areEqual(this.endpointIds, allMembers.endpointIds) && Intrinsics.areEqual(this.groupIds, allMembers.groupIds);
    }

    @NotNull
    public final List<String> getEndpointIds() {
        return this.endpointIds;
    }

    @NotNull
    public final List<String> getGroupIds() {
        return this.groupIds;
    }

    public int hashCode() {
        return this.groupIds.hashCode() + (this.endpointIds.hashCode() * 31);
    }

    @NotNull
    public String toString() {
        return "AllMembers(endpointIds=" + this.endpointIds + ", groupIds=" + this.groupIds + MarkdownConstants.RIGHT_PARENTHESIS;
    }
}
