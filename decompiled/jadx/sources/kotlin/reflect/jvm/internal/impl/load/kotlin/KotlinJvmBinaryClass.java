package kotlin.reflect.jvm.internal.impl.load.kotlin;

import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.constants.ClassLiteralValue;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes10.dex */
public interface KotlinJvmBinaryClass {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface AnnotationArgumentVisitor {
        void visit(@Nullable Name name, @Nullable Object obj);

        @Nullable
        AnnotationArgumentVisitor visitAnnotation(@Nullable Name name, @NotNull ClassId classId);

        @Nullable
        AnnotationArrayArgumentVisitor visitArray(@Nullable Name name);

        void visitClassLiteral(@Nullable Name name, @NotNull ClassLiteralValue classLiteralValue);

        void visitEnd();

        void visitEnum(@Nullable Name name, @NotNull ClassId classId, @NotNull Name name2);
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface AnnotationArrayArgumentVisitor {
        void visit(@Nullable Object obj);

        @Nullable
        AnnotationArgumentVisitor visitAnnotation(@NotNull ClassId classId);

        void visitClassLiteral(@NotNull ClassLiteralValue classLiteralValue);

        void visitEnd();

        void visitEnum(@NotNull ClassId classId, @NotNull Name name);
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface AnnotationVisitor {
        @Nullable
        AnnotationArgumentVisitor visitAnnotation(@NotNull ClassId classId, @NotNull SourceElement sourceElement);

        void visitEnd();
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface MemberVisitor {
        @Nullable
        AnnotationVisitor visitField(@NotNull Name name, @NotNull String str, @Nullable Object obj);

        @Nullable
        MethodAnnotationVisitor visitMethod(@NotNull Name name, @NotNull String str);
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface MethodAnnotationVisitor extends AnnotationVisitor {
        @Nullable
        AnnotationArgumentVisitor visitParameterAnnotation(int i, @NotNull ClassId classId, @NotNull SourceElement sourceElement);
    }

    @NotNull
    KotlinClassHeader getClassHeader();

    @NotNull
    ClassId getClassId();

    @NotNull
    String getLocation();

    void loadClassAnnotations(@NotNull AnnotationVisitor annotationVisitor, @Nullable byte[] bArr);

    void visitMembers(@NotNull MemberVisitor memberVisitor, @Nullable byte[] bArr);
}
