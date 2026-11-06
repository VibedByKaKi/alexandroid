package com.amazonaws.services.iot.model.transform;

import com.amazonaws.services.iot.model.BillingGroupMetadata;
import com.amazonaws.util.json.AwsJsonWriter;
import java.util.Date;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
class BillingGroupMetadataJsonMarshaller {
    private static BillingGroupMetadataJsonMarshaller instance;

    public static BillingGroupMetadataJsonMarshaller getInstance() {
        if (instance == null) {
            instance = new BillingGroupMetadataJsonMarshaller();
        }
        return instance;
    }

    public void marshall(BillingGroupMetadata billingGroupMetadata, AwsJsonWriter awsJsonWriter) throws Exception {
        awsJsonWriter.beginObject();
        if (billingGroupMetadata.getCreationDate() != null) {
            Date creationDate = billingGroupMetadata.getCreationDate();
            awsJsonWriter.name("creationDate");
            awsJsonWriter.value(creationDate);
        }
        awsJsonWriter.endObject();
    }
}
