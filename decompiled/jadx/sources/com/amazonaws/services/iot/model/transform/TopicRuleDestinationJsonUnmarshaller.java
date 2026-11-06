package com.amazonaws.services.iot.model.transform;

import com.amazon.deecomms.smsmessaging.messagingcontroller.MessagingControllerConstant;
import com.amazonaws.services.iot.model.TopicRuleDestination;
import com.amazonaws.transform.JsonUnmarshallerContext;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers;
import com.amazonaws.transform.Unmarshaller;
import com.amazonaws.util.json.AwsJsonReader;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
class TopicRuleDestinationJsonUnmarshaller implements Unmarshaller<TopicRuleDestination, JsonUnmarshallerContext> {
    private static TopicRuleDestinationJsonUnmarshaller instance;

    public static TopicRuleDestinationJsonUnmarshaller getInstance() {
        if (instance == null) {
            instance = new TopicRuleDestinationJsonUnmarshaller();
        }
        return instance;
    }

    @Override // com.amazonaws.transform.Unmarshaller
    public TopicRuleDestination unmarshall(JsonUnmarshallerContext jsonUnmarshallerContext) throws Exception {
        AwsJsonReader reader = jsonUnmarshallerContext.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        TopicRuleDestination topicRuleDestination = new TopicRuleDestination();
        reader.beginObject();
        while (reader.hasNext()) {
            String nextName = reader.nextName();
            if (nextName.equals("arn")) {
                topicRuleDestination.setArn(SimpleTypeJsonUnmarshallers.StringJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else if (nextName.equals("status")) {
                topicRuleDestination.setStatus(SimpleTypeJsonUnmarshallers.StringJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else if (nextName.equals("createdAt")) {
                topicRuleDestination.setCreatedAt(SimpleTypeJsonUnmarshallers.DateJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else if (nextName.equals("lastUpdatedAt")) {
                topicRuleDestination.setLastUpdatedAt(SimpleTypeJsonUnmarshallers.DateJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else if (nextName.equals(MessagingControllerConstant.MESSAGING_CONTROLLER_STATUS_REASON_KEY)) {
                topicRuleDestination.setStatusReason(SimpleTypeJsonUnmarshallers.StringJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else if (nextName.equals("httpUrlProperties")) {
                topicRuleDestination.setHttpUrlProperties(HttpUrlDestinationPropertiesJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else if (nextName.equals("vpcProperties")) {
                topicRuleDestination.setVpcProperties(VpcDestinationPropertiesJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return topicRuleDestination;
    }
}
