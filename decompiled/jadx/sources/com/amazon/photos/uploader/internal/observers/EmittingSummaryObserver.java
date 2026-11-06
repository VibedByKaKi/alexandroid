package com.amazon.photos.uploader.internal.observers;

import com.amazon.alexa.metis.api.ChatData$$ExternalSyntheticOutline0;
import com.amazon.photos.uploader.observables.UploadSummary;
import com.amazon.photos.uploader.observables.UploadSummaryObserver;
import io.reactivex.rxjava3.core.Emitter;
import java.util.Iterator;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.bouncycastle.i18n.ErrorBundle;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0014\u0010\t\u001a\u00020\n2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u0006H\u0016J\u0010\u0010\u000f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u0006H\u0016J\u0010\u0010\u0010\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u0006H\u0016J\u0014\u0010\u0011\u001a\u00020\n2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005RJ\u0010\u0003\u001a>\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0006 \u0007*\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00050\u0005 \u0007*\u001e\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0006 \u0007*\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00050\u0005\u0018\u00010\b0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lcom/amazon/photos/uploader/internal/observers/EmittingSummaryObserver;", "Lcom/amazon/photos/uploader/observables/UploadSummaryObserver;", "()V", "emitters", "", "Lio/reactivex/rxjava3/core/Emitter;", "Lcom/amazon/photos/uploader/observables/UploadSummary;", "kotlin.jvm.PlatformType", "", "addEmitter", "", "emitter", "onChanged", "", ErrorBundle.SUMMARY_ENTRY, "onUploaderStarted", "onUploaderStopped", "removeEmitter", "AndroidPhotosUploader_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nEmittingSummaryObserver.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EmittingSummaryObserver.kt\ncom/amazon/photos/uploader/internal/observers/EmittingSummaryObserver\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,33:1\n1855#2,2:34\n*S KotlinDebug\n*F\n+ 1 EmittingSummaryObserver.kt\ncom/amazon/photos/uploader/internal/observers/EmittingSummaryObserver\n*L\n27#1:34,2\n*E\n"})
/* loaded from: classes5.dex */
public final class EmittingSummaryObserver implements UploadSummaryObserver {
    private final Set<Emitter<UploadSummary>> emitters = ChatData$$ExternalSyntheticOutline0.m();

    public final boolean addEmitter(@NotNull Emitter<UploadSummary> emitter) {
        emitter.getClass();
        return this.emitters.add(emitter);
    }

    @Override // com.amazon.photos.uploader.observables.UploadSummaryObserver
    public void onChanged(@NotNull UploadSummary summary) {
        summary.getClass();
        Set<Emitter<UploadSummary>> set = this.emitters;
        set.getClass();
        Iterator<T> it2 = set.iterator();
        while (it2.hasNext()) {
            ((Emitter) it2.next()).onNext(summary);
        }
    }

    @Override // com.amazon.photos.uploader.observables.UploadSummaryObserver
    public void onUploaderStarted(@NotNull UploadSummary summary) {
        summary.getClass();
    }

    @Override // com.amazon.photos.uploader.observables.UploadSummaryObserver
    public void onUploaderStopped(@NotNull UploadSummary summary) {
        summary.getClass();
    }

    public final boolean removeEmitter(@NotNull Emitter<UploadSummary> emitter) {
        emitter.getClass();
        return this.emitters.remove(emitter);
    }
}
