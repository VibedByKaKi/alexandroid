package com.amazon.alexa.perfusermonitoring.internal;

import android.content.Context;
import android.content.SharedPreferences;
import com.amazon.alexa.featureservice.api.FeatureServiceV2;
import com.dee.app.contacts.common.constants.Constants;
import kotlin.Metadata;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fJ\u000e\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0004J\u0018\u0010\u0013\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u0004H\u0002J\u001e\u0010\u0015\u001a\u00020\r2\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u0004R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000b¨\u0006\u0019"}, d2 = {"Lcom/amazon/alexa/perfusermonitoring/internal/SharedFeatureStorage;", "", "()V", "FEATURE_STORAGE", "", Constants.LOG_TAG, "sharedFeatureStorage", "Landroid/content/SharedPreferences;", "getSharedFeatureStorage", "()Landroid/content/SharedPreferences;", "setSharedFeatureStorage", "(Landroid/content/SharedPreferences;)V", "initializeSharedFeatureStorage", "", "context", "Landroid/content/Context;", "isFeatureEnabled", "", "feature", "setFeatureInStorage", "value", "updateSharedFeatureStorage", "featureServiceV2", "Lcom/amazon/alexa/featureservice/api/FeatureServiceV2;", "namespace", "AlexaMobileAndroidPerformanceUserMonitoring_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes18.dex */
public final class SharedFeatureStorage {

    @NotNull
    private static final String FEATURE_STORAGE = "PerformanceSharedFeatureStorage";

    @NotNull
    public static final SharedFeatureStorage INSTANCE = new SharedFeatureStorage();

    @NotNull
    private static final String TAG = "SharedFeatureStorage";

    @Nullable
    private static SharedPreferences sharedFeatureStorage;

    private SharedFeatureStorage() {
    }

    private final void setFeatureInStorage(String feature, String value) {
        SharedPreferences.Editor edit;
        SharedPreferences.Editor putString;
        SharedPreferences sharedPreferences = sharedFeatureStorage;
        if (sharedPreferences == null || (edit = sharedPreferences.edit()) == null || (putString = edit.putString(feature, value)) == null) {
            return;
        }
        putString.apply();
    }

    @Nullable
    public final SharedPreferences getSharedFeatureStorage() {
        return sharedFeatureStorage;
    }

    public final void initializeSharedFeatureStorage(@NotNull Context context) {
        context.getClass();
        if (sharedFeatureStorage == null) {
            sharedFeatureStorage = context.getSharedPreferences(FEATURE_STORAGE, 0);
        }
    }

    public final boolean isFeatureEnabled(@NotNull String feature) {
        String str;
        feature.getClass();
        SharedPreferences sharedPreferences = sharedFeatureStorage;
        if (sharedPreferences == null || (str = sharedPreferences.getString(feature, "C")) == null) {
            str = "C";
        }
        return !StringsKt.equals(str, "C", true);
    }

    public final void setSharedFeatureStorage(@Nullable SharedPreferences sharedPreferences) {
        sharedFeatureStorage = sharedPreferences;
    }

    public final void updateSharedFeatureStorage(@NotNull FeatureServiceV2 featureServiceV2, @NotNull String namespace, @NotNull String feature) {
        featureServiceV2.getClass();
        namespace.getClass();
        feature.getClass();
        String treatment = featureServiceV2.getTreatment(namespace, feature, "C");
        treatment.getClass();
        setFeatureInStorage(feature, treatment);
    }
}
