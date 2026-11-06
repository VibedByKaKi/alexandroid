package org.apache.commons.net;

import java.io.Serializable;
import java.util.EventListener;
import java.util.Iterator;
import org.apache.commons.net.util.ListenerList;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes11.dex */
public class ProtocolCommandSupport implements Serializable {
    private static final long serialVersionUID = -8017692739988399978L;
    private final ListenerList listeners = new ListenerList();
    private final Object source;

    public ProtocolCommandSupport(Object obj) {
        this.source = obj;
    }

    public void addProtocolCommandListener(ProtocolCommandListener protocolCommandListener) {
        this.listeners.addListener(protocolCommandListener);
    }

    public void fireCommandSent(String str, String str2) {
        ProtocolCommandEvent protocolCommandEvent = new ProtocolCommandEvent(this.source, str, str2);
        Iterator<EventListener> it2 = this.listeners.iterator();
        while (it2.hasNext()) {
            ((ProtocolCommandListener) it2.next()).protocolCommandSent(protocolCommandEvent);
        }
    }

    public void fireReplyReceived(int i, String str) {
        ProtocolCommandEvent protocolCommandEvent = new ProtocolCommandEvent(this.source, i, str);
        Iterator<EventListener> it2 = this.listeners.iterator();
        while (it2.hasNext()) {
            ((ProtocolCommandListener) it2.next()).protocolReplyReceived(protocolCommandEvent);
        }
    }

    public int getListenerCount() {
        return this.listeners.getListenerCount();
    }

    public void removeProtocolCommandListener(ProtocolCommandListener protocolCommandListener) {
        this.listeners.removeListener(protocolCommandListener);
    }
}
