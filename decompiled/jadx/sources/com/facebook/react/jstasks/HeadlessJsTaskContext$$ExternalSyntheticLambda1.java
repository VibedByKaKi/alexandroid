package com.facebook.react.jstasks;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public final /* synthetic */ class HeadlessJsTaskContext$$ExternalSyntheticLambda1 implements Runnable {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ HeadlessJsTaskContext f$0;
    public final /* synthetic */ int f$1;

    public /* synthetic */ HeadlessJsTaskContext$$ExternalSyntheticLambda1(HeadlessJsTaskContext headlessJsTaskContext, int i, int i2) {
        this.$r8$classId = i2;
        this.f$0 = headlessJsTaskContext;
        this.f$1 = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.finishTask(this.f$1);
                break;
            default:
                HeadlessJsTaskContext.finishTask$lambda$4(this.f$0, this.f$1);
                break;
        }
    }
}
