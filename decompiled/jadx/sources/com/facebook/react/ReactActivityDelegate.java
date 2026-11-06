package com.facebook.react;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.Window;
import androidx.annotation.Nullable;
import com.facebook.infer.annotation.Assertions;
import com.facebook.infer.annotation.Nullsafe;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.common.LifecycleState;
import com.facebook.react.interfaces.fabric.ReactSurface;
import com.facebook.react.internal.featureflags.ReactNativeNewArchitectureFeatureFlags;
import com.facebook.react.modules.core.PermissionListener;
import com.facebook.react.views.view.WindowUtilKt;
import com.facebook.systrace.Systrace;
import java.util.Objects;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Nullsafe(Nullsafe.Mode.LOCAL)
/* loaded from: classes20.dex */
public class ReactActivityDelegate {

    @Nullable
    private final Activity mActivity;

    @Nullable
    private final String mMainComponentName;

    @Nullable
    private PermissionListener mPermissionListener;

    @Nullable
    private Callback mPermissionsCallback;

    @Nullable
    private ReactDelegate mReactDelegate;

    @Deprecated
    public ReactActivityDelegate(@Nullable Activity activity, @Nullable String str) {
        this.mActivity = activity;
        this.mMainComponentName = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onCreate$0() {
        ReactActivityDelegate reactActivityDelegate;
        Window window;
        String mainComponentName = getMainComponentName();
        Bundle composeLaunchOptions = composeLaunchOptions();
        Activity activity = this.mActivity;
        if (activity != null && (window = activity.getWindow()) != null) {
            if (WindowUtilKt.isEdgeToEdgeFeatureFlagOn()) {
                WindowUtilKt.enableEdgeToEdge(window);
            }
            if (isWideColorGamutEnabled()) {
                window.setColorMode(1);
            }
        }
        if (ReactNativeNewArchitectureFeatureFlags.enableBridgelessArchitecture()) {
            this.mReactDelegate = new ReactDelegate(getPlainActivity(), getReactHost(), mainComponentName, composeLaunchOptions);
            reactActivityDelegate = this;
        } else {
            reactActivityDelegate = this;
            reactActivityDelegate.mReactDelegate = new ReactDelegate(getPlainActivity(), getReactNativeHost(), mainComponentName, composeLaunchOptions, isFabricEnabled()) { // from class: com.facebook.react.ReactActivityDelegate.1
                @Override // com.facebook.react.ReactDelegate
                @Nullable
                public ReactRootView createRootView() {
                    ReactRootView createRootView = ReactActivityDelegate.this.createRootView();
                    return createRootView == null ? super.createRootView() : createRootView;
                }
            };
        }
        if (mainComponentName != null) {
            reactActivityDelegate.loadApp(mainComponentName);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onRequestPermissionsResult$1(int i, String[] strArr, int[] iArr, Object[] objArr) {
        PermissionListener permissionListener = this.mPermissionListener;
        if (permissionListener == null || !permissionListener.onRequestPermissionsResult(i, strArr, iArr)) {
            return;
        }
        this.mPermissionListener = null;
    }

    @Nullable
    public Bundle composeLaunchOptions() {
        return getLaunchOptions();
    }

    @Nullable
    public ReactRootView createRootView() {
        return null;
    }

    public Context getContext() {
        return (Context) Assertions.assertNotNull(this.mActivity);
    }

    @Nullable
    public ReactContext getCurrentReactContext() {
        ReactDelegate reactDelegate = this.mReactDelegate;
        Objects.requireNonNull(reactDelegate);
        return reactDelegate.getCurrentReactContext();
    }

    @Nullable
    public Bundle getLaunchOptions() {
        return null;
    }

    @Nullable
    public String getMainComponentName() {
        return this.mMainComponentName;
    }

    public Activity getPlainActivity() {
        return (Activity) getContext();
    }

    public ReactActivity getReactActivity() {
        return (ReactActivity) getContext();
    }

    @Nullable
    public ReactDelegate getReactDelegate() {
        return this.mReactDelegate;
    }

    @Nullable
    public ReactHost getReactHost() {
        return ((ReactApplication) getPlainActivity().getApplication()).getReactHost();
    }

    public ReactInstanceManager getReactInstanceManager() {
        ReactDelegate reactDelegate = this.mReactDelegate;
        Objects.requireNonNull(reactDelegate);
        return reactDelegate.getReactInstanceManager();
    }

    @Deprecated
    public ReactNativeHost getReactNativeHost() {
        return ((ReactApplication) getPlainActivity().getApplication()).getReactNativeHost();
    }

    public boolean isFabricEnabled() {
        return ReactNativeNewArchitectureFeatureFlags.enableFabricRenderer();
    }

    public boolean isWideColorGamutEnabled() {
        return false;
    }

    public void loadApp(@Nullable String str) {
        ReactDelegate reactDelegate = this.mReactDelegate;
        Objects.requireNonNull(reactDelegate);
        Objects.requireNonNull(str);
        reactDelegate.loadApp(str);
        getPlainActivity().setContentView(this.mReactDelegate.getReactRootView());
    }

    public void onActivityResult(int i, int i2, @Nullable Intent intent) {
        ReactDelegate reactDelegate = this.mReactDelegate;
        Objects.requireNonNull(reactDelegate);
        reactDelegate.onActivityResult(i, i2, intent, true);
    }

    public boolean onBackPressed() {
        ReactDelegate reactDelegate = this.mReactDelegate;
        Objects.requireNonNull(reactDelegate);
        return reactDelegate.onBackPressed();
    }

    public void onConfigurationChanged(Configuration configuration) {
        ReactDelegate reactDelegate = this.mReactDelegate;
        Objects.requireNonNull(reactDelegate);
        reactDelegate.onConfigurationChanged(configuration);
    }

    public void onCreate(@Nullable Bundle bundle) {
        Systrace.traceSection(0L, "ReactActivityDelegate.onCreate::init", new ReactDelegate$$ExternalSyntheticLambda1(this, 2));
    }

    public void onDestroy() {
        ReactDelegate reactDelegate = this.mReactDelegate;
        Objects.requireNonNull(reactDelegate);
        reactDelegate.onHostDestroy();
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        ReactDelegate reactDelegate = this.mReactDelegate;
        Objects.requireNonNull(reactDelegate);
        return reactDelegate.onKeyDown(i, keyEvent);
    }

    public boolean onKeyLongPress(int i, KeyEvent keyEvent) {
        ReactDelegate reactDelegate = this.mReactDelegate;
        Objects.requireNonNull(reactDelegate);
        return reactDelegate.onKeyLongPress(i);
    }

    public boolean onKeyUp(int i, KeyEvent keyEvent) {
        ReactDelegate reactDelegate = this.mReactDelegate;
        Objects.requireNonNull(reactDelegate);
        return reactDelegate.shouldShowDevMenuOrReload(i, keyEvent);
    }

    public boolean onNewIntent(@Nullable Intent intent) {
        ReactDelegate reactDelegate = this.mReactDelegate;
        Objects.requireNonNull(reactDelegate);
        Objects.requireNonNull(intent);
        return reactDelegate.onNewIntent(intent);
    }

    public void onPause() {
        ReactDelegate reactDelegate = this.mReactDelegate;
        Objects.requireNonNull(reactDelegate);
        reactDelegate.onHostPause();
    }

    public void onRequestPermissionsResult(final int i, final String[] strArr, final int[] iArr) {
        LifecycleState lifecycleState;
        Callback callback = new Callback() { // from class: com.facebook.react.ReactActivityDelegate$$ExternalSyntheticLambda1
            @Override // com.facebook.react.bridge.Callback
            public final void invoke(Object[] objArr) {
                ReactActivityDelegate.this.lambda$onRequestPermissionsResult$1(i, strArr, iArr, objArr);
            }
        };
        if (isFabricEnabled()) {
            ReactHost reactHost = getReactHost();
            lifecycleState = reactHost != null ? reactHost.getLifecycleState() : LifecycleState.BEFORE_CREATE;
        } else {
            ReactNativeHost reactNativeHost = getReactNativeHost();
            lifecycleState = !reactNativeHost.hasInstance() ? LifecycleState.BEFORE_CREATE : reactNativeHost.getReactInstanceManager().getLifecycleState();
        }
        if (lifecycleState == LifecycleState.RESUMED) {
            callback.invoke(new Object[0]);
        } else {
            this.mPermissionsCallback = callback;
        }
    }

    public void onResume() {
        ReactDelegate reactDelegate = this.mReactDelegate;
        Objects.requireNonNull(reactDelegate);
        reactDelegate.onHostResume();
        Callback callback = this.mPermissionsCallback;
        if (callback != null) {
            callback.invoke(new Object[0]);
            this.mPermissionsCallback = null;
        }
    }

    public void onUserLeaveHint() {
        ReactDelegate reactDelegate = this.mReactDelegate;
        Objects.requireNonNull(reactDelegate);
        reactDelegate.onUserLeaveHint();
    }

    public void onWindowFocusChanged(boolean z) {
        ReactDelegate reactDelegate = this.mReactDelegate;
        Objects.requireNonNull(reactDelegate);
        reactDelegate.onWindowFocusChanged(z);
    }

    public void requestPermissions(String[] strArr, int i, @Nullable PermissionListener permissionListener) {
        this.mPermissionListener = permissionListener;
        getPlainActivity().requestPermissions(strArr, i);
    }

    public void setReactRootView(ReactRootView reactRootView) {
        ReactDelegate reactDelegate = this.mReactDelegate;
        Objects.requireNonNull(reactDelegate);
        reactDelegate.setReactRootView(reactRootView);
    }

    public void setReactSurface(ReactSurface reactSurface) {
        ReactDelegate reactDelegate = this.mReactDelegate;
        Objects.requireNonNull(reactDelegate);
        reactDelegate.setReactSurface(reactSurface);
    }

    public ReactActivityDelegate(@Nullable ReactActivity reactActivity, @Nullable String str) {
        this.mActivity = reactActivity;
        this.mMainComponentName = str;
    }
}
