package com.amazonaws.services.iot.model.transform;

import com.amazonaws.services.iot.model.ValidationError;
import com.amazonaws.util.json.AwsJsonWriter;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
class ValidationErrorJsonMarshaller {
    private static ValidationErrorJsonMarshaller instance;

    public static ValidationErrorJsonMarshaller getInstance() {
        if (instance == null) {
            instance = new ValidationErrorJsonMarshaller();
        }
        return instance;
    }

    public void marshall(ValidationError validationError, AwsJsonWriter awsJsonWriter) throws Exception {
        awsJsonWriter.beginObject();
        if (validationError.getErrorMessage() != null) {
            String errorMessage = validationError.getErrorMessage();
            awsJsonWriter.name("errorMessage");
            awsJsonWriter.value(errorMessage);
        }
        awsJsonWriter.endObject();
    }
}
