package com.amazon.alexa.client.alexaservice.dialog.voice.wakeword;

import android.util.Log;
import com.amazon.alexa.client.alexaservice.base.interactions.channels.ChannelType;
import com.amazon.alexa.client.alexaservice.base.interactions.events.ChannelUpdatedEvent;
import com.amazon.alexa.client.alexaservice.eventing.AlexaClientEventBus;
import com.amazon.alexa.utils.validation.Preconditions;
import com.amazon.alexa.wakeword.precondition.InternalWakeWordPrecondition;
import com.facebook.react.modules.appstate.AppStateModule;
import java.util.EnumSet;
import java.util.Set;
import javax.inject.Inject;
import javax.inject.Singleton;
import org.greenrobot.eventbus.Subscribe;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Singleton
/* loaded from: classes17.dex */
public class InteractionChannelWakeWordPrecondition extends InternalWakeWordPrecondition {
    private static final String TAG = "InteractionChannelWakeWordPrecondition";
    private final Set<ChannelType> channelsOfFocus;
    private final AlexaClientEventBus eventBus;
    private boolean isChannelActive;
    private final Object lock = new Object();

    @Inject
    public InteractionChannelWakeWordPrecondition(AlexaClientEventBus alexaClientEventBus) {
        Preconditions.notNull(alexaClientEventBus, "eventBus is null");
        this.eventBus = alexaClientEventBus;
        this.channelsOfFocus = getChannelsOfFocus();
        alexaClientEventBus.register(this);
    }

    private Set<ChannelType> getChannelsOfFocus() {
        return EnumSet.of(ChannelType.IMPORTANT, ChannelType.COMMUNICATIONS);
    }

    private boolean isChannelOfFocus(ChannelType channelType) {
        return this.channelsOfFocus.contains(channelType);
    }

    @Override // com.amazon.alexa.wakeword.precondition.WakeWordPrecondition
    public boolean isWakeWordAllowed() {
        boolean z;
        synchronized (this.lock) {
            z = !this.isChannelActive;
        }
        return z;
    }

    @Subscribe
    public void on(ChannelUpdatedEvent channelUpdatedEvent) {
        boolean z;
        boolean z2;
        synchronized (this.lock) {
            try {
                if (!isChannelOfFocus(channelUpdatedEvent.getChannelType()) || this.isChannelActive == channelUpdatedEvent.isActive()) {
                    z = false;
                    z2 = false;
                } else {
                    this.isChannelActive = channelUpdatedEvent.isActive();
                    String str = TAG;
                    StringBuilder sb = new StringBuilder();
                    sb.append(channelUpdatedEvent.getChannelType());
                    sb.append(" state changed to ");
                    sb.append(this.isChannelActive ? AppStateModule.APP_STATE_ACTIVE : "inactive");
                    Log.i(str, sb.toString());
                    z = isWakeWordAllowed();
                    z2 = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z2) {
            notifyStateChanged(z);
        }
    }

    @Override // com.amazon.alexa.wakeword.precondition.InternalWakeWordPrecondition
    public void teardown() {
        this.eventBus.unregister(this);
    }
}
