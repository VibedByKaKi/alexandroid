package com.amazon.photos.autosave.internal.workers;

import com.amazon.photos.autosave.internal.workers.AutosaveWorker;
import java.io.Serializable;
import java.util.ArrayList;
import kotlin.jvm.internal.Ref;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public final /* synthetic */ class AutosaveWorker$$ExternalSyntheticLambda0 implements Runnable {
    public final /* synthetic */ int $r8$classId = 0;
    public final /* synthetic */ Serializable f$0;
    public final /* synthetic */ AutosaveWorker f$1;
    public final /* synthetic */ Object f$2;

    public /* synthetic */ AutosaveWorker$$ExternalSyntheticLambda0(ArrayList arrayList, AutosaveWorker autosaveWorker, ArrayList arrayList2) {
        this.f$0 = arrayList;
        this.f$1 = autosaveWorker;
        this.f$2 = arrayList2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                AutosaveWorker.getLocalItemsNewToAutosave$lambda$7((ArrayList) this.f$0, this.f$1, (ArrayList) this.f$2);
                break;
            default:
                AutosaveWorker.ScanLocalOperations.fetchOneBatchInFullScan$lambda$2((Ref.ObjectRef) this.f$0, (AutosaveWorker.ScanLocalOperations) this.f$2, this.f$1);
                break;
        }
    }

    public /* synthetic */ AutosaveWorker$$ExternalSyntheticLambda0(Ref.ObjectRef objectRef, AutosaveWorker.ScanLocalOperations scanLocalOperations, AutosaveWorker autosaveWorker) {
        this.f$0 = objectRef;
        this.f$2 = scanLocalOperations;
        this.f$1 = autosaveWorker;
    }
}
