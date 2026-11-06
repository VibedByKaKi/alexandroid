package com.mapbox.common;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.res.Resources;
import androidx.annotation.RestrictTo;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.dee.app.contacts.common.constants.Constants;
import kotlin.Deprecated;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u000e\u001a\u00020\u0004H\u0007J\b\u0010\u000f\u001a\u00020\u0010H\u0003J\b\u0010\u0011\u001a\u00020\u0010H\u0007J\b\u0010\u0012\u001a\u00020\u0013H\u0007J\u0010\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u0010H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R#\u0010\u0007\u001a\n \t*\u0004\u0018\u00010\b0\b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lcom/mapbox/common/AccessTokenInitializer;", "", "()V", "MAPBOX_PREFERENCES_NAME", "", "SETTING_NAME", Constants.LOG_TAG, "preferences", "Landroid/content/SharedPreferences;", "kotlin.jvm.PlatformType", "getPreferences", "()Landroid/content/SharedPreferences;", "preferences$delegate", "Lkotlin/Lazy;", "getAccessTokenFromEnv", "getAllowInitialization", "", "isAccessTokenInitializationAllowed", "readEnvAndSetAccessToken", "", "setAllowInitialization", "allowed", "common_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
@RestrictTo({RestrictTo.Scope.LIBRARY})
/* loaded from: classes8.dex */
public final class AccessTokenInitializer {

    @NotNull
    private static final String MAPBOX_PREFERENCES_NAME = "mapbox_initialization_settings";

    @NotNull
    private static final String SETTING_NAME = "MapboxInitialized";

    @NotNull
    private static final String TAG = "AccessTokenInitializer";

    @NotNull
    public static final AccessTokenInitializer INSTANCE = new AccessTokenInitializer();

    /* renamed from: preferences$delegate, reason: from kotlin metadata */
    @NotNull
    private static final Lazy preferences = LazyKt.lazy(new Function0<SharedPreferences>() { // from class: com.mapbox.common.AccessTokenInitializer$preferences$2
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final SharedPreferences invoke() {
            return MapboxSDKCommon.INSTANCE.getContext().getSharedPreferences("mapbox_initialization_settings", 0);
        }
    });

    private AccessTokenInitializer() {
    }

    @JvmStatic
    @NotNull
    public static final String getAccessTokenFromEnv() {
        String str;
        Resources resources;
        int identifier;
        try {
            Context context = MapboxSDKCommon.INSTANCE.getContext();
            ApplicationInfo applicationInfo = context.getApplicationInfo();
            if (applicationInfo == null || (str = applicationInfo.packageName) == null || (identifier = (resources = context.getResources()).getIdentifier("mapbox_access_token", TypedValues.Custom.S_STRING, str)) == 0) {
                return "";
            }
            String string = resources.getString(identifier);
            string.getClass();
            return string;
        } catch (Throwable unused) {
            Log.warning("Unable to fetch `mapbox_access_token` resource value", TAG);
            return "";
        }
    }

    @JvmStatic
    private static final boolean getAllowInitialization() {
        try {
            return INSTANCE.getPreferences().getBoolean(SETTING_NAME, false);
        } catch (ClassCastException e) {
            Log.error("Unable to get a value for MapboxInitialized: " + e.getMessage(), TAG);
            return false;
        }
    }

    private final SharedPreferences getPreferences() {
        return (SharedPreferences) preferences.getValue();
    }

    @JvmStatic
    public static final boolean isAccessTokenInitializationAllowed() {
        String str;
        Resources resources;
        int identifier;
        try {
            Context context = MapboxSDKCommon.INSTANCE.getContext();
            ApplicationInfo applicationInfo = context.getApplicationInfo();
            if (applicationInfo == null || (str = applicationInfo.packageName) == null || (identifier = (resources = context.getResources()).getIdentifier("com.mapbox.common.enable_delayed_initialization_logic", "bool", str)) == 0 || !resources.getBoolean(identifier)) {
                return true;
            }
            return getAllowInitialization();
        } catch (Throwable th) {
            Log.error("Unable to get access token initialization status: " + th.getMessage(), TAG);
        }
        return true;
    }

    @JvmStatic
    public static final void setAllowInitialization(boolean allowed) {
        if (allowed) {
            FeatureTelemetryCounter.create("common/AccessToken/allowInitializationTrue").increment();
        } else {
            FeatureTelemetryCounter.create("common/AccessToken/allowInitializationFalse").increment();
        }
        SharedPreferences.Editor edit = INSTANCE.getPreferences().edit();
        edit.putBoolean(SETTING_NAME, allowed);
        edit.apply();
    }

    @Deprecated(message = "Setting and getting access token now separated. Method does nothing and left for API compatibility")
    @JvmStatic
    public static final void readEnvAndSetAccessToken() {
    }
}
