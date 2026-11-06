package com.amazon.alexa.android.ui;

import android.content.Intent;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.amazon.alexa.voice.ui.ra.RaConversationLaunchHandler;
import com.amazon.alexa.voice.ui.ra.RaConversationLaunchHandlerRegistry;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes16.dex */
final class PluggableActivityStarter implements ActivityStarter {
    private static final String ACTION_SHOW_RA_UI = "amazon.intent.action.SHOW_RA_UI";

    @NonNull
    private final ActivityStarter delegate;

    public PluggableActivityStarter(@NonNull ActivityStarter activityStarter) {
        this.delegate = activityStarter;
    }

    @Override // com.amazon.alexa.android.ui.ActivityStarter
    public void startActivity(@Nullable Intent intent) {
        RaConversationLaunchHandler raConversationLaunchHandler;
        if (intent == null || !"amazon.intent.action.SHOW_RA_UI".equals(intent.getAction()) || (raConversationLaunchHandler = RaConversationLaunchHandlerRegistry.get()) == null || !raConversationLaunchHandler.handleConversationLaunch(intent)) {
            this.delegate.startActivity(intent);
        }
    }
}
