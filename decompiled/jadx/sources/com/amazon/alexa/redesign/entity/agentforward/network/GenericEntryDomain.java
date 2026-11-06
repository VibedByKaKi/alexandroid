package com.amazon.alexa.redesign.entity.agentforward.network;

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
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0011\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J-\u0010\r\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0019\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0019\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\t¨\u0006\u0015"}, d2 = {"Lcom/amazon/alexa/redesign/entity/agentforward/network/GenericEntryDomain;", "", "fillerGreetings", "", "Lcom/amazon/alexa/redesign/entity/agentforward/network/GreetingItemDomain;", "standaloneGreetings", "<init>", "(Ljava/util/List;Ljava/util/List;)V", "getFillerGreetings", "()Ljava/util/List;", "getStandaloneGreetings", "component1", "component2", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "hashCode", "", "toString", "", "AlexaMobileAndroidHomeChannel_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes19.dex */
public final /* data */ class GenericEntryDomain {
    public static final int $stable = 8;

    @Nullable
    private final List<GreetingItemDomain> fillerGreetings;

    @Nullable
    private final List<GreetingItemDomain> standaloneGreetings;

    public /* synthetic */ GenericEntryDomain(List list, List list2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : list, (i & 2) != 0 ? null : list2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ GenericEntryDomain copy$default(GenericEntryDomain genericEntryDomain, List list, List list2, int i, Object obj) {
        if ((i & 1) != 0) {
            list = genericEntryDomain.fillerGreetings;
        }
        if ((i & 2) != 0) {
            list2 = genericEntryDomain.standaloneGreetings;
        }
        return genericEntryDomain.copy(list, list2);
    }

    @Nullable
    public final List<GreetingItemDomain> component1() {
        return this.fillerGreetings;
    }

    @Nullable
    public final List<GreetingItemDomain> component2() {
        return this.standaloneGreetings;
    }

    @NotNull
    public final GenericEntryDomain copy(@Nullable List<GreetingItemDomain> fillerGreetings, @Nullable List<GreetingItemDomain> standaloneGreetings) {
        return new GenericEntryDomain(fillerGreetings, standaloneGreetings);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GenericEntryDomain)) {
            return false;
        }
        GenericEntryDomain genericEntryDomain = (GenericEntryDomain) other;
        return Intrinsics.areEqual(this.fillerGreetings, genericEntryDomain.fillerGreetings) && Intrinsics.areEqual(this.standaloneGreetings, genericEntryDomain.standaloneGreetings);
    }

    @Nullable
    public final List<GreetingItemDomain> getFillerGreetings() {
        return this.fillerGreetings;
    }

    @Nullable
    public final List<GreetingItemDomain> getStandaloneGreetings() {
        return this.standaloneGreetings;
    }

    public int hashCode() {
        List<GreetingItemDomain> list = this.fillerGreetings;
        int hashCode = (list == null ? 0 : list.hashCode()) * 31;
        List<GreetingItemDomain> list2 = this.standaloneGreetings;
        return hashCode + (list2 != null ? list2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "GenericEntryDomain(fillerGreetings=" + this.fillerGreetings + ", standaloneGreetings=" + this.standaloneGreetings + MarkdownConstants.RIGHT_PARENTHESIS;
    }

    public GenericEntryDomain(@Nullable List<GreetingItemDomain> list, @Nullable List<GreetingItemDomain> list2) {
        this.fillerGreetings = list;
        this.standaloneGreetings = list2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public GenericEntryDomain() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }
}
