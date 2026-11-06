package com.amazon.ptz.gestures;

import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;
import lombok.Generated;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public final class TransformInfo {
    private final float deltaScale;
    private final float deltaX;
    private final float deltaY;
    private final float pivotX;
    private final float pivotY;

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public TransformInfo(float f, float f2, float f3, float f4, float f5) {
        this.deltaX = f;
        this.deltaY = f2;
        this.deltaScale = f3;
        this.pivotX = f4;
        this.pivotY = f5;
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof TransformInfo)) {
            return false;
        }
        TransformInfo transformInfo = (TransformInfo) obj;
        return Float.compare(getDeltaX(), transformInfo.getDeltaX()) == 0 && Float.compare(getDeltaY(), transformInfo.getDeltaY()) == 0 && Float.compare(getDeltaScale(), transformInfo.getDeltaScale()) == 0 && Float.compare(getPivotX(), transformInfo.getPivotX()) == 0 && Float.compare(getPivotY(), transformInfo.getPivotY()) == 0;
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public float getDeltaScale() {
        return this.deltaScale;
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public float getDeltaX() {
        return this.deltaX;
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public float getDeltaY() {
        return this.deltaY;
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public float getPivotX() {
        return this.pivotX;
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public float getPivotY() {
        return this.pivotY;
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public int hashCode() {
        return Float.floatToIntBits(getPivotY()) + ((Float.floatToIntBits(getPivotX()) + ((Float.floatToIntBits(getDeltaScale()) + ((Float.floatToIntBits(getDeltaY()) + ((Float.floatToIntBits(getDeltaX()) + 59) * 59)) * 59)) * 59)) * 59);
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public String toString() {
        return "TransformInfo(deltaX=" + getDeltaX() + ", deltaY=" + getDeltaY() + ", deltaScale=" + getDeltaScale() + ", pivotX=" + getPivotX() + ", pivotY=" + getPivotY() + MarkdownConstants.RIGHT_PARENTHESIS;
    }
}
