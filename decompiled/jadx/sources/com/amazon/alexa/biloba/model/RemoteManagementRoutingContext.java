package com.amazon.alexa.biloba.model;

import com.amazon.alexa.voice.ui.onedesign.ftue.handsfree.HandsFreeConstants;
import com.google.gson.annotations.SerializedName;
import defpackage.a$$ExternalSyntheticOutline0;
import java.util.Objects;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public class RemoteManagementRoutingContext {

    @SerializedName("errorRoute")
    private String errorRoute;

    @SerializedName("resourceOwner")
    private ResourceOwner resourceOwner;

    @SerializedName(HandsFreeConstants.SUCCESS_ROUTE)
    private String successRoute;

    public RemoteManagementRoutingContext(ResourceOwner resourceOwner, String str, String str2) {
        this.resourceOwner = resourceOwner;
        this.successRoute = str;
        this.errorRoute = str2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            RemoteManagementRoutingContext remoteManagementRoutingContext = (RemoteManagementRoutingContext) obj;
            if (this.resourceOwner.equals(remoteManagementRoutingContext.resourceOwner) && this.successRoute.equals(remoteManagementRoutingContext.successRoute) && this.errorRoute.equals(remoteManagementRoutingContext.errorRoute)) {
                return true;
            }
        }
        return false;
    }

    public String getErrorRoute() {
        return this.errorRoute;
    }

    public ResourceOwner getResourceOwner() {
        return this.resourceOwner;
    }

    public String getSuccessRoute() {
        return this.successRoute;
    }

    public int hashCode() {
        return Objects.hash(this.resourceOwner, this.successRoute, this.errorRoute);
    }

    public void setErrorRoute(String str) {
        this.errorRoute = str;
    }

    public void setResourceOwner(ResourceOwner resourceOwner) {
        this.resourceOwner = resourceOwner;
    }

    public void setSuccessRoute(String str) {
        this.successRoute = str;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("RemoteManagementRoutingContext{resourceOwner=");
        sb.append(this.resourceOwner);
        sb.append(", successRoute='");
        sb.append(this.successRoute);
        sb.append("', errorRoute='");
        return a$$ExternalSyntheticOutline0.m(sb, this.errorRoute, "'}");
    }
}
