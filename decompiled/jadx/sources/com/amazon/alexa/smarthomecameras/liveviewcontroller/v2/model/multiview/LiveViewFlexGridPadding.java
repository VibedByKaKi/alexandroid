package com.amazon.alexa.smarthomecameras.liveviewcontroller.v2.model.multiview;

import com.google.gson.annotations.SerializedName;
import java.io.Serializable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public class LiveViewFlexGridPadding extends LayoutConfiguration implements Serializable {

    @SerializedName("bottom")
    private final int bottom;

    @SerializedName("left")
    private final int left;

    @SerializedName("right")
    private final int right;

    @SerializedName("top")
    private final int top;

    public LiveViewFlexGridPadding(int i, int i2, int i3, int i4) {
        this.top = i;
        this.left = i2;
        this.right = i3;
        this.bottom = i4;
    }

    public int getBottom() {
        return this.bottom;
    }

    public int getLeft() {
        return this.left;
    }

    public int getRight() {
        return this.right;
    }

    public int getTop() {
        return this.top;
    }
}
