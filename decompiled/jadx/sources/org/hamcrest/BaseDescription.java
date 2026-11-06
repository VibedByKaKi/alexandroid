package org.hamcrest;

import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import java.util.Arrays;
import java.util.Iterator;
import kotlin.text.Typography;
import org.hamcrest.internal.ArrayIterator;
import org.hamcrest.internal.SelfDescribingValueIterator;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes11.dex */
public abstract class BaseDescription implements Description {
    private Description appendList(String str, String str2, String str3, Iterator<? extends SelfDescribing> it2) {
        append(str);
        boolean z = false;
        while (it2.hasNext()) {
            if (z) {
                append(str2);
            }
            appendDescriptionOf(it2.next());
            z = true;
        }
        append(str3);
        return this;
    }

    private <T> Description appendValueList(String str, String str2, String str3, Iterator<T> it2) {
        return appendList(str, str2, str3, new SelfDescribingValueIterator(it2));
    }

    private String descriptionOf(Object obj) {
        try {
            return String.valueOf(obj);
        } catch (Exception unused) {
            return obj.getClass().getName() + "@" + Integer.toHexString(obj.hashCode());
        }
    }

    private void toJavaSyntax(char c) {
        if (c == '\t') {
            append("\\t");
            return;
        }
        if (c == '\n') {
            append("\\n");
            return;
        }
        if (c == '\r') {
            append("\\r");
        } else if (c != '\"') {
            append(c);
        } else {
            append("\\\"");
        }
    }

    public abstract void append(char c);

    public void append(String str) {
        for (int i = 0; i < str.length(); i++) {
            append(str.charAt(i));
        }
    }

    @Override // org.hamcrest.Description
    public Description appendDescriptionOf(SelfDescribing selfDescribing) {
        selfDescribing.describeTo(this);
        return this;
    }

    @Override // org.hamcrest.Description
    public Description appendText(String str) {
        append(str);
        return this;
    }

    @Override // org.hamcrest.Description
    public Description appendValue(Object obj) {
        if (obj == null) {
            append("null");
            return this;
        }
        if (obj instanceof String) {
            toJavaSyntax((String) obj);
            return this;
        }
        if (obj instanceof Character) {
            append('\"');
            toJavaSyntax(((Character) obj).charValue());
            append('\"');
            return this;
        }
        if (obj instanceof Short) {
            append(Typography.less);
            append(descriptionOf(obj));
            append("s>");
            return this;
        }
        if (obj instanceof Long) {
            append(Typography.less);
            append(descriptionOf(obj));
            append("L>");
            return this;
        }
        if (obj instanceof Float) {
            append(Typography.less);
            append(descriptionOf(obj));
            append("F>");
            return this;
        }
        if (obj.getClass().isArray()) {
            appendValueList(MarkdownConstants.LEFT_BRACKET, ", ", MarkdownConstants.RIGHT_BRACKET, new ArrayIterator(obj));
            return this;
        }
        append(Typography.less);
        append(descriptionOf(obj));
        append(Typography.greater);
        return this;
    }

    @Override // org.hamcrest.Description
    public <T> Description appendValueList(String str, String str2, String str3, Iterable<T> iterable) {
        return appendValueList(str, str2, str3, iterable.iterator());
    }

    @Override // org.hamcrest.Description
    public <T> Description appendValueList(String str, String str2, String str3, T... tArr) {
        return appendValueList(str, str2, str3, Arrays.asList(tArr));
    }

    @Override // org.hamcrest.Description
    public Description appendList(String str, String str2, String str3, Iterable<? extends SelfDescribing> iterable) {
        return appendList(str, str2, str3, iterable.iterator());
    }

    private void toJavaSyntax(String str) {
        append('\"');
        for (int i = 0; i < str.length(); i++) {
            toJavaSyntax(str.charAt(i));
        }
        append('\"');
    }
}
