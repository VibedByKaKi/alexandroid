package com.amazonaws.services.iot.model.transform;

import com.amazonaws.services.iot.model.Bucket;
import com.amazonaws.util.json.AwsJsonWriter;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
class BucketJsonMarshaller {
    private static BucketJsonMarshaller instance;

    public static BucketJsonMarshaller getInstance() {
        if (instance == null) {
            instance = new BucketJsonMarshaller();
        }
        return instance;
    }

    public void marshall(Bucket bucket, AwsJsonWriter awsJsonWriter) throws Exception {
        awsJsonWriter.beginObject();
        if (bucket.getKeyValue() != null) {
            String keyValue = bucket.getKeyValue();
            awsJsonWriter.name("keyValue");
            awsJsonWriter.value(keyValue);
        }
        if (bucket.getCount() != null) {
            Integer count = bucket.getCount();
            awsJsonWriter.name("count");
            awsJsonWriter.value(count);
        }
        awsJsonWriter.endObject();
    }
}
