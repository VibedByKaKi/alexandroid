package com.horcrux.svg;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes8.dex */
class PathElement {
    Point[] points;
    ElementType type;

    public PathElement(ElementType elementType, Point[] pointArr) {
        this.type = elementType;
        this.points = pointArr;
    }
}
