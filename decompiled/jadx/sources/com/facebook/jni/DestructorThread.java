package com.facebook.jni;

import java.lang.ref.PhantomReference;
import java.lang.ref.ReferenceQueue;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class DestructorThread {
    private static final Thread sThread;
    private static final DestructorStack sDestructorStack = new DestructorStack();
    private static final ReferenceQueue sReferenceQueue = new ReferenceQueue();
    private static final DestructorList sDestructorList = new DestructorList();

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class DestructorList {
        private final Destructor mHead;

        public DestructorList() {
            Terminus terminus = new Terminus();
            this.mHead = terminus;
            ((Destructor) terminus).next = new Terminus();
            ((Destructor) terminus).next.previous = terminus;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static void drop(Destructor destructor) {
            destructor.next.previous = destructor.previous;
            destructor.previous.next = destructor.next;
        }

        public void enqueue(Destructor destructor) {
            destructor.next = this.mHead.next;
            this.mHead.next = destructor;
            destructor.next.previous = destructor;
            destructor.previous = this.mHead;
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class DestructorStack {
        private final AtomicReference<Destructor> mHead;

        private DestructorStack() {
            this.mHead = new AtomicReference<>();
        }

        public void push(Destructor destructor) {
            while (true) {
                Destructor destructor2 = this.mHead.get();
                destructor.next = destructor2;
                AtomicReference<Destructor> atomicReference = this.mHead;
                while (!atomicReference.compareAndSet(destructor2, destructor)) {
                    if (atomicReference.get() != destructor2) {
                        break;
                    }
                }
                return;
            }
        }

        public void transferAllToList() {
            Destructor andSet = this.mHead.getAndSet(null);
            while (andSet != null) {
                Destructor destructor = andSet.next;
                DestructorThread.sDestructorList.enqueue(andSet);
                andSet = destructor;
            }
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class Terminus extends Destructor {
        private Terminus() {
            super();
        }

        @Override // com.facebook.jni.DestructorThread.Destructor
        public void destruct() {
            throw new IllegalStateException("Cannot destroy Terminus Destructor.");
        }
    }

    static {
        Thread thread = new Thread("HybridData DestructorThread") { // from class: com.facebook.jni.DestructorThread.1
            @Override // java.lang.Thread, java.lang.Runnable
            public void run() {
                while (true) {
                    try {
                        Destructor destructor = (Destructor) DestructorThread.sReferenceQueue.remove();
                        destructor.destruct();
                        if (destructor.previous == null) {
                            DestructorThread.sDestructorStack.transferAllToList();
                        }
                        DestructorList.drop(destructor);
                    } catch (InterruptedException unused) {
                    }
                }
            }
        };
        sThread = thread;
        thread.start();
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static abstract class Destructor extends PhantomReference<Object> {
        private Destructor next;
        private Destructor previous;

        public Destructor(Object obj) {
            super(obj, DestructorThread.sReferenceQueue);
            DestructorThread.sDestructorStack.push(this);
        }

        public abstract void destruct();

        private Destructor() {
            super(null, DestructorThread.sReferenceQueue);
        }
    }
}
