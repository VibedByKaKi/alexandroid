package com.dee.app.sync.api.sync;

import com.dee.app.contacts.interfaces.models.apis.synccontacts.ContactsUpSyncResponse;
import rx.functions.Action1;
import rx.functions.Func1;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public final /* synthetic */ class ContactsUpSyncApi$$ExternalSyntheticLambda4 implements Func1, Action1 {
    public final /* synthetic */ ContactsUpSyncApi f$0;

    public /* synthetic */ ContactsUpSyncApi$$ExternalSyntheticLambda4(ContactsUpSyncApi contactsUpSyncApi) {
        this.f$0 = contactsUpSyncApi;
    }

    @Override // rx.functions.Func1
    public Object call(Object obj) {
        ContactsUpSyncResponse lambda$handleUpSyncContactsAction$4;
        lambda$handleUpSyncContactsAction$4 = this.f$0.lambda$handleUpSyncContactsAction$4((Boolean) obj);
        return lambda$handleUpSyncContactsAction$4;
    }

    @Override // rx.functions.Action1
    /* renamed from: call */
    public void mo8903call(Object obj) {
        this.f$0.lambda$handleUpSyncContactsAction$5((Throwable) obj);
    }
}
