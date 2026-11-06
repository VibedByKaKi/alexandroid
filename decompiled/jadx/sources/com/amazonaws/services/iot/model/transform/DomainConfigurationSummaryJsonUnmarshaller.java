package com.amazonaws.services.iot.model.transform;

import com.amazonaws.services.iot.model.DomainConfigurationSummary;
import com.amazonaws.transform.JsonUnmarshallerContext;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers;
import com.amazonaws.transform.Unmarshaller;
import com.amazonaws.util.json.AwsJsonReader;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
class DomainConfigurationSummaryJsonUnmarshaller implements Unmarshaller<DomainConfigurationSummary, JsonUnmarshallerContext> {
    private static DomainConfigurationSummaryJsonUnmarshaller instance;

    public static DomainConfigurationSummaryJsonUnmarshaller getInstance() {
        if (instance == null) {
            instance = new DomainConfigurationSummaryJsonUnmarshaller();
        }
        return instance;
    }

    @Override // com.amazonaws.transform.Unmarshaller
    public DomainConfigurationSummary unmarshall(JsonUnmarshallerContext jsonUnmarshallerContext) throws Exception {
        AwsJsonReader reader = jsonUnmarshallerContext.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        DomainConfigurationSummary domainConfigurationSummary = new DomainConfigurationSummary();
        reader.beginObject();
        while (reader.hasNext()) {
            String nextName = reader.nextName();
            if (nextName.equals("domainConfigurationName")) {
                domainConfigurationSummary.setDomainConfigurationName(SimpleTypeJsonUnmarshallers.StringJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else if (nextName.equals("domainConfigurationArn")) {
                domainConfigurationSummary.setDomainConfigurationArn(SimpleTypeJsonUnmarshallers.StringJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else if (nextName.equals("serviceType")) {
                domainConfigurationSummary.setServiceType(SimpleTypeJsonUnmarshallers.StringJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return domainConfigurationSummary;
    }
}
