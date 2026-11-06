package org.hamcrest.core;

import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import org.hamcrest.BaseMatcher;
import org.hamcrest.Description;
import org.hamcrest.Factory;
import org.hamcrest.Matcher;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes11.dex */
public class IsSame<T> extends BaseMatcher<T> {
    private final T object;

    public IsSame(T t) {
        this.object = t;
    }

    @Factory
    public static <T> Matcher<T> sameInstance(T t) {
        return new IsSame(t);
    }

    @Factory
    public static <T> Matcher<T> theInstance(T t) {
        return new IsSame(t);
    }

    @Override // org.hamcrest.SelfDescribing
    public void describeTo(Description description) {
        description.appendText("sameInstance(").appendValue(this.object).appendText(MarkdownConstants.RIGHT_PARENTHESIS);
    }

    @Override // org.hamcrest.Matcher
    public boolean matches(Object obj) {
        return obj == this.object;
    }
}
