package com.facebook.react.viewmanagers;

import android.view.View;
import androidx.annotation.Nullable;
import com.facebook.react.uimanager.ViewManagerWithGeneratedInterface;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes18.dex */
public interface AndroidProgressBarManagerInterface<T extends View> extends ViewManagerWithGeneratedInterface {
    void setAnimating(T t, boolean z);

    void setColor(T t, @Nullable Integer num);

    void setIndeterminate(T t, boolean z);

    void setProgress(T t, double d);

    void setStyleAttr(T t, @Nullable String str);

    void setTestID(T t, @Nullable String str);

    void setTypeAttr(T t, @Nullable String str);
}
