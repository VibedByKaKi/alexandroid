package com.amazon.tarazed.arcus;

import com.amazon.tarazed.type.Marketplace;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import org.joda.time.DateTimeConstants;
import org.json.JSONObject;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public class ArcusConstants {
    public static final String APP_ID = "arn:aws:remote-config:us-west-2:617769722613:appConfig:a9nagb6s";
    static final int DEFAULT_ARCUS_SYNC_INTERVAL_SEC = 86400;
    private static final int DEFAULT_FORCE_SYNC_MAX_INITIAL_DELAY_SEC = 86400;
    static final String DEFAULT_P2P_HELP_CONTENT_URL = "https://www.amazon.com/help/alexa-app/screen-share";
    public static final JSONObject DEFAULT_SUPPORTED_CONFIGURATION = new JSONObject((Map<?, ?>) new HashMap<String, Object>() { // from class: com.amazon.tarazed.arcus.ArcusConstants.1
        {
            put(ArcusConstants.KEY_IS_TARAZED_ENABLED, Boolean.TRUE);
            put(ArcusConstants.KEY_NOTIFICATION_HOSTNAME, ArcusConstants.getDefaultHostnameByMarketplaceMap());
            Integer valueOf = Integer.valueOf(DateTimeConstants.SECONDS_PER_DAY);
            put(ArcusConstants.KEY_FORCE_SYNC_MAX_INITIAL_DELAY_SEC, valueOf);
            put(ArcusConstants.KEY_ARCUS_SYNC_INTERVAL_SEC, valueOf);
            put(ArcusConstants.KEY_P2P_HELP_CONTENT_URL, ArcusConstants.getDefaultP2PHelpContentUrlByMarketplaceMap());
        }
    });
    public static final JSONObject DEFAULT_UNSUPPORTED_CONFIGURATION = new JSONObject((Map<?, ?>) new HashMap<String, Object>() { // from class: com.amazon.tarazed.arcus.ArcusConstants.2
        {
            put(ArcusConstants.KEY_IS_TARAZED_ENABLED, Boolean.FALSE);
        }
    });
    private static final String DUB_NOTIFICATION_HOSTNAME = "dub.notification.mayday-screen-sharing.cs.a2z.com";
    private static final String IAD_NOTIFICATION_HOSTNAME = "iad.notification.mayday-screen-sharing.cs.a2z.com";
    static final String KEY_ARCUS_SYNC_INTERVAL_SEC = "arcusSyncIntervalSec";
    static final String KEY_CONNECTED_BROWSER_CHECK_BROWSER_TIMEOUT = "connectedBrowserCheckBrowserTimeout";
    static final String KEY_CONNECTED_BROWSER_CHECK_MAX_FAILED_PING_COUNT = "connectedBrowserCheckMaxFailedPingCount";
    static final String KEY_CONNECTED_BROWSER_CHECK_POLLING_INTERVAL = "connectedBrowserCheckPollingInterval";
    public static final String KEY_DCAPS_SCHEMA_URL = "dcapsSchemaUrl";
    public static final String KEY_END_SESSION_TIMEOUT_ON_3P_APP_BACKGROUND = "endSessionTimeoutOn3PAppBackground";
    public static final String KEY_FORCE_SYNC_MAX_INITIAL_DELAY_SEC = "forceSyncMaxInitialDelaySec";
    static final String KEY_IS_HARDWARE_VIDEO_ENCODING_ENABLED = "isHardwareVideoEncodingEnabled";
    public static final String KEY_IS_TARAZED_ENABLED = "isTarazedEnabled";
    static final String KEY_MAX_VIDEO_BITRATE_KBPS = "maxVideoBitrateKbps";
    static final String KEY_MAX_VIDEO_DIMENSION = "maxVideoDimension";
    static final String KEY_MIN_VIDEO_DIMENSION = "minVideoDimension";
    static final String KEY_NOTIFICATION_HOSTNAME = "notificationHostnameByMarketplace";
    static final String KEY_P2P_HELP_CONTENT_URL = "p2pHelpContentUrl";
    static final String KEY_PRIMER_TIMEOUT_SEC = "primerTimeOutSec";
    static final String KEY_RUN_CONNECTED_BROWSER_CHECK = "runConnectedBrowserCheck";
    static final String KEY_VIDEO_FRAMERATE = "videoFramerate";
    private static final String PDX_NOTIFICATION_HOSTNAME = "pdx.notification.mayday-screen-sharing.cs.a2z.com";
    static final int RESULT_FAIL = 1;
    static final int RESULT_OK = 0;

    private static String formatP2PHelpContentUrl(String str) {
        return DEFAULT_P2P_HELP_CONTENT_URL.replace(".com", str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Map<String, String> getDefaultHostnameByMarketplaceMap() {
        HashMap hashMap = new HashMap();
        hashMap.put(Marketplace.US.getProdMarketplaceId(), IAD_NOTIFICATION_HOSTNAME);
        hashMap.put(Marketplace.CA.getProdMarketplaceId(), IAD_NOTIFICATION_HOSTNAME);
        Marketplace marketplace = Marketplace.BR;
        hashMap.put(marketplace.getProdMarketplaceId(), IAD_NOTIFICATION_HOSTNAME);
        hashMap.put(marketplace.getDevoMarketplaceId(), IAD_NOTIFICATION_HOSTNAME);
        Marketplace marketplace2 = Marketplace.MX;
        hashMap.put(marketplace2.getProdMarketplaceId(), IAD_NOTIFICATION_HOSTNAME);
        hashMap.put(marketplace2.getDevoMarketplaceId(), IAD_NOTIFICATION_HOSTNAME);
        hashMap.put(Marketplace.UK.getProdMarketplaceId(), DUB_NOTIFICATION_HOSTNAME);
        hashMap.put(Marketplace.DE.getProdMarketplaceId(), DUB_NOTIFICATION_HOSTNAME);
        hashMap.put(Marketplace.FR.getProdMarketplaceId(), DUB_NOTIFICATION_HOSTNAME);
        Marketplace marketplace3 = Marketplace.ES;
        hashMap.put(marketplace3.getProdMarketplaceId(), DUB_NOTIFICATION_HOSTNAME);
        hashMap.put(marketplace3.getDevoMarketplaceId(), DUB_NOTIFICATION_HOSTNAME);
        Marketplace marketplace4 = Marketplace.IN;
        hashMap.put(marketplace4.getProdMarketplaceId(), DUB_NOTIFICATION_HOSTNAME);
        hashMap.put(marketplace4.getDevoMarketplaceId(), DUB_NOTIFICATION_HOSTNAME);
        Marketplace marketplace5 = Marketplace.IT;
        hashMap.put(marketplace5.getProdMarketplaceId(), DUB_NOTIFICATION_HOSTNAME);
        hashMap.put(marketplace5.getDevoMarketplaceId(), DUB_NOTIFICATION_HOSTNAME);
        Marketplace marketplace6 = Marketplace.AE;
        hashMap.put(marketplace6.getProdMarketplaceId(), DUB_NOTIFICATION_HOSTNAME);
        hashMap.put(marketplace6.getDevoMarketplaceId(), DUB_NOTIFICATION_HOSTNAME);
        Marketplace marketplace7 = Marketplace.BE;
        hashMap.put(marketplace7.getProdMarketplaceId(), DUB_NOTIFICATION_HOSTNAME);
        hashMap.put(marketplace7.getDevoMarketplaceId(), DUB_NOTIFICATION_HOSTNAME);
        Marketplace marketplace8 = Marketplace.EG;
        hashMap.put(marketplace8.getProdMarketplaceId(), DUB_NOTIFICATION_HOSTNAME);
        hashMap.put(marketplace8.getDevoMarketplaceId(), DUB_NOTIFICATION_HOSTNAME);
        Marketplace marketplace9 = Marketplace.NL;
        hashMap.put(marketplace9.getProdMarketplaceId(), DUB_NOTIFICATION_HOSTNAME);
        hashMap.put(marketplace9.getDevoMarketplaceId(), DUB_NOTIFICATION_HOSTNAME);
        Marketplace marketplace10 = Marketplace.PL;
        hashMap.put(marketplace10.getProdMarketplaceId(), DUB_NOTIFICATION_HOSTNAME);
        hashMap.put(marketplace10.getDevoMarketplaceId(), DUB_NOTIFICATION_HOSTNAME);
        Marketplace marketplace11 = Marketplace.SA;
        hashMap.put(marketplace11.getProdMarketplaceId(), DUB_NOTIFICATION_HOSTNAME);
        hashMap.put(marketplace11.getDevoMarketplaceId(), DUB_NOTIFICATION_HOSTNAME);
        Marketplace marketplace12 = Marketplace.SE;
        hashMap.put(marketplace12.getProdMarketplaceId(), DUB_NOTIFICATION_HOSTNAME);
        hashMap.put(marketplace12.getDevoMarketplaceId(), DUB_NOTIFICATION_HOSTNAME);
        Marketplace marketplace13 = Marketplace.TR;
        hashMap.put(marketplace13.getProdMarketplaceId(), DUB_NOTIFICATION_HOSTNAME);
        hashMap.put(marketplace13.getDevoMarketplaceId(), DUB_NOTIFICATION_HOSTNAME);
        Marketplace marketplace14 = Marketplace.IE;
        hashMap.put(marketplace14.getProdMarketplaceId(), DUB_NOTIFICATION_HOSTNAME);
        hashMap.put(marketplace14.getDevoMarketplaceId(), DUB_NOTIFICATION_HOSTNAME);
        Marketplace marketplace15 = Marketplace.SG;
        hashMap.put(marketplace15.getProdMarketplaceId(), PDX_NOTIFICATION_HOSTNAME);
        hashMap.put(marketplace15.getDevoMarketplaceId(), PDX_NOTIFICATION_HOSTNAME);
        hashMap.put(Marketplace.JP.getProdMarketplaceId(), PDX_NOTIFICATION_HOSTNAME);
        hashMap.put(Marketplace.AU.getProdMarketplaceId(), PDX_NOTIFICATION_HOSTNAME);
        return Collections.unmodifiableMap(hashMap);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Map<String, String> getDefaultP2PHelpContentUrlByMarketplaceMap() {
        HashMap hashMap = new HashMap();
        hashMap.put(Marketplace.US.getProdMarketplaceId(), DEFAULT_P2P_HELP_CONTENT_URL);
        hashMap.put(Marketplace.CA.getProdMarketplaceId(), formatP2PHelpContentUrl(".ca"));
        Marketplace marketplace = Marketplace.BR;
        hashMap.put(marketplace.getProdMarketplaceId(), formatP2PHelpContentUrl(".com.br"));
        hashMap.put(marketplace.getDevoMarketplaceId(), formatP2PHelpContentUrl(".com.br"));
        Marketplace marketplace2 = Marketplace.MX;
        hashMap.put(marketplace2.getProdMarketplaceId(), formatP2PHelpContentUrl(".com.mx"));
        hashMap.put(marketplace2.getDevoMarketplaceId(), formatP2PHelpContentUrl(".com.mx"));
        hashMap.put(Marketplace.UK.getProdMarketplaceId(), formatP2PHelpContentUrl(".co.uk"));
        hashMap.put(Marketplace.DE.getProdMarketplaceId(), formatP2PHelpContentUrl(".de"));
        hashMap.put(Marketplace.FR.getProdMarketplaceId(), formatP2PHelpContentUrl(".fr"));
        Marketplace marketplace3 = Marketplace.ES;
        hashMap.put(marketplace3.getProdMarketplaceId(), formatP2PHelpContentUrl(".es"));
        hashMap.put(marketplace3.getDevoMarketplaceId(), formatP2PHelpContentUrl(".es"));
        Marketplace marketplace4 = Marketplace.IN;
        hashMap.put(marketplace4.getProdMarketplaceId(), formatP2PHelpContentUrl(".in"));
        hashMap.put(marketplace4.getDevoMarketplaceId(), formatP2PHelpContentUrl(".in"));
        Marketplace marketplace5 = Marketplace.IT;
        hashMap.put(marketplace5.getProdMarketplaceId(), formatP2PHelpContentUrl(".it"));
        hashMap.put(marketplace5.getDevoMarketplaceId(), formatP2PHelpContentUrl(".it"));
        hashMap.put(Marketplace.JP.getProdMarketplaceId(), formatP2PHelpContentUrl(".co.jp"));
        hashMap.put(Marketplace.AU.getProdMarketplaceId(), formatP2PHelpContentUrl(".com.au"));
        return Collections.unmodifiableMap(hashMap);
    }
}
