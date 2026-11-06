package kotlinx.serialization.internal;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.ClassSerialDescriptorBuilder;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes10.dex */
public final /* synthetic */ class PairSerializer$$ExternalSyntheticLambda0 implements Function1 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ KSerializer f$0;
    public final /* synthetic */ KSerializer f$1;

    public /* synthetic */ PairSerializer$$ExternalSyntheticLambda0(KSerializer kSerializer, KSerializer kSerializer2, int i) {
        this.$r8$classId = i;
        this.f$0 = kSerializer;
        this.f$1 = kSerializer2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Unit descriptor$lambda$0;
        Unit descriptor$lambda$02;
        switch (this.$r8$classId) {
            case 0:
                descriptor$lambda$0 = PairSerializer.descriptor$lambda$0(this.f$0, this.f$1, (ClassSerialDescriptorBuilder) obj);
                return descriptor$lambda$0;
            default:
                descriptor$lambda$02 = MapEntrySerializer.descriptor$lambda$0(this.f$0, this.f$1, (ClassSerialDescriptorBuilder) obj);
                return descriptor$lambda$02;
        }
    }
}
