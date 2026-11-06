package dagger.internal;

import io.ktor.http.CodecsKt$$ExternalSyntheticBUOutline0;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes9.dex */
public final class Preconditions {
    private Preconditions() {
    }

    public static <T> void checkBuilderRequirement(T t, Class<T> cls) {
        if (t != null) {
            return;
        }
        CodecsKt$$ExternalSyntheticBUOutline0.m$1(cls.getCanonicalName(), " must be set");
    }

    public static <T> T checkNotNull(T t, String str, Object obj) {
        if (t != null) {
            return t;
        }
        if (!str.contains("%s")) {
            Single$$ExternalSyntheticBUOutline0.m$3("errorMessageTemplate has no format specifiers");
            return null;
        }
        if (str.indexOf("%s") == str.lastIndexOf("%s")) {
            Single$$ExternalSyntheticBUOutline0.m$1(str.replace("%s", obj instanceof Class ? ((Class) obj).getCanonicalName() : String.valueOf(obj)));
            return null;
        }
        Single$$ExternalSyntheticBUOutline0.m$3("errorMessageTemplate has more than one format specifier");
        return null;
    }

    public static <T> T checkNotNullFromComponent(T t) {
        if (t != null) {
            return t;
        }
        Single$$ExternalSyntheticBUOutline0.m$1("Cannot return null from a non-@Nullable component method");
        return null;
    }

    public static <T> T checkNotNullFromProvides(T t) {
        if (t != null) {
            return t;
        }
        Single$$ExternalSyntheticBUOutline0.m$1("Cannot return null from a non-@Nullable @Provides method");
        return null;
    }

    public static <T> T checkNotNull(T t, String str) {
        if (t != null) {
            return t;
        }
        Single$$ExternalSyntheticBUOutline0.m$1(str);
        return null;
    }

    public static <T> T checkNotNull(T t) {
        t.getClass();
        return t;
    }
}
