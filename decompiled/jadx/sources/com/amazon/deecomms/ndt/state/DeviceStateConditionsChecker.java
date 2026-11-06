package com.amazon.deecomms.ndt.state;

import androidx.annotation.NonNull;
import com.amazon.deecomms.ndt.model.DeviceModel;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
interface DeviceStateConditionsChecker {
    boolean checkMainCondition(@NonNull DeviceModel deviceModel);

    boolean checkPreConditions(@NonNull DeviceModel deviceModel);
}
