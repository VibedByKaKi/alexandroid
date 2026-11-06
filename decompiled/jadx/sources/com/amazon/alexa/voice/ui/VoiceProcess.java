package com.amazon.alexa.voice.ui;

import android.content.Context;
import androidx.annotation.NonNull;
import com.amazon.alexa.eventbus.api.EventBus;
import com.amazon.alexa.mosaic.components.ThemeUtil;
import com.amazon.alexa.voice.ra.RaConversationLaunchForwarder;
import com.amazon.alexa.voice.ui.ra.RaConversationLaunchHandlerRegistry;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class VoiceProcess {
    private static final String TAG = "VoiceProcess";

    public void initialize(@NonNull Context context, @NonNull EventBus eventBus) {
        RaConversationLaunchHandlerRegistry.register(new RaConversationLaunchForwarder(context));
        ThemeUtil.initTheme(null);
        new VoiceEventBusRebroadcastReceiver(context, eventBus.getPublisher(false)).start();
        eventBus.subscribe(ThemeUtil.getThemePreferenceSubscriber(context));
    }
}
