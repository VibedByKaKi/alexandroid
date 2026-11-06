package io.ktor.http;

import androidx.compose.runtime.BitVector$$ExternalSyntheticOutline0;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import defpackage.a$$ExternalSyntheticOutline0;
import io.ktor.util.CharsetKt;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.apache.http.HttpVersion;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0086\b\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0014"}, d2 = {"Lio/ktor/http/URLProtocol;", "", "name", "", "defaultPort", "", "(Ljava/lang/String;I)V", "getDefaultPort", "()I", "getName", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "hashCode", "toString", "Companion", "ktor-http"}, k = 1, mv = {1, 1, 13})
/* loaded from: classes9.dex */
public final /* data */ class URLProtocol {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final URLProtocol HTTP;

    @NotNull
    private static final URLProtocol HTTPS;

    @NotNull
    private static final URLProtocol WS;

    @NotNull
    private static final URLProtocol WSS;

    @NotNull
    private static final Map<String, URLProtocol> byName;
    private final int defaultPort;

    @NotNull
    private final String name;

    static {
        URLProtocol uRLProtocol = new URLProtocol("http", 80);
        HTTP = uRLProtocol;
        URLProtocol uRLProtocol2 = new URLProtocol("https", 443);
        HTTPS = uRLProtocol2;
        URLProtocol uRLProtocol3 = new URLProtocol("ws", 80);
        WS = uRLProtocol3;
        URLProtocol uRLProtocol4 = new URLProtocol("wss", 443);
        WSS = uRLProtocol4;
        List listOf = CollectionsKt.listOf((Object[]) new URLProtocol[]{uRLProtocol, uRLProtocol2, uRLProtocol3, uRLProtocol4});
        LinkedHashMap linkedHashMap = new LinkedHashMap(BitVector$$ExternalSyntheticOutline0.m(listOf, 10, 16));
        for (Object obj : listOf) {
            linkedHashMap.put(((URLProtocol) obj).name, obj);
        }
        byName = linkedHashMap;
    }

    public URLProtocol(@NotNull String str, int i) {
        str.getClass();
        this.name = str;
        this.defaultPort = i;
        for (int i2 = 0; i2 < str.length(); i2++) {
            if (!CharsetKt.isLowerCase(str.charAt(i2))) {
                Single$$ExternalSyntheticBUOutline0.m$3("All characters should be lower case");
                throw null;
            }
        }
    }

    @NotNull
    public static /* synthetic */ URLProtocol copy$default(URLProtocol uRLProtocol, String str, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = uRLProtocol.name;
        }
        if ((i2 & 2) != 0) {
            i = uRLProtocol.defaultPort;
        }
        return uRLProtocol.copy(str, i);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* renamed from: component2, reason: from getter */
    public final int getDefaultPort() {
        return this.defaultPort;
    }

    @NotNull
    public final URLProtocol copy(@NotNull String name, int defaultPort) {
        name.getClass();
        return new URLProtocol(name, defaultPort);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof URLProtocol)) {
            return false;
        }
        URLProtocol uRLProtocol = (URLProtocol) other;
        return Intrinsics.areEqual(this.name, uRLProtocol.name) && this.defaultPort == uRLProtocol.defaultPort;
    }

    public final int getDefaultPort() {
        return this.defaultPort;
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    public int hashCode() {
        String str = this.name;
        return ((str != null ? str.hashCode() : 0) * 31) + this.defaultPort;
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder("URLProtocol(name=");
        sb.append(this.name);
        sb.append(", defaultPort=");
        return a$$ExternalSyntheticOutline0.m(sb, this.defaultPort, MarkdownConstants.RIGHT_PARENTHESIS);
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u000fR\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0007\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0006R\u0011\u0010\t\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0006R\u0011\u0010\u000b\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u0006R\u001d\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00040\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0014"}, d2 = {"Lio/ktor/http/URLProtocol$Companion;", "", "()V", HttpVersion.HTTP, "Lio/ktor/http/URLProtocol;", "getHTTP", "()Lio/ktor/http/URLProtocol;", "HTTPS", "getHTTPS", "WS", "getWS", "WSS", "getWSS", "byName", "", "", "getByName", "()Ljava/util/Map;", "createOrDefault", "name", "ktor-http"}, k = 1, mv = {1, 1, 13})
    public static final class Companion {
        private Companion() {
        }

        @NotNull
        public final URLProtocol createOrDefault(@NotNull String name) {
            name.getClass();
            String lowerCase = name.toLowerCase();
            lowerCase.getClass();
            URLProtocol uRLProtocol = URLProtocol.INSTANCE.getByName().get(lowerCase);
            return uRLProtocol != null ? uRLProtocol : new URLProtocol(lowerCase, 0);
        }

        @NotNull
        public final Map<String, URLProtocol> getByName() {
            return URLProtocol.byName;
        }

        @NotNull
        public final URLProtocol getHTTP() {
            return URLProtocol.HTTP;
        }

        @NotNull
        public final URLProtocol getHTTPS() {
            return URLProtocol.HTTPS;
        }

        @NotNull
        public final URLProtocol getWS() {
            return URLProtocol.WS;
        }

        @NotNull
        public final URLProtocol getWSS() {
            return URLProtocol.WSS;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }
}
