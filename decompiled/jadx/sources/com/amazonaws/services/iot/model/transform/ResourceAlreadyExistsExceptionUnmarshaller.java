package com.amazonaws.services.iot.model.transform;

import com.amazonaws.AmazonServiceException;
import com.amazonaws.http.JsonErrorResponseHandler;
import com.amazonaws.services.iot.model.ResourceAlreadyExistsException;
import com.amazonaws.transform.JsonErrorUnmarshaller;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class ResourceAlreadyExistsExceptionUnmarshaller extends JsonErrorUnmarshaller {
    public ResourceAlreadyExistsExceptionUnmarshaller() {
        super(ResourceAlreadyExistsException.class);
    }

    @Override // com.amazonaws.transform.JsonErrorUnmarshaller
    public boolean match(JsonErrorResponseHandler.JsonErrorResponse jsonErrorResponse) throws Exception {
        return jsonErrorResponse.getErrorCode().equals("ResourceAlreadyExistsException");
    }

    @Override // com.amazonaws.transform.JsonErrorUnmarshaller, com.amazonaws.transform.Unmarshaller
    public AmazonServiceException unmarshall(JsonErrorResponseHandler.JsonErrorResponse jsonErrorResponse) throws Exception {
        ResourceAlreadyExistsException resourceAlreadyExistsException = (ResourceAlreadyExistsException) super.unmarshall(jsonErrorResponse);
        resourceAlreadyExistsException.setErrorCode("ResourceAlreadyExistsException");
        resourceAlreadyExistsException.setResourceId(String.valueOf(jsonErrorResponse.get("resourceId")));
        resourceAlreadyExistsException.setResourceArn(String.valueOf(jsonErrorResponse.get("resourceArn")));
        return resourceAlreadyExistsException;
    }
}
