package org.hamcrest;

import org.hamcrest.Description;
import org.hamcrest.internal.ReflectiveTypeFinder;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes11.dex */
public abstract class TypeSafeDiagnosingMatcher<T> extends BaseMatcher<T> {
    private static final ReflectiveTypeFinder TYPE_FINDER = new ReflectiveTypeFinder("matchesSafely", 2, 0);
    private final Class<?> expectedType;

    public TypeSafeDiagnosingMatcher(ReflectiveTypeFinder reflectiveTypeFinder) {
        this.expectedType = reflectiveTypeFinder.findExpectedType(getClass());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // org.hamcrest.BaseMatcher, org.hamcrest.Matcher
    public final void describeMismatch(Object obj, Description description) {
        if (obj == 0 || !this.expectedType.isInstance(obj)) {
            super.describeMismatch(obj, description);
        } else {
            matchesSafely(obj, description);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // org.hamcrest.Matcher
    public final boolean matches(Object obj) {
        return obj != 0 && this.expectedType.isInstance(obj) && matchesSafely(obj, new Description.NullDescription());
    }

    public abstract boolean matchesSafely(T t, Description description);

    public TypeSafeDiagnosingMatcher(Class<?> cls) {
        this.expectedType = cls;
    }

    public TypeSafeDiagnosingMatcher() {
        this(TYPE_FINDER);
    }
}
