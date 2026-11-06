package com.amazonaws.services.s3.internal;

import com.amazonaws.AmazonWebServiceResponse;
import com.amazonaws.http.HttpResponse;
import com.amazonaws.logging.Log;
import com.amazonaws.logging.LogFactory;
import com.amazonaws.transform.Unmarshaller;
import java.io.InputStream;
import java.util.Map;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class S3XmlResponseHandler<T> extends AbstractS3ResponseHandler<T> {
    private static final Log log = LogFactory.getLog("com.amazonaws.request");
    private Map<String, String> responseHeaders;
    private Unmarshaller<T, InputStream> responseUnmarshaller;

    public S3XmlResponseHandler(Unmarshaller<T, InputStream> unmarshaller) {
        this.responseUnmarshaller = unmarshaller;
    }

    public Map<String, String> getResponseHeaders() {
        return this.responseHeaders;
    }

    @Override // com.amazonaws.http.HttpResponseHandler
    public AmazonWebServiceResponse<T> handle(HttpResponse httpResponse) throws Exception {
        AmazonWebServiceResponse<T> parseResponseMetadata = parseResponseMetadata(httpResponse);
        this.responseHeaders = httpResponse.getHeaders();
        if (this.responseUnmarshaller != null) {
            Log log2 = log;
            log2.trace("Beginning to parse service response XML");
            T unmarshall = this.responseUnmarshaller.unmarshall(httpResponse.getContent());
            log2.trace("Done parsing service response XML");
            parseResponseMetadata.setResult(unmarshall);
        }
        return parseResponseMetadata;
    }
}
