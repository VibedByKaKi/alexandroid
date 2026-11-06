package io.branch.referral;

import android.content.Context;
import android.text.TextUtils;
import com.amazon.alexa.biloba.utils.WebConstants;
import io.branch.referral.Defines;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.HashMap;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes9.dex */
public class AppStoreReferrer {
    private static String installID_ = "bnc_no_value";

    public static String getInstallationID() {
        return installID_;
    }

    public static void processReferrerInfo(Context context, String str, long j, long j2, String str2, Boolean bool, Long l, Long l2) {
        PrefHelper prefHelper = PrefHelper.getInstance(context);
        if (!TextUtils.isEmpty(str2)) {
            prefHelper.setAppStoreSource(str2);
            if (str2.equals(Defines.Jsonkey.Meta_Install_Referrer.getKey())) {
                prefHelper.setIsMetaClickThrough(bool.booleanValue());
            }
        }
        if (j > 0) {
            prefHelper.setLong("bnc_referrer_click_ts", j);
        }
        if (j2 > 0) {
            prefHelper.setLong("bnc_install_begin_ts", j2);
        }
        if (str != null) {
            try {
                String decode = URLDecoder.decode(str, "UTF-8");
                HashMap hashMap = new HashMap();
                String[] split = decode.split(WebConstants.UriConstants.AMPERSAND_KEY);
                prefHelper.setAppStoreReferrer(decode);
                for (String str3 : split) {
                    if (!TextUtils.isEmpty(str3)) {
                        String[] split2 = str3.split((str3.contains("=") || !str3.contains("-")) ? "=" : "-");
                        if (split2.length > 1) {
                            hashMap.put(URLDecoder.decode(split2[0], "UTF-8"), URLDecoder.decode(split2[1], "UTF-8"));
                        }
                    }
                }
                Defines.Jsonkey jsonkey = Defines.Jsonkey.LinkClickID;
                if (hashMap.containsKey(jsonkey.getKey())) {
                    String str4 = (String) hashMap.get(jsonkey.getKey());
                    installID_ = str4;
                    prefHelper.setLinkClickIdentifier(str4);
                }
                Defines.Jsonkey jsonkey2 = Defines.Jsonkey.IsFullAppConv;
                if (hashMap.containsKey(jsonkey2.getKey())) {
                    Defines.Jsonkey jsonkey3 = Defines.Jsonkey.ReferringLink;
                    if (hashMap.containsKey(jsonkey3.getKey())) {
                        prefHelper.setIsFullAppConversion(Boolean.parseBoolean((String) hashMap.get(jsonkey2.getKey())));
                        prefHelper.setAppLink((String) hashMap.get(jsonkey3.getKey()));
                    }
                }
                Defines.Jsonkey jsonkey4 = Defines.Jsonkey.GoogleSearchInstallReferrer;
                if (hashMap.containsKey(jsonkey4.getKey())) {
                    prefHelper.setGoogleSearchInstallIdentifier((String) hashMap.get(jsonkey4.getKey()));
                }
                if (hashMap.containsValue(Defines.Jsonkey.PlayAutoInstalls.getKey())) {
                    BranchPreinstall.setBranchPreInstallGoogleReferrer(context, hashMap);
                }
            } catch (UnsupportedEncodingException e) {
                BranchLogger.w("Caught UnsupportedEncodingException " + e.getMessage());
            } catch (IllegalArgumentException e2) {
                BranchLogger.w("Caught IllegalArgumentException " + e2.getMessage());
            }
        }
        if (l != null && l.longValue() > 0) {
            prefHelper.setLong("bnc_install_begin_server_ts", l.longValue());
        }
        if (l2 == null || l2.longValue() <= 0) {
            return;
        }
        prefHelper.setLong("bnc_referrer_click_server_ts", l2.longValue());
    }
}
