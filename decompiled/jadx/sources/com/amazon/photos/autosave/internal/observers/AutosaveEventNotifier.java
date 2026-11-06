package com.amazon.photos.autosave.internal.observers;

import com.amazon.photos.autosave.AutosaveEventObserver;
import com.amazon.photos.autosave.model.MediaType;
import com.amazon.ptz.util.NtpClient$$ExternalSyntheticLambda0;
import com.dee.app.metrics.MetricsConstants;
import io.reactivex.rxjava3.core.Scheduler;
import it.innove.Peripheral$$ExternalSyntheticLambda4;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u000bJ\u0016\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u0006J\r\u0010\r\u001a\u00020\u000eH\u0000¢\u0006\u0002\b\u000fJ\u001d\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\bH\u0000¢\u0006\u0002\b\u0014J\r\u0010\u0015\u001a\u00020\u000eH\u0000¢\u0006\u0002\b\u0016J\u000e\u0010\u0017\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0005R\u001a\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0018"}, d2 = {"Lcom/amazon/photos/autosave/internal/observers/AutosaveEventNotifier;", "", "()V", "contentListeners", "Ljava/util/concurrent/ConcurrentHashMap;", "Lcom/amazon/photos/autosave/AutosaveEventObserver;", "Lio/reactivex/rxjava3/core/Scheduler$Worker;", "addObserver", "", "observer", "scheduler", "Lio/reactivex/rxjava3/core/Scheduler;", "worker", MetricsConstants.Method.CACHE_CLEAR, "", "clear$AndroidPhotosAutosave_release", "onAutosaveStateChanged", "mediaType", "Lcom/amazon/photos/autosave/model/MediaType;", "state", "onAutosaveStateChanged$AndroidPhotosAutosave_release", "onNoUploadsScanComplete", "onNoUploadsScanComplete$AndroidPhotosAutosave_release", "removeObserver", "AndroidPhotosAutosave_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nAutosaveEventNotifier.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AutosaveEventNotifier.kt\ncom/amazon/photos/autosave/internal/observers/AutosaveEventNotifier\n+ 2 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,53:1\n215#2,2:54\n215#2,2:56\n*S KotlinDebug\n*F\n+ 1 AutosaveEventNotifier.kt\ncom/amazon/photos/autosave/internal/observers/AutosaveEventNotifier\n*L\n38#1:54,2\n46#1:56,2\n*E\n"})
/* loaded from: classes5.dex */
public final class AutosaveEventNotifier {

    @NotNull
    private final ConcurrentHashMap<AutosaveEventObserver, Scheduler.Worker> contentListeners = new ConcurrentHashMap<>();

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onAutosaveStateChanged$lambda$3$lambda$2(Map.Entry entry, MediaType mediaType, boolean z) {
        entry.getClass();
        mediaType.getClass();
        ((AutosaveEventObserver) entry.getKey()).onAutosaveStateChanged(mediaType, z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onNoUploadsScanComplete$lambda$1$lambda$0(Map.Entry entry) {
        entry.getClass();
        ((AutosaveEventObserver) entry.getKey()).onNoUploadsScanComplete();
    }

    public final boolean addObserver(@NotNull AutosaveEventObserver observer, @NotNull Scheduler scheduler) {
        observer.getClass();
        scheduler.getClass();
        Scheduler.Worker createWorker = scheduler.createWorker();
        createWorker.getClass();
        return addObserver(observer, createWorker);
    }

    public final void clear$AndroidPhotosAutosave_release() {
        this.contentListeners.clear();
    }

    public final void onAutosaveStateChanged$AndroidPhotosAutosave_release(@NotNull MediaType mediaType, boolean state) {
        mediaType.getClass();
        for (Map.Entry<AutosaveEventObserver, Scheduler.Worker> entry : this.contentListeners.entrySet()) {
            entry.getValue().schedule(new Peripheral$$ExternalSyntheticLambda4(entry, mediaType, state, 3));
        }
    }

    public final void onNoUploadsScanComplete$AndroidPhotosAutosave_release() {
        for (Map.Entry<AutosaveEventObserver, Scheduler.Worker> entry : this.contentListeners.entrySet()) {
            entry.getValue().schedule(new NtpClient$$ExternalSyntheticLambda0(entry, 17));
        }
    }

    public final boolean removeObserver(@NotNull AutosaveEventObserver observer) {
        observer.getClass();
        Scheduler.Worker remove = this.contentListeners.remove(observer);
        if (remove != null) {
            remove.dispose();
        }
        return remove != null;
    }

    public final boolean addObserver(@NotNull AutosaveEventObserver observer, @NotNull Scheduler.Worker worker) {
        observer.getClass();
        worker.getClass();
        return this.contentListeners.putIfAbsent(observer, worker) == null;
    }
}
