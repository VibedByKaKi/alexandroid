package org.junit.experimental.results;

import org.hamcrest.BaseMatcher;
import org.hamcrest.Description;
import org.hamcrest.Matcher;
import org.hamcrest.TypeSafeMatcher;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes11.dex */
public class ResultMatchers {
    public static Matcher<PrintableResult> failureCountIs(final int i) {
        return new TypeSafeMatcher<PrintableResult>() { // from class: org.junit.experimental.results.ResultMatchers.1
            @Override // org.hamcrest.SelfDescribing
            public void describeTo(Description description) {
                description.appendText("has " + i + " failures");
            }

            @Override // org.hamcrest.TypeSafeMatcher
            public boolean matchesSafely(PrintableResult printableResult) {
                return printableResult.failureCount() == i;
            }
        };
    }

    public static Matcher<PrintableResult> hasFailureContaining(final String str) {
        return new BaseMatcher<PrintableResult>() { // from class: org.junit.experimental.results.ResultMatchers.3
            @Override // org.hamcrest.SelfDescribing
            public void describeTo(Description description) {
                description.appendText("has failure containing " + str);
            }

            @Override // org.hamcrest.Matcher
            public boolean matches(Object obj) {
                return obj.toString().contains(str);
            }
        };
    }

    public static Matcher<Object> hasSingleFailureContaining(final String str) {
        return new BaseMatcher<Object>() { // from class: org.junit.experimental.results.ResultMatchers.2
            @Override // org.hamcrest.SelfDescribing
            public void describeTo(Description description) {
                description.appendText("has single failure containing " + str);
            }

            @Override // org.hamcrest.Matcher
            public boolean matches(Object obj) {
                return obj.toString().contains(str) && ResultMatchers.failureCountIs(1).matches(obj);
            }
        };
    }

    public static Matcher<PrintableResult> isSuccessful() {
        return failureCountIs(0);
    }
}
