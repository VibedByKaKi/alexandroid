package com.amazonaws.services.iot.model.transform;

import com.amazonaws.services.iot.model.ErrorInfo;
import com.amazonaws.util.json.AwsJsonWriter;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
class ErrorInfoJsonMarshaller {
    private static ErrorInfoJsonMarshaller instance;

    public static ErrorInfoJsonMarshaller getInstance() {
        if (instance == null) {
            instance = new ErrorInfoJsonMarshaller();
        }
        return instance;
    }

    public void marshall(ErrorInfo errorInfo, AwsJsonWriter awsJsonWriter) throws Exception {
        awsJsonWriter.beginObject();
        if (errorInfo.getCode() != null) {
            String code = errorInfo.getCode();
            awsJsonWriter.name("code");
            awsJsonWriter.value(code);
        }
        if (errorInfo.getMessage() != null) {
            String message = errorInfo.getMessage();
            awsJsonWriter.name("message");
            awsJsonWriter.value(message);
        }
        awsJsonWriter.endObject();
    }
}
