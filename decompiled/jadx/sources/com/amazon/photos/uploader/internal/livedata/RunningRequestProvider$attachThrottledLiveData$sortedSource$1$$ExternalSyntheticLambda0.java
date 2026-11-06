package com.amazon.photos.uploader.internal.livedata;

import com.amazon.photos.uploader.UploadRequest;
import java.util.Comparator;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public final /* synthetic */ class RunningRequestProvider$attachThrottledLiveData$sortedSource$1$$ExternalSyntheticLambda0 implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int apply$lambda$0;
        apply$lambda$0 = RunningRequestProvider$attachThrottledLiveData$sortedSource$1.apply$lambda$0((UploadRequest) obj, (UploadRequest) obj2);
        return apply$lambda$0;
    }
}
