package androidx.media3.common;

import androidx.media3.common.SimpleBasePlayer;
import com.google.common.base.Supplier;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes14.dex */
public final /* synthetic */ class SimpleBasePlayer$$ExternalSyntheticLambda1 implements Supplier {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ SimpleBasePlayer.State f$0;
    public final /* synthetic */ int f$1;

    public /* synthetic */ SimpleBasePlayer$$ExternalSyntheticLambda1(SimpleBasePlayer.State state, int i, int i2) {
        this.$r8$classId = i2;
        this.f$0 = state;
        this.f$1 = i;
    }

    @Override // com.google.common.base.Supplier
    public final Object get() {
        SimpleBasePlayer.State lambda$setDeviceVolume$22;
        SimpleBasePlayer.State lambda$setDeviceVolume$23;
        SimpleBasePlayer.State lambda$setRepeatMode$8;
        switch (this.$r8$classId) {
            case 0:
                lambda$setDeviceVolume$22 = SimpleBasePlayer.lambda$setDeviceVolume$22(this.f$0, this.f$1);
                return lambda$setDeviceVolume$22;
            case 1:
                lambda$setDeviceVolume$23 = SimpleBasePlayer.lambda$setDeviceVolume$23(this.f$0, this.f$1);
                return lambda$setDeviceVolume$23;
            default:
                lambda$setRepeatMode$8 = SimpleBasePlayer.lambda$setRepeatMode$8(this.f$0, this.f$1);
                return lambda$setRepeatMode$8;
        }
    }
}
