package com.amazonaws.services.iot.model.transform;

import com.amazonaws.services.iot.model.ConfirmTopicRuleDestinationResult;
import com.amazonaws.transform.JsonUnmarshallerContext;
import com.amazonaws.transform.Unmarshaller;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class ConfirmTopicRuleDestinationResultJsonUnmarshaller implements Unmarshaller<ConfirmTopicRuleDestinationResult, JsonUnmarshallerContext> {
    private static ConfirmTopicRuleDestinationResultJsonUnmarshaller instance;

    public static ConfirmTopicRuleDestinationResultJsonUnmarshaller getInstance() {
        if (instance == null) {
            instance = new ConfirmTopicRuleDestinationResultJsonUnmarshaller();
        }
        return instance;
    }

    @Override // com.amazonaws.transform.Unmarshaller
    public ConfirmTopicRuleDestinationResult unmarshall(JsonUnmarshallerContext jsonUnmarshallerContext) throws Exception {
        return new ConfirmTopicRuleDestinationResult();
    }
}
