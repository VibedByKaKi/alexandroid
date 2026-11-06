package com.here.sdk.core.engine;

import androidx.annotation.NonNull;
import com.here.sdk.core.NetworkEndpoint;
import java.util.List;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes8.dex */
interface DnsChangedListener {
    void onDnsList(@NonNull List<NetworkEndpoint> list);
}
