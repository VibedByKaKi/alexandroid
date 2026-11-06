package com.amazonaws.services.cognitoidentityprovider.model;

import java.io.Serializable;
import org.apache.commons.text.StringSubstitutor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class UpdateResourceServerResult implements Serializable {
    private ResourceServerType resourceServer;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof UpdateResourceServerResult)) {
            return false;
        }
        UpdateResourceServerResult updateResourceServerResult = (UpdateResourceServerResult) obj;
        if ((updateResourceServerResult.getResourceServer() == null) ^ (getResourceServer() == null)) {
            return false;
        }
        return updateResourceServerResult.getResourceServer() == null || updateResourceServerResult.getResourceServer().equals(getResourceServer());
    }

    public ResourceServerType getResourceServer() {
        return this.resourceServer;
    }

    public int hashCode() {
        return 31 + (getResourceServer() == null ? 0 : getResourceServer().hashCode());
    }

    public void setResourceServer(ResourceServerType resourceServerType) {
        this.resourceServer = resourceServerType;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        if (getResourceServer() != null) {
            sb.append("ResourceServer: " + getResourceServer());
        }
        sb.append(StringSubstitutor.DEFAULT_VAR_END);
        return sb.toString();
    }

    public UpdateResourceServerResult withResourceServer(ResourceServerType resourceServerType) {
        this.resourceServer = resourceServerType;
        return this;
    }
}
