package com.amazonaws.services.kms.model.transform;

import com.amazonaws.services.kms.model.ScheduleKeyDeletionResult;
import com.amazonaws.transform.JsonUnmarshallerContext;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers;
import com.amazonaws.transform.Unmarshaller;
import com.amazonaws.util.json.AwsJsonReader;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class ScheduleKeyDeletionResultJsonUnmarshaller implements Unmarshaller<ScheduleKeyDeletionResult, JsonUnmarshallerContext> {
    private static ScheduleKeyDeletionResultJsonUnmarshaller instance;

    public static ScheduleKeyDeletionResultJsonUnmarshaller getInstance() {
        if (instance == null) {
            instance = new ScheduleKeyDeletionResultJsonUnmarshaller();
        }
        return instance;
    }

    @Override // com.amazonaws.transform.Unmarshaller
    public ScheduleKeyDeletionResult unmarshall(JsonUnmarshallerContext jsonUnmarshallerContext) throws Exception {
        ScheduleKeyDeletionResult scheduleKeyDeletionResult = new ScheduleKeyDeletionResult();
        AwsJsonReader reader = jsonUnmarshallerContext.getReader();
        reader.beginObject();
        while (reader.hasNext()) {
            String nextName = reader.nextName();
            if (nextName.equals("KeyId")) {
                scheduleKeyDeletionResult.setKeyId(SimpleTypeJsonUnmarshallers.StringJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else if (nextName.equals("DeletionDate")) {
                scheduleKeyDeletionResult.setDeletionDate(SimpleTypeJsonUnmarshallers.DateJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else if (nextName.equals("KeyState")) {
                scheduleKeyDeletionResult.setKeyState(SimpleTypeJsonUnmarshallers.StringJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else if (nextName.equals("PendingWindowInDays")) {
                scheduleKeyDeletionResult.setPendingWindowInDays(SimpleTypeJsonUnmarshallers.IntegerJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return scheduleKeyDeletionResult;
    }
}
