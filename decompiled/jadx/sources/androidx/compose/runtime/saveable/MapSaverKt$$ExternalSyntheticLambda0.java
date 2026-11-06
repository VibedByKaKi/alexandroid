package androidx.compose.runtime.saveable;

import androidx.compose.runtime.MutableState;
import java.util.List;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes13.dex */
public final /* synthetic */ class MapSaverKt$$ExternalSyntheticLambda0 implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;

    public /* synthetic */ MapSaverKt$$ExternalSyntheticLambda0(Object obj, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        List mapSaver$lambda$2;
        Object listSaver$lambda$1;
        MutableState mutableStateSaver$lambda$6$lambda$5;
        int i = this.$r8$classId;
        Object obj3 = this.f$0;
        switch (i) {
            case 0:
                mapSaver$lambda$2 = MapSaverKt.mapSaver$lambda$2((Function2) obj3, (SaverScope) obj, obj2);
                return mapSaver$lambda$2;
            case 1:
                listSaver$lambda$1 = ListSaverKt.listSaver$lambda$1((Function2) obj3, (SaverScope) obj, obj2);
                return listSaver$lambda$1;
            default:
                mutableStateSaver$lambda$6$lambda$5 = RememberSaveableKt.mutableStateSaver$lambda$6$lambda$5((Saver) obj3, (SaverScope) obj, (MutableState) obj2);
                return mutableStateSaver$lambda$6$lambda$5;
        }
    }
}
