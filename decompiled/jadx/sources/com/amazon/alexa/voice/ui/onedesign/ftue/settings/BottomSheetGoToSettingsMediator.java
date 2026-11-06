package com.amazon.alexa.voice.ui.onedesign.ftue.settings;

import androidx.annotation.NonNull;
import com.amazon.alexa.voice.ui.onedesign.ftue.R;
import com.amazon.alexa.voice.ui.onedesign.ftue.settings.BottomSheetGoToSettingsContract;
import com.amazon.alexa.voice.ui.onedesign.util.IntentUtils;
import com.amazon.regulator.Component;
import com.amazon.regulator.ViewController;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class BottomSheetGoToSettingsMediator implements BottomSheetGoToSettingsContract.Mediator {
    private final ViewController viewController;

    public BottomSheetGoToSettingsMediator(@NonNull ViewController viewController) {
        this.viewController = viewController;
    }

    @Override // com.amazon.alexa.voice.ui.onedesign.ftue.settings.BottomSheetGoToSettingsContract.Mediator
    public void close() {
        this.viewController.getRouter().popController(this.viewController);
    }

    @Override // com.amazon.alexa.voice.ui.onedesign.ftue.settings.BottomSheetGoToSettingsContract.Mediator
    public void openLearnMore() {
        IntentUtils.openLinkUrl(this.viewController, this.viewController.getContext().getString(R.string.voice_ui_od_handsfree_ftue_learn_more_url));
    }

    @Override // com.amazon.alexa.voice.ui.onedesign.ftue.settings.BottomSheetGoToSettingsContract.Mediator
    public void openSettings() {
        Component component = this.viewController.getComponent();
        if (component.isRegistered(OnBottomSheetGoToSettingsCompleteListener.class)) {
            ((OnBottomSheetGoToSettingsCompleteListener) component.get(OnBottomSheetGoToSettingsCompleteListener.class)).onComplete();
        }
    }
}
