package com.amazonaws.services.iot.model.transform;

import com.amazon.deecomms.common.metrics.MetricKeys;
import com.amazonaws.services.iot.model.OpenSearchAction;
import com.amazonaws.util.json.AwsJsonWriter;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
class OpenSearchActionJsonMarshaller {
    private static OpenSearchActionJsonMarshaller instance;

    public static OpenSearchActionJsonMarshaller getInstance() {
        if (instance == null) {
            instance = new OpenSearchActionJsonMarshaller();
        }
        return instance;
    }

    public void marshall(OpenSearchAction openSearchAction, AwsJsonWriter awsJsonWriter) throws Exception {
        awsJsonWriter.beginObject();
        if (openSearchAction.getRoleArn() != null) {
            String roleArn = openSearchAction.getRoleArn();
            awsJsonWriter.name("roleArn");
            awsJsonWriter.value(roleArn);
        }
        if (openSearchAction.getEndpoint() != null) {
            String endpoint = openSearchAction.getEndpoint();
            awsJsonWriter.name(MetricKeys.META_ENDPOINT);
            awsJsonWriter.value(endpoint);
        }
        if (openSearchAction.getIndex() != null) {
            String index = openSearchAction.getIndex();
            awsJsonWriter.name("index");
            awsJsonWriter.value(index);
        }
        if (openSearchAction.getType() != null) {
            String type = openSearchAction.getType();
            awsJsonWriter.name("type");
            awsJsonWriter.value(type);
        }
        if (openSearchAction.getId() != null) {
            String id = openSearchAction.getId();
            awsJsonWriter.name("id");
            awsJsonWriter.value(id);
        }
        awsJsonWriter.endObject();
    }
}
