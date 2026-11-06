package kotlinx.serialization;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlinx.serialization.descriptors.ClassSerialDescriptorBuilder;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes10.dex */
public final /* synthetic */ class ContextualSerializer$$ExternalSyntheticLambda0 implements Function1 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ KSerializer f$0;

    public /* synthetic */ ContextualSerializer$$ExternalSyntheticLambda0(KSerializer kSerializer, int i) {
        this.$r8$classId = i;
        this.f$0 = kSerializer;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Unit descriptor$lambda$0;
        Unit descriptor_delegate$lambda$1$lambda$0;
        int i = this.$r8$classId;
        KSerializer kSerializer = this.f$0;
        switch (i) {
            case 0:
                descriptor$lambda$0 = ContextualSerializer.descriptor$lambda$0((ContextualSerializer) kSerializer, (ClassSerialDescriptorBuilder) obj);
                return descriptor$lambda$0;
            default:
                descriptor_delegate$lambda$1$lambda$0 = PolymorphicSerializer.descriptor_delegate$lambda$1$lambda$0((PolymorphicSerializer) kSerializer, (ClassSerialDescriptorBuilder) obj);
                return descriptor_delegate$lambda$1$lambda$0;
        }
    }
}
