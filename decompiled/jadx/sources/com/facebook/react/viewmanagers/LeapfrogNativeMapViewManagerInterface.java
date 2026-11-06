package com.facebook.react.viewmanagers;

import android.view.View;
import androidx.annotation.Nullable;
import com.facebook.react.uimanager.ViewManagerWithGeneratedInterface;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes18.dex */
public interface LeapfrogNativeMapViewManagerInterface<T extends View> extends ViewManagerWithGeneratedInterface {
    void setCameraCommand(T t, @Nullable String str);

    void setCameraTestState(T t, @Nullable String str);

    void setLatitude(T t, double d);

    void setLightOn(T t, boolean z);

    void setLongitude(T t, double d);

    void setOutdoorMarkersJson(T t, @Nullable String str);

    void setPinDisplayListJson(T t, @Nullable String str);

    void setRendererMode(T t, @Nullable String str);

    void setRoomLabelsVisible(T t, boolean z);

    void setSatelliteBasemap(T t, boolean z);

    void setSceneJson(T t, @Nullable String str);

    void setZoom(T t, double d);
}
