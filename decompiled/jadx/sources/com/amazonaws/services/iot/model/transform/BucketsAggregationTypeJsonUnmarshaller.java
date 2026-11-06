package com.amazonaws.services.iot.model.transform;

import com.amazonaws.services.iot.model.BucketsAggregationType;
import com.amazonaws.transform.JsonUnmarshallerContext;
import com.amazonaws.transform.Unmarshaller;
import com.amazonaws.util.json.AwsJsonReader;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
class BucketsAggregationTypeJsonUnmarshaller implements Unmarshaller<BucketsAggregationType, JsonUnmarshallerContext> {
    private static BucketsAggregationTypeJsonUnmarshaller instance;

    public static BucketsAggregationTypeJsonUnmarshaller getInstance() {
        if (instance == null) {
            instance = new BucketsAggregationTypeJsonUnmarshaller();
        }
        return instance;
    }

    @Override // com.amazonaws.transform.Unmarshaller
    public BucketsAggregationType unmarshall(JsonUnmarshallerContext jsonUnmarshallerContext) throws Exception {
        AwsJsonReader reader = jsonUnmarshallerContext.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        BucketsAggregationType bucketsAggregationType = new BucketsAggregationType();
        reader.beginObject();
        while (reader.hasNext()) {
            if (reader.nextName().equals("termsAggregation")) {
                bucketsAggregationType.setTermsAggregation(TermsAggregationJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return bucketsAggregationType;
    }
}
