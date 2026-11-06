package kotlin.reflect.jvm.internal.impl.load.java.structure;

import java.util.Collection;
import kotlin.jvm.functions.Function1;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.Name;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes10.dex */
public interface JavaPackage extends JavaAnnotationOwner {
    @NotNull
    Collection<JavaClass> getClasses(@NotNull Function1<? super Name, Boolean> function1);

    @NotNull
    FqName getFqName();

    @NotNull
    Collection<JavaPackage> getSubPackages();
}
