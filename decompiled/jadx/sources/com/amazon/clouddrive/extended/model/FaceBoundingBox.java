package com.amazon.clouddrive.extended.model;

import com.amazon.clouddrive.model.ObjectComparator;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class FaceBoundingBox {
    private Double mHeight;
    private Double mTopLeftCoordX;
    private Double mTopLeftCoordY;
    private Double mWidth;

    public int compareTo(FaceBoundingBox faceBoundingBox) {
        if (faceBoundingBox == null) {
            return -1;
        }
        if (faceBoundingBox == this) {
            return 0;
        }
        int compare = ObjectComparator.compare(getTopLeftCoordY(), faceBoundingBox.getTopLeftCoordY());
        if (compare != 0) {
            return compare;
        }
        int compare2 = ObjectComparator.compare(getTopLeftCoordX(), faceBoundingBox.getTopLeftCoordX());
        if (compare2 != 0) {
            return compare2;
        }
        int compare3 = ObjectComparator.compare(getHeight(), faceBoundingBox.getHeight());
        if (compare3 != 0) {
            return compare3;
        }
        int compare4 = ObjectComparator.compare(getWidth(), faceBoundingBox.getWidth());
        if (compare4 != 0) {
            return compare4;
        }
        return 0;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof FaceBoundingBox) && compareTo((FaceBoundingBox) obj) == 0;
    }

    public Double getHeight() {
        return this.mHeight;
    }

    public Double getTopLeftCoordX() {
        return this.mTopLeftCoordX;
    }

    public Double getTopLeftCoordY() {
        return this.mTopLeftCoordY;
    }

    public Double getWidth() {
        return this.mWidth;
    }

    public int hashCode() {
        return (((getTopLeftCoordY() == null ? 0 : getTopLeftCoordY().hashCode()) + 1 + (getTopLeftCoordX() == null ? 0 : getTopLeftCoordX().hashCode()) + (getHeight() == null ? 0 : getHeight().hashCode()) + (getWidth() != null ? getWidth().hashCode() : 0)) * 31) + super.hashCode();
    }

    public void setHeight(Double d) {
        this.mHeight = d;
    }

    public void setTopLeftCoordX(Double d) {
        this.mTopLeftCoordX = d;
    }

    public void setTopLeftCoordY(Double d) {
        this.mTopLeftCoordY = d;
    }

    public void setWidth(Double d) {
        this.mWidth = d;
    }
}
