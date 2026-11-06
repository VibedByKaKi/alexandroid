package org.apache.commons.lang3;

import java.util.Locale;
import java.util.function.Function;
import java.util.function.Supplier;
import org.apache.commons.lang3.AnnotationUtils;
import org.apache.commons.lang3.mutable.MutableInt;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes11.dex */
public final /* synthetic */ class EnumUtils$$ExternalSyntheticLambda4 implements Function {
    public final /* synthetic */ int $r8$classId;

    public /* synthetic */ EnumUtils$$ExternalSyntheticLambda4(int i) {
        this.$r8$classId = i;
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        String lambda$getShortClassName$0;
        char[] lambda$subarray$2;
        long[] lambda$subarray$6;
        float[] lambda$subarray$4;
        MutableInt lambda$increment$0;
        int[] lambda$subarray$5;
        byte[] lambda$subarray$1;
        double[] lambda$subarray$3;
        short[] lambda$subarray$7;
        boolean[] lambda$subarray$0;
        String lambda$convertClassesToClassNames$0;
        String[] lambda$readFile$1;
        String lambda$readFile$2;
        switch (this.$r8$classId) {
            case 0:
                return ((Enum) obj).name();
            case 1:
                lambda$getShortClassName$0 = AnnotationUtils.AnonymousClass1.lambda$getShortClassName$0((Class) obj);
                return lambda$getShortClassName$0;
            case 2:
                lambda$subarray$2 = ArrayUtils.lambda$subarray$2((Integer) obj);
                return lambda$subarray$2;
            case 3:
                lambda$subarray$6 = ArrayUtils.lambda$subarray$6((Integer) obj);
                return lambda$subarray$6;
            case 4:
                lambda$subarray$4 = ArrayUtils.lambda$subarray$4((Integer) obj);
                return lambda$subarray$4;
            case 5:
                lambda$increment$0 = ArrayUtils.lambda$increment$0(obj);
                return lambda$increment$0;
            case 6:
                lambda$subarray$5 = ArrayUtils.lambda$subarray$5((Integer) obj);
                return lambda$subarray$5;
            case 7:
                lambda$subarray$1 = ArrayUtils.lambda$subarray$1((Integer) obj);
                return lambda$subarray$1;
            case 8:
                lambda$subarray$3 = ArrayUtils.lambda$subarray$3((Integer) obj);
                return lambda$subarray$3;
            case 9:
                lambda$subarray$7 = ArrayUtils.lambda$subarray$7((Integer) obj);
                return lambda$subarray$7;
            case 10:
                lambda$subarray$0 = ArrayUtils.lambda$subarray$0((Integer) obj);
                return lambda$subarray$0;
            case 11:
                lambda$convertClassesToClassNames$0 = ClassUtils.lambda$convertClassesToClassNames$0((Class) obj);
                return lambda$convertClassesToClassNames$0;
            case 12:
                return ((Locale) obj).toString();
            case 13:
                return ((Supplier) obj).get();
            case 14:
                lambda$readFile$1 = RuntimeEnvironment.lambda$readFile$1((String) obj);
                return lambda$readFile$1;
            case 15:
                lambda$readFile$2 = RuntimeEnvironment.lambda$readFile$2((String[]) obj);
                return lambda$readFile$2;
            case 16:
                return ObjectUtils.toString(obj);
            case 17:
                return ((ThreadGroup) obj).getName();
            default:
                return ((Thread) obj).getName();
        }
    }
}
