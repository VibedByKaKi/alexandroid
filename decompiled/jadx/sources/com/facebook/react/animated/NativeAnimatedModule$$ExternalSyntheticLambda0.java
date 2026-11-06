package com.facebook.react.animated;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public final /* synthetic */ class NativeAnimatedModule$$ExternalSyntheticLambda0 implements AnimatedNodeValueListener {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ NativeAnimatedModule f$0;
    public final /* synthetic */ int f$1;

    public /* synthetic */ NativeAnimatedModule$$ExternalSyntheticLambda0(NativeAnimatedModule nativeAnimatedModule, int i, int i2) {
        this.$r8$classId = i2;
        this.f$0 = nativeAnimatedModule;
        this.f$1 = i;
    }

    @Override // com.facebook.react.animated.AnimatedNodeValueListener
    public final void onValueUpdate(double d, double d2) {
        switch (this.$r8$classId) {
            case 0:
                NativeAnimatedModule.startListeningToAnimatedNodeValue$lambda$6(this.f$0, this.f$1, d, d2);
                break;
            default:
                NativeAnimatedModule$queueAndExecuteBatchedOperations$1.execute$lambda$1(this.f$0, this.f$1, d, d2);
                break;
        }
    }
}
