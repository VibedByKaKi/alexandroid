package com.amazonaws.services.iot.model.transform;

import com.amazonaws.services.iot.model.IotSiteWiseAction;
import com.amazonaws.services.iot.model.PutAssetPropertyValueEntry;
import com.amazonaws.util.json.AwsJsonWriter;
import java.util.List;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
class IotSiteWiseActionJsonMarshaller {
    private static IotSiteWiseActionJsonMarshaller instance;

    public static IotSiteWiseActionJsonMarshaller getInstance() {
        if (instance == null) {
            instance = new IotSiteWiseActionJsonMarshaller();
        }
        return instance;
    }

    public void marshall(IotSiteWiseAction iotSiteWiseAction, AwsJsonWriter awsJsonWriter) throws Exception {
        awsJsonWriter.beginObject();
        if (iotSiteWiseAction.getPutAssetPropertyValueEntries() != null) {
            List<PutAssetPropertyValueEntry> putAssetPropertyValueEntries = iotSiteWiseAction.getPutAssetPropertyValueEntries();
            awsJsonWriter.name("putAssetPropertyValueEntries");
            awsJsonWriter.beginArray();
            for (PutAssetPropertyValueEntry putAssetPropertyValueEntry : putAssetPropertyValueEntries) {
                if (putAssetPropertyValueEntry != null) {
                    PutAssetPropertyValueEntryJsonMarshaller.getInstance().marshall(putAssetPropertyValueEntry, awsJsonWriter);
                }
            }
            awsJsonWriter.endArray();
        }
        if (iotSiteWiseAction.getRoleArn() != null) {
            String roleArn = iotSiteWiseAction.getRoleArn();
            awsJsonWriter.name("roleArn");
            awsJsonWriter.value(roleArn);
        }
        awsJsonWriter.endObject();
    }
}
