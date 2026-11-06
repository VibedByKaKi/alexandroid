package com.amazon.apl.android.content;

import android.net.Uri;
import androidx.annotation.NonNull;
import androidx.work.impl.Schedulers$$ExternalSyntheticLambda1;
import com.amazon.apl.android.dependencies.IContentRetriever;
import com.amazon.apl.android.thread.Threading;
import it.innove.Peripheral$$ExternalSyntheticLambda7;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class ContentRetriever<T> implements IContentRetriever<Uri, T> {
    private final Executor mExecutor;
    private final Map<String, RequestHandler<T>> mRequestHandlers;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface RequestHandler<T> extends IContentRetriever<Uri, T> {
        @NonNull
        List<String> supportedSchemes();
    }

    public ContentRetriever(Executor executor) {
        this.mRequestHandlers = new ConcurrentHashMap();
        this.mExecutor = executor;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: fetchInternal, reason: merged with bridge method [inline-methods] */
    public void lambda$fetchV2$3(Uri uri, Map<String, String> map, IContentRetriever.SuccessCallback<Uri, T> successCallback, IContentRetriever.FailureCallbackV2<Uri> failureCallbackV2) {
        String scheme = uri.getScheme();
        if (scheme == null) {
            failureCallbackV2.onFailure(uri, "No scheme for source", 0);
            return;
        }
        RequestHandler<T> requestHandler = this.mRequestHandlers.get(scheme);
        if (requestHandler == null) {
            failureCallbackV2.onFailure(uri, "No handler registered for source", 0);
        } else {
            requestHandler.fetchV2(uri, map, successCallback, failureCallbackV2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$fetch$1(Uri uri, IContentRetriever.SuccessCallback successCallback, IContentRetriever.FailureCallback failureCallback) {
        lambda$fetchV2$3(uri, Collections.EMPTY_MAP, successCallback, new ContentRetriever$$ExternalSyntheticLambda2(failureCallback, 0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$fetchV2$2(Uri uri, IContentRetriever.SuccessCallback successCallback, IContentRetriever.FailureCallbackV2 failureCallbackV2) {
        lambda$fetchV2$3(uri, Collections.EMPTY_MAP, successCallback, failureCallbackV2);
    }

    public ContentRetriever<T> addRequestHandler(RequestHandler<T> requestHandler) {
        Iterator<String> it2 = requestHandler.supportedSchemes().iterator();
        while (it2.hasNext()) {
            this.mRequestHandlers.put(it2.next(), requestHandler);
        }
        return this;
    }

    @Override // com.amazon.apl.android.dependencies.IContentRetriever
    public void fetch(@NonNull Uri uri, @NonNull IContentRetriever.SuccessCallback<Uri, T> successCallback, @NonNull IContentRetriever.FailureCallback<Uri> failureCallback) {
        this.mExecutor.execute(new Schedulers$$ExternalSyntheticLambda1(16, this, uri, successCallback, failureCallback));
    }

    @Override // com.amazon.apl.android.dependencies.IContentRetriever
    public void fetchV2(@NonNull Uri uri, @NonNull IContentRetriever.SuccessCallback<Uri, T> successCallback, @NonNull IContentRetriever.FailureCallbackV2<Uri> failureCallbackV2) {
        this.mExecutor.execute(new Schedulers$$ExternalSyntheticLambda1(15, this, uri, successCallback, failureCallbackV2));
    }

    public ContentRetriever() {
        this(Threading.THREAD_POOL_EXECUTOR);
    }

    @Override // com.amazon.apl.android.dependencies.IContentRetriever
    public /* bridge */ /* synthetic */ void fetchV2(@NonNull Uri uri, @NonNull Map map, @NonNull IContentRetriever.SuccessCallback successCallback, @NonNull IContentRetriever.FailureCallbackV2<Uri> failureCallbackV2) {
        fetchV22(uri, (Map<String, String>) map, successCallback, failureCallbackV2);
    }

    /* renamed from: fetchV2, reason: avoid collision after fix types in other method */
    public void fetchV22(@NonNull Uri uri, @NonNull Map<String, String> map, @NonNull IContentRetriever.SuccessCallback<Uri, T> successCallback, @NonNull IContentRetriever.FailureCallbackV2<Uri> failureCallbackV2) {
        this.mExecutor.execute(new Peripheral$$ExternalSyntheticLambda7(4, this, uri, map, successCallback, failureCallbackV2));
    }
}
