package com.amazon.coral.util.http.uri;

import defpackage.a$$ExternalSyntheticOutline0;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import okio.Path$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public class UriPattern {
    private final boolean allowEmptyPathSegments;
    private final PathPattern pathPattern;
    private final QueryPattern queryPattern;
    private final Matcher uriMatcher;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public enum ConflictType {
        LEGACY_CONFLICT,
        EQUIVALENT_CONFLICT,
        NONE
    }

    public UriPattern(PathPattern pathPattern, QueryPattern queryPattern, boolean z) {
        if (pathPattern == null) {
            Path$$ExternalSyntheticBUOutline0.m();
            throw null;
        }
        this.pathPattern = pathPattern;
        this.queryPattern = queryPattern;
        validatePatterns();
        this.allowEmptyPathSegments = z;
        if (z) {
            this.uriMatcher = new EmptySegmentUriMatcher(pathPattern, queryPattern);
        } else {
            this.uriMatcher = new UriMatcher(pathPattern, queryPattern);
        }
    }

    public static UriPattern forSpecificityRouting(CharSequence charSequence) {
        return new UriPattern(charSequence, false, false);
    }

    private static QueryPattern getQueryPattern(CharSequence charSequence) {
        if (charSequence == null) {
            return null;
        }
        return new QueryPattern(charSequence);
    }

    private void validatePatterns() {
        QueryPattern queryPattern = this.queryPattern;
        if (queryPattern != null) {
            for (String str : queryPattern.getLabels()) {
                if (this.pathPattern.getSegmentForLabel(str) != null) {
                    throw new InvalidPatternException(a$$ExternalSyntheticOutline0.m("Path and query pattern both contain the label: ", str));
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0032, code lost:
    
        if (r2.conflictsWith(r0) != false) goto L23;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.amazon.coral.util.http.uri.UriPattern.ConflictType conflictType(com.amazon.coral.util.http.uri.UriPattern r5) {
        /*
            r4 = this;
            com.amazon.coral.util.http.uri.PathPattern r0 = r4.pathPattern
            com.amazon.coral.util.http.uri.PathPattern r1 = r5.pathPattern
            com.amazon.coral.util.http.uri.UriPattern$ConflictType r0 = r0.conflictType(r1)
            com.amazon.coral.util.http.uri.UriPattern$ConflictType r1 = com.amazon.coral.util.http.uri.UriPattern.ConflictType.NONE
            if (r0 != r1) goto Ld
            goto L47
        Ld:
            com.amazon.coral.util.http.uri.QueryPattern r2 = r4.queryPattern
            if (r2 != 0) goto L16
            com.amazon.coral.util.http.uri.QueryPattern r3 = r5.queryPattern
            if (r3 != 0) goto L16
            return r0
        L16:
            com.amazon.coral.util.http.uri.UriPattern$ConflictType r3 = com.amazon.coral.util.http.uri.UriPattern.ConflictType.EQUIVALENT_CONFLICT
            if (r0 != r3) goto L35
            com.amazon.coral.util.http.uri.QueryPattern r0 = r5.queryPattern
            if (r2 != 0) goto L25
            boolean r4 = r0.hasRequiredLiteralQueryParams()
            if (r4 == 0) goto L34
            goto L47
        L25:
            if (r0 != 0) goto L2e
            boolean r4 = r2.hasRequiredLiteralQueryParams()
            if (r4 == 0) goto L34
            goto L47
        L2e:
            boolean r0 = r2.conflictsWith(r0)
            if (r0 == 0) goto L35
        L34:
            return r3
        L35:
            com.amazon.coral.util.http.uri.QueryPattern r4 = r4.queryPattern
            if (r4 == 0) goto L47
            com.amazon.coral.util.http.uri.QueryPattern r5 = r5.queryPattern
            if (r5 != 0) goto L3e
            goto L47
        L3e:
            boolean r4 = r4.conflictsWith(r5)
            if (r4 == 0) goto L47
            com.amazon.coral.util.http.uri.UriPattern$ConflictType r4 = com.amazon.coral.util.http.uri.UriPattern.ConflictType.LEGACY_CONFLICT
            return r4
        L47:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.coral.util.http.uri.UriPattern.conflictType(com.amazon.coral.util.http.uri.UriPattern):com.amazon.coral.util.http.uri.UriPattern$ConflictType");
    }

    public boolean conflictsWith(UriPattern uriPattern) {
        return conflictType(uriPattern) != ConflictType.NONE;
    }

    public boolean getAllowEmptyPathSegments() {
        return this.allowEmptyPathSegments;
    }

    public Iterable<String> getLabels() {
        if (this.queryPattern == null) {
            return this.pathPattern.getLabels();
        }
        HashSet hashSet = new HashSet();
        Iterator<String> it2 = this.pathPattern.getLabels().iterator();
        while (it2.hasNext()) {
            hashSet.add(it2.next());
        }
        Iterator<String> it3 = this.queryPattern.getLabels().iterator();
        while (it3.hasNext()) {
            hashSet.add(it3.next());
        }
        return hashSet;
    }

    public PathPattern getPathPattern() {
        return this.pathPattern;
    }

    public Iterable<String> getPathPatternLabels() {
        return this.pathPattern.getLabels();
    }

    public Iterable<String> getQueryPatternLabels() {
        QueryPattern queryPattern = this.queryPattern;
        return queryPattern != null ? queryPattern.getLabels() : Collections.EMPTY_LIST;
    }

    public UriBuilder newBuilder() {
        return new UriBuilder(this.pathPattern, this.queryPattern);
    }

    public Matcher newMatcher() {
        return this.uriMatcher;
    }

    public static UriPattern forSpecificityRouting(CharSequence charSequence, boolean z) {
        return new UriPattern(charSequence, z, false);
    }

    public QueryPattern getQueryPattern() {
        return this.queryPattern;
    }

    public UriPattern(CharSequence charSequence, boolean z) {
        this(new PathPattern(QueryStringParser.getPath(charSequence)), getQueryPattern(QueryStringParser.getQuery(charSequence)), z);
    }

    public UriPattern(CharSequence charSequence, boolean z, boolean z2) {
        this(new PathPattern(QueryStringParser.getPath(charSequence), z2), getQueryPattern(QueryStringParser.getQuery(charSequence)), z);
    }

    public UriPattern(PathPattern pathPattern, QueryPattern queryPattern) {
        this(pathPattern, queryPattern, false);
    }

    public UriPattern(CharSequence charSequence) {
        this(charSequence, false);
    }
}
