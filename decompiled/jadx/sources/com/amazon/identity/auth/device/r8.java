package com.amazon.identity.auth.device;

import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import com.amazon.identity.auth.device.api.CookieKeys;
import com.amazon.identity.auth.device.token.MAPCookie;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.Locale;
import java.util.StringTokenizer;
import java.util.TimeZone;
import org.apache.commons.lang3.time.TimeZones;
import org.json.JSONArray;
import org.json.JSONException;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public abstract class r8 {
    public static String a(ArrayList arrayList) {
        String[] strArr;
        JSONArray jSONArray = new JSONArray();
        if (arrayList != null) {
            ArrayList arrayList2 = new ArrayList();
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                arrayList2.add(((MAPCookie) it2.next()).d());
            }
            strArr = (String[]) arrayList2.toArray(new String[arrayList2.size()]);
        } else {
            strArr = new String[0];
        }
        if (strArr != null) {
            for (String str : strArr) {
                jSONArray.put(str);
            }
        }
        return jSONArray.toString();
    }

    public static ArrayList b(String str, String str2) {
        String[] strArr;
        ArrayList arrayList = new ArrayList();
        Bundle b = zj.b(str);
        if (b != null) {
            try {
                strArr = b.getStringArray(CookieKeys.KEY_COOKIES);
            } catch (Exception e) {
                Log.w(yf.a("CookieUtils"), "Failed to deserialize parcel", e);
                strArr = null;
            }
            if (strArr != null) {
                for (String str3 : strArr) {
                    arrayList.add(c(str3, str2));
                }
            }
        }
        return arrayList;
    }

    public static MAPCookie c(String str, String str2) {
        String substring;
        StringTokenizer stringTokenizer = new StringTokenizer(str.trim(), ";");
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        boolean z = false;
        boolean z2 = false;
        while (stringTokenizer.hasMoreTokens()) {
            String trim = stringTokenizer.nextToken().trim();
            int indexOf = trim.indexOf("=");
            if (indexOf == -1) {
                substring = null;
            } else {
                String substring2 = trim.substring(0, indexOf);
                substring = trim.substring(indexOf + 1);
                trim = substring2;
            }
            if (trim.equalsIgnoreCase("domain")) {
                str5 = substring;
            } else if (trim.equalsIgnoreCase("Expires")) {
                str6 = substring;
            } else if (trim.equalsIgnoreCase("Path")) {
                str7 = substring;
            } else if (trim.equalsIgnoreCase("Secure")) {
                z = true;
            } else if (trim.equalsIgnoreCase("HttpOnly")) {
                z2 = true;
            } else {
                str3 = trim;
                str4 = substring;
            }
        }
        return new MAPCookie(str3, str4, str5, str6, str7, str2, z, z2);
    }

    public static ArrayList a(String str, Bundle bundle) {
        ArrayList arrayList = new ArrayList();
        if (bundle.containsKey(CookieKeys.KEY_COOKIES)) {
            try {
                String[] stringArray = bundle.getStringArray(CookieKeys.KEY_COOKIES);
                if (stringArray != null) {
                    for (String str2 : stringArray) {
                        arrayList.add(c(str2, str));
                    }
                }
            } catch (Exception e) {
                Log.w(yf.a("CookieUtils"), "Failed to deserialize parcel", e);
            }
        }
        return arrayList;
    }

    public static ArrayList a(String str, String str2) {
        ArrayList arrayList = new ArrayList();
        if (!TextUtils.isEmpty(str)) {
            try {
                JSONArray jSONArray = new JSONArray(str);
                for (int i = 0; i < jSONArray.length(); i++) {
                    arrayList.add(c(jSONArray.getString(i), str2));
                }
            } catch (JSONException e) {
                Log.w(yf.a("CookieUtils"), "Failed to parse cookies", e);
                return arrayList;
            }
        }
        return arrayList;
    }

    public static String a() {
        Date date = new Date(System.currentTimeMillis() + 946080000000L);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd MMM yyyy kk:mm:ss 'GMT'", Locale.US);
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone(TimeZones.GMT_ID));
        return simpleDateFormat.format(date);
    }
}
