package org.apache.http.auth;

import defpackage.a$$ExternalSyntheticOutline0;
import java.io.Serializable;
import java.security.Principal;
import java.util.Locale;
import org.apache.http.annotation.Contract;
import org.apache.http.annotation.ThreadingBehavior;
import org.apache.http.util.Args;
import org.apache.http.util.LangUtils;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Contract(threading = ThreadingBehavior.IMMUTABLE)
/* loaded from: classes11.dex */
public class NTUserPrincipal implements Principal, Serializable {
    private static final long serialVersionUID = -6870169797924406894L;
    private final String domain;
    private final String ntname;
    private final String username;

    public NTUserPrincipal(String str, String str2) {
        Args.notNull(str2, "User name");
        this.username = str2;
        if (str != null) {
            this.domain = str.toUpperCase(Locale.ROOT);
        } else {
            this.domain = null;
        }
        String str3 = this.domain;
        if (str3 == null || str3.isEmpty()) {
            this.ntname = str2;
        } else {
            this.ntname = a$$ExternalSyntheticOutline0.m(new StringBuilder(), this.domain, '\\', str2);
        }
    }

    @Override // java.security.Principal
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NTUserPrincipal)) {
            return false;
        }
        NTUserPrincipal nTUserPrincipal = (NTUserPrincipal) obj;
        return LangUtils.equals(this.username, nTUserPrincipal.username) && LangUtils.equals(this.domain, nTUserPrincipal.domain);
    }

    public String getDomain() {
        return this.domain;
    }

    @Override // java.security.Principal
    public String getName() {
        return this.ntname;
    }

    public String getUsername() {
        return this.username;
    }

    @Override // java.security.Principal
    public int hashCode() {
        return LangUtils.hashCode(LangUtils.hashCode(17, this.username), this.domain);
    }

    @Override // java.security.Principal
    public String toString() {
        return this.ntname;
    }
}
