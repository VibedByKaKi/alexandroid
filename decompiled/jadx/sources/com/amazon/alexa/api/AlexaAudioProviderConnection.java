package com.amazon.alexa.api;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.IBinder;
import android.os.RemoteException;
import android.util.Log;
import com.amazon.alexa.api.ManagedServiceConnection;
import com.amazon.alexa.api.messages.messagereceiver.MessageReceiver;
import com.amazon.alexa.client.annotations.NonNull;
import com.amazon.alexa.utils.security.ComponentEnabler;
import com.amazon.alexa.utils.security.SignatureVerifier;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes16.dex */
public class AlexaAudioProviderConnection extends AlexaConnectionWithoutLeaderSelection<AlexaAudioProviderManagerMessageSender> {
    private static final String EXTRA_EXTENDED_CLIENT = "EXTRA_EXTENDED_CLIENT";
    private static final String EXTRA_REQUIRES_FOREGROUND = "EXTRA_REQUIRES_FOREGROUND";
    private static final String TAG = "AlexaAudioProviderConnection";
    private Context context;
    private volatile boolean disableConnectionFailureBroadcastIntent;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    /* renamed from: com.amazon.alexa.api.AlexaAudioProviderConnection$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$amazon$alexa$api$AlexaConnectingFailedReason;

        static {
            int[] iArr = new int[AlexaConnectingFailedReason.values().length];
            $SwitchMap$com$amazon$alexa$api$AlexaConnectingFailedReason = iArr;
            try {
                iArr[AlexaConnectingFailedReason.NO_ALEXA_SERVICES_ACCOUNT_REGISTERED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$amazon$alexa$api$AlexaConnectingFailedReason[AlexaConnectingFailedReason.NO_ALEXA_SERVICES_TO_CONNECT_TO.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$amazon$alexa$api$AlexaConnectingFailedReason[AlexaConnectingFailedReason.UNKNOWN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface ConnectionListener extends ManagedServiceConnection.ConnectionListener {
    }

    public AlexaAudioProviderConnection(@NonNull Context context) {
        super(context);
        this.disableConnectionFailureBroadcastIntent = false;
        this.context = context;
    }

    @Override // com.amazon.alexa.api.ManagedServiceConnection
    public AlexaAudioProviderManagerMessageSender createServiceInterface(IBinder iBinder) {
        return new AlexaAudioProviderManagerMessageSender(iBinder, getMessageReceiversManager());
    }

    @Override // com.amazon.alexa.api.AlexaConnectionWithoutLeaderSelection
    public void deregisterForceDisconnectListener(MessageReceiver<ForceDisconnectMessageType> messageReceiver) {
        try {
            AlexaAudioProviderManagerMessageSender alexaAudioProviderManagerMessageSender = (AlexaAudioProviderManagerMessageSender) this.serviceInterface.get();
            if (alexaAudioProviderManagerMessageSender != null) {
                alexaAudioProviderManagerMessageSender.deregisterForceDisconnectListener(getClient(), messageReceiver);
            }
        } catch (RemoteException e) {
            Log.e(TAG, "Exception while deregistering previous listeners: " + e.getMessage());
        }
    }

    public void disableConnectionFailureBroadcastIntent(boolean z) {
        this.disableConnectionFailureBroadcastIntent = z;
    }

    @Override // com.amazon.alexa.api.ManagedServiceConnection
    public void doConnect() {
        if (isLeaderInstalled()) {
            super.doConnect();
            return;
        }
        sendConnectingFailed(AlexaConnectingFailedReason.NO_ALEXA_SERVICES_TO_CONNECT_TO, getServiceComponentName() + " is not installed.");
    }

    @Override // com.amazon.alexa.api.ManagedServiceConnection
    public Intent getConnectionIntent(ComponentName componentName, boolean z) {
        Intent intent = new Intent();
        intent.setComponent(componentName);
        intent.putExtra("EXTRA_EXTENDED_CLIENT", getClient().getBundle());
        intent.putExtra("EXTRA_REQUIRES_FOREGROUND", z);
        return intent;
    }

    @Override // com.amazon.alexa.api.AlexaConnectionWithoutLeaderSelection
    public String getServiceName() {
        return getContext().getString(R.string.alexa_audio_provider_manager_service_name);
    }

    @Override // com.amazon.alexa.api.AlexaConnectionWithoutLeaderSelection, com.amazon.alexa.api.ManagedServiceConnection
    public /* bridge */ /* synthetic */ boolean internalIsConnected() {
        return super.internalIsConnected();
    }

    public boolean isLeaderInstalled() {
        return ComponentEnabler.checkIfComponentIsEnabled(this.context.getPackageManager(), getServiceComponentName());
    }

    @Override // com.amazon.alexa.api.AlexaConnectionWithoutLeaderSelection
    public boolean isUserLoggedIn() {
        return Account.isUserLoggedIn(this);
    }

    @Override // com.amazon.alexa.api.AlexaConnectionWithoutLeaderSelection
    public void onClientDisconnected() {
        super.onClientDisconnected();
        AlexaAudioProviderManagerMessageSender alexaAudioProviderManagerMessageSender = (AlexaAudioProviderManagerMessageSender) this.serviceInterface.get();
        if (alexaAudioProviderManagerMessageSender != null) {
            try {
                alexaAudioProviderManagerMessageSender.onClientDisconnect(getClient());
            } catch (RemoteException e) {
                Log.e(TAG, "Unable to send client disconnect", e);
            }
        }
    }

    @Override // com.amazon.alexa.api.AlexaConnectionWithoutLeaderSelection
    public void registerForceDisconnectListener(MessageReceiver<ForceDisconnectMessageType> messageReceiver) {
        try {
            ((AlexaAudioProviderManagerMessageSender) this.serviceInterface.get()).registerForceDisconnectListener(getClient(), messageReceiver);
        } catch (RemoteException e) {
            Log.e(TAG, "Unable to register required listeners", e);
            disconnect();
        }
    }

    @Override // com.amazon.alexa.api.AlexaConnectionWithoutLeaderSelection, com.amazon.alexa.api.ManagedServiceConnection
    public /* bridge */ /* synthetic */ void release() {
        super.release();
    }

    @Override // com.amazon.alexa.api.ManagedServiceConnection
    public void sendConnectingFailed(AlexaConnectingFailedReason alexaConnectingFailedReason, String str) {
        Intent createMissingAuthorizationIntent;
        super.sendConnectingFailed(alexaConnectingFailedReason, str);
        if (this.disableConnectionFailureBroadcastIntent) {
            return;
        }
        int i = AnonymousClass1.$SwitchMap$com$amazon$alexa$api$AlexaConnectingFailedReason[alexaConnectingFailedReason.ordinal()];
        if (i != 1) {
            Context context = this.context;
            createMissingAuthorizationIntent = i != 2 ? NotificationIntentFactory.createUnknownReasonIntent(context) : NotificationIntentFactory.createMissingLeaderIntent(context);
        } else {
            createMissingAuthorizationIntent = NotificationIntentFactory.createMissingAuthorizationIntent(this.context);
        }
        this.context.sendBroadcast(createMissingAuthorizationIntent);
    }

    public AlexaAudioProviderConnection(@NonNull Context context, @NonNull SignatureVerifier signatureVerifier, @NonNull Handler handler, @NonNull Handler handler2) {
        super(context, signatureVerifier, handler, handler2);
        this.disableConnectionFailureBroadcastIntent = false;
        this.context = context;
    }
}
