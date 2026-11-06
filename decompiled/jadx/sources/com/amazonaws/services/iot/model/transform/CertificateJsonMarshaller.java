package com.amazonaws.services.iot.model.transform;

import com.amazonaws.services.iot.model.Certificate;
import com.amazonaws.util.json.AwsJsonWriter;
import java.util.Date;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
class CertificateJsonMarshaller {
    private static CertificateJsonMarshaller instance;

    public static CertificateJsonMarshaller getInstance() {
        if (instance == null) {
            instance = new CertificateJsonMarshaller();
        }
        return instance;
    }

    public void marshall(Certificate certificate, AwsJsonWriter awsJsonWriter) throws Exception {
        awsJsonWriter.beginObject();
        if (certificate.getCertificateArn() != null) {
            String certificateArn = certificate.getCertificateArn();
            awsJsonWriter.name("certificateArn");
            awsJsonWriter.value(certificateArn);
        }
        if (certificate.getCertificateId() != null) {
            String certificateId = certificate.getCertificateId();
            awsJsonWriter.name("certificateId");
            awsJsonWriter.value(certificateId);
        }
        if (certificate.getStatus() != null) {
            String status = certificate.getStatus();
            awsJsonWriter.name("status");
            awsJsonWriter.value(status);
        }
        if (certificate.getCertificateMode() != null) {
            String certificateMode = certificate.getCertificateMode();
            awsJsonWriter.name("certificateMode");
            awsJsonWriter.value(certificateMode);
        }
        if (certificate.getCreationDate() != null) {
            Date creationDate = certificate.getCreationDate();
            awsJsonWriter.name("creationDate");
            awsJsonWriter.value(creationDate);
        }
        awsJsonWriter.endObject();
    }
}
