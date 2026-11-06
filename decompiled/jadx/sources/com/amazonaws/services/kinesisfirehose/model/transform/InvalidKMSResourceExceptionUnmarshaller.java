package com.amazonaws.services.kinesisfirehose.model.transform;

import com.amazonaws.AmazonServiceException;
import com.amazonaws.http.JsonErrorResponseHandler;
import com.amazonaws.services.kinesisfirehose.model.InvalidKMSResourceException;
import com.amazonaws.transform.JsonErrorUnmarshaller;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class InvalidKMSResourceExceptionUnmarshaller extends JsonErrorUnmarshaller {
    public InvalidKMSResourceExceptionUnmarshaller() {
        super(InvalidKMSResourceException.class);
    }

    @Override // com.amazonaws.transform.JsonErrorUnmarshaller
    public boolean match(JsonErrorResponseHandler.JsonErrorResponse jsonErrorResponse) throws Exception {
        return jsonErrorResponse.getErrorCode().equals("InvalidKMSResourceException");
    }

    @Override // com.amazonaws.transform.JsonErrorUnmarshaller, com.amazonaws.transform.Unmarshaller
    public AmazonServiceException unmarshall(JsonErrorResponseHandler.JsonErrorResponse jsonErrorResponse) throws Exception {
        InvalidKMSResourceException invalidKMSResourceException = (InvalidKMSResourceException) super.unmarshall(jsonErrorResponse);
        invalidKMSResourceException.setErrorCode("InvalidKMSResourceException");
        invalidKMSResourceException.setCode(String.valueOf(jsonErrorResponse.get("code")));
        return invalidKMSResourceException;
    }
}
