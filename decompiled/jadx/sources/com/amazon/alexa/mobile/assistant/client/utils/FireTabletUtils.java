package com.amazon.alexa.mobile.assistant.client.utils;

import android.content.ContentResolver;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.provider.Settings;
import android.util.Log;
import androidx.compose.runtime.internal.StabilityInferred;
import com.dee.app.contacts.common.constants.Constants;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@StabilityInferred(parameters = 1)
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0007J\u0010\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0007J\b\u0010\u0014\u001a\u00020\u0010H\u0007J\b\u0010\u0015\u001a\u00020\u0010H\u0007J\u0010\u0010\u0016\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0007J\u0010\u0010\u0017\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0007R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0018"}, d2 = {"Lcom/amazon/alexa/mobile/assistant/client/utils/FireTabletUtils;", "", "<init>", "()V", Constants.LOG_TAG, "", "GEMINI_APPLICATION_NAME", "AMAZON_MANUFACTURER", "SYSTEM_UI_VOICE_CHROME_FEATURE", "SETTINGS_KEY_FOS_USER_ROLE", "USER_ROLE_FOS_CHILD", "SETTINGS_KEY_KH_USER_ROLE", "USER_ROLE_KH_CHILD", "KH_MIN_SDK", "", "shouldGrootBeEnabled", "", "context", "Landroid/content/Context;", "isGeminiAvailable", "isFireOS", "isKHTablet", "isChildProfile", "hasSystemUiVoiceChromeFeature", "client_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes18.dex */
public final class FireTabletUtils {
    public static final int $stable = 0;

    @NotNull
    private static final String AMAZON_MANUFACTURER = "Amazon";

    @NotNull
    private static final String GEMINI_APPLICATION_NAME = "com.amazon.alexa.multimodal.gemini";

    @NotNull
    public static final FireTabletUtils INSTANCE = new FireTabletUtils();
    private static final int KH_MIN_SDK = 35;

    @NotNull
    private static final String SETTINGS_KEY_FOS_USER_ROLE = "USER_ROLE";

    @NotNull
    private static final String SETTINGS_KEY_KH_USER_ROLE = "prefer_user_account_age_group";

    @NotNull
    private static final String SYSTEM_UI_VOICE_CHROME_FEATURE = "com.amazon.alexa.systemui.chrome";

    @NotNull
    private static final String TAG = "FireTabletUtils";

    @NotNull
    private static final String USER_ROLE_FOS_CHILD = "CHILD";

    @NotNull
    private static final String USER_ROLE_KH_CHILD = "child";

    private FireTabletUtils() {
    }

    @JvmStatic
    public static final boolean hasSystemUiVoiceChromeFeature(@NotNull Context context) {
        context.getClass();
        try {
            if (isKHTablet() && !isChildProfile(context)) {
                return context.getPackageManager().hasSystemFeature(SYSTEM_UI_VOICE_CHROME_FEATURE);
            }
            return false;
        } catch (Exception e) {
            Log.e(TAG, "Error checking SystemUI voice chrome feature", e);
            return false;
        }
    }

    @JvmStatic
    public static final boolean isChildProfile(@NotNull Context context) {
        context.getClass();
        ContentResolver contentResolver = context.getContentResolver();
        return Intrinsics.areEqual(USER_ROLE_FOS_CHILD, Settings.Secure.getString(contentResolver, SETTINGS_KEY_FOS_USER_ROLE)) || StringsKt.equals("child", Settings.Secure.getString(contentResolver, SETTINGS_KEY_KH_USER_ROLE), true);
    }

    @JvmStatic
    public static final boolean isFireOS() {
        return Intrinsics.areEqual("Amazon", Build.MANUFACTURER);
    }

    @JvmStatic
    public static final boolean isGeminiAvailable(@NotNull Context context) {
        context.getClass();
        try {
            ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo("com.amazon.alexa.multimodal.gemini", 0);
            applicationInfo.getClass();
            boolean z = (applicationInfo.flags & 129) != 0;
            if (!z) {
                Log.w(TAG, "Gemini package found but is not a system app, ignoring");
            }
            return z;
        } catch (PackageManager.NameNotFoundException unused) {
            Log.i(TAG, "Gemini not installed");
            return false;
        }
    }

    @JvmStatic
    public static final boolean isKHTablet() {
        return isFireOS() && Build.VERSION.SDK_INT >= 35;
    }

    @JvmStatic
    public static final boolean shouldGrootBeEnabled(@NotNull Context context) {
        context.getClass();
        return isFireOS() && !isGeminiAvailable(context);
    }
}
