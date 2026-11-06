package com.amazon.alexa.smarthomecameras.liveviewcontroller.v2.model.multiview;

import androidx.annotation.NonNull;
import com.amazon.alexa.smarthomecameras.liveviewcontroller.v2.model.multiview.enums.LayoutType;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public class LiveViewLayout implements Serializable {

    @SerializedName("configuration")
    private final LayoutConfiguration configuration;

    @NonNull
    @SerializedName("type")
    private final LayoutType type;

    public LiveViewLayout(LayoutType layoutType, LayoutConfiguration layoutConfiguration) {
        this.type = layoutType;
        this.configuration = layoutConfiguration;
    }

    public LayoutConfiguration getConfiguration() {
        return this.configuration;
    }

    @NonNull
    public LayoutType getType() {
        return this.type;
    }
}
