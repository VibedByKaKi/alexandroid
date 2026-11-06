package org.apache.commons.net.ftp.parser;

import java.util.List;
import java.util.ListIterator;
import org.apache.commons.net.ftp.FTPClientConfig;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes11.dex */
public class UnixFTPEntryParser extends ConfigurableFTPFileEntryParserImpl {
    static final String DEFAULT_DATE_FORMAT = "MMM d yyyy";
    private static final String DEFAULT_DATE_FORMAT_JA = "M'月' d'日' yyyy'年'";
    static final String DEFAULT_RECENT_DATE_FORMAT = "MMM d HH:mm";
    private static final String DEFAULT_RECENT_DATE_FORMAT_JA = "M'月' d'日' HH:mm";
    private static final String JA_DAY = "日";
    private static final String JA_MONTH = "月";
    private static final String JA_YEAR = "年";
    private static final String REGEX = "([bcdelfmpSs-])(((r|-)(w|-)([xsStTL-]))((r|-)(w|-)([xsStTL-]))((r|-)(w|-)([xsStTL-])))\\+?\\s*(\\d+)\\s+(?:(\\S+(?:\\s\\S+)*?)\\s+)?(?:(\\S+(?:\\s\\S+)*)\\s+)?(\\d+(?:,\\s*\\d+)?)\\s+((?:\\d+[-/]\\d+[-/]\\d+)|(?:\\S{3}\\s+\\d{1,2})|(?:\\d{1,2}\\s+\\S{3})|(?:\\d{1,2}月\\s+\\d{1,2}日))\\s+((?:\\d+(?::\\d+)?)|(?:\\d{4}年))\\s(.*)";
    final boolean trimLeadingSpaces;
    static final String NUMERIC_DATE_FORMAT = "yyyy-MM-dd HH:mm";
    public static final FTPClientConfig NUMERIC_DATE_CONFIG = new FTPClientConfig(FTPClientConfig.SYST_UNIX, NUMERIC_DATE_FORMAT, null);

    public UnixFTPEntryParser(FTPClientConfig fTPClientConfig, boolean z) {
        super(REGEX);
        configure(fTPClientConfig);
        this.trimLeadingSpaces = z;
    }

    @Override // org.apache.commons.net.ftp.parser.ConfigurableFTPFileEntryParserImpl
    public FTPClientConfig getDefaultConfiguration() {
        return new FTPClientConfig(FTPClientConfig.SYST_UNIX, "MMM d yyyy", "MMM d HH:mm");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(18:3|(1:5)|6|7|(1:9)(1:51)|10|(13:12|(11:14|16|(3:18|(2:25|26)(2:22|23)|24)|27|28|(2:43|44)|30|31|32|(2:34|(1:36)(1:39))(1:40)|37)|49|16|(0)|27|28|(0)|30|31|32|(0)(0)|37)|50|16|(0)|27|28|(0)|30|31|32|(0)(0)|37) */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00fb A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // org.apache.commons.net.ftp.FTPFileEntryParser
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public org.apache.commons.net.ftp.FTPFile parseFTPEntry(java.lang.String r18) {
        /*
            Method dump skipped, instructions count: 324
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.commons.net.ftp.parser.UnixFTPEntryParser.parseFTPEntry(java.lang.String):org.apache.commons.net.ftp.FTPFile");
    }

    @Override // org.apache.commons.net.ftp.FTPFileEntryParserImpl, org.apache.commons.net.ftp.FTPFileEntryParser
    public List<String> preParse(List<String> list) {
        ListIterator<String> listIterator = list.listIterator();
        while (listIterator.hasNext()) {
            if (listIterator.next().matches("^total \\d+$")) {
                listIterator.remove();
            }
        }
        return list;
    }

    public UnixFTPEntryParser(FTPClientConfig fTPClientConfig) {
        this(fTPClientConfig, false);
    }

    public UnixFTPEntryParser() {
        this(null);
    }
}
