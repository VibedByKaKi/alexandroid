package org.openjdk.tools.javac.code;

import java.util.Iterator;
import java.util.stream.Stream;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes12.dex */
public final /* synthetic */ class Symtab$$ExternalSyntheticLambda9 implements Iterable {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;

    public /* synthetic */ Symtab$$ExternalSyntheticLambda9(Object obj, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        Iterator lambda$getAllClasses$3;
        int i = this.$r8$classId;
        Object obj = this.f$0;
        switch (i) {
            case 0:
                lambda$getAllClasses$3 = ((Symtab) obj).lambda$getAllClasses$3();
                return lambda$getAllClasses$3;
            default:
                return ((Stream) obj).iterator();
        }
    }
}
