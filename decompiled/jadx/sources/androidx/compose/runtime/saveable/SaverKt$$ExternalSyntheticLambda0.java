package androidx.compose.runtime.saveable;

import java.util.Map;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes13.dex */
public final /* synthetic */ class SaverKt$$ExternalSyntheticLambda0 implements Function2 {
    public final /* synthetic */ int $r8$classId;

    public /* synthetic */ SaverKt$$ExternalSyntheticLambda0(int i) {
        this.$r8$classId = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Object AutoSaver$lambda$0;
        Map Saver$lambda$11;
        SaverScope saverScope = (SaverScope) obj;
        switch (this.$r8$classId) {
            case 0:
                AutoSaver$lambda$0 = SaverKt.AutoSaver$lambda$0(saverScope, obj2);
                return AutoSaver$lambda$0;
            default:
                Saver$lambda$11 = SaveableStateHolderImpl.Saver$lambda$11(saverScope, (SaveableStateHolderImpl) obj2);
                return Saver$lambda$11;
        }
    }
}
