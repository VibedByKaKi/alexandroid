package kotlinx.serialization;

import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.reflect.KClassifier;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes10.dex */
public final /* synthetic */ class SerializersCacheKt$$ExternalSyntheticLambda4 implements Function0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ List f$0;

    public /* synthetic */ SerializersCacheKt$$ExternalSyntheticLambda4(List list, int i) {
        this.$r8$classId = i;
        this.f$0 = list;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        KClassifier PARAMETRIZED_SERIALIZERS_CACHE$lambda$3$lambda$2;
        KClassifier PARAMETRIZED_SERIALIZERS_CACHE_NULLABLE$lambda$5$lambda$4;
        int i = this.$r8$classId;
        List list = this.f$0;
        switch (i) {
            case 0:
                PARAMETRIZED_SERIALIZERS_CACHE$lambda$3$lambda$2 = SerializersCacheKt.PARAMETRIZED_SERIALIZERS_CACHE$lambda$3$lambda$2(list);
                return PARAMETRIZED_SERIALIZERS_CACHE$lambda$3$lambda$2;
            default:
                PARAMETRIZED_SERIALIZERS_CACHE_NULLABLE$lambda$5$lambda$4 = SerializersCacheKt.PARAMETRIZED_SERIALIZERS_CACHE_NULLABLE$lambda$5$lambda$4(list);
                return PARAMETRIZED_SERIALIZERS_CACHE_NULLABLE$lambda$5$lambda$4;
        }
    }
}
