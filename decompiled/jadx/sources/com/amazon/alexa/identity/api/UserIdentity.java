package com.amazon.alexa.identity.api;

import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.amazon.alexa.marketplace.api.Marketplace;
import com.amazon.alexa.smarthomecameras.routing.CamerasRouteParameter;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes13.dex */
public final class UserIdentity {
    private static final String TAG = "UserIdentity";
    private final String accessToken;
    private final String countryOfResidence;
    private final UserProfile delegatedProfile;
    private final String directedId;
    private final Marketplace effectiveMarketplace;
    private final String email;
    private final boolean eulaAccepted;
    private final Set<String> features;
    private final boolean hasActiveDevices;
    private final String id;
    private final Marketplace marketplace;
    private final String name;
    private final Marketplace originalMarketplace;

    @Nullable
    private final List<UserProfile> profileList;
    private final Map<String, String> tokens;
    private final UserProfile userProfile;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class Builder {
        private String accessToken;
        private String countryOfResidence;
        private UserProfile delegatedProfile;
        private String directedId;
        private Marketplace effectiveMarketplace;
        private String email;
        private boolean eulaAccepted;
        private boolean hasActiveDevices;
        private String id;
        private Marketplace marketplace;
        private String name;
        private Marketplace originalMarketplace;
        private UserProfile userProfile;
        private Map<String, String> tokens = new HashMap();
        private Set<String> features = new HashSet();
        private List<UserProfile> profileList = new LinkedList();

        public UserIdentity build() {
            return new UserIdentity(this, 0);
        }

        public Builder hasAcceptedEula(boolean z) {
            this.eulaAccepted = z;
            return this;
        }

        public Builder hasActiveDevices(boolean z) {
            this.hasActiveDevices = z;
            return this;
        }

        @Deprecated
        public Builder withAccessToken(String str) {
            this.accessToken = str;
            return this;
        }

        public Builder withCountryOfResidence(String str) {
            this.countryOfResidence = str;
            return this;
        }

        public Builder withDelegatedProfile(UserProfile userProfile) {
            this.delegatedProfile = userProfile;
            return this;
        }

        public Builder withDirectedId(String str) {
            this.directedId = str;
            return this;
        }

        public Builder withEffectiveMarketplace(Marketplace marketplace) {
            this.effectiveMarketplace = marketplace;
            return this;
        }

        public Builder withEmail(String str) {
            this.email = str;
            return this;
        }

        public Builder withFeatures(@Nullable Set<String> set) {
            this.features.clear();
            if (set != null) {
                this.features.addAll(set);
            }
            return this;
        }

        public Builder withId(String str) {
            this.id = str;
            return this;
        }

        public Builder withMarketplace(Marketplace marketplace) {
            this.marketplace = marketplace;
            return this;
        }

        public Builder withName(String str) {
            this.name = str;
            return this;
        }

        public Builder withOriginalMarketplace(Marketplace marketplace) {
            this.originalMarketplace = marketplace;
            return this;
        }

        public Builder withProfileList(List<UserProfile> list) {
            this.profileList.clear();
            if (list != null) {
                this.profileList.addAll(list);
            }
            return this;
        }

        public Builder withTokens(@Nullable Map<String, String> map) {
            this.tokens.clear();
            if (map != null) {
                this.tokens.putAll(map);
            }
            return this;
        }

        public Builder withUserProfile(UserProfile userProfile) {
            this.userProfile = userProfile;
            return this;
        }
    }

    private UserIdentity(Builder builder) {
        this.id = builder.id;
        this.directedId = builder.directedId;
        this.name = builder.name;
        this.email = builder.email;
        this.features = Collections.unmodifiableSet(builder.features);
        this.originalMarketplace = builder.originalMarketplace;
        this.marketplace = builder.marketplace;
        this.countryOfResidence = builder.countryOfResidence;
        this.effectiveMarketplace = builder.effectiveMarketplace;
        this.eulaAccepted = builder.eulaAccepted;
        this.hasActiveDevices = builder.hasActiveDevices;
        this.accessToken = builder.accessToken;
        this.userProfile = builder.userProfile;
        this.delegatedProfile = builder.delegatedProfile;
        this.tokens = Collections.unmodifiableMap(builder.tokens);
        this.profileList = builder.profileList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder from(@Nullable UserIdentity userIdentity) {
        return userIdentity == null ? builder() : builder().withId(userIdentity.getId()).withDirectedId(userIdentity.getDirectedId()).withName(userIdentity.getName()).withEmail(userIdentity.getEmail()).withFeatures(userIdentity.getFeatures()).withOriginalMarketplace(userIdentity.getOriginalMarketplace()).withMarketplace(userIdentity.getMarketplace()).withCountryOfResidence(userIdentity.getCountryOfResidence()).withEffectiveMarketplace(userIdentity.getEffectiveMarketplace()).hasAcceptedEula(userIdentity.hasAcceptedEula()).hasActiveDevices(userIdentity.hasActiveDevices()).withAccessToken(userIdentity.getAccessToken()).withUserProfile(userIdentity.getUserProfile()).withDelegatedProfile(userIdentity.getDelegatedProfile()).withProfileList(userIdentity.getProfileList()).withTokens(userIdentity.getTokens());
    }

    @Nullable
    public static UserIdentity fromJson(@Nullable JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        String optString = jSONObject.isNull("originalMarketplace") ? null : jSONObject.optString("originalMarketplace");
        String optString2 = jSONObject.isNull("marketplace") ? null : jSONObject.optString("marketplace");
        String optString3 = jSONObject.isNull("effectiveMarketplace") ? null : jSONObject.optString("effectiveMarketplace");
        JSONArray optJSONArray = jSONObject.optJSONArray(CamerasRouteParameter.FEATURES);
        HashSet hashSet = new HashSet();
        if (optJSONArray != null) {
            for (int i = 0; i < optJSONArray.length(); i++) {
                hashSet.add(optJSONArray.optString(i));
            }
        }
        JSONArray optJSONArray2 = jSONObject.optJSONArray("profileList");
        LinkedList linkedList = new LinkedList();
        if (optJSONArray2 != null) {
            for (int i2 = 0; i2 < optJSONArray2.length(); i2++) {
                linkedList.add(UserProfile.fromJson(optJSONArray2.optJSONObject(i2)));
            }
        }
        JSONObject optJSONObject = jSONObject.optJSONObject("tokens");
        HashMap hashMap = new HashMap();
        if (optJSONObject != null) {
            Iterator<String> keys = optJSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                hashMap.put(next, optJSONObject.optString(next));
            }
        }
        return builder().withId(jSONObject.isNull("id") ? null : jSONObject.optString("id")).withDirectedId(jSONObject.isNull("directedId") ? null : jSONObject.optString("directedId")).withName(jSONObject.isNull("name") ? null : jSONObject.optString("name")).withEmail(jSONObject.isNull("email") ? null : jSONObject.optString("email")).withFeatures(hashSet).withOriginalMarketplace(Marketplace.findMarketplaceByName(optString, null)).withMarketplace(Marketplace.findMarketplaceByName(optString2, null)).withCountryOfResidence(jSONObject.isNull("countryOfResidence") ? null : jSONObject.optString("countryOfResidence")).withEffectiveMarketplace(Marketplace.findMarketplaceByName(optString3, null)).hasAcceptedEula(jSONObject.optBoolean("eulaAccepted")).hasActiveDevices(jSONObject.optBoolean("hasActiveDevices")).withAccessToken(jSONObject.isNull("accessToken") ? null : jSONObject.optString("accessToken")).withUserProfile(UserProfile.fromJson(jSONObject.optJSONObject("userProfile"))).withDelegatedProfile(UserProfile.fromJson(jSONObject.optJSONObject("delegatedProfile"))).withProfileList(linkedList).withTokens(hashMap).build();
    }

    @Nullable
    public static UserIdentity fromPayload(String str) {
        if (str == null) {
            return null;
        }
        try {
            return fromJson(new JSONObject(str));
        } catch (JSONException e) {
            Log.e(TAG, "Unable to parse UserIdentity from payload", e);
            return null;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && UserIdentity.class == obj.getClass()) {
            UserIdentity userIdentity = (UserIdentity) obj;
            if (Objects.equals(this.id, userIdentity.getId()) && Objects.equals(this.directedId, userIdentity.getDirectedId()) && Objects.equals(this.name, userIdentity.getName()) && Objects.equals(this.email, userIdentity.getEmail()) && Objects.equals(this.features, userIdentity.getFeatures()) && Objects.equals(this.marketplace, userIdentity.getMarketplace()) && Objects.equals(this.effectiveMarketplace, userIdentity.getEffectiveMarketplace()) && Objects.equals(this.countryOfResidence, userIdentity.countryOfResidence) && Boolean.valueOf(this.eulaAccepted).equals(Boolean.valueOf(userIdentity.hasAcceptedEula())) && Boolean.valueOf(this.hasActiveDevices).equals(Boolean.valueOf(userIdentity.hasActiveDevices())) && Objects.equals(this.accessToken, userIdentity.getAccessToken()) && Objects.equals(this.userProfile, userIdentity.getUserProfile()) && Objects.equals(this.delegatedProfile, userIdentity.getDelegatedProfile()) && Objects.equals(this.profileList, userIdentity.getProfileList()) && Objects.equals(this.tokens, userIdentity.getTokens())) {
                return true;
            }
        }
        return false;
    }

    @Deprecated
    public String getAccessToken() {
        return this.accessToken;
    }

    public String getCountryOfResidence() {
        return this.countryOfResidence;
    }

    public UserProfile getDelegatedProfile() {
        return this.delegatedProfile;
    }

    public String getDirectedId() {
        return this.directedId;
    }

    public Marketplace getEffectiveMarketplace() {
        return this.effectiveMarketplace;
    }

    public String getEmail() {
        return this.email;
    }

    @NonNull
    public Set<String> getFeatures() {
        return this.features;
    }

    public String getId() {
        return this.id;
    }

    public Marketplace getMarketplace() {
        return this.marketplace;
    }

    public String getName() {
        return this.name;
    }

    public Marketplace getOriginalMarketplace() {
        return this.originalMarketplace;
    }

    @Nullable
    public List<UserProfile> getProfileList() {
        return this.profileList;
    }

    public String getToken(String str) {
        if (this.tokens.containsKey(str)) {
            return this.tokens.get(str);
        }
        return null;
    }

    @NonNull
    public Map<String, String> getTokens() {
        return this.tokens;
    }

    public UserProfile getUserProfile() {
        return this.userProfile;
    }

    public boolean hasAcceptedEula() {
        return this.eulaAccepted;
    }

    public boolean hasActiveDevices() {
        return this.hasActiveDevices;
    }

    @Deprecated
    public boolean hasFeature(String str) {
        return this.features.contains(str);
    }

    public int hashCode() {
        return Objects.hash(this.id, this.directedId, this.name, this.email, this.features, this.marketplace, this.effectiveMarketplace, this.countryOfResidence, Boolean.valueOf(this.eulaAccepted), Boolean.valueOf(this.hasActiveDevices), this.accessToken, this.userProfile, this.delegatedProfile, this.profileList, this.tokens);
    }

    @Nullable
    public JSONObject toJson() {
        try {
            JSONArray jSONArray = new JSONArray();
            List<UserProfile> list = this.profileList;
            if (list != null) {
                Iterator<UserProfile> it2 = list.iterator();
                while (it2.hasNext()) {
                    jSONArray.put(it2.next().toJson());
                }
            }
            JSONObject put = new JSONObject().put("id", this.id).put("directedId", this.directedId).put("name", this.name).put("email", this.email).put(CamerasRouteParameter.FEATURES, new JSONArray((Collection<?>) this.features));
            Marketplace marketplace = this.originalMarketplace;
            JSONObject put2 = put.put("originalMarketplace", marketplace != null ? marketplace.getMarketplaceName() : null);
            Marketplace marketplace2 = this.marketplace;
            JSONObject put3 = put2.put("marketplace", marketplace2 != null ? marketplace2.getMarketplaceName() : null).put("countryOfResidence", this.countryOfResidence);
            Marketplace marketplace3 = this.effectiveMarketplace;
            JSONObject put4 = put3.put("effectiveMarketplace", marketplace3 != null ? marketplace3.getMarketplaceName() : null).put("eulaAccepted", this.eulaAccepted).put("hasActiveDevices", this.hasActiveDevices).put("accessToken", this.accessToken);
            UserProfile userProfile = this.userProfile;
            JSONObject put5 = put4.put("userProfile", userProfile != null ? userProfile.toJson() : null);
            UserProfile userProfile2 = this.delegatedProfile;
            return put5.put("delegatedProfile", userProfile2 != null ? userProfile2.toJson() : null).put("tokens", new JSONObject((Map<?, ?>) this.tokens)).put("profileList", jSONArray);
        } catch (JSONException e) {
            e.printStackTrace();
            return null;
        }
    }

    public String toPayload() {
        JSONObject json = toJson();
        if (json != null) {
            return json.toString();
        }
        return null;
    }

    public String toString() {
        return "UserIdentity{name = '" + this.name + "', email = '" + this.email + "', id = '" + this.id + "', directedId = '" + this.directedId + "', marketplace = '" + this.marketplace + "', effectiveMarketplace = '" + this.effectiveMarketplace + "', countryOfResidence = '" + this.countryOfResidence + "', features = " + this.features + ", eulaAccepted = " + this.eulaAccepted + ", hasActiveDevices = " + this.hasActiveDevices + ", tokens = " + this.tokens + ", accessToken = " + this.accessToken + ", userProfile = " + this.userProfile + ", profileList = " + this.profileList + ", delegatedProfile = " + this.delegatedProfile + AbstractJsonLexerKt.END_OBJ;
    }

    public /* synthetic */ UserIdentity(Builder builder, int i) {
        this(builder);
    }
}
