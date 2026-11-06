package org.greenrobot.eventbus;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes11.dex */
final class PendingPostQueue {
    private PendingPost head;
    private PendingPost tail;

    public synchronized void enqueue(PendingPost pendingPost) {
        try {
            if (pendingPost == null) {
                throw new NullPointerException("null cannot be enqueued");
            }
            PendingPost pendingPost2 = this.tail;
            if (pendingPost2 != null) {
                pendingPost2.next = pendingPost;
                this.tail = pendingPost;
            } else {
                if (this.head != null) {
                    throw new IllegalStateException("Head present, but no tail");
                }
                this.tail = pendingPost;
                this.head = pendingPost;
            }
            notifyAll();
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized PendingPost poll() {
        PendingPost pendingPost;
        pendingPost = this.head;
        if (pendingPost != null) {
            PendingPost pendingPost2 = pendingPost.next;
            this.head = pendingPost2;
            if (pendingPost2 == null) {
                this.tail = null;
            }
        }
        return pendingPost;
    }

    public synchronized PendingPost poll(int i) throws InterruptedException {
        try {
            if (this.head == null) {
                wait(i);
            }
        } catch (Throwable th) {
            throw th;
        }
        return poll();
    }
}
