package com.amazonaws.services.iot.model.transform;

import com.amazonaws.services.iot.model.ServerCertificateSummary;
import com.amazonaws.util.json.AwsJsonWriter;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
class ServerCertificateSummaryJsonMarshaller {
    private static ServerCertificateSummaryJsonMarshaller instance;

    public static ServerCertificateSummaryJsonMarshaller getInstance() {
        if (instance == null) {
            instance = new ServerCertificateSummaryJsonMarshaller();
        }
        return instance;
    }

    public void marshall(ServerCertificateSummary serverCertificateSummary, AwsJsonWriter awsJsonWriter) throws Exception {
        awsJsonWriter.beginObject();
        if (serverCertificateSummary.getServerCertificateArn() != null) {
            String serverCertificateArn = serverCertificateSummary.getServerCertificateArn();
            awsJsonWriter.name("serverCertificateArn");
            awsJsonWriter.value(serverCertificateArn);
        }
        if (serverCertificateSummary.getServerCertificateStatus() != null) {
            String serverCertificateStatus = serverCertificateSummary.getServerCertificateStatus();
            awsJsonWriter.name("serverCertificateStatus");
            awsJsonWriter.value(serverCertificateStatus);
        }
        if (serverCertificateSummary.getServerCertificateStatusDetail() != null) {
            String serverCertificateStatusDetail = serverCertificateSummary.getServerCertificateStatusDetail();
            awsJsonWriter.name("serverCertificateStatusDetail");
            awsJsonWriter.value(serverCertificateStatusDetail);
        }
        awsJsonWriter.endObject();
    }
}
