package com.facebook.react.viewmanagers;

import android.view.View;
import androidx.annotation.Nullable;
import com.facebook.react.uimanager.ViewManagerWithGeneratedInterface;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes18.dex */
public interface RNSBottomTabsManagerInterface<T extends View> extends ViewManagerWithGeneratedInterface {
    void setControlNavigationStateInJS(T t, boolean z);

    void setNativeContainerBackgroundColor(T t, @Nullable Integer num);

    void setTabBarBackgroundColor(T t, @Nullable Integer num);

    void setTabBarControllerMode(T t, @Nullable String str);

    void setTabBarHidden(T t, boolean z);

    void setTabBarItemActiveIndicatorColor(T t, @Nullable Integer num);

    void setTabBarItemActiveIndicatorEnabled(T t, boolean z);

    void setTabBarItemIconColor(T t, @Nullable Integer num);

    void setTabBarItemIconColorActive(T t, @Nullable Integer num);

    void setTabBarItemLabelVisibilityMode(T t, @Nullable String str);

    void setTabBarItemRippleColor(T t, @Nullable Integer num);

    void setTabBarItemTitleFontColor(T t, @Nullable Integer num);

    void setTabBarItemTitleFontColorActive(T t, @Nullable Integer num);

    void setTabBarItemTitleFontFamily(T t, @Nullable String str);

    void setTabBarItemTitleFontSize(T t, float f);

    void setTabBarItemTitleFontSizeActive(T t, float f);

    void setTabBarItemTitleFontStyle(T t, @Nullable String str);

    void setTabBarItemTitleFontWeight(T t, @Nullable String str);

    void setTabBarMinimizeBehavior(T t, @Nullable String str);

    void setTabBarTintColor(T t, @Nullable Integer num);
}
