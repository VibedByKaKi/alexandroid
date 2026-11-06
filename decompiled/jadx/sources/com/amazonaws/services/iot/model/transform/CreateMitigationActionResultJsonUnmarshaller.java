package com.amazonaws.services.iot.model.transform;

import com.amazon.alexa.app.notification.actions.NotificationActionConstants;
import com.amazonaws.services.iot.model.CreateMitigationActionResult;
import com.amazonaws.transform.JsonUnmarshallerContext;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers;
import com.amazonaws.transform.Unmarshaller;
import com.amazonaws.util.json.AwsJsonReader;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class CreateMitigationActionResultJsonUnmarshaller implements Unmarshaller<CreateMitigationActionResult, JsonUnmarshallerContext> {
    private static CreateMitigationActionResultJsonUnmarshaller instance;

    public static CreateMitigationActionResultJsonUnmarshaller getInstance() {
        if (instance == null) {
            instance = new CreateMitigationActionResultJsonUnmarshaller();
        }
        return instance;
    }

    @Override // com.amazonaws.transform.Unmarshaller
    public CreateMitigationActionResult unmarshall(JsonUnmarshallerContext jsonUnmarshallerContext) throws Exception {
        CreateMitigationActionResult createMitigationActionResult = new CreateMitigationActionResult();
        AwsJsonReader reader = jsonUnmarshallerContext.getReader();
        reader.beginObject();
        while (reader.hasNext()) {
            String nextName = reader.nextName();
            if (nextName.equals("actionArn")) {
                createMitigationActionResult.setActionArn(SimpleTypeJsonUnmarshallers.StringJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else if (nextName.equals(NotificationActionConstants.ACTION_ID_KEY)) {
                createMitigationActionResult.setActionId(SimpleTypeJsonUnmarshallers.StringJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return createMitigationActionResult;
    }
}
