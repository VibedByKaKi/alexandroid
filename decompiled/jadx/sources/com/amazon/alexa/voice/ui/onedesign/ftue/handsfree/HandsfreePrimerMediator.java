package com.amazon.alexa.voice.ui.onedesign.ftue.handsfree;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import androidx.annotation.NonNull;
import com.amazon.alexa.voice.ui.onedesign.ftue.handsfree.HandsfreePrimerContract;
import com.amazon.alexa.voice.ui.onedesign.util.IntentUtils;
import com.amazon.regulator.ViewController;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public abstract class HandsfreePrimerMediator implements HandsfreePrimerContract.Mediator {
    private static final String FRAGMENT_REDIRECTION_BASE_URL = "https://alexa.amazon.com/?fragment=";
    private static final String GEOLOCATION_HELP_NODE_URI = "help/node/ThPAoEt6HlxJt14PFO";
    private static final String MAIN_MODE_ACTIVITY_NAME = "com.amazon.dee.app.ui.main.MainActivity";
    private final ViewController controller;

    public HandsfreePrimerMediator(@NonNull ViewController viewController) {
        this.controller = viewController;
    }

    @Override // com.amazon.alexa.voice.ui.onedesign.ftue.handsfree.HandsfreePrimerContract.Mediator
    public void close() {
        this.controller.getRouter().popController(this.controller);
    }

    public ViewController getController() {
        return this.controller;
    }

    @Override // com.amazon.alexa.voice.ui.onedesign.ftue.handsfree.HandsfreePrimerContract.Mediator
    public void openGeoLocationLegal() {
        Intent intent = new Intent("android.intent.action.VIEW");
        Context context = this.controller.getContext();
        intent.setData(Uri.parse("https://alexa.amazon.com/?fragment=help/node/ThPAoEt6HlxJt14PFO"));
        intent.setClassName(context.getPackageName(), "com.amazon.dee.app.ui.main.MainActivity");
        intent.addFlags(131072);
        intent.addFlags(268435456);
        context.startActivity(intent);
    }

    @Override // com.amazon.alexa.voice.ui.onedesign.ftue.handsfree.HandsfreePrimerContract.Mediator
    public void openLearnMore(CharSequence charSequence) {
        IntentUtils.openLinkUrl(this.controller, charSequence.toString());
    }
}
