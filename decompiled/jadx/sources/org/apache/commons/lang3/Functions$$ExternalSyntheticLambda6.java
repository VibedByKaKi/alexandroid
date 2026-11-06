package org.apache.commons.lang3;

import java.util.function.IntFunction;
import org.apache.commons.lang3.Functions;
import org.apache.commons.lang3.function.FailableRunnable;
import org.apache.commons.text.AlphabetConverter;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes11.dex */
public final /* synthetic */ class Functions$$ExternalSyntheticLambda6 implements IntFunction {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;

    public /* synthetic */ Functions$$ExternalSyntheticLambda6(Object obj, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
    }

    @Override // java.util.function.IntFunction
    public final Object apply(int i) {
        FailableRunnable lambda$tryWithResources$0;
        Float lambda$toObject$4;
        Character lambda$toObject$2;
        Integer lambda$toObject$5;
        Boolean lambda$toObject$0;
        Double lambda$toObject$3;
        Long lambda$toObject$6;
        Short lambda$toObject$7;
        Byte lambda$toObject$1;
        Class lambda$toClass$0;
        Integer lambda$convertCharsToIntegers$0;
        int i2 = this.$r8$classId;
        Object obj = this.f$0;
        switch (i2) {
            case 0:
                lambda$tryWithResources$0 = Functions.lambda$tryWithResources$0((Functions.FailableRunnable[]) obj, i);
                return lambda$tryWithResources$0;
            case 1:
                lambda$toObject$4 = ArrayUtils.lambda$toObject$4((float[]) obj, i);
                return lambda$toObject$4;
            case 2:
                lambda$toObject$2 = ArrayUtils.lambda$toObject$2((char[]) obj, i);
                return lambda$toObject$2;
            case 3:
                lambda$toObject$5 = ArrayUtils.lambda$toObject$5((int[]) obj, i);
                return lambda$toObject$5;
            case 4:
                lambda$toObject$0 = ArrayUtils.lambda$toObject$0((boolean[]) obj, i);
                return lambda$toObject$0;
            case 5:
                lambda$toObject$3 = ArrayUtils.lambda$toObject$3((double[]) obj, i);
                return lambda$toObject$3;
            case 6:
                lambda$toObject$6 = ArrayUtils.lambda$toObject$6((long[]) obj, i);
                return lambda$toObject$6;
            case 7:
                lambda$toObject$7 = ArrayUtils.lambda$toObject$7((short[]) obj, i);
                return lambda$toObject$7;
            case 8:
                lambda$toObject$1 = ArrayUtils.lambda$toObject$1((byte[]) obj, i);
                return lambda$toObject$1;
            case 9:
                lambda$toClass$0 = ClassUtils.lambda$toClass$0((Object[]) obj, i);
                return lambda$toClass$0;
            default:
                lambda$convertCharsToIntegers$0 = AlphabetConverter.lambda$convertCharsToIntegers$0((Character[]) obj, i);
                return lambda$convertCharsToIntegers$0;
        }
    }
}
