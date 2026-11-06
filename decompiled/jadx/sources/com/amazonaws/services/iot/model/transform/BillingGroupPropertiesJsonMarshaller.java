package com.amazonaws.services.iot.model.transform;

import com.amazonaws.services.iot.model.BillingGroupProperties;
import com.amazonaws.util.json.AwsJsonWriter;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
class BillingGroupPropertiesJsonMarshaller {
    private static BillingGroupPropertiesJsonMarshaller instance;

    public static BillingGroupPropertiesJsonMarshaller getInstance() {
        if (instance == null) {
            instance = new BillingGroupPropertiesJsonMarshaller();
        }
        return instance;
    }

    public void marshall(BillingGroupProperties billingGroupProperties, AwsJsonWriter awsJsonWriter) throws Exception {
        awsJsonWriter.beginObject();
        if (billingGroupProperties.getBillingGroupDescription() != null) {
            String billingGroupDescription = billingGroupProperties.getBillingGroupDescription();
            awsJsonWriter.name("billingGroupDescription");
            awsJsonWriter.value(billingGroupDescription);
        }
        awsJsonWriter.endObject();
    }
}
