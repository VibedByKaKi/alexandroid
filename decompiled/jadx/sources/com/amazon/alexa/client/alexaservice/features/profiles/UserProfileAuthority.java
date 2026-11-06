package com.amazon.alexa.client.alexaservice.features.profiles;

import com.amazon.alexa.api.AlexaUserProfile;
import com.amazon.alexa.api.AlexaUserProfileListener;
import com.amazon.alexa.api.ExtendedClient;
import com.amazon.alexa.client.alexaservice.ApiCallMetadata;
import com.amazon.alexa.client.alexaservice.ClientListenerContainer;
import com.amazon.alexa.client.alexaservice.base.events.UserLoggedOutEvent;
import com.amazon.alexa.client.alexaservice.base.system.AlexaServiceSettingsStore;
import com.amazon.alexa.client.alexaservice.eventing.AlexaClientEventBus;
import com.amazon.alexa.client.alexaservice.eventing.events.ApiCallEvent;
import com.amazon.alexa.client.alexaservice.eventing.events.ClientDisconnectedEvent;
import java.util.Iterator;
import javax.inject.Inject;
import javax.inject.Singleton;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Singleton
/* loaded from: classes17.dex */
public class UserProfileAuthority {
    private static final String TAG = "UserProfileAuthority";
    private AlexaUserProfile cachedUserProfile;
    private final AlexaClientEventBus eventBus;
    private final ClientListenerContainer<AlexaUserProfileListener> profileListeners = new ClientListenerContainer<>();
    private final AlexaServiceSettingsStore store;

    @Inject
    public UserProfileAuthority(AlexaClientEventBus alexaClientEventBus, AlexaServiceSettingsStore alexaServiceSettingsStore) {
        this.eventBus = alexaClientEventBus;
        this.store = alexaServiceSettingsStore;
        alexaClientEventBus.register(this);
    }

    private void onUserProfileUpdated(AlexaUserProfile alexaUserProfile) {
        Iterator<AlexaUserProfileListener> it2 = this.profileListeners.iterator();
        while (it2.hasNext()) {
            it2.next().onProfileUpdated(alexaUserProfile);
        }
    }

    public void deregisterUserProfileListener(ApiCallMetadata apiCallMetadata, AlexaUserProfileListener alexaUserProfileListener) {
        this.profileListeners.remove(alexaUserProfileListener);
        this.eventBus.post(ApiCallEvent.SuccessEvent.create(apiCallMetadata));
    }

    public synchronized AlexaUserProfile getUserProfile() {
        try {
            if (this.cachedUserProfile == null) {
                String personId = this.store.getPersonId();
                if (!personId.isEmpty()) {
                    this.cachedUserProfile = AlexaUserProfile.builder().setPersonId(personId).setIsChildProfile(this.store.isChildProfile()).setFirstName(this.store.getFirstName()).build();
                }
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.cachedUserProfile;
    }

    @Subscribe(threadMode = ThreadMode.ASYNC)
    public void on(ClientDisconnectedEvent clientDisconnectedEvent) {
        this.profileListeners.removeAllClientListeners(clientDisconnectedEvent.getClient());
    }

    public synchronized void onAccountRemoved() {
        this.store.resetUserProfile();
        this.cachedUserProfile = null;
    }

    public void registerUserProfileListener(ExtendedClient extendedClient, ApiCallMetadata apiCallMetadata, AlexaUserProfileListener alexaUserProfileListener) {
        this.profileListeners.addListenerForClient(extendedClient, alexaUserProfileListener);
        AlexaUserProfile userProfile = getUserProfile();
        if (userProfile != null) {
            alexaUserProfileListener.onProfileUpdated(userProfile);
        }
        this.eventBus.post(ApiCallEvent.SuccessEvent.create(apiCallMetadata));
    }

    public void setProfile(ApiCallMetadata apiCallMetadata, AlexaUserProfile alexaUserProfile) {
        synchronized (this) {
            this.cachedUserProfile = alexaUserProfile;
            this.store.setPersonId(alexaUserProfile.getPersonId());
            this.store.setIsChildProfile(alexaUserProfile.isChildProfile());
            this.store.setFirstName(alexaUserProfile.getFirstName());
        }
        onUserProfileUpdated(alexaUserProfile);
        this.eventBus.post(ApiCallEvent.SuccessEvent.create(apiCallMetadata));
    }

    public void teardown() {
        if (this.eventBus.isRegistered(this)) {
            this.eventBus.unregister(this);
        }
    }

    @Subscribe(threadMode = ThreadMode.ASYNC)
    public synchronized void on(UserLoggedOutEvent userLoggedOutEvent) {
        this.cachedUserProfile = null;
    }
}
