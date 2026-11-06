package com.amazonaws.services.iot.model.transform;

import com.amazon.alexa.featurefeedbackservice.constants.Constants;
import com.amazonaws.services.iot.model.AssociateTargetsWithJobResult;
import com.amazonaws.transform.JsonUnmarshallerContext;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers;
import com.amazonaws.transform.Unmarshaller;
import com.amazonaws.util.json.AwsJsonReader;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class AssociateTargetsWithJobResultJsonUnmarshaller implements Unmarshaller<AssociateTargetsWithJobResult, JsonUnmarshallerContext> {
    private static AssociateTargetsWithJobResultJsonUnmarshaller instance;

    public static AssociateTargetsWithJobResultJsonUnmarshaller getInstance() {
        if (instance == null) {
            instance = new AssociateTargetsWithJobResultJsonUnmarshaller();
        }
        return instance;
    }

    @Override // com.amazonaws.transform.Unmarshaller
    public AssociateTargetsWithJobResult unmarshall(JsonUnmarshallerContext jsonUnmarshallerContext) throws Exception {
        AssociateTargetsWithJobResult associateTargetsWithJobResult = new AssociateTargetsWithJobResult();
        AwsJsonReader reader = jsonUnmarshallerContext.getReader();
        reader.beginObject();
        while (reader.hasNext()) {
            String nextName = reader.nextName();
            if (nextName.equals("jobArn")) {
                associateTargetsWithJobResult.setJobArn(SimpleTypeJsonUnmarshallers.StringJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else if (nextName.equals(Constants.SubmitFeedbackContentDetails.REQUEST_JOB_ID)) {
                associateTargetsWithJobResult.setJobId(SimpleTypeJsonUnmarshallers.StringJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else if (nextName.equals("description")) {
                associateTargetsWithJobResult.setDescription(SimpleTypeJsonUnmarshallers.StringJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return associateTargetsWithJobResult;
    }
}
