package org.hamcrest.core;

import org.hamcrest.BaseMatcher;
import org.hamcrest.Description;
import org.hamcrest.Factory;
import org.hamcrest.Matcher;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes11.dex */
public class Is<T> extends BaseMatcher<T> {
    private final Matcher<T> matcher;

    public Is(Matcher<T> matcher) {
        this.matcher = matcher;
    }

    @Factory
    public static <T> Matcher<T> is(T t) {
        return is(IsEqual.equalTo(t));
    }

    @Factory
    public static <T> Matcher<T> isA(Class<T> cls) {
        return is(IsInstanceOf.instanceOf(cls));
    }

    @Override // org.hamcrest.BaseMatcher, org.hamcrest.Matcher
    public void describeMismatch(Object obj, Description description) {
        this.matcher.describeMismatch(obj, description);
    }

    @Override // org.hamcrest.SelfDescribing
    public void describeTo(Description description) {
        description.appendText("is ").appendDescriptionOf(this.matcher);
    }

    @Override // org.hamcrest.Matcher
    public boolean matches(Object obj) {
        return this.matcher.matches(obj);
    }

    @Factory
    public static <T> Matcher<T> is(Matcher<T> matcher) {
        return new Is(matcher);
    }

    @Factory
    @Deprecated
    public static <T> Matcher<T> is(Class<T> cls) {
        return is(IsInstanceOf.instanceOf(cls));
    }
}
