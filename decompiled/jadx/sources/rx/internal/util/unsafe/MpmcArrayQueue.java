package rx.internal.util.unsafe;

import rx.Single$$ExternalSyntheticBUOutline0;
import rx.internal.util.SuppressAnimalSniffer;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@SuppressAnimalSniffer
/* loaded from: classes12.dex */
public class MpmcArrayQueue<E> extends MpmcArrayQueueConsumerField<E> {
    long p30;
    long p31;
    long p32;
    long p33;
    long p34;
    long p35;
    long p36;
    long p37;
    long p40;
    long p41;
    long p42;
    long p43;
    long p44;
    long p45;
    long p46;

    public MpmcArrayQueue(int i) {
        super(Math.max(2, i));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, rx.internal.util.unsafe.MessagePassingQueue
    public boolean isEmpty() {
        return lvConsumerIndex() == lvProducerIndex();
    }

    @Override // java.util.Queue, rx.internal.util.unsafe.MessagePassingQueue
    public boolean offer(E e) {
        long j;
        long[] jArr;
        MpmcArrayQueue<E> mpmcArrayQueue = this;
        if (e == null) {
            Single$$ExternalSyntheticBUOutline0.m$1("Null is not a valid element");
            return false;
        }
        long j2 = 1;
        long j3 = mpmcArrayQueue.mask + 1;
        long[] jArr2 = mpmcArrayQueue.sequenceBuffer;
        long j4 = Long.MAX_VALUE;
        while (true) {
            long lvProducerIndex = mpmcArrayQueue.lvProducerIndex();
            long j5 = j3;
            long calcSequenceOffset = mpmcArrayQueue.calcSequenceOffset(lvProducerIndex);
            long lvSequence = mpmcArrayQueue.lvSequence(jArr2, calcSequenceOffset) - lvProducerIndex;
            if (lvSequence == 0) {
                j = j2;
                long j6 = lvProducerIndex + j;
                if (mpmcArrayQueue.casProducerIndex(lvProducerIndex, j6)) {
                    mpmcArrayQueue.spElement(mpmcArrayQueue.calcElementOffset(lvProducerIndex), e);
                    mpmcArrayQueue.soSequence(jArr2, calcSequenceOffset, j6);
                    return true;
                }
                jArr = jArr2;
            } else {
                j = j2;
                jArr = jArr2;
                if (lvSequence < 0) {
                    long j7 = lvProducerIndex - j5;
                    if (j7 <= j4) {
                        long lvConsumerIndex = lvConsumerIndex();
                        if (j7 <= lvConsumerIndex) {
                            return false;
                        }
                        j4 = lvConsumerIndex;
                    } else {
                        continue;
                    }
                } else {
                    continue;
                }
            }
            jArr2 = jArr;
            j3 = j5;
            j2 = j;
            mpmcArrayQueue = this;
        }
    }

    @Override // java.util.Queue, rx.internal.util.unsafe.MessagePassingQueue
    public E peek() {
        long lvConsumerIndex;
        E lpElement;
        do {
            lvConsumerIndex = lvConsumerIndex();
            lpElement = lpElement(calcElementOffset(lvConsumerIndex));
            if (lpElement != null) {
                break;
            }
        } while (lvConsumerIndex != lvProducerIndex());
        return lpElement;
    }

    @Override // java.util.Queue, rx.internal.util.unsafe.MessagePassingQueue
    public E poll() {
        MpmcArrayQueue<E> mpmcArrayQueue = this;
        long[] jArr = mpmcArrayQueue.sequenceBuffer;
        long j = -1;
        while (true) {
            long lvConsumerIndex = mpmcArrayQueue.lvConsumerIndex();
            long j2 = j;
            long calcSequenceOffset = mpmcArrayQueue.calcSequenceOffset(lvConsumerIndex);
            long j3 = lvConsumerIndex + 1;
            long lvSequence = mpmcArrayQueue.lvSequence(jArr, calcSequenceOffset) - j3;
            if (lvSequence == 0) {
                if (mpmcArrayQueue.casConsumerIndex(lvConsumerIndex, j3)) {
                    long calcElementOffset = mpmcArrayQueue.calcElementOffset(lvConsumerIndex);
                    E lpElement = mpmcArrayQueue.lpElement(calcElementOffset);
                    mpmcArrayQueue.spElement(calcElementOffset, null);
                    mpmcArrayQueue.soSequence(jArr, calcSequenceOffset, lvConsumerIndex + mpmcArrayQueue.mask + 1);
                    return lpElement;
                }
            } else if (lvSequence < 0 && lvConsumerIndex >= j2) {
                j = lvProducerIndex();
                if (lvConsumerIndex == j) {
                    return null;
                }
                mpmcArrayQueue = this;
            }
            j = j2;
            mpmcArrayQueue = this;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, rx.internal.util.unsafe.MessagePassingQueue
    public int size() {
        long lvConsumerIndex = lvConsumerIndex();
        while (true) {
            long lvProducerIndex = lvProducerIndex();
            long lvConsumerIndex2 = lvConsumerIndex();
            if (lvConsumerIndex == lvConsumerIndex2) {
                return (int) (lvProducerIndex - lvConsumerIndex2);
            }
            lvConsumerIndex = lvConsumerIndex2;
        }
    }
}
