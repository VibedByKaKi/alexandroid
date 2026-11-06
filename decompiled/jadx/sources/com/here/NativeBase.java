package com.here;

import com.amazon.alexa.metis.api.ChatData$$ExternalSyntheticOutline0;
import java.lang.ref.PhantomReference;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes8.dex */
public abstract class NativeBase {
    private static final Logger LOGGER = Logger.getLogger(NativeBase.class.getName());
    private static final Set<Reference<?>> REFERENCES = ChatData$$ExternalSyntheticOutline0.m();
    private static final ReferenceQueue<NativeBase> REFERENCE_QUEUE = new ReferenceQueue<>();
    private final long nativeHandle;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class DisposableReference extends PhantomReference<NativeBase> {
        private final Disposer disposer;
        private final long nativePointer;

        private DisposableReference(NativeBase nativeBase, long j, Disposer disposer) {
            super(nativeBase, NativeBase.REFERENCE_QUEUE);
            this.nativePointer = j;
            this.disposer = disposer;
            NativeBase.cleanUpQueue();
        }

        public void dispose() {
            NativeBase.REFERENCES.remove(this);
            this.disposer.disposeNative(this.nativePointer);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface Disposer {
        void disposeNative(long j);
    }

    public NativeBase(long j, Disposer disposer) {
        this.nativeHandle = j;
        REFERENCES.add(new DisposableReference(j, disposer));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void cleanUpQueue() {
        while (true) {
            Reference<? extends NativeBase> poll = REFERENCE_QUEUE.poll();
            if (poll == null) {
                return;
            }
            poll.clear();
            try {
                ((DisposableReference) poll).dispose();
            } catch (Throwable th) {
                LOGGER.log(Level.SEVERE, "Error cleaning up after reference.", th);
            }
        }
    }
}
