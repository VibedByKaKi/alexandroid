package com.amazon.alexa.accessory.nearmiss;

import com.amazon.alexa.accessory.internal.util.JsonObjectSerializable;
import com.amazon.alexa.accessory.internal.util.Preconditions;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes15.dex */
public final class Parts implements JsonObjectSerializable {
    private final Audio audio;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class Builder {
        Audio audio;

        public Builder audio(Audio audio) {
            this.audio = audio;
            return this;
        }

        public Parts build() {
            Preconditions.notNull(this.audio, "audio");
            return new Parts(this);
        }
    }

    public Parts(Builder builder) {
        this.audio = builder.audio;
    }

    public Audio getAudio() {
        return this.audio;
    }

    @Override // com.amazon.alexa.accessory.internal.util.JsonObjectSerializable
    public JSONObject toJsonObject() throws JSONException {
        return new JSONObject().put("audio", this.audio.toJsonObject());
    }

    public String toString() {
        return "Parts{audio=" + this.audio + AbstractJsonLexerKt.END_OBJ;
    }
}
