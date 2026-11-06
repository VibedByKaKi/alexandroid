package com.amazon.alexa.accessory.internal;

import androidx.room.rxjava3.RxRoom$$ExternalSyntheticLambda3;
import com.amazon.alexa.accessory.internal.util.Preconditions;
import java.util.ArrayDeque;
import java.util.Iterator;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes15.dex */
public final class ActionQueue {
    private final ArrayDeque<Action> queue = new ArrayDeque<>();

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface Action {

        /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
        public interface Callback {
            void onFinished();
        }

        void abort();

        void run(Callback callback);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void next() {
        Action peekFirst;
        synchronized (this.queue) {
            this.queue.pollFirst();
            peekFirst = this.queue.peekFirst();
        }
        if (peekFirst != null) {
            peekFirst.run(new RxRoom$$ExternalSyntheticLambda3(this, 25));
        }
    }

    public void cancelAll() {
        ArrayDeque arrayDeque;
        synchronized (this.queue) {
            arrayDeque = new ArrayDeque(this.queue);
            this.queue.clear();
        }
        Iterator it2 = arrayDeque.iterator();
        while (it2.hasNext()) {
            ((Action) it2.next()).abort();
        }
    }

    public void enqueue(Action action) {
        Preconditions.notNull(action, "action");
        synchronized (this.queue) {
            try {
                this.queue.add(action);
                if (this.queue.size() > 1) {
                    return;
                }
                action.run(new RxRoom$$ExternalSyntheticLambda3(this, 25));
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
