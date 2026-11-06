package com.amazon.identity.auth.device;

import android.os.Build;
import android.util.Log;
import com.amazon.alexa.accessorykit.interprocess.cookie.CookieChangeEmitter;
import com.amazon.alexa.apl.payload.RenderDocumentPayload;
import com.amazon.identity.auth.device.api.MAPAccountManager;
import com.amazon.identity.auth.device.api.MAPAgeClassificationManager;
import com.amazon.identity.auth.device.utils.AccountConstants;
import com.amazon.identity.kcpsdk.auth.RegisterDeviceErrorType;
import com.dee.app.data.reactnative.Utils.HttpClientUtils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public abstract class nj extends com.amazon.identity.kcpsdk.auth.a {
    public static final ArrayList v = new ArrayList(Arrays.asList("account_pool", "device_name"));

    /* renamed from: a, reason: collision with root package name */
    public String f838a;
    public String b;
    public String c;
    public String d;
    public int e;
    public String f;
    public JSONArray g;
    public long h;
    public String i;
    public String j;
    public String k;
    public String l;
    public String m;
    public String n;
    public String o;
    public String p;
    public String q;
    public String r;
    public boolean s;
    public MAPAgeClassificationManager.AgeClassification t;
    public final HashSet u;

    public nj(List list) {
        HashSet hashSet = new HashSet(v);
        this.u = hashSet;
        hashSet.addAll(list);
        this.g = new JSONArray();
    }

    @Override // com.amazon.identity.kcpsdk.auth.a
    public final bm c(JSONObject jSONObject) {
        int i;
        if (jSONObject.has("tokens")) {
            JSONObject jSONObject2 = jSONObject.getJSONObject("tokens");
            if (jSONObject2.has(HttpClientUtils.ElementsRequestKey.BEARER)) {
                JSONObject jSONObject3 = jSONObject2.getJSONObject(HttpClientUtils.ElementsRequestKey.BEARER);
                this.c = jSONObject3.getString("refresh_token");
                this.d = jSONObject3.getString(AccountConstants.KEY_ACCESS_TOKEN);
                try {
                    i = Integer.parseInt(jSONObject3.getString("expires_in"));
                } catch (NumberFormatException unused) {
                    i = 0;
                }
                this.e = i;
            }
            if (jSONObject2.has("mac_dms")) {
                JSONObject jSONObject4 = jSONObject2.getJSONObject("mac_dms");
                this.f838a = jSONObject4.getString("adp_token");
                this.b = jSONObject4.getString("device_private_key");
            }
            if (jSONObject2.has("store_authentication_cookie")) {
                this.i = jSONObject2.getJSONObject("store_authentication_cookie").optString(CookieChangeEmitter.COOKIE_KEY, null);
            }
            if (jSONObject2.has("website_cookies")) {
                this.g = jSONObject2.getJSONArray("website_cookies");
            }
            if (jSONObject2.has(AccountConstants.KEY_WEBSITE_COOKIES_TTL)) {
                this.h = jSONObject2.getLong(AccountConstants.KEY_WEBSITE_COOKIES_TTL);
            }
        }
        if (jSONObject.has(RenderDocumentPayload.FIELD_EXTENSIONS)) {
            bm bmVar = new bm(null, null, null, 0, null, null, new am(RegisterDeviceErrorType.RegisterDeviceErrorTypeUnrecognizedPanda, null));
            JSONObject jSONObject5 = jSONObject.getJSONObject(RenderDocumentPayload.FIELD_EXTENSIONS);
            if (jSONObject5.has("customer_info")) {
                JSONObject jSONObject6 = jSONObject5.getJSONObject("customer_info");
                if (jSONObject6.has("account_pool")) {
                    this.j = jSONObject6.getString("account_pool");
                } else if (this.u.contains("account_pool")) {
                    Log.e(yf.a("PandaRegisterDeviceResponseJsonParser"), " PandaResponseJsonParser: account pool is missing");
                }
                if (jSONObject6.has("country_of_residence")) {
                    this.k = jSONObject6.getString("country_of_residence");
                }
                if (jSONObject6.has("source_of_country_of_residence")) {
                    this.l = jSONObject6.getString("source_of_country_of_residence");
                }
                if (jSONObject6.has("home_region")) {
                    this.n = jSONObject6.getString("home_region");
                }
                if (jSONObject6.has("name")) {
                    this.m = jSONObject6.getString("name");
                } else if (this.u.contains("name")) {
                    Log.e(yf.a("PandaRegisterDeviceResponseJsonParser"), " PandaResponseJsonParser: name is missing");
                }
                if (jSONObject6.has("preferred_marketplace")) {
                    this.o = jSONObject6.getString("preferred_marketplace");
                }
                if (jSONObject6.has("given_name")) {
                    this.p = jSONObject6.getString("given_name");
                } else if (this.u.contains("given_name")) {
                    Log.e(yf.a("PandaRegisterDeviceResponseJsonParser"), " PandaResponseJsonParser: given name is missing");
                }
                if (jSONObject5.has("device_info")) {
                    JSONObject jSONObject7 = jSONObject5.getJSONObject("device_info");
                    if (jSONObject7.has("device_name")) {
                        this.q = jSONObject7.getString("device_name");
                    } else if (this.u.contains("device_name")) {
                        Log.e(yf.a("PandaRegisterDeviceResponseJsonParser"), " PandaResponseJsonParser: device name is missing");
                    }
                    if (jSONObject7.has("kindle_email_address")) {
                        this.r = jSONObject7.getString("kindle_email_address");
                    }
                    JSONObject b = hd.b(jSONObject5, MAPAccountManager.KEY_BUSINESS_INFO_EXTENSION);
                    if (b != null) {
                        this.s = hd.a(b, "is_business");
                    } else {
                        yf.a("PandaRegisterDeviceResponseJsonParser");
                        "user".equalsIgnoreCase(Build.TYPE);
                    }
                    this.t = com.amazon.identity.auth.device.age.c.a(hd.a("age_classification", null, jSONObject5));
                    bmVar = null;
                } else {
                    Log.e(yf.a("PandaRegisterDeviceResponseJsonParser"), " PandaResponseJsonParser: device info is missing");
                }
            } else {
                Log.e(yf.a("PandaRegisterDeviceResponseJsonParser"), " PandaResponseJsonParser: customer info is missing");
            }
            if (bmVar != null) {
                return bmVar;
            }
        }
        this.f = jSONObject.getString("customer_id");
        Log.i(yf.a("PandaRegisterDeviceResponseJsonParser"), " PandaResponseJsonParser: success response received");
        bm bmVar2 = new bm(this.f838a, this.c, this.d, this.e, this.b, this.f, null);
        bmVar2.u = this.g;
        bmVar2.v = this.h;
        bmVar2.j = this.i;
        bmVar2.r = this.n;
        bmVar2.n = this.j;
        bmVar2.o = this.k;
        bmVar2.p = this.l;
        bmVar2.q = this.o;
        bmVar2.g = this.m;
        bmVar2.h = this.p;
        bmVar2.e = this.q;
        bmVar2.i = this.r;
        bmVar2.y = this.s;
        bmVar2.z = this.t;
        bmVar2.A = jSONObject.optString("secureSessionToken", null);
        return bmVar2;
    }

    @Override // com.amazon.identity.kcpsdk.auth.a
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public bm d(JSONObject jSONObject) {
        yf.a("PandaRegisterDeviceResponseJsonParser", " PandaResponseJsonParser: response received a %s error.", jSONObject.toString());
        String string = jSONObject.getString("code");
        return new bm(null, null, null, 0, null, null, new am(string == null ? RegisterDeviceErrorType.RegisterDeviceErrorTypeUnrecognizedPanda : string.equals("ProtocolError") ? RegisterDeviceErrorType.RegisterDeviceErrorTypeProtocolError : string.equals("MethodNotAllowed") ? RegisterDeviceErrorType.RegisterDeviceErrorTypeMethodNotAllowed : string.equals("NotImplemented") ? RegisterDeviceErrorType.RegisterDeviceErrorTypeNotImplemented : string.equals("InvalidDirectedId") ? RegisterDeviceErrorType.RegisterDeviceErrorTypeInvalidDirectedId : string.equals("InvalidDevice") ? RegisterDeviceErrorType.RegisterDeviceErrorTypeInvalidDevice : string.equals("DeviceAlreadyRegistered") ? RegisterDeviceErrorType.RegisterDeviceErrorTypeDeviceAlreadyRegistered : string.equals("DuplicateDeviceName") ? RegisterDeviceErrorType.RegisterDeviceErrorTypeDuplicateDeviceName : string.equals("InvalidToken") ? RegisterDeviceErrorType.RegisterDeviceErrorTypeInvalidTokenPanda : string.equals("DeviceNotRegistered") ? RegisterDeviceErrorType.RegisterDeviceErrorTypeDeviceNotRegisteredPanda : string.equals("Unauthorized") ? RegisterDeviceErrorType.RegisterDeviceErrorTypeUnauthorizedPanda : RegisterDeviceErrorType.RegisterDeviceErrorTypeUnrecognizedPanda, jSONObject.optString("reason")));
    }
}
