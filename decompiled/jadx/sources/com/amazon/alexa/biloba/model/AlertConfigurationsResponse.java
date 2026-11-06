package com.amazon.alexa.biloba.model;

import com.amazon.alexa.biloba.generated.models.PaginationContext;
import com.google.gson.annotations.SerializedName;
import defpackage.a$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public class AlertConfigurationsResponse {

    @SerializedName("maxAllowedCustomAlertCapacity")
    private int maxAllowedCustomAlertCapacity;

    @SerializedName("alertConfigurations")
    private List<AlertConfiguration> alertConfigurations = null;

    @SerializedName("paginationContext")
    private PaginationContext paginationContext = null;

    private String toIndentedString(Object obj) {
        return obj == null ? "null" : obj.toString().replace("\n", "\n    ");
    }

    public AlertConfigurationsResponse addAlertConfigurationsItem(AlertConfiguration alertConfiguration) {
        if (this.alertConfigurations == null) {
            this.alertConfigurations = new ArrayList();
        }
        this.alertConfigurations.add(alertConfiguration);
        return this;
    }

    public AlertConfigurationsResponse alertConfigurations(List<AlertConfiguration> list) {
        this.alertConfigurations = list;
        return this;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            AlertConfigurationsResponse alertConfigurationsResponse = (AlertConfigurationsResponse) obj;
            if (Objects.equals(this.alertConfigurations, alertConfigurationsResponse.alertConfigurations) && Objects.equals(this.paginationContext, alertConfigurationsResponse.paginationContext) && Integer.valueOf(this.maxAllowedCustomAlertCapacity).equals(Integer.valueOf(alertConfigurationsResponse.maxAllowedCustomAlertCapacity))) {
                return true;
            }
        }
        return false;
    }

    public List<AlertConfiguration> getAlertConfigurations() {
        return this.alertConfigurations;
    }

    public int getMaxAllowedCustomAlertCapacity() {
        return this.maxAllowedCustomAlertCapacity;
    }

    public PaginationContext getPaginationContext() {
        return this.paginationContext;
    }

    public int hashCode() {
        return Objects.hash(this.alertConfigurations, this.paginationContext, Integer.valueOf(this.maxAllowedCustomAlertCapacity));
    }

    public AlertConfigurationsResponse maxAllowedCustomAlertCapacity(int i) {
        this.maxAllowedCustomAlertCapacity = i;
        return this;
    }

    public AlertConfigurationsResponse paginationContext(PaginationContext paginationContext) {
        this.paginationContext = paginationContext;
        return this;
    }

    public void setAlertConfigurations(List<AlertConfiguration> list) {
        this.alertConfigurations = list;
    }

    public void setMaxAllowedCustomAlertCapacity(int i) {
        this.maxAllowedCustomAlertCapacity = i;
    }

    public void setPaginationContext(PaginationContext paginationContext) {
        this.paginationContext = paginationContext;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("class AlertConfigurationsResponse {\n    alertConfigurations: ");
        sb.append(toIndentedString(this.alertConfigurations));
        sb.append("\n    paginationContext: ");
        sb.append(toIndentedString(this.paginationContext));
        sb.append("\n    maxAllowedCustomAlertCapacity");
        return a$$ExternalSyntheticOutline0.m(sb, toIndentedString(Integer.valueOf(this.maxAllowedCustomAlertCapacity)), "\n}");
    }
}
