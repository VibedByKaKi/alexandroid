package com.amazon.alexa.accessory.nearmiss;

import com.amazon.alexa.accessory.internal.util.JsonObjectSerializable;
import com.amazon.alexa.accessory.internal.util.Preconditions;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes15.dex */
public final class DataPart implements JsonObjectSerializable {
    public static final String AUDIO_TYPE = "AUDIO";
    private final AudioContentType audioContentType;
    private final int id;
    private final String type;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class Builder {
        public AudioContentType audioContentType;
        public int id;
        public String type;

        public Builder audioContentType(AudioContentType audioContentType) {
            this.audioContentType = audioContentType;
            return this;
        }

        public DataPart build() {
            Preconditions.notNull(this.type, "type");
            Preconditions.notNull(this.audioContentType, "audioContentType");
            return new DataPart(this);
        }

        public Builder id(int i) {
            this.id = i;
            return this;
        }

        public Builder type(String str) {
            this.type = str;
            return this;
        }
    }

    public DataPart(Builder builder) {
        Preconditions.notNull(builder, "builder");
        this.type = builder.type;
        this.id = builder.id;
        this.audioContentType = builder.audioContentType;
    }

    public AudioContentType getContentType() {
        return this.audioContentType;
    }

    public int getId() {
        return this.id;
    }

    public String getType() {
        return this.type;
    }

    @Override // com.amazon.alexa.accessory.internal.util.JsonObjectSerializable
    public JSONObject toJsonObject() throws JSONException {
        return new JSONObject().put("type", this.type).put("id", this.id);
    }

    public String toString() {
        return "DataPart{type='" + this.type + "', id=" + this.id + ", audioContentType=" + this.audioContentType + AbstractJsonLexerKt.END_OBJ;
    }
}
