package androidx.media3.common;

import androidx.media3.common.SimpleBasePlayer;
import com.google.common.base.Supplier;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes14.dex */
public final /* synthetic */ class SimpleBasePlayer$$ExternalSyntheticLambda0 implements Supplier {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ SimpleBasePlayer.State f$0;
    public final /* synthetic */ boolean f$1;

    public /* synthetic */ SimpleBasePlayer$$ExternalSyntheticLambda0(SimpleBasePlayer.State state, boolean z, int i) {
        this.$r8$classId = i;
        this.f$0 = state;
        this.f$1 = z;
    }

    @Override // com.google.common.base.Supplier
    public final Object get() {
        SimpleBasePlayer.State lambda$setPlayWhenReady$1;
        SimpleBasePlayer.State lambda$setShuffleModeEnabled$9;
        SimpleBasePlayer.State lambda$setDeviceMuted$28;
        SimpleBasePlayer.State lambda$setDeviceMuted$29;
        switch (this.$r8$classId) {
            case 0:
                lambda$setPlayWhenReady$1 = SimpleBasePlayer.lambda$setPlayWhenReady$1(this.f$0, this.f$1);
                return lambda$setPlayWhenReady$1;
            case 1:
                lambda$setShuffleModeEnabled$9 = SimpleBasePlayer.lambda$setShuffleModeEnabled$9(this.f$0, this.f$1);
                return lambda$setShuffleModeEnabled$9;
            case 2:
                lambda$setDeviceMuted$28 = SimpleBasePlayer.lambda$setDeviceMuted$28(this.f$0, this.f$1);
                return lambda$setDeviceMuted$28;
            default:
                lambda$setDeviceMuted$29 = SimpleBasePlayer.lambda$setDeviceMuted$29(this.f$0, this.f$1);
                return lambda$setDeviceMuted$29;
        }
    }
}
