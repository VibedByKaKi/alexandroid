package com.amazon.alexa.voice.tta.cards;

import android.util.Log;
import com.amazon.alexa.api.AlexaAplCommand;
import com.amazon.alexa.apl.APLRenderingEngine;
import com.amazon.alexa.voice.tta.statemachine.AlexaMediator;
import io.reactivex.rxjava3.core.Observable;
import javax.inject.Inject;
import javax.inject.Singleton;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Singleton
/* loaded from: classes19.dex */
public class CardModel {
    private static final String TAG = "CardModel";
    private final AlexaMediator alexaMediator;
    private final APLRenderingEngine aplRenderingEngine;
    private boolean isAplEnabled = false;

    @Inject
    public CardModel(AlexaMediator alexaMediator, APLRenderingEngine aPLRenderingEngine) {
        this.alexaMediator = alexaMediator;
        this.aplRenderingEngine = aPLRenderingEngine;
    }

    public void initialize(boolean z) {
        String str = TAG;
        this.isAplEnabled = z;
        if (z) {
            Log.i(str, "Apl is enabled: Registering AplListener and initializing AplRenderingEngine");
            this.alexaMediator.registerAplListener();
            this.aplRenderingEngine.initialize();
        }
    }

    public Observable<AlexaAplCommand> onInteractiveAlexaCard() {
        return this.alexaMediator.onInteractiveAlexaCard();
    }

    public void release() {
        String str = TAG;
        if (this.isAplEnabled) {
            Log.i(str, "Apl is enabled: Deregistering AplListener and releasing APLRenderingEngine");
            this.aplRenderingEngine.release();
            this.alexaMediator.deregisterAplListener();
        }
    }
}
