package androidx.javascriptengine;

import android.content.res.AssetFileDescriptor;
import android.os.ParcelFileDescriptor;
import androidx.core.util.Consumer;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes14.dex */
final class IsolateClosedState implements IsolateState {
    private final String mDescription;

    public IsolateClosedState(String str) {
        this.mDescription = str;
    }

    @Override // androidx.javascriptengine.IsolateState
    public void addOnTerminatedCallback(Executor executor, Consumer<TerminationInfo> consumer) {
        throw new IllegalStateException("Calling addOnTerminatedCallback() when " + this.mDescription);
    }

    @Override // androidx.javascriptengine.IsolateState
    public boolean canDie() {
        return false;
    }

    @Override // androidx.javascriptengine.IsolateState
    public void clearConsoleCallback() {
        throw new IllegalStateException("Calling clearConsoleCallback() when " + this.mDescription);
    }

    @Override // androidx.javascriptengine.IsolateState
    public ListenableFuture<String> evaluateJavaScriptAsync(String str) {
        throw new IllegalStateException("Calling evaluateJavaScriptAsync() when " + this.mDescription);
    }

    @Override // androidx.javascriptengine.IsolateState
    public MessagePort provideMessagePort(String str, Executor executor, MessagePortClient messagePortClient) {
        throw new IllegalStateException("Calling provideMessagePort() when " + this.mDescription);
    }

    @Override // androidx.javascriptengine.IsolateState
    public void provideNamedData(String str, byte[] bArr) {
        throw new IllegalStateException("Calling provideNamedData() when " + this.mDescription);
    }

    @Override // androidx.javascriptengine.IsolateState
    public void removeOnTerminatedCallback(Consumer<TerminationInfo> consumer) {
        throw new IllegalStateException("Calling removeOnTerminatedCallback() when " + this.mDescription);
    }

    @Override // androidx.javascriptengine.IsolateState
    public void setConsoleCallback(Executor executor, JavaScriptConsoleCallback javaScriptConsoleCallback) {
        throw new IllegalStateException("Calling setConsoleCallback() when " + this.mDescription);
    }

    @Override // androidx.javascriptengine.IsolateState
    public void close() {
    }

    @Override // androidx.javascriptengine.IsolateState
    public ListenableFuture<String> evaluateJavaScriptAsync(AssetFileDescriptor assetFileDescriptor) {
        throw new IllegalStateException("Calling evaluateJavaScriptAsync() when " + this.mDescription);
    }

    @Override // androidx.javascriptengine.IsolateState
    public void setConsoleCallback(JavaScriptConsoleCallback javaScriptConsoleCallback) {
        throw new IllegalStateException("Calling setConsoleCallback() when " + this.mDescription);
    }

    @Override // androidx.javascriptengine.IsolateState
    public ListenableFuture<String> evaluateJavaScriptAsync(ParcelFileDescriptor parcelFileDescriptor) {
        throw new IllegalStateException("Calling evaluateJavaScriptAsync() when " + this.mDescription);
    }
}
