package com.amazon.alexa.api;

import android.os.RemoteException;
import android.util.Log;
import com.amazon.alexa.utils.validation.Preconditions;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes16.dex */
public class DevicePreferences {
    private static final String TAG = "DevicePreferences";

    private DevicePreferences() {
        throw new UnsupportedOperationException();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static AlexaPreferences getPreferences(AlexaAudioProviderConnection alexaAudioProviderConnection) {
        Preconditions.notNull(alexaAudioProviderConnection, "alexaAudioProviderConnection was null");
        if (alexaAudioProviderConnection.isConnected()) {
            try {
                ExtendedClient client = alexaAudioProviderConnection.getClient();
                AlexaAudioProviderManagerMessageSender alexaAudioProviderManagerMessageSender = (AlexaAudioProviderManagerMessageSender) alexaAudioProviderConnection.get();
                if (alexaAudioProviderManagerMessageSender != null) {
                    return new AlexaPreferences(alexaAudioProviderManagerMessageSender.getPreferenceValues(client));
                }
                Log.e(TAG, "Message Sender is null");
            } catch (RemoteException e) {
                Log.e(TAG, AlexaServicesTools.MESSAGING_ERROR, e);
            }
        } else {
            Log.e(TAG, "Connection object is not connected");
        }
        Log.w(TAG, "Returning default preferences instead of actual preferences");
        return AlexaPreferences.builder().build();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static boolean updatePreferences(AlexaAudioProviderConnection alexaAudioProviderConnection, AlexaPreferences alexaPreferences) {
        Preconditions.notNull(alexaAudioProviderConnection, "alexaAudioProviderConnection was null");
        Preconditions.notNull(alexaPreferences, "preferences was null");
        if (!alexaAudioProviderConnection.isConnected()) {
            Log.e(TAG, "Connection object is not connected");
            return false;
        }
        try {
            ExtendedClient client = alexaAudioProviderConnection.getClient();
            AlexaAudioProviderManagerMessageSender alexaAudioProviderManagerMessageSender = (AlexaAudioProviderManagerMessageSender) alexaAudioProviderConnection.get();
            if (alexaAudioProviderManagerMessageSender == null) {
                Log.e(TAG, "Message Sender is null");
            } else {
                if (alexaAudioProviderManagerMessageSender.updatePreferences(client, alexaPreferences.getBundle())) {
                    return true;
                }
                Log.e(TAG, "Update preferences did not complete successfully");
            }
            return false;
        } catch (RemoteException e) {
            Log.e(TAG, AlexaServicesTools.MESSAGING_ERROR, e);
            return false;
        }
    }
}
