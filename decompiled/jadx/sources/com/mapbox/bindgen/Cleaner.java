package com.mapbox.bindgen;

import androidx.annotation.NonNull;
import com.amazon.alexa.metis.api.ChatData$$ExternalSyntheticOutline0;
import java.lang.ref.PhantomReference;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.util.Objects;
import java.util.Set;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes8.dex */
public final class Cleaner {
    private CleanerImpl impl = new CleanerImpl();

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class CleanerImpl implements Runnable {

        @NonNull
        private ReferenceQueue<Object> referenceQueue = new ReferenceQueue<>();

        @NonNull
        private Set<Finalizer> references = ChatData$$ExternalSyntheticOutline0.m();

        public void register(@NonNull Object obj, @NonNull Runnable runnable) {
            this.references.add(new Finalizer(obj, this.referenceQueue, runnable));
        }

        @Override // java.lang.Runnable
        public void run() {
            while (!this.references.isEmpty()) {
                try {
                    Reference<? extends Object> remove = this.referenceQueue.remove(60000L);
                    if (remove != null) {
                        Finalizer finalizer = (Finalizer) remove;
                        finalizer.finalizeResources();
                        finalizer.clear();
                        this.references.remove(finalizer);
                    }
                } catch (InterruptedException unused) {
                }
            }
        }

        public void start() {
            Thread thread = new Thread(this);
            thread.setDaemon(true);
            thread.setPriority(8);
            thread.start();
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class Finalizer extends PhantomReference<Object> {

        @NonNull
        Runnable cleanable;

        public Finalizer(@NonNull Object obj, @NonNull ReferenceQueue<? super Object> referenceQueue, @NonNull Runnable runnable) {
            super(obj, referenceQueue);
            this.cleanable = runnable;
        }

        public void finalizeResources() {
            this.cleanable.run();
        }
    }

    private Cleaner() {
    }

    public static Cleaner create() {
        Cleaner cleaner = new Cleaner();
        cleaner.impl.register(cleaner, new Cleaner$$ExternalSyntheticLambda0(0));
        cleaner.impl.start();
        return cleaner;
    }

    public void register(@NonNull Object obj, @NonNull Runnable runnable) {
        Objects.requireNonNull(obj, "obj");
        Objects.requireNonNull(runnable, "action");
        this.impl.register(obj, runnable);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$create$0() {
    }
}
