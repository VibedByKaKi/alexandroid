package com.dee.app.contacts.api.permissions;

import android.content.SharedPreferences;
import com.amazon.alexa.identity.MAPAccountService$$ExternalSyntheticLambda7;
import com.dee.app.contacts.api.AbstractContactApiAction;
import com.dee.app.contacts.common.utils.PermissionsUtils;
import com.dee.app.contacts.interfaces.models.apis.getauthstatus.GetContactsAuthStatusRequest;
import com.dee.app.contacts.interfaces.models.apis.getauthstatus.GetContactsAuthStatusResponse;
import com.dee.app.contacts.interfaces.models.data.enums.PermissionAuthStatus;
import javax.inject.Inject;
import rx.Observable;
import rx.Subscriber;
import rx.schedulers.Schedulers;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class ContactsGetAuthStatusApi extends AbstractContactApiAction<GetContactsAuthStatusRequest, GetContactsAuthStatusResponse> {
    private final PermissionsUtils mPermissionsUtils;

    @Inject
    public ContactsGetAuthStatusApi(SharedPreferences sharedPreferences, PermissionsUtils permissionsUtils) {
        super(sharedPreferences);
        this.mPermissionsUtils = permissionsUtils;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$handleAction$0(GetContactsAuthStatusRequest getContactsAuthStatusRequest, Subscriber subscriber) {
        PermissionAuthStatus permissionAuthStatus = this.mPermissionsUtils.getPermissionAuthStatus(getContactsAuthStatusRequest.getPermissionInfo());
        GetContactsAuthStatusResponse getContactsAuthStatusResponse = new GetContactsAuthStatusResponse();
        getContactsAuthStatusResponse.setStatus(permissionAuthStatus);
        subscriber.onNext(getContactsAuthStatusResponse);
    }

    @Override // com.dee.app.contacts.api.AbstractContactApiAction
    public Observable<GetContactsAuthStatusResponse> handleAction(GetContactsAuthStatusRequest getContactsAuthStatusRequest) {
        return Observable.create(new MAPAccountService$$ExternalSyntheticLambda7(this, getContactsAuthStatusRequest, 6)).subscribeOn(Schedulers.computation()).observeOn(Schedulers.computation());
    }
}
