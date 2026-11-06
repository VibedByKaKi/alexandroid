package com.amazon.alexa.accessory.capabilities.fitness;

import com.amazon.alexa.aamb.Automotive$$ExternalSyntheticOutline0;
import com.amazon.alexa.accessory.internal.repositories.CompletableResult;
import com.amazon.alexa.accessory.internal.taskmanager.TaskManager;
import com.amazon.alexa.accessory.internal.util.Logger;
import com.amazon.alexa.accessory.internal.util.Preconditions;
import com.amazon.alexa.accessory.protocol.Accessories;
import com.amazon.alexa.accessory.protocol.Common;
import com.amazon.alexa.accessory.repositories.Producer;
import com.amazon.alexa.accessory.repositories.fitness.FitnessSession;
import com.amazon.alexa.accessory.streams.control.ControlResponseHandler;
import com.amazon.alexa.accessory.streams.control.ControlStream;
import com.amazon.alexa.accessory.streams.control.ProtobufControlMessage;
import java.io.IOException;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes15.dex */
final class SetFitnessSessionTask implements TaskManager.Task {
    private final Callback callback;
    private final FitnessSession fitnessSession;
    private final Producer.Result<CompletableResult.Value> result;
    private final ControlStream stream;
    private ControlResponseHandler syncFitnessDataResponseHandler;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface Callback {
        void onDisposed(SetFitnessSessionTask setFitnessSessionTask);
    }

    public SetFitnessSessionTask(FitnessSession fitnessSession, ControlStream controlStream, Producer.Result<CompletableResult.Value> result, Callback callback) {
        Preconditions.notNull(fitnessSession, "fitnessSession");
        Preconditions.notNull(callback, "fitnessSession");
        Preconditions.notNull(controlStream, "stream");
        Preconditions.notNull(result, "result");
        this.fitnessSession = fitnessSession;
        this.callback = callback;
        this.stream = controlStream;
        this.result = result;
    }

    private void handleSyncFitnessSessionResponse(Accessories.Response response) {
        Logger.d("SetFitnessSessionTask.handleSyncFitnessSessionResponse(...)");
        if (Common.ErrorCode.SUCCESS == response.getErrorCode()) {
            Logger.d("SetFitnessSessionTask: SyncFitnessSession successful");
            this.result.complete(CompletableResult.Value.complete());
        } else {
            Logger.d("SetFitnessSessionTask: SyncFitnessSession failed. Response: %s", response.getErrorCode());
            this.result.completeWithError(new IllegalStateException(Automotive$$ExternalSyntheticOutline0.m(response, new StringBuilder("Unsuccessful Response to SyncFitnessSession Command: "))));
        }
        dispose();
    }

    private void invokeSyncFitnessSession() {
        Logger.d("SetFitnessSessionTask.invokeSyncFitnessSession()");
        GetFitnessDataTask$$ExternalSyntheticLambda0 getFitnessDataTask$$ExternalSyntheticLambda0 = new GetFitnessDataTask$$ExternalSyntheticLambda0(this, 1);
        this.syncFitnessDataResponseHandler = getFitnessDataTask$$ExternalSyntheticLambda0;
        ControlStream controlStream = this.stream;
        Accessories.Command command = Accessories.Command.SYNC_FITNESS_SESSION;
        controlStream.addResponseHandler(command, getFitnessDataTask$$ExternalSyntheticLambda0);
        try {
            this.stream.dispatch(new ProtobufControlMessage(Accessories.ControlEnvelope.newBuilder().setCommand(command).setSyncFitnessSession(FitnessSessionHelper.marshal(this.fitnessSession)).build()));
        } catch (IOException e) {
            this.result.completeWithError(e);
            dispose();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$invokeSyncFitnessSession$0(ControlStream controlStream, Accessories.Command command, Accessories.Response response) throws Exception {
        handleSyncFitnessSessionResponse(response);
    }

    public void dispose() {
        Logger.d("SetFitnessSessionTask.dispose()");
        ControlResponseHandler controlResponseHandler = this.syncFitnessDataResponseHandler;
        if (controlResponseHandler != null) {
            this.stream.removeResponseHandler(controlResponseHandler);
        }
        this.callback.onDisposed(this);
    }

    @Override // com.amazon.alexa.accessory.internal.taskmanager.TaskManager.Task
    public void onStateChanged(int i, int i2) {
        if (i == 0 && 3 == i2) {
            invokeSyncFitnessSession();
        } else if (1 == i && 3 == i2) {
            invokeSyncFitnessSession();
        }
    }

    public String toString() {
        return "SetFitnessSessionTask";
    }
}
