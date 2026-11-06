package okhttp3.mockwebserver;

import androidx.core.app.AppLaunchChecker$$ExternalSyntheticOutline0;
import com.amazon.alexa.accessory.avsclient.metrics.AccessoryMetricsConstants;
import com.amazon.alexa.api.compat.model.assistant.subcomponent.SendEventResultBundleKeys;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.dee.app.metrics.MetricsConstants;
import java.io.IOException;
import java.net.Inet6Address;
import java.net.InetAddress;
import java.net.Socket;
import java.util.List;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocket;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmName;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import okhttp3.Handshake;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.TlsVersion;
import okio.Buffer;
import okio.Buffer$$ExternalSyntheticBUOutline0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\u00020\u0001BQ\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\b\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0011¢\u0006\u0002\u0010\u0012J\u0010\u00105\u001a\u0004\u0018\u00010\u00032\u0006\u00106\u001a\u00020\u0003J\b\u00107\u001a\u00020\u0003H\u0007J\b\u00108\u001a\u00020\u0003H\u0016R\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0011¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0013\u0010\u001b\u001a\u0004\u0018\u00010\u001c¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0013\u0010!\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0013\u0010$\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b%\u0010#R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b&\u0010#R\u0013\u0010'\u001a\u0004\u0018\u00010(¢\u0006\b\n\u0000\u001a\u0004\b)\u0010*R\u0011\u0010\r\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b+\u0010,R\u0013\u0010-\u001a\u0004\u0018\u00010.8F¢\u0006\u0006\u001a\u0004\b/\u00100R\u001a\u00101\u001a\u00020\u00038GX\u0087\u0004¢\u0006\f\u0012\u0004\b2\u00103\u001a\u0004\b4\u0010#¨\u00069"}, d2 = {"Lokhttp3/mockwebserver/RecordedRequest;", "", "requestLine", "", "headers", "Lokhttp3/Headers;", "chunkSizes", "", "", "bodySize", "", "body", "Lokio/Buffer;", AccessoryMetricsConstants.CustomAttribute.SEQUENCE_NUMBER, "socket", "Ljava/net/Socket;", SendEventResultBundleKeys.FAILURE, "Ljava/io/IOException;", "(Ljava/lang/String;Lokhttp3/Headers;Ljava/util/List;JLokio/Buffer;ILjava/net/Socket;Ljava/io/IOException;)V", "getBody", "()Lokio/Buffer;", "getBodySize", "()J", "getChunkSizes", "()Ljava/util/List;", "getFailure", "()Ljava/io/IOException;", "handshake", "Lokhttp3/Handshake;", "getHandshake", "()Lokhttp3/Handshake;", "getHeaders", "()Lokhttp3/Headers;", MetricsConstants.NativeFetch.METHOD, "getMethod", "()Ljava/lang/String;", "path", "getPath", "getRequestLine", "requestUrl", "Lokhttp3/HttpUrl;", "getRequestUrl", "()Lokhttp3/HttpUrl;", "getSequenceNumber", "()I", "tlsVersion", "Lokhttp3/TlsVersion;", "getTlsVersion", "()Lokhttp3/TlsVersion;", "utf8Body", "utf8Body$annotations", "()V", "-deprecated_utf8Body", "getHeader", "name", "getUtf8Body", "toString", "mockwebserver"}, k = 1, mv = {1, 1, 16})
/* loaded from: classes10.dex */
public final class RecordedRequest {

    @NotNull
    private final Buffer body;
    private final long bodySize;

    @NotNull
    private final List<Integer> chunkSizes;

    @Nullable
    private final IOException failure;

    @Nullable
    private final Handshake handshake;

    @NotNull
    private final Headers headers;

    @Nullable
    private final String method;

    @Nullable
    private final String path;

    @NotNull
    private final String requestLine;

    @Nullable
    private final HttpUrl requestUrl;
    private final int sequenceNumber;

    @JvmOverloads
    public RecordedRequest(@NotNull String str, @NotNull Headers headers, @NotNull List<Integer> list, long j, @NotNull Buffer buffer, int i, @NotNull Socket socket, @Nullable IOException iOException) {
        int indexOf$default;
        int indexOf$default2;
        boolean startsWith$default;
        boolean contains$default;
        str.getClass();
        headers.getClass();
        list.getClass();
        buffer.getClass();
        socket.getClass();
        this.requestLine = str;
        this.headers = headers;
        this.chunkSizes = list;
        this.bodySize = j;
        this.body = buffer;
        this.sequenceNumber = i;
        this.failure = iOException;
        boolean z = socket instanceof SSLSocket;
        if (z) {
            try {
                Handshake.Companion companion = Handshake.INSTANCE;
                SSLSession session = ((SSLSocket) socket).getSession();
                session.getClass();
                this.handshake = companion.get(session);
            } catch (IOException e) {
                Buffer$$ExternalSyntheticBUOutline0.m$1(e);
                throw null;
            }
        } else {
            this.handshake = null;
        }
        if (str.length() <= 0) {
            this.requestUrl = null;
            this.method = null;
            this.path = null;
            return;
        }
        indexOf$default = StringsKt__StringsKt.indexOf$default((CharSequence) str, ' ', 0, false, 6, (Object) null);
        int i2 = indexOf$default + 1;
        indexOf$default2 = StringsKt__StringsKt.indexOf$default((CharSequence) str, ' ', i2, false, 4, (Object) null);
        this.method = str.substring(0, indexOf$default);
        String substring = str.substring(i2, indexOf$default2);
        startsWith$default = StringsKt__StringsJVMKt.startsWith$default(substring, "/", false, 2, null);
        substring = startsWith$default ? substring : "/";
        this.path = substring;
        String str2 = z ? "https" : "http";
        InetAddress localAddress = socket.getLocalAddress();
        localAddress.getClass();
        String hostName = localAddress.getHostName();
        if (localAddress instanceof Inet6Address) {
            hostName.getClass();
            contains$default = StringsKt__StringsKt.contains$default(hostName, AbstractJsonLexerKt.COLON, false, 2, (Object) null);
            if (contains$default) {
                hostName = AppLaunchChecker$$ExternalSyntheticOutline0.m(AbstractJsonLexerKt.END_LIST, MarkdownConstants.LEFT_BRACKET, hostName);
            }
        }
        int localPort = socket.getLocalPort();
        this.requestUrl = HttpUrl.INSTANCE.parse(str2 + "://" + hostName + AbstractJsonLexerKt.COLON + localPort + substring);
    }

    @JvmName(name = "-deprecated_utf8Body")
    @NotNull
    /* renamed from: -deprecated_utf8Body, reason: not valid java name */
    public final String m27180deprecated_utf8Body() {
        return this.body.readUtf8();
    }

    @NotNull
    public final Buffer getBody() {
        return this.body;
    }

    public final long getBodySize() {
        return this.bodySize;
    }

    @NotNull
    public final List<Integer> getChunkSizes() {
        return this.chunkSizes;
    }

    @Nullable
    public final IOException getFailure() {
        return this.failure;
    }

    @Nullable
    public final Handshake getHandshake() {
        return this.handshake;
    }

    @Nullable
    public final String getHeader(@NotNull String name) {
        name.getClass();
        return (String) CollectionsKt.firstOrNull((List) this.headers.values(name));
    }

    @NotNull
    public final Headers getHeaders() {
        return this.headers;
    }

    @Nullable
    public final String getMethod() {
        return this.method;
    }

    @Nullable
    public final String getPath() {
        return this.path;
    }

    @NotNull
    public final String getRequestLine() {
        return this.requestLine;
    }

    @Nullable
    public final HttpUrl getRequestUrl() {
        return this.requestUrl;
    }

    public final int getSequenceNumber() {
        return this.sequenceNumber;
    }

    @Nullable
    public final TlsVersion getTlsVersion() {
        Handshake handshake = this.handshake;
        if (handshake != null) {
            return handshake.tlsVersion();
        }
        return null;
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "Use body.readUtf8()", replaceWith = @ReplaceWith(expression = "body.readUtf8()", imports = {}))
    @NotNull
    public final String getUtf8Body() {
        return this.body.readUtf8();
    }

    @NotNull
    public String toString() {
        return this.requestLine;
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "Use body.readUtf8()", replaceWith = @ReplaceWith(expression = "body.readUtf8()", imports = {}))
    public static /* synthetic */ void utf8Body$annotations() {
    }

    @JvmOverloads
    public RecordedRequest(@NotNull String str, @NotNull Headers headers, @NotNull List<Integer> list, long j, @NotNull Buffer buffer, int i, @NotNull Socket socket) {
        this(str, headers, list, j, buffer, i, socket, null, 128, null);
    }

    public /* synthetic */ RecordedRequest(String str, Headers headers, List list, long j, Buffer buffer, int i, Socket socket, IOException iOException, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, headers, list, j, buffer, i, socket, (i2 & 128) != 0 ? null : iOException);
    }
}
