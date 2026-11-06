package org.apache.commons.io.function;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes10.dex */
public final /* synthetic */ class IOFunction$$ExternalSyntheticLambda0 implements IOFunction {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ IOFunction f$0;
    public final /* synthetic */ IOFunction f$1;

    public /* synthetic */ IOFunction$$ExternalSyntheticLambda0(IOFunction iOFunction, IOFunction iOFunction2, int i) {
        this.$r8$classId = i;
        this.f$0 = iOFunction;
        this.f$1 = iOFunction2;
    }

    @Override // org.apache.commons.io.function.IOFunction
    public final Object apply(Object obj) {
        Object lambda$andThen$4;
        Object lambda$compose$0;
        switch (this.$r8$classId) {
            case 0:
                lambda$andThen$4 = this.f$0.lambda$andThen$4(this.f$1, obj);
                return lambda$andThen$4;
            default:
                lambda$compose$0 = this.f$0.lambda$compose$0(this.f$1, obj);
                return lambda$compose$0;
        }
    }
}
