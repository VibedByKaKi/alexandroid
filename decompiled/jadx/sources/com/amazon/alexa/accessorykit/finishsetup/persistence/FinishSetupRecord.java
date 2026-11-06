package com.amazon.alexa.accessorykit.finishsetup.persistence;

import com.amazon.alexa.accessory.internal.util.JsonObjectSerializable;
import com.amazon.alexa.accessory.internal.util.Preconditions;
import com.amazon.alexa.api.AlexaMetricsName$Pryon$$ExternalSyntheticOutline0;
import java.util.Objects;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes16.dex */
public final class FinishSetupRecord implements JsonObjectSerializable {
    private static final String IDENTIFIER_KEY = "identifier";
    private static final String IS_BLACKLISTED_BY_USER = "isBlacklistedByUser";
    private static final String LAST_TIME_VIEW_PRESENTED = "lastTimeViewPresented";
    private static final String VIEW_PRESENTED_COUNT_KEY = "viewPresentedCount";
    private String identifier;
    private boolean isBlacklistedByUser;
    private long lastTimeViewPresented;
    private int viewPresentedCount;

    public FinishSetupRecord(String str, int i, long j, boolean z) {
        Preconditions.notNull(str, "identifier");
        Preconditions.notNull(Integer.valueOf(i), VIEW_PRESENTED_COUNT_KEY);
        Preconditions.notNull(Long.valueOf(j), LAST_TIME_VIEW_PRESENTED);
        Preconditions.notNull(Boolean.valueOf(z), IS_BLACKLISTED_BY_USER);
        this.identifier = str;
        this.viewPresentedCount = i;
        this.lastTimeViewPresented = j;
        this.isBlacklistedByUser = z;
    }

    public FinishSetupRecord blacklistedByUser() {
        this.isBlacklistedByUser = true;
        return this;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && FinishSetupRecord.class == obj.getClass()) {
            FinishSetupRecord finishSetupRecord = (FinishSetupRecord) obj;
            if (this.viewPresentedCount == finishSetupRecord.viewPresentedCount && this.lastTimeViewPresented == finishSetupRecord.lastTimeViewPresented && this.isBlacklistedByUser == finishSetupRecord.isBlacklistedByUser && Objects.equals(this.identifier, finishSetupRecord.identifier)) {
                return true;
            }
        }
        return false;
    }

    public String getIdentifier() {
        return this.identifier;
    }

    public long getLastTimeViewPresented() {
        return this.lastTimeViewPresented;
    }

    public int getViewPresentedCount() {
        return this.viewPresentedCount;
    }

    public int hashCode() {
        return Objects.hash(this.identifier, Integer.valueOf(this.viewPresentedCount), Long.valueOf(this.lastTimeViewPresented), Boolean.valueOf(this.isBlacklistedByUser));
    }

    public FinishSetupRecord incrementViewPresentedCount() {
        this.viewPresentedCount++;
        return this;
    }

    public boolean isBlacklistedByUser() {
        return this.isBlacklistedByUser;
    }

    public FinishSetupRecord setLastTimeViewPresented(long j) {
        this.lastTimeViewPresented = j;
        return this;
    }

    @Override // com.amazon.alexa.accessory.internal.util.JsonObjectSerializable
    public JSONObject toJsonObject() throws JSONException {
        return new JSONObject().put("identifier", this.identifier).put(VIEW_PRESENTED_COUNT_KEY, this.viewPresentedCount).put(LAST_TIME_VIEW_PRESENTED, this.lastTimeViewPresented).put(IS_BLACKLISTED_BY_USER, this.isBlacklistedByUser);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("FinishSetupRecord: {\nidentifier: ");
        sb.append(this.identifier);
        sb.append("\nviewPresentedCount: ");
        AlexaMetricsName$Pryon$$ExternalSyntheticOutline0.m("\nlastTimeViewPresented: ", this.viewPresentedCount, sb);
        sb.append(String.valueOf(this.lastTimeViewPresented));
        sb.append("\nisBlacklistedByUser: ");
        sb.append(String.valueOf(this.isBlacklistedByUser));
        sb.append("\n}\n");
        return sb.toString();
    }

    public FinishSetupRecord(JSONObject jSONObject) throws JSONException {
        this(jSONObject.getString("identifier"), jSONObject.getInt(VIEW_PRESENTED_COUNT_KEY), jSONObject.getLong(LAST_TIME_VIEW_PRESENTED), jSONObject.getBoolean(IS_BLACKLISTED_BY_USER));
    }
}
