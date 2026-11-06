package com.amazon.alexa.presence;

import android.content.Context;
import android.util.Log;
import androidx.annotation.VisibleForTesting;
import com.amazon.alexa.device.api.DeviceInformation;
import com.amazon.alexa.eventbus.api.EventBus;
import com.amazon.alexa.eventbus.api.Message;
import com.amazon.alexa.eventbus.api.MessageHandler;
import com.amazon.alexa.eventbus.api.MultiFilterSubscriber;
import com.amazon.alexa.eventbus.message.EventTypeMessageFilter;
import com.amazon.alexa.identity.api.IdentityEvent;
import com.amazon.alexa.identity.api.IdentityService;
import com.amazon.alexa.mobilytics.Mobilytics;
import com.amazon.alexa.presence.api.PresenceService;
import com.amazon.alexa.presence.dagger.PresenceComponentSingleton;
import com.amazon.alexa.presence.eventbus.EventBusHelper;
import com.amazon.alexa.presence.library.storage.PersistentLocalStorage;
import com.amazon.alexa.presence.logging.PresenceSlf4jAndroidLoggerFactory;
import com.amazon.alexa.presence.utils.DevicePlatformUtil;
import com.amazon.alexa.presence.utils.MetricsUtil;
import com.dee.app.metrics.MetricsServiceV2;
import dagger.Lazy;
import javax.inject.Inject;
import org.slf4j.impl.AlexaSlf4jAndroidLoggerFactory;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes18.dex */
public class PresenceLifecycleManager implements PresenceService {
    private static final String TAG = Presence.tag();
    private final Context context;

    @Inject
    Lazy<PresenceController> controller;

    @Inject
    DeviceInformation deviceInformation;

    @Inject
    EventBus eventBus;

    @Inject
    Lazy<EventBusHelper> eventBusHelper;

    @Inject
    IdentityService identityService;

    @Inject
    Lazy<PresenceSubComponents> mPresenceSubComponents;

    @Inject
    MetricsServiceV2 metricsServiceV2;

    @Inject
    Mobilytics mobilytics;

    static {
        AlexaSlf4jAndroidLoggerFactory.subscribe(PresenceSlf4jAndroidLoggerFactory.DEFAULT);
    }

    @VisibleForTesting
    public PresenceLifecycleManager(Context context, Lazy<EventBusHelper> lazy, IdentityService identityService, Lazy<PresenceSubComponents> lazy2, MetricsServiceV2 metricsServiceV2, Mobilytics mobilytics, DeviceInformation deviceInformation, Lazy<PresenceController> lazy3, EventBus eventBus) {
        this.eventBusHelper = lazy;
        this.identityService = identityService;
        this.context = context;
        this.mPresenceSubComponents = lazy2;
        this.metricsServiceV2 = metricsServiceV2;
        this.mobilytics = mobilytics;
        this.deviceInformation = deviceInformation;
        this.controller = lazy3;
        this.eventBus = eventBus;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$observeUserSignInOutChanges$0(Message message) {
        Log.i(TAG, "Sign in message received");
        initializePresenceAppComponents();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$observeUserSignInOutChanges$1(Message message) {
        Log.i(TAG, "Sign out message received");
        destroyPresenceAppComponents();
    }

    public void clearPersistentStorage() {
        this.controller.get().clearPresenceDomains(this.context);
    }

    @VisibleForTesting
    public void destroyPresenceAppComponents() {
        this.eventBusHelper.get().unsubscribeFromEventBus();
        if (isAnyDomainRequestingPresence()) {
            this.mPresenceSubComponents.get().destroyPresenceComponentsOnNoDomainRequest();
            Log.i(TAG, "Clearing presence persistent storage");
            clearPersistentStorage();
            MetricsUtil.recordCount(this.metricsServiceV2, this.mobilytics, MetricsUtil.MetricsId.STOP_PHONE_ID_LOGOUT, MetricsUtil.Method.STOP_PHONE_ID_V2);
            stopPhoneId();
        }
    }

    @VisibleForTesting
    public void initializePresenceAppComponents() {
        String str = TAG;
        Log.i(str, "Initializing Presence module.");
        this.eventBusHelper.get().subscribeToEventBus();
        if (isAnyDomainRequestingPresence()) {
            Log.i(str, "Domain requesting presence, initializing.");
            this.mPresenceSubComponents.get().initializePresenceComponentsAfterDomainRequest();
            MetricsUtil.recordCount(this.metricsServiceV2, this.mobilytics, MetricsUtil.MetricsId.START_PHONE_ID_INITIALIZE_PRESENCE, MetricsUtil.Method.START_PHONE_ID_V2);
            startPhoneId();
        }
    }

    public boolean isAnyDomainRequestingPresence() {
        return PersistentLocalStorage.presenceRequested(this.context);
    }

    public void observeUserSignInOutChanges() {
        MultiFilterSubscriber subscriber = this.eventBus.getSubscriber();
        final int i = 0;
        subscriber.subscribeFilter(new EventTypeMessageFilter(IdentityEvent.IDENTITY_SIGN_IN_SUCCESS), new MessageHandler(this) { // from class: com.amazon.alexa.presence.PresenceLifecycleManager$$ExternalSyntheticLambda0
            public final /* synthetic */ PresenceLifecycleManager f$0;

            {
                this.f$0 = this;
            }

            @Override // com.amazon.alexa.eventbus.api.MessageHandler
            /* renamed from: handle */
            public final void lambda$subscribe$1(Message message) {
                int i2 = i;
                PresenceLifecycleManager presenceLifecycleManager = this.f$0;
                switch (i2) {
                    case 0:
                        presenceLifecycleManager.lambda$observeUserSignInOutChanges$0(message);
                        break;
                    default:
                        presenceLifecycleManager.lambda$observeUserSignInOutChanges$1(message);
                        break;
                }
            }
        });
        final int i2 = 1;
        subscriber.subscribeFilter(new EventTypeMessageFilter(IdentityEvent.IDENTITY_SIGN_OUT_SUCCESS), new MessageHandler(this) { // from class: com.amazon.alexa.presence.PresenceLifecycleManager$$ExternalSyntheticLambda0
            public final /* synthetic */ PresenceLifecycleManager f$0;

            {
                this.f$0 = this;
            }

            @Override // com.amazon.alexa.eventbus.api.MessageHandler
            /* renamed from: handle */
            public final void lambda$subscribe$1(Message message) {
                int i22 = i2;
                PresenceLifecycleManager presenceLifecycleManager = this.f$0;
                switch (i22) {
                    case 0:
                        presenceLifecycleManager.lambda$observeUserSignInOutChanges$0(message);
                        break;
                    default:
                        presenceLifecycleManager.lambda$observeUserSignInOutChanges$1(message);
                        break;
                }
            }
        });
    }

    @Override // com.amazon.alexa.component.api.ServiceLifecycle
    public void start() {
        if (!this.deviceInformation.isPhoneFormFactor()) {
            Log.w(TAG, "Presence component will not work on non Phone devices.");
        } else if (DevicePlatformUtil.isAndroidOreoOrLater()) {
            observeUserSignInOutChanges();
            initializePresenceAppComponents();
        }
    }

    public void startPhoneId() {
        this.controller.get().enablePresence(this.context);
    }

    public void stopPhoneId() {
        this.controller.get().disablePresence(this.context);
    }

    @Override // com.amazon.alexa.component.api.ServiceLifecycle
    public void stop() {
    }

    public PresenceLifecycleManager(Context context) {
        this.context = context;
        PresenceComponentSingleton.getInstance(context).inject(this);
    }
}
