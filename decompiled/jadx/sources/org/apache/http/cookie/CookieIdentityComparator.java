package org.apache.http.cookie;

import java.io.Serializable;
import java.util.Comparator;
import org.apache.http.annotation.Contract;
import org.apache.http.annotation.ThreadingBehavior;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Contract(threading = ThreadingBehavior.IMMUTABLE)
/* loaded from: classes11.dex */
public class CookieIdentityComparator implements Serializable, Comparator<Cookie> {
    private static final long serialVersionUID = 4466565437490631532L;

    @Override // java.util.Comparator
    public int compare(Cookie cookie, Cookie cookie2) {
        int compareTo = cookie.getName().compareTo(cookie2.getName());
        if (compareTo == 0) {
            String domain = cookie.getDomain();
            if (domain == null) {
                domain = "";
            } else if (domain.indexOf(46) == -1) {
                domain = domain.concat(".local");
            }
            String domain2 = cookie2.getDomain();
            compareTo = domain.compareToIgnoreCase(domain2 != null ? domain2.indexOf(46) == -1 ? domain2.concat(".local") : domain2 : "");
        }
        if (compareTo != 0) {
            return compareTo;
        }
        String path = cookie.getPath();
        if (path == null) {
            path = "/";
        }
        String path2 = cookie2.getPath();
        return path.compareTo(path2 != null ? path2 : "/");
    }
}
