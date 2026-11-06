package io.branch.referral;

import android.annotation.SuppressLint;
import android.text.TextUtils;
import io.branch.referral.Defines;
import java.util.Collection;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes9.dex */
class BranchLinkData extends JSONObject {
    private String alias;
    private String campaign;
    private String channel;
    private int duration;
    private String feature;
    private JSONObject params;
    private String stage;
    private Collection<String> tags;
    private int type;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        BranchLinkData branchLinkData = (BranchLinkData) obj;
        String str = this.alias;
        String str2 = branchLinkData.alias;
        if (str == null) {
            if (str2 != null) {
                return false;
            }
        } else if (!str.equals(str2)) {
            return false;
        }
        String str3 = this.channel;
        String str4 = branchLinkData.channel;
        if (str3 == null) {
            if (str4 != null) {
                return false;
            }
        } else if (!str3.equals(str4)) {
            return false;
        }
        String str5 = this.feature;
        String str6 = branchLinkData.feature;
        if (str5 == null) {
            if (str6 != null) {
                return false;
            }
        } else if (!str5.equals(str6)) {
            return false;
        }
        String str7 = this.stage;
        String str8 = branchLinkData.stage;
        if (str7 == null) {
            if (str8 != null) {
                return false;
            }
        } else if (!str7.equals(str8)) {
            return false;
        }
        String str9 = this.campaign;
        String str10 = branchLinkData.campaign;
        if (str9 == null) {
            if (str10 != null) {
                return false;
            }
        } else if (!str9.equals(str10)) {
            return false;
        }
        if (this.type != branchLinkData.type || this.duration != branchLinkData.duration) {
            return false;
        }
        Collection<String> collection = this.tags;
        if (collection != null) {
            String obj2 = collection.toString();
            Collection<String> collection2 = branchLinkData.tags;
            if (!obj2.equals(collection2 != null ? collection2.toString() : null)) {
                return false;
            }
        } else if (branchLinkData.tags != null) {
            return false;
        }
        JSONObject jSONObject = this.params;
        if (jSONObject != null) {
            String jSONObject2 = jSONObject.toString();
            JSONObject jSONObject3 = branchLinkData.params;
            if (!jSONObject2.equals(jSONObject3 != null ? jSONObject3.toString() : null)) {
                return false;
            }
        } else if (branchLinkData.params != null) {
            return false;
        }
        return true;
    }

    public String getAlias() {
        return this.alias;
    }

    public String getCampaign() {
        return this.campaign;
    }

    public String getChannel() {
        return this.channel;
    }

    public int getDuration() {
        return this.duration;
    }

    public String getFeature() {
        return this.feature;
    }

    public JSONObject getLinkDataJsonObject() {
        JSONObject jSONObject = new JSONObject();
        try {
            if (!TextUtils.isEmpty(this.channel)) {
                jSONObject.put("~" + Defines.LinkParam.Channel.getKey(), this.channel);
            }
            if (!TextUtils.isEmpty(this.alias)) {
                jSONObject.put("~" + Defines.LinkParam.Alias.getKey(), this.alias);
            }
            if (!TextUtils.isEmpty(this.feature)) {
                jSONObject.put("~" + Defines.LinkParam.Feature.getKey(), this.feature);
            }
            if (!TextUtils.isEmpty(this.stage)) {
                jSONObject.put("~" + Defines.LinkParam.Stage.getKey(), this.stage);
            }
            if (!TextUtils.isEmpty(this.campaign)) {
                jSONObject.put("~" + Defines.LinkParam.Campaign.getKey(), this.campaign);
            }
            Defines.LinkParam linkParam = Defines.LinkParam.Tags;
            if (has(linkParam.getKey())) {
                jSONObject.put(linkParam.getKey(), getJSONArray(linkParam.getKey()));
            }
            jSONObject.put("~" + Defines.LinkParam.Type.getKey(), this.type);
            jSONObject.put("~" + Defines.LinkParam.Duration.getKey(), this.duration);
            return jSONObject;
        } catch (JSONException e) {
            BranchLogger.d(e.getMessage());
            return jSONObject;
        }
    }

    public JSONObject getParams() {
        return this.params;
    }

    public String getSource() {
        return Defines.Jsonkey.URLSource.getKey();
    }

    public String getStage() {
        return this.stage;
    }

    public Collection<String> getTags() {
        return this.tags;
    }

    public int getType() {
        return this.type;
    }

    @SuppressLint({"DefaultLocale"})
    public int hashCode() {
        int i = (this.type + 19) * 19;
        String str = this.alias;
        int hashCode = (i + (str == null ? 0 : str.toLowerCase().hashCode())) * 19;
        String str2 = this.channel;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.toLowerCase().hashCode())) * 19;
        String str3 = this.feature;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.toLowerCase().hashCode())) * 19;
        String str4 = this.stage;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.toLowerCase().hashCode())) * 19;
        String str5 = this.campaign;
        int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.toLowerCase().hashCode())) * 19;
        JSONObject jSONObject = this.params;
        int hashCode6 = ((hashCode5 + (jSONObject != null ? jSONObject.toString().toLowerCase().hashCode() : 0)) * 19) + this.duration;
        Collection<String> collection = this.tags;
        if (collection != null) {
            Iterator<String> it2 = collection.iterator();
            while (it2.hasNext()) {
                hashCode6 = (hashCode6 * 19) + it2.next().toLowerCase().hashCode();
            }
        }
        return hashCode6;
    }

    public void putAlias(String str) throws JSONException {
        if (str != null) {
            this.alias = str;
            put(Defines.LinkParam.Alias.getKey(), str);
        }
    }

    public void putCampaign(String str) throws JSONException {
        if (str != null) {
            this.campaign = str;
            put(Defines.LinkParam.Campaign.getKey(), str);
        }
    }

    public void putChannel(String str) throws JSONException {
        if (str != null) {
            this.channel = str;
            put(Defines.LinkParam.Channel.getKey(), str);
        }
    }

    public void putDuration(int i) throws JSONException {
        if (i > 0) {
            this.duration = i;
            put(Defines.LinkParam.Duration.getKey(), i);
        }
    }

    public void putFeature(String str) throws JSONException {
        if (str != null) {
            this.feature = str;
            put(Defines.LinkParam.Feature.getKey(), str);
        }
    }

    public void putParams(JSONObject jSONObject) throws JSONException {
        this.params = jSONObject;
        put(Defines.LinkParam.Data.getKey(), jSONObject);
    }

    public void putSource() throws JSONException {
        put("source", Defines.Jsonkey.URLSource.getKey());
    }

    public void putStage(String str) throws JSONException {
        if (str != null) {
            this.stage = str;
            put(Defines.LinkParam.Stage.getKey(), str);
        }
    }

    public void putTags(Collection<String> collection) throws JSONException {
        if (collection != null) {
            this.tags = collection;
            JSONArray jSONArray = new JSONArray();
            Iterator<String> it2 = collection.iterator();
            while (it2.hasNext()) {
                jSONArray.put(it2.next());
            }
            put(Defines.LinkParam.Tags.getKey(), jSONArray);
        }
    }

    public void putType(int i) throws JSONException {
        if (i != 0) {
            this.type = i;
            put(Defines.LinkParam.Type.getKey(), i);
        }
    }
}
