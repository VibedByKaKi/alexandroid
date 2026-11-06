package androidx.constraintlayout.core.dsl;

import androidx.biometric.ErrorUtils$$ExternalSyntheticOutline0;
import androidx.compose.runtime.BitVector$$ExternalSyntheticOutline0;
import defpackage.a$$ExternalSyntheticOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes13.dex */
public class Transition {
    private String mConstraintSetEnd;
    private String mConstraintSetStart;
    private String mId;
    private OnSwipe mOnSwipe = null;
    final int UNSET = -1;
    private final int DEFAULT_DURATION = 400;
    private final float DEFAULT_STAGGER = 0.0f;
    private int mDefaultInterpolator = 0;
    private String mDefaultInterpolatorString = null;
    private int mDefaultInterpolatorID = -1;
    private int mDuration = 400;
    private float mStagger = 0.0f;
    private KeyFrames mKeyFrames = new KeyFrames();

    public Transition(String str, String str2) {
        this.mId = null;
        this.mConstraintSetEnd = null;
        this.mConstraintSetStart = null;
        this.mId = "default";
        this.mConstraintSetStart = str;
        this.mConstraintSetEnd = str2;
    }

    public String getId() {
        return this.mId;
    }

    public void setDuration(int i) {
        this.mDuration = i;
    }

    public void setFrom(String str) {
        this.mConstraintSetStart = str;
    }

    public void setId(String str) {
        this.mId = str;
    }

    public void setKeyFrames(Keys keys) {
        this.mKeyFrames.add(keys);
    }

    public void setOnSwipe(OnSwipe onSwipe) {
        this.mOnSwipe = onSwipe;
    }

    public void setStagger(float f) {
        this.mStagger = f;
    }

    public void setTo(String str) {
        this.mConstraintSetEnd = str;
    }

    public String toJson() {
        return toString();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.mId);
        sb.append(":{\nfrom:'");
        sb.append(this.mConstraintSetStart);
        sb.append("',\nto:'");
        String m = a$$ExternalSyntheticOutline0.m(sb, this.mConstraintSetEnd, "',\n");
        if (this.mDuration != 400) {
            m = a$$ExternalSyntheticOutline0.m(a$$ExternalSyntheticOutline0.m1m(m, "duration:"), this.mDuration, ",\n");
        }
        if (this.mStagger != 0.0f) {
            m = ErrorUtils$$ExternalSyntheticOutline0.m(a$$ExternalSyntheticOutline0.m1m(m, "stagger:"), ",\n", this.mStagger);
        }
        if (this.mOnSwipe != null) {
            StringBuilder m2 = BitVector$$ExternalSyntheticOutline0.m(m);
            m2.append(this.mOnSwipe.toString());
            m = m2.toString();
        }
        StringBuilder m3 = BitVector$$ExternalSyntheticOutline0.m(m);
        m3.append(this.mKeyFrames.toString());
        return m3.toString().concat("},\n");
    }

    public Transition(String str, String str2, String str3) {
        this.mId = null;
        this.mConstraintSetEnd = null;
        this.mConstraintSetStart = null;
        this.mId = str;
        this.mConstraintSetStart = str2;
        this.mConstraintSetEnd = str3;
    }
}
