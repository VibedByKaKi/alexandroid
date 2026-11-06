package com.amazon.alexa.assistant.ui.conversation.model;

import androidx.compose.runtime.internal.StabilityInferred;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000e\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0004J\u000f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010\r\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\n2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0014"}, d2 = {"Lcom/amazon/alexa/assistant/ui/conversation/model/ActionBarConfiguration;", "", "responseIcons", "", "Lcom/amazon/alexa/assistant/ui/conversation/model/ActionBarItem;", "<init>", "(Ljava/util/Set;)V", "getResponseIcons", "()Ljava/util/Set;", "isResponseIconShown", "", "action", "component1", "copy", "equals", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "hashCode", "", "toString", "", "ui_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class ActionBarConfiguration {
    public static final int $stable = 8;

    @NotNull
    private final Set<ActionBarItem> responseIcons;

    public /* synthetic */ ActionBarConfiguration(Set set, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? SetsKt.setOf((Object[]) new ActionBarItem[]{ActionBarItem.Regenerate, ActionBarItem.Share, ActionBarItem.Copy}) : set);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ActionBarConfiguration copy$default(ActionBarConfiguration actionBarConfiguration, Set set, int i, Object obj) {
        if ((i & 1) != 0) {
            set = actionBarConfiguration.responseIcons;
        }
        return actionBarConfiguration.copy(set);
    }

    @NotNull
    public final Set<ActionBarItem> component1() {
        return this.responseIcons;
    }

    @NotNull
    public final ActionBarConfiguration copy(@NotNull Set<? extends ActionBarItem> responseIcons) {
        responseIcons.getClass();
        return new ActionBarConfiguration(responseIcons);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof ActionBarConfiguration) && Intrinsics.areEqual(this.responseIcons, ((ActionBarConfiguration) other).responseIcons);
    }

    @NotNull
    public final Set<ActionBarItem> getResponseIcons() {
        return this.responseIcons;
    }

    public int hashCode() {
        return this.responseIcons.hashCode();
    }

    public final boolean isResponseIconShown(@NotNull ActionBarItem action) {
        action.getClass();
        return this.responseIcons.contains(action);
    }

    @NotNull
    public String toString() {
        return "ActionBarConfiguration(responseIcons=" + this.responseIcons + MarkdownConstants.RIGHT_PARENTHESIS;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ActionBarConfiguration(@NotNull Set<? extends ActionBarItem> set) {
        set.getClass();
        this.responseIcons = set;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ActionBarConfiguration() {
        this(null, 1, 0 == true ? 1 : 0);
    }
}
