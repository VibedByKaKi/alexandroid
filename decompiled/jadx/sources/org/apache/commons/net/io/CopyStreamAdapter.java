package org.apache.commons.net.io;

import java.util.EventListener;
import java.util.Iterator;
import org.apache.commons.net.util.ListenerList;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes11.dex */
public class CopyStreamAdapter implements CopyStreamListener {
    private final ListenerList internalListeners = new ListenerList();

    public void addCopyStreamListener(CopyStreamListener copyStreamListener) {
        this.internalListeners.addListener(copyStreamListener);
    }

    @Override // org.apache.commons.net.io.CopyStreamListener
    public void bytesTransferred(long j, int i, long j2) {
        Iterator<EventListener> it2 = this.internalListeners.iterator();
        while (it2.hasNext()) {
            ((CopyStreamListener) it2.next()).bytesTransferred(j, i, j2);
        }
    }

    public void removeCopyStreamListener(CopyStreamListener copyStreamListener) {
        this.internalListeners.removeListener(copyStreamListener);
    }

    @Override // org.apache.commons.net.io.CopyStreamListener
    public void bytesTransferred(CopyStreamEvent copyStreamEvent) {
        Iterator<EventListener> it2 = this.internalListeners.iterator();
        while (it2.hasNext()) {
            ((CopyStreamListener) it2.next()).bytesTransferred(copyStreamEvent);
        }
    }
}
