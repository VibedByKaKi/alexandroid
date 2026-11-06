package com.amazon.alexa.enrollment.utils;

import com.amazon.alexa.accessory.frames.smartPlay.SmartPlayConstants;
import com.amazon.alexa.enrollment.ui.terms.EnrollmentTermsViewFragment;
import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public class EndPointMapUtil {
    public static Map<String, String> countryCodeEndPointMapping = new HashMap<String, String>() { // from class: com.amazon.alexa.enrollment.utils.EndPointMapUtil.1
        {
            put("AE", "https://www.amazon.ae");
            put("AU", "https://www.amazon.com.au");
            put("BR", "https://www.amazon.com.br");
            put("CA", "https://www.amazon.ca");
            put("CN", "https://www.amazon.cn");
            put("DE", "https://www.amazon.de");
            put("ES", "https://www.amazon.es");
            put("FR", "https://www.amazon.fr");
            put("GB", "https://www.amazon.co.uk");
            put("ID", EnrollmentTermsViewFragment.DEFAULT_ENDPOINT);
            put("IN", "https://www.amazon.in");
            put("IT", "https://www.amazon.it");
            put("JP", "https://www.amazon.co.jp");
            put("NL", "https://www.amazon.nl");
            put("RU", EnrollmentTermsViewFragment.DEFAULT_ENDPOINT);
            put("SA", "https://www.amazon.sa");
            put("TR", "https://www.amazon.tr");
            put("SE", "https://www.amazon.se");
            put(SmartPlayConstants.SMART_PLAY_CONTENT_TOKEN_TYPE_PLAYLIST_PREFIX_PANDORA, "https://www.amazon.pl");
            put("EG", "https://www.amazon.eg");
            put("US", EnrollmentTermsViewFragment.DEFAULT_ENDPOINT);
        }
    };
}
