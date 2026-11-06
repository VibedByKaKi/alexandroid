package okhttp3.internal.platform;

import com.amazon.alexa.featurefeedbackservice.constants.Constants;
import com.amazon.alexa.voice.ui.onedesign.util.image.ImageType;
import com.amazon.dee.app.elements.ElementsRouteKeys;
import com.dee.app.metrics.MetricsConstants;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLSocket;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.Protocol;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u00162\u00020\u0001:\u0002\u0015\u0016B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\n\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\u0007\u0012\n\u0010\b\u001a\u0006\u0012\u0002\b\u00030\u0007¢\u0006\u0002\u0010\tJ\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0016J(\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\b\u0010\u000f\u001a\u0004\u0018\u00010\u00102\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012H\u0016J\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u00102\u0006\u0010\f\u001a\u00020\rH\u0016R\u0012\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\b\u001a\u0006\u0012\u0002\b\u00030\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Lokhttp3/internal/platform/Jdk8WithJettyBootPlatform;", "Lokhttp3/internal/platform/Platform;", "putMethod", "Ljava/lang/reflect/Method;", "getMethod", "removeMethod", "clientProviderClass", "Ljava/lang/Class;", "serverProviderClass", "(Ljava/lang/reflect/Method;Ljava/lang/reflect/Method;Ljava/lang/reflect/Method;Ljava/lang/Class;Ljava/lang/Class;)V", "afterHandshake", "", "sslSocket", "Ljavax/net/ssl/SSLSocket;", "configureTlsExtensions", "hostname", "", "protocols", "", "Lokhttp3/Protocol;", "getSelectedProtocol", "AlpnProvider", "Companion", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class Jdk8WithJettyBootPlatform extends Platform {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private final Class<?> clientProviderClass;

    @NotNull
    private final Method getMethod;

    @NotNull
    private final Method putMethod;

    @NotNull
    private final Method removeMethod;

    @NotNull
    private final Class<?> serverProviderClass;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0013\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\u0005J0\u0010\u0011\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u00152\u000e\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0017H\u0096\u0002¢\u0006\u0002\u0010\u0018R\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u000b\u001a\u00020\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010¨\u0006\u0019"}, d2 = {"Lokhttp3/internal/platform/Jdk8WithJettyBootPlatform$AlpnProvider;", "Ljava/lang/reflect/InvocationHandler;", "protocols", "", "", "(Ljava/util/List;)V", Constants.SubmitFeedbackExperienceDetails.REQUEST_INQUIRY_OPTION_SELECTED, "getSelected", "()Ljava/lang/String;", "setSelected", "(Ljava/lang/String;)V", ImageType.UNSUPPORTED, "", "getUnsupported", "()Z", "setUnsupported", "(Z)V", "invoke", "", "proxy", MetricsConstants.NativeFetch.METHOD, "Ljava/lang/reflect/Method;", ElementsRouteKeys.ARGS, "", "(Ljava/lang/Object;Ljava/lang/reflect/Method;[Ljava/lang/Object;)Ljava/lang/Object;", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class AlpnProvider implements InvocationHandler {

        @NotNull
        private final List<String> protocols;

        @Nullable
        private String selected;
        private boolean unsupported;

        public AlpnProvider(@NotNull List<String> list) {
            list.getClass();
            this.protocols = list;
        }

        @Nullable
        public final String getSelected() {
            return this.selected;
        }

        public final boolean getUnsupported() {
            return this.unsupported;
        }

        @Override // java.lang.reflect.InvocationHandler
        @Nullable
        public Object invoke(@NotNull Object proxy, @NotNull Method method, @Nullable Object[] args) throws Throwable {
            proxy.getClass();
            method.getClass();
            if (args == null) {
                args = new Object[0];
            }
            String name = method.getName();
            Class<?> returnType = method.getReturnType();
            if (Intrinsics.areEqual(name, "supports") && Intrinsics.areEqual(Boolean.TYPE, returnType)) {
                return Boolean.TRUE;
            }
            if (Intrinsics.areEqual(name, ImageType.UNSUPPORTED) && Intrinsics.areEqual(Void.TYPE, returnType)) {
                this.unsupported = true;
                return null;
            }
            if (Intrinsics.areEqual(name, "protocols") && args.length == 0) {
                return this.protocols;
            }
            if ((Intrinsics.areEqual(name, "selectProtocol") || Intrinsics.areEqual(name, "select")) && Intrinsics.areEqual(String.class, returnType) && args.length == 1) {
                Object obj = args[0];
                if (obj instanceof List) {
                    obj.getClass();
                    List list = (List) obj;
                    int size = list.size();
                    if (size >= 0) {
                        int i = 0;
                        while (true) {
                            Object obj2 = list.get(i);
                            obj2.getClass();
                            String str = (String) obj2;
                            if (!this.protocols.contains(str)) {
                                if (i == size) {
                                    break;
                                }
                                i++;
                            } else {
                                this.selected = str;
                                return str;
                            }
                        }
                    }
                    String str2 = this.protocols.get(0);
                    this.selected = str2;
                    return str2;
                }
            }
            if ((!Intrinsics.areEqual(name, "protocolSelected") && !Intrinsics.areEqual(name, Constants.SubmitFeedbackExperienceDetails.REQUEST_INQUIRY_OPTION_SELECTED)) || args.length != 1) {
                return method.invoke(this, Arrays.copyOf(args, args.length));
            }
            Object obj3 = args[0];
            obj3.getClass();
            this.selected = (String) obj3;
            return null;
        }

        public final void setSelected(@Nullable String str) {
            this.selected = str;
        }

        public final void setUnsupported(boolean z) {
            this.unsupported = z;
        }
    }

    public Jdk8WithJettyBootPlatform(@NotNull Method method, @NotNull Method method2, @NotNull Method method3, @NotNull Class<?> cls, @NotNull Class<?> cls2) {
        method.getClass();
        method2.getClass();
        method3.getClass();
        cls.getClass();
        cls2.getClass();
        this.putMethod = method;
        this.getMethod = method2;
        this.removeMethod = method3;
        this.clientProviderClass = cls;
        this.serverProviderClass = cls2;
    }

    @Override // okhttp3.internal.platform.Platform
    public void afterHandshake(@NotNull SSLSocket sslSocket) {
        sslSocket.getClass();
        try {
            this.removeMethod.invoke(null, sslSocket);
        } catch (IllegalAccessException e) {
            throw new AssertionError("failed to remove ALPN", e);
        } catch (InvocationTargetException e2) {
            throw new AssertionError("failed to remove ALPN", e2);
        }
    }

    @Override // okhttp3.internal.platform.Platform
    public void configureTlsExtensions(@NotNull SSLSocket sslSocket, @Nullable String hostname, @NotNull List<? extends Protocol> protocols) {
        sslSocket.getClass();
        protocols.getClass();
        try {
            this.putMethod.invoke(null, sslSocket, Proxy.newProxyInstance(Platform.class.getClassLoader(), new Class[]{this.clientProviderClass, this.serverProviderClass}, new AlpnProvider(Platform.INSTANCE.alpnProtocolNames(protocols))));
        } catch (IllegalAccessException e) {
            throw new AssertionError("failed to set ALPN", e);
        } catch (InvocationTargetException e2) {
            throw new AssertionError("failed to set ALPN", e2);
        }
    }

    @Override // okhttp3.internal.platform.Platform
    @Nullable
    public String getSelectedProtocol(@NotNull SSLSocket sslSocket) {
        sslSocket.getClass();
        try {
            InvocationHandler invocationHandler = Proxy.getInvocationHandler(this.getMethod.invoke(null, sslSocket));
            invocationHandler.getClass();
            AlpnProvider alpnProvider = (AlpnProvider) invocationHandler;
            if (!alpnProvider.getUnsupported() && alpnProvider.getSelected() == null) {
                Platform.log$default(this, "ALPN callback dropped: HTTP/2 is disabled. Is alpn-boot on the boot class path?", 0, null, 6, null);
                return null;
            }
            if (alpnProvider.getUnsupported()) {
                return null;
            }
            return alpnProvider.getSelected();
        } catch (IllegalAccessException e) {
            throw new AssertionError("failed to get ALPN selected protocol", e);
        } catch (InvocationTargetException e2) {
            throw new AssertionError("failed to get ALPN selected protocol", e2);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004¨\u0006\u0005"}, d2 = {"Lokhttp3/internal/platform/Jdk8WithJettyBootPlatform$Companion;", "", "()V", "buildIfSupported", "Lokhttp3/internal/platform/Platform;", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARN: Code restructure failed: missing block: B:5:0x0014, code lost:
        
            if (java.lang.Integer.parseInt(r0) >= 9) goto L9;
         */
        @org.jetbrains.annotations.Nullable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final okhttp3.internal.platform.Platform buildIfSupported() {
            /*
                r11 = this;
                java.lang.Class<javax.net.ssl.SSLSocket> r11 = javax.net.ssl.SSLSocket.class
                java.lang.String r0 = "java.specification.version"
                java.lang.String r1 = "unknown"
                java.lang.String r0 = java.lang.System.getProperty(r0, r1)
                r1 = 0
                r0.getClass()     // Catch: java.lang.NumberFormatException -> L17
                int r0 = java.lang.Integer.parseInt(r0)     // Catch: java.lang.NumberFormatException -> L17
                r2 = 9
                if (r0 < r2) goto L17
                goto L63
            L17:
                java.lang.String r0 = "org.eclipse.jetty.alpn.ALPN"
                r2 = 1
                java.lang.Class r0 = java.lang.Class.forName(r0, r2, r1)     // Catch: java.lang.Throwable -> L63
                java.lang.String r3 = "org.eclipse.jetty.alpn.ALPN$Provider"
                java.lang.Class r3 = java.lang.Class.forName(r3, r2, r1)     // Catch: java.lang.Throwable -> L63
                java.lang.String r4 = "org.eclipse.jetty.alpn.ALPN$ClientProvider"
                java.lang.Class r9 = java.lang.Class.forName(r4, r2, r1)     // Catch: java.lang.Throwable -> L63
                java.lang.String r4 = "org.eclipse.jetty.alpn.ALPN$ServerProvider"
                java.lang.Class r10 = java.lang.Class.forName(r4, r2, r1)     // Catch: java.lang.Throwable -> L63
                java.lang.String r2 = "put"
                java.lang.Class[] r3 = new java.lang.Class[]{r11, r3}     // Catch: java.lang.Throwable -> L63
                java.lang.reflect.Method r6 = r0.getMethod(r2, r3)     // Catch: java.lang.Throwable -> L63
                java.lang.String r2 = "get"
                java.lang.Class[] r3 = new java.lang.Class[]{r11}     // Catch: java.lang.Throwable -> L63
                java.lang.reflect.Method r7 = r0.getMethod(r2, r3)     // Catch: java.lang.Throwable -> L63
                java.lang.String r2 = "remove"
                java.lang.Class[] r11 = new java.lang.Class[]{r11}     // Catch: java.lang.Throwable -> L63
                java.lang.reflect.Method r8 = r0.getMethod(r2, r11)     // Catch: java.lang.Throwable -> L63
                okhttp3.internal.platform.Jdk8WithJettyBootPlatform r5 = new okhttp3.internal.platform.Jdk8WithJettyBootPlatform     // Catch: java.lang.Throwable -> L63
                r6.getClass()     // Catch: java.lang.Throwable -> L63
                r7.getClass()     // Catch: java.lang.Throwable -> L63
                r8.getClass()     // Catch: java.lang.Throwable -> L63
                r9.getClass()     // Catch: java.lang.Throwable -> L63
                r10.getClass()     // Catch: java.lang.Throwable -> L63
                r5.<init>(r6, r7, r8, r9, r10)     // Catch: java.lang.Throwable -> L63
                return r5
            L63:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.platform.Jdk8WithJettyBootPlatform.Companion.buildIfSupported():okhttp3.internal.platform.Platform");
        }

        private Companion() {
        }
    }
}
