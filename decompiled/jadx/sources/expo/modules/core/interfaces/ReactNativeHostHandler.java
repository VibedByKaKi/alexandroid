package expo.modules.core.interfaces;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.facebook.react.bridge.JavaScriptExecutorFactory;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.devsupport.interfaces.DevSupportManager;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes9.dex */
public interface ReactNativeHostHandler {
    @Nullable
    default String getBundleAssetName(boolean z) {
        return null;
    }

    @Nullable
    default Object getDevSupportManagerFactory() {
        return null;
    }

    @Nullable
    default String getJSBundleFile(boolean z) {
        return null;
    }

    @Nullable
    default JavaScriptExecutorFactory getJavaScriptExecutorFactory() {
        return null;
    }

    @Nullable
    default Boolean getUseDeveloperSupport() {
        return null;
    }

    default void onDidCreateDevSupportManager(@NonNull DevSupportManager devSupportManager) {
    }

    default void onWillCreateReactInstance(boolean z) {
    }

    default void onDidCreateReactInstance(boolean z, ReactContext reactContext) {
    }

    default void onReactInstanceException(boolean z, @NonNull Exception exc) {
    }
}
