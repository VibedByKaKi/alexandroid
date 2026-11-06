package org.apache.http.impl.entity;

import defpackage.a$$ExternalSyntheticOutline0;
import org.apache.http.Header;
import org.apache.http.HttpException;
import org.apache.http.HttpMessage;
import org.apache.http.HttpVersion;
import org.apache.http.ProtocolException;
import org.apache.http.annotation.Contract;
import org.apache.http.annotation.ThreadingBehavior;
import org.apache.http.entity.ContentLengthStrategy;
import org.apache.http.protocol.HTTP;
import org.apache.http.util.Args;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Contract(threading = ThreadingBehavior.IMMUTABLE)
/* loaded from: classes11.dex */
public class StrictContentLengthStrategy implements ContentLengthStrategy {
    public static final StrictContentLengthStrategy INSTANCE = new StrictContentLengthStrategy();
    private final int implicitLen;

    public StrictContentLengthStrategy(int i) {
        this.implicitLen = i;
    }

    @Override // org.apache.http.entity.ContentLengthStrategy
    public long determineLength(HttpMessage httpMessage) throws HttpException {
        Args.notNull(httpMessage, "HTTP message");
        Header firstHeader = httpMessage.getFirstHeader("Transfer-Encoding");
        if (firstHeader != null) {
            String value = firstHeader.getValue();
            if (!HTTP.CHUNK_CODING.equalsIgnoreCase(value)) {
                if ("identity".equalsIgnoreCase(value)) {
                    return -1L;
                }
                throw new ProtocolException(a$$ExternalSyntheticOutline0.m("Unsupported transfer encoding: ", value));
            }
            if (!httpMessage.getProtocolVersion().lessEquals(HttpVersion.HTTP_1_0)) {
                return -2L;
            }
            throw new ProtocolException("Chunked transfer encoding not allowed for " + httpMessage.getProtocolVersion());
        }
        Header firstHeader2 = httpMessage.getFirstHeader("Content-Length");
        if (firstHeader2 == null) {
            return this.implicitLen;
        }
        String value2 = firstHeader2.getValue();
        try {
            long parseLong = Long.parseLong(value2);
            if (parseLong >= 0) {
                return parseLong;
            }
            throw new ProtocolException("Negative content length: " + value2);
        } catch (NumberFormatException unused) {
            throw new ProtocolException(a$$ExternalSyntheticOutline0.m("Invalid content length: ", value2));
        }
    }

    public StrictContentLengthStrategy() {
        this(-1);
    }
}
