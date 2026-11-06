package com.facebook.react.viewmanagers;

import android.view.View;
import androidx.annotation.Nullable;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.uimanager.ViewManagerWithGeneratedInterface;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes18.dex */
public interface RNSSplitViewHostManagerInterface<T extends View> extends ViewManagerWithGeneratedInterface {
    void setColumnMetrics(T t, @Nullable ReadableMap readableMap);

    void setDisplayModeButtonVisibility(T t, @Nullable String str);

    void setOrientation(T t, @Nullable String str);

    void setPreferredDisplayMode(T t, @Nullable String str);

    void setPreferredSplitBehavior(T t, @Nullable String str);

    void setPresentsWithGesture(T t, boolean z);

    void setPrimaryBackgroundStyle(T t, @Nullable String str);

    void setPrimaryEdge(T t, @Nullable String str);

    void setShowInspector(T t, boolean z);

    void setShowSecondaryToggleButton(T t, boolean z);
}
