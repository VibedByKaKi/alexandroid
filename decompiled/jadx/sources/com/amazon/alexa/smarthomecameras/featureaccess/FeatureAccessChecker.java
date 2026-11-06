package com.amazon.alexa.smarthomecameras.featureaccess;

import android.util.Log;
import com.amazon.alexa.featureservice.api.FeatureServiceV2;
import com.dee.app.contacts.common.constants.Constants;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u0000 \r2\u00020\u0001:\u0001\rB\u0013\b\u0007\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0006\u0010\u0006\u001a\u00020\u0007J\u0006\u0010\b\u001a\u00020\u0007J\u0018\u0010\t\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000bH\u0002R\u0010\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/amazon/alexa/smarthomecameras/featureaccess/FeatureAccessChecker;", "", "featureServiceV2", "Lcom/amazon/alexa/featureservice/api/FeatureServiceV2;", "<init>", "(Lcom/amazon/alexa/featureservice/api/FeatureServiceV2;)V", "hasCamerasV2Architecture", "", "hasCameraEventsIntegration", "hasAccess", "namespace", "", "featureName", "Companion", "AlexaMobileAndroidSmartHomeCameras_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes19.dex */
public final class FeatureAccessChecker {

    @NotNull
    private static final String CAMERAS_FEATURE_NAMESPACE = "ALEXA_APP_CAMERAS";

    @NotNull
    private static final String CAMERAS_V2_ARCHITECTURE_FEATURE = "CAMERAS_V2_ARCHITECTURE";

    @NotNull
    private static final String CAMERA_EVENTS_INTEGRATION_FEATURE = "ALEXA_APP_CAMERA_EVENTS_INTEGRATION";

    @NotNull
    private static final Companion Companion = new Companion(null);

    @NotNull
    private static final String TAG = "FeatureAccessChecker";

    @Nullable
    private final FeatureServiceV2 featureServiceV2;

    @Inject
    public FeatureAccessChecker(@Nullable FeatureServiceV2 featureServiceV2) {
        this.featureServiceV2 = featureServiceV2;
    }

    private final boolean hasAccess(String namespace, String featureName) {
        FeatureServiceV2 featureServiceV2 = this.featureServiceV2;
        if (featureServiceV2 == null) {
            Log.w(TAG, "FeatureServiceV2 unavailable; defaulting " + featureName + " to false");
            return false;
        }
        boolean hasAccess = featureServiceV2.hasAccess(namespace, featureName, false);
        Log.i(TAG, featureName + " enabled: " + hasAccess);
        return hasAccess;
    }

    public final boolean hasCameraEventsIntegration() {
        return hasAccess(CAMERAS_FEATURE_NAMESPACE, CAMERA_EVENTS_INTEGRATION_FEATURE);
    }

    public final boolean hasCamerasV2Architecture() {
        return hasAccess(CAMERAS_FEATURE_NAMESPACE, CAMERAS_V2_ARCHITECTURE_FEATURE);
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/amazon/alexa/smarthomecameras/featureaccess/FeatureAccessChecker$Companion;", "", "<init>", "()V", Constants.LOG_TAG, "", "CAMERAS_FEATURE_NAMESPACE", "CAMERAS_V2_ARCHITECTURE_FEATURE", "CAMERA_EVENTS_INTEGRATION_FEATURE", "AlexaMobileAndroidSmartHomeCameras_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }
}
