package com.facebook.react.viewmanagers;

import android.view.View;
import androidx.annotation.Nullable;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.uimanager.ViewManagerWithGeneratedInterface;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes18.dex */
public interface RNSScreenStackHeaderConfigManagerInterface<T extends View> extends ViewManagerWithGeneratedInterface {
    void setBackButtonDisplayMode(T t, @Nullable String str);

    void setBackButtonInCustomView(T t, boolean z);

    void setBackTitle(T t, @Nullable String str);

    void setBackTitleFontFamily(T t, @Nullable String str);

    void setBackTitleFontSize(T t, int i);

    void setBackTitleVisible(T t, boolean z);

    void setBackgroundColor(T t, @Nullable Integer num);

    void setBlurEffect(T t, @Nullable String str);

    void setColor(T t, @Nullable Integer num);

    void setDirection(T t, @Nullable String str);

    void setDisableBackButtonMenu(T t, boolean z);

    void setHeaderLeftBarButtonItems(T t, @Nullable ReadableArray readableArray);

    void setHeaderRightBarButtonItems(T t, @Nullable ReadableArray readableArray);

    void setHidden(T t, boolean z);

    void setHideBackButton(T t, boolean z);

    void setHideShadow(T t, boolean z);

    void setLargeTitle(T t, boolean z);

    void setLargeTitleBackgroundColor(T t, @Nullable Integer num);

    void setLargeTitleColor(T t, @Nullable Integer num);

    void setLargeTitleFontFamily(T t, @Nullable String str);

    void setLargeTitleFontSize(T t, int i);

    void setLargeTitleFontWeight(T t, @Nullable String str);

    void setLargeTitleHideShadow(T t, boolean z);

    void setSynchronousShadowStateUpdatesEnabled(T t, boolean z);

    void setTitle(T t, @Nullable String str);

    void setTitleColor(T t, @Nullable Integer num);

    void setTitleFontFamily(T t, @Nullable String str);

    void setTitleFontSize(T t, int i);

    void setTitleFontWeight(T t, @Nullable String str);

    void setTopInsetEnabled(T t, boolean z);

    void setTranslucent(T t, boolean z);

    void setUserInterfaceStyle(T t, @Nullable String str);
}
