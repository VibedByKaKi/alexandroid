package com.amazonaws.services.iot.model.transform;

import com.amazonaws.services.iot.model.UpdateDomainConfigurationResult;
import com.amazonaws.transform.JsonUnmarshallerContext;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers;
import com.amazonaws.transform.Unmarshaller;
import com.amazonaws.util.json.AwsJsonReader;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class UpdateDomainConfigurationResultJsonUnmarshaller implements Unmarshaller<UpdateDomainConfigurationResult, JsonUnmarshallerContext> {
    private static UpdateDomainConfigurationResultJsonUnmarshaller instance;

    public static UpdateDomainConfigurationResultJsonUnmarshaller getInstance() {
        if (instance == null) {
            instance = new UpdateDomainConfigurationResultJsonUnmarshaller();
        }
        return instance;
    }

    @Override // com.amazonaws.transform.Unmarshaller
    public UpdateDomainConfigurationResult unmarshall(JsonUnmarshallerContext jsonUnmarshallerContext) throws Exception {
        UpdateDomainConfigurationResult updateDomainConfigurationResult = new UpdateDomainConfigurationResult();
        AwsJsonReader reader = jsonUnmarshallerContext.getReader();
        reader.beginObject();
        while (reader.hasNext()) {
            String nextName = reader.nextName();
            if (nextName.equals("domainConfigurationName")) {
                updateDomainConfigurationResult.setDomainConfigurationName(SimpleTypeJsonUnmarshallers.StringJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else if (nextName.equals("domainConfigurationArn")) {
                updateDomainConfigurationResult.setDomainConfigurationArn(SimpleTypeJsonUnmarshallers.StringJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return updateDomainConfigurationResult;
    }
}
