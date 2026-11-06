package org.hamcrest.core;

import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import java.util.ArrayList;
import java.util.Arrays;
import org.hamcrest.Description;
import org.hamcrest.DiagnosingMatcher;
import org.hamcrest.Factory;
import org.hamcrest.Matcher;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes11.dex */
public class AllOf<T> extends DiagnosingMatcher<T> {
    private final Iterable<Matcher<? super T>> matchers;

    public AllOf(Iterable<Matcher<? super T>> iterable) {
        this.matchers = iterable;
    }

    @Factory
    public static <T> Matcher<T> allOf(Matcher<? super T> matcher, Matcher<? super T> matcher2, Matcher<? super T> matcher3, Matcher<? super T> matcher4, Matcher<? super T> matcher5, Matcher<? super T> matcher6) {
        ArrayList arrayList = new ArrayList(6);
        arrayList.add(matcher);
        arrayList.add(matcher2);
        arrayList.add(matcher3);
        arrayList.add(matcher4);
        arrayList.add(matcher5);
        arrayList.add(matcher6);
        return allOf(arrayList);
    }

    @Override // org.hamcrest.SelfDescribing
    public void describeTo(Description description) {
        description.appendList(MarkdownConstants.LEFT_PARENTHESIS, " and ", MarkdownConstants.RIGHT_PARENTHESIS, this.matchers);
    }

    @Override // org.hamcrest.DiagnosingMatcher
    public boolean matches(Object obj, Description description) {
        for (Matcher<? super T> matcher : this.matchers) {
            if (!matcher.matches(obj)) {
                description.appendDescriptionOf(matcher).appendText(" ");
                matcher.describeMismatch(obj, description);
                return false;
            }
        }
        return true;
    }

    @Factory
    public static <T> Matcher<T> allOf(Matcher<? super T>... matcherArr) {
        return allOf(Arrays.asList(matcherArr));
    }

    @Factory
    public static <T> Matcher<T> allOf(Matcher<? super T> matcher, Matcher<? super T> matcher2) {
        ArrayList arrayList = new ArrayList(2);
        arrayList.add(matcher);
        arrayList.add(matcher2);
        return allOf(arrayList);
    }

    @Factory
    public static <T> Matcher<T> allOf(Matcher<? super T> matcher, Matcher<? super T> matcher2, Matcher<? super T> matcher3) {
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(matcher);
        arrayList.add(matcher2);
        arrayList.add(matcher3);
        return allOf(arrayList);
    }

    @Factory
    public static <T> Matcher<T> allOf(Matcher<? super T> matcher, Matcher<? super T> matcher2, Matcher<? super T> matcher3, Matcher<? super T> matcher4) {
        ArrayList arrayList = new ArrayList(4);
        arrayList.add(matcher);
        arrayList.add(matcher2);
        arrayList.add(matcher3);
        arrayList.add(matcher4);
        return allOf(arrayList);
    }

    @Factory
    public static <T> Matcher<T> allOf(Matcher<? super T> matcher, Matcher<? super T> matcher2, Matcher<? super T> matcher3, Matcher<? super T> matcher4, Matcher<? super T> matcher5) {
        ArrayList arrayList = new ArrayList(5);
        arrayList.add(matcher);
        arrayList.add(matcher2);
        arrayList.add(matcher3);
        arrayList.add(matcher4);
        arrayList.add(matcher5);
        return allOf(arrayList);
    }

    @Factory
    public static <T> Matcher<T> allOf(Iterable<Matcher<? super T>> iterable) {
        return new AllOf(iterable);
    }
}
