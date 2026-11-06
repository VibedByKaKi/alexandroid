package com.amazon.alexa.voiceui.cards;

import android.content.res.Configuration;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import androidx.annotation.MainThread;
import androidx.annotation.VisibleForTesting;
import com.amazon.alexa.utils.ApiThreadHelper;
import com.amazon.alexa.voice.ui.onedesign.transitions.DismissContentTransition;
import com.amazon.alexa.voice.ui.onedesign.transitions.FadeInContentTransition;
import com.amazon.alexa.voice.ui.onedesign.transitions.FadeOutContentTransition;
import com.amazon.alexa.voice.ui.onedesign.transitions.PushContentTransition;
import com.amazon.alexa.voice.ui.provider.CardFactoryWithMode;
import com.amazon.alexa.voice.ui.window.WindowInteractor;
import com.amazon.alexa.voiceui.RouterDelegate;
import com.amazon.alexa.voiceui.cards.CardData;
import com.amazon.regulator.ControllerTransaction;
import com.amazon.regulator.ViewController;
import javax.inject.Inject;
import javax.inject.Named;
import javax.inject.Singleton;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Singleton
/* loaded from: classes20.dex */
public class DefaultCardView extends CardView {
    private static final String TAG = "DefaultCardView";
    private final CardFactoryWithMode cardFactory;

    @Inject
    public DefaultCardView(@Named("cards") RouterDelegate routerDelegate, CardFactoryWithMode cardFactoryWithMode, WindowInteractor windowInteractor) {
        this(routerDelegate, cardFactoryWithMode, windowInteractor, new Handler(Looper.getMainLooper()));
    }

    @MainThread
    public boolean showCard(ViewController viewController, boolean z) {
        sendCardViewInflationInitiated();
        boolean z2 = false;
        if (getRouterDelegate().isAttached()) {
            try {
                try {
                    getRouterDelegate().replaceCurrentController(new ControllerTransaction(viewController, z ? new FadeOutContentTransition() : new DismissContentTransition(), z ? new FadeInContentTransition() : new PushContentTransition()));
                    z2 = true;
                    sendCardCreationCompleted(true, CardData.CardDataType.DEFAULT);
                } catch (Exception e) {
                    Log.e(TAG, "Caught exception displaying card", e);
                    String message = e.getMessage();
                    CardData.CardDataType cardDataType = CardData.CardDataType.DEFAULT;
                    sendCardCreationFailed(message, cardDataType);
                    sendCardCreationCompleted(false, cardDataType);
                }
            } catch (Throwable th) {
                sendCardCreationCompleted(false, CardData.CardDataType.DEFAULT);
                throw th;
            }
        } else {
            sendCardCreationFailed("Card router is not attached", CardData.CardDataType.DEFAULT);
        }
        if (z2) {
            sendVisualRenderedUpl(CardData.CardDataType.DEFAULT);
        }
        return z2;
    }

    @VisibleForTesting
    public DefaultCardView(RouterDelegate routerDelegate, CardFactoryWithMode cardFactoryWithMode, WindowInteractor windowInteractor, Handler handler) {
        super(routerDelegate, windowInteractor, handler);
        this.cardFactory = cardFactoryWithMode;
    }

    @Override // com.amazon.alexa.voiceui.cards.CardView
    public void pause() {
    }

    @Override // com.amazon.alexa.voiceui.cards.CardView
    public void resume() {
    }

    @Override // com.amazon.alexa.voiceui.cards.CardView
    public void handleConfigChange(Configuration configuration) {
    }

    @Override // com.amazon.alexa.voiceui.cards.CardView
    public void showCard(CardData cardData, final boolean z) {
        CardData.CardDataType type = cardData.getType();
        CardData.CardDataType cardDataType = CardData.CardDataType.DEFAULT;
        if (type != cardDataType) {
            sendCardCreationFailed("Card Type does not match default.", cardDataType);
            getCardRenderObservable().onNext(Boolean.FALSE);
            return;
        }
        String str = (String) cardData.getCardData();
        sendCardCreationInitiated();
        final ViewController buildCard = this.cardFactory.buildCard(str, getCardMode(), getCardTheme());
        if (buildCard != null) {
            ApiThreadHelper.runOnDefaultHandler(getHandler(), new Runnable() { // from class: com.amazon.alexa.voiceui.cards.DefaultCardView.1
                @Override // java.lang.Runnable
                public void run() {
                    DefaultCardView.this.getCardRenderObservable().onNext(Boolean.valueOf(DefaultCardView.this.showCard(buildCard, z)));
                }
            });
        } else {
            sendCardCreationFailed("null ViewController", cardDataType);
            getCardRenderObservable().onNext(Boolean.FALSE);
        }
    }
}
