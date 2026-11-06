package com.google.android.material.behavior;

import android.view.View;
import android.view.accessibility.AccessibilityManager;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes7.dex */
public final /* synthetic */ class HideViewOnScrollBehavior$$ExternalSyntheticLambda0 implements AccessibilityManager.TouchExplorationStateChangeListener {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ CoordinatorLayout.Behavior f$0;
    public final /* synthetic */ View f$1;

    public /* synthetic */ HideViewOnScrollBehavior$$ExternalSyntheticLambda0(CoordinatorLayout.Behavior behavior, View view, int i) {
        this.$r8$classId = i;
        this.f$0 = behavior;
        this.f$1 = view;
    }

    @Override // android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener
    public final void onTouchExplorationStateChanged(boolean z) {
        switch (this.$r8$classId) {
            case 0:
                ((HideViewOnScrollBehavior) this.f$0).lambda$disableIfTouchExplorationEnabled$0(this.f$1, z);
                break;
            default:
                ((HideBottomViewOnScrollBehavior) this.f$0).lambda$disableIfTouchExplorationEnabled$0(this.f$1, z);
                break;
        }
    }
}
