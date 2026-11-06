package amazon.speech.simclient.common.queue;

import amazon.speech.simclient.common.queue.delay.Delay;
import android.os.Handler;
import android.util.Log;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes.dex */
public abstract class QueueRequest {
    private static final AtomicInteger INSTANCE_COUNT = new AtomicInteger();
    private static final String TAG = "SPCH-QueueRequest";
    private final Handler mHandler;
    private final int mId;
    private volatile int mRetryCount;
    private final Delay mRetryDelay;
    private Runnable mRetryRunnable;
    private volatile State mState;
    private volatile StatusListener mStatusListener;
    private final Delay mTimeoutDelay;
    private TimeoutRunnable mTimeoutRunnable;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class InvocationMetadata {
        private final int mQueueRequestId;
        private final int mRetryNumber;

        public InvocationMetadata(int i, int i2) {
            this.mQueueRequestId = i;
            this.mRetryNumber = i2;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof InvocationMetadata)) {
                return false;
            }
            InvocationMetadata invocationMetadata = (InvocationMetadata) obj;
            return this.mQueueRequestId == invocationMetadata.mQueueRequestId && this.mRetryNumber == invocationMetadata.mRetryNumber;
        }

        public int hashCode() {
            return Objects.hash(Integer.valueOf(this.mQueueRequestId), Integer.valueOf(this.mRetryNumber));
        }

        public int queueRequestId() {
            return this.mQueueRequestId;
        }

        public int retryNumber() {
            return this.mRetryNumber;
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public enum State {
        Created,
        Initialized,
        Running,
        Finished
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface StatusListener {
        void onFinished(QueueRequest queueRequest);
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public class TimeoutRunnable implements Runnable {
        private final InvocationMetadata mInvocationMetadata;

        public TimeoutRunnable(InvocationMetadata invocationMetadata) {
            this.mInvocationMetadata = invocationMetadata;
        }

        @Override // java.lang.Runnable
        public void run() {
            Log.w(QueueRequest.TAG, String.format("Request (%d) timed out for retry (%d).", Integer.valueOf(QueueRequest.this.mId), Integer.valueOf(this.mInvocationMetadata.retryNumber())));
            QueueRequest.this.onTimeout(this.mInvocationMetadata);
        }
    }

    public QueueRequest(Delay delay, Delay delay2, Handler handler) {
        this.mRetryCount = 0;
        this.mId = INSTANCE_COUNT.getAndIncrement();
        this.mState = State.Created;
        this.mTimeoutDelay = delay;
        this.mRetryDelay = delay2;
        this.mHandler = handler;
    }

    private void clearRunnables() {
        this.mHandler.removeCallbacks(this.mTimeoutRunnable);
        this.mTimeoutRunnable = null;
        this.mHandler.removeCallbacks(this.mRetryRunnable);
        this.mRetryRunnable = null;
    }

    private boolean isInvocationMetadataValid(InvocationMetadata invocationMetadata) {
        if (invocationMetadata.queueRequestId() != this.mId) {
            Single$$ExternalSyntheticBUOutline0.m$3("Invocation metadata can not be shared between requests.");
            return false;
        }
        if (invocationMetadata.retryNumber() >= this.mRetryCount) {
            return true;
        }
        Log.w(TAG, "This invocation is not for the current retry number, ignoring request.");
        return false;
    }

    public int getId() {
        return this.mId;
    }

    public int getRetryCount() {
        return this.mRetryCount;
    }

    public boolean initialize(StatusListener statusListener) {
        if (this.mState == State.Created) {
            this.mState = State.Initialized;
            this.mStatusListener = statusListener;
            return true;
        }
        Log.w(TAG, "Request (" + this.mId + ") was already initialized, can't initialize again.");
        return false;
    }

    public void invoke() {
        InvocationMetadata invocationMetadata;
        synchronized (this) {
            try {
                this.mState = State.Running;
                invocationMetadata = new InvocationMetadata(this.mId, this.mRetryCount);
                if (this.mHandler != null) {
                    clearRunnables();
                    TimeoutRunnable timeoutRunnable = new TimeoutRunnable(invocationMetadata);
                    this.mTimeoutRunnable = timeoutRunnable;
                    this.mHandler.postDelayed(timeoutRunnable, this.mTimeoutDelay.delay(invocationMetadata.retryNumber()));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (invocationMetadata.retryNumber() > 0) {
            String.format("Running Request (%d). Retry number (%d).", Integer.valueOf(this.mId), Integer.valueOf(invocationMetadata.retryNumber()));
        }
        onInvoke(invocationMetadata.retryNumber());
        onInvoke(invocationMetadata);
    }

    public void onFinished() {
        synchronized (this) {
            try {
                State state = this.mState;
                State state2 = State.Finished;
                if (state == state2) {
                    Log.w(TAG, "Ignoring repeated onFinished for request (" + this.mId + ").");
                    return;
                }
                this.mState = state2;
                if (this.mHandler != null) {
                    clearRunnables();
                }
                StatusListener statusListener = this.mStatusListener;
                this.mStatusListener = null;
                if (statusListener != null) {
                    statusListener.onFinished(this);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public boolean retry(InvocationMetadata invocationMetadata) {
        synchronized (this) {
            try {
                if (!isInvocationMetadataValid(invocationMetadata)) {
                    return false;
                }
                if (this.mHandler != null) {
                    clearRunnables();
                }
                if (this.mState == State.Initialized || this.mState == State.Running) {
                    this.mRetryCount++;
                    invoke();
                    return true;
                }
                Log.e(TAG, "Request (" + this.mId + ") not initialized or not running. Unable to retry");
                return false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public synchronized void retryWithDelay(final InvocationMetadata invocationMetadata, Delay delay) {
        if (isInvocationMetadataValid(invocationMetadata)) {
            clearRunnables();
            this.mRetryRunnable = new Runnable() { // from class: amazon.speech.simclient.common.queue.QueueRequest.1
                @Override // java.lang.Runnable
                public void run() {
                    QueueRequest.this.retry(invocationMetadata);
                }
            };
            long delay2 = delay.delay(invocationMetadata.retryNumber());
            Log.i(TAG, String.format("Retrying request (%d) with a delay of (%d) ms", Integer.valueOf(this.mId), Long.valueOf(delay2)));
            this.mHandler.postDelayed(this.mRetryRunnable, delay2);
        }
    }

    public void onInvoke(InvocationMetadata invocationMetadata) {
    }

    @Deprecated
    public void onInvoke(int i) {
    }

    public void onTimeout(InvocationMetadata invocationMetadata) {
    }

    public QueueRequest(Delay delay) {
        this(delay, null, new Handler());
    }

    public QueueRequest(Delay delay, Delay delay2) {
        this(delay, delay2, new Handler());
    }

    public QueueRequest() {
        this(null, null, null);
    }

    public void retryWithDelay(InvocationMetadata invocationMetadata) {
        retryWithDelay(invocationMetadata, this.mRetryDelay);
    }

    public boolean retry() {
        return retry(new InvocationMetadata(this.mId, this.mRetryCount));
    }
}
