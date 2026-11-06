package com.google.firebase.installations;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes8.dex */
public final /* synthetic */ class FirebaseInstallations$$ExternalSyntheticLambda1 implements Runnable {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ FirebaseInstallations f$0;
    public final /* synthetic */ boolean f$1;

    public /* synthetic */ FirebaseInstallations$$ExternalSyntheticLambda1(FirebaseInstallations firebaseInstallations, boolean z, int i) {
        this.$r8$classId = i;
        this.f$0 = firebaseInstallations;
        this.f$1 = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$doRegistrationOrRefresh$3(this.f$1);
                break;
            default:
                this.f$0.lambda$getToken$2(this.f$1);
                break;
        }
    }
}
