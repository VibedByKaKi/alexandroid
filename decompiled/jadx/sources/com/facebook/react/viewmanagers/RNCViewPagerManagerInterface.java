package com.facebook.react.viewmanagers;

import android.view.View;
import androidx.annotation.Nullable;
import com.facebook.react.uimanager.ViewManagerWithGeneratedInterface;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes18.dex */
public interface RNCViewPagerManagerInterface<T extends View> extends ViewManagerWithGeneratedInterface {
    void setInitialPage(T t, int i);

    void setKeyboardDismissMode(T t, @Nullable String str);

    void setLayoutDirection(T t, @Nullable String str);

    void setOffscreenPageLimit(T t, int i);

    void setOrientation(T t, @Nullable String str);

    void setOverScrollMode(T t, @Nullable String str);

    void setOverdrag(T t, boolean z);

    void setPage(T t, int i);

    void setPageMargin(T t, int i);

    void setPageWithoutAnimation(T t, int i);

    void setScrollEnabled(T t, boolean z);

    void setScrollEnabledImperatively(T t, boolean z);
}
