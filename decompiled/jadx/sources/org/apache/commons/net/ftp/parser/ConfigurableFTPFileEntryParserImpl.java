package org.apache.commons.net.ftp.parser;

import java.text.ParseException;
import java.util.Calendar;
import org.apache.commons.net.ftp.Configurable;
import org.apache.commons.net.ftp.FTPClientConfig;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes11.dex */
public abstract class ConfigurableFTPFileEntryParserImpl extends RegexFTPFileEntryParserImpl implements Configurable {
    private final FTPTimestampParser timestampParser;

    public ConfigurableFTPFileEntryParserImpl(String str) {
        super(str);
        this.timestampParser = new FTPTimestampParserImpl();
    }

    @Override // org.apache.commons.net.ftp.Configurable
    public void configure(FTPClientConfig fTPClientConfig) {
        if (this.timestampParser instanceof Configurable) {
            FTPClientConfig defaultConfiguration = getDefaultConfiguration();
            if (fTPClientConfig == null) {
                ((Configurable) this.timestampParser).configure(defaultConfiguration);
                return;
            }
            if (fTPClientConfig.getDefaultDateFormatStr() == null) {
                fTPClientConfig.setDefaultDateFormatStr(defaultConfiguration.getDefaultDateFormatStr());
            }
            if (fTPClientConfig.getRecentDateFormatStr() == null) {
                fTPClientConfig.setRecentDateFormatStr(defaultConfiguration.getRecentDateFormatStr());
            }
            ((Configurable) this.timestampParser).configure(fTPClientConfig);
        }
    }

    public abstract FTPClientConfig getDefaultConfiguration();

    public Calendar parseTimestamp(String str) throws ParseException {
        return this.timestampParser.parseTimestamp(str);
    }

    public ConfigurableFTPFileEntryParserImpl(String str, int i) {
        super(str, i);
        this.timestampParser = new FTPTimestampParserImpl();
    }
}
