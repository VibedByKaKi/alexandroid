package com.facebook.react.devsupport;

import android.os.Handler;
import android.os.Looper;
import androidx.core.os.ParcelCompat$$ExternalSyntheticOutline0;
import com.amazon.alexa.assistant.transport.MissingTokenPull;
import com.facebook.jni.HybridData;
import com.facebook.proguard.annotations.DoNotStrip;
import com.facebook.proguard.annotations.DoNotStripAny;
import com.facebook.soloader.SoLoader;
import java.io.Closeable;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.WebSocket;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\b\u0000\u0018\u0000 \u00122\u00020\u0001:\u0004\u000f\u0010\u0011\u0012B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\n\u001a\u00020\u000bH\u0096 J\t\u0010\f\u001a\u00020\u000bH\u0096 J\u0013\u0010\r\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0003H\u0096 R\u0010\u0010\b\u001a\u00020\t8\u0002X\u0083\u0004¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lcom/facebook/react/devsupport/CxxInspectorPackagerConnection;", "Lcom/facebook/react/devsupport/IInspectorPackagerConnection;", "url", "", "deviceName", "packageName", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "mHybridData", "Lcom/facebook/jni/HybridData;", MissingTokenPull.TRIGGER_CONNECT, "", "closeQuietly", "sendEventToAllConnections", "event", "WebSocketDelegate", "IWebSocket", "DelegateImpl", "Companion", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class CxxInspectorPackagerConnection implements IInspectorPackagerConnection {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @DoNotStrip
    @NotNull
    private final HybridData mHybridData;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\f\u001a\u00020\rH\u0007J\u0018\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0007R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lcom/facebook/react/devsupport/CxxInspectorPackagerConnection$DelegateImpl;", "", "<init>", "()V", "httpClient", "Lokhttp3/OkHttpClient;", "mHandler", "Landroid/os/Handler;", "connectWebSocket", "Lcom/facebook/react/devsupport/CxxInspectorPackagerConnection$IWebSocket;", "urlParam", "", "delegate", "Lcom/facebook/react/devsupport/CxxInspectorPackagerConnection$WebSocketDelegate;", "scheduleCallback", "", "runnable", "Ljava/lang/Runnable;", "delayMs", "", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class DelegateImpl {

        @NotNull
        private final OkHttpClient httpClient;

        @NotNull
        private final Handler mHandler;

        public DelegateImpl() {
            OkHttpClient.Builder builder = new OkHttpClient.Builder();
            TimeUnit timeUnit = TimeUnit.SECONDS;
            this.httpClient = builder.connectTimeout(10L, timeUnit).writeTimeout(10L, timeUnit).readTimeout(0L, TimeUnit.MINUTES).build();
            this.mHandler = new Handler(Looper.getMainLooper());
        }

        @DoNotStrip
        @NotNull
        public final IWebSocket connectWebSocket(@Nullable String urlParam, @NotNull WebSocketDelegate delegate) {
            delegate.getClass();
            if (urlParam == null) {
                Single$$ExternalSyntheticBUOutline0.m$3("Required value was null.");
                return null;
            }
            final WebSocket newWebSocket = this.httpClient.newWebSocket(new Request.Builder().url(urlParam).build(), new CxxInspectorPackagerConnection$DelegateImpl$connectWebSocket$webSocket$1(this, delegate));
            return new IWebSocket() { // from class: com.facebook.react.devsupport.CxxInspectorPackagerConnection$DelegateImpl$connectWebSocket$1
                @Override // com.facebook.react.devsupport.CxxInspectorPackagerConnection.IWebSocket, java.io.Closeable, java.lang.AutoCloseable
                public void close() {
                    WebSocket.this.close(1000, "End of session");
                }

                @Override // com.facebook.react.devsupport.CxxInspectorPackagerConnection.IWebSocket
                public void send(String message) {
                    message.getClass();
                    WebSocket.this.send(message);
                }
            };
        }

        @DoNotStrip
        public final void scheduleCallback(@NotNull Runnable runnable, long delayMs) {
            runnable.getClass();
            this.mHandler.postDelayed(runnable, delayMs);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @DoNotStripAny
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\bc\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\b\u0010\u0006\u001a\u00020\u0003H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0007À\u0006\u0001"}, d2 = {"Lcom/facebook/react/devsupport/CxxInspectorPackagerConnection$IWebSocket;", "Ljava/io/Closeable;", "send", "", "message", "", "close", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface IWebSocket extends Closeable {
        @Override // java.io.Closeable, java.lang.AutoCloseable
        void close();

        void send(@NotNull String message);
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @DoNotStrip
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0003\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\"\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0086 ¢\u0006\u0002\u0010\fJ\u0013\u0010\r\u001a\u00020\u00072\b\u0010\u000e\u001a\u0004\u0018\u00010\u000bH\u0086 J\t\u0010\u000f\u001a\u00020\u0007H\u0086 J\t\u0010\u0010\u001a\u00020\u0007H\u0086 J\b\u0010\u0011\u001a\u00020\u0007H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lcom/facebook/react/devsupport/CxxInspectorPackagerConnection$WebSocketDelegate;", "Ljava/io/Closeable;", "mHybridData", "Lcom/facebook/jni/HybridData;", "<init>", "(Lcom/facebook/jni/HybridData;)V", "didFailWithError", "", "posixCode", "", "error", "", "(Ljava/lang/Integer;Ljava/lang/String;)V", "didReceiveMessage", "message", "didOpen", "didClose", "close", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class WebSocketDelegate implements Closeable {

        @NotNull
        private final HybridData mHybridData;

        @DoNotStrip
        public WebSocketDelegate(@NotNull HybridData hybridData) {
            hybridData.getClass();
            this.mHybridData = hybridData;
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            this.mHybridData.resetNative();
        }

        public final native void didClose();

        public final native void didFailWithError(@Nullable Integer posixCode, @Nullable String error);

        public final native void didOpen();

        public final native void didReceiveMessage(@Nullable String message);
    }

    static {
        SoLoader.loadLibrary("react_devsupportjni");
    }

    public CxxInspectorPackagerConnection(@NotNull String str, @NotNull String str2, @NotNull String str3) {
        ParcelCompat$$ExternalSyntheticOutline0.m(str, str2, str3);
        this.mHybridData = INSTANCE.initHybrid(str, str2, str3, new DelegateImpl());
    }

    /* JADX INFO: Access modifiers changed from: private */
    @JvmStatic
    public static final native HybridData initHybrid(String str, String str2, String str3, DelegateImpl delegateImpl);

    @Override // com.facebook.react.devsupport.IInspectorPackagerConnection
    public native void closeQuietly();

    @Override // com.facebook.react.devsupport.IInspectorPackagerConnection
    public native void connect();

    @Override // com.facebook.react.devsupport.IInspectorPackagerConnection
    public native void sendEventToAllConnections(@Nullable String event);

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J)\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u000bH\u0083 ¨\u0006\f"}, d2 = {"Lcom/facebook/react/devsupport/CxxInspectorPackagerConnection$Companion;", "", "<init>", "()V", "initHybrid", "Lcom/facebook/jni/HybridData;", "url", "", "deviceName", "packageName", "delegate", "Lcom/facebook/react/devsupport/CxxInspectorPackagerConnection$DelegateImpl;", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        @JvmStatic
        public final HybridData initHybrid(String url, String deviceName, String packageName, DelegateImpl delegate) {
            return CxxInspectorPackagerConnection.initHybrid(url, deviceName, packageName, delegate);
        }

        private Companion() {
        }
    }
}
