package kotlin.io.path;

import java.nio.file.Path;
import kotlin.jvm.functions.Function3;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes10.dex */
public final /* synthetic */ class PathsKt__PathRecursiveFunctionsKt$$ExternalSyntheticLambda0 implements Function3 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ boolean f$0;

    public /* synthetic */ PathsKt__PathRecursiveFunctionsKt$$ExternalSyntheticLambda0(boolean z, int i) {
        this.$r8$classId = i;
        this.f$0 = z;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        CopyActionResult copyToRecursively$lambda$1$PathsKt__PathRecursiveFunctionsKt;
        CopyActionResult copyToRecursively$lambda$0$PathsKt__PathRecursiveFunctionsKt;
        int i = this.$r8$classId;
        CopyActionContext copyActionContext = (CopyActionContext) obj;
        Path path = (Path) obj2;
        Path path2 = (Path) obj3;
        boolean z = this.f$0;
        switch (i) {
            case 0:
                copyToRecursively$lambda$1$PathsKt__PathRecursiveFunctionsKt = PathsKt__PathRecursiveFunctionsKt.copyToRecursively$lambda$1$PathsKt__PathRecursiveFunctionsKt(z, copyActionContext, path, path2);
                return copyToRecursively$lambda$1$PathsKt__PathRecursiveFunctionsKt;
            default:
                copyToRecursively$lambda$0$PathsKt__PathRecursiveFunctionsKt = PathsKt__PathRecursiveFunctionsKt.copyToRecursively$lambda$0$PathsKt__PathRecursiveFunctionsKt(z, copyActionContext, path, path2);
                return copyToRecursively$lambda$0$PathsKt__PathRecursiveFunctionsKt;
        }
    }
}
