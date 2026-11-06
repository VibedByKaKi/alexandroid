package com.amazon.whisperjoin.deviceprovisioningservice.workflow.zerotouch;

import java.util.UUID;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class WorkflowIdProvider {
    public String createWorkflowId() {
        return UUID.randomUUID().toString().substring(0, 4);
    }
}
