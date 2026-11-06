package com.amazon.alexa.client.alexaservice.vad.deferredbargein;

import com.amazon.alexa.client.alexaservice.AlexaStateAuthority;
import com.amazon.alexa.client.alexaservice.base.feature.FeatureFlagConfigurationAuthority;
import com.amazon.alexa.client.alexaservice.dialog.core.DialogAuthority;
import com.amazon.alexa.client.alexaservice.dialog.core.MultiTurnDialogAuthority;
import com.amazon.alexa.client.alexaservice.dialog.core.messagesequencer.MessageProcessingSequencer;
import com.amazon.alexa.client.alexaservice.dialog.voice.speechsynthesizer.SpeechSynthesizerCapabilityAgent;
import com.amazon.alexa.client.alexaservice.eventing.AlexaClientEventBus;
import com.amazon.alexa.client.alexaservice.ui.conversations.ConversationsAuthority;
import dagger.Lazy;
import dagger.Module;
import dagger.Provides;
import java.util.concurrent.Executors;
import javax.inject.Singleton;
import org.apache.commons.io.input.ReadAheadInputStream$$ExternalSyntheticLambda1;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Module
/* loaded from: classes17.dex */
public class DeferredBargeInModule {
    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Thread lambda$providesDeferredBargeInAuthority$0(Runnable runnable) {
        Thread thread = new Thread(runnable, "deferred-barge-in-timer");
        thread.setDaemon(true);
        return thread;
    }

    @Provides
    @Singleton
    public DeferredBargeInAuthority providesDeferredBargeInAuthority(AlexaClientEventBus alexaClientEventBus, Lazy<MessageProcessingSequencer> lazy, Lazy<SpeechSynthesizerCapabilityAgent> lazy2, AlexaStateAuthority alexaStateAuthority, DialogAuthority dialogAuthority, DeferredDialogManager deferredDialogManager, Lazy<ConversationsAuthority> lazy3, DeferredBargeInConfiguration deferredBargeInConfiguration, FeatureFlagConfigurationAuthority featureFlagConfigurationAuthority) {
        return new DeferredBargeInAuthority(alexaClientEventBus, lazy, lazy2, alexaStateAuthority, dialogAuthority, deferredDialogManager, lazy3, deferredBargeInConfiguration, featureFlagConfigurationAuthority, Executors.newSingleThreadScheduledExecutor(new ReadAheadInputStream$$ExternalSyntheticLambda1(11)));
    }

    @Provides
    @Singleton
    public DeferredBargeInConfiguration providesDeferredBargeInConfiguration() {
        return new DeferredBargeInConfiguration();
    }

    @Provides
    @Singleton
    public DeferredDialogManager providesDeferredDialogManager(MultiTurnDialogAuthority multiTurnDialogAuthority) {
        return new DeferredDialogManager(multiTurnDialogAuthority);
    }
}
