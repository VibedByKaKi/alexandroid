package org.openjdk.tools.javac.file;

import org.openjdk.javax.tools.JavaFileManager;
import org.openjdk.tools.javac.util.Context;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes12.dex */
public final /* synthetic */ class CacheFSInfo$$ExternalSyntheticLambda0 implements Context.Factory {
    public final /* synthetic */ int $r8$classId;

    public /* synthetic */ CacheFSInfo$$ExternalSyntheticLambda0(int i) {
        this.$r8$classId = i;
    }

    @Override // org.openjdk.tools.javac.util.Context.Factory
    public final Object make(Context context) {
        FSInfo lambda$preRegister$0;
        JavaFileManager lambda$preRegister$02;
        switch (this.$r8$classId) {
            case 0:
                lambda$preRegister$0 = CacheFSInfo.lambda$preRegister$0(context);
                return lambda$preRegister$0;
            default:
                lambda$preRegister$02 = JavacFileManager.lambda$preRegister$0(context);
                return lambda$preRegister$02;
        }
    }
}
