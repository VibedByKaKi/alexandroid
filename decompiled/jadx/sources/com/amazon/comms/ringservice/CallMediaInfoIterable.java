package com.amazon.comms.ringservice;

import java.util.Iterator;
import org.pjsip.pjsua2.CallMediaInfo;
import org.pjsip.pjsua2.CallMediaInfoVector;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class CallMediaInfoIterable implements Iterable<CallMediaInfo> {
    private final CallMediaInfoVector mediaInfoVector;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class CallMediaInfoIterator implements Iterator<CallMediaInfo> {
        private int curIndex = 0;
        private final CallMediaInfoVector mediaInfoVector;

        public CallMediaInfoIterator(CallMediaInfoVector callMediaInfoVector) {
            this.mediaInfoVector = callMediaInfoVector;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return ((long) this.curIndex) < this.mediaInfoVector.size();
        }

        @Override // java.util.Iterator
        public CallMediaInfo next() {
            CallMediaInfo callMediaInfo = this.mediaInfoVector.get(this.curIndex);
            this.curIndex++;
            return callMediaInfo;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Remove not supported for CallMediaInfoIterator");
        }
    }

    public CallMediaInfoIterable(CallMediaInfoVector callMediaInfoVector) {
        this.mediaInfoVector = callMediaInfoVector;
    }

    @Override // java.lang.Iterable
    public Iterator<CallMediaInfo> iterator() {
        return new CallMediaInfoIterator(this.mediaInfoVector);
    }
}
