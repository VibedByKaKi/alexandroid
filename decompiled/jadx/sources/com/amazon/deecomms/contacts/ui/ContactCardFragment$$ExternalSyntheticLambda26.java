package com.amazon.deecomms.contacts.ui;

import android.view.View;
import com.amazon.deecomms.contacts.database.ContactEntry;
import com.amazon.deecomms.contacts.model.ContactPhoneNumber;
import com.amazon.deecomms.contacts.ui.CallBottomSheetAdapter;
import com.amazon.deecomms.contacts.ui.ContactBlockFragment;
import com.amazon.deecomms.contacts.ui.ContactCardFragment;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public final /* synthetic */ class ContactCardFragment$$ExternalSyntheticLambda26 implements View.OnClickListener {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;
    public final /* synthetic */ Object f$1;

    public /* synthetic */ ContactCardFragment$$ExternalSyntheticLambda26(Object obj, Object obj2, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = obj2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.$r8$classId) {
            case 0:
                ((ContactCardFragment) this.f$0).lambda$updateUserInfo$7((ContactPhoneNumber) this.f$1, view);
                break;
            case 1:
                ((ContactBlockFragment.ContactViewHolder) this.f$0).lambda$setOnContactSelectedListener$0((ContactBlockFragment.OnContactSelectedListener) this.f$1, view);
                break;
            case 2:
                ((ContactCardFragment.ChildAccountListUpdateSubscriber) this.f$0).lambda$onCall$0((ContactEntry) this.f$1, view);
                break;
            case 3:
                ((ContactCardFragment.ChildContactListUpdateSubscriber) this.f$0).lambda$onCall$0((ContactEntry) this.f$1, view);
                break;
            case 4:
                ((ContactCardFragment.DropInListUpdateSubscriber) this.f$0).lambda$onCall$0((String) this.f$1, view);
                break;
            default:
                CallBottomSheetAdapter.lambda$onBindViewHolder$0((CallBottomSheetAdapter.CallViewHolder) this.f$0, (ContactPhoneNumber) this.f$1, view);
                break;
        }
    }
}
