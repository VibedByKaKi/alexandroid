package com.amazon.photos.uploader.internal.livedata;

import com.amazon.photos.uploader.UploadRequest;
import io.reactivex.rxjava3.functions.Function;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001e\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "Lcom/amazon/photos/uploader/UploadRequest;", "requests", "", "apply"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class RunningRequestProvider$attachThrottledLiveData$sortedSource$1<T, R> implements Function {
    public static final RunningRequestProvider$attachThrottledLiveData$sortedSource$1<T, R> INSTANCE = new RunningRequestProvider$attachThrottledLiveData$sortedSource$1<>();

    /* JADX INFO: Access modifiers changed from: private */
    public static final int apply$lambda$0(UploadRequest uploadRequest, UploadRequest uploadRequest2) {
        uploadRequest.getClass();
        uploadRequest2.getClass();
        return (int) (uploadRequest.getId() - uploadRequest2.getId());
    }

    @Override // io.reactivex.rxjava3.functions.Function
    @NotNull
    public final List<UploadRequest> apply(@NotNull Collection<UploadRequest> collection) {
        collection.getClass();
        List<UploadRequest> mutableList = CollectionsKt.toMutableList((Collection) collection);
        CollectionsKt.sortWith(mutableList, new RunningRequestProvider$attachThrottledLiveData$sortedSource$1$$ExternalSyntheticLambda0());
        return mutableList;
    }
}
