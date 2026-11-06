package com.amazon.alexa.voice.ui.onedesign.ftue.settings;

import androidx.annotation.NonNull;
import com.amazon.alexa.voice.ui.onedesign.ftue.settings.BottomSheetGoToSettingsContract;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class BottomSheetGoToSettingsInteractor implements BottomSheetGoToSettingsContract.Interactor {
    private final BottomSheetGoToSettingsContract.Mediator mediator;

    public BottomSheetGoToSettingsInteractor(@NonNull BottomSheetGoToSettingsContract.Mediator mediator) {
        this.mediator = mediator;
    }

    @Override // com.amazon.alexa.voice.ui.onedesign.ftue.settings.BottomSheetGoToSettingsContract.Interactor
    public void deferPrimer() {
        this.mediator.close();
    }

    @Override // com.amazon.alexa.voice.ui.onedesign.ftue.settings.BottomSheetGoToSettingsContract.Interactor
    public void openLearnMore() {
        this.mediator.openLearnMore();
    }

    @Override // com.amazon.alexa.voice.ui.onedesign.ftue.settings.BottomSheetGoToSettingsContract.Interactor
    public void openSettings() {
        this.mediator.openSettings();
    }
}
