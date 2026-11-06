package androidx.compose.foundation.text.input.internal;

import java.util.function.IntConsumer;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes.dex */
public final /* synthetic */ class Api34PerformHandwritingGestureImpl$$ExternalSyntheticLambda0 implements Runnable {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ IntConsumer f$0;
    public final /* synthetic */ int f$1;

    public /* synthetic */ Api34PerformHandwritingGestureImpl$$ExternalSyntheticLambda0(IntConsumer intConsumer, int i, int i2) {
        this.$r8$classId = i2;
        this.f$0 = intConsumer;
        this.f$1 = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.accept(this.f$1);
                break;
            default:
                this.f$0.accept(this.f$1);
                break;
        }
    }
}
