package com.amazon.alexa.voice.tta.cards;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.ViewGroup;
import com.amazon.alexa.apl.APLRenderingEngine;
import com.amazon.alexa.voice.tta.R;
import com.amazon.alexa.voice.tta.RouterDelegate;
import com.amazon.regulator.Component;
import com.amazon.regulator.Router;
import dagger.Module;
import dagger.Provides;
import javax.inject.Named;
import javax.inject.Singleton;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Module
/* loaded from: classes19.dex */
public class CardModule {
    private static final String CARDS_CONTAINER = "cardsContainer";
    public static final String CARDS_ROUTER = "cardsRouter";
    public static final String CARDS_ROUTER_DELEGATE = "cardsRouterDelegate";
    public static final String CARDS_SAVED_STATE_KEY = "cardsSavedState";
    private final Activity activity;
    private final Bundle savedInstanceState;

    public CardModule(Activity activity, Bundle bundle) {
        this.activity = activity;
        this.savedInstanceState = bundle;
    }

    @Provides
    @Singleton
    public APLRenderingEngine providesAplRenderingEngine(Context context) {
        return new APLRenderingEngine(context);
    }

    @Provides
    @Singleton
    @Named(CARDS_CONTAINER)
    public ViewGroup providesCardsContainer() {
        return (ViewGroup) this.activity.findViewById(R.id.tta_cards_container);
    }

    @Provides
    @Singleton
    @Named(CARDS_ROUTER)
    public Router providesCardsRouter(@Named("cardsContainer") ViewGroup viewGroup, Component component) {
        Bundle bundle = this.savedInstanceState;
        Router router = new Router(this.activity, component, bundle != null ? (Bundle) bundle.getParcelable(CARDS_SAVED_STATE_KEY) : null);
        router.attach(viewGroup);
        return router;
    }

    @Provides
    @Singleton
    @Named(CARDS_ROUTER_DELEGATE)
    public RouterDelegate providesCardsRouterDelegate(@Named("cardsRouter") Router router) {
        return new RouterDelegate(router);
    }
}
