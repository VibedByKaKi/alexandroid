package com.amazon.alexa.client.alexaservice.base.application.ipc;

import android.content.Context;
import com.amazon.alexa.api.messages.MessageReceiversManager;
import com.amazon.alexa.utils.security.SignatureVerifier;
import dagger.Module;
import dagger.Provides;
import javax.inject.Singleton;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Module
/* loaded from: classes17.dex */
public class MessengerModule {
    @Provides
    public MessageReceiversManager providesMessageReceiverManager(SignatureVerifier signatureVerifier) {
        return new MessageReceiversManager(signatureVerifier);
    }

    @Provides
    @Singleton
    public SignatureVerifier providesSignatureVerifier(Context context) {
        return new SignatureVerifier(context);
    }
}
