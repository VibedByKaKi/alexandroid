package com.amazon.alexa.ra.core.ui.custom;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@StabilityInferred(parameters = 1)
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J(\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\u0007¨\u0006\u000b"}, d2 = {"Lcom/amazon/alexa/ra/core/ui/custom/ToolbarVisibilityHelper;", "", "<init>", "()V", "computeVisibility", "Lcom/amazon/alexa/ra/core/ui/custom/ToolbarVisibility;", "displayNewChatInAgentForwardLayout", "", "isSettingsEnabled", "hideOverflowMenu", "useNewDesignSystem", "ui-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes18.dex */
public final class ToolbarVisibilityHelper {
    public static final int $stable = 0;

    @NotNull
    public static final ToolbarVisibilityHelper INSTANCE = new ToolbarVisibilityHelper();

    private ToolbarVisibilityHelper() {
    }

    public static /* synthetic */ ToolbarVisibility computeVisibility$default(ToolbarVisibilityHelper toolbarVisibilityHelper, boolean z, boolean z2, boolean z3, boolean z4, int i, Object obj) {
        if ((i & 8) != 0) {
            z4 = false;
        }
        return toolbarVisibilityHelper.computeVisibility(z, z2, z3, z4);
    }

    @NotNull
    public final ToolbarVisibility computeVisibility(boolean displayNewChatInAgentForwardLayout, boolean isSettingsEnabled, boolean hideOverflowMenu, boolean useNewDesignSystem) {
        boolean z = false;
        boolean z2 = !hideOverflowMenu && displayNewChatInAgentForwardLayout;
        if (!hideOverflowMenu && (useNewDesignSystem || isSettingsEnabled || !displayNewChatInAgentForwardLayout)) {
            z = true;
        }
        return new ToolbarVisibility(z2, z);
    }
}
