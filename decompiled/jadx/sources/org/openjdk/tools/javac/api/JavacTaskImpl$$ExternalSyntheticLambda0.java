package org.openjdk.tools.javac.api;

import java.util.concurrent.Callable;
import org.openjdk.tools.javac.main.Main;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes12.dex */
public final /* synthetic */ class JavacTaskImpl$$ExternalSyntheticLambda0 implements Callable {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ JavacTaskImpl f$0;

    public /* synthetic */ JavacTaskImpl$$ExternalSyntheticLambda0(JavacTaskImpl javacTaskImpl, int i) {
        this.$r8$classId = i;
        this.f$0 = javacTaskImpl;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        Iterable lambda$analyze$1;
        Main.Result lambda$doCall$0;
        Iterable lambda$generate$2;
        Iterable parseInternal;
        int i = this.$r8$classId;
        JavacTaskImpl javacTaskImpl = this.f$0;
        switch (i) {
            case 0:
                lambda$analyze$1 = javacTaskImpl.lambda$analyze$1();
                return lambda$analyze$1;
            case 1:
                lambda$doCall$0 = javacTaskImpl.lambda$doCall$0();
                return lambda$doCall$0;
            case 2:
                lambda$generate$2 = javacTaskImpl.lambda$generate$2();
                return lambda$generate$2;
            default:
                parseInternal = javacTaskImpl.parseInternal();
                return parseInternal;
        }
    }
}
