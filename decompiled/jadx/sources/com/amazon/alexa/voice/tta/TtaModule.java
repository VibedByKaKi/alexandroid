package com.amazon.alexa.voice.tta;

import android.app.Activity;
import android.content.Context;
import com.amazon.alexa.voice.ui.suggestions.SuggestionsHandler;
import com.amazon.alexa.voice.ui.tta.TtaMessageHandler;
import com.amazon.alexa.voice.ui.tta.TtaNavigator;
import com.amazon.alexa.voice.ui.tta.metrics.TtaEventSender;
import com.amazon.alexa.voice.ui.tta.search.TtaResultHandler;
import com.amazon.regulator.Component;
import dagger.Module;
import dagger.Provides;
import javax.inject.Singleton;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Module
/* loaded from: classes19.dex */
public class TtaModule {
    private final Activity activity;

    public TtaModule(Activity activity) {
        this.activity = activity;
    }

    @Provides
    @Singleton
    public Activity providesActivity() {
        return this.activity;
    }

    @Provides
    @Singleton
    public Component providesComponent(TtaMessageHandler ttaMessageHandler, TtaResultHandler ttaResultHandler, TtaNavigator ttaNavigator, TtaEventSender ttaEventSender, SuggestionsHandler suggestionsHandler) {
        Component component = new Component();
        component.provide((Class<? extends Class>) TtaMessageHandler.class, (Class) ttaMessageHandler).register();
        component.provide((Class<? extends Class>) TtaResultHandler.class, (Class) ttaResultHandler).register();
        component.provide((Class<? extends Class>) TtaNavigator.class, (Class) ttaNavigator).register();
        component.provide((Class<? extends Class>) TtaEventSender.class, (Class) ttaEventSender).register();
        component.provide((Class<? extends Class>) SuggestionsHandler.class, (Class) suggestionsHandler).register();
        return component;
    }

    @Provides
    @Singleton
    public Context providesContext() {
        return this.activity.getApplicationContext();
    }
}
