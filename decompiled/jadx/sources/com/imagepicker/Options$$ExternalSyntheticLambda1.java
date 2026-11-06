package com.imagepicker;

import com.amazon.coral.model.ModelIndex;
import com.amazon.coral.model.reflect.DetectedModelIndex;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.function.IntFunction;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;
import org.apache.logging.log4j.message.ParameterizedMessage;
import org.openjdk.tools.sjavac.comp.PubapiVisitor;
import org.openjdk.tools.sjavac.comp.SjavacImpl;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes8.dex */
public final /* synthetic */ class Options$$ExternalSyntheticLambda1 implements IntFunction {
    public final /* synthetic */ int $r8$classId;

    public /* synthetic */ Options$$ExternalSyntheticLambda1(int i) {
        this.$r8$classId = i;
    }

    @Override // java.util.function.IntFunction
    public final Object apply(int i) {
        String[] lambda$new$0;
        ModelIndex[] lambda$detectModelIndexes$2;
        String[] lambda$toNoNullStringArray$0;
        Object[] lambda$new$1;
        String encodeChar;
        String[] lambda$compile$1;
        switch (this.$r8$classId) {
            case 0:
                lambda$new$0 = Options.lambda$new$0(i);
                return lambda$new$0;
            case 1:
                lambda$detectModelIndexes$2 = DetectedModelIndex.lambda$detectModelIndexes$2(i);
                return lambda$detectModelIndexes$2;
            case 2:
                lambda$toNoNullStringArray$0 = ReflectionToStringBuilder.lambda$toNoNullStringArray$0(i);
                return lambda$toNoNullStringArray$0;
            case 3:
                lambda$new$1 = ParameterizedMessage.lambda$new$1(i);
                return lambda$new$1;
            case 4:
                return new HashSet(i);
            case 5:
                return new HashMap(i);
            case 6:
                return new ArrayList(i);
            case 7:
                encodeChar = PubapiVisitor.encodeChar(i);
                return encodeChar;
            default:
                lambda$compile$1 = SjavacImpl.lambda$compile$1(i);
                return lambda$compile$1;
        }
    }
}
