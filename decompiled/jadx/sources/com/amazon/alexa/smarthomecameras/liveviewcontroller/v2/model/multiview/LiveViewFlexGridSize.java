package com.amazon.alexa.smarthomecameras.liveviewcontroller.v2.model.multiview;

import androidx.annotation.NonNull;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public class LiveViewFlexGridSize extends LayoutConfiguration implements Serializable {

    @NonNull
    @SerializedName("height")
    private final int height;

    @NonNull
    @SerializedName("width")
    private final int width;

    public LiveViewFlexGridSize(int i, int i2) {
        this.width = i;
        this.height = i2;
    }

    public int getHeight() {
        return this.height;
    }

    public int getWidth() {
        return this.width;
    }
}
