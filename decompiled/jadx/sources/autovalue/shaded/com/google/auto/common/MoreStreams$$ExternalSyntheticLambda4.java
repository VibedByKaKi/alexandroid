package autovalue.shaded.com.google.auto.common;

import autovalue.shaded.com.google.common.collect.ImmutableBiMap;
import autovalue.shaded.com.google.common.collect.ImmutableList;
import autovalue.shaded.com.google.common.collect.ImmutableMap;
import autovalue.shaded.com.google.common.collect.ImmutableSet;
import autovalue.shaded.com.squareup.javapoet.AnnotationSpec;
import java.util.Collection;
import java.util.function.Function;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes15.dex */
public final /* synthetic */ class MoreStreams$$ExternalSyntheticLambda4 implements Function {
    public final /* synthetic */ int $r8$classId;

    public /* synthetic */ MoreStreams$$ExternalSyntheticLambda4(int i) {
        this.$r8$classId = i;
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        switch (this.$r8$classId) {
            case 0:
                return ((ImmutableMap.Builder) obj).build();
            case 1:
                return ((AnnotationSpec.Builder) obj).build();
            case 2:
                return ((ImmutableBiMap.Builder) obj).build();
            case 3:
                return ImmutableList.copyOf((Collection) obj);
            default:
                return ImmutableSet.copyOf((Collection) obj);
        }
    }
}
