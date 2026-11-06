package com.amazon.alexa.client.alexaservice.dialog.core;

import com.amazon.alexa.api.AlexaDialogExtras;
import com.amazon.alexa.api.DialogExtras;
import com.amazon.alexa.client.alexaservice.audio.audioprovider.AudioProviderIdentifier;
import java.util.HashMap;
import java.util.Map;
import javax.inject.Inject;
import javax.inject.Singleton;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Singleton
/* loaded from: classes17.dex */
public class DialogExtrasAuthority {
    private final Map<AudioProviderIdentifier, AlexaDialogExtras> dialogExtrasMap = new HashMap();

    @Inject
    public DialogExtrasAuthority() {
    }

    public synchronized AlexaDialogExtras get(AudioProviderIdentifier audioProviderIdentifier) {
        AlexaDialogExtras alexaDialogExtras;
        alexaDialogExtras = this.dialogExtrasMap.get(audioProviderIdentifier);
        if (alexaDialogExtras == null) {
            alexaDialogExtras = DialogExtras.DEFAULT;
        }
        return alexaDialogExtras;
    }

    public synchronized void put(AudioProviderIdentifier audioProviderIdentifier, AlexaDialogExtras alexaDialogExtras) {
        this.dialogExtrasMap.put(audioProviderIdentifier, alexaDialogExtras);
    }

    public synchronized void remove(AudioProviderIdentifier audioProviderIdentifier) {
        this.dialogExtrasMap.remove(audioProviderIdentifier);
    }
}
