package com.amazon.alexa.voice.tta.features;

import android.content.Context;
import com.amazon.alexa.feature.consumer.DefaultFeatureFlagConsumer;
import com.amazon.alexa.feature.consumer.api.FeatureFlagConsumer;
import com.amazon.alexa.feature.consumer.api.FeatureQuery;
import dagger.Module;
import dagger.Provides;
import javax.inject.Singleton;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0007J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0005H\u0007J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\tH\u0007¨\u0006\u000e"}, d2 = {"Lcom/amazon/alexa/voice/tta/features/FeaturesModule;", "", "<init>", "()V", "providesFeatureFlagConsumer", "Lcom/amazon/alexa/feature/consumer/api/FeatureFlagConsumer;", "context", "Landroid/content/Context;", "providesFeatureQuery", "Lcom/amazon/alexa/feature/consumer/api/FeatureQuery;", "featureFlagConsumer", "providesFeatureChecker", "Lcom/amazon/alexa/voice/tta/features/FeatureChecker;", "featureQuery", "AlexaMobileAndroidVoice-TTA_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Module
/* loaded from: classes19.dex */
public final class FeaturesModule {
    @Provides
    @Singleton
    @NotNull
    public final FeatureChecker providesFeatureChecker(@NotNull FeatureQuery featureQuery) {
        featureQuery.getClass();
        return new DefaultFeatureChecker(featureQuery);
    }

    @Provides
    @Singleton
    @NotNull
    public final FeatureFlagConsumer providesFeatureFlagConsumer(@NotNull Context context) {
        context.getClass();
        return new DefaultFeatureFlagConsumer(context);
    }

    @Provides
    @Singleton
    @NotNull
    public final FeatureQuery providesFeatureQuery(@NotNull FeatureFlagConsumer featureFlagConsumer) {
        featureFlagConsumer.getClass();
        FeatureQuery featureQuery = featureFlagConsumer.getFeatureQuery();
        featureQuery.getClass();
        return featureQuery;
    }
}
