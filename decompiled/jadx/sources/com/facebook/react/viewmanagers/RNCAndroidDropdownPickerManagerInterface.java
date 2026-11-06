package com.facebook.react.viewmanagers;

import android.view.View;
import androidx.annotation.Nullable;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.uimanager.ViewManagerWithGeneratedInterface;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes18.dex */
public interface RNCAndroidDropdownPickerManagerInterface<T extends View> extends ViewManagerWithGeneratedInterface {
    void blur(T t);

    void focus(T t);

    void setBackgroundColor(T t, int i);

    void setColor(T t, @Nullable Integer num);

    void setDropdownIconColor(T t, int i);

    void setDropdownIconRippleColor(T t, int i);

    void setEnabled(T t, boolean z);

    void setItems(T t, @Nullable ReadableArray readableArray);

    void setNativeSelected(T t, int i);

    void setNumberOfLines(T t, int i);

    void setPrompt(T t, @Nullable String str);

    void setSelected(T t, int i);
}
