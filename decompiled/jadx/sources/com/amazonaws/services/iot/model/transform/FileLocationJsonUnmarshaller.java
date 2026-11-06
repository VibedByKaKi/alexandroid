package com.amazonaws.services.iot.model.transform;

import com.amazonaws.services.iot.model.FileLocation;
import com.amazonaws.transform.JsonUnmarshallerContext;
import com.amazonaws.transform.Unmarshaller;
import com.amazonaws.util.json.AwsJsonReader;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
class FileLocationJsonUnmarshaller implements Unmarshaller<FileLocation, JsonUnmarshallerContext> {
    private static FileLocationJsonUnmarshaller instance;

    public static FileLocationJsonUnmarshaller getInstance() {
        if (instance == null) {
            instance = new FileLocationJsonUnmarshaller();
        }
        return instance;
    }

    @Override // com.amazonaws.transform.Unmarshaller
    public FileLocation unmarshall(JsonUnmarshallerContext jsonUnmarshallerContext) throws Exception {
        AwsJsonReader reader = jsonUnmarshallerContext.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        FileLocation fileLocation = new FileLocation();
        reader.beginObject();
        while (reader.hasNext()) {
            String nextName = reader.nextName();
            if (nextName.equals("stream")) {
                fileLocation.setStream(StreamJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else if (nextName.equals("s3Location")) {
                fileLocation.setS3Location(S3LocationJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return fileLocation;
    }
}
