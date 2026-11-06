package dagger.internal.codegen.kotlin;

import ai.onnxruntime.OnnxMap$$ExternalSyntheticBUOutline0;
import dagger.internal.codegen.base.ClearableCache;
import dagger.internal.codegen.javapoet.TypeNames;
import dagger.internal.codegen.xprocessing.XElements;
import dagger.spi.shaded.androidx.room.compiler.processing.XElement;
import dagger.spi.shaded.androidx.room.compiler.processing.XTypeElement;
import java.util.HashMap;
import java.util.Map;
import javax.inject.Inject;
import javax.inject.Singleton;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Singleton
/* loaded from: classes9.dex */
public final class KotlinMetadataFactory implements ClearableCache {
    private final Map<XTypeElement, KotlinMetadata> metadataCache = new HashMap();

    @Inject
    public KotlinMetadataFactory() {
    }

    @Override // dagger.internal.codegen.base.ClearableCache
    public void clearCache() {
        this.metadataCache.clear();
    }

    public KotlinMetadata create(XElement xElement) {
        XTypeElement closestEnclosingTypeElement = XElements.closestEnclosingTypeElement(xElement);
        if (closestEnclosingTypeElement.hasAnnotation(TypeNames.KOTLIN_METADATA)) {
            return this.metadataCache.computeIfAbsent(closestEnclosingTypeElement, new KotlinMetadata$$ExternalSyntheticLambda7(2));
        }
        OnnxMap$$ExternalSyntheticBUOutline0.m(closestEnclosingTypeElement, "Missing @Metadata for: ");
        return null;
    }
}
