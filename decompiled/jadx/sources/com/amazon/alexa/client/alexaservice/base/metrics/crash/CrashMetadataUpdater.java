package com.amazon.alexa.client.alexaservice.base.metrics.crash;

import com.amazon.alexa.api.AlexaState;
import com.amazon.alexa.client.alexaservice.InternalAlexaState;
import com.amazon.alexa.client.alexaservice.dialog.text.TextAvailabilityProvider;
import com.amazon.alexa.client.alexaservice.eventing.AlexaClientEventBus;
import com.amazon.alexa.client.alexaservice.eventing.events.AlexaStateChangedEvent;
import com.amazon.alexa.client.alexaservice.eventing.events.StartDialogInteractionEvent;
import com.amazon.alexa.client.alexaservice.features.bmclentitlement.ConversationAvailabilityChangedEvent;
import com.amazon.alexa.client.crashreporting.CrashReporter;
import java.util.Objects;
import javax.inject.Inject;
import javax.inject.Singleton;
import org.greenrobot.eventbus.Subscribe;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Singleton
/* loaded from: classes17.dex */
public class CrashMetadataUpdater {
    private static final String ALEXA_PLUS_BENEFIT_ENTITLEMENT_KEY = "entitlement_status";
    private static final String ALEXA_STATE_KEY = "alexaState";
    private static final String DIALOG_TYPE_KEY = "dialogType";
    private static final String DIALOG_TYPE_TEXT = "TEXT";
    private static final String DIALOG_TYPE_VOICE = "VOICE";
    private static final String INVOCATION_TYPE_KEY = "invocationType";
    private static final String NONE = "NONE";
    private static final String TAG = "CrashMetadataUpdater";
    private final AlexaClientEventBus alexaClientEventBus;
    private final CrashReporter crashReporter;
    private final TextAvailabilityProvider textAvailabilityProvider;

    @Inject
    public CrashMetadataUpdater(CrashReporter crashReporter, AlexaClientEventBus alexaClientEventBus, TextAvailabilityProvider textAvailabilityProvider) {
        this.crashReporter = crashReporter;
        this.alexaClientEventBus = alexaClientEventBus;
        this.textAvailabilityProvider = textAvailabilityProvider;
        initializeEntitlementMetadata();
        alexaClientEventBus.register(this);
    }

    private void initializeEntitlementMetadata() {
        this.crashReporter.putMetadata(ALEXA_PLUS_BENEFIT_ENTITLEMENT_KEY, String.valueOf(this.textAvailabilityProvider.isConversationAvailable()));
    }

    @Subscribe
    public synchronized void on(AlexaStateChangedEvent alexaStateChangedEvent) {
        try {
            InternalAlexaState alexaState = alexaStateChangedEvent.getAlexaState();
            AlexaState convertToExternalState = alexaState.convertToExternalState();
            Objects.toString(convertToExternalState);
            this.crashReporter.putMetadata("alexaState", convertToExternalState);
            if (alexaState != InternalAlexaState.IDLE) {
                if (alexaState != InternalAlexaState.ERROR) {
                    if (alexaState == InternalAlexaState.UNKNOWN) {
                    }
                }
            }
            this.crashReporter.putMetadata("invocationType", "NONE");
            this.crashReporter.putMetadata(DIALOG_TYPE_KEY, "NONE");
        } catch (Throwable th) {
            throw th;
        }
    }

    public void teardown() {
        this.alexaClientEventBus.unregister(this);
    }

    @Subscribe
    public synchronized void on(ConversationAvailabilityChangedEvent conversationAvailabilityChangedEvent) {
        this.crashReporter.putMetadata(ALEXA_PLUS_BENEFIT_ENTITLEMENT_KEY, String.valueOf(conversationAvailabilityChangedEvent.isAvailable()));
    }

    @Subscribe
    public synchronized void on(StartDialogInteractionEvent startDialogInteractionEvent) {
        try {
            String invocationType = startDialogInteractionEvent.getInvocationType();
            String str = startDialogInteractionEvent.isTextDialog() ? "TEXT" : DIALOG_TYPE_VOICE;
            this.crashReporter.putMetadata("invocationType", invocationType);
            this.crashReporter.putMetadata(DIALOG_TYPE_KEY, str);
        } catch (Throwable th) {
            throw th;
        }
    }
}
