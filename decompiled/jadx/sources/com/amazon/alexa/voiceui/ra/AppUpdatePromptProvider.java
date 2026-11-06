package com.amazon.alexa.voiceui.ra;

import com.amazon.alexa.voice.ui.ra.AppUpdatePromptHandler;
import com.amazon.alexa.voice.ui.ra.AppUpdatePromptListener;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class AppUpdatePromptProvider implements AppUpdatePromptHandler {
    private WeakReference<RaInteractor> raInteractorWeakReference;

    @Override // com.amazon.alexa.voice.ui.ra.AppUpdatePromptHandler
    public void reportUpdatePromptShown() {
        RaInteractor raInteractor = this.raInteractorWeakReference.get();
        if (raInteractor != null) {
            raInteractor.reportUpdatePromptShown();
        }
    }

    public void setInteractor(RaInteractor raInteractor) {
        this.raInteractorWeakReference = new WeakReference<>(raInteractor);
    }

    @Override // com.amazon.alexa.voice.ui.ra.AppUpdatePromptHandler
    public void setUpdateListener(AppUpdatePromptListener appUpdatePromptListener) {
        RaInteractor raInteractor = this.raInteractorWeakReference.get();
        if (raInteractor != null) {
            raInteractor.setUpdateListener(appUpdatePromptListener);
        }
    }
}
