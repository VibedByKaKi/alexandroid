package com.amazonaws.services.iot.model.transform;

import com.amazonaws.services.iot.model.SigningProfileParameter;
import com.amazonaws.util.json.AwsJsonWriter;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
class SigningProfileParameterJsonMarshaller {
    private static SigningProfileParameterJsonMarshaller instance;

    public static SigningProfileParameterJsonMarshaller getInstance() {
        if (instance == null) {
            instance = new SigningProfileParameterJsonMarshaller();
        }
        return instance;
    }

    public void marshall(SigningProfileParameter signingProfileParameter, AwsJsonWriter awsJsonWriter) throws Exception {
        awsJsonWriter.beginObject();
        if (signingProfileParameter.getCertificateArn() != null) {
            String certificateArn = signingProfileParameter.getCertificateArn();
            awsJsonWriter.name("certificateArn");
            awsJsonWriter.value(certificateArn);
        }
        if (signingProfileParameter.getPlatform() != null) {
            String platform = signingProfileParameter.getPlatform();
            awsJsonWriter.name("platform");
            awsJsonWriter.value(platform);
        }
        if (signingProfileParameter.getCertificatePathOnDevice() != null) {
            String certificatePathOnDevice = signingProfileParameter.getCertificatePathOnDevice();
            awsJsonWriter.name("certificatePathOnDevice");
            awsJsonWriter.value(certificatePathOnDevice);
        }
        awsJsonWriter.endObject();
    }
}
