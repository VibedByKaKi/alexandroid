package com.amazonaws.services.kms.model.transform;

import com.amazonaws.services.kms.model.ListAliasesResult;
import com.amazonaws.transform.JsonUnmarshallerContext;
import com.amazonaws.transform.ListUnmarshaller;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers;
import com.amazonaws.transform.Unmarshaller;
import com.amazonaws.util.json.AwsJsonReader;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class ListAliasesResultJsonUnmarshaller implements Unmarshaller<ListAliasesResult, JsonUnmarshallerContext> {
    private static ListAliasesResultJsonUnmarshaller instance;

    public static ListAliasesResultJsonUnmarshaller getInstance() {
        if (instance == null) {
            instance = new ListAliasesResultJsonUnmarshaller();
        }
        return instance;
    }

    @Override // com.amazonaws.transform.Unmarshaller
    public ListAliasesResult unmarshall(JsonUnmarshallerContext jsonUnmarshallerContext) throws Exception {
        ListAliasesResult listAliasesResult = new ListAliasesResult();
        AwsJsonReader reader = jsonUnmarshallerContext.getReader();
        reader.beginObject();
        while (reader.hasNext()) {
            String nextName = reader.nextName();
            if (nextName.equals("Aliases")) {
                listAliasesResult.setAliases(new ListUnmarshaller(AliasListEntryJsonUnmarshaller.getInstance()).unmarshall(jsonUnmarshallerContext));
            } else if (nextName.equals("NextMarker")) {
                listAliasesResult.setNextMarker(SimpleTypeJsonUnmarshallers.StringJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else if (nextName.equals("Truncated")) {
                listAliasesResult.setTruncated(SimpleTypeJsonUnmarshallers.BooleanJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return listAliasesResult;
    }
}
