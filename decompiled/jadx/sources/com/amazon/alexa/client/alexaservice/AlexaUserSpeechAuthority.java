package com.amazon.alexa.client.alexaservice;

import android.os.RemoteException;
import android.util.Log;
import com.amazon.alexa.api.AlexaUserSpeechListenerProxy;
import com.amazon.alexa.api.ExtendedClient;
import com.amazon.alexa.client.alexaservice.eventing.AlexaClientEventBus;
import com.amazon.alexa.client.alexaservice.eventing.events.AlexaUserSpeechVolumeChangedEvent;
import com.amazon.alexa.client.alexaservice.eventing.events.ClientDisconnectedEvent;
import java.util.Iterator;
import javax.inject.Inject;
import javax.inject.Singleton;
import org.greenrobot.eventbus.Subscribe;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Singleton
/* loaded from: classes17.dex */
public class AlexaUserSpeechAuthority {
    private static final String TAG = "AlexaUserSpeechAuthority";
    private final AlexaClientEventBus eventBus;
    private final ClientProxyListenerContainer<AlexaUserSpeechListenerProxy> alexaUserSpeechListeners = new ClientProxyListenerContainer<>();
    private float volumeScaled = 0.0f;

    @Inject
    public AlexaUserSpeechAuthority(AlexaClientEventBus alexaClientEventBus) {
        this.eventBus = alexaClientEventBus;
        alexaClientEventBus.register(this);
    }

    public void deregisterAlexaUserSpeechListener(AlexaUserSpeechListenerProxy alexaUserSpeechListenerProxy) {
        ExtendedClient remove = this.alexaUserSpeechListeners.remove((ClientProxyListenerContainer<AlexaUserSpeechListenerProxy>) alexaUserSpeechListenerProxy);
        if (remove != null) {
            remove.getId();
        }
    }

    @Subscribe
    public void on(AlexaUserSpeechVolumeChangedEvent alexaUserSpeechVolumeChangedEvent) {
        this.volumeScaled = alexaUserSpeechVolumeChangedEvent.getScaledVolume();
        Iterator<T> it2 = this.alexaUserSpeechListeners.iterator();
        while (it2.hasNext()) {
            final AlexaUserSpeechListenerProxy alexaUserSpeechListenerProxy = (AlexaUserSpeechListenerProxy) it2.next();
            com.amazon.alexa.utils.ApiThreadHelper.runOnUiThread(new Runnable() { // from class: com.amazon.alexa.client.alexaservice.AlexaUserSpeechAuthority.1
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        alexaUserSpeechListenerProxy.onAlexaUserSpeechVolumeChanged(AlexaUserSpeechAuthority.this.volumeScaled);
                    } catch (RemoteException e) {
                        Log.e(AlexaUserSpeechAuthority.TAG, e.getMessage(), e);
                        AlexaUserSpeechAuthority.this.eventBus.post(ClientDisconnectedEvent.create(AlexaUserSpeechAuthority.this.alexaUserSpeechListeners.getClientForListener((ClientProxyListenerContainer) alexaUserSpeechListenerProxy)));
                    }
                }
            });
        }
    }

    public void registerAlexaUserSpeechListener(ExtendedClient extendedClient, AlexaUserSpeechListenerProxy alexaUserSpeechListenerProxy) {
        this.alexaUserSpeechListeners.addListenerForClient(extendedClient, (ExtendedClient) alexaUserSpeechListenerProxy);
        try {
            alexaUserSpeechListenerProxy.onAlexaUserSpeechVolumeChanged(this.volumeScaled);
        } catch (RemoteException e) {
            Log.e(TAG, e.getMessage(), e);
            this.eventBus.post(ClientDisconnectedEvent.create(extendedClient));
        }
    }

    @Subscribe
    public void on(ClientDisconnectedEvent clientDisconnectedEvent) {
        this.alexaUserSpeechListeners.removeAllClientListeners(clientDisconnectedEvent.getClient());
    }
}
