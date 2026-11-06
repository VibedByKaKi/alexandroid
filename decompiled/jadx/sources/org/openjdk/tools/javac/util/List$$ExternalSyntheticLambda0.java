package org.openjdk.tools.javac.util;

import java.util.function.Supplier;
import org.apache.logging.log4j.internal.DefaultLogBuilder;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes12.dex */
public final /* synthetic */ class List$$ExternalSyntheticLambda0 implements Supplier {
    public final /* synthetic */ int $r8$classId;

    public /* synthetic */ List$$ExternalSyntheticLambda0(int i) {
        this.$r8$classId = i;
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        switch (this.$r8$classId) {
            case 0:
                return new ListBuffer();
            default:
                return new DefaultLogBuilder();
        }
    }
}
