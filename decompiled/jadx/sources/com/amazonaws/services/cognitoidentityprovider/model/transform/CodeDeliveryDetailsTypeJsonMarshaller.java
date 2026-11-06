package com.amazonaws.services.cognitoidentityprovider.model.transform;

import com.amazonaws.services.cognitoidentityprovider.model.CodeDeliveryDetailsType;
import com.amazonaws.util.json.AwsJsonWriter;
import org.apache.http.HttpHeaders;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
class CodeDeliveryDetailsTypeJsonMarshaller {
    private static CodeDeliveryDetailsTypeJsonMarshaller instance;

    public static CodeDeliveryDetailsTypeJsonMarshaller getInstance() {
        if (instance == null) {
            instance = new CodeDeliveryDetailsTypeJsonMarshaller();
        }
        return instance;
    }

    public void marshall(CodeDeliveryDetailsType codeDeliveryDetailsType, AwsJsonWriter awsJsonWriter) throws Exception {
        awsJsonWriter.beginObject();
        if (codeDeliveryDetailsType.getDestination() != null) {
            String destination = codeDeliveryDetailsType.getDestination();
            awsJsonWriter.name(HttpHeaders.DESTINATION);
            awsJsonWriter.value(destination);
        }
        if (codeDeliveryDetailsType.getDeliveryMedium() != null) {
            String deliveryMedium = codeDeliveryDetailsType.getDeliveryMedium();
            awsJsonWriter.name("DeliveryMedium");
            awsJsonWriter.value(deliveryMedium);
        }
        if (codeDeliveryDetailsType.getAttributeName() != null) {
            String attributeName = codeDeliveryDetailsType.getAttributeName();
            awsJsonWriter.name("AttributeName");
            awsJsonWriter.value(attributeName);
        }
        awsJsonWriter.endObject();
    }
}
