package com.amazon.alexa.ra.core.data.model;

import androidx.compose.runtime.Immutable;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import com.facebook.react.uimanager.ViewProps;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Immutable
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000e\u0010\r\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u0006J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J#\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00032\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0018"}, d2 = {"Lcom/amazon/alexa/ra/core/data/model/ActionBarUiConfig;", "", ViewProps.VISIBLE, "", "responseActions", "", "Lcom/amazon/alexa/ra/core/data/model/ActionBarItemType;", "<init>", "(ZLjava/util/Set;)V", "getVisible", "()Z", "getResponseActions", "()Ljava/util/Set;", "isResponseActionShown", "action", "component1", "component2", "copy", "equals", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "hashCode", "", "toString", "", "ui-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes18.dex */
public final /* data */ class ActionBarUiConfig {
    public static final int $stable = 0;

    @NotNull
    private final Set<ActionBarItemType> responseActions;
    private final boolean visible;

    public /* synthetic */ ActionBarUiConfig(boolean z, Set set, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? true : z, (i & 2) != 0 ? SetsKt.setOf((Object[]) new ActionBarItemType[]{ActionBarItemType.REGENERATE, ActionBarItemType.SHARE, ActionBarItemType.COPY}) : set);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ActionBarUiConfig copy$default(ActionBarUiConfig actionBarUiConfig, boolean z, Set set, int i, Object obj) {
        if ((i & 1) != 0) {
            z = actionBarUiConfig.visible;
        }
        if ((i & 2) != 0) {
            set = actionBarUiConfig.responseActions;
        }
        return actionBarUiConfig.copy(z, set);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getVisible() {
        return this.visible;
    }

    @NotNull
    public final Set<ActionBarItemType> component2() {
        return this.responseActions;
    }

    @NotNull
    public final ActionBarUiConfig copy(boolean visible, @NotNull Set<? extends ActionBarItemType> responseActions) {
        responseActions.getClass();
        return new ActionBarUiConfig(visible, responseActions);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ActionBarUiConfig)) {
            return false;
        }
        ActionBarUiConfig actionBarUiConfig = (ActionBarUiConfig) other;
        return this.visible == actionBarUiConfig.visible && Intrinsics.areEqual(this.responseActions, actionBarUiConfig.responseActions);
    }

    @NotNull
    public final Set<ActionBarItemType> getResponseActions() {
        return this.responseActions;
    }

    public final boolean getVisible() {
        return this.visible;
    }

    public int hashCode() {
        return this.responseActions.hashCode() + (Boolean.hashCode(this.visible) * 31);
    }

    public final boolean isResponseActionShown(@NotNull ActionBarItemType action) {
        action.getClass();
        return this.responseActions.contains(action);
    }

    @NotNull
    public String toString() {
        return "ActionBarUiConfig(visible=" + this.visible + ", responseActions=" + this.responseActions + MarkdownConstants.RIGHT_PARENTHESIS;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ActionBarUiConfig(boolean z, @NotNull Set<? extends ActionBarItemType> set) {
        set.getClass();
        this.visible = z;
        this.responseActions = set;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ActionBarUiConfig() {
        this(false, null, 3, 0 == true ? 1 : 0);
    }
}
