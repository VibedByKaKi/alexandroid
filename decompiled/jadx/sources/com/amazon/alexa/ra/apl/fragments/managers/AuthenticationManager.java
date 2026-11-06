package com.amazon.alexa.ra.apl.fragments.managers;

import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.text.AndroidParagraph$$ExternalSyntheticLambda0;
import com.amazon.alexa.ra.apl.fragments.data.APLFragmentData;
import com.amazon.alexa.ra.apl.fragments.data.ProfileServiceDataReceiver;
import com.amazon.alexa.ra.apl.fragments.extensions.AssetAuthExtension;
import com.amazon.alexa.ra.apl.fragments.extensions.AssetAuthExtensionKt;
import com.amazon.alexa.ra.apl.fragments.providers.SystemTimeProvider;
import java.lang.ref.WeakReference;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.future.FutureKt$$ExternalSyntheticLambda0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0007\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001cB\u0011\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000e\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012J\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0007J\u000e\u0010\u0017\u001a\u00020\r2\u0006\u0010\u0018\u001a\u00020\u0015J\u000e\u0010\u0019\u001a\u00020\u00102\u0006\u0010\u0006\u001a\u00020\u0007J\b\u0010\u001a\u001a\u00020\u001bH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u000e¢\u0006\u0004\n\u0002\u0010\nR\u001e\u0010\u000b\u001a\u0012\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\r0\fj\u0002`\u000eX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001d"}, d2 = {"Lcom/amazon/alexa/ra/apl/fragments/managers/AuthenticationManager;", "", "timeProvider", "Lcom/amazon/alexa/ra/apl/fragments/providers/SystemTimeProvider;", "<init>", "(Lcom/amazon/alexa/ra/apl/fragments/providers/SystemTimeProvider;)V", "authToken", "", "authTokenExpiration", "", "Ljava/lang/Long;", "authExtensionMapping", "", "Lcom/amazon/alexa/ra/apl/fragments/extensions/AssetAuthExtension;", "Lcom/amazon/alexa/ra/apl/fragments/extensions/FragmentToAuthExtensionMapping;", "fetchProfileInfo", "", "context", "Landroid/content/Context;", "getAuthHeaderForUrl", "fragmentData", "Lcom/amazon/alexa/ra/apl/fragments/data/APLFragmentData;", "url", "getAssetAuthExtension", "fragment", "setAuthToken", "isAppInForeground", "", "Companion", "AVSMobileFramework-ra-apl-fragment-runtime_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes18.dex */
public final class AuthenticationManager {

    @NotNull
    private static final String EXTRA_PROFILE_ACTION = "profile_action";
    private static final int FETCH_PROFILE_INFO = 1;
    private static final int HALF_HOUR_IN_MILLI = 1800000;

    @NotNull
    private static final String INTENT_ACTION_FETCH_PROFILE_INFO = "amazon.intent.action.FETCH_PROFILE_INFO";

    @NotNull
    private static final String TAG = "AuthenticationManager";

    @NotNull
    private final Map<String, AssetAuthExtension> authExtensionMapping;

    @Nullable
    private String authToken;

    @Nullable
    private Long authTokenExpiration;

    @NotNull
    private final SystemTimeProvider timeProvider;
    public static final int $stable = 8;

    public AuthenticationManager(@NotNull SystemTimeProvider systemTimeProvider) {
        systemTimeProvider.getClass();
        this.timeProvider = systemTimeProvider;
        this.authExtensionMapping = new LinkedHashMap();
    }

    private final boolean isAppInForeground() {
        ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
        ActivityManager.getMyMemoryState(runningAppProcessInfo);
        return runningAppProcessInfo.importance == 100;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AssetAuthExtension setAuthToken$lambda$1(String str, String str2, AssetAuthExtension assetAuthExtension) {
        str2.getClass();
        assetAuthExtension.getClass();
        return new AssetAuthExtension(assetAuthExtension.getFragment(), str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AssetAuthExtension setAuthToken$lambda$2(Function2 function2, Object obj, Object obj2) {
        return (AssetAuthExtension) function2.invoke(obj, obj2);
    }

    public final void fetchProfileInfo(@NotNull Context context) {
        context.getClass();
        long currentTimeMillis = this.timeProvider.currentTimeMillis();
        Long l = this.authTokenExpiration;
        if (currentTimeMillis <= (l != null ? l.longValue() : 0L) || !isAppInForeground()) {
            return;
        }
        Intent intent = new Intent();
        intent.setPackage(context.getPackageName());
        intent.putExtra("android.intent.extra.RESULT_RECEIVER", new ProfileServiceDataReceiver(new WeakReference(this)));
        intent.putExtra(EXTRA_PROFILE_ACTION, 1);
        intent.setAction(INTENT_ACTION_FETCH_PROFILE_INFO);
        context.startService(intent);
    }

    @NotNull
    public final AssetAuthExtension getAssetAuthExtension(@NotNull APLFragmentData fragment) {
        fragment.getClass();
        Map<String, AssetAuthExtension> map = this.authExtensionMapping;
        String str = this.authToken;
        if (str == null) {
            str = "";
        }
        return AssetAuthExtensionKt.authExtension(map, fragment, str);
    }

    @Nullable
    public final String getAuthHeaderForUrl(@NotNull APLFragmentData fragmentData, @NotNull String url) {
        fragmentData.getClass();
        url.getClass();
        AssetAuthExtension assetAuthExtension = this.authExtensionMapping.get(fragmentData.getUri());
        if (assetAuthExtension != null) {
            return assetAuthExtension.getAuthTokenForURL(url);
        }
        return null;
    }

    public final void setAuthToken(@NotNull String authToken) {
        authToken.getClass();
        this.authToken = authToken;
        this.authExtensionMapping.replaceAll(new FutureKt$$ExternalSyntheticLambda0(new AndroidParagraph$$ExternalSyntheticLambda0(authToken, 11), 5));
        this.authTokenExpiration = Long.valueOf(this.timeProvider.currentTimeMillis() + HALF_HOUR_IN_MILLI);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AuthenticationManager() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public /* synthetic */ AuthenticationManager(SystemTimeProvider systemTimeProvider, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new SystemTimeProvider() : systemTimeProvider);
    }
}
