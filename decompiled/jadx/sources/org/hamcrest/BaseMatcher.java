package org.hamcrest;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes11.dex */
public abstract class BaseMatcher<T> implements Matcher<T> {
    @Override // org.hamcrest.Matcher
    public void describeMismatch(Object obj, Description description) {
        description.appendText("was ").appendValue(obj);
    }

    public String toString() {
        return StringDescription.toString(this);
    }

    @Override // org.hamcrest.Matcher
    @Deprecated
    public final void _dont_implement_Matcher___instead_extend_BaseMatcher_() {
    }
}
