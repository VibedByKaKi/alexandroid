package org.apache.http.cookie;

import java.util.List;
import org.apache.http.Header;
import org.apache.http.annotation.Obsolete;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes11.dex */
public interface CookieSpec {
    List<Header> formatCookies(List<Cookie> list);

    @Obsolete
    int getVersion();

    @Obsolete
    Header getVersionHeader();

    boolean match(Cookie cookie, CookieOrigin cookieOrigin);

    List<Cookie> parse(Header header, CookieOrigin cookieOrigin) throws MalformedCookieException;

    void validate(Cookie cookie, CookieOrigin cookieOrigin) throws MalformedCookieException;
}
