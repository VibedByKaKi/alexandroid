package androidx.browser.customtabs;

import android.net.Uri;
import android.os.Bundle;
import androidx.annotation.Dimension;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes.dex */
public class CustomTabsCallback {
    public static final int NAVIGATION_ABORTED = 4;
    public static final int NAVIGATION_FAILED = 3;
    public static final int NAVIGATION_FINISHED = 2;
    public static final int NAVIGATION_STARTED = 1;

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public static final String ONLINE_EXTRAS_KEY = "online";
    public static final int TAB_HIDDEN = 6;
    public static final int TAB_SHOWN = 5;

    @Nullable
    public Bundle extraCallbackWithResult(@NonNull String str, @Nullable Bundle bundle) {
        return null;
    }

    public void onMessageChannelReady(@Nullable Bundle bundle) {
    }

    public void extraCallback(@NonNull String str, @Nullable Bundle bundle) {
    }

    public void onNavigationEvent(int i, @Nullable Bundle bundle) {
    }

    public void onPostMessage(@NonNull String str, @Nullable Bundle bundle) {
    }

    public void onActivityResized(@Dimension(unit = 1) int i, @Dimension(unit = 1) int i2, @NonNull Bundle bundle) {
    }

    public void onRelationshipValidationResult(int i, @NonNull Uri uri, boolean z, @Nullable Bundle bundle) {
    }
}
