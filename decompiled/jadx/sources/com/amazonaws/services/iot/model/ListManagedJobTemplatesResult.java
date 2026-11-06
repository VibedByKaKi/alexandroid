package com.amazonaws.services.iot.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.apache.commons.text.StringSubstitutor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class ListManagedJobTemplatesResult implements Serializable {
    private List<ManagedJobTemplateSummary> managedJobTemplates;
    private String nextToken;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof ListManagedJobTemplatesResult)) {
            return false;
        }
        ListManagedJobTemplatesResult listManagedJobTemplatesResult = (ListManagedJobTemplatesResult) obj;
        if ((listManagedJobTemplatesResult.getManagedJobTemplates() == null) ^ (getManagedJobTemplates() == null)) {
            return false;
        }
        if (listManagedJobTemplatesResult.getManagedJobTemplates() != null && !listManagedJobTemplatesResult.getManagedJobTemplates().equals(getManagedJobTemplates())) {
            return false;
        }
        if ((listManagedJobTemplatesResult.getNextToken() == null) ^ (getNextToken() == null)) {
            return false;
        }
        return listManagedJobTemplatesResult.getNextToken() == null || listManagedJobTemplatesResult.getNextToken().equals(getNextToken());
    }

    public List<ManagedJobTemplateSummary> getManagedJobTemplates() {
        return this.managedJobTemplates;
    }

    public String getNextToken() {
        return this.nextToken;
    }

    public int hashCode() {
        return (((getManagedJobTemplates() == null ? 0 : getManagedJobTemplates().hashCode()) + 31) * 31) + (getNextToken() != null ? getNextToken().hashCode() : 0);
    }

    public void setManagedJobTemplates(Collection<ManagedJobTemplateSummary> collection) {
        if (collection == null) {
            this.managedJobTemplates = null;
        } else {
            this.managedJobTemplates = new ArrayList(collection);
        }
    }

    public void setNextToken(String str) {
        this.nextToken = str;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        if (getManagedJobTemplates() != null) {
            sb.append("managedJobTemplates: " + getManagedJobTemplates() + ",");
        }
        if (getNextToken() != null) {
            sb.append("nextToken: " + getNextToken());
        }
        sb.append(StringSubstitutor.DEFAULT_VAR_END);
        return sb.toString();
    }

    public ListManagedJobTemplatesResult withManagedJobTemplates(ManagedJobTemplateSummary... managedJobTemplateSummaryArr) {
        if (getManagedJobTemplates() == null) {
            this.managedJobTemplates = new ArrayList(managedJobTemplateSummaryArr.length);
        }
        for (ManagedJobTemplateSummary managedJobTemplateSummary : managedJobTemplateSummaryArr) {
            this.managedJobTemplates.add(managedJobTemplateSummary);
        }
        return this;
    }

    public ListManagedJobTemplatesResult withNextToken(String str) {
        this.nextToken = str;
        return this;
    }

    public ListManagedJobTemplatesResult withManagedJobTemplates(Collection<ManagedJobTemplateSummary> collection) {
        setManagedJobTemplates(collection);
        return this;
    }
}
