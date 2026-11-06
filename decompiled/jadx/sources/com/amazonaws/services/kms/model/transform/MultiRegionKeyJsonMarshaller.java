package com.amazonaws.services.kms.model.transform;

import com.amazonaws.services.kms.model.MultiRegionKey;
import com.amazonaws.util.json.AwsJsonWriter;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
class MultiRegionKeyJsonMarshaller {
    private static MultiRegionKeyJsonMarshaller instance;

    public static MultiRegionKeyJsonMarshaller getInstance() {
        if (instance == null) {
            instance = new MultiRegionKeyJsonMarshaller();
        }
        return instance;
    }

    public void marshall(MultiRegionKey multiRegionKey, AwsJsonWriter awsJsonWriter) throws Exception {
        awsJsonWriter.beginObject();
        if (multiRegionKey.getArn() != null) {
            String arn = multiRegionKey.getArn();
            awsJsonWriter.name("Arn");
            awsJsonWriter.value(arn);
        }
        if (multiRegionKey.getRegion() != null) {
            String region = multiRegionKey.getRegion();
            awsJsonWriter.name("Region");
            awsJsonWriter.value(region);
        }
        awsJsonWriter.endObject();
    }
}
