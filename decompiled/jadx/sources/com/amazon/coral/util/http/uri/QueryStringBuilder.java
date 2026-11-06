package com.amazon.coral.util.http.uri;

import com.amazon.coral.util.UrlEncoder;
import java.util.Iterator;
import java.util.Map;
import kotlin.text.Typography;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public class QueryStringBuilder {
    private static final UrlEncoder urlEncoder = new UrlEncoder();
    private final char delimiter;
    private boolean isFirst;
    private final StringBuilder sb;

    public QueryStringBuilder(char c) {
        this.sb = new StringBuilder();
        this.isFirst = true;
        this.delimiter = c;
    }

    public void addKey(CharSequence charSequence) {
        addKeyValue(charSequence, null);
    }

    public void addKeyValue(CharSequence charSequence, CharSequence charSequence2) {
        if (this.isFirst) {
            this.isFirst = false;
        } else {
            this.sb.append(this.delimiter);
        }
        this.sb.append(charSequence);
        if (charSequence2 != null) {
            StringBuilder sb = this.sb;
            sb.append('=');
            sb.append(urlEncoder.encode(charSequence2));
        }
    }

    public void addKeyValueMap(Map<? extends CharSequence, ? extends CharSequence> map) {
        for (Map.Entry<? extends CharSequence, ? extends CharSequence> entry : map.entrySet()) {
            addKeyValue(entry.getKey(), entry.getValue());
        }
    }

    public void addKeyValues(CharSequence charSequence, Iterable<? extends CharSequence> iterable) {
        Iterator<? extends CharSequence> it2 = iterable.iterator();
        while (it2.hasNext()) {
            addKeyValue(charSequence, it2.next());
        }
    }

    public void addKeyValuesMap(Map<? extends CharSequence, ? extends Iterable<? extends CharSequence>> map) {
        for (Map.Entry<? extends CharSequence, ? extends Iterable<? extends CharSequence>> entry : map.entrySet()) {
            addKeyValues(entry.getKey(), entry.getValue());
        }
    }

    public CharSequence getQueryString() {
        return this.sb;
    }

    public QueryStringBuilder() {
        this(Typography.amp);
    }
}
