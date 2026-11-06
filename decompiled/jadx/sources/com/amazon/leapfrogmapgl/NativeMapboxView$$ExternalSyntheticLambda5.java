package com.amazon.leapfrogmapgl;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public final /* synthetic */ class NativeMapboxView$$ExternalSyntheticLambda5 implements Runnable {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ NativeMapboxView f$0;

    public /* synthetic */ NativeMapboxView$$ExternalSyntheticLambda5(NativeMapboxView nativeMapboxView, int i) {
        this.$r8$classId = i;
        this.f$0 = nativeMapboxView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.$r8$classId;
        NativeMapboxView nativeMapboxView = this.f$0;
        switch (i) {
            case 0:
                NativeMapboxView.scheduleMapInitialization$lambda$1(nativeMapboxView);
                break;
            case 1:
                NativeMapboxView.scheduleInitialMemoryTrim$lambda$18(nativeMapboxView);
                break;
            case 2:
                NativeMapboxView.settledProjectionDispatch$lambda$0(nativeMapboxView);
                break;
            case 3:
                NativeMapboxView.queueProjectionFrame$lambda$91(nativeMapboxView);
                break;
            default:
                NativeMapboxView.requestMapRepaint$lambda$72(nativeMapboxView);
                break;
        }
    }
}
