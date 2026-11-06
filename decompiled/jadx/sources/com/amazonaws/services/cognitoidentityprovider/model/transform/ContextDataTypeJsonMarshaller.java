package com.amazonaws.services.cognitoidentityprovider.model.transform;

import com.amazonaws.services.cognitoidentityprovider.model.ContextDataType;
import com.amazonaws.services.cognitoidentityprovider.model.HttpHeader;
import com.amazonaws.util.json.AwsJsonWriter;
import java.util.List;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
class ContextDataTypeJsonMarshaller {
    private static ContextDataTypeJsonMarshaller instance;

    public static ContextDataTypeJsonMarshaller getInstance() {
        if (instance == null) {
            instance = new ContextDataTypeJsonMarshaller();
        }
        return instance;
    }

    public void marshall(ContextDataType contextDataType, AwsJsonWriter awsJsonWriter) throws Exception {
        awsJsonWriter.beginObject();
        if (contextDataType.getIpAddress() != null) {
            String ipAddress = contextDataType.getIpAddress();
            awsJsonWriter.name("IpAddress");
            awsJsonWriter.value(ipAddress);
        }
        if (contextDataType.getServerName() != null) {
            String serverName = contextDataType.getServerName();
            awsJsonWriter.name("ServerName");
            awsJsonWriter.value(serverName);
        }
        if (contextDataType.getServerPath() != null) {
            String serverPath = contextDataType.getServerPath();
            awsJsonWriter.name("ServerPath");
            awsJsonWriter.value(serverPath);
        }
        if (contextDataType.getHttpHeaders() != null) {
            List<HttpHeader> httpHeaders = contextDataType.getHttpHeaders();
            awsJsonWriter.name("HttpHeaders");
            awsJsonWriter.beginArray();
            for (HttpHeader httpHeader : httpHeaders) {
                if (httpHeader != null) {
                    HttpHeaderJsonMarshaller.getInstance().marshall(httpHeader, awsJsonWriter);
                }
            }
            awsJsonWriter.endArray();
        }
        if (contextDataType.getEncodedData() != null) {
            String encodedData = contextDataType.getEncodedData();
            awsJsonWriter.name("EncodedData");
            awsJsonWriter.value(encodedData);
        }
        awsJsonWriter.endObject();
    }
}
