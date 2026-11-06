package org.apache.commons.lang3;

import java.util.function.IntFunction;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes11.dex */
public final /* synthetic */ class ClassUtils$$ExternalSyntheticLambda8 implements IntFunction {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Class[] f$0;

    public /* synthetic */ ClassUtils$$ExternalSyntheticLambda8(Class[] clsArr, int i) {
        this.$r8$classId = i;
        this.f$0 = clsArr;
    }

    @Override // java.util.function.IntFunction
    public final Object apply(int i) {
        Class lambda$wrappersToPrimitives$0;
        Class lambda$primitivesToWrappers$0;
        int i2 = this.$r8$classId;
        Class[] clsArr = this.f$0;
        switch (i2) {
            case 0:
                lambda$wrappersToPrimitives$0 = ClassUtils.lambda$wrappersToPrimitives$0(clsArr, i);
                return lambda$wrappersToPrimitives$0;
            default:
                lambda$primitivesToWrappers$0 = ClassUtils.lambda$primitivesToWrappers$0(clsArr, i);
                return lambda$primitivesToWrappers$0;
        }
    }
}
