package com.amazonaws.services.s3.internal;

import com.amazonaws.AmazonWebServiceResponse;
import com.amazonaws.http.HttpResponse;
import com.amazonaws.util.StringUtils;
import java.io.InputStream;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class S3StringResponseHandler extends AbstractS3ResponseHandler<String> {
    private static final int DEFAULT_BYTE_SIZE = 1024;

    @Override // com.amazonaws.http.HttpResponseHandler
    public AmazonWebServiceResponse<String> handle(HttpResponse httpResponse) throws Exception {
        AmazonWebServiceResponse<String> parseResponseMetadata = parseResponseMetadata(httpResponse);
        byte[] bArr = new byte[1024];
        StringBuilder sb = new StringBuilder();
        InputStream content = httpResponse.getContent();
        while (true) {
            int read = content.read(bArr);
            if (read <= 0) {
                parseResponseMetadata.setResult(sb.toString());
                return parseResponseMetadata;
            }
            sb.append(new String(bArr, 0, read, StringUtils.UTF8));
        }
    }
}
