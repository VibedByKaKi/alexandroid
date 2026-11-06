package com.google.android.exoplayer2.offline;

import com.google.android.exoplayer2.scheduler.RequirementsWatcher;
import com.google.android.exoplayer2.upstream.cache.CacheWriter;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes7.dex */
public final /* synthetic */ class DownloadManager$$ExternalSyntheticLambda1 implements RequirementsWatcher.Listener, CacheWriter.ProgressListener {
    public final /* synthetic */ Object f$0;

    public /* synthetic */ DownloadManager$$ExternalSyntheticLambda1(Object obj) {
        this.f$0 = obj;
    }

    @Override // com.google.android.exoplayer2.upstream.cache.CacheWriter.ProgressListener
    public void onProgress(long j, long j2, long j3) {
        ((ProgressiveDownloader) this.f$0).onProgress(j, j2, j3);
    }

    @Override // com.google.android.exoplayer2.scheduler.RequirementsWatcher.Listener
    public void onRequirementsStateChanged(RequirementsWatcher requirementsWatcher, int i) {
        ((DownloadManager) this.f$0).onRequirementsStateChanged(requirementsWatcher, i);
    }
}
