package com.amazon.deecomms.oobe.fragments;

import com.amazon.deecomms.oobe.fragments.SSOUserSelectionFragment;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public final /* synthetic */ class SSOUserSelectionFragment$UserListCallback$$ExternalSyntheticLambda0 implements Runnable {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ SSOUserSelectionFragment.UserListCallback f$0;

    public /* synthetic */ SSOUserSelectionFragment$UserListCallback$$ExternalSyntheticLambda0(SSOUserSelectionFragment.UserListCallback userListCallback, int i) {
        this.$r8$classId = i;
        this.f$0 = userListCallback;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.$r8$classId;
        SSOUserSelectionFragment.UserListCallback userListCallback = this.f$0;
        switch (i) {
            case 0:
                userListCallback.lambda$onFailure$0();
                break;
            default:
                userListCallback.lambda$onResult$1();
                break;
        }
    }
}
