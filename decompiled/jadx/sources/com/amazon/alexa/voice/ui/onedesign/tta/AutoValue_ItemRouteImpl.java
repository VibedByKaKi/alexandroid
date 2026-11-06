package com.amazon.alexa.voice.ui.onedesign.tta;

import com.amazon.alexa.voice.ui.tta.search.ActionType;
import org.apache.commons.text.StringSubstitutor;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
final class AutoValue_ItemRouteImpl extends ItemRouteImpl {
    private final String routeLink;
    private final ActionType routeType;

    public AutoValue_ItemRouteImpl(String str, ActionType actionType) {
        if (str == null) {
            Single$$ExternalSyntheticBUOutline0.m$1("Null routeLink");
            throw null;
        }
        this.routeLink = str;
        if (actionType != null) {
            this.routeType = actionType;
        } else {
            Single$$ExternalSyntheticBUOutline0.m$1("Null routeType");
            throw null;
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ItemRouteImpl) {
            ItemRouteImpl itemRouteImpl = (ItemRouteImpl) obj;
            if (this.routeLink.equals(itemRouteImpl.getRouteLink()) && this.routeType.equals(itemRouteImpl.getRouteType())) {
                return true;
            }
        }
        return false;
    }

    @Override // com.amazon.alexa.voice.ui.onedesign.tta.ItemRouteImpl, com.amazon.alexa.voice.ui.tta.search.ItemRoute
    public String getRouteLink() {
        return this.routeLink;
    }

    @Override // com.amazon.alexa.voice.ui.onedesign.tta.ItemRouteImpl, com.amazon.alexa.voice.ui.tta.search.ItemRoute
    public ActionType getRouteType() {
        return this.routeType;
    }

    public int hashCode() {
        return this.routeType.hashCode() ^ ((this.routeLink.hashCode() ^ 1000003) * 1000003);
    }

    public String toString() {
        return "ItemRouteImpl{routeLink=" + this.routeLink + ", routeType=" + this.routeType + StringSubstitutor.DEFAULT_VAR_END;
    }
}
