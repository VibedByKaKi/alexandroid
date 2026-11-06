package androidx.compose.runtime.saveable;

import java.util.List;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes13.dex */
public final /* synthetic */ class MapSaverKt$$ExternalSyntheticLambda1 implements Function1 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;

    public /* synthetic */ MapSaverKt$$ExternalSyntheticLambda1(Object obj, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Object mapSaver$lambda$4;
        boolean canBeSaved$lambda$0;
        int i = this.$r8$classId;
        Object obj2 = this.f$0;
        switch (i) {
            case 0:
                mapSaver$lambda$4 = MapSaverKt.mapSaver$lambda$4((Function1) obj2, (List) obj);
                return mapSaver$lambda$4;
            default:
                canBeSaved$lambda$0 = SaveableStateHolderImpl.canBeSaved$lambda$0((SaveableStateHolderImpl) obj2, obj);
                return Boolean.valueOf(canBeSaved$lambda$0);
        }
    }
}
