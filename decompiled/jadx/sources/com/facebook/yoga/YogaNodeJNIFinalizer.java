package com.facebook.yoga;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes7.dex */
public class YogaNodeJNIFinalizer extends YogaNodeJNIBase {
    public YogaNodeJNIFinalizer() {
    }

    public void finalize() throws Throwable {
        try {
            freeNatives();
        } finally {
            super.finalize();
        }
    }

    public void freeNatives() {
        long j = this.mNativePointer;
        if (j != 0) {
            this.mNativePointer = 0L;
            YogaNative.jni_YGNodeFinalizeJNI(j);
        }
    }

    public YogaNodeJNIFinalizer(YogaConfig yogaConfig) {
        super(yogaConfig);
    }
}
