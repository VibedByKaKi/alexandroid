package org.bouncycastle.x509;

import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import java.util.ArrayList;
import java.util.Collection;
import rx.Single$$ExternalSyntheticBUOutline0;

/* loaded from: classes11.dex */
public class X509CollectionStoreParameters implements X509StoreParameters {
    private Collection collection;

    public X509CollectionStoreParameters(Collection collection) {
        if (collection != null) {
            this.collection = collection;
        } else {
            Single$$ExternalSyntheticBUOutline0.m$1("collection cannot be null");
            throw null;
        }
    }

    public Object clone() {
        return new X509CollectionStoreParameters(this.collection);
    }

    public Collection getCollection() {
        return new ArrayList(this.collection);
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer("X509CollectionStoreParameters: [\n");
        stringBuffer.append("  collection: " + this.collection + "\n");
        stringBuffer.append(MarkdownConstants.RIGHT_BRACKET);
        return stringBuffer.toString();
    }
}
