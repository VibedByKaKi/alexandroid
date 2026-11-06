package com.here.sdk.routing;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes8.dex */
public final class TransitSectionDetails {

    @NonNull
    public Agency agency;

    @Nullable
    public TransitTransport transport = null;

    @NonNull
    public List<TransitStop> intermediateStops = new ArrayList();

    @NonNull
    public List<Attribution> attributions = new ArrayList();

    @NonNull
    public List<Fare> fares = new ArrayList();

    @NonNull
    public List<TransitIncident> incidents = new ArrayList();

    public TransitSectionDetails(@NonNull Agency agency) {
        this.agency = agency;
    }
}
