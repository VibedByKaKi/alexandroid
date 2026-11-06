package com.amazon.alexa.client.alexaservice.dialog.core;

import androidx.annotation.Nullable;
import com.amazon.alexa.api.AlexaUserSpeechProviderScope;
import com.amazon.alexa.client.alexaservice.core.userspeechprovider.UserSpeechProviderIdentifier;
import com.google.auto.value.AutoValue;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@AutoValue
/* loaded from: classes17.dex */
public abstract class MultiTurnDialogMetadata {
    public static MultiTurnDialogMetadata create(UserSpeechProviderIdentifier userSpeechProviderIdentifier, String str, @Nullable AlexaUserSpeechProviderScope alexaUserSpeechProviderScope) {
        return new AutoValue_MultiTurnDialogMetadata(userSpeechProviderIdentifier, str, alexaUserSpeechProviderScope);
    }

    @Nullable
    public abstract AlexaUserSpeechProviderScope getAlexaUserSpeechProviderScope();

    public abstract String getSoftwareVersion();

    public abstract UserSpeechProviderIdentifier getUserSpeechProviderIdentifier();

    public static MultiTurnDialogMetadata create(UserSpeechProviderIdentifier userSpeechProviderIdentifier, String str) {
        return create(userSpeechProviderIdentifier, str, null);
    }
}
