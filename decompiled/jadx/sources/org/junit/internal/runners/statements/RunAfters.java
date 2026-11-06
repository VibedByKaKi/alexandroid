package org.junit.internal.runners.statements;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.junit.runners.model.FrameworkMethod;
import org.junit.runners.model.MultipleFailureException;
import org.junit.runners.model.Statement;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes11.dex */
public class RunAfters extends Statement {
    private final List<FrameworkMethod> afters;
    private final Statement next;
    private final Object target;

    public RunAfters(Statement statement, List<FrameworkMethod> list, Object obj) {
        this.next = statement;
        this.afters = list;
        this.target = obj;
    }

    @Override // org.junit.runners.model.Statement
    public void evaluate() throws Throwable {
        ArrayList arrayList = new ArrayList();
        try {
            this.next.evaluate();
            Iterator<FrameworkMethod> it2 = this.afters.iterator();
            while (it2.hasNext()) {
                try {
                    it2.next().invokeExplosively(this.target, new Object[0]);
                } catch (Throwable th) {
                    arrayList.add(th);
                }
            }
        } catch (Throwable th2) {
            try {
                arrayList.add(th2);
                Iterator<FrameworkMethod> it3 = this.afters.iterator();
                while (it3.hasNext()) {
                    try {
                        it3.next().invokeExplosively(this.target, new Object[0]);
                    } catch (Throwable th3) {
                        arrayList.add(th3);
                    }
                }
            } catch (Throwable th4) {
                Iterator<FrameworkMethod> it4 = this.afters.iterator();
                while (it4.hasNext()) {
                    try {
                        it4.next().invokeExplosively(this.target, new Object[0]);
                    } catch (Throwable th5) {
                        arrayList.add(th5);
                    }
                }
                throw th4;
            }
        }
        MultipleFailureException.assertEmpty(arrayList);
    }
}
