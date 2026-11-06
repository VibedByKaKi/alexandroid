package com.amazon.alexa.ra.core.data.fragments;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.room.util.TableInfo$$ExternalSyntheticOutline0;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\"\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BW\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0018\u0010\u0005\u001a\u0014\u0012\u0004\u0012\u00020\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\b0\u0006\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00040\u0006\u0012\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u001b\u0010\u0014\u001a\u0014\u0012\u0004\u0012\u00020\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\b0\u0006HÆ\u0003J\u0015\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00040\u0006HÆ\u0003J\u0015\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0003Ja\u0010\u0017\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u001a\b\u0002\u0010\u0005\u001a\u0014\u0012\u0004\u0012\u00020\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\b0\u00062\u0014\b\u0002\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00040\u00062\u0014\b\u0002\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\u0007HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR#\u0010\u0005\u001a\u0014\u0012\u0004\u0012\u00020\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\b0\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u001d\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00040\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u001d\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0010¨\u0006\u001e"}, d2 = {"Lcom/amazon/alexa/ra/core/data/fragments/ConversationFragments;", "", "rootFragments", "", "Lcom/amazon/alexa/ra/core/data/fragments/FragmentData;", "childFragments", "", "", "", "allFragments", "childToRootMap", "<init>", "(Ljava/util/List;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;)V", "getRootFragments", "()Ljava/util/List;", "getChildFragments", "()Ljava/util/Map;", "getAllFragments", "getChildToRootMap", "component1", "component2", "component3", "component4", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "hashCode", "", "toString", "ui-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes18.dex */
public final /* data */ class ConversationFragments {
    public static final int $stable = 8;

    @NotNull
    private final Map<String, FragmentData> allFragments;

    @NotNull
    private final Map<String, Set<FragmentData>> childFragments;

    @NotNull
    private final Map<String, String> childToRootMap;

    @NotNull
    private final List<FragmentData> rootFragments;

    /* JADX WARN: Multi-variable type inference failed */
    public ConversationFragments(@NotNull List<FragmentData> list, @NotNull Map<String, ? extends Set<FragmentData>> map, @NotNull Map<String, FragmentData> map2, @NotNull Map<String, String> map3) {
        list.getClass();
        map.getClass();
        map2.getClass();
        map3.getClass();
        this.rootFragments = list;
        this.childFragments = map;
        this.allFragments = map2;
        this.childToRootMap = map3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ConversationFragments copy$default(ConversationFragments conversationFragments, List list, Map map, Map map2, Map map3, int i, Object obj) {
        if ((i & 1) != 0) {
            list = conversationFragments.rootFragments;
        }
        if ((i & 2) != 0) {
            map = conversationFragments.childFragments;
        }
        if ((i & 4) != 0) {
            map2 = conversationFragments.allFragments;
        }
        if ((i & 8) != 0) {
            map3 = conversationFragments.childToRootMap;
        }
        return conversationFragments.copy(list, map, map2, map3);
    }

    @NotNull
    public final List<FragmentData> component1() {
        return this.rootFragments;
    }

    @NotNull
    public final Map<String, Set<FragmentData>> component2() {
        return this.childFragments;
    }

    @NotNull
    public final Map<String, FragmentData> component3() {
        return this.allFragments;
    }

    @NotNull
    public final Map<String, String> component4() {
        return this.childToRootMap;
    }

    @NotNull
    public final ConversationFragments copy(@NotNull List<FragmentData> rootFragments, @NotNull Map<String, ? extends Set<FragmentData>> childFragments, @NotNull Map<String, FragmentData> allFragments, @NotNull Map<String, String> childToRootMap) {
        rootFragments.getClass();
        childFragments.getClass();
        allFragments.getClass();
        childToRootMap.getClass();
        return new ConversationFragments(rootFragments, childFragments, allFragments, childToRootMap);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ConversationFragments)) {
            return false;
        }
        ConversationFragments conversationFragments = (ConversationFragments) other;
        return Intrinsics.areEqual(this.rootFragments, conversationFragments.rootFragments) && Intrinsics.areEqual(this.childFragments, conversationFragments.childFragments) && Intrinsics.areEqual(this.allFragments, conversationFragments.allFragments) && Intrinsics.areEqual(this.childToRootMap, conversationFragments.childToRootMap);
    }

    @NotNull
    public final Map<String, FragmentData> getAllFragments() {
        return this.allFragments;
    }

    @NotNull
    public final Map<String, Set<FragmentData>> getChildFragments() {
        return this.childFragments;
    }

    @NotNull
    public final Map<String, String> getChildToRootMap() {
        return this.childToRootMap;
    }

    @NotNull
    public final List<FragmentData> getRootFragments() {
        return this.rootFragments;
    }

    public int hashCode() {
        return this.childToRootMap.hashCode() + TableInfo$$ExternalSyntheticOutline0.m(this.allFragments, TableInfo$$ExternalSyntheticOutline0.m(this.childFragments, this.rootFragments.hashCode() * 31, 31), 31);
    }

    @NotNull
    public String toString() {
        return "ConversationFragments(rootFragments=" + this.rootFragments + ", childFragments=" + this.childFragments + ", allFragments=" + this.allFragments + ", childToRootMap=" + this.childToRootMap + MarkdownConstants.RIGHT_PARENTHESIS;
    }
}
