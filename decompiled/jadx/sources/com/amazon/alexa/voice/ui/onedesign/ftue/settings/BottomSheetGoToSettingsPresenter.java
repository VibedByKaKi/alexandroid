package com.amazon.alexa.voice.ui.onedesign.ftue.settings;

import androidx.annotation.NonNull;
import com.amazon.alexa.voice.ui.onedesign.ftue.settings.BottomSheetGoToSettingsContract;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class BottomSheetGoToSettingsPresenter implements BottomSheetGoToSettingsContract.Presenter {
    private final BottomSheetGoToSettingsContract.Interactor interactor;

    public BottomSheetGoToSettingsPresenter(@NonNull BottomSheetGoToSettingsContract.Interactor interactor) {
        this.interactor = interactor;
    }

    @Override // com.amazon.alexa.voice.ui.onedesign.ftue.settings.BottomSheetGoToSettingsContract.Presenter
    public void laterClicked() {
        this.interactor.deferPrimer();
    }

    @Override // com.amazon.alexa.voice.ui.onedesign.ftue.settings.BottomSheetGoToSettingsContract.Presenter
    public void learnMoreClicked() {
        this.interactor.openLearnMore();
    }

    @Override // com.amazon.alexa.voice.ui.onedesign.ftue.settings.BottomSheetGoToSettingsContract.Presenter
    public void settingsClicked() {
        this.interactor.openSettings();
    }

    @Override // com.amazon.alexa.voice.ui.onedesign.ftue.settings.BottomSheetGoToSettingsContract.Presenter
    public void start() {
    }
}
