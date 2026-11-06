package com.amazon.alexa.voice.ui.onedesign.ftue.handsfree;

import androidx.annotation.NonNull;
import com.amazon.alexa.voice.ui.onedesign.ftue.handsfree.HandsfreePrimerContract;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class HandsfreePrimerInteractor implements HandsfreePrimerContract.Interactor {
    private final HandsfreePrimerContract.Mediator mediator;

    public HandsfreePrimerInteractor(@NonNull HandsfreePrimerContract.Mediator mediator) {
        this.mediator = mediator;
    }

    @Override // com.amazon.alexa.voice.ui.onedesign.ftue.handsfree.HandsfreePrimerContract.Interactor
    public void deferPrimer() {
        this.mediator.close();
    }

    @Override // com.amazon.alexa.voice.ui.onedesign.ftue.handsfree.HandsfreePrimerContract.Interactor
    public void geoLocationLegalClicked() {
        this.mediator.openGeoLocationLegal();
    }

    @Override // com.amazon.alexa.voice.ui.onedesign.ftue.handsfree.HandsfreePrimerContract.Interactor
    public void learnMoreClicked(String str) {
        this.mediator.openLearnMore(str);
    }

    @Override // com.amazon.alexa.voice.ui.onedesign.ftue.handsfree.HandsfreePrimerContract.Interactor
    public void requestPermissions() {
        this.mediator.requestPermissions();
    }
}
