package androidx.profileinstaller;

import androidx.profileinstaller.ProfileInstaller;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes14.dex */
public final /* synthetic */ class ProfileInstaller$$ExternalSyntheticLambda0 implements Runnable {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ ProfileInstaller.DiagnosticsCallback f$0;
    public final /* synthetic */ int f$1;
    public final /* synthetic */ Object f$2;

    public /* synthetic */ ProfileInstaller$$ExternalSyntheticLambda0(ProfileInstaller.DiagnosticsCallback diagnosticsCallback, int i, Object obj, int i2) {
        this.$r8$classId = i2;
        this.f$0 = diagnosticsCallback;
        this.f$1 = i;
        this.f$2 = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.onResultReceived(this.f$1, this.f$2);
                break;
            default:
                this.f$0.onDiagnosticReceived(this.f$1, this.f$2);
                break;
        }
    }
}
