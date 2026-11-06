package com.amazonaws.transform;

import com.amazonaws.util.json.AwsJsonReader;
import com.amazonaws.util.json.AwsJsonToken;
import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class MapUnmarshaller<V> implements Unmarshaller<Map<String, V>, JsonUnmarshallerContext> {
    private final Unmarshaller<V, JsonUnmarshallerContext> valueUnmarshaller;

    public MapUnmarshaller(Unmarshaller<V, JsonUnmarshallerContext> unmarshaller) {
        this.valueUnmarshaller = unmarshaller;
    }

    @Override // com.amazonaws.transform.Unmarshaller
    public Map<String, V> unmarshall(JsonUnmarshallerContext jsonUnmarshallerContext) throws Exception {
        AwsJsonReader reader = jsonUnmarshallerContext.getReader();
        if (reader.peek() == AwsJsonToken.VALUE_NULL) {
            reader.skipValue();
            return null;
        }
        HashMap hashMap = new HashMap();
        reader.beginObject();
        while (reader.hasNext()) {
            hashMap.put(reader.nextName(), this.valueUnmarshaller.unmarshall(jsonUnmarshallerContext));
        }
        reader.endObject();
        return hashMap;
    }
}
