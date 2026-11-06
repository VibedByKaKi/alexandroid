package com.amazonaws.services.iot.model.transform;

import com.amazonaws.services.iot.model.TopicRuleListItem;
import com.amazonaws.util.json.AwsJsonWriter;
import java.util.Date;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
class TopicRuleListItemJsonMarshaller {
    private static TopicRuleListItemJsonMarshaller instance;

    public static TopicRuleListItemJsonMarshaller getInstance() {
        if (instance == null) {
            instance = new TopicRuleListItemJsonMarshaller();
        }
        return instance;
    }

    public void marshall(TopicRuleListItem topicRuleListItem, AwsJsonWriter awsJsonWriter) throws Exception {
        awsJsonWriter.beginObject();
        if (topicRuleListItem.getRuleArn() != null) {
            String ruleArn = topicRuleListItem.getRuleArn();
            awsJsonWriter.name("ruleArn");
            awsJsonWriter.value(ruleArn);
        }
        if (topicRuleListItem.getRuleName() != null) {
            String ruleName = topicRuleListItem.getRuleName();
            awsJsonWriter.name("ruleName");
            awsJsonWriter.value(ruleName);
        }
        if (topicRuleListItem.getTopicPattern() != null) {
            String topicPattern = topicRuleListItem.getTopicPattern();
            awsJsonWriter.name("topicPattern");
            awsJsonWriter.value(topicPattern);
        }
        if (topicRuleListItem.getCreatedAt() != null) {
            Date createdAt = topicRuleListItem.getCreatedAt();
            awsJsonWriter.name("createdAt");
            awsJsonWriter.value(createdAt);
        }
        if (topicRuleListItem.getRuleDisabled() != null) {
            Boolean ruleDisabled = topicRuleListItem.getRuleDisabled();
            awsJsonWriter.name("ruleDisabled");
            awsJsonWriter.value(ruleDisabled.booleanValue());
        }
        awsJsonWriter.endObject();
    }
}
