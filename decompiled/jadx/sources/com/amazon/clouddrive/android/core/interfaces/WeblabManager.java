package com.amazon.clouddrive.android.core.interfaces;

import androidx.annotation.NonNull;
import androidx.annotation.WorkerThread;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public interface WeblabManager {
    @NonNull
    List<Weblab> getAllWeblabs();

    @NonNull
    @WorkerThread
    WeblabTreatment getTreatmentAndRecordTrigger(@NonNull String str, boolean z);

    @NonNull
    @WorkerThread
    Map<String, String> getWeblabAllocations();
}
