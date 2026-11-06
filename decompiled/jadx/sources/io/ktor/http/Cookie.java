package io.ktor.http;

import androidx.biometric.ErrorUtils$$ExternalSyntheticOutline0;
import com.amazon.alexa.apl.payload.RenderDocumentPayload;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import io.ktor.util.date.GMTDate;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.apache.http.cookie.ClientCookie;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b!\b\u0086\b\u0018\u00002\u00020\u0001By\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\r\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e\u0012\u0016\b\u0002\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0011¢\u0006\u0002\u0010\u0012J\t\u0010#\u001a\u00020\u0003HÆ\u0003J\u0017\u0010$\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0011HÆ\u0003J\t\u0010%\u001a\u00020\u0003HÆ\u0003J\t\u0010&\u001a\u00020\u0006HÆ\u0003J\t\u0010'\u001a\u00020\bHÆ\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\nHÆ\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010+\u001a\u00020\u000eHÆ\u0003J\t\u0010,\u001a\u00020\u000eHÆ\u0003J\u0081\u0001\u0010-\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\u0016\b\u0002\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0011HÆ\u0001J\u0013\u0010.\u001a\u00020\u000e2\b\u0010/\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00100\u001a\u00020\bHÖ\u0001J\t\u00101\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u001f\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0011¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\u000f\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0014R\u0013\u0010\f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0014R\u0011\u0010\r\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u001cR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u0014¨\u00062"}, d2 = {"Lio/ktor/http/Cookie;", "", "name", "", "value", "encoding", "Lio/ktor/http/CookieEncoding;", "maxAge", "", "expires", "Lio/ktor/util/date/GMTDate;", "domain", "path", ClientCookie.SECURE_ATTR, "", "httpOnly", RenderDocumentPayload.FIELD_EXTENSIONS, "", "(Ljava/lang/String;Ljava/lang/String;Lio/ktor/http/CookieEncoding;ILio/ktor/util/date/GMTDate;Ljava/lang/String;Ljava/lang/String;ZZLjava/util/Map;)V", "getDomain", "()Ljava/lang/String;", "getEncoding", "()Lio/ktor/http/CookieEncoding;", "getExpires", "()Lio/ktor/util/date/GMTDate;", "getExtensions", "()Ljava/util/Map;", "getHttpOnly", "()Z", "getMaxAge", "()I", "getName", "getPath", "getSecure", "getValue", "component1", "component10", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "hashCode", "toString", "ktor-http"}, k = 1, mv = {1, 1, 13})
/* loaded from: classes9.dex */
public final /* data */ class Cookie {

    @Nullable
    private final String domain;

    @NotNull
    private final CookieEncoding encoding;

    @Nullable
    private final GMTDate expires;

    @NotNull
    private final Map<String, String> extensions;
    private final boolean httpOnly;
    private final int maxAge;

    @NotNull
    private final String name;

    @Nullable
    private final String path;
    private final boolean secure;

    @NotNull
    private final String value;

    public /* synthetic */ Cookie(String str, String str2, CookieEncoding cookieEncoding, int i, GMTDate gMTDate, String str3, String str4, boolean z, boolean z2, Map map, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i2 & 4) != 0 ? CookieEncoding.URI_ENCODING : cookieEncoding, (i2 & 8) != 0 ? 0 : i, (i2 & 16) != 0 ? null : gMTDate, (i2 & 32) != 0 ? null : str3, (i2 & 64) != 0 ? null : str4, (i2 & 128) != 0 ? false : z, (i2 & 256) != 0 ? false : z2, (i2 & 512) != 0 ? MapsKt.emptyMap() : map);
    }

    @NotNull
    public static /* synthetic */ Cookie copy$default(Cookie cookie, String str, String str2, CookieEncoding cookieEncoding, int i, GMTDate gMTDate, String str3, String str4, boolean z, boolean z2, Map map, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = cookie.name;
        }
        if ((i2 & 2) != 0) {
            str2 = cookie.value;
        }
        if ((i2 & 4) != 0) {
            cookieEncoding = cookie.encoding;
        }
        if ((i2 & 8) != 0) {
            i = cookie.maxAge;
        }
        if ((i2 & 16) != 0) {
            gMTDate = cookie.expires;
        }
        if ((i2 & 32) != 0) {
            str3 = cookie.domain;
        }
        if ((i2 & 64) != 0) {
            str4 = cookie.path;
        }
        if ((i2 & 128) != 0) {
            z = cookie.secure;
        }
        if ((i2 & 256) != 0) {
            z2 = cookie.httpOnly;
        }
        if ((i2 & 512) != 0) {
            map = cookie.extensions;
        }
        boolean z3 = z2;
        Map map2 = map;
        String str5 = str4;
        boolean z4 = z;
        GMTDate gMTDate2 = gMTDate;
        String str6 = str3;
        return cookie.copy(str, str2, cookieEncoding, i, gMTDate2, str6, str5, z4, z3, map2);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getName() {
        return this.name;
    }

    @NotNull
    public final Map<String, String> component10() {
        return this.extensions;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getValue() {
        return this.value;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final CookieEncoding getEncoding() {
        return this.encoding;
    }

    /* renamed from: component4, reason: from getter */
    public final int getMaxAge() {
        return this.maxAge;
    }

    @Nullable
    /* renamed from: component5, reason: from getter */
    public final GMTDate getExpires() {
        return this.expires;
    }

    @Nullable
    /* renamed from: component6, reason: from getter */
    public final String getDomain() {
        return this.domain;
    }

    @Nullable
    /* renamed from: component7, reason: from getter */
    public final String getPath() {
        return this.path;
    }

    /* renamed from: component8, reason: from getter */
    public final boolean getSecure() {
        return this.secure;
    }

    /* renamed from: component9, reason: from getter */
    public final boolean getHttpOnly() {
        return this.httpOnly;
    }

    @NotNull
    public final Cookie copy(@NotNull String name, @NotNull String value, @NotNull CookieEncoding encoding, int maxAge, @Nullable GMTDate expires, @Nullable String domain, @Nullable String path, boolean secure, boolean httpOnly, @NotNull Map<String, String> extensions) {
        name.getClass();
        value.getClass();
        encoding.getClass();
        extensions.getClass();
        return new Cookie(name, value, encoding, maxAge, expires, domain, path, secure, httpOnly, extensions);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Cookie)) {
            return false;
        }
        Cookie cookie = (Cookie) other;
        return Intrinsics.areEqual(this.name, cookie.name) && Intrinsics.areEqual(this.value, cookie.value) && Intrinsics.areEqual(this.encoding, cookie.encoding) && this.maxAge == cookie.maxAge && Intrinsics.areEqual(this.expires, cookie.expires) && Intrinsics.areEqual(this.domain, cookie.domain) && Intrinsics.areEqual(this.path, cookie.path) && this.secure == cookie.secure && this.httpOnly == cookie.httpOnly && Intrinsics.areEqual(this.extensions, cookie.extensions);
    }

    @Nullable
    public final String getDomain() {
        return this.domain;
    }

    @NotNull
    public final CookieEncoding getEncoding() {
        return this.encoding;
    }

    @Nullable
    public final GMTDate getExpires() {
        return this.expires;
    }

    @NotNull
    public final Map<String, String> getExtensions() {
        return this.extensions;
    }

    public final boolean getHttpOnly() {
        return this.httpOnly;
    }

    public final int getMaxAge() {
        return this.maxAge;
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    @Nullable
    public final String getPath() {
        return this.path;
    }

    public final boolean getSecure() {
        return this.secure;
    }

    @NotNull
    public final String getValue() {
        return this.value;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        String str = this.name;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.value;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        CookieEncoding cookieEncoding = this.encoding;
        int hashCode3 = (((hashCode2 + (cookieEncoding != null ? cookieEncoding.hashCode() : 0)) * 31) + this.maxAge) * 31;
        GMTDate gMTDate = this.expires;
        int hashCode4 = (hashCode3 + (gMTDate != null ? gMTDate.hashCode() : 0)) * 31;
        String str3 = this.domain;
        int hashCode5 = (hashCode4 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.path;
        int hashCode6 = (hashCode5 + (str4 != null ? str4.hashCode() : 0)) * 31;
        boolean z = this.secure;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int i2 = (hashCode6 + i) * 31;
        boolean z2 = this.httpOnly;
        int i3 = (i2 + (z2 ? 1 : z2 ? 1 : 0)) * 31;
        Map<String, String> map = this.extensions;
        return i3 + (map != null ? map.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder("Cookie(name=");
        sb.append(this.name);
        sb.append(", value=");
        sb.append(this.value);
        sb.append(", encoding=");
        sb.append(this.encoding);
        sb.append(", maxAge=");
        sb.append(this.maxAge);
        sb.append(", expires=");
        sb.append(this.expires);
        sb.append(", domain=");
        sb.append(this.domain);
        sb.append(", path=");
        sb.append(this.path);
        sb.append(", secure=");
        sb.append(this.secure);
        sb.append(", httpOnly=");
        sb.append(this.httpOnly);
        sb.append(", extensions=");
        return ErrorUtils$$ExternalSyntheticOutline0.m(sb, this.extensions, MarkdownConstants.RIGHT_PARENTHESIS);
    }

    public Cookie(@NotNull String str, @NotNull String str2, @NotNull CookieEncoding cookieEncoding, int i, @Nullable GMTDate gMTDate, @Nullable String str3, @Nullable String str4, boolean z, boolean z2, @NotNull Map<String, String> map) {
        str.getClass();
        str2.getClass();
        cookieEncoding.getClass();
        map.getClass();
        this.name = str;
        this.value = str2;
        this.encoding = cookieEncoding;
        this.maxAge = i;
        this.expires = gMTDate;
        this.domain = str3;
        this.path = str4;
        this.secure = z;
        this.httpOnly = z2;
        this.extensions = map;
    }
}
