package com.amazon.alexa.smarthomecameras.liveviewcontroller.v2.model.multiview;

import androidx.annotation.NonNull;
import com.amazon.alexa.smarthomecameras.liveviewcontroller.v2.model.multiview.enums.LiveViewFlexGridAlignmentPolicy;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public class LiveViewFlexGridLayout extends LayoutConfiguration implements Serializable {

    @NonNull
    @SerializedName("alignmentPolicy")
    private final LiveViewFlexGridAlignmentPolicy alignmentPolicy;

    @NonNull
    @SerializedName("numCols")
    private final int numCols;

    @NonNull
    @SerializedName("numElements")
    private final int numElements;

    @NonNull
    @SerializedName("numRows")
    private final int numRows;

    public LiveViewFlexGridLayout(int i, int i2, int i3, LiveViewFlexGridAlignmentPolicy liveViewFlexGridAlignmentPolicy) {
        this.numRows = i;
        this.numCols = i2;
        this.numElements = i3;
        this.alignmentPolicy = liveViewFlexGridAlignmentPolicy;
    }

    @NonNull
    public LiveViewFlexGridAlignmentPolicy getAlignmentPolicy() {
        return this.alignmentPolicy;
    }

    public int getNumCols() {
        return this.numCols;
    }

    public int getNumElements() {
        return this.numElements;
    }

    public int getNumRows() {
        return this.numRows;
    }
}
