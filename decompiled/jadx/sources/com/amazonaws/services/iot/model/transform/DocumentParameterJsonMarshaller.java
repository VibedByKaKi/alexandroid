package com.amazonaws.services.iot.model.transform;

import com.amazonaws.services.iot.model.DocumentParameter;
import com.amazonaws.util.json.AwsJsonWriter;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
class DocumentParameterJsonMarshaller {
    private static DocumentParameterJsonMarshaller instance;

    public static DocumentParameterJsonMarshaller getInstance() {
        if (instance == null) {
            instance = new DocumentParameterJsonMarshaller();
        }
        return instance;
    }

    public void marshall(DocumentParameter documentParameter, AwsJsonWriter awsJsonWriter) throws Exception {
        awsJsonWriter.beginObject();
        if (documentParameter.getKey() != null) {
            String key = documentParameter.getKey();
            awsJsonWriter.name("key");
            awsJsonWriter.value(key);
        }
        if (documentParameter.getDescription() != null) {
            String description = documentParameter.getDescription();
            awsJsonWriter.name("description");
            awsJsonWriter.value(description);
        }
        if (documentParameter.getRegex() != null) {
            String regex = documentParameter.getRegex();
            awsJsonWriter.name("regex");
            awsJsonWriter.value(regex);
        }
        if (documentParameter.getExample() != null) {
            String example = documentParameter.getExample();
            awsJsonWriter.name("example");
            awsJsonWriter.value(example);
        }
        if (documentParameter.getOptional() != null) {
            Boolean optional = documentParameter.getOptional();
            awsJsonWriter.name("optional");
            awsJsonWriter.value(optional.booleanValue());
        }
        awsJsonWriter.endObject();
    }
}
