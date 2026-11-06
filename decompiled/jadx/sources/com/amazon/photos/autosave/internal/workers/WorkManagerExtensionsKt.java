package com.amazon.photos.autosave.internal.workers;

import androidx.annotation.WorkerThread;
import androidx.work.WorkInfo;
import androidx.work.WorkManager;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u001a\u0014\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u0001¨\u0006\u0005"}, d2 = {"hasNoPendingWorkForTag", "", "Landroidx/work/WorkManager;", "tag", "", "AndroidPhotosAutosave_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nWorkManagerExtensions.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WorkManagerExtensions.kt\ncom/amazon/photos/autosave/internal/workers/WorkManagerExtensionsKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,16:1\n1726#2,3:17\n*S KotlinDebug\n*F\n+ 1 WorkManagerExtensions.kt\ncom/amazon/photos/autosave/internal/workers/WorkManagerExtensionsKt\n*L\n13#1:17,3\n*E\n"})
/* loaded from: classes5.dex */
public final class WorkManagerExtensionsKt {
    @WorkerThread
    public static final boolean hasNoPendingWorkForTag(@NotNull WorkManager workManager, @NotNull String str) {
        workManager.getClass();
        str.getClass();
        List<WorkInfo> list = workManager.getWorkInfosByTag(str).get();
        list.getClass();
        List<WorkInfo> list2 = list;
        if ((list2 instanceof Collection) && list2.isEmpty()) {
            return true;
        }
        for (WorkInfo workInfo : list2) {
            if (workInfo.getState() == WorkInfo.State.RUNNING || workInfo.getState() == WorkInfo.State.ENQUEUED) {
                return false;
            }
        }
        return true;
    }
}
