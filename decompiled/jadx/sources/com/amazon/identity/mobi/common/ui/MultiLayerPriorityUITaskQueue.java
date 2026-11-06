package com.amazon.identity.mobi.common.ui;

import com.amazon.identity.mobi.common.ui.UIType;
import com.amazon.identity.mobi.common.utils.MetricsEmitter;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.LinkedBlockingDeque;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public class MultiLayerPriorityUITaskQueue {
    private final MetricsEmitter mMetricsEmitter;
    private final TreeMap mPendingQueueTreeMap = new TreeMap(new UIType.UITypeComparator());
    private int mTotalUITasksSizeAcrossUIType = 0;

    public MultiLayerPriorityUITaskQueue(MetricsEmitter metricsEmitter) {
        this.mMetricsEmitter = metricsEmitter;
    }

    public synchronized void addToLayerFirst(UITask uITask) {
        try {
            UIType uIType = uITask.getUIType();
            LinkedBlockingDeque linkedBlockingDeque = (LinkedBlockingDeque) this.mPendingQueueTreeMap.get(uIType);
            if (linkedBlockingDeque == null) {
                linkedBlockingDeque = new LinkedBlockingDeque(uIType.getUiPendingQueueCapacity());
                this.mPendingQueueTreeMap.put(uIType, linkedBlockingDeque);
            }
            if (linkedBlockingDeque.remainingCapacity() == 0) {
                this.mMetricsEmitter.incrementCounterAndRecord(UIMetrics.buildMetricForUiTask(UIMetrics.DROP_MESSAGE_FROM_QUEUE_TAIL, (UITask) linkedBlockingDeque.pollLast()));
                this.mTotalUITasksSizeAcrossUIType--;
            }
            linkedBlockingDeque.offerFirst(uITask);
            this.mTotalUITasksSizeAcrossUIType++;
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized void addToLayerLast(UITask uITask) {
        try {
            UIType uIType = uITask.getUIType();
            LinkedBlockingDeque linkedBlockingDeque = (LinkedBlockingDeque) this.mPendingQueueTreeMap.get(uIType);
            if (linkedBlockingDeque == null) {
                linkedBlockingDeque = new LinkedBlockingDeque(uIType.getUiPendingQueueCapacity());
                this.mPendingQueueTreeMap.put(uIType, linkedBlockingDeque);
            }
            if (linkedBlockingDeque.remainingCapacity() == 0) {
                this.mMetricsEmitter.incrementCounterAndRecord(UIMetrics.buildMetricForUiTask(UIMetrics.DROP_MESSAGE_FROM_QUEUE_HEAD, (UITask) linkedBlockingDeque.pollFirst()));
                this.mTotalUITasksSizeAcrossUIType--;
            }
            linkedBlockingDeque.offerLast(uITask);
            this.mTotalUITasksSizeAcrossUIType++;
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized void clear() {
        this.mPendingQueueTreeMap.clear();
        this.mTotalUITasksSizeAcrossUIType = 0;
    }

    public synchronized boolean contains(UITask uITask) {
        LinkedBlockingDeque linkedBlockingDeque;
        try {
            UIType uIType = uITask.getUIType();
            linkedBlockingDeque = (LinkedBlockingDeque) this.mPendingQueueTreeMap.get(uIType);
            if (linkedBlockingDeque == null) {
                linkedBlockingDeque = new LinkedBlockingDeque(uIType.getUiPendingQueueCapacity());
                this.mPendingQueueTreeMap.put(uIType, linkedBlockingDeque);
            }
        } catch (Throwable th) {
            throw th;
        }
        return linkedBlockingDeque.contains(uITask);
    }

    public synchronized boolean isEmpty() {
        return this.mTotalUITasksSizeAcrossUIType == 0;
    }

    public synchronized UITask removeFirst() {
        Iterator it2 = this.mPendingQueueTreeMap.entrySet().iterator();
        while (it2.hasNext()) {
            LinkedBlockingDeque linkedBlockingDeque = (LinkedBlockingDeque) ((Map.Entry) it2.next()).getValue();
            if (!linkedBlockingDeque.isEmpty()) {
                this.mTotalUITasksSizeAcrossUIType--;
                return (UITask) linkedBlockingDeque.pollFirst();
            }
        }
        return null;
    }

    public synchronized UITask removeLast() {
        Iterator it2 = this.mPendingQueueTreeMap.descendingKeySet().iterator();
        while (it2.hasNext()) {
            LinkedBlockingDeque linkedBlockingDeque = (LinkedBlockingDeque) this.mPendingQueueTreeMap.get((UIType) it2.next());
            if (linkedBlockingDeque != null && !linkedBlockingDeque.isEmpty()) {
                this.mTotalUITasksSizeAcrossUIType--;
                return (UITask) linkedBlockingDeque.pollLast();
            }
        }
        return null;
    }

    public synchronized int size() {
        return this.mTotalUITasksSizeAcrossUIType;
    }
}
