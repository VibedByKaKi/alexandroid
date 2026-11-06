package com.amazon.photos.discovery.internal.observers;

import com.amazon.alexa.accessory.frames.contacts.ContactsModuleConstants;
import com.amazon.photos.discovery.observers.LocalContentChangeObserver;
import com.amazon.photos.discovery.observers.LocalContentType;
import com.amazon.photos.uploader.internal.UploadRequestUpdatesNotifier$$ExternalSyntheticLambda0;
import com.dee.app.metrics.MetricsConstants;
import com.mapbox.common.LifecycleUtils$$ExternalSyntheticLambda2;
import io.reactivex.rxjava3.core.Scheduler;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\t\n\u0002\b\n\b\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u000bJ\r\u0010\f\u001a\u00020\rH\u0000¢\u0006\u0002\b\u000eJ#\u0010\u000f\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u00112\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013H\u0000¢\u0006\u0002\b\u0015J\u0015\u0010\u0016\u001a\u00020\r2\u0006\u0010\u0017\u001a\u00020\bH\u0000¢\u0006\u0002\b\u0018J\u001b\u0010\u0019\u001a\u00020\r2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013H\u0000¢\u0006\u0002\b\u001aJ#\u0010\u001b\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u00112\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013H\u0000¢\u0006\u0002\b\u001cJ\u000e\u0010\u001d\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0005R\u001a\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001e"}, d2 = {"Lcom/amazon/photos/discovery/internal/observers/ContentChangeNotifier;", "", "()V", "contentListeners", "Ljava/util/concurrent/ConcurrentHashMap;", "Lcom/amazon/photos/discovery/observers/LocalContentChangeObserver;", "Lio/reactivex/rxjava3/core/Scheduler$Worker;", "addObserver", "", "observer", "scheduler", "Lio/reactivex/rxjava3/core/Scheduler;", MetricsConstants.Method.CACHE_CLEAR, "", "clear$AndroidPhotosDiscovery_release", "onContentAdded", "contentType", "Lcom/amazon/photos/discovery/observers/LocalContentType;", ContactsModuleConstants.CONTACT_IDS, "", "", "onContentAdded$AndroidPhotosDiscovery_release", "onContentDedupeComplete", "wasContentDeduped", "onContentDedupeComplete$AndroidPhotosDiscovery_release", "onContentDeduped", "onContentDeduped$AndroidPhotosDiscovery_release", "onContentDeleted", "onContentDeleted$AndroidPhotosDiscovery_release", "removeObserver", "AndroidPhotosDiscovery_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nContentChangeNotifier.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ContentChangeNotifier.kt\ncom/amazon/photos/discovery/internal/observers/ContentChangeNotifier\n+ 2 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,65:1\n215#2,2:66\n215#2,2:68\n215#2,2:70\n215#2,2:72\n*S KotlinDebug\n*F\n+ 1 ContentChangeNotifier.kt\ncom/amazon/photos/discovery/internal/observers/ContentChangeNotifier\n*L\n34#1:66,2\n42#1:68,2\n50#1:70,2\n58#1:72,2\n*E\n"})
/* loaded from: classes5.dex */
public final class ContentChangeNotifier {

    @NotNull
    private final ConcurrentHashMap<LocalContentChangeObserver, Scheduler.Worker> contentListeners = new ConcurrentHashMap<>();

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onContentAdded$lambda$1$lambda$0(Map.Entry entry, LocalContentType localContentType, List list) {
        entry.getClass();
        localContentType.getClass();
        list.getClass();
        ((LocalContentChangeObserver) entry.getKey()).onContentAdded(localContentType, list);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onContentDedupeComplete$lambda$7$lambda$6(Map.Entry entry, boolean z) {
        entry.getClass();
        ((LocalContentChangeObserver) entry.getKey()).onContentDedupeComplete(z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onContentDeduped$lambda$5$lambda$4(Map.Entry entry, List list) {
        entry.getClass();
        list.getClass();
        ((LocalContentChangeObserver) entry.getKey()).onContentDeduped(list);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onContentDeleted$lambda$3$lambda$2(Map.Entry entry, LocalContentType localContentType, List list) {
        entry.getClass();
        localContentType.getClass();
        list.getClass();
        ((LocalContentChangeObserver) entry.getKey()).onContentDeleted(localContentType, list);
    }

    public final boolean addObserver(@NotNull LocalContentChangeObserver observer, @NotNull Scheduler scheduler) {
        observer.getClass();
        scheduler.getClass();
        return this.contentListeners.putIfAbsent(observer, scheduler.createWorker()) == null;
    }

    public final void clear$AndroidPhotosDiscovery_release() {
        this.contentListeners.clear();
    }

    public final void onContentAdded$AndroidPhotosDiscovery_release(@NotNull LocalContentType contentType, @NotNull List<Long> ids) {
        contentType.getClass();
        ids.getClass();
        for (Map.Entry<LocalContentChangeObserver, Scheduler.Worker> entry : this.contentListeners.entrySet()) {
            entry.getValue().schedule(new ContentChangeNotifier$$ExternalSyntheticLambda1(entry, contentType, ids, 1));
        }
    }

    public final void onContentDedupeComplete$AndroidPhotosDiscovery_release(boolean wasContentDeduped) {
        for (Map.Entry<LocalContentChangeObserver, Scheduler.Worker> entry : this.contentListeners.entrySet()) {
            entry.getValue().schedule(new LifecycleUtils$$ExternalSyntheticLambda2(entry, wasContentDeduped, 12));
        }
    }

    public final void onContentDeduped$AndroidPhotosDiscovery_release(@NotNull List<Long> ids) {
        ids.getClass();
        for (Map.Entry<LocalContentChangeObserver, Scheduler.Worker> entry : this.contentListeners.entrySet()) {
            entry.getValue().schedule(new UploadRequestUpdatesNotifier$$ExternalSyntheticLambda0(entry, ids, 1));
        }
    }

    public final void onContentDeleted$AndroidPhotosDiscovery_release(@NotNull LocalContentType contentType, @NotNull List<Long> ids) {
        contentType.getClass();
        ids.getClass();
        for (Map.Entry<LocalContentChangeObserver, Scheduler.Worker> entry : this.contentListeners.entrySet()) {
            entry.getValue().schedule(new ContentChangeNotifier$$ExternalSyntheticLambda1(entry, contentType, ids, 0));
        }
    }

    public final boolean removeObserver(@NotNull LocalContentChangeObserver observer) {
        observer.getClass();
        Scheduler.Worker remove = this.contentListeners.remove(observer);
        if (remove != null) {
            remove.dispose();
        }
        return remove != null;
    }
}
