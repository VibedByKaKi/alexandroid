package com.amazon.alexa.biloba.model.cardV2.actions;

import com.amazon.alexa.biloba.interfaces.Validator;
import com.google.gson.annotations.SerializedName;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public class RouteWithArgsAction extends ActionV2 implements Validator {

    @SerializedName("route")
    private String route = null;

    @SerializedName("actionArguments")
    private Map<String, String> actionArguments = new HashMap();

    public RouteWithArgsAction actionArguments(Map<String, String> map) {
        this.actionArguments = map;
        return this;
    }

    @Override // com.amazon.alexa.biloba.model.cardV2.actions.ActionV2
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            RouteWithArgsAction routeWithArgsAction = (RouteWithArgsAction) obj;
            if (super.equals(obj) && Objects.equals(this.route, routeWithArgsAction.route) && Objects.equals(this.actionArguments, routeWithArgsAction.actionArguments)) {
                return true;
            }
        }
        return false;
    }

    public Map<String, String> getActionArguments() {
        return this.actionArguments;
    }

    public String getRoute() {
        return this.route;
    }

    @Override // com.amazon.alexa.biloba.model.cardV2.actions.ActionV2
    public int hashCode() {
        return Objects.hash(Integer.valueOf(super.hashCode()), this.route, this.actionArguments);
    }

    @Override // com.amazon.alexa.biloba.model.cardV2.actions.ActionV2, com.amazon.alexa.biloba.interfaces.Validator
    public boolean isValid() {
        return super.isValid() && this.route != null;
    }

    public RouteWithArgsAction route(String str) {
        this.route = str;
        return this;
    }

    public void setActionArguments(Map<String, String> map) {
        this.actionArguments = map;
    }

    public void setRoute(String str) {
        this.route = str;
    }

    @Override // com.amazon.alexa.biloba.model.cardV2.actions.ActionV2
    public String toString() {
        return super.toString().concat("     route: " + toIndentedString(this.route) + "\n     actionArguments: " + toIndentedString(this.actionArguments) + "\n}");
    }
}
