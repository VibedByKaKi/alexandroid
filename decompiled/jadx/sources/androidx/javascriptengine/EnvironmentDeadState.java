package androidx.javascriptengine;

import android.content.res.AssetFileDescriptor;
import android.os.ParcelFileDescriptor;
import androidx.concurrent.futures.CallbackToFutureAdapter;
import androidx.core.util.Consumer;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes14.dex */
final class EnvironmentDeadState implements IsolateState {
    private final TerminationInfo mTerminationInfo;

    public EnvironmentDeadState(TerminationInfo terminationInfo) {
        this.mTerminationInfo = terminationInfo;
    }

    private ListenableFuture<String> getEnvironmentDeadFuture() {
        return CallbackToFutureAdapter.getFuture(new CallbackToFutureAdapter.Resolver() { // from class: androidx.javascriptengine.EnvironmentDeadState$$ExternalSyntheticLambda0
            @Override // androidx.concurrent.futures.CallbackToFutureAdapter.Resolver
            public final Object attachCompleter(CallbackToFutureAdapter.Completer completer) {
                Object lambda$getEnvironmentDeadFuture$1;
                lambda$getEnvironmentDeadFuture$1 = EnvironmentDeadState.this.lambda$getEnvironmentDeadFuture$1(completer);
                return lambda$getEnvironmentDeadFuture$1;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$addOnTerminatedCallback$0(Consumer consumer) {
        consumer.accept(this.mTerminationInfo);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object lambda$getEnvironmentDeadFuture$1(CallbackToFutureAdapter.Completer completer) throws Exception {
        completer.setException(this.mTerminationInfo.toJavaScriptException());
        return "evaluateJavascript Future";
    }

    @Override // androidx.javascriptengine.IsolateState
    public void addOnTerminatedCallback(Executor executor, Consumer<TerminationInfo> consumer) {
        executor.execute(new JavaScriptSandbox$$ExternalSyntheticLambda2(this, consumer, 1));
    }

    @Override // androidx.javascriptengine.IsolateState
    public boolean canDie() {
        return false;
    }

    @Override // androidx.javascriptengine.IsolateState
    public ListenableFuture<String> evaluateJavaScriptAsync(String str) {
        return getEnvironmentDeadFuture();
    }

    @Override // androidx.javascriptengine.IsolateState
    public MessagePort provideMessagePort(String str, Executor executor, MessagePortClient messagePortClient) {
        return new MessagePort();
    }

    @Override // androidx.javascriptengine.IsolateState
    public void setConsoleCallback(Executor executor, JavaScriptConsoleCallback javaScriptConsoleCallback) {
    }

    @Override // androidx.javascriptengine.IsolateState
    public ListenableFuture<String> evaluateJavaScriptAsync(AssetFileDescriptor assetFileDescriptor) {
        return getEnvironmentDeadFuture();
    }

    @Override // androidx.javascriptengine.IsolateState
    public ListenableFuture<String> evaluateJavaScriptAsync(ParcelFileDescriptor parcelFileDescriptor) {
        return getEnvironmentDeadFuture();
    }

    @Override // androidx.javascriptengine.IsolateState
    public void clearConsoleCallback() {
    }

    @Override // androidx.javascriptengine.IsolateState
    public void close() {
    }

    @Override // androidx.javascriptengine.IsolateState
    public void removeOnTerminatedCallback(Consumer<TerminationInfo> consumer) {
    }

    @Override // androidx.javascriptengine.IsolateState
    public void setConsoleCallback(JavaScriptConsoleCallback javaScriptConsoleCallback) {
    }

    @Override // androidx.javascriptengine.IsolateState
    public void provideNamedData(String str, byte[] bArr) {
    }
}
