package com.amazonaws.services.s3.internal;

import com.amazonaws.AmazonWebServiceResponse;
import com.amazonaws.http.HttpResponse;
import com.amazonaws.transform.Unmarshaller;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class ResponseHeaderHandlerChain<T> extends S3XmlResponseHandler<T> {
    private final List<HeaderHandler<T>> headerHandlers;

    public ResponseHeaderHandlerChain(Unmarshaller<T, InputStream> unmarshaller, HeaderHandler<T>... headerHandlerArr) {
        super(unmarshaller);
        this.headerHandlers = Arrays.asList(headerHandlerArr);
    }

    @Override // com.amazonaws.services.s3.internal.S3XmlResponseHandler, com.amazonaws.http.HttpResponseHandler
    public AmazonWebServiceResponse<T> handle(HttpResponse httpResponse) throws Exception {
        AmazonWebServiceResponse<T> handle = super.handle(httpResponse);
        T result = handle.getResult();
        if (result != null) {
            Iterator<HeaderHandler<T>> it2 = this.headerHandlers.iterator();
            while (it2.hasNext()) {
                it2.next().handle(result, httpResponse);
            }
        }
        return handle;
    }
}
