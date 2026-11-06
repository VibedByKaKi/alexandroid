package org.chromium.net.apihelpers;

import defpackage.a$$ExternalSyntheticOutline0;
import java.nio.charset.Charset;
import java.util.Iterator;
import java.util.Map;
import org.chromium.net.UrlResponseInfo;
import org.chromium.net.apihelpers.ContentTypeParametersParser;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes11.dex */
public abstract class StringCronetCallback extends InMemoryTransformCronetCallback<String> {
    private static final String CONTENT_TYPE_HEADER_NAME = "Content-Type";

    private Charset getCharsetFromHeaders(UrlResponseInfo urlResponseInfo) {
        Iterator<String> it2 = urlResponseInfo.getAllHeaders().get("Content-Type").iterator();
        String str = null;
        while (it2.hasNext()) {
            ContentTypeParametersParser contentTypeParametersParser = new ContentTypeParametersParser(it2.next());
            while (contentTypeParametersParser.hasMore()) {
                try {
                    Map.Entry<String, String> nextParameter = contentTypeParametersParser.getNextParameter();
                    nextParameter.getKey();
                    String value = nextParameter.getValue();
                    if (str != null && !value.equalsIgnoreCase(str)) {
                        Single$$ExternalSyntheticBUOutline0.m$3(a$$ExternalSyntheticOutline0.m("Multiple charsets provided: ", value, " and ", str));
                        return null;
                    }
                    str = value;
                } catch (ContentTypeParametersParser.ContentTypeParametersParserException unused) {
                    continue;
                }
            }
        }
        return str != null ? Charset.forName(str) : Charset.defaultCharset();
    }

    @Override // org.chromium.net.apihelpers.InMemoryTransformCronetCallback
    public String transformBodyBytes(UrlResponseInfo urlResponseInfo, byte[] bArr) {
        return new String(bArr, getCharsetFromHeaders(urlResponseInfo));
    }

    @Override // org.chromium.net.apihelpers.InMemoryTransformCronetCallback
    public StringCronetCallback addCompletionListener(CronetRequestCompletionListener<? super String> cronetRequestCompletionListener) {
        super.addCompletionListener((CronetRequestCompletionListener) cronetRequestCompletionListener);
        return this;
    }
}
