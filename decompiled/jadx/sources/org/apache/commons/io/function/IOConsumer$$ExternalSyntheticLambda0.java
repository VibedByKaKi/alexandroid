package org.apache.commons.io.function;

import java.util.function.Consumer;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes10.dex */
public final /* synthetic */ class IOConsumer$$ExternalSyntheticLambda0 implements IOConsumer {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;
    public final /* synthetic */ Object f$1;

    public /* synthetic */ IOConsumer$$ExternalSyntheticLambda0(IOFunction iOFunction, IOConsumer iOConsumer) {
        this.$r8$classId = 1;
        this.f$1 = iOFunction;
        this.f$0 = iOConsumer;
    }

    @Override // org.apache.commons.io.function.IOConsumer
    public final void accept(Object obj) {
        switch (this.$r8$classId) {
            case 0:
                ((IOConsumer) this.f$0).lambda$andThen$1((IOConsumer) this.f$1, obj);
                break;
            case 1:
                ((IOFunction) this.f$1).lambda$andThen$6((IOConsumer) this.f$0, obj);
                break;
            default:
                ((IOFunction) this.f$0).lambda$andThen$7((Consumer) this.f$1, obj);
                break;
        }
    }

    public /* synthetic */ IOConsumer$$ExternalSyntheticLambda0(Object obj, Object obj2, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = obj2;
    }
}
