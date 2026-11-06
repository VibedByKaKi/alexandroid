package com.amazonaws.services.iot.model.transform;

import com.amazon.deecomms.smsmessaging.messagingcontroller.MessagingControllerConstant;
import com.amazonaws.services.iot.model.HttpUrlDestinationProperties;
import com.amazonaws.services.iot.model.TopicRuleDestination;
import com.amazonaws.services.iot.model.VpcDestinationProperties;
import com.amazonaws.util.json.AwsJsonWriter;
import java.util.Date;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
class TopicRuleDestinationJsonMarshaller {
    private static TopicRuleDestinationJsonMarshaller instance;

    public static TopicRuleDestinationJsonMarshaller getInstance() {
        if (instance == null) {
            instance = new TopicRuleDestinationJsonMarshaller();
        }
        return instance;
    }

    public void marshall(TopicRuleDestination topicRuleDestination, AwsJsonWriter awsJsonWriter) throws Exception {
        awsJsonWriter.beginObject();
        if (topicRuleDestination.getArn() != null) {
            String arn = topicRuleDestination.getArn();
            awsJsonWriter.name("arn");
            awsJsonWriter.value(arn);
        }
        if (topicRuleDestination.getStatus() != null) {
            String status = topicRuleDestination.getStatus();
            awsJsonWriter.name("status");
            awsJsonWriter.value(status);
        }
        if (topicRuleDestination.getCreatedAt() != null) {
            Date createdAt = topicRuleDestination.getCreatedAt();
            awsJsonWriter.name("createdAt");
            awsJsonWriter.value(createdAt);
        }
        if (topicRuleDestination.getLastUpdatedAt() != null) {
            Date lastUpdatedAt = topicRuleDestination.getLastUpdatedAt();
            awsJsonWriter.name("lastUpdatedAt");
            awsJsonWriter.value(lastUpdatedAt);
        }
        if (topicRuleDestination.getStatusReason() != null) {
            String statusReason = topicRuleDestination.getStatusReason();
            awsJsonWriter.name(MessagingControllerConstant.MESSAGING_CONTROLLER_STATUS_REASON_KEY);
            awsJsonWriter.value(statusReason);
        }
        if (topicRuleDestination.getHttpUrlProperties() != null) {
            HttpUrlDestinationProperties httpUrlProperties = topicRuleDestination.getHttpUrlProperties();
            awsJsonWriter.name("httpUrlProperties");
            HttpUrlDestinationPropertiesJsonMarshaller.getInstance().marshall(httpUrlProperties, awsJsonWriter);
        }
        if (topicRuleDestination.getVpcProperties() != null) {
            VpcDestinationProperties vpcProperties = topicRuleDestination.getVpcProperties();
            awsJsonWriter.name("vpcProperties");
            VpcDestinationPropertiesJsonMarshaller.getInstance().marshall(vpcProperties, awsJsonWriter);
        }
        awsJsonWriter.endObject();
    }
}
