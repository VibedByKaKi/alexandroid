package org.openjdk.tools.javac.file;

import java.util.Iterator;
import org.openjdk.tools.javac.file.Locations;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes12.dex */
public final /* synthetic */ class JavacFileManager$$ExternalSyntheticLambda0 implements Iterable {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;

    public /* synthetic */ JavacFileManager$$ExternalSyntheticLambda0(Object obj, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        Iterator lambda$asPaths$1;
        Iterator lambda$asFiles$2;
        Iterator lambda$listLocationsForModules$0;
        int i = this.$r8$classId;
        Object obj = this.f$0;
        switch (i) {
            case 0:
                lambda$asPaths$1 = JavacFileManager.lambda$asPaths$1((Iterable) obj);
                return lambda$asPaths$1;
            case 1:
                lambda$asFiles$2 = JavacFileManager.lambda$asFiles$2((Iterable) obj);
                return lambda$asFiles$2;
            default:
                lambda$listLocationsForModules$0 = ((Locations.ModulePathLocationHandler) obj).lambda$listLocationsForModules$0();
                return lambda$listLocationsForModules$0;
        }
    }
}
