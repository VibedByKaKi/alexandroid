package org.apache.http.impl.client;

import java.io.IOException;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.annotation.Contract;
import org.apache.http.annotation.ThreadingBehavior;
import org.apache.http.client.HttpResponseException;
import org.apache.http.util.EntityUtils;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Contract(threading = ThreadingBehavior.IMMUTABLE)
/* loaded from: classes11.dex */
public class BasicResponseHandler extends AbstractResponseHandler<String> {
    @Override // org.apache.http.impl.client.AbstractResponseHandler, org.apache.http.client.ResponseHandler
    public String handleResponse(HttpResponse httpResponse) throws HttpResponseException, IOException {
        return (String) super.handleResponse(httpResponse);
    }

    @Override // org.apache.http.impl.client.AbstractResponseHandler
    public String handleEntity(HttpEntity httpEntity) throws IOException {
        return EntityUtils.toString(httpEntity);
    }
}
