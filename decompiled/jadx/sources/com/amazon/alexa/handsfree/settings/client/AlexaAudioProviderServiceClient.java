package com.amazon.alexa.handsfree.settings.client;

import android.content.Context;
import androidx.annotation.NonNull;
import com.amazon.alexa.handsfree.protocols.utils.Log;
import com.amazon.alexa.handsfree.settings.client.settings.AlexaAudioProviderSetting;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public class AlexaAudioProviderServiceClient {
    private static final String TAG = "AlexaAudioProviderServiceClient";
    private final AlexaAudioServiceConnectionFactory mAlexaAudioServiceConnectionFactory;

    public AlexaAudioProviderServiceClient(@NonNull Context context) {
        this(new AlexaAudioServiceConnectionFactory(context));
    }

    public void applySetting(@NonNull AlexaAudioProviderSetting alexaAudioProviderSetting) {
        AlexaAudioServiceConnection alexaAudioServiceConnection = this.mAlexaAudioServiceConnectionFactory.getAlexaAudioServiceConnection(alexaAudioProviderSetting);
        Log.d(TAG, "Ready to connect service!");
        alexaAudioServiceConnection.connect();
    }

    public AlexaAudioProviderServiceClient(@NonNull AlexaAudioServiceConnectionFactory alexaAudioServiceConnectionFactory) {
        this.mAlexaAudioServiceConnectionFactory = alexaAudioServiceConnectionFactory;
    }
}
