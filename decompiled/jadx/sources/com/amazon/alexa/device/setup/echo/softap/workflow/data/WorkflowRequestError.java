package com.amazon.alexa.device.setup.echo.softap.workflow.data;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public class WorkflowRequestError {
    private final int attempt;
    private final Throwable throwable;

    public WorkflowRequestError(Throwable th, int i) {
        this.attempt = i;
        this.throwable = th;
    }

    public int getAttempt() {
        return this.attempt;
    }

    public Throwable getThrowable() {
        return this.throwable;
    }
}
