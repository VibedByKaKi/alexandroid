package com.amazon.alexa.device.setup.echo.softap.workflow.data;

import com.amazon.alexa.device.setup.echo.softap.workflow.data.WorkflowStateData;
import com.amazon.alexa.device.setup.echo.softap.workflow.manager.WorkflowState;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public class WorkflowStatusUpdate {
    final WorkflowState workflowState;
    final WorkflowStateData workflowStateData;

    public WorkflowStatusUpdate(WorkflowState workflowState, Throwable th) {
        this.workflowState = workflowState;
        this.workflowStateData = new WorkflowStateData(th, WorkflowStateData.State.ERROR);
    }

    public String toString() {
        return "WorkflowStatusUpdate : { workflowState: " + this.workflowState.toString() + ", " + this.workflowStateData.toString() + " }";
    }

    public WorkflowStatusUpdate(WorkflowState workflowState, WorkflowStateData workflowStateData) {
        this.workflowState = workflowState;
        this.workflowStateData = workflowStateData;
    }
}
