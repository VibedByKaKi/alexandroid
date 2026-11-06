package com.amazonaws.services.iot.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.apache.commons.text.StringSubstitutor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class ListThingsResult implements Serializable {
    private String nextToken;
    private List<ThingAttribute> things;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof ListThingsResult)) {
            return false;
        }
        ListThingsResult listThingsResult = (ListThingsResult) obj;
        if ((listThingsResult.getThings() == null) ^ (getThings() == null)) {
            return false;
        }
        if (listThingsResult.getThings() != null && !listThingsResult.getThings().equals(getThings())) {
            return false;
        }
        if ((listThingsResult.getNextToken() == null) ^ (getNextToken() == null)) {
            return false;
        }
        return listThingsResult.getNextToken() == null || listThingsResult.getNextToken().equals(getNextToken());
    }

    public String getNextToken() {
        return this.nextToken;
    }

    public List<ThingAttribute> getThings() {
        return this.things;
    }

    public int hashCode() {
        return (((getThings() == null ? 0 : getThings().hashCode()) + 31) * 31) + (getNextToken() != null ? getNextToken().hashCode() : 0);
    }

    public void setNextToken(String str) {
        this.nextToken = str;
    }

    public void setThings(Collection<ThingAttribute> collection) {
        if (collection == null) {
            this.things = null;
        } else {
            this.things = new ArrayList(collection);
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        if (getThings() != null) {
            sb.append("things: " + getThings() + ",");
        }
        if (getNextToken() != null) {
            sb.append("nextToken: " + getNextToken());
        }
        sb.append(StringSubstitutor.DEFAULT_VAR_END);
        return sb.toString();
    }

    public ListThingsResult withNextToken(String str) {
        this.nextToken = str;
        return this;
    }

    public ListThingsResult withThings(ThingAttribute... thingAttributeArr) {
        if (getThings() == null) {
            this.things = new ArrayList(thingAttributeArr.length);
        }
        for (ThingAttribute thingAttribute : thingAttributeArr) {
            this.things.add(thingAttribute);
        }
        return this;
    }

    public ListThingsResult withThings(Collection<ThingAttribute> collection) {
        setThings(collection);
        return this;
    }
}
