package com.amazonaws.services.cognitoidentityprovider.model.transform;

import com.amazonaws.services.cognitoidentityprovider.model.CustomEmailLambdaVersionConfigType;
import com.amazonaws.util.json.AwsJsonWriter;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
class CustomEmailLambdaVersionConfigTypeJsonMarshaller {
    private static CustomEmailLambdaVersionConfigTypeJsonMarshaller instance;

    public static CustomEmailLambdaVersionConfigTypeJsonMarshaller getInstance() {
        if (instance == null) {
            instance = new CustomEmailLambdaVersionConfigTypeJsonMarshaller();
        }
        return instance;
    }

    public void marshall(CustomEmailLambdaVersionConfigType customEmailLambdaVersionConfigType, AwsJsonWriter awsJsonWriter) throws Exception {
        awsJsonWriter.beginObject();
        if (customEmailLambdaVersionConfigType.getLambdaVersion() != null) {
            String lambdaVersion = customEmailLambdaVersionConfigType.getLambdaVersion();
            awsJsonWriter.name("LambdaVersion");
            awsJsonWriter.value(lambdaVersion);
        }
        if (customEmailLambdaVersionConfigType.getLambdaArn() != null) {
            String lambdaArn = customEmailLambdaVersionConfigType.getLambdaArn();
            awsJsonWriter.name("LambdaArn");
            awsJsonWriter.value(lambdaArn);
        }
        awsJsonWriter.endObject();
    }
}
