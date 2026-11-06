package com.amazon.photos.discovery.workinfo;

import androidx.work.Data;
import androidx.work.WorkInfo;
import java.util.Set;
import java.util.UUID;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\f\b&\u0018\u00002\u00020\u0001B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B3\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f\u0012\u0006\u0010\u000e\u001a\u00020\u000f¢\u0006\u0002\u0010\u0010R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u000e\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"Lcom/amazon/photos/discovery/workinfo/DiscoveryWorkInfo;", "", "workInfo", "Landroidx/work/WorkInfo;", "(Landroidx/work/WorkInfo;)V", "outputData", "Landroidx/work/Data;", "id", "Ljava/util/UUID;", "state", "Landroidx/work/WorkInfo$State;", "tags", "", "", "runAttemptCount", "", "(Landroidx/work/Data;Ljava/util/UUID;Landroidx/work/WorkInfo$State;Ljava/util/Set;I)V", "getId", "()Ljava/util/UUID;", "getOutputData", "()Landroidx/work/Data;", "getRunAttemptCount", "()I", "getState", "()Landroidx/work/WorkInfo$State;", "getTags", "()Ljava/util/Set;", "AndroidPhotosDiscovery_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public abstract class DiscoveryWorkInfo {

    @NotNull
    private final UUID id;

    @NotNull
    private final Data outputData;
    private final int runAttemptCount;

    @NotNull
    private final WorkInfo.State state;

    @NotNull
    private final Set<String> tags;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public DiscoveryWorkInfo(@org.jetbrains.annotations.NotNull androidx.work.WorkInfo r7) {
        /*
            r6 = this;
            r7.getClass()
            androidx.work.Data r1 = r7.getOutputData()
            r1.getClass()
            java.util.UUID r2 = r7.getId()
            r2.getClass()
            androidx.work.WorkInfo$State r3 = r7.getState()
            r3.getClass()
            java.util.Set r4 = r7.getTags()
            r4.getClass()
            int r5 = r7.getRunAttemptCount()
            r0 = r6
            r0.<init>(r1, r2, r3, r4, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.photos.discovery.workinfo.DiscoveryWorkInfo.<init>(androidx.work.WorkInfo):void");
    }

    @NotNull
    public final UUID getId() {
        return this.id;
    }

    @NotNull
    public final Data getOutputData() {
        return this.outputData;
    }

    public final int getRunAttemptCount() {
        return this.runAttemptCount;
    }

    @NotNull
    public final WorkInfo.State getState() {
        return this.state;
    }

    @NotNull
    public final Set<String> getTags() {
        return this.tags;
    }

    public DiscoveryWorkInfo(@NotNull Data data, @NotNull UUID uuid, @NotNull WorkInfo.State state, @NotNull Set<String> set, int i) {
        data.getClass();
        uuid.getClass();
        state.getClass();
        set.getClass();
        this.outputData = data;
        this.id = uuid;
        this.state = state;
        this.tags = set;
        this.runAttemptCount = i;
    }
}
