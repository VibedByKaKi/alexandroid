package com.amazon.alexa.smarthomecameras.player;

import com.amazon.alexa.redesign.view.homeFeed.CardLoadingStatusMap;
import com.amazon.leapfrogmapgl.indoor.NativeIndoorViewManager;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public final /* synthetic */ class VideoPlayer$$ExternalSyntheticLambda2 implements Function0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;
    public final /* synthetic */ boolean f$1;

    public /* synthetic */ VideoPlayer$$ExternalSyntheticLambda2(boolean z, String str) {
        this.$r8$classId = 2;
        this.f$1 = z;
        this.f$0 = str;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Unit onMicrophoneStateChanged$lambda$0;
        Unit addCardToAllEvents$lambda$0;
        Unit applyDebugCommand$lambda$44;
        switch (this.$r8$classId) {
            case 0:
                onMicrophoneStateChanged$lambda$0 = VideoPlayer.onMicrophoneStateChanged$lambda$0((VideoPlayer) this.f$0, this.f$1);
                return onMicrophoneStateChanged$lambda$0;
            case 1:
                addCardToAllEvents$lambda$0 = CardLoadingStatusMap.addCardToAllEvents$lambda$0((String) this.f$0, this.f$1);
                return addCardToAllEvents$lambda$0;
            default:
                applyDebugCommand$lambda$44 = NativeIndoorViewManager.applyDebugCommand$lambda$44(this.f$1, (String) this.f$0);
                return applyDebugCommand$lambda$44;
        }
    }

    public /* synthetic */ VideoPlayer$$ExternalSyntheticLambda2(Object obj, boolean z, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = z;
    }
}
