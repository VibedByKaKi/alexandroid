package com.amazon.alexa.voiceui.chrome;

import android.app.Activity;
import android.view.ViewGroup;
import com.amazon.alexa.voice.ui.speech.AttentionSystemContract;
import com.amazon.alexa.voice.ui.tta.TypingPrimerDisplayer;
import com.amazon.alexa.voiceui.BackButtonPressHandler;
import com.amazon.alexa.voiceui.DefaultBackButtonPressHandler;
import com.amazon.alexa.voiceui.DefaultSaveInstanceStateHandler;
import com.amazon.alexa.voiceui.R;
import com.amazon.alexa.voiceui.RouterDelegate;
import com.amazon.alexa.voiceui.SaveInstanceStateHandler;
import com.amazon.regulator.Component;
import com.amazon.regulator.Router;
import dagger.Module;
import dagger.Provides;
import javax.inject.Named;
import javax.inject.Singleton;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Module
/* loaded from: classes20.dex */
public class VoiceChromeModule {
    static final String VOICE_CHROME_BACK_PRESS_HANDLER = "voiceChromeBackPressHandler";
    private static final String VOICE_CHROME_CONTAINER = "voiceChromeContainer";
    public static final String VOICE_CHROME_ROUTER = "voiceChromeRouter";
    static final String VOICE_CHROME_ROUTER_DELEGATE = "voiceChromeRouterDelegate";
    static final String VOICE_CHROME_SAVE_INSTANCE_STATE_HANDLER = "voiceChromeSaveInstanceState";
    private final Activity activity;

    public VoiceChromeModule(Activity activity) {
        this.activity = activity;
    }

    @Provides
    @Singleton
    @Named(VOICE_CHROME_BACK_PRESS_HANDLER)
    public BackButtonPressHandler providesBackButtonPressHandler(@Named("voiceChromeRouterDelegate") RouterDelegate routerDelegate) {
        return new DefaultBackButtonPressHandler(routerDelegate);
    }

    @Provides
    @Singleton
    @Named(VOICE_CHROME_SAVE_INSTANCE_STATE_HANDLER)
    public SaveInstanceStateHandler providesSaveInstanceStateHandler(@Named("voiceChromeRouterDelegate") RouterDelegate routerDelegate) {
        return new DefaultSaveInstanceStateHandler(routerDelegate);
    }

    @Provides
    @Singleton
    public TypingPrimerDisplayer providesTypingPrimerDisplayer() {
        return new DefaultTypingPrimerDisplayer(this.activity);
    }

    @Provides
    @Singleton
    @Named(VOICE_CHROME_CONTAINER)
    public ViewGroup providesVoiceChromeContainer() {
        return (ViewGroup) this.activity.findViewById(R.id.voice_chrome_container);
    }

    @Provides
    @Singleton
    @Named(VOICE_CHROME_ROUTER)
    public Router providesVoiceChromeRouter(@Named("voiceChromeContainer") ViewGroup viewGroup, Component component) {
        Router router = new Router(this.activity, component, null);
        router.attach(viewGroup);
        return router;
    }

    @Provides
    @Singleton
    @Named(VOICE_CHROME_ROUTER_DELEGATE)
    public RouterDelegate providesVoiceChromeRouterDelegate(@Named("voiceChromeRouter") Router router) {
        return new RouterDelegate(router);
    }

    @Provides
    @Singleton
    public AttentionSystemContract providesAttentionSystemContract(VoiceChromeModel voiceChromeModel) {
        return voiceChromeModel;
    }
}
