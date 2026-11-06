package com.amazon.whisperjoin.deviceprovisioningservice.workflow.presentation;

import com.amazon.whisperjoin.deviceprovisioningservice.workflow.presentation.controller.UGSClientWorkflowController;
import com.amazon.whisperjoin.deviceprovisioningservice.workflow.presentation.viewmodel.ViewModel;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class WorkflowPresentationUpdate {
    private final UGSClientWorkflowController mController;
    private final ViewModel mViewModel;

    public WorkflowPresentationUpdate(ViewModel viewModel, UGSClientWorkflowController uGSClientWorkflowController) {
        this.mViewModel = viewModel;
        this.mController = uGSClientWorkflowController;
    }

    public UGSClientWorkflowController getController() {
        return this.mController;
    }

    public ViewModel getViewModel() {
        return this.mViewModel;
    }
}
