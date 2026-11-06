package com.amazon.whisperjoin.devicesetupserviceandroidclient.util.gson;

import android.util.Base64;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;
import com.google.gson.JsonPrimitive;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import java.lang.reflect.Type;
import java.nio.ByteBuffer;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public final class ByteBufferAdapter implements JsonSerializer<ByteBuffer>, JsonDeserializer<ByteBuffer> {
    @Override // com.google.gson.JsonDeserializer
    public ByteBuffer deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
        return ByteBuffer.wrap(Base64.decode(jsonElement.getAsString(), 0));
    }

    @Override // com.google.gson.JsonSerializer
    public JsonElement serialize(ByteBuffer byteBuffer, Type type, JsonSerializationContext jsonSerializationContext) {
        ByteBuffer asReadOnlyBuffer = byteBuffer.asReadOnlyBuffer();
        asReadOnlyBuffer.position(0);
        int limit = asReadOnlyBuffer.limit();
        byte[] bArr = new byte[limit];
        asReadOnlyBuffer.get(bArr, 0, limit);
        return new JsonPrimitive(Base64.encodeToString(bArr, 2));
    }
}
