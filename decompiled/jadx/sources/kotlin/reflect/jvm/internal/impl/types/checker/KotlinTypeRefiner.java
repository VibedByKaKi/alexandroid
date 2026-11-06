package kotlin.reflect.jvm.internal.impl.types.checker;

import java.util.Collection;
import kotlin.jvm.functions.Function0;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.types.AbstractTypeRefiner;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.TypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes10.dex */
public abstract class KotlinTypeRefiner extends AbstractTypeRefiner {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class Default extends KotlinTypeRefiner {

        @NotNull
        public static final Default INSTANCE = new Default();

        private Default() {
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner
        @Nullable
        public ClassDescriptor findClassAcrossModuleDependencies(@NotNull ClassId classId) {
            classId.getClass();
            return null;
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner
        @NotNull
        public <S extends MemberScope> S getOrPutScopeForClass(@NotNull ClassDescriptor classDescriptor, @NotNull Function0<? extends S> function0) {
            classDescriptor.getClass();
            function0.getClass();
            return function0.invoke();
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner
        public boolean isRefinementNeededForModule(@NotNull ModuleDescriptor moduleDescriptor) {
            moduleDescriptor.getClass();
            return false;
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner
        public boolean isRefinementNeededForTypeConstructor(@NotNull TypeConstructor typeConstructor) {
            typeConstructor.getClass();
            return false;
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner
        @Nullable
        public ClassDescriptor refineDescriptor(@NotNull DeclarationDescriptor declarationDescriptor) {
            declarationDescriptor.getClass();
            return null;
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner
        @NotNull
        public Collection<KotlinType> refineSupertypes(@NotNull ClassDescriptor classDescriptor) {
            classDescriptor.getClass();
            Collection<KotlinType> mo26588getSupertypes = classDescriptor.getTypeConstructor().mo26588getSupertypes();
            mo26588getSupertypes.getClass();
            return mo26588getSupertypes;
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.AbstractTypeRefiner
        @NotNull
        public KotlinType refineType(@NotNull KotlinTypeMarker kotlinTypeMarker) {
            kotlinTypeMarker.getClass();
            return (KotlinType) kotlinTypeMarker;
        }
    }

    @Nullable
    public abstract ClassDescriptor findClassAcrossModuleDependencies(@NotNull ClassId classId);

    @NotNull
    public abstract <S extends MemberScope> S getOrPutScopeForClass(@NotNull ClassDescriptor classDescriptor, @NotNull Function0<? extends S> function0);

    public abstract boolean isRefinementNeededForModule(@NotNull ModuleDescriptor moduleDescriptor);

    public abstract boolean isRefinementNeededForTypeConstructor(@NotNull TypeConstructor typeConstructor);

    @Nullable
    public abstract ClassifierDescriptor refineDescriptor(@NotNull DeclarationDescriptor declarationDescriptor);

    @NotNull
    public abstract Collection<KotlinType> refineSupertypes(@NotNull ClassDescriptor classDescriptor);

    @Override // kotlin.reflect.jvm.internal.impl.types.AbstractTypeRefiner
    @NotNull
    public abstract KotlinType refineType(@NotNull KotlinTypeMarker kotlinTypeMarker);
}
