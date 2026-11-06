package kotlinx.serialization;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlinx.serialization.descriptors.ClassSerialDescriptorBuilder;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes10.dex */
public final /* synthetic */ class SealedClassSerializer$$ExternalSyntheticLambda1 implements Function1 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ SealedClassSerializer f$0;

    public /* synthetic */ SealedClassSerializer$$ExternalSyntheticLambda1(SealedClassSerializer sealedClassSerializer, int i) {
        this.$r8$classId = i;
        this.f$0 = sealedClassSerializer;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Unit descriptor_delegate$lambda$3$lambda$2;
        Unit descriptor_delegate$lambda$3$lambda$2$lambda$1;
        int i = this.$r8$classId;
        SealedClassSerializer sealedClassSerializer = this.f$0;
        ClassSerialDescriptorBuilder classSerialDescriptorBuilder = (ClassSerialDescriptorBuilder) obj;
        switch (i) {
            case 0:
                descriptor_delegate$lambda$3$lambda$2 = SealedClassSerializer.descriptor_delegate$lambda$3$lambda$2(sealedClassSerializer, classSerialDescriptorBuilder);
                return descriptor_delegate$lambda$3$lambda$2;
            default:
                descriptor_delegate$lambda$3$lambda$2$lambda$1 = SealedClassSerializer.descriptor_delegate$lambda$3$lambda$2$lambda$1(sealedClassSerializer, classSerialDescriptorBuilder);
                return descriptor_delegate$lambda$3$lambda$2$lambda$1;
        }
    }
}
