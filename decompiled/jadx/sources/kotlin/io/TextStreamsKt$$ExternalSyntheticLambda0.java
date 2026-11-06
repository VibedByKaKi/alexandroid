package kotlin.io;

import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes10.dex */
public final /* synthetic */ class TextStreamsKt$$ExternalSyntheticLambda0 implements Function1 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ ArrayList f$0;

    public /* synthetic */ TextStreamsKt$$ExternalSyntheticLambda0(ArrayList arrayList, int i) {
        this.$r8$classId = i;
        this.f$0 = arrayList;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Unit readLines$lambda$0;
        Unit readLines$lambda$0$FilesKt__FileReadWriteKt;
        int i = this.$r8$classId;
        ArrayList arrayList = this.f$0;
        String str = (String) obj;
        switch (i) {
            case 0:
                readLines$lambda$0 = TextStreamsKt.readLines$lambda$0(arrayList, str);
                return readLines$lambda$0;
            default:
                readLines$lambda$0$FilesKt__FileReadWriteKt = FilesKt__FileReadWriteKt.readLines$lambda$0$FilesKt__FileReadWriteKt(arrayList, str);
                return readLines$lambda$0$FilesKt__FileReadWriteKt;
        }
    }
}
