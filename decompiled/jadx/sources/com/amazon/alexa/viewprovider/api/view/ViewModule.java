package com.amazon.alexa.viewprovider.api.view;

import android.view.View;
import org.json.JSONObject;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public interface ViewModule {
    void cleanUp();

    default boolean customCardLoadedSignal() {
        return false;
    }

    View getView();

    void prepare();

    default void refreshView(JSONObject jSONObject) {
    }

    default void setOnViewLoadedListener(OnViewLoadedListener onViewLoadedListener) {
    }
}
