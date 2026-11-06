package org.junit.internal.runners;

import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import org.junit.runner.Description;
import org.junit.runner.Runner;
import org.junit.runner.notification.Failure;
import org.junit.runner.notification.RunNotifier;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes11.dex */
public class ErrorReportingRunner extends Runner {
    private final List<Throwable> causes;
    private final Class<?> testClass;

    public ErrorReportingRunner(Class<?> cls, Throwable th) {
        if (cls == null) {
            Single$$ExternalSyntheticBUOutline0.m$1("Test class cannot be null");
            throw null;
        }
        this.testClass = cls;
        this.causes = getCauses(th);
    }

    private Description describeCause(Throwable th) {
        return Description.createTestDescription(this.testClass, "initializationError");
    }

    private List<Throwable> getCauses(Throwable th) {
        return th instanceof InvocationTargetException ? getCauses(th.getCause()) : th instanceof org.junit.runners.model.InitializationError ? ((org.junit.runners.model.InitializationError) th).getCauses() : th instanceof InitializationError ? ((InitializationError) th).getCauses() : Arrays.asList(th);
    }

    private void runCause(Throwable th, RunNotifier runNotifier) {
        Description describeCause = describeCause(th);
        runNotifier.fireTestStarted(describeCause);
        runNotifier.fireTestFailure(new Failure(describeCause, th));
        runNotifier.fireTestFinished(describeCause);
    }

    @Override // org.junit.runner.Runner, org.junit.runner.Describable
    public Description getDescription() {
        Description createSuiteDescription = Description.createSuiteDescription(this.testClass);
        Iterator<Throwable> it2 = this.causes.iterator();
        while (it2.hasNext()) {
            createSuiteDescription.addChild(describeCause(it2.next()));
        }
        return createSuiteDescription;
    }

    @Override // org.junit.runner.Runner
    public void run(RunNotifier runNotifier) {
        Iterator<Throwable> it2 = this.causes.iterator();
        while (it2.hasNext()) {
            runCause(it2.next(), runNotifier);
        }
    }
}
