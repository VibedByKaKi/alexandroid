package com.amazon.alexa.assistant.ui.conversation.model;

import androidx.compose.runtime.internal.StabilityInferred;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.SetsKt;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000e\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0004J\u000f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010\u0011\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\n2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0017\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\r8F¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0018"}, d2 = {"Lcom/amazon/alexa/assistant/ui/conversation/model/OverflowMenuConfiguration;", "", "hiddenItems", "", "Lcom/amazon/alexa/assistant/ui/conversation/model/OverflowMenuItemType;", "<init>", "(Ljava/util/Set;)V", "getHiddenItems", "()Ljava/util/Set;", "isItemShown", "", "item", "visibleItems", "", "getVisibleItems", "()Ljava/util/List;", "component1", "copy", "equals", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "hashCode", "", "toString", "", "ui_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nOverflowMenuConfiguration.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OverflowMenuConfiguration.kt\ncom/amazon/alexa/assistant/ui/conversation/model/OverflowMenuConfiguration\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,122:1\n774#2:123\n865#2,2:124\n*S KotlinDebug\n*F\n+ 1 OverflowMenuConfiguration.kt\ncom/amazon/alexa/assistant/ui/conversation/model/OverflowMenuConfiguration\n*L\n73#1:123\n73#1:124,2\n*E\n"})
/* loaded from: classes17.dex */
public final /* data */ class OverflowMenuConfiguration {
    public static final int $stable = 8;

    @NotNull
    private final Set<OverflowMenuItemType> hiddenItems;

    public /* synthetic */ OverflowMenuConfiguration(Set set, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? SetsKt.emptySet() : set);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ OverflowMenuConfiguration copy$default(OverflowMenuConfiguration overflowMenuConfiguration, Set set, int i, Object obj) {
        if ((i & 1) != 0) {
            set = overflowMenuConfiguration.hiddenItems;
        }
        return overflowMenuConfiguration.copy(set);
    }

    @NotNull
    public final Set<OverflowMenuItemType> component1() {
        return this.hiddenItems;
    }

    @NotNull
    public final OverflowMenuConfiguration copy(@NotNull Set<? extends OverflowMenuItemType> hiddenItems) {
        hiddenItems.getClass();
        return new OverflowMenuConfiguration(hiddenItems);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof OverflowMenuConfiguration) && Intrinsics.areEqual(this.hiddenItems, ((OverflowMenuConfiguration) other).hiddenItems);
    }

    @NotNull
    public final Set<OverflowMenuItemType> getHiddenItems() {
        return this.hiddenItems;
    }

    @NotNull
    public final List<OverflowMenuItemType> getVisibleItems() {
        EnumEntries<OverflowMenuItemType> entries = OverflowMenuItemType.getEntries();
        ArrayList arrayList = new ArrayList();
        for (Object obj : entries) {
            if (!this.hiddenItems.contains((OverflowMenuItemType) obj)) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public int hashCode() {
        return this.hiddenItems.hashCode();
    }

    public final boolean isItemShown(@NotNull OverflowMenuItemType item) {
        item.getClass();
        return !this.hiddenItems.contains(item);
    }

    @NotNull
    public String toString() {
        return "OverflowMenuConfiguration(hiddenItems=" + this.hiddenItems + MarkdownConstants.RIGHT_PARENTHESIS;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public OverflowMenuConfiguration(@NotNull Set<? extends OverflowMenuItemType> set) {
        set.getClass();
        this.hiddenItems = set;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public OverflowMenuConfiguration() {
        this(null, 1, 0 == true ? 1 : 0);
    }
}
