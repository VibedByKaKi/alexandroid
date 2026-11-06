package com.amazon.alexa.accessory.nearmiss;

import com.amazon.alexa.accessory.internal.util.JsonObjectSerializable;
import com.amazon.alexa.accessory.internal.util.Preconditions;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes15.dex */
public final class Audio implements JsonObjectSerializable {
    private final Data data;
    private final MetaData metaData;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class Builder {
        public Data data;
        public MetaData metaData;

        public Audio build() {
            Preconditions.notNull(this.data, "data");
            Preconditions.notNull(this.metaData, "metaData");
            return new Audio(this);
        }

        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        public Builder metaData(MetaData metaData) {
            this.metaData = metaData;
            return this;
        }
    }

    public Audio(Builder builder) {
        this.data = builder.data;
        this.metaData = builder.metaData;
    }

    public Data getData() {
        return this.data;
    }

    public MetaData getMetaData() {
        return this.metaData;
    }

    @Override // com.amazon.alexa.accessory.internal.util.JsonObjectSerializable
    public JSONObject toJsonObject() throws JSONException {
        return new JSONObject().put("data", this.data.toJsonObject()).put("metadata", this.metaData.toJsonObject());
    }

    public String toString() {
        return "Audio{data=" + this.data + ", metaData=" + this.metaData + AbstractJsonLexerKt.END_OBJ;
    }
}
