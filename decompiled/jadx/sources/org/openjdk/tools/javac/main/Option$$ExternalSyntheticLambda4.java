package org.openjdk.tools.javac.main;

import java.util.function.Consumer;
import org.openjdk.tools.javac.main.Arguments;
import org.openjdk.tools.javac.util.Log;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes12.dex */
public final /* synthetic */ class Option$$ExternalSyntheticLambda4 implements Consumer {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;

    public /* synthetic */ Option$$ExternalSyntheticLambda4(Object obj, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        int i = this.$r8$classId;
        Object obj2 = this.f$0;
        switch (i) {
            case 0:
                ((Option) obj).help((Log) obj2);
                break;
            default:
                ((Arguments.ErrorReporter) obj2).report((Option) obj);
                break;
        }
    }
}
