package org.apache.http.conn.util;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.apache.http.annotation.Contract;
import org.apache.http.annotation.ThreadingBehavior;
import org.apache.http.util.Args;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Contract(threading = ThreadingBehavior.SAFE)
/* loaded from: classes11.dex */
public final class PublicSuffixMatcher {
    private final Map<String, DomainType> exceptions;
    private final Map<String, DomainType> rules;

    public PublicSuffixMatcher(Collection<PublicSuffixList> collection) {
        Args.notNull(collection, "Domain suffix lists");
        this.rules = new ConcurrentHashMap();
        this.exceptions = new ConcurrentHashMap();
        for (PublicSuffixList publicSuffixList : collection) {
            DomainType type = publicSuffixList.getType();
            Iterator<String> it2 = publicSuffixList.getRules().iterator();
            while (it2.hasNext()) {
                this.rules.put(it2.next(), type);
            }
            List<String> exceptions = publicSuffixList.getExceptions();
            if (exceptions != null) {
                Iterator<String> it3 = exceptions.iterator();
                while (it3.hasNext()) {
                    this.exceptions.put(it3.next(), type);
                }
            }
        }
    }

    private static DomainType findEntry(Map<String, DomainType> map, String str) {
        if (map == null) {
            return null;
        }
        return map.get(str);
    }

    private static boolean match(DomainType domainType, DomainType domainType2) {
        if (domainType != null) {
            return domainType2 == null || domainType.equals(domainType2);
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x006b, code lost:
    
        return r7;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.String getDomainRoot(java.lang.String r7, org.apache.http.conn.util.DomainType r8) {
        /*
            r6 = this;
            r0 = 0
            if (r7 != 0) goto L4
            return r0
        L4:
            java.lang.String r1 = "."
            boolean r1 = r7.startsWith(r1)
            if (r1 == 0) goto Ld
            return r0
        Ld:
            java.lang.String r7 = org.apache.http.conn.util.DnsUtils.normalize(r7)
            r1 = r0
        L12:
            if (r7 == 0) goto L6f
            java.lang.String r2 = java.net.IDN.toUnicode(r7)
            java.util.Map<java.lang.String, org.apache.http.conn.util.DomainType> r3 = r6.exceptions
            org.apache.http.conn.util.DomainType r3 = findEntry(r3, r2)
            boolean r3 = match(r3, r8)
            if (r3 == 0) goto L25
            goto L6b
        L25:
            java.util.Map<java.lang.String, org.apache.http.conn.util.DomainType> r3 = r6.rules
            org.apache.http.conn.util.DomainType r2 = findEntry(r3, r2)
            boolean r3 = match(r2, r8)
            if (r3 == 0) goto L36
            org.apache.http.conn.util.DomainType r6 = org.apache.http.conn.util.DomainType.PRIVATE
            if (r2 != r6) goto L77
            goto L6b
        L36:
            r2 = 46
            int r2 = r7.indexOf(r2)
            r3 = -1
            if (r2 == r3) goto L46
            int r2 = r2 + 1
            java.lang.String r2 = r7.substring(r2)
            goto L47
        L46:
            r2 = r0
        L47:
            if (r2 == 0) goto L6c
            java.util.Map<java.lang.String, org.apache.http.conn.util.DomainType> r3 = r6.rules
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "*."
            r4.<init>(r5)
            java.lang.String r5 = java.net.IDN.toUnicode(r2)
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            org.apache.http.conn.util.DomainType r3 = findEntry(r3, r4)
            boolean r4 = match(r3, r8)
            if (r4 == 0) goto L6c
            org.apache.http.conn.util.DomainType r6 = org.apache.http.conn.util.DomainType.PRIVATE
            if (r3 != r6) goto L77
        L6b:
            return r7
        L6c:
            r1 = r7
            r7 = r2
            goto L12
        L6f:
            if (r8 == 0) goto L77
            org.apache.http.conn.util.DomainType r6 = org.apache.http.conn.util.DomainType.UNKNOWN
            if (r8 != r6) goto L76
            goto L77
        L76:
            return r0
        L77:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.http.conn.util.PublicSuffixMatcher.getDomainRoot(java.lang.String, org.apache.http.conn.util.DomainType):java.lang.String");
    }

    public boolean matches(String str, DomainType domainType) {
        if (str == null) {
            return false;
        }
        if (str.startsWith(".")) {
            str = str.substring(1);
        }
        return getDomainRoot(str, domainType) == null;
    }

    public boolean matches(String str) {
        return matches(str, null);
    }

    public PublicSuffixMatcher(DomainType domainType, Collection<String> collection, Collection<String> collection2) {
        Args.notNull(domainType, "Domain type");
        Args.notNull(collection, "Domain suffix rules");
        this.rules = new ConcurrentHashMap(collection.size());
        Iterator<String> it2 = collection.iterator();
        while (it2.hasNext()) {
            this.rules.put(it2.next(), domainType);
        }
        this.exceptions = new ConcurrentHashMap();
        if (collection2 != null) {
            Iterator<String> it3 = collection2.iterator();
            while (it3.hasNext()) {
                this.exceptions.put(it3.next(), domainType);
            }
        }
    }

    public PublicSuffixMatcher(Collection<String> collection, Collection<String> collection2) {
        this(DomainType.UNKNOWN, collection, collection2);
    }

    public String getDomainRoot(String str) {
        return getDomainRoot(str, null);
    }
}
