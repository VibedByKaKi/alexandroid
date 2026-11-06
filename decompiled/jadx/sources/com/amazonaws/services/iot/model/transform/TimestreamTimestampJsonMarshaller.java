package com.amazonaws.services.iot.model.transform;

import com.amazonaws.services.iot.model.TimestreamTimestamp;
import com.amazonaws.util.json.AwsJsonWriter;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
class TimestreamTimestampJsonMarshaller {
    private static TimestreamTimestampJsonMarshaller instance;

    public static TimestreamTimestampJsonMarshaller getInstance() {
        if (instance == null) {
            instance = new TimestreamTimestampJsonMarshaller();
        }
        return instance;
    }

    public void marshall(TimestreamTimestamp timestreamTimestamp, AwsJsonWriter awsJsonWriter) throws Exception {
        awsJsonWriter.beginObject();
        if (timestreamTimestamp.getValue() != null) {
            String value = timestreamTimestamp.getValue();
            awsJsonWriter.name("value");
            awsJsonWriter.value(value);
        }
        if (timestreamTimestamp.getUnit() != null) {
            String unit = timestreamTimestamp.getUnit();
            awsJsonWriter.name("unit");
            awsJsonWriter.value(unit);
        }
        awsJsonWriter.endObject();
    }
}
