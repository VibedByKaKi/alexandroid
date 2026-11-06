package com.here.sdk.traffic;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.here.sdk.core.LocalizedText;
import java.util.Date;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes8.dex */
public interface TrafficIncidentBase {
    @NonNull
    LocalizedText getDescription();

    @Nullable
    Date getEndTime();

    @NonNull
    TrafficIncidentImpact getImpact();

    @Nullable
    Date getStartTime();

    @NonNull
    TrafficIncidentType getType();
}
