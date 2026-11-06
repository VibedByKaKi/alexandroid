package com.amazon.alexa.client.alexaservice.dialog.core;

import androidx.annotation.Nullable;
import com.amazon.alexa.api.AlexaUserSpeechProviderScope;
import com.amazon.alexa.client.alexaservice.core.userspeechprovider.UserSpeechProviderIdentifier;
import org.apache.commons.text.StringSubstitutor;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
final class AutoValue_MultiTurnDialogMetadata extends MultiTurnDialogMetadata {
    private final AlexaUserSpeechProviderScope alexaUserSpeechProviderScope;
    private final String softwareVersion;
    private final UserSpeechProviderIdentifier userSpeechProviderIdentifier;

    public AutoValue_MultiTurnDialogMetadata(UserSpeechProviderIdentifier userSpeechProviderIdentifier, String str, @Nullable AlexaUserSpeechProviderScope alexaUserSpeechProviderScope) {
        if (userSpeechProviderIdentifier == null) {
            Single$$ExternalSyntheticBUOutline0.m$1("Null userSpeechProviderIdentifier");
            throw null;
        }
        this.userSpeechProviderIdentifier = userSpeechProviderIdentifier;
        if (str == null) {
            Single$$ExternalSyntheticBUOutline0.m$1("Null softwareVersion");
            throw null;
        }
        this.softwareVersion = str;
        this.alexaUserSpeechProviderScope = alexaUserSpeechProviderScope;
    }

    public boolean equals(Object obj) {
        AlexaUserSpeechProviderScope alexaUserSpeechProviderScope;
        if (obj == this) {
            return true;
        }
        if (obj instanceof MultiTurnDialogMetadata) {
            MultiTurnDialogMetadata multiTurnDialogMetadata = (MultiTurnDialogMetadata) obj;
            if (this.userSpeechProviderIdentifier.equals(multiTurnDialogMetadata.getUserSpeechProviderIdentifier()) && this.softwareVersion.equals(multiTurnDialogMetadata.getSoftwareVersion()) && ((alexaUserSpeechProviderScope = this.alexaUserSpeechProviderScope) != null ? alexaUserSpeechProviderScope.equals(multiTurnDialogMetadata.getAlexaUserSpeechProviderScope()) : multiTurnDialogMetadata.getAlexaUserSpeechProviderScope() == null)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.amazon.alexa.client.alexaservice.dialog.core.MultiTurnDialogMetadata
    @Nullable
    public AlexaUserSpeechProviderScope getAlexaUserSpeechProviderScope() {
        return this.alexaUserSpeechProviderScope;
    }

    @Override // com.amazon.alexa.client.alexaservice.dialog.core.MultiTurnDialogMetadata
    public String getSoftwareVersion() {
        return this.softwareVersion;
    }

    @Override // com.amazon.alexa.client.alexaservice.dialog.core.MultiTurnDialogMetadata
    public UserSpeechProviderIdentifier getUserSpeechProviderIdentifier() {
        return this.userSpeechProviderIdentifier;
    }

    public int hashCode() {
        int hashCode = (((this.userSpeechProviderIdentifier.hashCode() ^ 1000003) * 1000003) ^ this.softwareVersion.hashCode()) * 1000003;
        AlexaUserSpeechProviderScope alexaUserSpeechProviderScope = this.alexaUserSpeechProviderScope;
        return (alexaUserSpeechProviderScope == null ? 0 : alexaUserSpeechProviderScope.hashCode()) ^ hashCode;
    }

    public String toString() {
        return "MultiTurnDialogMetadata{userSpeechProviderIdentifier=" + this.userSpeechProviderIdentifier + ", softwareVersion=" + this.softwareVersion + ", alexaUserSpeechProviderScope=" + this.alexaUserSpeechProviderScope + StringSubstitutor.DEFAULT_VAR_END;
    }
}
