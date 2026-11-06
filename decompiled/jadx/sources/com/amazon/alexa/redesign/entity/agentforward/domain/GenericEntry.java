package com.amazon.alexa.redesign.entity.agentforward.domain;

import androidx.compose.runtime.internal.StabilityInferred;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@StabilityInferred(parameters = 0)
@JsonInclude(JsonInclude.Include.NON_NULL)
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B-\b\u0007\u0012\u0010\b\u0003\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\u0010\b\u0003\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0011\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J-\u0010\u0010\u001a\u00020\u00002\u0010\b\u0003\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\u0010\b\u0003\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001R\"\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\"\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\t\"\u0004\b\r\u0010\u000b¨\u0006\u0018"}, d2 = {"Lcom/amazon/alexa/redesign/entity/agentforward/domain/GenericEntry;", "", "fillerGreetings", "", "Lcom/amazon/alexa/redesign/entity/agentforward/domain/GreetingItem;", "standaloneGreetings", "<init>", "(Ljava/util/List;Ljava/util/List;)V", "getFillerGreetings", "()Ljava/util/List;", "setFillerGreetings", "(Ljava/util/List;)V", "getStandaloneGreetings", "setStandaloneGreetings", "component1", "component2", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "hashCode", "", "toString", "", "AlexaMobileAndroidHomeChannel_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes19.dex */
public final /* data */ class GenericEntry {
    public static final int $stable = 8;

    @Nullable
    private List<GreetingItem> fillerGreetings;

    @Nullable
    private List<GreetingItem> standaloneGreetings;

    public /* synthetic */ GenericEntry(List list, List list2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : list, (i & 2) != 0 ? null : list2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ GenericEntry copy$default(GenericEntry genericEntry, List list, List list2, int i, Object obj) {
        if ((i & 1) != 0) {
            list = genericEntry.fillerGreetings;
        }
        if ((i & 2) != 0) {
            list2 = genericEntry.standaloneGreetings;
        }
        return genericEntry.copy(list, list2);
    }

    @Nullable
    public final List<GreetingItem> component1() {
        return this.fillerGreetings;
    }

    @Nullable
    public final List<GreetingItem> component2() {
        return this.standaloneGreetings;
    }

    @NotNull
    public final GenericEntry copy(@JsonProperty("fillerGreetings") @Nullable List<GreetingItem> fillerGreetings, @JsonProperty("standaloneGreetings") @Nullable List<GreetingItem> standaloneGreetings) {
        return new GenericEntry(fillerGreetings, standaloneGreetings);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GenericEntry)) {
            return false;
        }
        GenericEntry genericEntry = (GenericEntry) other;
        return Intrinsics.areEqual(this.fillerGreetings, genericEntry.fillerGreetings) && Intrinsics.areEqual(this.standaloneGreetings, genericEntry.standaloneGreetings);
    }

    @Nullable
    public final List<GreetingItem> getFillerGreetings() {
        return this.fillerGreetings;
    }

    @Nullable
    public final List<GreetingItem> getStandaloneGreetings() {
        return this.standaloneGreetings;
    }

    public int hashCode() {
        List<GreetingItem> list = this.fillerGreetings;
        int hashCode = (list == null ? 0 : list.hashCode()) * 31;
        List<GreetingItem> list2 = this.standaloneGreetings;
        return hashCode + (list2 != null ? list2.hashCode() : 0);
    }

    public final void setFillerGreetings(@Nullable List<GreetingItem> list) {
        this.fillerGreetings = list;
    }

    public final void setStandaloneGreetings(@Nullable List<GreetingItem> list) {
        this.standaloneGreetings = list;
    }

    @NotNull
    public String toString() {
        return "GenericEntry(fillerGreetings=" + this.fillerGreetings + ", standaloneGreetings=" + this.standaloneGreetings + MarkdownConstants.RIGHT_PARENTHESIS;
    }

    @JsonCreator
    public GenericEntry(@JsonProperty("fillerGreetings") @Nullable List<GreetingItem> list, @JsonProperty("standaloneGreetings") @Nullable List<GreetingItem> list2) {
        this.fillerGreetings = list;
        this.standaloneGreetings = list2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @JsonCreator
    public GenericEntry() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }
}
