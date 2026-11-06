package com.amazon.alexa.client.alexaservice.ui.drivemode;

import android.util.Log;
import com.amazon.alexa.api.AlexaDriveModeListener;
import com.amazon.alexa.api.DriveModeState;
import com.amazon.alexa.api.ExtendedClient;
import com.amazon.alexa.client.alexaservice.ApiCallMetadata;
import com.amazon.alexa.client.alexaservice.ClientListenerContainer;
import com.amazon.alexa.client.alexaservice.eventing.AlexaClientEventBus;
import com.amazon.alexa.client.alexaservice.eventing.events.ApiCallEvent;
import com.amazon.alexa.client.alexaservice.eventing.events.ClientDisconnectedEvent;
import com.amazon.alexa.wakeword.pryon.WakeWordDetectorProvider;
import com.amazon.pryon.android.asr.PryonLite2000;
import dagger.Lazy;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import javax.inject.Inject;
import org.greenrobot.eventbus.Subscribe;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public class DriveModeAuthority {
    private static final String TAG = "DriveModeAuthority";
    private final AlexaClientEventBus alexaClientEventBus;
    private volatile boolean isEnabled;
    private final Lazy<WakeWordDetectorProvider> wakewordDetectorProvider;
    private final ClientListenerContainer<AlexaDriveModeListener> alexaDriveModeListeners = new ClientListenerContainer<>();
    private final Set<ExtendedClient> clientsRequestingDriveMode = new HashSet();
    private volatile boolean isDarkTheme = true;
    private volatile DriveModeState driveModeState = DriveModeState.NONE;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    /* renamed from: com.amazon.alexa.client.alexaservice.ui.drivemode.DriveModeAuthority$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$amazon$alexa$api$DriveModeState;

        static {
            int[] iArr = new int[DriveModeState.values().length];
            $SwitchMap$com$amazon$alexa$api$DriveModeState = iArr;
            try {
                iArr[DriveModeState.ACCESSORY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$amazon$alexa$api$DriveModeState[DriveModeState.AUTOBLUETOOTH.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$amazon$alexa$api$DriveModeState[DriveModeState.MANUAL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    @Inject
    public DriveModeAuthority(AlexaClientEventBus alexaClientEventBus, Lazy<WakeWordDetectorProvider> lazy) {
        this.alexaClientEventBus = alexaClientEventBus;
        this.wakewordDetectorProvider = lazy;
        alexaClientEventBus.register(this);
    }

    private void checkForDisablement() {
        if (this.alexaDriveModeListeners.isEmpty() && this.clientsRequestingDriveMode.isEmpty()) {
            this.isEnabled = false;
            this.driveModeState = DriveModeState.NONE;
        }
    }

    private void deregister(AlexaDriveModeListener alexaDriveModeListener) {
        this.alexaDriveModeListeners.remove(alexaDriveModeListener);
        checkForDisablement();
    }

    private void postSuccessfulApiCall(ApiCallMetadata apiCallMetadata) {
        this.alexaClientEventBus.post(ApiCallEvent.SuccessEvent.create(apiCallMetadata));
    }

    private void register(ExtendedClient extendedClient, AlexaDriveModeListener alexaDriveModeListener) {
        if (this.alexaDriveModeListeners.containsListener(alexaDriveModeListener)) {
            return;
        }
        this.alexaDriveModeListeners.addListenerForClient(extendedClient, alexaDriveModeListener);
        alexaDriveModeListener.onDriveModeEnabled(this.isEnabled);
        alexaDriveModeListener.onDriveModeState(this.driveModeState);
        alexaDriveModeListener.onDriveModeThemeChanged(this.isDarkTheme);
    }

    private void setDriveModeState(ExtendedClient extendedClient, DriveModeState driveModeState) {
        if (this.driveModeState != driveModeState) {
            this.driveModeState = driveModeState;
            this.clientsRequestingDriveMode.add(extendedClient);
            Iterator<AlexaDriveModeListener> it2 = this.alexaDriveModeListeners.getAllListeners().iterator();
            while (it2.hasNext()) {
                it2.next().onDriveModeState(driveModeState);
            }
        }
    }

    private void setDriveModeTheme(boolean z) {
        if (this.isDarkTheme != z) {
            this.isDarkTheme = z;
            Iterator<AlexaDriveModeListener> it2 = this.alexaDriveModeListeners.getAllListeners().iterator();
            while (it2.hasNext()) {
                it2.next().onDriveModeThemeChanged(z);
            }
        }
    }

    private void setEnabled(ExtendedClient extendedClient, boolean z) {
        int i;
        if (this.isEnabled != z) {
            this.isEnabled = z;
            if (z) {
                Log.i(TAG, "setEnabled | setting pryon client automotive property to active");
                this.clientsRequestingDriveMode.add(extendedClient);
                i = 1;
            } else {
                Log.i(TAG, "setEnabled | setting pryon client automotive property to in-active");
                this.clientsRequestingDriveMode.remove(extendedClient);
                i = 0;
            }
            this.wakewordDetectorProvider.get().setClientProperty(PryonLite2000.ClientProperty.AUTOMOTIVE_MODE, i);
            Iterator<AlexaDriveModeListener> it2 = this.alexaDriveModeListeners.getAllListeners().iterator();
            while (it2.hasNext()) {
                it2.next().onDriveModeEnabled(z);
            }
        }
    }

    public String driveModeState() {
        int i = AnonymousClass1.$SwitchMap$com$amazon$alexa$api$DriveModeState[this.driveModeState.ordinal()];
        return i != 1 ? i != 2 ? i != 3 ? "None" : "Default" : "AutoBluetooth" : "Accessory";
    }

    public boolean isDarkTheme() {
        return this.isDarkTheme;
    }

    public boolean isEnabled() {
        return this.isEnabled;
    }

    @Subscribe
    public void on(ClientDisconnectedEvent clientDisconnectedEvent) {
        this.alexaDriveModeListeners.removeAllClientListeners(clientDisconnectedEvent.getClient());
        this.clientsRequestingDriveMode.remove(clientDisconnectedEvent.getClient());
        checkForDisablement();
    }

    @Subscribe
    public void on(ApiCallEvent.DriveMode.DeregisterDriveModeListenerEvent deregisterDriveModeListenerEvent) {
        deregister(deregisterDriveModeListenerEvent.getAlexaDriveModeListener());
        postSuccessfulApiCall(deregisterDriveModeListenerEvent.getApiCallMetadata());
    }

    @Subscribe
    public void on(ApiCallEvent.DriveMode.SetDriveModeEnabledEvent setDriveModeEnabledEvent) {
        setEnabled(setDriveModeEnabledEvent.getClient(), setDriveModeEnabledEvent.isDriveModeEnabled());
        postSuccessfulApiCall(setDriveModeEnabledEvent.getApiCallMetadata());
    }

    @Subscribe
    public void on(ApiCallEvent.DriveMode.SetDriveModeStateEvent setDriveModeStateEvent) {
        setDriveModeState(setDriveModeStateEvent.getClient(), setDriveModeStateEvent.driveModeState());
        postSuccessfulApiCall(setDriveModeStateEvent.getApiCallMetadata());
    }

    @Subscribe
    public void on(ApiCallEvent.DriveMode.SetDriveModeThemeEvent setDriveModeThemeEvent) {
        setDriveModeTheme(setDriveModeThemeEvent.isAutoModeDarkTheme());
        postSuccessfulApiCall(setDriveModeThemeEvent.getApiCallMetadata());
    }

    @Subscribe
    public void on(ApiCallEvent.DriveMode.RegisterDriveModeListenerEvent registerDriveModeListenerEvent) {
        register(registerDriveModeListenerEvent.getClient(), registerDriveModeListenerEvent.getAlexaDriveModeListener());
        postSuccessfulApiCall(registerDriveModeListenerEvent.getApiCallMetadata());
    }
}
