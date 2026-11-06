package com.amazonaws.services.kms.model.transform;

import com.amazonaws.services.kms.model.ListResourceTagsResult;
import com.amazonaws.transform.JsonUnmarshallerContext;
import com.amazonaws.transform.ListUnmarshaller;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers;
import com.amazonaws.transform.Unmarshaller;
import com.amazonaws.util.json.AwsJsonReader;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class ListResourceTagsResultJsonUnmarshaller implements Unmarshaller<ListResourceTagsResult, JsonUnmarshallerContext> {
    private static ListResourceTagsResultJsonUnmarshaller instance;

    public static ListResourceTagsResultJsonUnmarshaller getInstance() {
        if (instance == null) {
            instance = new ListResourceTagsResultJsonUnmarshaller();
        }
        return instance;
    }

    @Override // com.amazonaws.transform.Unmarshaller
    public ListResourceTagsResult unmarshall(JsonUnmarshallerContext jsonUnmarshallerContext) throws Exception {
        ListResourceTagsResult listResourceTagsResult = new ListResourceTagsResult();
        AwsJsonReader reader = jsonUnmarshallerContext.getReader();
        reader.beginObject();
        while (reader.hasNext()) {
            String nextName = reader.nextName();
            if (nextName.equals("Tags")) {
                listResourceTagsResult.setTags(new ListUnmarshaller(TagJsonUnmarshaller.getInstance()).unmarshall(jsonUnmarshallerContext));
            } else if (nextName.equals("NextMarker")) {
                listResourceTagsResult.setNextMarker(SimpleTypeJsonUnmarshallers.StringJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else if (nextName.equals("Truncated")) {
                listResourceTagsResult.setTruncated(SimpleTypeJsonUnmarshallers.BooleanJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return listResourceTagsResult;
    }
}
