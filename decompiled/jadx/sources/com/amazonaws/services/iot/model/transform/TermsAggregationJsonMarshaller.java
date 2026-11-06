package com.amazonaws.services.iot.model.transform;

import com.amazonaws.services.iot.model.TermsAggregation;
import com.amazonaws.util.json.AwsJsonWriter;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
class TermsAggregationJsonMarshaller {
    private static TermsAggregationJsonMarshaller instance;

    public static TermsAggregationJsonMarshaller getInstance() {
        if (instance == null) {
            instance = new TermsAggregationJsonMarshaller();
        }
        return instance;
    }

    public void marshall(TermsAggregation termsAggregation, AwsJsonWriter awsJsonWriter) throws Exception {
        awsJsonWriter.beginObject();
        if (termsAggregation.getMaxBuckets() != null) {
            Integer maxBuckets = termsAggregation.getMaxBuckets();
            awsJsonWriter.name("maxBuckets");
            awsJsonWriter.value(maxBuckets);
        }
        awsJsonWriter.endObject();
    }
}
