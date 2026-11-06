package com.facebook.react.viewmanagers;

import android.view.View;
import androidx.annotation.Nullable;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.uimanager.ViewManagerWithGeneratedInterface;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes18.dex */
public interface ModalHostViewManagerInterface<T extends View> extends ViewManagerWithGeneratedInterface {
    void setAllowSwipeDismissal(T t, boolean z);

    void setAnimated(T t, boolean z);

    void setAnimationType(T t, @Nullable String str);

    void setHardwareAccelerated(T t, boolean z);

    void setIdentifier(T t, int i);

    void setNavigationBarTranslucent(T t, boolean z);

    void setPresentationStyle(T t, @Nullable String str);

    void setStatusBarTranslucent(T t, boolean z);

    void setSupportedOrientations(T t, @Nullable ReadableArray readableArray);

    void setTransparent(T t, boolean z);

    void setVisible(T t, boolean z);
}
