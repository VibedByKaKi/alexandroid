package com.dee.app.contactsLibrary.db.reduxpersist.contacts;

import androidx.annotation.NonNull;
import com.dee.app.contacts.common.utils.JsonUtils;
import com.dee.app.contacts.interfaces.models.apis.querycontacts.QueryContactsWithAttributesRequest;
import com.dee.app.contacts.interfaces.models.apis.querycontacts.QueryContactsWithAttributesResponse;
import com.dee.app.contactsLibrary.db.reduxpersist.AbstractReduxPersistDBAction;
import com.dee.app.contactsLibrary.db.reduxpersist.RequestResponseEventBus;
import com.dee.app.contactsLibrary.db.reduxpersist.model.DBOperationResponseStatus;
import com.dee.app.contactsLibrary.db.reduxpersist.model.ReduxDBOperationRequest;
import com.dee.app.contactsLibrary.db.reduxpersist.model.ReduxDBOperationResponse;
import com.dee.app.contactsLibrary.db.reduxpersist.model.ReduxDBOperationType;
import com.dee.app.sync.api.sync.CanSyncContactsApi$$ExternalSyntheticLambda0;
import javax.inject.Inject;
import rx.Observable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class QueryContactAttributesDBHandler extends AbstractReduxPersistDBAction<QueryContactsWithAttributesRequest, QueryContactsWithAttributesResponse> {
    @Inject
    public QueryContactAttributesDBHandler(@NonNull RequestResponseEventBus requestResponseEventBus) {
        super(requestResponseEventBus);
    }

    private Observable<QueryContactsWithAttributesResponse> handleQueryContactAttributesRequest(QueryContactsWithAttributesRequest queryContactsWithAttributesRequest) {
        ReduxDBOperationRequest reduxDBOperationRequest = new ReduxDBOperationRequest();
        reduxDBOperationRequest.setOperationType(ReduxDBOperationType.QUERY_CONTACT_ATTRIBUTES);
        reduxDBOperationRequest.setPayload(queryContactsWithAttributesRequest);
        return processDBRequest(reduxDBOperationRequest).map(new CanSyncContactsApi$$ExternalSyntheticLambda0(18));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ QueryContactsWithAttributesResponse lambda$handleQueryContactAttributesRequest$0(String str) {
        ReduxDBOperationResponse reduxDBOperationResponse = (ReduxDBOperationResponse) JsonUtils.fromJson(str, ReduxDBOperationResponse.class);
        QueryContactsWithAttributesResponse queryContactsWithAttributesResponse = new QueryContactsWithAttributesResponse();
        queryContactsWithAttributesResponse.setSuccess(reduxDBOperationResponse.getStatus() == DBOperationResponseStatus.SUCCESS);
        queryContactsWithAttributesResponse.setOutput((String) reduxDBOperationResponse.getOutput());
        return queryContactsWithAttributesResponse;
    }

    @Override // com.dee.app.contactsLibrary.db.reduxpersist.AbstractReduxPersistDBAction
    public Observable<QueryContactsWithAttributesResponse> handleAction(QueryContactsWithAttributesRequest queryContactsWithAttributesRequest) {
        return handleQueryContactAttributesRequest(queryContactsWithAttributesRequest);
    }
}
