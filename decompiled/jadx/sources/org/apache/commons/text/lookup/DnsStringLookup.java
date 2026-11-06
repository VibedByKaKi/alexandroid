package org.apache.commons.text.lookup;

import java.net.InetAddress;
import java.net.UnknownHostException;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes11.dex */
final class DnsStringLookup extends AbstractStringLookup {
    static final DnsStringLookup INSTANCE = new DnsStringLookup();

    private DnsStringLookup() {
    }

    @Override // org.apache.commons.text.lookup.StringLookup
    public String lookup(String str) {
        if (str == null) {
            return null;
        }
        String[] split = str.trim().split("\\|");
        int length = split.length;
        String trim = split[0].trim();
        if (length >= 2) {
            str = split[1].trim();
        }
        try {
            InetAddress byName = InetAddress.getByName(str);
            int hashCode = trim.hashCode();
            if (hashCode != -1147692044) {
                if (hashCode != 3373707) {
                    if (hashCode == 1339224004 && trim.equals("canonical-name")) {
                        return byName.getCanonicalHostName();
                    }
                } else if (trim.equals("name")) {
                    return byName.getHostName();
                }
            } else if (trim.equals("address")) {
                return byName.getHostAddress();
            }
            return byName.getHostAddress();
        } catch (UnknownHostException unused) {
            return null;
        }
    }
}
