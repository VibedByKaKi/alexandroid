package com.amazon.alexa.accessory.frames.amazonphotos;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.amazon.alexa.accessory.frames.utils.Log;
import com.amazon.photos.uploader.ResultMetadata;
import com.amazon.photos.uploader.UploadErrorCategory;
import com.amazon.photos.uploader.UploadRequest;
import com.amazon.photos.uploader.blockers.Blocker;
import com.amazon.photos.uploader.observables.AbandonedRequestInfo;
import com.amazon.photos.uploader.observables.UploadRequestObserver;
import java.util.List;
import java.util.Set;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes15.dex */
public class FramesUploadRequestObserver implements UploadRequestObserver {
    private static final String TAG = "FramesUploadRequestObserver";

    @Override // com.amazon.photos.uploader.observables.UploadRequestObserver
    public void onRequestAdded(@NonNull UploadRequest uploadRequest) {
        Log.d(TAG, "onRequestAdded");
    }

    @Override // com.amazon.photos.uploader.observables.UploadRequestObserver
    public void onRequestsAbandoned(@NonNull List<AbandonedRequestInfo> list) {
        Log.d(TAG, "onRequestsAbandoned");
    }

    @Override // com.amazon.photos.uploader.observables.UploadRequestObserver
    public void onUploadBlocked(@NonNull UploadRequest uploadRequest, @NonNull Blocker blocker) {
        Log.d(TAG, "onUploadBlocked");
    }

    @Override // com.amazon.photos.uploader.observables.UploadRequestObserver
    public void onUploadFailed(@NonNull UploadRequest uploadRequest, @Nullable Throwable th, @NonNull UploadErrorCategory uploadErrorCategory) {
        Log.d(TAG, "onUploadFailed");
    }

    @Override // com.amazon.photos.uploader.observables.UploadRequestObserver
    public void onUploadProgressUpdate(@NonNull UploadRequest uploadRequest, long j, long j2) {
        Log.d(TAG, "onUploadProgressUpdate");
    }

    @Override // com.amazon.photos.uploader.observables.UploadRequestObserver
    public void onUploadStarted(@NonNull UploadRequest uploadRequest) {
        Log.d(TAG, "onUploadStarted");
    }

    @Override // com.amazon.photos.uploader.observables.UploadRequestObserver
    public void onUploadSucceeded(@NonNull UploadRequest uploadRequest, @NonNull ResultMetadata resultMetadata) {
        Log.d(TAG, "onUploadSucceeded");
    }

    @Override // com.amazon.photos.uploader.observables.UploadRequestObserver
    public void onUploadBlocked(@NonNull UploadRequest uploadRequest, @NonNull Set<? extends Blocker> set) {
        Log.d(TAG, "onUploadBlocked");
    }
}
