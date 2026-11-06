package com.amazon.deecomms.contacts.ui;

import android.view.View;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public final /* synthetic */ class ContactCardFragment$$ExternalSyntheticLambda1 implements View.OnClickListener {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ ContactCardFragment f$0;

    public /* synthetic */ ContactCardFragment$$ExternalSyntheticLambda1(ContactCardFragment contactCardFragment, int i) {
        this.$r8$classId = i;
        this.f$0 = contactCardFragment;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.$r8$classId;
        ContactCardFragment contactCardFragment = this.f$0;
        switch (i) {
            case 0:
                contactCardFragment.lambda$showDropInWarningDialog$14(view);
                break;
            case 1:
                contactCardFragment.lambda$init$8(view);
                break;
            case 2:
                contactCardFragment.lambda$init$9(view);
                break;
            case 3:
                contactCardFragment.lambda$init$10(view);
                break;
            case 4:
                contactCardFragment.onBlockContactLinkClicked(view);
                break;
            case 5:
                contactCardFragment.onToggleCallerId(view);
                break;
            case 6:
                contactCardFragment.onToggleVoiceMsgConsent(view);
                break;
            case 7:
                contactCardFragment.lambda$init$11(view);
                break;
            case 8:
                contactCardFragment.lambda$onCreateView$0(view);
                break;
            case 9:
                contactCardFragment.lambda$showDropInWarningDialog$15(view);
                break;
            default:
                contactCardFragment.lambda$updateViews$12(view);
                break;
        }
    }
}
