package com.amazon.alexa.client.alexaservice.features.externalmediaplayer.mediacontroller.payload;

import androidx.annotation.Nullable;
import com.amazon.alexa.client.alexaservice.features.externalmediaplayer.payload.ExternalPlayerIdentifier;
import org.apache.commons.text.StringSubstitutor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
final class AutoValue_AlexaMediaPayload extends AlexaMediaPayload {
    private final ExternalPlayerIdentifier playerId;

    public AutoValue_AlexaMediaPayload(@Nullable ExternalPlayerIdentifier externalPlayerIdentifier) {
        this.playerId = externalPlayerIdentifier;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AlexaMediaPayload)) {
            return false;
        }
        AlexaMediaPayload alexaMediaPayload = (AlexaMediaPayload) obj;
        ExternalPlayerIdentifier externalPlayerIdentifier = this.playerId;
        return externalPlayerIdentifier == null ? alexaMediaPayload.getPlayerId() == null : externalPlayerIdentifier.equals(alexaMediaPayload.getPlayerId());
    }

    @Override // com.amazon.alexa.client.alexaservice.features.externalmediaplayer.mediacontroller.payload.AlexaMediaPayload
    @Nullable
    public ExternalPlayerIdentifier getPlayerId() {
        return this.playerId;
    }

    public int hashCode() {
        ExternalPlayerIdentifier externalPlayerIdentifier = this.playerId;
        return (externalPlayerIdentifier == null ? 0 : externalPlayerIdentifier.hashCode()) ^ 1000003;
    }

    public String toString() {
        return "AlexaMediaPayload{playerId=" + this.playerId + StringSubstitutor.DEFAULT_VAR_END;
    }
}
