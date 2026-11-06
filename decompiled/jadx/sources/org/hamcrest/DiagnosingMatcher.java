package org.hamcrest;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes11.dex */
public abstract class DiagnosingMatcher<T> extends BaseMatcher<T> {
    @Override // org.hamcrest.BaseMatcher, org.hamcrest.Matcher
    public final void describeMismatch(Object obj, Description description) {
        matches(obj, description);
    }

    @Override // org.hamcrest.Matcher
    public final boolean matches(Object obj) {
        return matches(obj, Description.NONE);
    }

    public abstract boolean matches(Object obj, Description description);
}
