package kotlin.reflect.jvm.internal.impl.load.java.structure;

import java.util.Collection;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.sequences.Sequence;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes10.dex */
public interface JavaClass extends JavaClassifier, JavaModifierListOwner, JavaTypeParameterListOwner {
    @NotNull
    Collection<JavaConstructor> getConstructors();

    @NotNull
    Collection<JavaField> getFields();

    @Nullable
    FqName getFqName();

    @NotNull
    Collection<Name> getInnerClassNames();

    @Nullable
    LightClassOriginKind getLightClassOriginKind();

    @NotNull
    Collection<JavaMethod> getMethods();

    @Nullable
    JavaClass getOuterClass();

    @NotNull
    Sequence<JavaClassifierType> getPermittedTypes();

    @NotNull
    Collection<JavaRecordComponent> getRecordComponents();

    @NotNull
    Collection<JavaClassifierType> getSupertypes();

    boolean hasDefaultConstructor();

    boolean isAnnotationType();

    boolean isEnum();

    boolean isInterface();

    boolean isRecord();

    boolean isSealed();
}
