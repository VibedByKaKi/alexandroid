package androidx.media3.common;

import androidx.media3.common.SimpleBasePlayer;
import com.google.common.base.Supplier;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes14.dex */
public final /* synthetic */ class SimpleBasePlayer$$ExternalSyntheticLambda36 implements Supplier {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ SimpleBasePlayer.State f$0;

    public /* synthetic */ SimpleBasePlayer$$ExternalSyntheticLambda36(SimpleBasePlayer.State state, int i) {
        this.$r8$classId = i;
        this.f$0 = state;
    }

    @Override // com.google.common.base.Supplier
    public final Object get() {
        SimpleBasePlayer.State lambda$setVideoSurface$17;
        SimpleBasePlayer.State lambda$increaseDeviceVolume$25;
        SimpleBasePlayer.State lambda$decreaseDeviceVolume$26;
        SimpleBasePlayer.State lambda$release$13;
        SimpleBasePlayer.State lambda$clearVideoOutput$21;
        SimpleBasePlayer.State lambda$increaseDeviceVolume$24;
        SimpleBasePlayer.State lambda$prepare$7;
        SimpleBasePlayer.State lambda$decreaseDeviceVolume$27;
        int i = this.$r8$classId;
        SimpleBasePlayer.State state = this.f$0;
        switch (i) {
            case 0:
                lambda$setVideoSurface$17 = SimpleBasePlayer.lambda$setVideoSurface$17(state);
                return lambda$setVideoSurface$17;
            case 1:
                lambda$increaseDeviceVolume$25 = SimpleBasePlayer.lambda$increaseDeviceVolume$25(state);
                return lambda$increaseDeviceVolume$25;
            case 2:
                lambda$decreaseDeviceVolume$26 = SimpleBasePlayer.lambda$decreaseDeviceVolume$26(state);
                return lambda$decreaseDeviceVolume$26;
            case 3:
                lambda$release$13 = SimpleBasePlayer.lambda$release$13(state);
                return lambda$release$13;
            case 4:
                lambda$clearVideoOutput$21 = SimpleBasePlayer.lambda$clearVideoOutput$21(state);
                return lambda$clearVideoOutput$21;
            case 5:
                lambda$increaseDeviceVolume$24 = SimpleBasePlayer.lambda$increaseDeviceVolume$24(state);
                return lambda$increaseDeviceVolume$24;
            case 6:
                lambda$prepare$7 = SimpleBasePlayer.lambda$prepare$7(state);
                return lambda$prepare$7;
            default:
                lambda$decreaseDeviceVolume$27 = SimpleBasePlayer.lambda$decreaseDeviceVolume$27(state);
                return lambda$decreaseDeviceVolume$27;
        }
    }
}
