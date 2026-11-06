package dagger.spi.shaded.androidx.room.compiler.processing.ksp;

import dagger.spi.shaded.androidx.room.compiler.processing.javac.JavacAnnotationBoxKt;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.LinkedHashMap;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes9.dex */
public final /* synthetic */ class KspAnnotationBox$$ExternalSyntheticLambda0 implements InvocationHandler {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;

    public /* synthetic */ KspAnnotationBox$$ExternalSyntheticLambda0(Object obj, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
    }

    @Override // java.lang.reflect.InvocationHandler
    public final Object invoke(Object obj, Method method, Object[] objArr) {
        Object valueProxy$lambda$6;
        Object box$lambda$1;
        int i = this.$r8$classId;
        Object obj2 = this.f$0;
        switch (i) {
            case 0:
                valueProxy$lambda$6 = KspAnnotationBox.valueProxy$lambda$6((KspAnnotationBox) obj2, obj, method, objArr);
                return valueProxy$lambda$6;
            default:
                box$lambda$1 = JavacAnnotationBoxKt.box$lambda$1((LinkedHashMap) obj2, obj, method, objArr);
                return box$lambda$1;
        }
    }
}
