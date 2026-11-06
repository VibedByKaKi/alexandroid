package org.openjdk.javax.tools;

import java.util.Iterator;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes11.dex */
public final /* synthetic */ class FileManagerUtils$$ExternalSyntheticLambda0 implements Iterable {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Iterable f$0;

    public /* synthetic */ FileManagerUtils$$ExternalSyntheticLambda0(Iterable iterable, int i) {
        this.$r8$classId = i;
        this.f$0 = iterable;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        Iterator lambda$asPaths$0;
        Iterator lambda$asFiles$1;
        int i = this.$r8$classId;
        Iterable iterable = this.f$0;
        switch (i) {
            case 0:
                lambda$asPaths$0 = FileManagerUtils.lambda$asPaths$0(iterable);
                return lambda$asPaths$0;
            default:
                lambda$asFiles$1 = FileManagerUtils.lambda$asFiles$1(iterable);
                return lambda$asFiles$1;
        }
    }
}
