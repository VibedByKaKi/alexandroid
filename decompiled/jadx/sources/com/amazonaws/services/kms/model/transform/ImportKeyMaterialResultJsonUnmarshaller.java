package com.amazonaws.services.kms.model.transform;

import com.amazonaws.services.kms.model.ImportKeyMaterialResult;
import com.amazonaws.transform.JsonUnmarshallerContext;
import com.amazonaws.transform.Unmarshaller;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class ImportKeyMaterialResultJsonUnmarshaller implements Unmarshaller<ImportKeyMaterialResult, JsonUnmarshallerContext> {
    private static ImportKeyMaterialResultJsonUnmarshaller instance;

    public static ImportKeyMaterialResultJsonUnmarshaller getInstance() {
        if (instance == null) {
            instance = new ImportKeyMaterialResultJsonUnmarshaller();
        }
        return instance;
    }

    @Override // com.amazonaws.transform.Unmarshaller
    public ImportKeyMaterialResult unmarshall(JsonUnmarshallerContext jsonUnmarshallerContext) throws Exception {
        return new ImportKeyMaterialResult();
    }
}
