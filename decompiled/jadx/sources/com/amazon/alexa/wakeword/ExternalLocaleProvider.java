package com.amazon.alexa.wakeword;

import com.amazon.alexa.api.AlexaAudioProviderConnection;
import com.amazon.alexa.wakeword.pryon.LocaleProvider;
import java.util.Locale;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class ExternalLocaleProvider implements LocaleProvider {
    private final AlexaAudioProviderConnection audioProviderConnection;

    public ExternalLocaleProvider(AlexaAudioProviderConnection alexaAudioProviderConnection) {
        this.audioProviderConnection = alexaAudioProviderConnection;
    }

    @Override // com.amazon.alexa.wakeword.pryon.LocaleProvider
    public Locale getLocale() {
        return Locale.US;
    }
}
