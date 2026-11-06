package com.amazonaws.services.iot.model.transform;

import com.amazonaws.services.iot.model.GetLoggingOptionsResult;
import com.amazonaws.transform.JsonUnmarshallerContext;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers;
import com.amazonaws.transform.Unmarshaller;
import com.amazonaws.util.json.AwsJsonReader;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class GetLoggingOptionsResultJsonUnmarshaller implements Unmarshaller<GetLoggingOptionsResult, JsonUnmarshallerContext> {
    private static GetLoggingOptionsResultJsonUnmarshaller instance;

    public static GetLoggingOptionsResultJsonUnmarshaller getInstance() {
        if (instance == null) {
            instance = new GetLoggingOptionsResultJsonUnmarshaller();
        }
        return instance;
    }

    @Override // com.amazonaws.transform.Unmarshaller
    public GetLoggingOptionsResult unmarshall(JsonUnmarshallerContext jsonUnmarshallerContext) throws Exception {
        GetLoggingOptionsResult getLoggingOptionsResult = new GetLoggingOptionsResult();
        AwsJsonReader reader = jsonUnmarshallerContext.getReader();
        reader.beginObject();
        while (reader.hasNext()) {
            String nextName = reader.nextName();
            if (nextName.equals("roleArn")) {
                getLoggingOptionsResult.setRoleArn(SimpleTypeJsonUnmarshallers.StringJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else if (nextName.equals("logLevel")) {
                getLoggingOptionsResult.setLogLevel(SimpleTypeJsonUnmarshallers.StringJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return getLoggingOptionsResult;
    }
}
