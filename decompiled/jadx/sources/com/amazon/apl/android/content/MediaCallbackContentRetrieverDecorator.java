package com.amazon.apl.android.content;

import android.net.Uri;
import androidx.annotation.NonNull;
import com.amazon.apl.android.IAPLViewPresenter;
import com.amazon.apl.android.dependencies.IContentRetriever;
import com.mapbox.maps.Snapshotter$$ExternalSyntheticLambda1;
import java.util.Collections;
import java.util.Map;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class MediaCallbackContentRetrieverDecorator<TResult> implements IContentRetriever<Uri, TResult> {
    private final IAPLViewPresenter mPresenter;
    private final IContentRetriever<Uri, TResult> mWrappedRetriever;

    private MediaCallbackContentRetrieverDecorator(IAPLViewPresenter iAPLViewPresenter, IContentRetriever<Uri, TResult> iContentRetriever) {
        this.mPresenter = iAPLViewPresenter;
        this.mWrappedRetriever = iContentRetriever;
    }

    public static <TResult> MediaCallbackContentRetrieverDecorator create(IAPLViewPresenter iAPLViewPresenter, IContentRetriever<Uri, TResult> iContentRetriever) {
        return new MediaCallbackContentRetrieverDecorator(iAPLViewPresenter, iContentRetriever);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$fetchV2$1(Uri uri, IContentRetriever.SuccessCallback successCallback, Uri uri2, Object obj) {
        this.mPresenter.mediaLoaded(uri.toString());
        successCallback.onSuccess(uri2, obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$fetchV2$2(Uri uri, IContentRetriever.FailureCallbackV2 failureCallbackV2, Uri uri2, String str, int i) {
        this.mPresenter.mediaLoadFailed(uri.toString(), i, str);
        failureCallbackV2.onFailure(uri2, str, i);
    }

    @Override // com.amazon.apl.android.dependencies.IContentRetriever
    public void fetch(@NonNull Uri uri, @NonNull IContentRetriever.SuccessCallback<Uri, TResult> successCallback, IContentRetriever.FailureCallback<Uri> failureCallback) {
        fetchV2(uri, (IContentRetriever.SuccessCallback) successCallback, (IContentRetriever.FailureCallbackV2<Uri>) new ContentRetriever$$ExternalSyntheticLambda2(failureCallback, 1));
    }

    /* renamed from: fetchV2, reason: avoid collision after fix types in other method */
    public void fetchV22(@NonNull Uri uri, @NonNull Map<String, String> map, @NonNull IContentRetriever.SuccessCallback<Uri, TResult> successCallback, IContentRetriever.FailureCallbackV2<Uri> failureCallbackV2) {
        this.mWrappedRetriever.fetchV2(uri, map, new Snapshotter$$ExternalSyntheticLambda1(this, 10, uri, successCallback), new Snapshotter$$ExternalSyntheticLambda1(this, 11, uri, failureCallbackV2));
    }

    @Override // com.amazon.apl.android.dependencies.IContentRetriever
    public /* bridge */ /* synthetic */ void fetchV2(@NonNull Uri uri, @NonNull Map map, @NonNull IContentRetriever.SuccessCallback successCallback, IContentRetriever.FailureCallbackV2<Uri> failureCallbackV2) {
        fetchV22(uri, (Map<String, String>) map, successCallback, failureCallbackV2);
    }

    @Override // com.amazon.apl.android.dependencies.IContentRetriever
    public void fetchV2(@NonNull Uri uri, @NonNull IContentRetriever.SuccessCallback<Uri, TResult> successCallback, IContentRetriever.FailureCallbackV2<Uri> failureCallbackV2) {
        fetchV22(uri, Collections.EMPTY_MAP, (IContentRetriever.SuccessCallback) successCallback, failureCallbackV2);
    }
}
