package com.amazon.photos.uploader.observables;

import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.schedulers.Schedulers;
import kotlin.Metadata;
import okio.Buffer$$ExternalSyntheticBUOutline0;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u001a\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007H&J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\tH&J\u0010\u0010\n\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u000b"}, d2 = {"Lcom/amazon/photos/uploader/observables/UploadSummaryObservable;", "", "addObserver", "", "observer", "Lcom/amazon/photos/uploader/observables/UploadSummaryObserver;", "scheduler", "Lio/reactivex/rxjava3/core/Scheduler;", "worker", "Lio/reactivex/rxjava3/core/Scheduler$Worker;", "removeObserver", "AndroidPhotosUploader_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public interface UploadSummaryObservable {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class DefaultImpls {
        public static /* synthetic */ boolean addObserver$default(UploadSummaryObservable uploadSummaryObservable, UploadSummaryObserver uploadSummaryObserver, Scheduler scheduler, int i, Object obj) {
            if (obj != null) {
                Buffer$$ExternalSyntheticBUOutline0.m$1("Super calls with default arguments not supported in this target, function: addObserver");
                return false;
            }
            if ((i & 2) != 0) {
                scheduler = Schedulers.computation();
                scheduler.getClass();
            }
            return uploadSummaryObservable.addObserver(uploadSummaryObserver, scheduler);
        }
    }

    boolean addObserver(@NotNull UploadSummaryObserver observer, @NotNull Scheduler.Worker worker);

    boolean addObserver(@NotNull UploadSummaryObserver observer, @NotNull Scheduler scheduler);

    boolean removeObserver(@NotNull UploadSummaryObserver observer);
}
