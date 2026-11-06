package org.greenrobot.eventbus;

import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes11.dex */
final class PendingPost {
    private static final List<PendingPost> pendingPostPool = new ArrayList();
    Object event;
    PendingPost next;
    Subscription subscription;

    private PendingPost(Object obj, Subscription subscription) {
        this.event = obj;
        this.subscription = subscription;
    }

    public static PendingPost obtainPendingPost(Subscription subscription, Object obj) {
        List<PendingPost> list = pendingPostPool;
        synchronized (list) {
            try {
                int size = list.size();
                if (size <= 0) {
                    return new PendingPost(obj, subscription);
                }
                PendingPost remove = list.remove(size - 1);
                remove.event = obj;
                remove.subscription = subscription;
                remove.next = null;
                return remove;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static void releasePendingPost(PendingPost pendingPost) {
        pendingPost.event = null;
        pendingPost.subscription = null;
        pendingPost.next = null;
        List<PendingPost> list = pendingPostPool;
        synchronized (list) {
            try {
                if (list.size() < 10000) {
                    list.add(pendingPost);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
