package com.amazon.alexa.client.alexaservice.base.metrics;

import android.os.Bundle;
import androidx.annotation.Nullable;
import com.amazon.alexa.api.AlexaMetadataBundleKey;
import com.amazon.alexa.api.UiEventName;
import com.amazon.alexa.client.alexaservice.eventing.AlexaClientEventBus;
import com.amazon.alexa.client.alexaservice.eventing.events.UiEventReceivedEvent;
import javax.inject.Inject;
import javax.inject.Singleton;
import org.greenrobot.eventbus.Subscribe;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Singleton
/* loaded from: classes17.dex */
public class VisualShareModeNameProvider {
    private volatile String cachedContextSource;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    /* renamed from: com.amazon.alexa.client.alexaservice.base.metrics.VisualShareModeNameProvider$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$amazon$alexa$api$UiEventName;

        static {
            int[] iArr = new int[UiEventName.values().length];
            $SwitchMap$com$amazon$alexa$api$UiEventName = iArr;
            try {
                iArr[UiEventName.VISUAL_SHARE_STARTED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$amazon$alexa$api$UiEventName[UiEventName.VISUAL_SHARE_CAMERA_FLIPPED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$amazon$alexa$api$UiEventName[UiEventName.VISUAL_SHARE_SWAP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$amazon$alexa$api$UiEventName[UiEventName.VISUAL_SHARE_STOPPED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    @Inject
    public VisualShareModeNameProvider(AlexaClientEventBus alexaClientEventBus) {
        alexaClientEventBus.register(this);
    }

    @Nullable
    public String getCurrentContextSource() {
        return this.cachedContextSource;
    }

    @Subscribe
    public void on(UiEventReceivedEvent uiEventReceivedEvent) {
        int i = AnonymousClass1.$SwitchMap$com$amazon$alexa$api$UiEventName[uiEventReceivedEvent.getUiEventName().ordinal()];
        if (i != 1 && i != 2 && i != 3) {
            if (i != 4) {
                return;
            }
            this.cachedContextSource = null;
        } else {
            Bundle eventData = uiEventReceivedEvent.getEventData();
            if (eventData != null) {
                this.cachedContextSource = eventData.getString(AlexaMetadataBundleKey.CONTEXT_SOURCE.name());
            }
        }
    }
}
