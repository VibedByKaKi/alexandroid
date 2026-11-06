package com.amazonaws.transform;

import com.amazonaws.AmazonServiceException;
import com.amazonaws.http.JsonErrorResponseHandler;
import com.amazonaws.util.Classes$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class JsonErrorUnmarshaller extends AbstractErrorUnmarshaller<JsonErrorResponseHandler.JsonErrorResponse> {
    public JsonErrorUnmarshaller() {
    }

    public boolean match(JsonErrorResponseHandler.JsonErrorResponse jsonErrorResponse) throws Exception {
        return true;
    }

    @Override // com.amazonaws.transform.Unmarshaller
    public AmazonServiceException unmarshall(JsonErrorResponseHandler.JsonErrorResponse jsonErrorResponse) throws Exception {
        String message = jsonErrorResponse.getMessage();
        String errorCode = jsonErrorResponse.getErrorCode();
        if ((message == null || message.isEmpty()) && (errorCode == null || errorCode.isEmpty())) {
            Classes$$ExternalSyntheticBUOutline0.m$1("Neither error message nor error code is found in the error response payload.");
            return null;
        }
        AmazonServiceException newException = newException(message);
        newException.setErrorCode(errorCode);
        return newException;
    }

    public JsonErrorUnmarshaller(Class<? extends AmazonServiceException> cls) {
        super(cls);
    }
}
