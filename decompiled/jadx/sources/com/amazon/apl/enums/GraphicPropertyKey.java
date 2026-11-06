package com.amazon.apl.enums;

import android.util.SparseArray;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public enum GraphicPropertyKey implements APLEnum {
    kGraphicPropertyClipPath(0),
    kGraphicPropertyCoordinateX(1),
    kGraphicPropertyCoordinateY(2),
    kGraphicPropertyFill(3),
    kGraphicPropertyFillOpacity(4),
    kGraphicPropertyFillTransform(5),
    kGraphicPropertyFillTransformAssigned(6),
    kGraphicPropertyFilters(7),
    kGraphicPropertyFontFamily(8),
    kGraphicPropertyFontSize(9),
    kGraphicPropertyFontStyle(10),
    kGraphicPropertyFontWeight(11),
    kGraphicPropertyHeightActual(12),
    kGraphicPropertyHeightOriginal(13),
    kGraphicPropertyLang(14),
    kGraphicPropertyLayoutDirection(15),
    kGraphicPropertyLetterSpacing(16),
    kGraphicPropertyOpacity(17),
    kGraphicPropertyPathData(18),
    kGraphicPropertyPathLength(19),
    kGraphicPropertyPivotX(20),
    kGraphicPropertyPivotY(21),
    kGraphicPropertyRotation(22),
    kGraphicPropertyScaleX(23),
    kGraphicPropertyScaleY(24),
    kGraphicPropertyViewportHeightActual(25),
    kGraphicPropertyViewportWidthActual(26),
    kGraphicPropertyScaleTypeHeight(27),
    kGraphicPropertyScaleTypeWidth(28),
    kGraphicPropertyStroke(29),
    kGraphicPropertyStrokeDashArray(30),
    kGraphicPropertyStrokeDashOffset(31),
    kGraphicPropertyStrokeLineCap(32),
    kGraphicPropertyStrokeLineJoin(33),
    kGraphicPropertyStrokeMiterLimit(34),
    kGraphicPropertyStrokeOpacity(35),
    kGraphicPropertyStrokeTransform(36),
    kGraphicPropertyStrokeTransformAssigned(37),
    kGraphicPropertyStrokeWidth(38),
    kGraphicPropertyText(39),
    kGraphicPropertyTextAnchor(40),
    kGraphicPropertyTransform(41),
    kGraphicPropertyTransformAssigned(42),
    kGraphicPropertyTranslateX(43),
    kGraphicPropertyTranslateY(44),
    kGraphicPropertyVersion(45),
    kGraphicPropertyViewportHeightOriginal(46),
    kGraphicPropertyViewportWidthOriginal(47),
    kGraphicPropertyWidthActual(48),
    kGraphicPropertyWidthOriginal(49);

    private static SparseArray<GraphicPropertyKey> values;
    private final int index;

    static {
        values = null;
        values = new SparseArray<>();
        for (GraphicPropertyKey graphicPropertyKey : values()) {
            values.put(graphicPropertyKey.getIndex(), graphicPropertyKey);
        }
    }

    GraphicPropertyKey(int i) {
        this.index = i;
    }

    @Override // com.amazon.apl.enums.APLEnum
    public int getIndex() {
        return this.index;
    }

    public static GraphicPropertyKey valueOf(int i) {
        return values.get(i);
    }
}
