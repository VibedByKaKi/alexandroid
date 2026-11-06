package org.jetbrains.kotlin.project.model;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0007\bB\u000f\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u0082\u0001\u0002\t\n¨\u0006\u000b"}, d2 = {"Lorg/jetbrains/kotlin/project/model/KpmDependencyGraphResolution;", "", "requestingModule", "Lorg/jetbrains/kotlin/project/model/KpmModule;", "(Lorg/jetbrains/kotlin/project/model/KpmModule;)V", "getRequestingModule", "()Lorg/jetbrains/kotlin/project/model/KpmModule;", "KpmDependencyGraph", "Unknown", "Lorg/jetbrains/kotlin/project/model/KpmDependencyGraphResolution$KpmDependencyGraph;", "Lorg/jetbrains/kotlin/project/model/KpmDependencyGraphResolution$Unknown;", "kotlin-project-model"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes11.dex */
public abstract class KpmDependencyGraphResolution {

    @NotNull
    private final KpmModule requestingModule;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0016\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lorg/jetbrains/kotlin/project/model/KpmDependencyGraphResolution$KpmDependencyGraph;", "Lorg/jetbrains/kotlin/project/model/KpmDependencyGraphResolution;", "requestingModule", "Lorg/jetbrains/kotlin/project/model/KpmModule;", "root", "Lorg/jetbrains/kotlin/project/model/KpmDependencyGraphNode;", "(Lorg/jetbrains/kotlin/project/model/KpmModule;Lorg/jetbrains/kotlin/project/model/KpmDependencyGraphNode;)V", "getRoot", "()Lorg/jetbrains/kotlin/project/model/KpmDependencyGraphNode;", "kotlin-project-model"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static class KpmDependencyGraph extends KpmDependencyGraphResolution {

        @NotNull
        private final KpmDependencyGraphNode root;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public KpmDependencyGraph(@NotNull KpmModule kpmModule, @NotNull KpmDependencyGraphNode kpmDependencyGraphNode) {
            super(kpmModule, null);
            kpmModule.getClass();
            kpmDependencyGraphNode.getClass();
            this.root = kpmDependencyGraphNode;
        }

        @NotNull
        public KpmDependencyGraphNode getRoot() {
            return this.root;
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, d2 = {"Lorg/jetbrains/kotlin/project/model/KpmDependencyGraphResolution$Unknown;", "Lorg/jetbrains/kotlin/project/model/KpmDependencyGraphResolution;", "requestingModule", "Lorg/jetbrains/kotlin/project/model/KpmModule;", "(Lorg/jetbrains/kotlin/project/model/KpmModule;)V", "kotlin-project-model"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class Unknown extends KpmDependencyGraphResolution {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Unknown(@NotNull KpmModule kpmModule) {
            super(kpmModule, null);
            kpmModule.getClass();
        }
    }

    private KpmDependencyGraphResolution(KpmModule kpmModule) {
        this.requestingModule = kpmModule;
    }

    @NotNull
    public KpmModule getRequestingModule() {
        return this.requestingModule;
    }

    public /* synthetic */ KpmDependencyGraphResolution(KpmModule kpmModule, DefaultConstructorMarker defaultConstructorMarker) {
        this(kpmModule);
    }
}
