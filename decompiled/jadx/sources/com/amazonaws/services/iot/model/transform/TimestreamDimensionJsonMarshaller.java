package com.amazonaws.services.iot.model.transform;

import com.amazonaws.services.iot.model.TimestreamDimension;
import com.amazonaws.util.json.AwsJsonWriter;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
class TimestreamDimensionJsonMarshaller {
    private static TimestreamDimensionJsonMarshaller instance;

    public static TimestreamDimensionJsonMarshaller getInstance() {
        if (instance == null) {
            instance = new TimestreamDimensionJsonMarshaller();
        }
        return instance;
    }

    public void marshall(TimestreamDimension timestreamDimension, AwsJsonWriter awsJsonWriter) throws Exception {
        awsJsonWriter.beginObject();
        if (timestreamDimension.getName() != null) {
            String name = timestreamDimension.getName();
            awsJsonWriter.name("name");
            awsJsonWriter.value(name);
        }
        if (timestreamDimension.getValue() != null) {
            String value = timestreamDimension.getValue();
            awsJsonWriter.name("value");
            awsJsonWriter.value(value);
        }
        awsJsonWriter.endObject();
    }
}
