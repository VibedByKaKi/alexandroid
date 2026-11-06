package org.junit.experimental.results;

import java.util.Iterator;
import java.util.List;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;
import org.junit.runner.notification.RunListener;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes11.dex */
class FailureList {
    private final List<Failure> failures;

    public FailureList(List<Failure> list) {
        this.failures = list;
    }

    public Result result() {
        Result result = new Result();
        RunListener createListener = result.createListener();
        Iterator<Failure> it2 = this.failures.iterator();
        while (it2.hasNext()) {
            try {
                createListener.testFailure(it2.next());
            } catch (Exception unused) {
                Single$$ExternalSyntheticBUOutline0.m("I can't believe this happened");
                return null;
            }
        }
        return result;
    }
}
