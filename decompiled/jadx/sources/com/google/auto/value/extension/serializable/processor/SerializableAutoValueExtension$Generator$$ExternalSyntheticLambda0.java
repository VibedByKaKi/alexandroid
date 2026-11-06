package com.google.auto.value.extension.serializable.processor;

import autovalue.shaded.com.google.common.base.Equivalence;
import com.google.auto.value.extension.AutoValueExtension;
import com.google.auto.value.extension.serializable.processor.SerializableAutoValueExtension;
import com.google.auto.value.extension.serializable.serializer.interfaces.Serializer;
import com.google.auto.value.extension.serializable.serializer.interfaces.SerializerFactory;
import java.util.Map;
import java.util.function.Function;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes8.dex */
public final /* synthetic */ class SerializableAutoValueExtension$Generator$$ExternalSyntheticLambda0 implements Function {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;

    public /* synthetic */ SerializableAutoValueExtension$Generator$$ExternalSyntheticLambda0(Object obj, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        PropertyMirror lambda$new$0;
        Serializer lambda$buildSerializersMap$2;
        int i = this.$r8$classId;
        Object obj2 = this.f$0;
        switch (i) {
            case 0:
                lambda$new$0 = SerializableAutoValueExtension.Generator.lambda$new$0((AutoValueExtension.Context) obj2, (Map.Entry) obj);
                return lambda$new$0;
            default:
                lambda$buildSerializersMap$2 = SerializableAutoValueExtension.Generator.lambda$buildSerializersMap$2((SerializerFactory) obj2, (Equivalence.Wrapper) obj);
                return lambda$buildSerializersMap$2;
        }
    }
}
