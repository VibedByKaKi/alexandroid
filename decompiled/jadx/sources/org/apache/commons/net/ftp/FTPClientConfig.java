package org.apache.commons.net.ftp;

import com.amazon.alexa.accessory.frames.translation.util.TranslationLanguageManager;
import com.amazon.whisperjoin.common.sharedtypes.ble.commands.ProvisioningCommand;
import java.text.DateFormatSymbols;
import java.util.Collection;
import java.util.Locale;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.TreeMap;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes11.dex */
public class FTPClientConfig {
    private static final Map<String, Object> LANGUAGE_CODE_MAP;
    public static final String SYST_AS400 = "AS/400";
    public static final String SYST_L8 = "TYPE: L8";
    public static final String SYST_MACOS_PETER = "MACOS PETER";
    public static final String SYST_MVS = "MVS";
    public static final String SYST_NETWARE = "NETWARE";
    public static final String SYST_NT = "WINDOWS";
    public static final String SYST_OS2 = "OS/2";
    public static final String SYST_OS400 = "OS/400";
    public static final String SYST_UNIX = "UNIX";
    public static final String SYST_UNIX_TRIM_LEADING = "UNIX_LTRIM";
    public static final String SYST_VMS = "VMS";
    private String defaultDateFormatStr;
    private boolean lenientFutureDates;
    private String recentDateFormatStr;
    private boolean saveUnparseableEntries;
    private String serverLanguageCode;
    private final String serverSystemKey;
    private String serverTimeZoneId;
    private String shortMonthNames;

    static {
        TreeMap treeMap = new TreeMap();
        LANGUAGE_CODE_MAP = treeMap;
        treeMap.put("en", Locale.ENGLISH);
        treeMap.put("de", Locale.GERMAN);
        treeMap.put("it", Locale.ITALIAN);
        treeMap.put(TranslationLanguageManager.DEFAULT_BYSTANDER_LANGUAGE, new Locale(TranslationLanguageManager.DEFAULT_BYSTANDER_LANGUAGE, "", ""));
        treeMap.put("pt", new Locale("pt", "", ""));
        treeMap.put(ProvisioningCommand.DATA_KEY, new Locale(ProvisioningCommand.DATA_KEY, "", ""));
        treeMap.put("sv", new Locale("sv", "", ""));
        treeMap.put("no", new Locale("no", "", ""));
        treeMap.put("nl", new Locale("nl", "", ""));
        treeMap.put("ro", new Locale("ro", "", ""));
        treeMap.put("sq", new Locale("sq", "", ""));
        treeMap.put("sh", new Locale("sh", "", ""));
        treeMap.put("sk", new Locale("sk", "", ""));
        treeMap.put("sl", new Locale("sl", "", ""));
        treeMap.put("fr", "jan|fév|mar|avr|mai|jun|jui|aoû|sep|oct|nov|déc");
    }

    public FTPClientConfig(FTPClientConfig fTPClientConfig) {
        this.lenientFutureDates = true;
        this.serverSystemKey = fTPClientConfig.serverSystemKey;
        this.defaultDateFormatStr = fTPClientConfig.defaultDateFormatStr;
        this.lenientFutureDates = fTPClientConfig.lenientFutureDates;
        this.recentDateFormatStr = fTPClientConfig.recentDateFormatStr;
        this.saveUnparseableEntries = fTPClientConfig.saveUnparseableEntries;
        this.serverLanguageCode = fTPClientConfig.serverLanguageCode;
        this.serverTimeZoneId = fTPClientConfig.serverTimeZoneId;
        this.shortMonthNames = fTPClientConfig.shortMonthNames;
    }

    public static DateFormatSymbols getDateFormatSymbols(String str) {
        String[] splitShortMonthString = splitShortMonthString(str);
        DateFormatSymbols dateFormatSymbols = new DateFormatSymbols(Locale.US);
        dateFormatSymbols.setShortMonths(splitShortMonthString);
        return dateFormatSymbols;
    }

    public static Collection<String> getSupportedLanguageCodes() {
        return LANGUAGE_CODE_MAP.keySet();
    }

    public static DateFormatSymbols lookupDateFormatSymbols(String str) {
        Object obj = LANGUAGE_CODE_MAP.get(str);
        if (obj != null) {
            if (obj instanceof Locale) {
                return new DateFormatSymbols((Locale) obj);
            }
            if (obj instanceof String) {
                return getDateFormatSymbols((String) obj);
            }
        }
        return new DateFormatSymbols(Locale.US);
    }

    private static String[] splitShortMonthString(String str) {
        StringTokenizer stringTokenizer = new StringTokenizer(str, "|");
        if (12 != stringTokenizer.countTokens()) {
            Single$$ExternalSyntheticBUOutline0.m$3("expecting a pipe-delimited string containing 12 tokens");
            return null;
        }
        String[] strArr = new String[13];
        int i = 0;
        while (stringTokenizer.hasMoreTokens()) {
            strArr[i] = stringTokenizer.nextToken();
            i++;
        }
        strArr[i] = "";
        return strArr;
    }

    public String getDefaultDateFormatStr() {
        return this.defaultDateFormatStr;
    }

    public String getRecentDateFormatStr() {
        return this.recentDateFormatStr;
    }

    public String getServerLanguageCode() {
        return this.serverLanguageCode;
    }

    public String getServerSystemKey() {
        return this.serverSystemKey;
    }

    public String getServerTimeZoneId() {
        return this.serverTimeZoneId;
    }

    public String getShortMonthNames() {
        return this.shortMonthNames;
    }

    public boolean getUnparseableEntries() {
        return this.saveUnparseableEntries;
    }

    public boolean isLenientFutureDates() {
        return this.lenientFutureDates;
    }

    public void setDefaultDateFormatStr(String str) {
        this.defaultDateFormatStr = str;
    }

    public void setLenientFutureDates(boolean z) {
        this.lenientFutureDates = z;
    }

    public void setRecentDateFormatStr(String str) {
        this.recentDateFormatStr = str;
    }

    public void setServerLanguageCode(String str) {
        this.serverLanguageCode = str;
    }

    public void setServerTimeZoneId(String str) {
        this.serverTimeZoneId = str;
    }

    public void setShortMonthNames(String str) {
        this.shortMonthNames = str;
    }

    public void setUnparseableEntries(boolean z) {
        this.saveUnparseableEntries = z;
    }

    public FTPClientConfig() {
        this(SYST_UNIX);
    }

    public FTPClientConfig(String str, String str2, String str3) {
        this(str);
        this.defaultDateFormatStr = str2;
        this.recentDateFormatStr = str3;
    }

    public FTPClientConfig(String str, String str2, String str3, String str4, String str5, String str6) {
        this(str);
        this.defaultDateFormatStr = str2;
        this.recentDateFormatStr = str3;
        this.serverLanguageCode = str4;
        this.shortMonthNames = str5;
        this.serverTimeZoneId = str6;
    }

    public FTPClientConfig(String str, String str2, String str3, String str4, String str5, String str6, boolean z, boolean z2) {
        this(str);
        this.defaultDateFormatStr = str2;
        this.lenientFutureDates = z;
        this.recentDateFormatStr = str3;
        this.saveUnparseableEntries = z2;
        this.serverLanguageCode = str4;
        this.shortMonthNames = str5;
        this.serverTimeZoneId = str6;
    }

    public FTPClientConfig(String str, FTPClientConfig fTPClientConfig) {
        this.lenientFutureDates = true;
        this.serverSystemKey = str;
        this.defaultDateFormatStr = fTPClientConfig.defaultDateFormatStr;
        this.lenientFutureDates = fTPClientConfig.lenientFutureDates;
        this.recentDateFormatStr = fTPClientConfig.recentDateFormatStr;
        this.saveUnparseableEntries = fTPClientConfig.saveUnparseableEntries;
        this.serverLanguageCode = fTPClientConfig.serverLanguageCode;
        this.serverTimeZoneId = fTPClientConfig.serverTimeZoneId;
        this.shortMonthNames = fTPClientConfig.shortMonthNames;
    }

    public FTPClientConfig(String str) {
        this.lenientFutureDates = true;
        this.serverSystemKey = str;
    }
}
