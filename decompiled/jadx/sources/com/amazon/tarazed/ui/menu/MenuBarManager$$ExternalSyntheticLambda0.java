package com.amazon.tarazed.ui.menu;

import android.view.accessibility.AccessibilityManager;
import com.amazon.alexa.assistant.capability.speechrecognizer.wakeword.settingscontroller.ScreenReaderWakeWordSettingsControl;
import com.facebook.react.views.view.ReactViewGroup;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public final /* synthetic */ class MenuBarManager$$ExternalSyntheticLambda0 implements AccessibilityManager.AccessibilityStateChangeListener {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;

    public /* synthetic */ MenuBarManager$$ExternalSyntheticLambda0(Object obj, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
    }

    @Override // android.view.accessibility.AccessibilityManager.AccessibilityStateChangeListener
    public final void onAccessibilityStateChanged(boolean z) {
        int i = this.$r8$classId;
        Object obj = this.f$0;
        switch (i) {
            case 0:
                MenuBarManager.setAccessibilityChangeListener$lambda$2((MenuBarManager) obj, z);
                break;
            case 1:
                ((ScreenReaderWakeWordSettingsControl) obj).applyDebouncedFromPlatform("a11yStateChange");
                break;
            default:
                ReactViewGroup.addChildrenForAccessibility$lambda$1((ReactViewGroup) obj, z);
                break;
        }
    }
}
