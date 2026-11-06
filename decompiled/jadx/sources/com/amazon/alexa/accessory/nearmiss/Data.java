package com.amazon.alexa.accessory.nearmiss;

import com.amazon.alexa.accessory.internal.util.JsonObjectSerializable;
import com.amazon.alexa.accessory.internal.util.Preconditions;
import com.amazon.alexa.accessory.io.Source;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.jetbrains.kotlin.konan.util.DependencyDownloader;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes15.dex */
public final class Data implements JsonObjectSerializable {
    private final DataPart dataPart;
    private final Source payload;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class Builder {
        public DataPart dataPart;
        public Source payload;

        public Data build() {
            Preconditions.notNull(this.dataPart, "datapart");
            Preconditions.notNull(this.payload, "payload");
            return new Data(this);
        }

        public Builder dataPart(DataPart dataPart) {
            this.dataPart = dataPart;
            return this;
        }

        public Builder payload(Source source) {
            this.payload = source;
            return this;
        }
    }

    public Data(Builder builder) {
        Preconditions.notNull(builder, "builder");
        this.dataPart = builder.dataPart;
        this.payload = builder.payload;
    }

    public DataPart getDataPart() {
        return this.dataPart;
    }

    public Source getPayload() {
        return this.payload;
    }

    @Override // com.amazon.alexa.accessory.internal.util.JsonObjectSerializable
    public JSONObject toJsonObject() throws JSONException {
        return new JSONObject().put(DependencyDownloader.TMP_SUFFIX, this.dataPart.toJsonObject());
    }

    public String toString() {
        return "Data{dataPart=" + this.dataPart + ", payload=" + this.payload + AbstractJsonLexerKt.END_OBJ;
    }
}
