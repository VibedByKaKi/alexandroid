package org.openjdk.tools.javac.main;

import java.util.EnumSet;
import java.util.TreeSet;
import java.util.function.Supplier;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes12.dex */
public final /* synthetic */ class Option$$ExternalSyntheticLambda2 implements Supplier {
    public final /* synthetic */ int $r8$classId;

    public /* synthetic */ Option$$ExternalSyntheticLambda2(int i) {
        this.$r8$classId = i;
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        EnumSet lambda$getOptions$4;
        switch (this.$r8$classId) {
            case 0:
                lambda$getOptions$4 = Option.lambda$getOptions$4();
                return lambda$getOptions$4;
            default:
                return new TreeSet();
        }
    }
}
