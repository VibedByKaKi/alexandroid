package kotlin.collections;

import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.markers.KMappedMarker;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes10.dex */
public final /* synthetic */ class AbstractMap$$ExternalSyntheticLambda0 implements Function1 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ KMappedMarker f$0;

    public /* synthetic */ AbstractMap$$ExternalSyntheticLambda0(KMappedMarker kMappedMarker, int i) {
        this.$r8$classId = i;
        this.f$0 = kMappedMarker;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        CharSequence string$lambda$0;
        CharSequence string$lambda$02;
        int i = this.$r8$classId;
        KMappedMarker kMappedMarker = this.f$0;
        switch (i) {
            case 0:
                string$lambda$0 = AbstractMap.toString$lambda$0((AbstractMap) kMappedMarker, (Map.Entry) obj);
                return string$lambda$0;
            default:
                string$lambda$02 = AbstractCollection.toString$lambda$0((AbstractCollection) kMappedMarker, obj);
                return string$lambda$02;
        }
    }
}
