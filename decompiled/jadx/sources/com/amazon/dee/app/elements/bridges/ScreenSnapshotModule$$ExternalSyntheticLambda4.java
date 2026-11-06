package com.amazon.dee.app.elements.bridges;

import android.graphics.Bitmap;
import com.facebook.react.bridge.Promise;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ScreenSnapshotModule$$ExternalSyntheticLambda4 implements Function0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Bitmap f$0;
    public final /* synthetic */ Promise f$1;

    public /* synthetic */ ScreenSnapshotModule$$ExternalSyntheticLambda4(Bitmap bitmap, Promise promise, int i) {
        this.$r8$classId = i;
        this.f$0 = bitmap;
        this.f$1 = promise;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Unit encodeChrome$lambda$11;
        Unit encode$lambda$37;
        switch (this.$r8$classId) {
            case 0:
                encodeChrome$lambda$11 = ScreenSnapshotModule.encodeChrome$lambda$11(this.f$0, this.f$1);
                return encodeChrome$lambda$11;
            default:
                encode$lambda$37 = ScreenSnapshotModule.encode$lambda$37(this.f$0, this.f$1);
                return encode$lambda$37;
        }
    }
}
