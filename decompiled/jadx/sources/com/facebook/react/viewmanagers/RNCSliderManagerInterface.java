package com.facebook.react.viewmanagers;

import android.view.View;
import androidx.annotation.Nullable;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.uimanager.ViewManagerWithGeneratedInterface;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes18.dex */
public interface RNCSliderManagerInterface<T extends View> extends ViewManagerWithGeneratedInterface {
    void setAccessibilityIncrements(T t, @Nullable ReadableArray readableArray);

    void setAccessibilityUnits(T t, @Nullable String str);

    void setDisabled(T t, boolean z);

    void setInverted(T t, boolean z);

    void setLowerLimit(T t, float f);

    void setMaximumTrackImage(T t, @Nullable ReadableMap readableMap);

    void setMaximumTrackTintColor(T t, @Nullable Integer num);

    void setMaximumValue(T t, double d);

    void setMinimumTrackImage(T t, @Nullable ReadableMap readableMap);

    void setMinimumTrackTintColor(T t, @Nullable Integer num);

    void setMinimumValue(T t, double d);

    void setStep(T t, double d);

    void setTapToSeek(T t, boolean z);

    void setTestID(T t, @Nullable String str);

    void setThumbImage(T t, @Nullable ReadableMap readableMap);

    void setThumbTintColor(T t, @Nullable Integer num);

    void setTrackImage(T t, @Nullable ReadableMap readableMap);

    void setUpperLimit(T t, float f);

    void setValue(T t, float f);

    void setVertical(T t, boolean z);
}
