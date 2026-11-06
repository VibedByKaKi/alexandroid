package com.amazonaws.services.iot.model.transform;

import com.amazonaws.services.iot.model.DescribeAuditFindingResult;
import com.amazonaws.transform.JsonUnmarshallerContext;
import com.amazonaws.transform.Unmarshaller;
import com.amazonaws.util.json.AwsJsonReader;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class DescribeAuditFindingResultJsonUnmarshaller implements Unmarshaller<DescribeAuditFindingResult, JsonUnmarshallerContext> {
    private static DescribeAuditFindingResultJsonUnmarshaller instance;

    public static DescribeAuditFindingResultJsonUnmarshaller getInstance() {
        if (instance == null) {
            instance = new DescribeAuditFindingResultJsonUnmarshaller();
        }
        return instance;
    }

    @Override // com.amazonaws.transform.Unmarshaller
    public DescribeAuditFindingResult unmarshall(JsonUnmarshallerContext jsonUnmarshallerContext) throws Exception {
        DescribeAuditFindingResult describeAuditFindingResult = new DescribeAuditFindingResult();
        AwsJsonReader reader = jsonUnmarshallerContext.getReader();
        reader.beginObject();
        while (reader.hasNext()) {
            if (reader.nextName().equals("finding")) {
                describeAuditFindingResult.setFinding(AuditFindingJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return describeAuditFindingResult;
    }
}
