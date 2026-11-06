package com.amazon.alexa.voice.tta.features;

import com.amazon.alexa.feature.consumer.api.FeatureQuery;
import com.amazon.alexa.voice.tta.features.Feature;
import io.ktor.util.PathKt$$ExternalSyntheticBUOutline0;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/amazon/alexa/voice/tta/features/DefaultFeatureChecker;", "Lcom/amazon/alexa/voice/tta/features/FeatureChecker;", "featureQuery", "Lcom/amazon/alexa/feature/consumer/api/FeatureQuery;", "<init>", "(Lcom/amazon/alexa/feature/consumer/api/FeatureQuery;)V", "isFeatureEnabled", "", "feature", "Lcom/amazon/alexa/voice/tta/features/Feature;", "AlexaMobileAndroidVoice-TTA_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nFeatureChecker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FeatureChecker.kt\ncom/amazon/alexa/voice/tta/features/DefaultFeatureChecker\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,33:1\n1755#2,3:34\n1734#2,3:37\n*S KotlinDebug\n*F\n+ 1 FeatureChecker.kt\ncom/amazon/alexa/voice/tta/features/DefaultFeatureChecker\n*L\n29#1:34,3\n30#1:37,3\n*E\n"})
/* loaded from: classes19.dex */
public final class DefaultFeatureChecker implements FeatureChecker {

    @NotNull
    private final FeatureQuery featureQuery;

    public DefaultFeatureChecker(@NotNull FeatureQuery featureQuery) {
        featureQuery.getClass();
        this.featureQuery = featureQuery;
    }

    @Override // com.amazon.alexa.voice.tta.features.FeatureChecker
    public boolean isFeatureEnabled(@NotNull Feature feature) {
        feature.getClass();
        if (feature instanceof Feature.Named) {
            return this.featureQuery.isActive(((Feature.Named) feature).getName());
        }
        if (feature instanceof Feature.NameSpaced) {
            Feature.NameSpaced nameSpaced = (Feature.NameSpaced) feature;
            return this.featureQuery.isActive(nameSpaced.getNamespace(), nameSpaced.getName());
        }
        if (feature instanceof Feature.Any) {
            List<Feature> children = ((Feature.Any) feature).getChildren();
            if ((children instanceof Collection) && children.isEmpty()) {
                return false;
            }
            Iterator<T> it2 = children.iterator();
            while (it2.hasNext()) {
                if (isFeatureEnabled((Feature) it2.next())) {
                    return true;
                }
            }
            return false;
        }
        if (!(feature instanceof Feature.All)) {
            PathKt$$ExternalSyntheticBUOutline0.m();
            return false;
        }
        List<Feature> children2 = ((Feature.All) feature).getChildren();
        if ((children2 instanceof Collection) && children2.isEmpty()) {
            return true;
        }
        Iterator<T> it3 = children2.iterator();
        while (it3.hasNext()) {
            if (!isFeatureEnabled((Feature) it3.next())) {
                return false;
            }
        }
        return true;
    }
}
