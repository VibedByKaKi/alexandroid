package com.amazonaws.services.iot.model.transform;

import com.amazonaws.services.iot.model.BucketsAggregationType;
import com.amazonaws.services.iot.model.TermsAggregation;
import com.amazonaws.util.json.AwsJsonWriter;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
class BucketsAggregationTypeJsonMarshaller {
    private static BucketsAggregationTypeJsonMarshaller instance;

    public static BucketsAggregationTypeJsonMarshaller getInstance() {
        if (instance == null) {
            instance = new BucketsAggregationTypeJsonMarshaller();
        }
        return instance;
    }

    public void marshall(BucketsAggregationType bucketsAggregationType, AwsJsonWriter awsJsonWriter) throws Exception {
        awsJsonWriter.beginObject();
        if (bucketsAggregationType.getTermsAggregation() != null) {
            TermsAggregation termsAggregation = bucketsAggregationType.getTermsAggregation();
            awsJsonWriter.name("termsAggregation");
            TermsAggregationJsonMarshaller.getInstance().marshall(termsAggregation, awsJsonWriter);
        }
        awsJsonWriter.endObject();
    }
}
