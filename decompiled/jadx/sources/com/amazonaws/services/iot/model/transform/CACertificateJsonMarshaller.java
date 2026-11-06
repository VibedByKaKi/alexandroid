package com.amazonaws.services.iot.model.transform;

import com.amazonaws.services.iot.model.CACertificate;
import com.amazonaws.util.json.AwsJsonWriter;
import java.util.Date;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
class CACertificateJsonMarshaller {
    private static CACertificateJsonMarshaller instance;

    public static CACertificateJsonMarshaller getInstance() {
        if (instance == null) {
            instance = new CACertificateJsonMarshaller();
        }
        return instance;
    }

    public void marshall(CACertificate cACertificate, AwsJsonWriter awsJsonWriter) throws Exception {
        awsJsonWriter.beginObject();
        if (cACertificate.getCertificateArn() != null) {
            String certificateArn = cACertificate.getCertificateArn();
            awsJsonWriter.name("certificateArn");
            awsJsonWriter.value(certificateArn);
        }
        if (cACertificate.getCertificateId() != null) {
            String certificateId = cACertificate.getCertificateId();
            awsJsonWriter.name("certificateId");
            awsJsonWriter.value(certificateId);
        }
        if (cACertificate.getStatus() != null) {
            String status = cACertificate.getStatus();
            awsJsonWriter.name("status");
            awsJsonWriter.value(status);
        }
        if (cACertificate.getCreationDate() != null) {
            Date creationDate = cACertificate.getCreationDate();
            awsJsonWriter.name("creationDate");
            awsJsonWriter.value(creationDate);
        }
        awsJsonWriter.endObject();
    }
}
