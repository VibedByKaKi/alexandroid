package org.hamcrest;

import okio.Buffer$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes11.dex */
public class MatcherAssert {
    public static <T> void assertThat(String str, T t, Matcher<? super T> matcher) {
        if (matcher.matches(t)) {
            return;
        }
        StringDescription stringDescription = new StringDescription();
        stringDescription.appendText(str).appendText("\nExpected: ").appendDescriptionOf(matcher).appendText("\n     but: ");
        matcher.describeMismatch(t, stringDescription);
        throw new AssertionError(stringDescription.toString());
    }

    public static <T> void assertThat(T t, Matcher<? super T> matcher) {
        assertThat("", t, matcher);
    }

    public static void assertThat(String str, boolean z) {
        if (z) {
            return;
        }
        Buffer$$ExternalSyntheticBUOutline0.m((Object) str);
    }
}
