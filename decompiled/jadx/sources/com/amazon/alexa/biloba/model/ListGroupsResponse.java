package com.amazon.alexa.biloba.model;

import com.amazon.alexa.mobilytics.event.metadata.EventMetadataType;
import com.google.gson.annotations.SerializedName;
import defpackage.a$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public class ListGroupsResponse {

    @SerializedName("id")
    private String id = null;

    @SerializedName("status")
    private String status = null;

    @SerializedName(EventMetadataType.SUBSCRIPTION)
    private Subscription subscription = null;

    @SerializedName("currentActor")
    private CareActor currentActor = null;

    @SerializedName("careGivers")
    private List<CareActor> careGivers = null;

    @SerializedName("careRecipients")
    private List<CareActor> careRecipients = null;

    @SerializedName("careRecipient")
    private CareActor careRecipient = null;

    private String toIndentedString(Object obj) {
        return obj == null ? "null" : obj.toString().replace("\n", "\n    ");
    }

    public ListGroupsResponse addCareGiversItem(CareActor careActor) {
        if (this.careGivers == null) {
            this.careGivers = new ArrayList();
        }
        this.careGivers.add(careActor);
        return this;
    }

    public ListGroupsResponse addCareRecipientsItem(CareActor careActor) {
        if (this.careRecipients == null) {
            this.careRecipients = new ArrayList();
        }
        this.careRecipients.add(careActor);
        return this;
    }

    public ListGroupsResponse careGivers(List<CareActor> list) {
        this.careGivers = list;
        return this;
    }

    public ListGroupsResponse careRecipient(CareActor careActor) {
        this.careRecipient = careActor;
        return this;
    }

    public ListGroupsResponse careRecipients(List<CareActor> list) {
        this.careRecipients = list;
        return this;
    }

    public ListGroupsResponse currentActor(CareActor careActor) {
        this.currentActor = careActor;
        return this;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            ListGroupsResponse listGroupsResponse = (ListGroupsResponse) obj;
            if (Objects.equals(this.id, listGroupsResponse.id) && Objects.equals(this.status, listGroupsResponse.status) && Objects.equals(this.subscription, listGroupsResponse.subscription) && Objects.equals(this.currentActor, listGroupsResponse.currentActor) && Objects.equals(this.careGivers, listGroupsResponse.careGivers) && Objects.equals(this.careRecipients, listGroupsResponse.careRecipients) && Objects.equals(this.careRecipient, listGroupsResponse.careRecipient)) {
                return true;
            }
        }
        return false;
    }

    public List<CareActor> getCareGivers() {
        return this.careGivers;
    }

    public CareActor getCareRecipient() {
        return this.careRecipient;
    }

    public List<CareActor> getCareRecipients() {
        return this.careRecipients;
    }

    public CareActor getCurrentActor() {
        return this.currentActor;
    }

    public String getId() {
        return this.id;
    }

    public String getStatus() {
        return this.status;
    }

    public Subscription getSubscription() {
        return this.subscription;
    }

    public int hashCode() {
        return Objects.hash(this.currentActor, this.careGivers, this.careRecipients, this.careRecipient);
    }

    public void setCareGivers(List<CareActor> list) {
        this.careGivers = list;
    }

    public void setCareRecipient(CareActor careActor) {
        this.careRecipient = careActor;
    }

    public void setCareRecipients(List<CareActor> list) {
        this.careRecipients = list;
    }

    public void setCurrentActor(CareActor careActor) {
        this.currentActor = careActor;
    }

    public void setId(String str) {
        this.id = str;
    }

    public void setStatus(String str) {
        this.status = str;
    }

    public void setSubscription(Subscription subscription) {
        this.subscription = subscription;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("class ListGroupsResponse {\n    id: ");
        sb.append(toIndentedString(this.id));
        sb.append("\n    status: ");
        sb.append(toIndentedString(this.status));
        sb.append("\n    subscription: ");
        sb.append(toIndentedString(this.subscription));
        sb.append("\n    currentActor: ");
        sb.append(toIndentedString(this.currentActor));
        sb.append("\n    careGivers: ");
        sb.append(toIndentedString(this.careGivers));
        sb.append("\n    careRecipients: ");
        sb.append(toIndentedString(this.careRecipients));
        sb.append("\n    careRecipient: ");
        return a$$ExternalSyntheticOutline0.m(sb, toIndentedString(this.careRecipient), "\n}");
    }
}
