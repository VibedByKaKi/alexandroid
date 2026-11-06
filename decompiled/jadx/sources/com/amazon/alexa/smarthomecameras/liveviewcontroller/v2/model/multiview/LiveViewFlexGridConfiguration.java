package com.amazon.alexa.smarthomecameras.liveviewcontroller.v2.model.multiview;

import androidx.annotation.NonNull;
import com.facebook.react.uimanager.ViewProps;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;
import java.util.List;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public class LiveViewFlexGridConfiguration extends LayoutConfiguration implements Serializable {

    @SerializedName("layout")
    private final LiveViewFlexGridLayout layout;

    @NonNull
    private final List<String> ordering;

    @SerializedName(ViewProps.PADDING)
    private final LiveViewFlexGridPadding padding;

    @SerializedName("size")
    private final LiveViewFlexGridSize size;

    @SerializedName("spacing")
    private final LiveViewFlexGridSpacing spacing;

    public LiveViewFlexGridConfiguration(LiveViewFlexGridPadding liveViewFlexGridPadding, LiveViewFlexGridSpacing liveViewFlexGridSpacing, LiveViewFlexGridSize liveViewFlexGridSize, LiveViewFlexGridLayout liveViewFlexGridLayout, List<String> list) {
        this.padding = liveViewFlexGridPadding;
        this.spacing = liveViewFlexGridSpacing;
        this.size = liveViewFlexGridSize;
        this.layout = liveViewFlexGridLayout;
        this.ordering = list;
    }

    public LiveViewFlexGridLayout getLayout() {
        return this.layout;
    }

    @NonNull
    public List<String> getOrdering() {
        return this.ordering;
    }

    public LiveViewFlexGridPadding getPadding() {
        return this.padding;
    }

    public LiveViewFlexGridSize getSize() {
        return this.size;
    }

    public LiveViewFlexGridSpacing getSpacing() {
        return this.spacing;
    }
}
