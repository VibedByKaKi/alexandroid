package org.jetbrains.kotlin.project.model;

import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.kotlin.project.model.KpmFragment;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001R\u001e\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lorg/jetbrains/kotlin/project/model/KpmVariant;", "Lorg/jetbrains/kotlin/project/model/KpmFragment;", "variantAttributes", "", "Lorg/jetbrains/kotlin/project/model/KotlinAttributeKey;", "", "getVariantAttributes", "()Ljava/util/Map;", "kotlin-project-model"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes11.dex */
public interface KpmVariant extends KpmFragment {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
    public static final class DefaultImpls {
        @NotNull
        public static Set<KpmFragment> getRefinesClosure(@NotNull KpmVariant kpmVariant) {
            return KpmFragment.DefaultImpls.getRefinesClosure(kpmVariant);
        }

        @NotNull
        public static Set<KpmFragment> getWithRefinesClosure(@NotNull KpmVariant kpmVariant) {
            return KpmFragment.DefaultImpls.getWithRefinesClosure(kpmVariant);
        }
    }

    @NotNull
    Map<KotlinAttributeKey, String> getVariantAttributes();
}
