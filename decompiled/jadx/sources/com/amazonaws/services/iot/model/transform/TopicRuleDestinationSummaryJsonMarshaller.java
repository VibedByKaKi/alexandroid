package com.amazonaws.services.iot.model.transform;

import com.amazon.deecomms.smsmessaging.messagingcontroller.MessagingControllerConstant;
import com.amazonaws.services.iot.model.HttpUrlDestinationSummary;
import com.amazonaws.services.iot.model.TopicRuleDestinationSummary;
import com.amazonaws.services.iot.model.VpcDestinationSummary;
import com.amazonaws.util.json.AwsJsonWriter;
import java.util.Date;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
class TopicRuleDestinationSummaryJsonMarshaller {
    private static TopicRuleDestinationSummaryJsonMarshaller instance;

    public static TopicRuleDestinationSummaryJsonMarshaller getInstance() {
        if (instance == null) {
            instance = new TopicRuleDestinationSummaryJsonMarshaller();
        }
        return instance;
    }

    public void marshall(TopicRuleDestinationSummary topicRuleDestinationSummary, AwsJsonWriter awsJsonWriter) throws Exception {
        awsJsonWriter.beginObject();
        if (topicRuleDestinationSummary.getArn() != null) {
            String arn = topicRuleDestinationSummary.getArn();
            awsJsonWriter.name("arn");
            awsJsonWriter.value(arn);
        }
        if (topicRuleDestinationSummary.getStatus() != null) {
            String status = topicRuleDestinationSummary.getStatus();
            awsJsonWriter.name("status");
            awsJsonWriter.value(status);
        }
        if (topicRuleDestinationSummary.getCreatedAt() != null) {
            Date createdAt = topicRuleDestinationSummary.getCreatedAt();
            awsJsonWriter.name("createdAt");
            awsJsonWriter.value(createdAt);
        }
        if (topicRuleDestinationSummary.getLastUpdatedAt() != null) {
            Date lastUpdatedAt = topicRuleDestinationSummary.getLastUpdatedAt();
            awsJsonWriter.name("lastUpdatedAt");
            awsJsonWriter.value(lastUpdatedAt);
        }
        if (topicRuleDestinationSummary.getStatusReason() != null) {
            String statusReason = topicRuleDestinationSummary.getStatusReason();
            awsJsonWriter.name(MessagingControllerConstant.MESSAGING_CONTROLLER_STATUS_REASON_KEY);
            awsJsonWriter.value(statusReason);
        }
        if (topicRuleDestinationSummary.getHttpUrlSummary() != null) {
            HttpUrlDestinationSummary httpUrlSummary = topicRuleDestinationSummary.getHttpUrlSummary();
            awsJsonWriter.name("httpUrlSummary");
            HttpUrlDestinationSummaryJsonMarshaller.getInstance().marshall(httpUrlSummary, awsJsonWriter);
        }
        if (topicRuleDestinationSummary.getVpcDestinationSummary() != null) {
            VpcDestinationSummary vpcDestinationSummary = topicRuleDestinationSummary.getVpcDestinationSummary();
            awsJsonWriter.name("vpcDestinationSummary");
            VpcDestinationSummaryJsonMarshaller.getInstance().marshall(vpcDestinationSummary, awsJsonWriter);
        }
        awsJsonWriter.endObject();
    }
}
