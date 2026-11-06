package org.apache.http.cookie;

import androidx.compose.animation.core.ArcMode$$ExternalSyntheticOutline0;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import java.util.Locale;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.apache.http.annotation.Contract;
import org.apache.http.annotation.ThreadingBehavior;
import org.apache.http.util.Args;
import org.apache.http.util.TextUtils;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Contract(threading = ThreadingBehavior.IMMUTABLE)
/* loaded from: classes11.dex */
public final class CookieOrigin {
    private final String host;
    private final String path;
    private final int port;
    private final boolean secure;

    public CookieOrigin(String str, int i, String str2, boolean z) {
        Args.notBlank(str, "Host");
        Args.notNegative(i, "Port");
        Args.notNull(str2, "Path");
        this.host = str.toLowerCase(Locale.ROOT);
        this.port = i;
        if (TextUtils.isBlank(str2)) {
            this.path = "/";
        } else {
            this.path = str2;
        }
        this.secure = z;
    }

    public String getHost() {
        return this.host;
    }

    public String getPath() {
        return this.path;
    }

    public int getPort() {
        return this.port;
    }

    public boolean isSecure() {
        return this.secure;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(MarkdownConstants.LEFT_BRACKET);
        if (this.secure) {
            sb.append("(secure)");
        }
        sb.append(this.host);
        sb.append(AbstractJsonLexerKt.COLON);
        sb.append(Integer.toString(this.port));
        return ArcMode$$ExternalSyntheticOutline0.m(AbstractJsonLexerKt.END_LIST, this.path, sb);
    }
}
