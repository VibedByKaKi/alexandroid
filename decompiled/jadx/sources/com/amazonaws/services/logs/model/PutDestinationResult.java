package com.amazonaws.services.logs.model;

import java.io.Serializable;
import org.apache.commons.text.StringSubstitutor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class PutDestinationResult implements Serializable {
    private Destination destination;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof PutDestinationResult)) {
            return false;
        }
        PutDestinationResult putDestinationResult = (PutDestinationResult) obj;
        if ((putDestinationResult.getDestination() == null) ^ (getDestination() == null)) {
            return false;
        }
        return putDestinationResult.getDestination() == null || putDestinationResult.getDestination().equals(getDestination());
    }

    public Destination getDestination() {
        return this.destination;
    }

    public int hashCode() {
        return 31 + (getDestination() == null ? 0 : getDestination().hashCode());
    }

    public void setDestination(Destination destination) {
        this.destination = destination;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        if (getDestination() != null) {
            sb.append("destination: " + getDestination());
        }
        sb.append(StringSubstitutor.DEFAULT_VAR_END);
        return sb.toString();
    }

    public PutDestinationResult withDestination(Destination destination) {
        this.destination = destination;
        return this;
    }
}
