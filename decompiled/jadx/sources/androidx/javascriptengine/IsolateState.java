package androidx.javascriptengine;

import android.content.res.AssetFileDescriptor;
import android.os.ParcelFileDescriptor;
import androidx.core.util.Consumer;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes14.dex */
interface IsolateState {
    void addOnTerminatedCallback(Executor executor, Consumer<TerminationInfo> consumer);

    boolean canDie();

    void clearConsoleCallback();

    void close();

    ListenableFuture<String> evaluateJavaScriptAsync(AssetFileDescriptor assetFileDescriptor);

    ListenableFuture<String> evaluateJavaScriptAsync(ParcelFileDescriptor parcelFileDescriptor);

    ListenableFuture<String> evaluateJavaScriptAsync(String str);

    MessagePort provideMessagePort(String str, Executor executor, MessagePortClient messagePortClient);

    void provideNamedData(String str, byte[] bArr);

    void removeOnTerminatedCallback(Consumer<TerminationInfo> consumer);

    void setConsoleCallback(JavaScriptConsoleCallback javaScriptConsoleCallback);

    void setConsoleCallback(Executor executor, JavaScriptConsoleCallback javaScriptConsoleCallback);

    default void onDied(TerminationInfo terminationInfo) {
    }
}
