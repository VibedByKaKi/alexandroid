package com.amazonaws.services.kms.model.transform;

import com.amazonaws.AmazonServiceException;
import com.amazonaws.http.JsonErrorResponseHandler;
import com.amazonaws.services.kms.model.CustomKeyStoreHasCMKsException;
import com.amazonaws.transform.JsonErrorUnmarshaller;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class CustomKeyStoreHasCMKsExceptionUnmarshaller extends JsonErrorUnmarshaller {
    public CustomKeyStoreHasCMKsExceptionUnmarshaller() {
        super(CustomKeyStoreHasCMKsException.class);
    }

    @Override // com.amazonaws.transform.JsonErrorUnmarshaller
    public boolean match(JsonErrorResponseHandler.JsonErrorResponse jsonErrorResponse) throws Exception {
        return jsonErrorResponse.getErrorCode().equals("CustomKeyStoreHasCMKsException");
    }

    @Override // com.amazonaws.transform.JsonErrorUnmarshaller, com.amazonaws.transform.Unmarshaller
    public AmazonServiceException unmarshall(JsonErrorResponseHandler.JsonErrorResponse jsonErrorResponse) throws Exception {
        CustomKeyStoreHasCMKsException customKeyStoreHasCMKsException = (CustomKeyStoreHasCMKsException) super.unmarshall(jsonErrorResponse);
        customKeyStoreHasCMKsException.setErrorCode("CustomKeyStoreHasCMKsException");
        return customKeyStoreHasCMKsException;
    }
}
