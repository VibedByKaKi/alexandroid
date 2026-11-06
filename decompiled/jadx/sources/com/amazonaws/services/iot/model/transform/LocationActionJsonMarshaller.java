package com.amazonaws.services.iot.model.transform;

import com.amazonaws.services.iot.model.LocationAction;
import com.amazonaws.services.iot.model.LocationTimestamp;
import com.amazonaws.util.json.AwsJsonWriter;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
class LocationActionJsonMarshaller {
    private static LocationActionJsonMarshaller instance;

    public static LocationActionJsonMarshaller getInstance() {
        if (instance == null) {
            instance = new LocationActionJsonMarshaller();
        }
        return instance;
    }

    public void marshall(LocationAction locationAction, AwsJsonWriter awsJsonWriter) throws Exception {
        awsJsonWriter.beginObject();
        if (locationAction.getRoleArn() != null) {
            String roleArn = locationAction.getRoleArn();
            awsJsonWriter.name("roleArn");
            awsJsonWriter.value(roleArn);
        }
        if (locationAction.getTrackerName() != null) {
            String trackerName = locationAction.getTrackerName();
            awsJsonWriter.name("trackerName");
            awsJsonWriter.value(trackerName);
        }
        if (locationAction.getDeviceId() != null) {
            String deviceId = locationAction.getDeviceId();
            awsJsonWriter.name("deviceId");
            awsJsonWriter.value(deviceId);
        }
        if (locationAction.getTimestamp() != null) {
            LocationTimestamp timestamp = locationAction.getTimestamp();
            awsJsonWriter.name("timestamp");
            LocationTimestampJsonMarshaller.getInstance().marshall(timestamp, awsJsonWriter);
        }
        if (locationAction.getLatitude() != null) {
            String latitude = locationAction.getLatitude();
            awsJsonWriter.name("latitude");
            awsJsonWriter.value(latitude);
        }
        if (locationAction.getLongitude() != null) {
            String longitude = locationAction.getLongitude();
            awsJsonWriter.name("longitude");
            awsJsonWriter.value(longitude);
        }
        awsJsonWriter.endObject();
    }
}
