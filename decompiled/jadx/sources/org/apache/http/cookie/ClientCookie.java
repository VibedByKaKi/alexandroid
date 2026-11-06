package org.apache.http.cookie;

import org.apache.http.annotation.Obsolete;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes11.dex */
public interface ClientCookie extends Cookie {

    @Obsolete
    public static final String COMMENTURL_ATTR = "commenturl";

    @Obsolete
    public static final String COMMENT_ATTR = "comment";

    @Obsolete
    public static final String DISCARD_ATTR = "discard";
    public static final String DOMAIN_ATTR = "domain";
    public static final String EXPIRES_ATTR = "expires";
    public static final String MAX_AGE_ATTR = "max-age";
    public static final String PATH_ATTR = "path";

    @Obsolete
    public static final String PORT_ATTR = "port";
    public static final String SECURE_ATTR = "secure";

    @Obsolete
    public static final String VERSION_ATTR = "version";

    boolean containsAttribute(String str);

    String getAttribute(String str);
}
