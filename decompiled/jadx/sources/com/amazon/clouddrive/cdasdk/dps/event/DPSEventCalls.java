package com.amazon.clouddrive.cdasdk.dps.event;

import androidx.annotation.NonNull;
import io.reactivex.rxjava3.core.Single;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public interface DPSEventCalls {
    @NonNull
    Single<RecordEventResponse> recordEvent(@NonNull RecordEventRequest recordEventRequest);
}
