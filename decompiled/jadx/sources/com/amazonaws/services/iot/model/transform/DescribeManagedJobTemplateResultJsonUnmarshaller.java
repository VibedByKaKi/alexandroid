package com.amazonaws.services.iot.model.transform;

import com.amazonaws.services.iot.model.DescribeManagedJobTemplateResult;
import com.amazonaws.transform.JsonUnmarshallerContext;
import com.amazonaws.transform.ListUnmarshaller;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers;
import com.amazonaws.transform.Unmarshaller;
import com.amazonaws.util.json.AwsJsonReader;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class DescribeManagedJobTemplateResultJsonUnmarshaller implements Unmarshaller<DescribeManagedJobTemplateResult, JsonUnmarshallerContext> {
    private static DescribeManagedJobTemplateResultJsonUnmarshaller instance;

    public static DescribeManagedJobTemplateResultJsonUnmarshaller getInstance() {
        if (instance == null) {
            instance = new DescribeManagedJobTemplateResultJsonUnmarshaller();
        }
        return instance;
    }

    @Override // com.amazonaws.transform.Unmarshaller
    public DescribeManagedJobTemplateResult unmarshall(JsonUnmarshallerContext jsonUnmarshallerContext) throws Exception {
        DescribeManagedJobTemplateResult describeManagedJobTemplateResult = new DescribeManagedJobTemplateResult();
        AwsJsonReader reader = jsonUnmarshallerContext.getReader();
        reader.beginObject();
        while (reader.hasNext()) {
            String nextName = reader.nextName();
            if (nextName.equals("templateName")) {
                describeManagedJobTemplateResult.setTemplateName(SimpleTypeJsonUnmarshallers.StringJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else if (nextName.equals("templateArn")) {
                describeManagedJobTemplateResult.setTemplateArn(SimpleTypeJsonUnmarshallers.StringJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else if (nextName.equals("description")) {
                describeManagedJobTemplateResult.setDescription(SimpleTypeJsonUnmarshallers.StringJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else if (nextName.equals("templateVersion")) {
                describeManagedJobTemplateResult.setTemplateVersion(SimpleTypeJsonUnmarshallers.StringJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else if (nextName.equals("environments")) {
                describeManagedJobTemplateResult.setEnvironments(new ListUnmarshaller(SimpleTypeJsonUnmarshallers.StringJsonUnmarshaller.getInstance()).unmarshall(jsonUnmarshallerContext));
            } else if (nextName.equals("documentParameters")) {
                describeManagedJobTemplateResult.setDocumentParameters(new ListUnmarshaller(DocumentParameterJsonUnmarshaller.getInstance()).unmarshall(jsonUnmarshallerContext));
            } else if (nextName.equals("document")) {
                describeManagedJobTemplateResult.setDocument(SimpleTypeJsonUnmarshallers.StringJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return describeManagedJobTemplateResult;
    }
}
