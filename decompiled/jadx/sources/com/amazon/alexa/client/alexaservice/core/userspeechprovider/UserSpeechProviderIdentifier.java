package com.amazon.alexa.client.alexaservice.core.userspeechprovider;

import com.amazon.alexa.api.AlexaUserSpeechProviderMetadata;
import com.amazon.alexa.api.ExtendedClient;
import com.amazon.alexa.client.core.networking.adapters.StronglyTypedString;
import com.google.auto.value.AutoValue;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@AutoValue
/* loaded from: classes17.dex */
public abstract class UserSpeechProviderIdentifier implements StronglyTypedString {
    private static final String EXTERNAL_PREFIX = "external-speech-provider";
    public static final UserSpeechProviderIdentifier DEFAULT_INTERNAL = create("internal-speech-provider");
    public static final UserSpeechProviderIdentifier SYSTEM_WAKE_WORD_PLACEHOLDER = create("system-wake-word");
    public static final UserSpeechProviderIdentifier DEFAULT_TEXT_INTERNAL = create("internal-text-provider");
    public static final UserSpeechProviderIdentifier DEFAULT_TOUCH_INTERNAL = create("internal-touch-provider");

    private static UserSpeechProviderIdentifier create(String str) {
        return new AutoValue_UserSpeechProviderIdentifier(str);
    }

    public static UserSpeechProviderIdentifier createForExternalProvider(ExtendedClient extendedClient, AlexaUserSpeechProviderMetadata alexaUserSpeechProviderMetadata) {
        return create("external-speech-provider:" + extendedClient.getPackageName() + "-" + alexaUserSpeechProviderMetadata.getProviderScope());
    }
}
