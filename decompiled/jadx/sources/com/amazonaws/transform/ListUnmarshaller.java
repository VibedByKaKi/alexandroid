package com.amazonaws.transform;

import com.amazonaws.util.json.AwsJsonReader;
import com.amazonaws.util.json.AwsJsonToken;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class ListUnmarshaller<T> implements Unmarshaller<List<T>, JsonUnmarshallerContext> {
    private final Unmarshaller<T, JsonUnmarshallerContext> itemUnmarshaller;

    public ListUnmarshaller(Unmarshaller<T, JsonUnmarshallerContext> unmarshaller) {
        this.itemUnmarshaller = unmarshaller;
    }

    @Override // com.amazonaws.transform.Unmarshaller
    public List<T> unmarshall(JsonUnmarshallerContext jsonUnmarshallerContext) throws Exception {
        AwsJsonReader reader = jsonUnmarshallerContext.getReader();
        if (reader.peek() == AwsJsonToken.VALUE_NULL) {
            reader.skipValue();
            return null;
        }
        ArrayList arrayList = new ArrayList();
        reader.beginArray();
        while (reader.hasNext()) {
            arrayList.add(this.itemUnmarshaller.unmarshall(jsonUnmarshallerContext));
        }
        reader.endArray();
        return arrayList;
    }
}
