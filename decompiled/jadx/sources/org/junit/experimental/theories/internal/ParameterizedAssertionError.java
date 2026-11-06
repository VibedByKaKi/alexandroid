package org.junit.experimental.theories.internal;

import androidx.room.util.TableInfo$$ExternalSyntheticOutline0;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes11.dex */
public class ParameterizedAssertionError extends AssertionError {
    private static final long serialVersionUID = 1;

    public ParameterizedAssertionError(Throwable th, String str, Object... objArr) {
        super(TableInfo$$ExternalSyntheticOutline0.m$1(str, MarkdownConstants.LEFT_PARENTHESIS, join(", ", objArr), MarkdownConstants.RIGHT_PARENTHESIS));
        initCause(th);
    }

    public static String join(String str, Collection<Object> collection) {
        StringBuilder sb = new StringBuilder();
        Iterator<Object> it2 = collection.iterator();
        while (it2.hasNext()) {
            sb.append(stringValueOf(it2.next()));
            if (it2.hasNext()) {
                sb.append(str);
            }
        }
        return sb.toString();
    }

    private static String stringValueOf(Object obj) {
        try {
            return String.valueOf(obj);
        } catch (Throwable unused) {
            return "[toString failed]";
        }
    }

    public boolean equals(Object obj) {
        return (obj instanceof ParameterizedAssertionError) && toString().equals(obj.toString());
    }

    public int hashCode() {
        return toString().hashCode();
    }

    public static String join(String str, Object... objArr) {
        return join(str, Arrays.asList(objArr));
    }
}
