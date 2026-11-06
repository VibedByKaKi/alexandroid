package amazon.speech.simclient.common.queue;

import amazon.speech.simclient.common.queue.QueueRequest;
import android.util.Log;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Objects;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes.dex */
public class RequestQueue {
    private static final String TAG = "SPCH-RequestQueue";
    private volatile QueueRequest mCurrentRequest;
    private final Deque<QueueRequest> mQueue = new LinkedList();
    private final QueueRequest.StatusListener mStatusListener = new QueueRequest.StatusListener() { // from class: amazon.speech.simclient.common.queue.RequestQueue.1
        @Override // amazon.speech.simclient.common.queue.QueueRequest.StatusListener
        public void onFinished(QueueRequest queueRequest) {
            synchronized (RequestQueue.this) {
                try {
                    if (!Objects.equals(RequestQueue.this.mCurrentRequest, queueRequest)) {
                        Log.wtf(RequestQueue.TAG, "Request " + queueRequest.getId() + " finished, but it wasn't the current request.");
                    }
                    RequestQueue.this.mCurrentRequest = null;
                    RequestQueue.this.tryRunNext();
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    };

    private synchronized void addToQueue(QueueRequest queueRequest, boolean z) {
        if (!queueRequest.initialize(this.mStatusListener)) {
            Log.e(TAG, "Request (" + queueRequest.getId() + ") could not be initialized and will not be run.");
            return;
        }
        Deque<QueueRequest> deque = this.mQueue;
        if (z) {
            deque.addFirst(queueRequest);
        } else {
            deque.addLast(queueRequest);
        }
        queueRequest.getId();
        tryRunNext();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void tryRunNext() {
        if (this.mCurrentRequest == null) {
            if (this.mQueue.isEmpty()) {
                return;
            }
            this.mCurrentRequest = this.mQueue.pop();
            this.mCurrentRequest.invoke();
            return;
        }
        Log.i(TAG, "Request (" + this.mCurrentRequest.getId() + ") is already running, returning.");
    }

    public RequestQueue addToFront(QueueRequest queueRequest) {
        addToQueue(queueRequest, true);
        return this;
    }

    public RequestQueue enqueue(QueueRequest queueRequest) {
        addToQueue(queueRequest, false);
        return this;
    }

    @Deprecated
    public synchronized QueueRequest peek() {
        try {
        } catch (Throwable th) {
            throw th;
        }
        return this.mCurrentRequest != null ? this.mCurrentRequest : this.mQueue.peek();
    }
}
