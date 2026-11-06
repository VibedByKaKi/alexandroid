package com.amazonaws.services.iot.model.transform;

import com.amazonaws.services.iot.model.TransferData;
import com.amazonaws.util.json.AwsJsonWriter;
import java.util.Date;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
class TransferDataJsonMarshaller {
    private static TransferDataJsonMarshaller instance;

    public static TransferDataJsonMarshaller getInstance() {
        if (instance == null) {
            instance = new TransferDataJsonMarshaller();
        }
        return instance;
    }

    public void marshall(TransferData transferData, AwsJsonWriter awsJsonWriter) throws Exception {
        awsJsonWriter.beginObject();
        if (transferData.getTransferMessage() != null) {
            String transferMessage = transferData.getTransferMessage();
            awsJsonWriter.name("transferMessage");
            awsJsonWriter.value(transferMessage);
        }
        if (transferData.getRejectReason() != null) {
            String rejectReason = transferData.getRejectReason();
            awsJsonWriter.name("rejectReason");
            awsJsonWriter.value(rejectReason);
        }
        if (transferData.getTransferDate() != null) {
            Date transferDate = transferData.getTransferDate();
            awsJsonWriter.name("transferDate");
            awsJsonWriter.value(transferDate);
        }
        if (transferData.getAcceptDate() != null) {
            Date acceptDate = transferData.getAcceptDate();
            awsJsonWriter.name("acceptDate");
            awsJsonWriter.value(acceptDate);
        }
        if (transferData.getRejectDate() != null) {
            Date rejectDate = transferData.getRejectDate();
            awsJsonWriter.name("rejectDate");
            awsJsonWriter.value(rejectDate);
        }
        awsJsonWriter.endObject();
    }
}
