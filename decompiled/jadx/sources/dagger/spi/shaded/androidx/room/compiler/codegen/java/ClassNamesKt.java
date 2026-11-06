package dagger.spi.shaded.androidx.room.compiler.codegen.java;

import com.squareup.javapoet.ClassName;
import kotlin.Metadata;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\"\u001c\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0003\u0010\u0004\"\u001c\u0010\u0005\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0004¨\u0006\u0007"}, d2 = {"NONNULL_ANNOTATION", "Lcom/squareup/javapoet/ClassName;", "kotlin.jvm.PlatformType", "getNONNULL_ANNOTATION", "()Lcom/squareup/javapoet/ClassName;", "NULLABLE_ANNOTATION", "getNULLABLE_ANNOTATION", "room-compiler-processing"}, k = 2, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes9.dex */
public final class ClassNamesKt {
    private static final ClassName NULLABLE_ANNOTATION = ClassName.get("androidx.annotation", "Nullable", new String[0]);
    private static final ClassName NONNULL_ANNOTATION = ClassName.get("androidx.annotation", "NonNull", new String[0]);

    public static final ClassName getNONNULL_ANNOTATION() {
        return NONNULL_ANNOTATION;
    }

    public static final ClassName getNULLABLE_ANNOTATION() {
        return NULLABLE_ANNOTATION;
    }
}
