package androidx.profileinstaller;

import android.content.Context;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes14.dex */
public final /* synthetic */ class ProfileInstallerInitializer$$ExternalSyntheticLambda1 implements Runnable {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Context f$0;

    public /* synthetic */ ProfileInstallerInitializer$$ExternalSyntheticLambda1(Context context, int i) {
        this.$r8$classId = i;
        this.f$0 = context;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.$r8$classId;
        Context context = this.f$0;
        switch (i) {
            case 0:
                ProfileInstallerInitializer.writeInBackground(context);
                break;
            default:
                ProfileInstaller.writeProfile(context);
                break;
        }
    }
}
