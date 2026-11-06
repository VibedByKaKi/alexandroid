package com.amazon.alexa.voice.tta.sdk;

import android.content.Context;
import com.amazon.alexa.api.AlexaMobileFrameworkApis;
import com.amazon.alexa.voice.tta.typing.TtaMessageSanitizer;
import com.google.gson.Gson;
import dagger.Module;
import dagger.Provides;
import javax.inject.Singleton;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Module
/* loaded from: classes19.dex */
public class SdkModule {
    @Provides
    @Singleton
    public AlexaClientSdkApis providesAlexaClientSdkApis(AlexaMobileFrameworkApis alexaMobileFrameworkApis, Gson gson) {
        return new AlexaClientSdkApis(alexaMobileFrameworkApis, gson);
    }

    @Provides
    @Singleton
    public AlexaPlayerInfoCardTracker providesAlexaPlayerInfoCardTracker() {
        return new AlexaPlayerInfoCardTracker();
    }

    @Provides
    @Singleton
    public AlexaStateTracker providesAlexaStateTracker() {
        return new AlexaStateTracker();
    }

    @Provides
    @Singleton
    public AlexaTextResponseTracker providesAlexaTextResponseTracker(TtaMessageSanitizer ttaMessageSanitizer) {
        return new AlexaTextResponseTracker(ttaMessageSanitizer);
    }

    @Provides
    @Singleton
    public UiEventReporter providesUiEventReporter(Context context) {
        return new UiEventReporter(context);
    }
}
