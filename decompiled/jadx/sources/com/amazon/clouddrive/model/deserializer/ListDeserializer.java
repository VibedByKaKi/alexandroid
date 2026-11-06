package com.amazon.clouddrive.model.deserializer;

import com.amazon.credentiallocker.CredentialConfig$$ExternalSyntheticOutline0;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.codehaus.jackson.JsonParser;
import org.codehaus.jackson.JsonToken;
import org.json.XML$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class ListDeserializer<T> implements JsonDeserializer<List<T>> {
    private final JsonDeserializer<T> mDeserializer;

    public ListDeserializer(JsonDeserializer<T> jsonDeserializer) {
        this.mDeserializer = jsonDeserializer;
    }

    @Override // com.amazon.clouddrive.model.deserializer.JsonDeserializer
    public List<T> deserialize(JsonParser jsonParser) throws IOException {
        JsonToken currentToken = jsonParser.getCurrentToken();
        if (currentToken == JsonToken.VALUE_NULL) {
            return null;
        }
        if (currentToken != JsonToken.START_ARRAY) {
            XML$$ExternalSyntheticBUOutline0.m(CredentialConfig$$ExternalSyntheticOutline0.m("Expected start of array, got ", currentToken), jsonParser.getTokenLocation());
            return null;
        }
        ArrayList arrayList = new ArrayList();
        while (jsonParser.nextToken() != JsonToken.END_ARRAY) {
            if (jsonParser.isClosed()) {
                XML$$ExternalSyntheticBUOutline0.m("Unexpected end of input", jsonParser.getTokenLocation());
                return null;
            }
            arrayList.add(this.mDeserializer.deserialize(jsonParser));
        }
        return arrayList;
    }
}
