package org.apache.commons.net.ftp.parser;

import defpackage.a$$ExternalSyntheticOutline0;
import java.util.regex.MatchResult;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;
import org.apache.commons.lang3.SystemProperties;
import org.apache.commons.net.ftp.FTPFileEntryParserImpl;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes11.dex */
public abstract class RegexFTPFileEntryParserImpl extends FTPFileEntryParserImpl {
    protected Matcher _matcher_;
    private Pattern pattern;
    private MatchResult result;

    public RegexFTPFileEntryParserImpl(String str) {
        compileRegex(str, 0);
    }

    private void compileRegex(String str, int i) {
        try {
            this.pattern = Pattern.compile(str, i);
        } catch (PatternSyntaxException unused) {
            Single$$ExternalSyntheticBUOutline0.m$3(a$$ExternalSyntheticOutline0.m("Unparseable regex supplied: ", str));
        }
    }

    public int getGroupCnt() {
        MatchResult matchResult = this.result;
        if (matchResult == null) {
            return 0;
        }
        return matchResult.groupCount();
    }

    public String getGroupsAsString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= this.result.groupCount(); i++) {
            sb.append(i);
            sb.append(") ");
            sb.append(this.result.group(i));
            sb.append(System.getProperty(SystemProperties.LINE_SEPARATOR));
        }
        return sb.toString();
    }

    public String group(int i) {
        MatchResult matchResult = this.result;
        if (matchResult == null) {
            return null;
        }
        return matchResult.group(i);
    }

    public boolean matches(String str) {
        this.result = null;
        Matcher matcher = this.pattern.matcher(str);
        this._matcher_ = matcher;
        if (matcher.matches()) {
            this.result = this._matcher_.toMatchResult();
        }
        return this.result != null;
    }

    public boolean setRegex(String str) {
        compileRegex(str, 0);
        return true;
    }

    public boolean setRegex(String str, int i) {
        compileRegex(str, i);
        return true;
    }

    public RegexFTPFileEntryParserImpl(String str, int i) {
        compileRegex(str, i);
    }
}
