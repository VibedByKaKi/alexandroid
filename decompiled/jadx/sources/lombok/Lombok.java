package lombok;

import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes10.dex */
public class Lombok {
    public static <T> T checkNotNull(T t, String str) {
        if (t != null) {
            return t;
        }
        Single$$ExternalSyntheticBUOutline0.m$1(str);
        return null;
    }

    public static RuntimeException sneakyThrow(Throwable th) {
        if (th != null) {
            return (RuntimeException) sneakyThrow0(th);
        }
        Single$$ExternalSyntheticBUOutline0.m$1("t");
        return null;
    }

    public static <T> T preventNullAnalysis(T t) {
        return t;
    }

    private static <T extends Throwable> T sneakyThrow0(Throwable th) throws Throwable {
        throw th;
    }
}
