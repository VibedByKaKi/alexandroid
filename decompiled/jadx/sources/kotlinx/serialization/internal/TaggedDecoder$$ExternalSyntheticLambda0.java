package kotlinx.serialization.internal;

import kotlin.jvm.functions.Function0;
import kotlinx.serialization.DeserializationStrategy;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes10.dex */
public final /* synthetic */ class TaggedDecoder$$ExternalSyntheticLambda0 implements Function0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ TaggedDecoder f$0;
    public final /* synthetic */ DeserializationStrategy f$1;
    public final /* synthetic */ Object f$2;

    public /* synthetic */ TaggedDecoder$$ExternalSyntheticLambda0(TaggedDecoder taggedDecoder, DeserializationStrategy deserializationStrategy, Object obj, int i) {
        this.$r8$classId = i;
        this.f$0 = taggedDecoder;
        this.f$1 = deserializationStrategy;
        this.f$2 = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Object decodeSerializableValue;
        Object decodeNullableSerializableElement$lambda$3;
        switch (this.$r8$classId) {
            case 0:
                decodeSerializableValue = this.f$0.decodeSerializableValue(this.f$1, this.f$2);
                return decodeSerializableValue;
            default:
                decodeNullableSerializableElement$lambda$3 = TaggedDecoder.decodeNullableSerializableElement$lambda$3(this.f$0, this.f$1, this.f$2);
                return decodeNullableSerializableElement$lambda$3;
        }
    }
}
