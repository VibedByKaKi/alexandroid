package com.dee.app.contacts.api.permissions;

import android.content.SharedPreferences;
import com.amazon.alexa.identity.MAPAccountService$$ExternalSyntheticLambda7;
import com.dee.app.contacts.api.AbstractContactApiAction;
import com.dee.app.contacts.common.utils.PermissionsUtils;
import com.dee.app.contacts.interfaces.models.apis.requestauthstatus.RequestContactsPermissionRequest;
import com.dee.app.contacts.interfaces.models.apis.requestauthstatus.RequestContactsPermissionResponse;
import com.dee.app.contacts.interfaces.models.data.enums.RequestPermissionResult;
import javax.inject.Inject;
import rx.Observable;
import rx.Subscriber;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class ContactsRequestPermissionApi extends AbstractContactApiAction<RequestContactsPermissionRequest, RequestContactsPermissionResponse> {
    private final PermissionsUtils mPermissionsUtils;

    @Inject
    public ContactsRequestPermissionApi(SharedPreferences sharedPreferences, PermissionsUtils permissionsUtils) {
        super(sharedPreferences);
        this.mPermissionsUtils = permissionsUtils;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$handleAction$0(Subscriber subscriber, boolean z, RequestPermissionResult requestPermissionResult) {
        subscriber.onNext(new RequestContactsPermissionResponse(z, requestPermissionResult));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$handleAction$1(RequestContactsPermissionRequest requestContactsPermissionRequest, final Subscriber subscriber) {
        this.mPermissionsUtils.requestPermission(new PermissionsUtils.Listener() { // from class: com.dee.app.contacts.api.permissions.ContactsRequestPermissionApi$$ExternalSyntheticLambda1
            @Override // com.dee.app.contacts.common.utils.PermissionsUtils.Listener
            public final void complete(boolean z, RequestPermissionResult requestPermissionResult) {
                ContactsRequestPermissionApi.lambda$handleAction$0(Subscriber.this, z, requestPermissionResult);
            }
        }, requestContactsPermissionRequest.getPermissionInfo());
    }

    @Override // com.dee.app.contacts.api.AbstractContactApiAction
    public Observable<RequestContactsPermissionResponse> handleAction(RequestContactsPermissionRequest requestContactsPermissionRequest) {
        return Observable.create(new MAPAccountService$$ExternalSyntheticLambda7(this, requestContactsPermissionRequest, 7));
    }
}
