package com.amazonaws.services.iot.model.transform;

import com.amazonaws.services.iot.model.HttpUrlDestinationConfiguration;
import com.amazonaws.services.iot.model.TopicRuleDestinationConfiguration;
import com.amazonaws.services.iot.model.VpcDestinationConfiguration;
import com.amazonaws.util.json.AwsJsonWriter;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
class TopicRuleDestinationConfigurationJsonMarshaller {
    private static TopicRuleDestinationConfigurationJsonMarshaller instance;

    public static TopicRuleDestinationConfigurationJsonMarshaller getInstance() {
        if (instance == null) {
            instance = new TopicRuleDestinationConfigurationJsonMarshaller();
        }
        return instance;
    }

    public void marshall(TopicRuleDestinationConfiguration topicRuleDestinationConfiguration, AwsJsonWriter awsJsonWriter) throws Exception {
        awsJsonWriter.beginObject();
        if (topicRuleDestinationConfiguration.getHttpUrlConfiguration() != null) {
            HttpUrlDestinationConfiguration httpUrlConfiguration = topicRuleDestinationConfiguration.getHttpUrlConfiguration();
            awsJsonWriter.name("httpUrlConfiguration");
            HttpUrlDestinationConfigurationJsonMarshaller.getInstance().marshall(httpUrlConfiguration, awsJsonWriter);
        }
        if (topicRuleDestinationConfiguration.getVpcConfiguration() != null) {
            VpcDestinationConfiguration vpcConfiguration = topicRuleDestinationConfiguration.getVpcConfiguration();
            awsJsonWriter.name("vpcConfiguration");
            VpcDestinationConfigurationJsonMarshaller.getInstance().marshall(vpcConfiguration, awsJsonWriter);
        }
        awsJsonWriter.endObject();
    }
}
