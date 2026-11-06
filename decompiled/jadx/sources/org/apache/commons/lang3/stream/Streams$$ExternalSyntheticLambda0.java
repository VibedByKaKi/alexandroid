package org.apache.commons.lang3.stream;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.function.Predicate;
import org.apache.commons.lang3.reflect.FieldUtils;
import org.apache.commons.lang3.reflect.MethodUtils;
import org.apache.logging.log4j.message.MessageFactory;
import org.apache.logging.log4j.spi.LoggerRegistry;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes11.dex */
public final /* synthetic */ class Streams$$ExternalSyntheticLambda0 implements Predicate {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Class f$0;

    public /* synthetic */ Streams$$ExternalSyntheticLambda0(Class cls, int i) {
        this.$r8$classId = i;
        this.f$0 = cls;
    }

    @Override // java.util.function.Predicate
    public final boolean test(Object obj) {
        boolean lambda$getFieldsListWithAnnotation$0;
        boolean lambda$getMethodsListWithAnnotation$1;
        boolean lambda$hasLogger$1;
        int i = this.$r8$classId;
        Class cls = this.f$0;
        switch (i) {
            case 0:
                return cls.isInstance(obj);
            case 1:
                lambda$getFieldsListWithAnnotation$0 = FieldUtils.lambda$getFieldsListWithAnnotation$0(cls, (Field) obj);
                return lambda$getFieldsListWithAnnotation$0;
            case 2:
                lambda$getMethodsListWithAnnotation$1 = MethodUtils.lambda$getMethodsListWithAnnotation$1(cls, (Method) obj);
                return lambda$getMethodsListWithAnnotation$1;
            default:
                lambda$hasLogger$1 = LoggerRegistry.lambda$hasLogger$1(cls, (MessageFactory) obj);
                return lambda$hasLogger$1;
        }
    }
}
