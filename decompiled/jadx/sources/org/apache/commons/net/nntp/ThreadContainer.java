package org.apache.commons.net.nntp;

import org.bouncycastle.asn1.ocsp.CrlID$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes11.dex */
class ThreadContainer {
    ThreadContainer child;
    ThreadContainer next;
    ThreadContainer parent;
    Threadable threadable;

    public boolean findChild(ThreadContainer threadContainer) {
        ThreadContainer threadContainer2 = this.child;
        if (threadContainer2 == null) {
            return false;
        }
        if (threadContainer2 == threadContainer) {
            return true;
        }
        return threadContainer2.findChild(threadContainer);
    }

    public void flush() {
        if (this.parent != null && this.threadable == null) {
            CrlID$$ExternalSyntheticBUOutline0.m$3(this, "no threadable in ");
            return;
        }
        this.parent = null;
        Threadable threadable = this.threadable;
        if (threadable != null) {
            ThreadContainer threadContainer = this.child;
            threadable.setChild(threadContainer == null ? null : threadContainer.threadable);
        }
        ThreadContainer threadContainer2 = this.child;
        if (threadContainer2 != null) {
            threadContainer2.flush();
            this.child = null;
        }
        Threadable threadable2 = this.threadable;
        if (threadable2 != null) {
            ThreadContainer threadContainer3 = this.next;
            threadable2.setNext(threadContainer3 == null ? null : threadContainer3.threadable);
        }
        ThreadContainer threadContainer4 = this.next;
        if (threadContainer4 != null) {
            threadContainer4.flush();
            this.next = null;
        }
        this.threadable = null;
    }

    public void reverseChildren() {
        ThreadContainer threadContainer = this.child;
        if (threadContainer != null) {
            ThreadContainer threadContainer2 = threadContainer.next;
            ThreadContainer threadContainer3 = null;
            while (threadContainer != null) {
                threadContainer.next = threadContainer3;
                threadContainer3 = threadContainer;
                threadContainer = threadContainer2;
                threadContainer2 = threadContainer2 == null ? null : threadContainer2.next;
            }
            this.child = threadContainer3;
            while (threadContainer3 != null) {
                threadContainer3.reverseChildren();
                threadContainer3 = threadContainer3.next;
            }
        }
    }
}
