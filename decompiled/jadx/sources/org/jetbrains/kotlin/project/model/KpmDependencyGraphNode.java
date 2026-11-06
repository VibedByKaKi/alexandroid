package org.jetbrains.kotlin.project.model;

import java.util.Map;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010\u001c\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0000\b\u0016\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0018\u0010\u0004\u001a\u0014\u0012\u0004\u0012\u00020\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00000\u00070\u0005¢\u0006\u0002\u0010\bJ\b\u0010\r\u001a\u00020\u000eH\u0016R&\u0010\u0004\u001a\u0014\u0012\u0004\u0012\u00020\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00000\u00070\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u000f"}, d2 = {"Lorg/jetbrains/kotlin/project/model/KpmDependencyGraphNode;", "", "module", "Lorg/jetbrains/kotlin/project/model/KpmModule;", "dependenciesByFragment", "", "Lorg/jetbrains/kotlin/project/model/KpmFragment;", "", "(Lorg/jetbrains/kotlin/project/model/KpmModule;Ljava/util/Map;)V", "getDependenciesByFragment", "()Ljava/util/Map;", "getModule", "()Lorg/jetbrains/kotlin/project/model/KpmModule;", "toString", "", "kotlin-project-model"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes11.dex */
public class KpmDependencyGraphNode {

    @NotNull
    private final Map<KpmFragment, Iterable<KpmDependencyGraphNode>> dependenciesByFragment;

    @NotNull
    private final KpmModule module;

    /* JADX WARN: Multi-variable type inference failed */
    public KpmDependencyGraphNode(@NotNull KpmModule kpmModule, @NotNull Map<KpmFragment, ? extends Iterable<? extends KpmDependencyGraphNode>> map) {
        kpmModule.getClass();
        map.getClass();
        this.module = kpmModule;
        this.dependenciesByFragment = map;
    }

    @NotNull
    public Map<KpmFragment, Iterable<KpmDependencyGraphNode>> getDependenciesByFragment() {
        return this.dependenciesByFragment;
    }

    @NotNull
    public KpmModule getModule() {
        return this.module;
    }

    @NotNull
    public String toString() {
        return "node " + getModule();
    }
}
