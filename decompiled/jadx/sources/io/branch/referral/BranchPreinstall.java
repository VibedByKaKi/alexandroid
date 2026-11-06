package io.branch.referral;

import android.content.Context;
import android.text.TextUtils;
import com.dee.app.metrics.MetricsConstants;
import io.branch.referral.Defines;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes9.dex */
class BranchPreinstall {
    private static final String BRANCH_PREINSTALL_PROP_KEY = "io.branch.preinstall.apps.path";
    private static final String SYSTEM_PROPERTIES_CLASS_KEY = "android.os.SystemProperties";

    private static String checkForBranchPreinstallInSystem() {
        try {
            return (String) Class.forName(SYSTEM_PROPERTIES_CLASS_KEY).getMethod(MetricsConstants.Method.CACHE_GET, String.class).invoke(null, BRANCH_PREINSTALL_PROP_KEY);
        } catch (Exception unused) {
            return null;
        }
    }

    public static void getBranchFileContent(JSONObject jSONObject, Branch branch, Context context) {
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            try {
                if (next.equals("apps") && (jSONObject.get(next) instanceof JSONObject) && jSONObject.getJSONObject(next).get(SystemObserver.getPackageName(context)) != null) {
                    JSONObject jSONObject2 = jSONObject.getJSONObject(next).getJSONObject(SystemObserver.getPackageName(context));
                    Iterator<String> keys2 = jSONObject2.keys();
                    while (keys2.hasNext()) {
                        String next2 = keys2.next();
                        Defines.PreinstallKey preinstallKey = Defines.PreinstallKey.campaign;
                        if (next2.equals(preinstallKey.getKey()) && TextUtils.isEmpty(PrefHelper.getInstance(context).getInstallMetaData(preinstallKey.getKey()))) {
                            branch.setPreinstallCampaign(jSONObject2.get(next2).toString());
                        } else {
                            Defines.PreinstallKey preinstallKey2 = Defines.PreinstallKey.partner;
                            if (next2.equals(preinstallKey2.getKey()) && TextUtils.isEmpty(PrefHelper.getInstance(context).getInstallMetaData(preinstallKey2.getKey()))) {
                                branch.setPreinstallPartner(jSONObject2.get(next2).toString());
                            } else {
                                branch.setRequestMetadata(next2, jSONObject2.get(next2).toString());
                            }
                        }
                    }
                }
            } catch (JSONException e) {
                BranchLogger.d(e.getMessage());
            }
        }
    }

    public static void getPreinstallSystemData(Branch branch, Context context) {
        if (branch != null) {
            String checkForBranchPreinstallInSystem = checkForBranchPreinstallInSystem();
            if (TextUtils.isEmpty(checkForBranchPreinstallInSystem)) {
                return;
            }
            readBranchFile(checkForBranchPreinstallInSystem, branch, context);
        }
    }

    private static void readBranchFile(final String str, final Branch branch, final Context context) {
        new Thread(new Runnable() { // from class: io.branch.referral.BranchPreinstall.1
            @Override // java.lang.Runnable
            public void run() {
                try {
                    StringBuilder sb = new StringBuilder();
                    BufferedReader bufferedReader = new BufferedReader(new FileReader(new File(str)));
                    while (true) {
                        String readLine = bufferedReader.readLine();
                        if (readLine == null) {
                            break;
                        } else {
                            sb.append(readLine);
                        }
                    }
                    bufferedReader.close();
                    JSONObject jSONObject = new JSONObject(sb.toString().trim());
                    if (TextUtils.isEmpty(jSONObject.toString())) {
                        throw new FileNotFoundException();
                    }
                    BranchPreinstall.getBranchFileContent(jSONObject, branch, context);
                } catch (FileNotFoundException e) {
                    BranchLogger.d(e.getMessage());
                } catch (IOException e2) {
                    BranchLogger.d(e2.getMessage());
                } catch (JSONException e3) {
                    BranchLogger.d(e3.getMessage());
                }
            }
        }).start();
    }

    public static void setBranchPreInstallGoogleReferrer(Context context, HashMap<String, String> hashMap) {
        Branch branch = Branch.getInstance();
        PrefHelper prefHelper = PrefHelper.getInstance(context);
        if (TextUtils.isEmpty(prefHelper.getInstallMetaData(Defines.PreinstallKey.partner.getKey())) && TextUtils.isEmpty(prefHelper.getInstallMetaData(Defines.PreinstallKey.campaign.getKey()))) {
            Defines.Jsonkey jsonkey = Defines.Jsonkey.UTMCampaign;
            if (!TextUtils.isEmpty(hashMap.get(jsonkey.getKey()))) {
                branch.setPreinstallCampaign(hashMap.get(jsonkey.getKey()));
            }
            Defines.Jsonkey jsonkey2 = Defines.Jsonkey.UTMMedium;
            if (TextUtils.isEmpty(hashMap.get(jsonkey2.getKey()))) {
                return;
            }
            branch.setPreinstallPartner(hashMap.get(jsonkey2.getKey()));
        }
    }
}
