package com.amazon.alexa.biloba.service;

import com.amazon.alexa.protocols.environment.EnvironmentService;
import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public class BilobaUrlResolver {
    private static final String ALPHA_KEY = "alpha";
    private static final String BETA_KEY = "beta";
    private static final String COMMS_SETUP_ALPHA_URL = "https://aiwa-mge-pdx-pd.integ.amazon.com/groups/care/commsPrimer";
    private static final String COMMS_SETUP_BETA_URL = "https://aiwa-mge-pdx-d.integ.amazon.com/groups/care/commsPrimer";
    private static final String COMMS_SETUP_GAMMA_URL = "https://projectdee-ui-gamma.amazon.com/groups/care/commsPrimer";
    private static final String COMMS_SETUP_PROD_URL = "https://alexa.amazon.com/groups/care/commsPrimer";
    private static final String GAMMA_KEY = "gamma";
    private static final String PROD_KEY = "prod";
    private static final String TAG = "BilobaUrlResolver";
    private static final Map<String, String> commsSetupUrls;
    private EnvironmentService environmentService;

    static {
        HashMap hashMap = new HashMap();
        commsSetupUrls = hashMap;
        hashMap.put("alpha", COMMS_SETUP_ALPHA_URL);
        hashMap.put("beta", COMMS_SETUP_BETA_URL);
        hashMap.put("gamma", COMMS_SETUP_GAMMA_URL);
        hashMap.put("prod", COMMS_SETUP_PROD_URL);
    }

    public BilobaUrlResolver(EnvironmentService environmentService) {
        this.environmentService = environmentService;
    }

    public String getCommsSetupUrl() {
        String buildStage = this.environmentService.getBuildStage();
        if (buildStage == null) {
            return COMMS_SETUP_PROD_URL;
        }
        Map<String, String> map = commsSetupUrls;
        return map.containsKey(buildStage) ? map.get(buildStage) : COMMS_SETUP_PROD_URL;
    }
}
