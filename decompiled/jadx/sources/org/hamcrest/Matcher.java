package org.hamcrest;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes11.dex */
public interface Matcher<T> extends SelfDescribing {
    @Deprecated
    void _dont_implement_Matcher___instead_extend_BaseMatcher_();

    void describeMismatch(Object obj, Description description);

    boolean matches(Object obj);
}
