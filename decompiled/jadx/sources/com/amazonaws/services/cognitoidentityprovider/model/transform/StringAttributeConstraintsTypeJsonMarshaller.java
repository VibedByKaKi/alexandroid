package com.amazonaws.services.cognitoidentityprovider.model.transform;

import com.amazonaws.services.cognitoidentityprovider.model.StringAttributeConstraintsType;
import com.amazonaws.util.json.AwsJsonWriter;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
class StringAttributeConstraintsTypeJsonMarshaller {
    private static StringAttributeConstraintsTypeJsonMarshaller instance;

    public static StringAttributeConstraintsTypeJsonMarshaller getInstance() {
        if (instance == null) {
            instance = new StringAttributeConstraintsTypeJsonMarshaller();
        }
        return instance;
    }

    public void marshall(StringAttributeConstraintsType stringAttributeConstraintsType, AwsJsonWriter awsJsonWriter) throws Exception {
        awsJsonWriter.beginObject();
        if (stringAttributeConstraintsType.getMinLength() != null) {
            String minLength = stringAttributeConstraintsType.getMinLength();
            awsJsonWriter.name("MinLength");
            awsJsonWriter.value(minLength);
        }
        if (stringAttributeConstraintsType.getMaxLength() != null) {
            String maxLength = stringAttributeConstraintsType.getMaxLength();
            awsJsonWriter.name("MaxLength");
            awsJsonWriter.value(maxLength);
        }
        awsJsonWriter.endObject();
    }
}
