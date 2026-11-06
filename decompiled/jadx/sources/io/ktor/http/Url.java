package io.ktor.http;

import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.apache.http.cookie.ClientCookie;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b!\b\u0086\b\u0018\u0000 /2\u00020\u0001:\u0001/BQ\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\u0005\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u000e\u001a\u00020\u000f¢\u0006\u0002\u0010\u0010J\t\u0010!\u001a\u00020\u0003HÆ\u0003J\t\u0010\"\u001a\u00020\u0005HÆ\u0003J\t\u0010#\u001a\u00020\u0007HÆ\u0003J\t\u0010$\u001a\u00020\u0005HÆ\u0003J\t\u0010%\u001a\u00020\nHÆ\u0003J\t\u0010&\u001a\u00020\u0005HÆ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010)\u001a\u00020\u000fHÆ\u0003Jg\u0010*\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\u00052\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u000e\u001a\u00020\u000fHÆ\u0001J\u0013\u0010+\u001a\u00020\u000f2\b\u0010,\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010-\u001a\u00020\u0007HÖ\u0001J\b\u0010.\u001a\u00020\u0005H\u0016R\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u000b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0012R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0013\u0010\r\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0012R\u0011\u0010\u0018\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001aR\u0011\u0010\u000e\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0013\u0010\f\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0012¨\u00060"}, d2 = {"Lio/ktor/http/Url;", "", "protocol", "Lio/ktor/http/URLProtocol;", "host", "", "specifiedPort", "", "encodedPath", "parameters", "Lio/ktor/http/Parameters;", "fragment", "user", "password", "trailingQuery", "", "(Lio/ktor/http/URLProtocol;Ljava/lang/String;ILjava/lang/String;Lio/ktor/http/Parameters;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V", "getEncodedPath", "()Ljava/lang/String;", "getFragment", "getHost", "getParameters", "()Lio/ktor/http/Parameters;", "getPassword", ClientCookie.PORT_ATTR, "getPort", "()I", "getProtocol", "()Lio/ktor/http/URLProtocol;", "getSpecifiedPort", "getTrailingQuery", "()Z", "getUser", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "hashCode", "toString", "Companion", "ktor-http"}, k = 1, mv = {1, 1, 13})
/* loaded from: classes9.dex */
public final /* data */ class Url {

    @NotNull
    private final String encodedPath;

    @NotNull
    private final String fragment;

    @NotNull
    private final String host;

    @NotNull
    private final Parameters parameters;

    @Nullable
    private final String password;

    @NotNull
    private final URLProtocol protocol;
    private final int specifiedPort;
    private final boolean trailingQuery;

    @Nullable
    private final String user;

    public Url(@NotNull URLProtocol uRLProtocol, @NotNull String str, int i, @NotNull String str2, @NotNull Parameters parameters, @NotNull String str3, @Nullable String str4, @Nullable String str5, boolean z) {
        uRLProtocol.getClass();
        str.getClass();
        str2.getClass();
        parameters.getClass();
        str3.getClass();
        this.protocol = uRLProtocol;
        this.host = str;
        this.specifiedPort = i;
        this.encodedPath = str2;
        this.parameters = parameters;
        this.fragment = str3;
        this.user = str4;
        this.password = str5;
        this.trailingQuery = z;
        if ((1 > i || 65536 < i) && i != 0) {
            Single$$ExternalSyntheticBUOutline0.m$3("port must be between 1 and 65536, or 0 if not set");
            throw null;
        }
    }

    @NotNull
    public static /* synthetic */ Url copy$default(Url url, URLProtocol uRLProtocol, String str, int i, String str2, Parameters parameters, String str3, String str4, String str5, boolean z, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            uRLProtocol = url.protocol;
        }
        if ((i2 & 2) != 0) {
            str = url.host;
        }
        if ((i2 & 4) != 0) {
            i = url.specifiedPort;
        }
        if ((i2 & 8) != 0) {
            str2 = url.encodedPath;
        }
        if ((i2 & 16) != 0) {
            parameters = url.parameters;
        }
        if ((i2 & 32) != 0) {
            str3 = url.fragment;
        }
        if ((i2 & 64) != 0) {
            str4 = url.user;
        }
        if ((i2 & 128) != 0) {
            str5 = url.password;
        }
        if ((i2 & 256) != 0) {
            z = url.trailingQuery;
        }
        String str6 = str5;
        boolean z2 = z;
        String str7 = str3;
        String str8 = str4;
        Parameters parameters2 = parameters;
        int i3 = i;
        return url.copy(uRLProtocol, str, i3, str2, parameters2, str7, str8, str6, z2);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final URLProtocol getProtocol() {
        return this.protocol;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getHost() {
        return this.host;
    }

    /* renamed from: component3, reason: from getter */
    public final int getSpecifiedPort() {
        return this.specifiedPort;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final String getEncodedPath() {
        return this.encodedPath;
    }

    @NotNull
    /* renamed from: component5, reason: from getter */
    public final Parameters getParameters() {
        return this.parameters;
    }

    @NotNull
    /* renamed from: component6, reason: from getter */
    public final String getFragment() {
        return this.fragment;
    }

    @Nullable
    /* renamed from: component7, reason: from getter */
    public final String getUser() {
        return this.user;
    }

    @Nullable
    /* renamed from: component8, reason: from getter */
    public final String getPassword() {
        return this.password;
    }

    /* renamed from: component9, reason: from getter */
    public final boolean getTrailingQuery() {
        return this.trailingQuery;
    }

    @NotNull
    public final Url copy(@NotNull URLProtocol protocol, @NotNull String host, int specifiedPort, @NotNull String encodedPath, @NotNull Parameters parameters, @NotNull String fragment, @Nullable String user, @Nullable String password, boolean trailingQuery) {
        protocol.getClass();
        host.getClass();
        encodedPath.getClass();
        parameters.getClass();
        fragment.getClass();
        return new Url(protocol, host, specifiedPort, encodedPath, parameters, fragment, user, password, trailingQuery);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Url)) {
            return false;
        }
        Url url = (Url) other;
        return Intrinsics.areEqual(this.protocol, url.protocol) && Intrinsics.areEqual(this.host, url.host) && this.specifiedPort == url.specifiedPort && Intrinsics.areEqual(this.encodedPath, url.encodedPath) && Intrinsics.areEqual(this.parameters, url.parameters) && Intrinsics.areEqual(this.fragment, url.fragment) && Intrinsics.areEqual(this.user, url.user) && Intrinsics.areEqual(this.password, url.password) && this.trailingQuery == url.trailingQuery;
    }

    @NotNull
    public final String getEncodedPath() {
        return this.encodedPath;
    }

    @NotNull
    public final String getFragment() {
        return this.fragment;
    }

    @NotNull
    public final String getHost() {
        return this.host;
    }

    @NotNull
    public final Parameters getParameters() {
        return this.parameters;
    }

    @Nullable
    public final String getPassword() {
        return this.password;
    }

    public final int getPort() {
        Integer valueOf = Integer.valueOf(this.specifiedPort);
        if (valueOf.intValue() == 0) {
            valueOf = null;
        }
        return valueOf != null ? valueOf.intValue() : this.protocol.getDefaultPort();
    }

    @NotNull
    public final URLProtocol getProtocol() {
        return this.protocol;
    }

    public final int getSpecifiedPort() {
        return this.specifiedPort;
    }

    public final boolean getTrailingQuery() {
        return this.trailingQuery;
    }

    @Nullable
    public final String getUser() {
        return this.user;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        URLProtocol uRLProtocol = this.protocol;
        int hashCode = (uRLProtocol != null ? uRLProtocol.hashCode() : 0) * 31;
        String str = this.host;
        int hashCode2 = (((hashCode + (str != null ? str.hashCode() : 0)) * 31) + this.specifiedPort) * 31;
        String str2 = this.encodedPath;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31;
        Parameters parameters = this.parameters;
        int hashCode4 = (hashCode3 + (parameters != null ? parameters.hashCode() : 0)) * 31;
        String str3 = this.fragment;
        int hashCode5 = (hashCode4 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.user;
        int hashCode6 = (hashCode5 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.password;
        int hashCode7 = (hashCode6 + (str5 != null ? str5.hashCode() : 0)) * 31;
        boolean z = this.trailingQuery;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return hashCode7 + i;
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.protocol.getName());
        sb.append("://");
        String str = this.user;
        if (str != null) {
            sb.append(str);
            if (this.password != null) {
                sb.append(AbstractJsonLexerKt.COLON);
                sb.append(this.password);
            }
            sb.append('@');
        }
        if (this.specifiedPort == 0) {
            sb.append(this.host);
        } else {
            sb.append(URLUtilsKt.getHostWithPort(this));
        }
        sb.append(URLUtilsKt.getFullPath(this));
        if (this.fragment.length() > 0) {
            sb.append('#');
            sb.append(this.fragment);
        }
        return sb.toString();
    }
}
