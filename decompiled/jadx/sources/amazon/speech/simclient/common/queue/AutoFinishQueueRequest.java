package amazon.speech.simclient.common.queue;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes.dex */
public abstract class AutoFinishQueueRequest extends QueueRequest {
    @Override // amazon.speech.simclient.common.queue.QueueRequest
    public void invoke() {
        super.invoke();
        onFinished();
    }
}
