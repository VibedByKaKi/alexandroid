package com.amazon.dee.app.elements.bridges;

import android.view.PixelCopy;
import com.amazon.alexa.pmi.implementation.taplatency.PixelCopyChangeDetector;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ScreenSnapshotModule$$ExternalSyntheticLambda22 implements PixelCopy.OnPixelCopyFinishedListener {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Function1 f$0;

    public /* synthetic */ ScreenSnapshotModule$$ExternalSyntheticLambda22(Function1 function1, int i) {
        this.$r8$classId = i;
        this.f$0 = function1;
    }

    @Override // android.view.PixelCopy.OnPixelCopyFinishedListener
    public final void onPixelCopyFinished(int i) {
        int i2 = this.$r8$classId;
        Function1 function1 = this.f$0;
        switch (i2) {
            case 0:
                ScreenSnapshotModule.pixelCopier$lambda$3$lambda$2(function1, i);
                break;
            default:
                PixelCopyChangeDetector._init_$lambda$1$lambda$0(function1, i);
                break;
        }
    }
}
