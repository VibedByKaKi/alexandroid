package org.jetbrains.kotlin.project.model;

import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\b\u0010\u000e\u001a\u00020\u000fH\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"}, d2 = {"Lorg/jetbrains/kotlin/project/model/KpmModuleDependency;", "", "moduleIdentifier", "Lorg/jetbrains/kotlin/project/model/KpmModuleIdentifier;", "(Lorg/jetbrains/kotlin/project/model/KpmModuleIdentifier;)V", "getModuleIdentifier", "()Lorg/jetbrains/kotlin/project/model/KpmModuleIdentifier;", "component1", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "hashCode", "", "toString", "", "kotlin-project-model"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class KpmModuleDependency {

    @NotNull
    private final KpmModuleIdentifier moduleIdentifier;

    public KpmModuleDependency(@NotNull KpmModuleIdentifier kpmModuleIdentifier) {
        kpmModuleIdentifier.getClass();
        this.moduleIdentifier = kpmModuleIdentifier;
    }

    public static /* synthetic */ KpmModuleDependency copy$default(KpmModuleDependency kpmModuleDependency, KpmModuleIdentifier kpmModuleIdentifier, int i, Object obj) {
        if ((i & 1) != 0) {
            kpmModuleIdentifier = kpmModuleDependency.moduleIdentifier;
        }
        return kpmModuleDependency.copy(kpmModuleIdentifier);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final KpmModuleIdentifier getModuleIdentifier() {
        return this.moduleIdentifier;
    }

    @NotNull
    public final KpmModuleDependency copy(@NotNull KpmModuleIdentifier moduleIdentifier) {
        moduleIdentifier.getClass();
        return new KpmModuleDependency(moduleIdentifier);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof KpmModuleDependency) && Intrinsics.areEqual(this.moduleIdentifier, ((KpmModuleDependency) other).moduleIdentifier);
    }

    @NotNull
    public final KpmModuleIdentifier getModuleIdentifier() {
        return this.moduleIdentifier;
    }

    public int hashCode() {
        return this.moduleIdentifier.hashCode();
    }

    @NotNull
    public String toString() {
        return "dependency " + this.moduleIdentifier;
    }
}
