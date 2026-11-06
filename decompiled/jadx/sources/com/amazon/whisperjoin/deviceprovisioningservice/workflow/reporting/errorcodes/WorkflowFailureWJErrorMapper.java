package com.amazon.whisperjoin.deviceprovisioningservice.workflow.reporting.errorcodes;

import com.amazon.whisperjoin.common.sharedtypes.error.WJError;
import com.amazon.whisperjoin.common.sharedtypes.error.WJErrorFactory;
import com.amazon.whisperjoin.deviceprovisioningservice.error.DeviceRecentlyProvisionedException;
import com.amazon.whisperjoin.deviceprovisioningservice.error.WorkflowFailureException;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class WorkflowFailureWJErrorMapper implements WJErrorMapper<WorkflowFailureException> {
    @Override // com.amazon.whisperjoin.deviceprovisioningservice.workflow.reporting.errorcodes.WJErrorMapper
    public WJError map(WorkflowFailureException workflowFailureException) {
        return workflowFailureException instanceof DeviceRecentlyProvisionedException ? WJErrorFactory.Workflow.deviceRecentlyProvisioned() : WJErrorFactory.Workflow.unknown();
    }
}
