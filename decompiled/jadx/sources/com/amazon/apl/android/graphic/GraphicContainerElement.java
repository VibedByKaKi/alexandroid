package com.amazon.apl.android.graphic;

import android.graphics.Bitmap;
import androidx.annotation.NonNull;
import com.amazon.apl.android.RenderingContext;
import com.amazon.apl.enums.GraphicLayoutDirection;
import com.amazon.apl.enums.GraphicPropertyKey;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class GraphicContainerElement extends GraphicGroupElement {
    private GraphicContainerElement(GraphicElementMap graphicElementMap, long j, RenderingContext renderingContext) {
        super(graphicElementMap, j, renderingContext);
    }

    public static GraphicContainerElement create(long j, RenderingContext renderingContext) {
        return new GraphicContainerElement(new GraphicElementMap(), j, renderingContext);
    }

    @NonNull
    public String getFontLanguage() {
        return this.mProperties.getString(GraphicPropertyKey.kGraphicPropertyLang);
    }

    public float getHeightActual() {
        return this.mProperties.getDimension(GraphicPropertyKey.kGraphicPropertyHeightActual).value();
    }

    public GraphicLayoutDirection getLayoutDirection() {
        return GraphicLayoutDirection.valueOf(this.mProperties.getEnum(GraphicPropertyKey.kGraphicPropertyLayoutDirection));
    }

    @Override // com.amazon.apl.android.graphic.GraphicGroupElement
    public float getOpacity() {
        return 1.0f;
    }

    public float getViewportHeightActual() {
        return this.mProperties.getFloat(GraphicPropertyKey.kGraphicPropertyViewportHeightActual);
    }

    public float getViewportWidthActual() {
        return this.mProperties.getFloat(GraphicPropertyKey.kGraphicPropertyViewportWidthActual);
    }

    public float getWidthActual() {
        return this.mProperties.getDimension(GraphicPropertyKey.kGraphicPropertyWidthActual).value();
    }

    @Override // com.amazon.apl.android.graphic.GraphicElement
    public void putInMap(GraphicElementMap graphicElementMap) {
        super.putInMap(graphicElementMap);
        graphicElementMap.setRoot(this);
    }

    @Override // com.amazon.apl.android.graphic.GraphicGroupElement, com.amazon.apl.android.graphic.GraphicElement
    public void applyProperties() {
    }

    @Override // com.amazon.apl.android.graphic.GraphicElement
    public void createFilters() {
    }

    @Override // com.amazon.apl.android.graphic.GraphicElement
    public void applyFilters(Bitmap bitmap, float f, float f2) {
    }
}
