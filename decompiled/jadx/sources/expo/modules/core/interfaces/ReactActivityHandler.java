package expo.modules.core.interfaces;

import android.app.Activity;
import android.view.KeyEvent;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import com.facebook.react.ReactActivity;
import com.facebook.react.ReactActivityDelegate;
import com.facebook.react.ReactNativeHost;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes9.dex */
public interface ReactActivityHandler {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface DelayLoadAppHandler {
        void whenReady(Runnable runnable);
    }

    @Nullable
    default ViewGroup createReactRootViewContainer(Activity activity) {
        return null;
    }

    @Nullable
    default DelayLoadAppHandler getDelayLoadAppHandler(ReactActivity reactActivity, ReactNativeHost reactNativeHost) {
        return null;
    }

    @Nullable
    default ReactActivityDelegate onDidCreateReactActivityDelegate(ReactActivity reactActivity, ReactActivityDelegate reactActivityDelegate) {
        return null;
    }

    default boolean onKeyDown(int i, @Nullable KeyEvent keyEvent) {
        return false;
    }

    default boolean onKeyLongPress(int i, @Nullable KeyEvent keyEvent) {
        return false;
    }

    default boolean onKeyUp(int i, KeyEvent keyEvent) {
        return false;
    }
}
