package com.amazon.coral.google.common.util.concurrent;

import com.amazon.coral.google.common.annotations.GwtIncompatible;
import com.amazon.coral.google.common.collect.ImmutableMultimap;
import com.amazon.coral.google.common.util.concurrent.Service;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@GwtIncompatible
@ElementTypesAreNonnullByDefault
/* loaded from: classes19.dex */
interface ServiceManagerBridge {
    ImmutableMultimap<Service.State, Service> servicesByState();
}
