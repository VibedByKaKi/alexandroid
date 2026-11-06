package com.amazon.alexa.voice.ui.onedesign.movies.theater;

import com.amazon.alexa.voice.ui.onedesign.movies.theater.MovieTheaterContract;
import com.amazon.alexa.voice.ui.onedesign.util.IntentUtils;
import com.amazon.regulator.ViewController;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public final class MovieTheaterMediator implements MovieTheaterContract.Mediator {
    private final ViewController controller;

    public MovieTheaterMediator(ViewController viewController) {
        this.controller = viewController;
    }

    @Override // com.amazon.alexa.voice.ui.onedesign.movies.theater.MovieTheaterContract.Mediator
    public void close() {
        this.controller.getRouter().popController(this.controller);
    }

    @Override // com.amazon.alexa.voice.ui.onedesign.movies.theater.MovieTheaterContract.Mediator
    public void openLocation(String str) {
        IntentUtils.openLinkUrl(this.controller, "geo:0,0?q=" + str);
    }
}
