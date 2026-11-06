package org.jetbrains.kotlin.project.model;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u001a\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H&¨\u0006\u0007"}, d2 = {"Lorg/jetbrains/kotlin/project/model/KpmModuleDependencyResolver;", "", "resolveDependency", "Lorg/jetbrains/kotlin/project/model/KpmModule;", "requestingModule", "moduleDependency", "Lorg/jetbrains/kotlin/project/model/KpmModuleDependency;", "kotlin-project-model"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes11.dex */
public interface KpmModuleDependencyResolver {
    @Nullable
    KpmModule resolveDependency(@NotNull KpmModule requestingModule, @NotNull KpmModuleDependency moduleDependency);
}
