package com.facebook.react.viewmanagers;

import android.view.View;
import androidx.annotation.Nullable;
import com.facebook.react.uimanager.ViewManagerWithGeneratedInterface;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes18.dex */
public interface AndroidSwitchManagerInterface<T extends View> extends ViewManagerWithGeneratedInterface {
    void setDisabled(T t, boolean z);

    void setEnabled(T t, boolean z);

    void setNativeValue(T t, boolean z);

    void setOn(T t, boolean z);

    void setThumbColor(T t, @Nullable Integer num);

    void setThumbTintColor(T t, @Nullable Integer num);

    void setTrackColorForFalse(T t, @Nullable Integer num);

    void setTrackColorForTrue(T t, @Nullable Integer num);

    void setTrackTintColor(T t, @Nullable Integer num);

    void setValue(T t, boolean z);
}
