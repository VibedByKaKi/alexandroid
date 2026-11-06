package com.amazon.alexa.accessory.internal.http;

import com.amazon.alexa.accessory.internal.util.JsonObjectSerializable;
import com.amazon.alexa.accessory.internal.util.Preconditions;
import com.amazon.alexa.accessory.io.Sink;
import java.io.IOException;
import okio.Buffer$$ExternalSyntheticBUOutline0;
import org.json.JSONException;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes15.dex */
public final class JsonHttpBody implements HttpBody {
    private final JsonObjectSerializable jsonSerializable;

    public JsonHttpBody(JsonObjectSerializable jsonObjectSerializable) {
        Preconditions.notNull(jsonObjectSerializable, "jsonSerializable");
        this.jsonSerializable = jsonObjectSerializable;
    }

    @Override // com.amazon.alexa.accessory.internal.http.HttpBody
    public String getContentType() {
        return "application/json; charset=utf-8";
    }

    @Override // com.amazon.alexa.accessory.internal.http.HttpBody
    public void writeTo(Sink sink) throws IOException {
        try {
            byte[] bytes = this.jsonSerializable.toJsonObject().toString().getBytes();
            sink.write(bytes, 0, bytes.length);
        } catch (JSONException e) {
            Buffer$$ExternalSyntheticBUOutline0.m$2(e);
        }
    }
}
