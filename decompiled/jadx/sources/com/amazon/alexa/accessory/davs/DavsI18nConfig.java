package com.amazon.alexa.accessory.davs;

import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.amazon.alexa.accessory.davs.DavsI18nWakeword;
import com.amazon.alexa.accessory.internal.util.JsonObjectSerializable;
import com.amazon.alexa.accessory.internal.util.JsonUtils;
import com.amazon.alexa.accessory.internal.util.Preconditions;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes15.dex */
public final class DavsI18nConfig implements JsonObjectSerializable {
    public static final Factory FACTORY = new Factory();

    @VisibleForTesting
    static final String LOCALE_COMBINATIONS_KEY = "localeCombinations";

    @VisibleForTesting
    static final String LOCALE_KEY = "locales";

    @VisibleForTesting
    static final String WAKEWORDS_KEY = "wakeWords";
    private final List<List<String>> localeCombinations;
    private final List<String> locales;
    private final List<DavsI18nWakeword> wakeWords;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class Builder {
        List<List<String>> localeCombinations;
        List<String> locales;
        List<DavsI18nWakeword> wakeWords;

        public DavsI18nConfig build() {
            Preconditions.notNull(this.wakeWords, "wakeWords");
            Preconditions.notNull(this.locales, "locales");
            Preconditions.notNull(this.localeCombinations, "localeCombinations");
            return new DavsI18nConfig(this, 0);
        }

        public Builder localeCombinations(List<List<String>> list) {
            this.localeCombinations = list;
            return this;
        }

        public Builder locales(List<String> list) {
            this.locales = list;
            return this;
        }

        public Builder wakeWords(List<DavsI18nWakeword> list) {
            this.wakeWords = list;
            return this;
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class Factory implements JsonObjectSerializable.Factory<DavsI18nConfig> {
        private final DavsI18nWakeword.Factory davsI18nWakewordFactory = new DavsI18nWakeword.Factory();

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.amazon.alexa.accessory.internal.util.JsonObjectSerializable.Factory
        public DavsI18nConfig create(JSONObject jSONObject) throws JSONException {
            return new Builder().wakeWords(JsonUtils.fromJsonArray(jSONObject.getJSONArray("wakeWords"), this.davsI18nWakewordFactory)).locales(JsonUtils.convertJsonArrayToStringList(jSONObject.getJSONArray("locales"))).localeCombinations(JsonUtils.convertJsonArrayToListOfStringList(jSONObject.getJSONArray("localeCombinations"))).build();
        }
    }

    private DavsI18nConfig(Builder builder) {
        this.wakeWords = builder.wakeWords;
        this.locales = builder.locales;
        this.localeCombinations = builder.localeCombinations;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && DavsI18nConfig.class == obj.getClass()) {
            DavsI18nConfig davsI18nConfig = (DavsI18nConfig) obj;
            if (Objects.equals(this.wakeWords, davsI18nConfig.wakeWords) && Objects.equals(this.locales, davsI18nConfig.locales) && Objects.equals(this.localeCombinations, davsI18nConfig.localeCombinations)) {
                return true;
            }
        }
        return false;
    }

    public List<List<String>> getLocaleCombinations() {
        return this.localeCombinations;
    }

    public List<String> getLocales() {
        return this.locales;
    }

    public List<DavsI18nWakeword> getWakeWords() {
        return this.wakeWords;
    }

    public int hashCode() {
        return Objects.hash(this.wakeWords, this.locales, this.localeCombinations);
    }

    @Override // com.amazon.alexa.accessory.internal.util.JsonObjectSerializable
    public JSONObject toJsonObject() throws JSONException {
        JSONArray jSONArray = new JSONArray();
        Iterator<List<String>> it2 = this.localeCombinations.iterator();
        while (it2.hasNext()) {
            jSONArray.put(new JSONArray((Collection<?>) it2.next()));
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("locales", new JSONArray((Collection<?>) this.locales));
        jSONObject.put("localeCombinations", jSONArray);
        jSONObject.put("wakeWords", JsonUtils.toJsonArray(this.wakeWords));
        return jSONObject;
    }

    public /* synthetic */ DavsI18nConfig(Builder builder, int i) {
        this(builder);
    }
}
