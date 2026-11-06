package com.amazon.alexa.voice.ui.onedesign.ftue.settings;

import androidx.annotation.NonNull;
import com.amazon.alexa.voice.ui.onedesign.ftue.settings.GoToSettingsContract;
import com.amazon.regulator.internal.Preconditions;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public final class GoToSettingsInteractor implements GoToSettingsContract.Interactor {
    private final GoToSettingsContract.Mediator mediator;

    public GoToSettingsInteractor(@NonNull GoToSettingsContract.Mediator mediator) {
        Preconditions.nonNull(mediator, "mediator argument must be non-null.");
        this.mediator = mediator;
    }

    @Override // com.amazon.alexa.voice.ui.onedesign.ftue.settings.GoToSettingsContract.Interactor
    public void close() {
        this.mediator.close();
    }

    @Override // com.amazon.alexa.voice.ui.onedesign.ftue.settings.GoToSettingsContract.Interactor
    public void openSettings() {
        this.mediator.openSettings();
    }
}
