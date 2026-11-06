package org.jetbrains.kotlin.project.model;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u000b\f\rB\u0017\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n\u0082\u0001\u0003\u000e\u000f\u0010¨\u0006\u0011"}, d2 = {"Lorg/jetbrains/kotlin/project/model/KpmFragmentResolution;", "", "requestingFragment", "Lorg/jetbrains/kotlin/project/model/KpmFragment;", "dependencyModule", "Lorg/jetbrains/kotlin/project/model/KpmModule;", "(Lorg/jetbrains/kotlin/project/model/KpmFragment;Lorg/jetbrains/kotlin/project/model/KpmModule;)V", "getDependencyModule", "()Lorg/jetbrains/kotlin/project/model/KpmModule;", "getRequestingFragment", "()Lorg/jetbrains/kotlin/project/model/KpmFragment;", "ChosenFragments", "NotRequested", "Unknown", "Lorg/jetbrains/kotlin/project/model/KpmFragmentResolution$ChosenFragments;", "Lorg/jetbrains/kotlin/project/model/KpmFragmentResolution$NotRequested;", "Lorg/jetbrains/kotlin/project/model/KpmFragmentResolution$Unknown;", "kotlin-project-model"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes11.dex */
public abstract class KpmFragmentResolution {

    @NotNull
    private final KpmModule dependencyModule;

    @NotNull
    private final KpmFragment requestingFragment;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001c\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0007¢\u0006\u0002\u0010\nR\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\f¨\u0006\u000e"}, d2 = {"Lorg/jetbrains/kotlin/project/model/KpmFragmentResolution$ChosenFragments;", "Lorg/jetbrains/kotlin/project/model/KpmFragmentResolution;", "requestingFragment", "Lorg/jetbrains/kotlin/project/model/KpmFragment;", "dependencyModule", "Lorg/jetbrains/kotlin/project/model/KpmModule;", "visibleFragments", "", "variantResolutions", "Lorg/jetbrains/kotlin/project/model/KpmVariantResolution;", "(Lorg/jetbrains/kotlin/project/model/KpmFragment;Lorg/jetbrains/kotlin/project/model/KpmModule;Ljava/lang/Iterable;Ljava/lang/Iterable;)V", "getVariantResolutions", "()Ljava/lang/Iterable;", "getVisibleFragments", "kotlin-project-model"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class ChosenFragments extends KpmFragmentResolution {

        @NotNull
        private final Iterable<KpmVariantResolution> variantResolutions;

        @NotNull
        private final Iterable<KpmFragment> visibleFragments;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public ChosenFragments(@NotNull KpmFragment kpmFragment, @NotNull KpmModule kpmModule, @NotNull Iterable<? extends KpmFragment> iterable, @NotNull Iterable<? extends KpmVariantResolution> iterable2) {
            super(kpmFragment, kpmModule, null);
            kpmFragment.getClass();
            kpmModule.getClass();
            iterable.getClass();
            iterable2.getClass();
            this.visibleFragments = iterable;
            this.variantResolutions = iterable2;
        }

        @NotNull
        public final Iterable<KpmVariantResolution> getVariantResolutions() {
            return this.variantResolutions;
        }

        @NotNull
        public final Iterable<KpmFragment> getVisibleFragments() {
            return this.visibleFragments;
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006¨\u0006\u0007"}, d2 = {"Lorg/jetbrains/kotlin/project/model/KpmFragmentResolution$NotRequested;", "Lorg/jetbrains/kotlin/project/model/KpmFragmentResolution;", "requestingFragment", "Lorg/jetbrains/kotlin/project/model/KpmFragment;", "dependencyModule", "Lorg/jetbrains/kotlin/project/model/KpmModule;", "(Lorg/jetbrains/kotlin/project/model/KpmFragment;Lorg/jetbrains/kotlin/project/model/KpmModule;)V", "kotlin-project-model"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class NotRequested extends KpmFragmentResolution {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public NotRequested(@NotNull KpmFragment kpmFragment, @NotNull KpmModule kpmModule) {
            super(kpmFragment, kpmModule, null);
            kpmFragment.getClass();
            kpmModule.getClass();
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006¨\u0006\u0007"}, d2 = {"Lorg/jetbrains/kotlin/project/model/KpmFragmentResolution$Unknown;", "Lorg/jetbrains/kotlin/project/model/KpmFragmentResolution;", "requestingFragment", "Lorg/jetbrains/kotlin/project/model/KpmFragment;", "dependencyModule", "Lorg/jetbrains/kotlin/project/model/KpmModule;", "(Lorg/jetbrains/kotlin/project/model/KpmFragment;Lorg/jetbrains/kotlin/project/model/KpmModule;)V", "kotlin-project-model"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class Unknown extends KpmFragmentResolution {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Unknown(@NotNull KpmFragment kpmFragment, @NotNull KpmModule kpmModule) {
            super(kpmFragment, kpmModule, null);
            kpmFragment.getClass();
            kpmModule.getClass();
        }
    }

    private KpmFragmentResolution(KpmFragment kpmFragment, KpmModule kpmModule) {
        this.requestingFragment = kpmFragment;
        this.dependencyModule = kpmModule;
    }

    @NotNull
    public final KpmModule getDependencyModule() {
        return this.dependencyModule;
    }

    @NotNull
    public final KpmFragment getRequestingFragment() {
        return this.requestingFragment;
    }

    public /* synthetic */ KpmFragmentResolution(KpmFragment kpmFragment, KpmModule kpmModule, DefaultConstructorMarker defaultConstructorMarker) {
        this(kpmFragment, kpmModule);
    }
}
