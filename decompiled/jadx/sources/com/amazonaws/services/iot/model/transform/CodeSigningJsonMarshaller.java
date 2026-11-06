package com.amazonaws.services.iot.model.transform;

import com.amazonaws.services.iot.model.CodeSigning;
import com.amazonaws.services.iot.model.CustomCodeSigning;
import com.amazonaws.services.iot.model.StartSigningJobParameter;
import com.amazonaws.util.json.AwsJsonWriter;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
class CodeSigningJsonMarshaller {
    private static CodeSigningJsonMarshaller instance;

    public static CodeSigningJsonMarshaller getInstance() {
        if (instance == null) {
            instance = new CodeSigningJsonMarshaller();
        }
        return instance;
    }

    public void marshall(CodeSigning codeSigning, AwsJsonWriter awsJsonWriter) throws Exception {
        awsJsonWriter.beginObject();
        if (codeSigning.getAwsSignerJobId() != null) {
            String awsSignerJobId = codeSigning.getAwsSignerJobId();
            awsJsonWriter.name("awsSignerJobId");
            awsJsonWriter.value(awsSignerJobId);
        }
        if (codeSigning.getStartSigningJobParameter() != null) {
            StartSigningJobParameter startSigningJobParameter = codeSigning.getStartSigningJobParameter();
            awsJsonWriter.name("startSigningJobParameter");
            StartSigningJobParameterJsonMarshaller.getInstance().marshall(startSigningJobParameter, awsJsonWriter);
        }
        if (codeSigning.getCustomCodeSigning() != null) {
            CustomCodeSigning customCodeSigning = codeSigning.getCustomCodeSigning();
            awsJsonWriter.name("customCodeSigning");
            CustomCodeSigningJsonMarshaller.getInstance().marshall(customCodeSigning, awsJsonWriter);
        }
        awsJsonWriter.endObject();
    }
}
