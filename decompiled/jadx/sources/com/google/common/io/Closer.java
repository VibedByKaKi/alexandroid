package com.google.common.io;

import com.google.common.annotations.GwtIncompatible;
import com.google.common.annotations.J2ktIncompatible;
import com.google.common.annotations.VisibleForTesting;
import com.google.common.base.Preconditions;
import com.google.common.base.Throwables;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.io.Closeable;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.logging.Level;
import okio.Buffer$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@J2ktIncompatible
@GwtIncompatible
/* loaded from: classes8.dex */
public final class Closer implements Closeable {
    private static final Suppressor SUPPRESSING_SUPPRESSOR = new Closer$$ExternalSyntheticLambda0();
    private final Deque<Closeable> stack = new ArrayDeque(4);

    @VisibleForTesting
    final Suppressor suppressor;
    private Throwable thrown;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @VisibleForTesting
    public interface Suppressor {
        void suppress(Closeable closeable, Throwable th, Throwable th2);
    }

    @VisibleForTesting
    public Closer(Suppressor suppressor) {
        this.suppressor = (Suppressor) Preconditions.checkNotNull(suppressor);
    }

    public static Closer create() {
        return new Closer(SUPPRESSING_SUPPRESSOR);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$static$0(Closeable closeable, Throwable th, Throwable th2) {
        if (th == th2) {
            return;
        }
        try {
            th.addSuppressed(th2);
        } catch (Throwable unused) {
            Closeables.logger.log(Level.WARNING, "Suppressing exception thrown when closing " + closeable, th2);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        Throwable th = this.thrown;
        while (!this.stack.isEmpty()) {
            Closeable removeFirst = this.stack.removeFirst();
            try {
                removeFirst.close();
            } catch (Throwable th2) {
                if (th == null) {
                    th = th2;
                } else {
                    this.suppressor.suppress(removeFirst, th, th2);
                }
            }
        }
        if (this.thrown != null || th == null) {
            return;
        }
        Throwables.throwIfInstanceOf(th, IOException.class);
        Throwables.throwIfUnchecked(th);
        Buffer$$ExternalSyntheticBUOutline0.m((Object) th);
    }

    @CanIgnoreReturnValue
    @ParametricNullness
    public <C extends Closeable> C register(@ParametricNullness C c) {
        if (c != null) {
            this.stack.addFirst(c);
        }
        return c;
    }

    public <X1 extends Exception, X2 extends Exception> RuntimeException rethrow(Throwable th, Class<X1> cls, Class<X2> cls2) throws IOException, Exception, Exception {
        Preconditions.checkNotNull(th);
        this.thrown = th;
        Throwables.throwIfInstanceOf(th, IOException.class);
        Throwables.throwIfInstanceOf(th, cls);
        Throwables.throwIfInstanceOf(th, cls2);
        Throwables.throwIfUnchecked(th);
        throw new RuntimeException(th);
    }

    public <X extends Exception> RuntimeException rethrow(Throwable th, Class<X> cls) throws IOException, Exception {
        Preconditions.checkNotNull(th);
        this.thrown = th;
        Throwables.throwIfInstanceOf(th, IOException.class);
        Throwables.throwIfInstanceOf(th, cls);
        Throwables.throwIfUnchecked(th);
        throw new RuntimeException(th);
    }

    public RuntimeException rethrow(Throwable th) throws IOException {
        Preconditions.checkNotNull(th);
        this.thrown = th;
        Throwables.throwIfInstanceOf(th, IOException.class);
        Throwables.throwIfUnchecked(th);
        throw new RuntimeException(th);
    }
}
