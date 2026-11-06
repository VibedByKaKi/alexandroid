package expo.modules.core.interfaces;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes9.dex */
public interface ReactActivityLifecycleListener {
    default boolean onBackPressed() {
        return false;
    }

    default boolean onNewIntent(Intent intent) {
        return false;
    }

    default void onContentChanged(Activity activity) {
    }

    default void onDestroy(Activity activity) {
    }

    default void onPause(Activity activity) {
    }

    default void onResume(Activity activity) {
    }

    default void onUserLeaveHint(Activity activity) {
    }

    default void onCreate(Activity activity, Bundle bundle) {
    }
}
