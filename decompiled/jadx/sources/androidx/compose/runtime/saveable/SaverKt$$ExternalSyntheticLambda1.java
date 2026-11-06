package androidx.compose.runtime.saveable;

import java.util.Map;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes13.dex */
public final /* synthetic */ class SaverKt$$ExternalSyntheticLambda1 implements Function1 {
    public final /* synthetic */ int $r8$classId;

    public /* synthetic */ SaverKt$$ExternalSyntheticLambda1(int i) {
        this.$r8$classId = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Object AutoSaver$lambda$1;
        SaveableStateHolderImpl Saver$lambda$12;
        switch (this.$r8$classId) {
            case 0:
                AutoSaver$lambda$1 = SaverKt.AutoSaver$lambda$1(obj);
                return AutoSaver$lambda$1;
            default:
                Saver$lambda$12 = SaveableStateHolderImpl.Saver$lambda$12((Map) obj);
                return Saver$lambda$12;
        }
    }
}
