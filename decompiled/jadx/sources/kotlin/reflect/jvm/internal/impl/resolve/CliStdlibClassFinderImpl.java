package kotlin.reflect.jvm.internal.impl.resolve;

import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.FindClassInModuleKt;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import kotlin.reflect.jvm.internal.impl.name.StandardClassIds;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes10.dex */
final class CliStdlibClassFinderImpl implements StdlibClassFinder {

    @NotNull
    public static final CliStdlibClassFinderImpl INSTANCE = new CliStdlibClassFinderImpl();

    private CliStdlibClassFinderImpl() {
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.StdlibClassFinder
    @Nullable
    public ClassDescriptor findEnumEntriesClass(@NotNull ModuleDescriptor moduleDescriptor) {
        moduleDescriptor.getClass();
        return FindClassInModuleKt.findClassAcrossModuleDependencies(moduleDescriptor, StandardClassIds.INSTANCE.getEnumEntries());
    }
}
