package org.jetbrains.kotlin.project.model;

import io.ktor.util.PathKt$$ExternalSyntheticBUOutline0;
import java.util.Collection;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000 \r2\u00020\u0001:\u0006\r\u000e\u000f\u0010\u0011\u0012B\u0017\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\u000b\u001a\u00020\fH\u0016R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n\u0082\u0001\u0005\u0013\u0014\u0015\u0016\u0017¨\u0006\u0018"}, d2 = {"Lorg/jetbrains/kotlin/project/model/KpmVariantResolution;", "", "requestingVariant", "Lorg/jetbrains/kotlin/project/model/KpmVariant;", "dependencyModule", "Lorg/jetbrains/kotlin/project/model/KpmModule;", "(Lorg/jetbrains/kotlin/project/model/KpmVariant;Lorg/jetbrains/kotlin/project/model/KpmModule;)V", "getDependencyModule", "()Lorg/jetbrains/kotlin/project/model/KpmModule;", "getRequestingVariant", "()Lorg/jetbrains/kotlin/project/model/KpmVariant;", "toString", "", "Companion", "KpmAmbiguousVariants", "KpmNoVariantMatch", "KpmVariantMatch", "NotRequested", "Unknown", "Lorg/jetbrains/kotlin/project/model/KpmVariantResolution$KpmAmbiguousVariants;", "Lorg/jetbrains/kotlin/project/model/KpmVariantResolution$KpmNoVariantMatch;", "Lorg/jetbrains/kotlin/project/model/KpmVariantResolution$KpmVariantMatch;", "Lorg/jetbrains/kotlin/project/model/KpmVariantResolution$NotRequested;", "Lorg/jetbrains/kotlin/project/model/KpmVariantResolution$Unknown;", "kotlin-project-model"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes11.dex */
public abstract class KpmVariantResolution {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private final KpmModule dependencyModule;

    @NotNull
    private final KpmVariant requestingVariant;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001c\n\u0002\b\u0004\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007¢\u0006\u0002\u0010\bR\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lorg/jetbrains/kotlin/project/model/KpmVariantResolution$KpmAmbiguousVariants;", "Lorg/jetbrains/kotlin/project/model/KpmVariantResolution;", "requestingVariant", "Lorg/jetbrains/kotlin/project/model/KpmVariant;", "dependencyModule", "Lorg/jetbrains/kotlin/project/model/KpmModule;", "matchingVariants", "", "(Lorg/jetbrains/kotlin/project/model/KpmVariant;Lorg/jetbrains/kotlin/project/model/KpmModule;Ljava/lang/Iterable;)V", "getMatchingVariants", "()Ljava/lang/Iterable;", "kotlin-project-model"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class KpmAmbiguousVariants extends KpmVariantResolution {

        @NotNull
        private final Iterable<KpmVariant> matchingVariants;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public KpmAmbiguousVariants(@NotNull KpmVariant kpmVariant, @NotNull KpmModule kpmModule, @NotNull Iterable<? extends KpmVariant> iterable) {
            super(kpmVariant, kpmModule, null);
            kpmVariant.getClass();
            kpmModule.getClass();
            iterable.getClass();
            this.matchingVariants = iterable;
        }

        @NotNull
        public final Iterable<KpmVariant> getMatchingVariants() {
            return this.matchingVariants;
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006¨\u0006\u0007"}, d2 = {"Lorg/jetbrains/kotlin/project/model/KpmVariantResolution$KpmNoVariantMatch;", "Lorg/jetbrains/kotlin/project/model/KpmVariantResolution;", "requestingVariant", "Lorg/jetbrains/kotlin/project/model/KpmVariant;", "dependencyModule", "Lorg/jetbrains/kotlin/project/model/KpmModule;", "(Lorg/jetbrains/kotlin/project/model/KpmVariant;Lorg/jetbrains/kotlin/project/model/KpmModule;)V", "kotlin-project-model"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class KpmNoVariantMatch extends KpmVariantResolution {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public KpmNoVariantMatch(@NotNull KpmVariant kpmVariant, @NotNull KpmModule kpmModule) {
            super(kpmVariant, kpmModule, null);
            kpmVariant.getClass();
            kpmModule.getClass();
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0002\u0010\u0007R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lorg/jetbrains/kotlin/project/model/KpmVariantResolution$KpmVariantMatch;", "Lorg/jetbrains/kotlin/project/model/KpmVariantResolution;", "requestingVariant", "Lorg/jetbrains/kotlin/project/model/KpmVariant;", "dependencyModule", "Lorg/jetbrains/kotlin/project/model/KpmModule;", "chosenVariant", "(Lorg/jetbrains/kotlin/project/model/KpmVariant;Lorg/jetbrains/kotlin/project/model/KpmModule;Lorg/jetbrains/kotlin/project/model/KpmVariant;)V", "getChosenVariant", "()Lorg/jetbrains/kotlin/project/model/KpmVariant;", "kotlin-project-model"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class KpmVariantMatch extends KpmVariantResolution {

        @NotNull
        private final KpmVariant chosenVariant;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public KpmVariantMatch(@NotNull KpmVariant kpmVariant, @NotNull KpmModule kpmModule, @NotNull KpmVariant kpmVariant2) {
            super(kpmVariant, kpmModule, null);
            kpmVariant.getClass();
            kpmModule.getClass();
            kpmVariant2.getClass();
            this.chosenVariant = kpmVariant2;
        }

        @NotNull
        public final KpmVariant getChosenVariant() {
            return this.chosenVariant;
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006¨\u0006\u0007"}, d2 = {"Lorg/jetbrains/kotlin/project/model/KpmVariantResolution$NotRequested;", "Lorg/jetbrains/kotlin/project/model/KpmVariantResolution;", "requestingVariant", "Lorg/jetbrains/kotlin/project/model/KpmVariant;", "dependencyModule", "Lorg/jetbrains/kotlin/project/model/KpmModule;", "(Lorg/jetbrains/kotlin/project/model/KpmVariant;Lorg/jetbrains/kotlin/project/model/KpmModule;)V", "kotlin-project-model"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class NotRequested extends KpmVariantResolution {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public NotRequested(@NotNull KpmVariant kpmVariant, @NotNull KpmModule kpmModule) {
            super(kpmVariant, kpmModule, null);
            kpmVariant.getClass();
            kpmModule.getClass();
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006¨\u0006\u0007"}, d2 = {"Lorg/jetbrains/kotlin/project/model/KpmVariantResolution$Unknown;", "Lorg/jetbrains/kotlin/project/model/KpmVariantResolution;", "requestingVariant", "Lorg/jetbrains/kotlin/project/model/KpmVariant;", "dependencyModule", "Lorg/jetbrains/kotlin/project/model/KpmModule;", "(Lorg/jetbrains/kotlin/project/model/KpmVariant;Lorg/jetbrains/kotlin/project/model/KpmModule;)V", "kotlin-project-model"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class Unknown extends KpmVariantResolution {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Unknown(@NotNull KpmVariant kpmVariant, @NotNull KpmModule kpmModule) {
            super(kpmVariant, kpmModule, null);
            kpmVariant.getClass();
            kpmModule.getClass();
        }
    }

    private KpmVariantResolution(KpmVariant kpmVariant, KpmModule kpmModule) {
        this.requestingVariant = kpmVariant;
        this.dependencyModule = kpmModule;
    }

    @NotNull
    public final KpmModule getDependencyModule() {
        return this.dependencyModule;
    }

    @NotNull
    public final KpmVariant getRequestingVariant() {
        return this.requestingVariant;
    }

    @NotNull
    public String toString() {
        if (this instanceof KpmVariantMatch) {
            return "match: " + ((KpmVariantMatch) this).getChosenVariant().getFragmentName();
        }
        if (this instanceof Unknown) {
            return "unknown";
        }
        if (this instanceof NotRequested) {
            return "not requested";
        }
        if (this instanceof KpmNoVariantMatch) {
            return "no match";
        }
        if (!(this instanceof KpmAmbiguousVariants)) {
            PathKt$$ExternalSyntheticBUOutline0.m();
            return null;
        }
        return "ambiguity: " + CollectionsKt.joinToString$default(((KpmAmbiguousVariants) this).getMatchingVariants(), null, null, null, new Function1<KpmVariant, CharSequence>() { // from class: org.jetbrains.kotlin.project.model.KpmVariantResolution$toString$1
            @Override // kotlin.jvm.functions.Function1
            @NotNull
            public final CharSequence invoke(@NotNull KpmVariant kpmVariant) {
                kpmVariant.getClass();
                return kpmVariant.getFragmentName();
            }
        }, 31);
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J$\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\n¨\u0006\u000b"}, d2 = {"Lorg/jetbrains/kotlin/project/model/KpmVariantResolution$Companion;", "", "()V", "fromMatchingVariants", "Lorg/jetbrains/kotlin/project/model/KpmVariantResolution;", "requestingVariant", "Lorg/jetbrains/kotlin/project/model/KpmVariant;", "dependencyModule", "Lorg/jetbrains/kotlin/project/model/KpmModule;", "matchingVariants", "", "kotlin-project-model"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KpmVariantResolution fromMatchingVariants(@NotNull KpmVariant requestingVariant, @NotNull KpmModule dependencyModule, @NotNull Collection<? extends KpmVariant> matchingVariants) {
            requestingVariant.getClass();
            dependencyModule.getClass();
            matchingVariants.getClass();
            int size = matchingVariants.size();
            return size != 0 ? size != 1 ? new KpmAmbiguousVariants(requestingVariant, dependencyModule, matchingVariants) : new KpmVariantMatch(requestingVariant, dependencyModule, (KpmVariant) CollectionsKt.single(matchingVariants)) : new KpmNoVariantMatch(requestingVariant, dependencyModule);
        }

        private Companion() {
        }
    }

    public /* synthetic */ KpmVariantResolution(KpmVariant kpmVariant, KpmModule kpmModule, DefaultConstructorMarker defaultConstructorMarker) {
        this(kpmVariant, kpmModule);
    }
}
