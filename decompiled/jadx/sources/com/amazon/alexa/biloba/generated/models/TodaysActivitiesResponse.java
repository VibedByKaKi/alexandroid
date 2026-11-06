package com.amazon.alexa.biloba.generated.models;

import com.google.gson.annotations.SerializedName;
import defpackage.a$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public class TodaysActivitiesResponse {

    @SerializedName("activities")
    private List<Activity> activities = new ArrayList();

    @SerializedName("messages")
    private Map<String, Message> messages = null;

    private String toIndentedString(Object obj) {
        return obj == null ? "null" : obj.toString().replace("\n", "\n    ");
    }

    public TodaysActivitiesResponse activities(List<Activity> list) {
        this.activities = list;
        return this;
    }

    public TodaysActivitiesResponse addActivitiesItem(Activity activity) {
        this.activities.add(activity);
        return this;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            TodaysActivitiesResponse todaysActivitiesResponse = (TodaysActivitiesResponse) obj;
            if (Objects.equals(this.activities, todaysActivitiesResponse.activities) && Objects.equals(this.messages, todaysActivitiesResponse.messages)) {
                return true;
            }
        }
        return false;
    }

    public List<Activity> getActivities() {
        return this.activities;
    }

    public Map<String, Message> getMessages() {
        return this.messages;
    }

    public int hashCode() {
        return Objects.hash(this.activities, this.messages);
    }

    public TodaysActivitiesResponse messages(Map<String, Message> map) {
        this.messages = map;
        return this;
    }

    public TodaysActivitiesResponse putMessagesItem(String str, Message message) {
        if (this.messages == null) {
            this.messages = new HashMap();
        }
        this.messages.put(str, message);
        return this;
    }

    public void setActivities(List<Activity> list) {
        this.activities = list;
    }

    public void setMessages(Map<String, Message> map) {
        this.messages = map;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("class TodaysActivitiesResponse {\n    activities: ");
        sb.append(toIndentedString(this.activities));
        sb.append("\n    messages: ");
        return a$$ExternalSyntheticOutline0.m(sb, toIndentedString(this.messages), "\n}");
    }
}
