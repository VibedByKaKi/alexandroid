package com.amazonaws.services.iot.model.transform;

import com.amazonaws.services.iot.model.TopicRuleDestinationConfiguration;
import com.amazonaws.transform.JsonUnmarshallerContext;
import com.amazonaws.transform.Unmarshaller;
import com.amazonaws.util.json.AwsJsonReader;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
class TopicRuleDestinationConfigurationJsonUnmarshaller implements Unmarshaller<TopicRuleDestinationConfiguration, JsonUnmarshallerContext> {
    private static TopicRuleDestinationConfigurationJsonUnmarshaller instance;

    public static TopicRuleDestinationConfigurationJsonUnmarshaller getInstance() {
        if (instance == null) {
            instance = new TopicRuleDestinationConfigurationJsonUnmarshaller();
        }
        return instance;
    }

    @Override // com.amazonaws.transform.Unmarshaller
    public TopicRuleDestinationConfiguration unmarshall(JsonUnmarshallerContext jsonUnmarshallerContext) throws Exception {
        AwsJsonReader reader = jsonUnmarshallerContext.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        TopicRuleDestinationConfiguration topicRuleDestinationConfiguration = new TopicRuleDestinationConfiguration();
        reader.beginObject();
        while (reader.hasNext()) {
            String nextName = reader.nextName();
            if (nextName.equals("httpUrlConfiguration")) {
                topicRuleDestinationConfiguration.setHttpUrlConfiguration(HttpUrlDestinationConfigurationJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else if (nextName.equals("vpcConfiguration")) {
                topicRuleDestinationConfiguration.setVpcConfiguration(VpcDestinationConfigurationJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return topicRuleDestinationConfiguration;
    }
}
