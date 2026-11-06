package androidx.constraintlayout.core.dsl;

import androidx.compose.runtime.BitVector$$ExternalSyntheticOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes13.dex */
public class KeyPosition extends Keys {
    private int mFrame;
    private String mTarget;
    private String mTransitionEasing = null;
    private float mPercentWidth = Float.NaN;
    private float mPercentHeight = Float.NaN;
    private float mPercentX = Float.NaN;
    private float mPercentY = Float.NaN;
    private Type mPositionType = Type.CARTESIAN;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public enum Type {
        CARTESIAN,
        SCREEN,
        PATH
    }

    public KeyPosition(String str, int i) {
        this.mTarget = null;
        this.mFrame = 0;
        this.mTarget = str;
        this.mFrame = i;
    }

    public int getFrames() {
        return this.mFrame;
    }

    public float getPercentHeight() {
        return this.mPercentHeight;
    }

    public float getPercentWidth() {
        return this.mPercentWidth;
    }

    public float getPercentX() {
        return this.mPercentX;
    }

    public float getPercentY() {
        return this.mPercentY;
    }

    public Type getPositionType() {
        return this.mPositionType;
    }

    public String getTarget() {
        return this.mTarget;
    }

    public String getTransitionEasing() {
        return this.mTransitionEasing;
    }

    public void setFrames(int i) {
        this.mFrame = i;
    }

    public void setPercentHeight(float f) {
        this.mPercentHeight = f;
    }

    public void setPercentWidth(float f) {
        this.mPercentWidth = f;
    }

    public void setPercentX(float f) {
        this.mPercentX = f;
    }

    public void setPercentY(float f) {
        this.mPercentY = f;
    }

    public void setPositionType(Type type) {
        this.mPositionType = type;
    }

    public void setTarget(String str) {
        this.mTarget = str;
    }

    public void setTransitionEasing(String str) {
        this.mTransitionEasing = str;
    }

    public String toString() {
        StringBuilder m = BitVector$$ExternalSyntheticOutline0.m("KeyPositions:{\n");
        append(m, "target", this.mTarget);
        m.append("frame:");
        m.append(this.mFrame);
        m.append(",\n");
        if (this.mPositionType != null) {
            m.append("type:'");
            m.append(this.mPositionType);
            m.append("',\n");
        }
        append(m, "easing", this.mTransitionEasing);
        append(m, "percentX", this.mPercentX);
        append(m, "percentY", this.mPercentY);
        append(m, "percentWidth", this.mPercentWidth);
        append(m, "percentHeight", this.mPercentHeight);
        m.append("},\n");
        return m.toString();
    }
}
