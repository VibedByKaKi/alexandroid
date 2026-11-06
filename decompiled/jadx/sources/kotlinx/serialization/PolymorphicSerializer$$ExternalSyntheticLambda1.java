package kotlinx.serialization;

import java.util.ArrayList;
import kotlin.jvm.functions.Function0;
import kotlin.reflect.KClassifier;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes10.dex */
public final /* synthetic */ class PolymorphicSerializer$$ExternalSyntheticLambda1 implements Function0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;

    public /* synthetic */ PolymorphicSerializer$$ExternalSyntheticLambda1(Object obj, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        SerialDescriptor descriptor_delegate$lambda$1;
        KClassifier serializerByKTypeImpl$lambda$0$SerializersKt__SerializersKt;
        int i = this.$r8$classId;
        Object obj = this.f$0;
        switch (i) {
            case 0:
                descriptor_delegate$lambda$1 = PolymorphicSerializer.descriptor_delegate$lambda$1((PolymorphicSerializer) obj);
                return descriptor_delegate$lambda$1;
            default:
                serializerByKTypeImpl$lambda$0$SerializersKt__SerializersKt = SerializersKt__SerializersKt.serializerByKTypeImpl$lambda$0$SerializersKt__SerializersKt((ArrayList) obj);
                return serializerByKTypeImpl$lambda$0$SerializersKt__SerializersKt;
        }
    }
}
