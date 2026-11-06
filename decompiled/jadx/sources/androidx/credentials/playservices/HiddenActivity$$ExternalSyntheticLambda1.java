package androidx.credentials.playservices;

import com.google.android.gms.tasks.OnFailureListener;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes13.dex */
public final /* synthetic */ class HiddenActivity$$ExternalSyntheticLambda1 implements OnFailureListener {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ HiddenActivity f$0;

    public /* synthetic */ HiddenActivity$$ExternalSyntheticLambda1(HiddenActivity hiddenActivity, int i) {
        this.$r8$classId = i;
        this.f$0 = hiddenActivity;
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public final void onFailure(Exception exc) {
        int i = this.$r8$classId;
        HiddenActivity hiddenActivity = this.f$0;
        switch (i) {
            case 0:
                HiddenActivity.handleCreatePublicKeyCredential$lambda$2$lambda$1(hiddenActivity, exc);
                break;
            case 1:
                HiddenActivity.handleCreatePassword$lambda$14$lambda$13(hiddenActivity, exc);
                break;
            case 2:
                HiddenActivity.handleGetSignInIntent$lambda$6$lambda$5(hiddenActivity, exc);
                break;
            default:
                HiddenActivity.handleBeginSignIn$lambda$10$lambda$9(hiddenActivity, exc);
                break;
        }
    }
}
