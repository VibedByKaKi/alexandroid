package com.amazonaws.services.iot.model.transform;

import com.amazonaws.services.iot.model.CodeSigning;
import com.amazonaws.services.iot.model.FileLocation;
import com.amazonaws.services.iot.model.OTAUpdateFile;
import com.amazonaws.util.json.AwsJsonWriter;
import java.util.Map;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
class OTAUpdateFileJsonMarshaller {
    private static OTAUpdateFileJsonMarshaller instance;

    public static OTAUpdateFileJsonMarshaller getInstance() {
        if (instance == null) {
            instance = new OTAUpdateFileJsonMarshaller();
        }
        return instance;
    }

    public void marshall(OTAUpdateFile oTAUpdateFile, AwsJsonWriter awsJsonWriter) throws Exception {
        awsJsonWriter.beginObject();
        if (oTAUpdateFile.getFileName() != null) {
            String fileName = oTAUpdateFile.getFileName();
            awsJsonWriter.name("fileName");
            awsJsonWriter.value(fileName);
        }
        if (oTAUpdateFile.getFileType() != null) {
            Integer fileType = oTAUpdateFile.getFileType();
            awsJsonWriter.name("fileType");
            awsJsonWriter.value(fileType);
        }
        if (oTAUpdateFile.getFileVersion() != null) {
            String fileVersion = oTAUpdateFile.getFileVersion();
            awsJsonWriter.name("fileVersion");
            awsJsonWriter.value(fileVersion);
        }
        if (oTAUpdateFile.getFileLocation() != null) {
            FileLocation fileLocation = oTAUpdateFile.getFileLocation();
            awsJsonWriter.name("fileLocation");
            FileLocationJsonMarshaller.getInstance().marshall(fileLocation, awsJsonWriter);
        }
        if (oTAUpdateFile.getCodeSigning() != null) {
            CodeSigning codeSigning = oTAUpdateFile.getCodeSigning();
            awsJsonWriter.name("codeSigning");
            CodeSigningJsonMarshaller.getInstance().marshall(codeSigning, awsJsonWriter);
        }
        if (oTAUpdateFile.getAttributes() != null) {
            Map<String, String> attributes = oTAUpdateFile.getAttributes();
            awsJsonWriter.name("attributes");
            awsJsonWriter.beginObject();
            for (Map.Entry<String, String> entry : attributes.entrySet()) {
                String value = entry.getValue();
                if (value != null) {
                    awsJsonWriter.name(entry.getKey());
                    awsJsonWriter.value(value);
                }
            }
            awsJsonWriter.endObject();
        }
        awsJsonWriter.endObject();
    }
}
