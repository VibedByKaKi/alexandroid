package com.facebook.react.viewmanagers;

import android.view.View;
import androidx.annotation.Nullable;
import com.facebook.react.uimanager.ViewManagerWithGeneratedInterface;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes18.dex */
public interface AndroidDrawerLayoutManagerInterface<T extends View> extends ViewManagerWithGeneratedInterface {
    void closeDrawer(T t);

    void openDrawer(T t);

    void setDrawerBackgroundColor(T t, @Nullable Integer num);

    void setDrawerLockMode(T t, @Nullable String str);

    void setDrawerPosition(T t, @Nullable String str);

    void setDrawerWidth(T t, @Nullable Float f);

    void setKeyboardDismissMode(T t, @Nullable String str);

    void setStatusBarBackgroundColor(T t, @Nullable Integer num);
}
