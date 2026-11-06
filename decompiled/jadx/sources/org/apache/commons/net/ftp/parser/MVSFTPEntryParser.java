package org.apache.commons.net.ftp.parser;

import com.amazonaws.auth.policy.internal.JsonDocumentFields;
import java.text.ParseException;
import java.util.List;
import org.apache.commons.net.ftp.FTPClientConfig;
import org.apache.commons.net.ftp.FTPFile;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes11.dex */
public class MVSFTPEntryParser extends ConfigurableFTPFileEntryParserImpl {
    static final String DEFAULT_DATE_FORMAT = "yyyy/MM/dd HH:mm";
    static final String FILE_LIST_REGEX = "\\S+\\s+\\S+\\s+\\S+\\s+\\S+\\s+(?:\\S+\\s+)?(?:F|FB|V|VB|U)\\s+\\S+\\s+\\S+\\s+(PS|PO|PO-E)\\s+(\\S+)\\s*";
    static final int FILE_LIST_TYPE = 0;
    static final String JES_LEVEL_1_LIST_REGEX = "(\\S+)\\s+(\\S+)\\s+(\\S+)\\s+(\\S+)\\s+(\\S+)\\s+(\\S+)\\s*";
    static final int JES_LEVEL_1_LIST_TYPE = 3;
    static final String JES_LEVEL_2_LIST_REGEX = "(\\S+)\\s+(\\S+)\\s+(\\S+)\\s+(\\S+)\\s+(\\S+)\\s+(\\S+).*";
    static final int JES_LEVEL_2_LIST_TYPE = 4;
    static final String MEMBER_LIST_REGEX = "(\\S+)\\s+\\S+\\s+\\S+\\s+(\\S+)\\s+(\\S+)\\s+\\S+\\s+\\S+\\s+\\S+\\s+\\S+\\s*";
    static final int MEMBER_LIST_TYPE = 1;
    static final int UNIX_LIST_TYPE = 2;
    static final int UNKNOWN_LIST_TYPE = -1;
    private int isType;
    private UnixFTPEntryParser unixFTPEntryParser;

    public MVSFTPEntryParser() {
        super("");
        this.isType = -1;
        super.configure(null);
    }

    private FTPFile parseFileList(String str) {
        if (!matches(str)) {
            return null;
        }
        FTPFile fTPFile = new FTPFile();
        fTPFile.setRawListing(str);
        String group = group(2);
        String group2 = group(1);
        fTPFile.setName(group);
        if ("PS".equals(group2)) {
            fTPFile.setType(0);
            return fTPFile;
        }
        if (!"PO".equals(group2) && !"PO-E".equals(group2)) {
            return null;
        }
        fTPFile.setType(1);
        return fTPFile;
    }

    private FTPFile parseJeslevel1List(String str) {
        if (!matches(str)) {
            return null;
        }
        FTPFile fTPFile = new FTPFile();
        if (!group(3).equalsIgnoreCase("OUTPUT")) {
            return null;
        }
        fTPFile.setRawListing(str);
        fTPFile.setName(group(2));
        fTPFile.setType(0);
        return fTPFile;
    }

    private FTPFile parseJeslevel2List(String str) {
        if (!matches(str)) {
            return null;
        }
        FTPFile fTPFile = new FTPFile();
        if (!group(4).equalsIgnoreCase("OUTPUT")) {
            return null;
        }
        fTPFile.setRawListing(str);
        fTPFile.setName(group(2));
        fTPFile.setType(0);
        return fTPFile;
    }

    private FTPFile parseMemberList(String str) {
        FTPFile fTPFile = new FTPFile();
        if (!matches(str)) {
            if (str == null || str.trim().isEmpty()) {
                return null;
            }
            fTPFile.setRawListing(str);
            fTPFile.setName(str.split(" ")[0]);
            fTPFile.setType(0);
            return fTPFile;
        }
        fTPFile.setRawListing(str);
        String group = group(1);
        String str2 = group(2) + " " + group(3);
        fTPFile.setName(group);
        fTPFile.setType(0);
        try {
            fTPFile.setTimestamp(super.parseTimestamp(str2));
        } catch (ParseException unused) {
        }
        return fTPFile;
    }

    @Override // org.apache.commons.net.ftp.parser.ConfigurableFTPFileEntryParserImpl
    public FTPClientConfig getDefaultConfiguration() {
        return new FTPClientConfig(FTPClientConfig.SYST_MVS, DEFAULT_DATE_FORMAT, null);
    }

    @Override // org.apache.commons.net.ftp.FTPFileEntryParser
    public FTPFile parseFTPEntry(String str) {
        int i = this.isType;
        if (i == 0) {
            return parseFileList(str);
        }
        if (i == 1) {
            return parseMemberList(str);
        }
        if (i == 2) {
            return this.unixFTPEntryParser.parseFTPEntry(str);
        }
        if (i == 3) {
            return parseJeslevel1List(str);
        }
        if (i == 4) {
            return parseJeslevel2List(str);
        }
        return null;
    }

    @Override // org.apache.commons.net.ftp.FTPFileEntryParserImpl, org.apache.commons.net.ftp.FTPFileEntryParser
    public List<String> preParse(List<String> list) {
        if (list != null && !list.isEmpty()) {
            String str = list.get(0);
            if (str.indexOf("Volume") >= 0 && str.indexOf("Dsname") >= 0) {
                setType(0);
                super.setRegex(FILE_LIST_REGEX);
            } else if (str.indexOf("Name") >= 0 && str.indexOf(JsonDocumentFields.POLICY_ID) >= 0) {
                setType(1);
                super.setRegex(MEMBER_LIST_REGEX);
            } else if (str.indexOf("total") == 0) {
                setType(2);
                this.unixFTPEntryParser = new UnixFTPEntryParser();
            } else if (str.indexOf("Spool Files") >= 30) {
                setType(3);
                super.setRegex(JES_LEVEL_1_LIST_REGEX);
            } else if (str.indexOf("JOBNAME") != 0 || str.indexOf("JOBID") <= 8) {
                setType(-1);
            } else {
                setType(4);
                super.setRegex(JES_LEVEL_2_LIST_REGEX);
            }
            if (this.isType != 3) {
                list.remove(0);
            }
        }
        return list;
    }

    public void setType(int i) {
        this.isType = i;
    }
}
