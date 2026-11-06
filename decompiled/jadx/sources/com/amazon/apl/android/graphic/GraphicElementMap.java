package com.amazon.apl.android.graphic;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
class GraphicElementMap {
    private boolean mContainsFilters;
    private boolean mContainsNonUniformScaling;
    private boolean mContainsSkew;
    private GraphicContainerElement mRoot;
    private final Map<String, GraphicElement> mUniqueIdToGraphicElementMap = new HashMap();

    public boolean containsFilters() {
        return this.mContainsFilters;
    }

    public boolean containsNonUniformScaling() {
        return this.mContainsNonUniformScaling;
    }

    public boolean containsSkew() {
        return this.mContainsSkew;
    }

    @Nullable
    public GraphicElement get(String str) {
        return this.mUniqueIdToGraphicElementMap.get(str);
    }

    @NonNull
    public GraphicContainerElement getRoot() {
        return this.mRoot;
    }

    public void put(@NonNull GraphicElement graphicElement) {
        this.mUniqueIdToGraphicElementMap.put(graphicElement.getUniqueId(), graphicElement);
        if (!this.mContainsFilters) {
            this.mContainsFilters = graphicElement.containsFilters();
        }
        if (!this.mContainsSkew) {
            this.mContainsSkew = graphicElement.containsSkew();
        }
        if (this.mContainsNonUniformScaling) {
            return;
        }
        this.mContainsNonUniformScaling = graphicElement.containsNonUniformScaling();
    }

    public void setRoot(@NonNull GraphicContainerElement graphicContainerElement) {
        this.mRoot = graphicContainerElement;
    }
}
