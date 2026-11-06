package androidx.core.util;

import android.credentials.CreateCredentialException;
import android.credentials.CreateCredentialResponse;
import android.credentials.GetCredentialException;
import android.credentials.GetCredentialResponse;
import androidx.constraintlayout.core.state.Interpolator;
import androidx.constraintlayout.core.state.Transition;
import java.io.IOException;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes13.dex */
public final /* synthetic */ class AtomicFile$$ExternalSyntheticBUOutline0 implements Interpolator {
    public final /* synthetic */ int $r8$classId;

    public /* synthetic */ AtomicFile$$ExternalSyntheticBUOutline0(int i) {
        this.$r8$classId = i;
    }

    public static /* synthetic */ void m(Throwable th, Object obj, String str) {
        throw new IllegalArgumentException(str + obj, th);
    }

    public static /* synthetic */ void m$1(Throwable th, Object obj, String str) {
        throw new IOException(str + obj, th);
    }

    @Override // androidx.constraintlayout.core.state.Interpolator
    public float getInterpolation(float f) {
        float lambda$getInterpolator$1;
        float lambda$getInterpolator$2;
        float lambda$getInterpolator$3;
        float lambda$getInterpolator$4;
        float lambda$getInterpolator$5;
        float lambda$getInterpolator$6;
        float lambda$getInterpolator$7;
        switch (this.$r8$classId) {
            case 1:
                lambda$getInterpolator$1 = Transition.lambda$getInterpolator$1(f);
                return lambda$getInterpolator$1;
            case 2:
                lambda$getInterpolator$2 = Transition.lambda$getInterpolator$2(f);
                return lambda$getInterpolator$2;
            case 3:
                lambda$getInterpolator$3 = Transition.lambda$getInterpolator$3(f);
                return lambda$getInterpolator$3;
            case 4:
                lambda$getInterpolator$4 = Transition.lambda$getInterpolator$4(f);
                return lambda$getInterpolator$4;
            case 5:
                lambda$getInterpolator$5 = Transition.lambda$getInterpolator$5(f);
                return lambda$getInterpolator$5;
            case 6:
                lambda$getInterpolator$6 = Transition.lambda$getInterpolator$6(f);
                return lambda$getInterpolator$6;
            default:
                lambda$getInterpolator$7 = Transition.lambda$getInterpolator$7(f);
                return lambda$getInterpolator$7;
        }
    }

    /* renamed from: m, reason: collision with other method in class */
    public static /* bridge */ /* synthetic */ CreateCredentialResponse m7663m(Object obj) {
        return (CreateCredentialResponse) obj;
    }

    /* renamed from: m, reason: collision with other method in class */
    public static /* bridge */ /* synthetic */ GetCredentialException m7664m(Object obj) {
        return (GetCredentialException) obj;
    }

    /* renamed from: m, reason: collision with other method in class */
    public static /* bridge */ /* synthetic */ GetCredentialResponse m7665m(Object obj) {
        return (GetCredentialResponse) obj;
    }

    /* renamed from: m, reason: collision with other method in class */
    public static /* synthetic */ void m7666m(Object obj) {
        throw new IllegalArgumentException(String.valueOf(obj));
    }

    public static /* synthetic */ void m(String str) {
        throw new SecurityException(str);
    }

    public static /* bridge */ /* synthetic */ CreateCredentialException m(Object obj) {
        return (CreateCredentialException) obj;
    }
}
