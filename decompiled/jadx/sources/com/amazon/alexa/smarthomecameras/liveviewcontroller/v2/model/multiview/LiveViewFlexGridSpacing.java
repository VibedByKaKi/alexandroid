package com.amazon.alexa.smarthomecameras.liveviewcontroller.v2.model.multiview;

import com.google.gson.annotations.SerializedName;
import java.io.Serializable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public class LiveViewFlexGridSpacing extends LayoutConfiguration implements Serializable {

    @SerializedName("horizontal")
    private final int horizontal;

    @SerializedName("vertical")
    private final int vertical;

    public LiveViewFlexGridSpacing(int i, int i2) {
        this.horizontal = i;
        this.vertical = i2;
    }

    public int getHorizontal() {
        return this.horizontal;
    }

    public int getVertical() {
        return this.vertical;
    }
}
