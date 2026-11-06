package com.amazon.alexa.feature.consumer.api;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.Set;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public interface FeatureFlagConsumer {
    void enqueueFeatureFlagListener(String str, FeatureFlagListener featureFlagListener);

    void enqueueFeatureFlagListener(String str, @NonNull String str2, @NonNull FeatureFlagListener featureFlagListener);

    void enqueueFeatureFlagListenerWithTreatment(String str, FeatureFlagListener featureFlagListener);

    void enqueueFeatureFlagListenerWithTreatment(String str, @NonNull String str2, @NonNull FeatureFlagListener featureFlagListener);

    FeatureQuery getFeatureQuery();

    @Nullable
    Treatment getTreatment(String str);

    @Nullable
    Treatment getTreatment(String str, @NonNull String str2);

    @NonNull
    Treatment getTreatmentAndRecordTrigger(String str, String str2, @NonNull Treatment treatment);

    void initialize();

    void load(Set<String> set);

    void loadAll();

    void teardown();
}
