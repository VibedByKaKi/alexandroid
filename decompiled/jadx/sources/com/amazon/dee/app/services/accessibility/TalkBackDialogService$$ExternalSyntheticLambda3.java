package com.amazon.dee.app.services.accessibility;

import android.view.accessibility.AccessibilityManager;
import com.amazon.alexa.assistant.capability.speechrecognizer.wakeword.settingscontroller.ScreenReaderWakeWordSettingsControl;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes4.dex */
public final /* synthetic */ class TalkBackDialogService$$ExternalSyntheticLambda3 implements AccessibilityManager.TouchExplorationStateChangeListener {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;

    public /* synthetic */ TalkBackDialogService$$ExternalSyntheticLambda3(Object obj, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
    }

    @Override // android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener
    public final void onTouchExplorationStateChanged(boolean z) {
        int i = this.$r8$classId;
        Object obj = this.f$0;
        switch (i) {
            case 0:
                ((TalkBackDialogService) obj).lambda$new$0(z);
                break;
            default:
                ((ScreenReaderWakeWordSettingsControl) obj).applyDebouncedFromPlatform(ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
                break;
        }
    }
}
