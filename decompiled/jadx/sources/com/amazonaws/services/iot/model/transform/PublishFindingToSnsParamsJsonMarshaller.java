package com.amazonaws.services.iot.model.transform;

import com.amazonaws.services.iot.model.PublishFindingToSnsParams;
import com.amazonaws.util.json.AwsJsonWriter;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
class PublishFindingToSnsParamsJsonMarshaller {
    private static PublishFindingToSnsParamsJsonMarshaller instance;

    public static PublishFindingToSnsParamsJsonMarshaller getInstance() {
        if (instance == null) {
            instance = new PublishFindingToSnsParamsJsonMarshaller();
        }
        return instance;
    }

    public void marshall(PublishFindingToSnsParams publishFindingToSnsParams, AwsJsonWriter awsJsonWriter) throws Exception {
        awsJsonWriter.beginObject();
        if (publishFindingToSnsParams.getTopicArn() != null) {
            String topicArn = publishFindingToSnsParams.getTopicArn();
            awsJsonWriter.name("topicArn");
            awsJsonWriter.value(topicArn);
        }
        awsJsonWriter.endObject();
    }
}
