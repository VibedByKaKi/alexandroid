package com.amazon.comms.debug;

import android.os.Looper;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public final class ThreadAssert {
    private Looper mLooper;

    public ThreadAssert() {
        this.mLooper = Looper.myLooper();
    }

    public static void expectMainThread() {
        DebugAssert.expect(Looper.myLooper() == Looper.getMainLooper(), "Holy Violated Expectation, Batman! Not the main thread!");
    }

    public void expectSameThread() {
        DebugAssert.expect(Looper.myLooper() == this.mLooper, "Holy Violated Expectation, Batman! Not the thread I was constructed on!");
    }

    public ThreadAssert(Looper looper) {
        this.mLooper = looper;
    }
}
