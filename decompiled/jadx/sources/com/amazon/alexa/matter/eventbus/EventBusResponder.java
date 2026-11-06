package com.amazon.alexa.matter.eventbus;

import androidx.annotation.NonNull;
import com.amazon.alexa.matter.eventbus.schema.ErrorCause;
import com.amazon.alexa.matter.eventbus.schema.ErrorResponseBody;
import com.amazon.alexa.matter.eventbus.schema.ErrorStatusCode;
import com.amazon.alexa.matter.eventbus.schema.RequestHeader;
import com.amazon.alexa.matter.eventbus.schema.Response;
import com.amazon.alexa.matter.eventbus.schema.ResponseBody;
import com.amazon.alexa.matter.eventbus.schema.ResponseHeader;
import com.amazon.alexa.matter.eventbus.schema.SuccessResponseBody;
import com.amazon.alexa.matter.service.request.RequestHandlingException;
import com.amazon.alexa.matter.service.response.Responder;
import javax.inject.Inject;
import javax.inject.Singleton;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Singleton
/* loaded from: classes14.dex */
public class EventBusResponder implements Responder {

    @NonNull
    private final EventBusPublisher mEventBusPublisher;

    @Inject
    public EventBusResponder(@NonNull EventBusPublisher eventBusPublisher) {
        this.mEventBusPublisher = eventBusPublisher;
    }

    private void respond(@NonNull RequestHeader requestHeader, @NonNull RequestHandlingException requestHandlingException) {
        ErrorResponseBody errorResponseBody = new ErrorResponseBody();
        errorResponseBody.setMessage(requestHandlingException.getMessage());
        errorResponseBody.setStatus(requestHandlingException.getStatusCode());
        ErrorCause errorCause = requestHandlingException.getErrorCause();
        if (errorCause != null) {
            errorResponseBody.setCausedBy(errorCause);
        }
        respond(requestHeader, errorResponseBody);
    }

    @Override // com.amazon.alexa.matter.service.response.Responder
    public void respond(@NonNull RequestHeader requestHeader, @NonNull ErrorResponseBody errorResponseBody) {
        ResponseBody responseBody = new ResponseBody();
        responseBody.setError(errorResponseBody);
        respond(requestHeader, responseBody);
    }

    @Override // com.amazon.alexa.matter.service.response.Responder
    public void respond(@NonNull RequestHeader requestHeader, @NonNull Throwable th) {
        if (th instanceof RequestHandlingException) {
            respond(requestHeader, (RequestHandlingException) th);
        } else {
            respond(requestHeader, new RequestHandlingException(ErrorStatusCode.UNKNOWN, th.getMessage(), th));
        }
    }

    @Override // com.amazon.alexa.matter.service.response.Responder
    public void respond(@NonNull RequestHeader requestHeader, @NonNull SuccessResponseBody successResponseBody) {
        ResponseBody responseBody = new ResponseBody();
        responseBody.setSuccess(successResponseBody);
        respond(requestHeader, responseBody);
    }

    private void respond(@NonNull RequestHeader requestHeader, @NonNull ResponseBody responseBody) {
        ResponseHeader responseHeader = new ResponseHeader();
        responseHeader.setRequestID(requestHeader.getRequestID());
        Response response = new Response();
        response.setHeader(responseHeader);
        response.setBody(responseBody);
        this.mEventBusPublisher.publish(response);
    }
}
