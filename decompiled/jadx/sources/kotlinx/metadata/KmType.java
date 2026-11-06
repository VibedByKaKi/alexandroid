package kotlinx.metadata;

import com.amazon.alexa.apl.payload.RenderDocumentPayload;
import com.mapbox.common.HttpHeaders;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.metadata.KmClassifier;
import kotlinx.metadata.impl.extensions.ExtensionUtilsKt;
import kotlinx.metadata.impl.extensions.KmTypeExtension;
import kotlinx.metadata.impl.extensions.MetadataExtensions;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0011\u0012\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004¢\u0006\u0002\u0010\u0005J\u000e\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020\u0001J\u0014\u0010(\u001a\u00020\u00012\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0016J\u001c\u0010)\u001a\u00020\u00012\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\u0006\u0010*\u001a\u00020+H\u0016J\u0014\u0010,\u001a\u00020&2\n\u0010-\u001a\u00060.j\u0002`/H\u0016J\u0010\u00100\u001a\u00020\u00182\u0006\u00101\u001a\u000202H\u0016J\u001e\u00103\u001a\u00020\u00012\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\b\u00104\u001a\u0004\u0018\u00010.H\u0016J\u0014\u00105\u001a\u00020\u00012\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0016J\b\u00106\u001a\u00020&H\u0016J\u0014\u00107\u001a\u00020&2\n\u0010-\u001a\u00060.j\u0002`/H\u0016J\u0010\u00108\u001a\u00020&2\u0006\u00109\u001a\u00020\u0003H\u0016R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0000X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u0017\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0010\u001a\u00020\u0011X\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00180\u0017X\u0082\u0004¢\u0006\u0002\n\u0000R\u001e\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u0005R\u001c\u0010\u001c\u001a\u0004\u0018\u00010\u001dX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\u001c\u0010\"\u001a\u0004\u0018\u00010\u0000X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010\b\"\u0004\b$\u0010\n¨\u0006:"}, d2 = {"Lkotlinx/metadata/KmType;", "Lkotlinx/metadata/KmTypeVisitor;", "flags", "", "Lkotlinx/metadata/Flags;", "(I)V", "abbreviatedType", "getAbbreviatedType", "()Lkotlinx/metadata/KmType;", "setAbbreviatedType", "(Lkotlinx/metadata/KmType;)V", "arguments", "", "Lkotlinx/metadata/KmTypeProjection;", "getArguments", "()Ljava/util/List;", "classifier", "Lkotlinx/metadata/KmClassifier;", "getClassifier", "()Lkotlinx/metadata/KmClassifier;", "setClassifier", "(Lkotlinx/metadata/KmClassifier;)V", RenderDocumentPayload.FIELD_EXTENSIONS, "", "Lkotlinx/metadata/impl/extensions/KmTypeExtension;", "getFlags", "()I", "setFlags", "flexibleTypeUpperBound", "Lkotlinx/metadata/KmFlexibleTypeUpperBound;", "getFlexibleTypeUpperBound", "()Lkotlinx/metadata/KmFlexibleTypeUpperBound;", "setFlexibleTypeUpperBound", "(Lkotlinx/metadata/KmFlexibleTypeUpperBound;)V", "outerType", "getOuterType", "setOuterType", HttpHeaders.ACCEPT, "", "visitor", "visitAbbreviatedType", "visitArgument", "variance", "Lkotlinx/metadata/KmVariance;", "visitClass", "name", "", "Lkotlinx/metadata/ClassName;", "visitExtensions", "type", "Lkotlinx/metadata/KmExtensionType;", "visitFlexibleTypeUpperBound", "typeFlexibilityId", "visitOuterType", "visitStarProjection", "visitTypeAlias", "visitTypeParameter", "id", "kotlinx-metadata"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes10.dex */
public final class KmType extends KmTypeVisitor {

    @Nullable
    private KmType abbreviatedType;

    @NotNull
    private final List<KmTypeProjection> arguments;
    public KmClassifier classifier;

    @NotNull
    private final List<KmTypeExtension> extensions;
    private int flags;

    @Nullable
    private KmFlexibleTypeUpperBound flexibleTypeUpperBound;

    @Nullable
    private KmType outerType;

    public KmType(int i) {
        super(null, 1, null);
        this.flags = i;
        this.arguments = new ArrayList(0);
        List<MetadataExtensions> instances = MetadataExtensions.INSTANCE.getINSTANCES();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(instances, 10));
        Iterator<T> it2 = instances.iterator();
        while (it2.hasNext()) {
            arrayList.add(((MetadataExtensions) it2.next()).createTypeExtension());
        }
        this.extensions = arrayList;
    }

    public final void accept(@NotNull KmTypeVisitor visitor) {
        KmTypeVisitor visitFlexibleTypeUpperBound;
        KmTypeVisitor visitOuterType;
        KmTypeVisitor visitAbbreviatedType;
        visitor.getClass();
        KmClassifier classifier = getClassifier();
        if (classifier instanceof KmClassifier.Class) {
            visitor.visitClass(((KmClassifier.Class) classifier).getName());
        } else if (classifier instanceof KmClassifier.TypeParameter) {
            visitor.visitTypeParameter(((KmClassifier.TypeParameter) classifier).getId());
        } else if (classifier instanceof KmClassifier.TypeAlias) {
            visitor.visitTypeAlias(((KmClassifier.TypeAlias) classifier).getName());
        }
        for (KmTypeProjection kmTypeProjection : this.arguments) {
            if (Intrinsics.areEqual(kmTypeProjection, KmTypeProjection.STAR)) {
                visitor.visitStarProjection();
            } else {
                KmVariance variance = kmTypeProjection.getVariance();
                KmType type = kmTypeProjection.getType();
                if (variance == null || type == null) {
                    throw new InconsistentKotlinMetadataException("Variance and type must be set for non-star type projection", null, 2, null);
                }
                KmTypeVisitor visitArgument = visitor.visitArgument(type.flags, variance);
                if (visitArgument != null) {
                    type.accept(visitArgument);
                }
            }
        }
        KmType kmType = this.abbreviatedType;
        if (kmType != null && (visitAbbreviatedType = visitor.visitAbbreviatedType(kmType.flags)) != null) {
            kmType.accept(visitAbbreviatedType);
        }
        KmType kmType2 = this.outerType;
        if (kmType2 != null && (visitOuterType = visitor.visitOuterType(kmType2.flags)) != null) {
            kmType2.accept(visitOuterType);
        }
        KmFlexibleTypeUpperBound kmFlexibleTypeUpperBound = this.flexibleTypeUpperBound;
        if (kmFlexibleTypeUpperBound != null && (visitFlexibleTypeUpperBound = visitor.visitFlexibleTypeUpperBound(kmFlexibleTypeUpperBound.getType().flags, kmFlexibleTypeUpperBound.getTypeFlexibilityId())) != null) {
            kmFlexibleTypeUpperBound.getType().accept(visitFlexibleTypeUpperBound);
        }
        for (KmTypeExtension kmTypeExtension : this.extensions) {
            KmTypeExtensionVisitor visitExtensions = visitor.visitExtensions(kmTypeExtension.getType());
            if (visitExtensions != null) {
                kmTypeExtension.accept(visitExtensions);
            }
        }
        visitor.visitEnd();
    }

    @Nullable
    public final KmType getAbbreviatedType() {
        return this.abbreviatedType;
    }

    @NotNull
    public final List<KmTypeProjection> getArguments() {
        return this.arguments;
    }

    @NotNull
    public final KmClassifier getClassifier() {
        KmClassifier kmClassifier = this.classifier;
        if (kmClassifier != null) {
            return kmClassifier;
        }
        Intrinsics.throwUninitializedPropertyAccessException("classifier");
        return null;
    }

    public final int getFlags() {
        return this.flags;
    }

    @Nullable
    public final KmFlexibleTypeUpperBound getFlexibleTypeUpperBound() {
        return this.flexibleTypeUpperBound;
    }

    @Nullable
    public final KmType getOuterType() {
        return this.outerType;
    }

    public final void setAbbreviatedType(@Nullable KmType kmType) {
        this.abbreviatedType = kmType;
    }

    public final void setClassifier(@NotNull KmClassifier kmClassifier) {
        kmClassifier.getClass();
        this.classifier = kmClassifier;
    }

    public final void setFlags(int i) {
        this.flags = i;
    }

    public final void setFlexibleTypeUpperBound(@Nullable KmFlexibleTypeUpperBound kmFlexibleTypeUpperBound) {
        this.flexibleTypeUpperBound = kmFlexibleTypeUpperBound;
    }

    public final void setOuterType(@Nullable KmType kmType) {
        this.outerType = kmType;
    }

    @Override // kotlinx.metadata.KmTypeVisitor
    @NotNull
    public KmTypeVisitor visitAbbreviatedType(int flags) {
        KmType kmType = new KmType(flags);
        this.abbreviatedType = kmType;
        return kmType;
    }

    @Override // kotlinx.metadata.KmTypeVisitor
    @NotNull
    public KmTypeVisitor visitArgument(int flags, @NotNull KmVariance variance) {
        variance.getClass();
        KmType kmType = new KmType(flags);
        this.arguments.add(new KmTypeProjection(variance, kmType));
        return kmType;
    }

    @Override // kotlinx.metadata.KmTypeVisitor
    public void visitClass(@NotNull String name) {
        name.getClass();
        setClassifier(new KmClassifier.Class(name));
    }

    @Override // kotlinx.metadata.KmTypeVisitor
    @NotNull
    public KmTypeExtension visitExtensions(@NotNull KmExtensionType type) {
        type.getClass();
        return (KmTypeExtension) ExtensionUtilsKt.singleOfType(this.extensions, type);
    }

    @Override // kotlinx.metadata.KmTypeVisitor
    @NotNull
    public KmTypeVisitor visitFlexibleTypeUpperBound(int flags, @Nullable String typeFlexibilityId) {
        KmType kmType = new KmType(flags);
        this.flexibleTypeUpperBound = new KmFlexibleTypeUpperBound(kmType, typeFlexibilityId);
        return kmType;
    }

    @Override // kotlinx.metadata.KmTypeVisitor
    @NotNull
    public KmTypeVisitor visitOuterType(int flags) {
        KmType kmType = new KmType(flags);
        this.outerType = kmType;
        return kmType;
    }

    @Override // kotlinx.metadata.KmTypeVisitor
    public void visitStarProjection() {
        this.arguments.add(KmTypeProjection.STAR);
    }

    @Override // kotlinx.metadata.KmTypeVisitor
    public void visitTypeAlias(@NotNull String name) {
        name.getClass();
        setClassifier(new KmClassifier.TypeAlias(name));
    }

    @Override // kotlinx.metadata.KmTypeVisitor
    public void visitTypeParameter(int id) {
        setClassifier(new KmClassifier.TypeParameter(id));
    }
}
