package com.amazon.alexa.featureservice.api;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public interface FeatureServiceV2 {
    String getTreatment(String str, String str2, String str3);

    @Deprecated
    String getTreatmentAndRecordTrigger(String str, String str2);

    String getTreatmentAndRecordTrigger(String str, String str2, String str3);

    @Deprecated
    boolean hasAccess(String str, String str2, boolean z);

    @Deprecated
    boolean hasAccess(String str, boolean z);

    @Deprecated
    void observeFeature(String str, FeatureUpdateListener featureUpdateListener);

    void observeFeature(String str, String str2, FeatureUpdateListener featureUpdateListener);

    void unsubscribe(FeatureUpdateListener featureUpdateListener);

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface FeatureUpdateListener {
        default void onFeatureUpdate(String str, String str2) {
            onFeatureUpdate(str2);
        }

        default void onFeatureUpdate(String str) {
        }
    }
}
