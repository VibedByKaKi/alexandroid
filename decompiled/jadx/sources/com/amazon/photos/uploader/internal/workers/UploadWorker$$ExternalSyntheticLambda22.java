package com.amazon.photos.uploader.internal.workers;

import androidx.concurrent.futures.CallbackToFutureAdapter;
import androidx.media3.common.util.Clock;
import androidx.media3.exoplayer.upstream.experimental.SlidingWeightedAverageBandwidthStatistic;
import java.util.Deque;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public final /* synthetic */ class UploadWorker$$ExternalSyntheticLambda22 implements SlidingWeightedAverageBandwidthStatistic.SampleEvictionFunction, CallbackToFutureAdapter.Resolver {
    public final /* synthetic */ Object f$0;
    public final /* synthetic */ long f$1;

    public /* synthetic */ UploadWorker$$ExternalSyntheticLambda22(long j, Clock clock) {
        this.f$1 = j;
        this.f$0 = clock;
    }

    @Override // androidx.concurrent.futures.CallbackToFutureAdapter.Resolver
    public Object attachCompleter(CallbackToFutureAdapter.Completer completer) {
        Object startUpload$lambda$0;
        startUpload$lambda$0 = UploadWorker.startUpload$lambda$0((UploadWorker) this.f$0, this.f$1, completer);
        return startUpload$lambda$0;
    }

    @Override // androidx.media3.exoplayer.upstream.experimental.SlidingWeightedAverageBandwidthStatistic.SampleEvictionFunction
    public boolean shouldEvictSample(Deque deque) {
        boolean lambda$getAgeBasedEvictionFunction$1;
        lambda$getAgeBasedEvictionFunction$1 = SlidingWeightedAverageBandwidthStatistic.lambda$getAgeBasedEvictionFunction$1(this.f$1, (Clock) this.f$0, deque);
        return lambda$getAgeBasedEvictionFunction$1;
    }

    public /* synthetic */ UploadWorker$$ExternalSyntheticLambda22(long j, UploadWorker uploadWorker) {
        this.f$0 = uploadWorker;
        this.f$1 = j;
    }
}
