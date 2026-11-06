package org.aspectj.runtime.internal;

import org.aspectj.lang.ProceedingJoinPoint;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes11.dex */
public abstract class AroundClosure {
    protected int bitflags = 1048576;
    protected Object[] preInitializationState;
    protected Object[] state;

    public AroundClosure(Object[] objArr) {
        this.state = objArr;
    }

    public int getFlags() {
        return this.bitflags;
    }

    public Object[] getPreInitializationState() {
        return this.preInitializationState;
    }

    public Object[] getState() {
        return this.state;
    }

    public ProceedingJoinPoint linkClosureAndJoinPoint(int i) {
        ProceedingJoinPoint proceedingJoinPoint = (ProceedingJoinPoint) this.state[r0.length - 1];
        proceedingJoinPoint.set$AroundClosure(this);
        this.bitflags = i;
        return proceedingJoinPoint;
    }

    public abstract Object run(Object[] objArr) throws Throwable;

    public AroundClosure() {
    }

    public ProceedingJoinPoint linkClosureAndJoinPoint() {
        ProceedingJoinPoint proceedingJoinPoint = (ProceedingJoinPoint) this.state[r0.length - 1];
        proceedingJoinPoint.set$AroundClosure(this);
        return proceedingJoinPoint;
    }
}
