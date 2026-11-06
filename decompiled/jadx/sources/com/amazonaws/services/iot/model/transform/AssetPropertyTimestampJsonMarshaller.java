package com.amazonaws.services.iot.model.transform;

import com.amazonaws.services.iot.model.AssetPropertyTimestamp;
import com.amazonaws.util.json.AwsJsonWriter;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
class AssetPropertyTimestampJsonMarshaller {
    private static AssetPropertyTimestampJsonMarshaller instance;

    public static AssetPropertyTimestampJsonMarshaller getInstance() {
        if (instance == null) {
            instance = new AssetPropertyTimestampJsonMarshaller();
        }
        return instance;
    }

    public void marshall(AssetPropertyTimestamp assetPropertyTimestamp, AwsJsonWriter awsJsonWriter) throws Exception {
        awsJsonWriter.beginObject();
        if (assetPropertyTimestamp.getTimeInSeconds() != null) {
            String timeInSeconds = assetPropertyTimestamp.getTimeInSeconds();
            awsJsonWriter.name("timeInSeconds");
            awsJsonWriter.value(timeInSeconds);
        }
        if (assetPropertyTimestamp.getOffsetInNanos() != null) {
            String offsetInNanos = assetPropertyTimestamp.getOffsetInNanos();
            awsJsonWriter.name("offsetInNanos");
            awsJsonWriter.value(offsetInNanos);
        }
        awsJsonWriter.endObject();
    }
}
