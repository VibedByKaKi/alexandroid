package com.amazon.coral.util;

import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import defpackage.a$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.regex.Pattern;
import okio.Path$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public class GlobMatcher implements Matcher {
    private final Pattern[] pattern;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class Match {
        private java.util.regex.Matcher m;
        private CharSequence s;

        public Match(CharSequence charSequence, java.util.regex.Matcher matcher) {
            this.s = charSequence;
            this.m = matcher;
        }

        public CharSequence snippedMatches() {
            return GlobMatcher.getSnippedMatches(this.s, this.m);
        }
    }

    public GlobMatcher(boolean z, CharSequence... charSequenceArr) {
        if (charSequenceArr == null) {
            Path$$ExternalSyntheticBUOutline0.m();
            throw null;
        }
        ArrayList arrayList = new ArrayList();
        for (CharSequence charSequence : charSequenceArr) {
            if (charSequence == null) {
                Path$$ExternalSyntheticBUOutline0.m();
                throw null;
            }
            StringBuilder sb = new StringBuilder();
            StringBuilder sb2 = new StringBuilder(charSequence);
            int length = sb2.length() - 1;
            while (length >= 0) {
                int lastIndexOf = sb2.lastIndexOf("*", length);
                if (lastIndexOf != length) {
                    sb.insert(0, MarkdownConstants.LEFT_PARENTHESIS + escape(sb2.subSequence(lastIndexOf + 1, length + 1)) + MarkdownConstants.RIGHT_PARENTHESIS);
                }
                if (lastIndexOf > 0 && sb2.charAt(lastIndexOf - 1) == '*') {
                    sb.insert(0, ".*");
                    lastIndexOf--;
                } else if (lastIndexOf > -1) {
                    sb.insert(0, "[^/]*");
                }
                length = (-1) + lastIndexOf;
            }
            arrayList.add(z ? Pattern.compile(sb.toString(), 66) : Pattern.compile(sb.toString()));
        }
        this.pattern = (Pattern[]) arrayList.toArray(new Pattern[arrayList.size()]);
    }

    private String escape(CharSequence charSequence) {
        StringBuilder sb = new StringBuilder(charSequence);
        int i = 0;
        while (i < sb.length()) {
            if (sb.charAt(i) == '/') {
                int i2 = i + 1;
                while (i2 < sb.length() && sb.charAt(i2) == '/') {
                    i2++;
                }
                sb.replace(i, i2, "\\E[/]{1,}\\Q");
                i += 11;
            }
            i++;
        }
        sb.insert(0, "\\Q");
        sb.append("\\E");
        return sb.toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static CharSequence getSnippedMatches(CharSequence charSequence, java.util.regex.Matcher matcher) {
        if (matcher == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        int i = 0;
        for (int i2 = 1; i2 <= matcher.groupCount(); i2++) {
            sb.append(charSequence.subSequence(i, matcher.start(i2)));
            i = matcher.end(i2);
        }
        sb.append(charSequence.subSequence(i, charSequence.length()));
        return sb;
    }

    public Match getMatch(CharSequence charSequence) {
        java.util.regex.Matcher regexMatcher = getRegexMatcher(charSequence);
        if (regexMatcher == null) {
            return null;
        }
        return new Match(charSequence, regexMatcher);
    }

    public Pattern[] getPatterns() {
        return (Pattern[]) this.pattern.clone();
    }

    public java.util.regex.Matcher getRegexMatcher(CharSequence charSequence) {
        if (charSequence == null) {
            return null;
        }
        for (Pattern pattern : this.pattern) {
            java.util.regex.Matcher matcher = pattern.matcher(charSequence);
            if (matcher.matches()) {
                return matcher;
            }
        }
        return null;
    }

    @Override // com.amazon.coral.util.Matcher
    public boolean matches(CharSequence charSequence) {
        return getRegexMatcher(charSequence) != null;
    }

    public CharSequence snipMatches(CharSequence charSequence) {
        return getSnippedMatches(charSequence, getRegexMatcher(charSequence));
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getName());
        sb.append(" { patterns=");
        return a$$ExternalSyntheticOutline0.m(sb, Arrays.toString(this.pattern), " }");
    }

    public GlobMatcher(CharSequence... charSequenceArr) {
        this(false, charSequenceArr);
    }
}
