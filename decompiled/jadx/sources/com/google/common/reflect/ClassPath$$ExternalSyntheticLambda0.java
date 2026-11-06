package com.google.common.reflect;

import com.google.common.base.Predicate;
import com.google.common.reflect.ClassPath;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes8.dex */
public final /* synthetic */ class ClassPath$$ExternalSyntheticLambda0 implements Predicate {
    public final /* synthetic */ int $r8$classId;

    @Override // com.google.common.base.Predicate
    public final boolean apply(Object obj) {
        switch (this.$r8$classId) {
            case 0:
                return ((ClassPath.ClassInfo) obj).isTopLevel();
            default:
                return ((Class) obj).isInterface();
        }
    }
}
