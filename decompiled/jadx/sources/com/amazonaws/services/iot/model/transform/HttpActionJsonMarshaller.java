package com.amazonaws.services.iot.model.transform;

import com.amazonaws.services.iot.model.HttpAction;
import com.amazonaws.services.iot.model.HttpActionHeader;
import com.amazonaws.services.iot.model.HttpAuthorization;
import com.amazonaws.util.json.AwsJsonWriter;
import com.dee.app.data.reactnative.Utils.HttpClientUtils;
import java.util.List;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
class HttpActionJsonMarshaller {
    private static HttpActionJsonMarshaller instance;

    public static HttpActionJsonMarshaller getInstance() {
        if (instance == null) {
            instance = new HttpActionJsonMarshaller();
        }
        return instance;
    }

    public void marshall(HttpAction httpAction, AwsJsonWriter awsJsonWriter) throws Exception {
        awsJsonWriter.beginObject();
        if (httpAction.getUrl() != null) {
            String url = httpAction.getUrl();
            awsJsonWriter.name("url");
            awsJsonWriter.value(url);
        }
        if (httpAction.getConfirmationUrl() != null) {
            String confirmationUrl = httpAction.getConfirmationUrl();
            awsJsonWriter.name("confirmationUrl");
            awsJsonWriter.value(confirmationUrl);
        }
        if (httpAction.getHeaders() != null) {
            List<HttpActionHeader> headers = httpAction.getHeaders();
            awsJsonWriter.name("headers");
            awsJsonWriter.beginArray();
            for (HttpActionHeader httpActionHeader : headers) {
                if (httpActionHeader != null) {
                    HttpActionHeaderJsonMarshaller.getInstance().marshall(httpActionHeader, awsJsonWriter);
                }
            }
            awsJsonWriter.endArray();
        }
        if (httpAction.getAuth() != null) {
            HttpAuthorization auth = httpAction.getAuth();
            awsJsonWriter.name(HttpClientUtils.ElementsRequestKey.AUTH);
            HttpAuthorizationJsonMarshaller.getInstance().marshall(auth, awsJsonWriter);
        }
        awsJsonWriter.endObject();
    }
}
