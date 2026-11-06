package org.junit.internal.runners;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import org.junit.internal.AssumptionViolatedException;
import org.junit.runner.Description;
import org.junit.runner.notification.Failure;
import org.junit.runner.notification.RunNotifier;
import org.junit.runners.model.TestTimedOutException;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Deprecated
/* loaded from: classes11.dex */
public class MethodRoadie {
    private final Description description;
    private final RunNotifier notifier;
    private final Object test;
    private TestMethod testMethod;

    public MethodRoadie(Object obj, TestMethod testMethod, RunNotifier runNotifier, Description description) {
        this.test = obj;
        this.notifier = runNotifier;
        this.description = description;
        this.testMethod = testMethod;
    }

    private void runAfters() {
        Iterator<Method> it2 = this.testMethod.getAfters().iterator();
        while (it2.hasNext()) {
            try {
                it2.next().invoke(this.test, null);
            } catch (InvocationTargetException e) {
                addFailure(e.getTargetException());
            } catch (Throwable th) {
                addFailure(th);
            }
        }
    }

    private void runBefores() throws FailedBefore {
        try {
            try {
                Iterator<Method> it2 = this.testMethod.getBefores().iterator();
                while (it2.hasNext()) {
                    it2.next().invoke(this.test, null);
                }
            } catch (InvocationTargetException e) {
                throw e.getTargetException();
            }
        } catch (AssumptionViolatedException unused) {
            throw new FailedBefore();
        } catch (Throwable th) {
            addFailure(th);
            throw new FailedBefore();
        }
    }

    private void runWithTimeout(final long j) {
        runBeforesThenTestThenAfters(new Runnable() { // from class: org.junit.internal.runners.MethodRoadie.1
            @Override // java.lang.Runnable
            public void run() {
                TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor();
                Future submit = newSingleThreadExecutor.submit(new Callable<Object>() { // from class: org.junit.internal.runners.MethodRoadie.1.1
                    @Override // java.util.concurrent.Callable
                    public Object call() throws Exception {
                        MethodRoadie.this.runTestMethod();
                        return null;
                    }
                });
                newSingleThreadExecutor.shutdown();
                try {
                    if (!newSingleThreadExecutor.awaitTermination(j, timeUnit)) {
                        newSingleThreadExecutor.shutdownNow();
                    }
                    submit.get(0L, timeUnit);
                } catch (TimeoutException unused) {
                    MethodRoadie.this.addFailure(new TestTimedOutException(j, timeUnit));
                } catch (Exception e) {
                    MethodRoadie.this.addFailure(e);
                }
            }
        });
    }

    public void addFailure(Throwable th) {
        this.notifier.fireTestFailure(new Failure(this.description, th));
    }

    public void run() {
        boolean isIgnored = this.testMethod.isIgnored();
        RunNotifier runNotifier = this.notifier;
        if (isIgnored) {
            runNotifier.fireTestIgnored(this.description);
            return;
        }
        runNotifier.fireTestStarted(this.description);
        try {
            long timeout = this.testMethod.getTimeout();
            if (timeout > 0) {
                runWithTimeout(timeout);
            } else {
                runTest();
            }
            this.notifier.fireTestFinished(this.description);
        } catch (Throwable th) {
            this.notifier.fireTestFinished(this.description);
            throw th;
        }
    }

    public void runBeforesThenTestThenAfters(Runnable runnable) {
        try {
            try {
                runBefores();
                runnable.run();
                runAfters();
            } catch (FailedBefore unused) {
                runAfters();
            } catch (Exception unused2) {
                throw new RuntimeException("test should never throw an exception to this level");
            }
        } catch (Throwable th) {
            runAfters();
            throw th;
        }
    }

    public void runTest() {
        runBeforesThenTestThenAfters(new Runnable() { // from class: org.junit.internal.runners.MethodRoadie.2
            @Override // java.lang.Runnable
            public void run() {
                MethodRoadie.this.runTestMethod();
            }
        });
    }

    public void runTestMethod() {
        try {
            this.testMethod.invoke(this.test);
            if (this.testMethod.expectsException()) {
                addFailure(new AssertionError("Expected exception: ".concat(this.testMethod.getExpectedException().getName())));
            }
        } catch (InvocationTargetException e) {
            Throwable targetException = e.getTargetException();
            if (targetException instanceof AssumptionViolatedException) {
                return;
            }
            if (!this.testMethod.expectsException()) {
                addFailure(targetException);
                return;
            }
            if (this.testMethod.isUnexpected(targetException)) {
                addFailure(new Exception("Unexpected exception, expected<" + this.testMethod.getExpectedException().getName() + "> but was<" + targetException.getClass().getName() + ">", targetException));
            }
        } catch (Throwable th) {
            addFailure(th);
        }
    }
}
