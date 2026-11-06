package com.amazon.deecomms.contacts.ui;

import com.amazon.deecomms.contacts.database.ContactEntry;
import java.util.List;
import java.util.concurrent.Callable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public final /* synthetic */ class ContactCardFragment$$ExternalSyntheticLambda0 implements Callable {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ ContactCardFragment f$0;

    public /* synthetic */ ContactCardFragment$$ExternalSyntheticLambda0(ContactCardFragment contactCardFragment, int i) {
        this.$r8$classId = i;
        this.f$0 = contactCardFragment;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        List lambda$updateDropInList$20;
        ContactEntry lambda$setupDropInToggleState$21;
        List lambda$updateChildContactList$23;
        List lambda$updateChildAccountList$22;
        int i = this.$r8$classId;
        ContactCardFragment contactCardFragment = this.f$0;
        switch (i) {
            case 0:
                lambda$updateDropInList$20 = contactCardFragment.lambda$updateDropInList$20();
                return lambda$updateDropInList$20;
            case 1:
                lambda$setupDropInToggleState$21 = contactCardFragment.lambda$setupDropInToggleState$21();
                return lambda$setupDropInToggleState$21;
            case 2:
                lambda$updateChildContactList$23 = contactCardFragment.lambda$updateChildContactList$23();
                return lambda$updateChildContactList$23;
            default:
                lambda$updateChildAccountList$22 = contactCardFragment.lambda$updateChildAccountList$22();
                return lambda$updateChildAccountList$22;
        }
    }
}
