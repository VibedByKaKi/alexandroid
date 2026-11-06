package com.amazon.alexa.voiceui.cards;

import android.os.Bundle;
import com.amazon.alexa.api.UiEventName;
import com.amazon.alexa.voice.ui.provider.vox.CardMode;
import com.amazon.alexa.voiceui.events.UiEventReporter;
import javax.inject.Inject;
import javax.inject.Singleton;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Singleton
/* loaded from: classes20.dex */
class StandardCardCreationEventListener extends BaseCardCreationEventListener {
    private final UiEventReporter uiEventReporter;

    @Inject
    public StandardCardCreationEventListener(UiEventReporter uiEventReporter) {
        super(uiEventReporter);
        this.uiEventReporter = uiEventReporter;
    }

    @Override // com.amazon.alexa.voiceui.cards.BaseCardCreationEventListener
    public void reportEvent(UiEventName uiEventName, Bundle bundle) {
        bundle.putString("cardMode", CardMode.STANDARD.name());
        this.uiEventReporter.sendEvent(uiEventName, bundle);
    }
}
