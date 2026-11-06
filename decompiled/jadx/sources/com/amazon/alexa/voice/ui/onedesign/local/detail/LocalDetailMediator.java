package com.amazon.alexa.voice.ui.onedesign.local.detail;

import com.amazon.alexa.voice.ui.onedesign.local.detail.LocalDetailContract;
import com.amazon.alexa.voice.ui.onedesign.util.IntentUtils;
import com.amazon.regulator.ViewController;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public final class LocalDetailMediator implements LocalDetailContract.Mediator {
    private final ViewController controller;

    public LocalDetailMediator(ViewController viewController) {
        this.controller = viewController;
    }

    @Override // com.amazon.alexa.voice.ui.onedesign.local.detail.LocalDetailContract.Mediator
    public void close() {
        this.controller.getRouter().popController(this.controller);
    }

    @Override // com.amazon.alexa.voice.ui.onedesign.local.detail.LocalDetailContract.Mediator
    public void dialPhoneNumber(String str) {
        IntentUtils.openLinkUrl(this.controller, "tel:" + str);
    }

    @Override // com.amazon.alexa.voice.ui.onedesign.local.detail.LocalDetailContract.Mediator
    public void mapAddress(String str) {
        IntentUtils.openLinkUrl(this.controller, "geo:0,0?q=" + str);
    }

    @Override // com.amazon.alexa.voice.ui.onedesign.local.detail.LocalDetailContract.Mediator
    public void mapGeoLocation(String str) throws IllegalArgumentException {
        String[] split = str.split(":");
        if (split.length < 2 || split[1].split(",").length < 2) {
            Single$$ExternalSyntheticBUOutline0.m$3("Invalid geo location".concat(str));
            return;
        }
        IntentUtils.openLinkUrl(this.controller, "google.navigation:q=" + split[1]);
    }

    @Override // com.amazon.alexa.voice.ui.onedesign.local.detail.LocalDetailContract.Mediator
    public void openLinkUrl(String str) {
        IntentUtils.openLinkUrl(this.controller, str);
    }
}
