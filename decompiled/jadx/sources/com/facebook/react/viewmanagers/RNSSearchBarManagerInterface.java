package com.facebook.react.viewmanagers;

import android.view.View;
import androidx.annotation.Nullable;
import com.facebook.react.uimanager.ViewManagerWithGeneratedInterface;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes18.dex */
public interface RNSSearchBarManagerInterface<T extends View> extends ViewManagerWithGeneratedInterface {
    void blur(T t);

    void cancelSearch(T t);

    void clearText(T t);

    void focus(T t);

    void setAllowToolbarIntegration(T t, boolean z);

    void setAutoCapitalize(T t, @Nullable String str);

    void setAutoFocus(T t, boolean z);

    void setBarTintColor(T t, @Nullable Integer num);

    void setCancelButtonText(T t, @Nullable String str);

    void setDisableBackButtonOverride(T t, boolean z);

    void setHeaderIconColor(T t, @Nullable Integer num);

    void setHideNavigationBar(T t, @Nullable String str);

    void setHideWhenScrolling(T t, boolean z);

    void setHintTextColor(T t, @Nullable Integer num);

    void setInputType(T t, @Nullable String str);

    void setObscureBackground(T t, @Nullable String str);

    void setPlaceholder(T t, @Nullable String str);

    void setPlacement(T t, @Nullable String str);

    void setShouldShowHintSearchIcon(T t, boolean z);

    void setText(T t, String str);

    void setTextColor(T t, @Nullable Integer num);

    void setTintColor(T t, @Nullable Integer num);

    void toggleCancelButton(T t, boolean z);
}
