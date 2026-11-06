package com.amazonaws.services.iot.model.transform;

import com.amazonaws.services.iot.model.OutgoingCertificate;
import com.amazonaws.util.json.AwsJsonWriter;
import java.util.Date;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
class OutgoingCertificateJsonMarshaller {
    private static OutgoingCertificateJsonMarshaller instance;

    public static OutgoingCertificateJsonMarshaller getInstance() {
        if (instance == null) {
            instance = new OutgoingCertificateJsonMarshaller();
        }
        return instance;
    }

    public void marshall(OutgoingCertificate outgoingCertificate, AwsJsonWriter awsJsonWriter) throws Exception {
        awsJsonWriter.beginObject();
        if (outgoingCertificate.getCertificateArn() != null) {
            String certificateArn = outgoingCertificate.getCertificateArn();
            awsJsonWriter.name("certificateArn");
            awsJsonWriter.value(certificateArn);
        }
        if (outgoingCertificate.getCertificateId() != null) {
            String certificateId = outgoingCertificate.getCertificateId();
            awsJsonWriter.name("certificateId");
            awsJsonWriter.value(certificateId);
        }
        if (outgoingCertificate.getTransferredTo() != null) {
            String transferredTo = outgoingCertificate.getTransferredTo();
            awsJsonWriter.name("transferredTo");
            awsJsonWriter.value(transferredTo);
        }
        if (outgoingCertificate.getTransferDate() != null) {
            Date transferDate = outgoingCertificate.getTransferDate();
            awsJsonWriter.name("transferDate");
            awsJsonWriter.value(transferDate);
        }
        if (outgoingCertificate.getTransferMessage() != null) {
            String transferMessage = outgoingCertificate.getTransferMessage();
            awsJsonWriter.name("transferMessage");
            awsJsonWriter.value(transferMessage);
        }
        if (outgoingCertificate.getCreationDate() != null) {
            Date creationDate = outgoingCertificate.getCreationDate();
            awsJsonWriter.name("creationDate");
            awsJsonWriter.value(creationDate);
        }
        awsJsonWriter.endObject();
    }
}
