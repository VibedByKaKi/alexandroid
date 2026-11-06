package org.apache.commons.lang;

import java.io.PrintStream;
import java.io.PrintWriter;
import org.apache.commons.lang.exception.Nestable;
import org.apache.commons.lang.exception.NestableDelegate;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes11.dex */
public class NotImplementedException extends UnsupportedOperationException implements Nestable {
    private static final String DEFAULT_MESSAGE = "Code is not implemented";
    private static final long serialVersionUID = -6894122266938754088L;
    private Throwable cause;
    private NestableDelegate delegate;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public NotImplementedException(java.lang.Class r3) {
        /*
            r2 = this;
            if (r3 != 0) goto L5
            java.lang.String r3 = "Code is not implemented"
            goto L13
        L5:
            java.lang.StringBuffer r0 = new java.lang.StringBuffer
            java.lang.String r1 = "Code is not implemented in "
            r0.<init>(r1)
            r0.append(r3)
            java.lang.String r3 = r0.toString()
        L13:
            r2.<init>(r3)
            org.apache.commons.lang.exception.NestableDelegate r3 = new org.apache.commons.lang.exception.NestableDelegate
            r3.<init>(r2)
            r2.delegate = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.commons.lang.NotImplementedException.<init>(java.lang.Class):void");
    }

    @Override // java.lang.Throwable, org.apache.commons.lang.exception.Nestable
    public Throwable getCause() {
        return this.cause;
    }

    @Override // java.lang.Throwable, org.apache.commons.lang.exception.Nestable
    public String getMessage() {
        if (super.getMessage() != null) {
            return super.getMessage();
        }
        Throwable th = this.cause;
        if (th != null) {
            return th.toString();
        }
        return null;
    }

    @Override // org.apache.commons.lang.exception.Nestable
    public String[] getMessages() {
        return this.delegate.getMessages();
    }

    @Override // org.apache.commons.lang.exception.Nestable
    public Throwable getThrowable(int i) {
        return this.delegate.getThrowable(i);
    }

    @Override // org.apache.commons.lang.exception.Nestable
    public int getThrowableCount() {
        return this.delegate.getThrowableCount();
    }

    @Override // org.apache.commons.lang.exception.Nestable
    public Throwable[] getThrowables() {
        return this.delegate.getThrowables();
    }

    @Override // org.apache.commons.lang.exception.Nestable
    public int indexOfThrowable(Class cls) {
        return this.delegate.indexOfThrowable(cls, 0);
    }

    @Override // org.apache.commons.lang.exception.Nestable
    public final void printPartialStackTrace(PrintWriter printWriter) {
        super.printStackTrace(printWriter);
    }

    @Override // java.lang.Throwable
    public void printStackTrace() {
        this.delegate.printStackTrace();
    }

    @Override // java.lang.Throwable, org.apache.commons.lang.exception.Nestable
    public void printStackTrace(PrintStream printStream) {
        this.delegate.printStackTrace(printStream);
    }

    @Override // java.lang.Throwable, org.apache.commons.lang.exception.Nestable
    public void printStackTrace(PrintWriter printWriter) {
        this.delegate.printStackTrace(printWriter);
    }

    @Override // org.apache.commons.lang.exception.Nestable
    public int indexOfThrowable(Class cls, int i) {
        return this.delegate.indexOfThrowable(cls, i);
    }

    @Override // org.apache.commons.lang.exception.Nestable
    public String getMessage(int i) {
        if (i == 0) {
            return super.getMessage();
        }
        return this.delegate.getMessage(i);
    }

    public NotImplementedException(String str) {
        super(str == null ? DEFAULT_MESSAGE : str);
        this.delegate = new NestableDelegate(this);
    }

    public NotImplementedException(Throwable th) {
        super(DEFAULT_MESSAGE);
        this.delegate = new NestableDelegate(this);
        this.cause = th;
    }

    public NotImplementedException(String str, Throwable th) {
        super(str == null ? DEFAULT_MESSAGE : str);
        this.delegate = new NestableDelegate(this);
        this.cause = th;
    }

    public NotImplementedException() {
        super(DEFAULT_MESSAGE);
        this.delegate = new NestableDelegate(this);
    }
}
