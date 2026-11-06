package com.amazonaws.services.iot.model;

import com.amazonaws.AmazonWebServiceRequest;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.apache.commons.text.StringSubstitutor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class ValidateSecurityProfileBehaviorsRequest extends AmazonWebServiceRequest implements Serializable {
    private List<Behavior> behaviors;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof ValidateSecurityProfileBehaviorsRequest)) {
            return false;
        }
        ValidateSecurityProfileBehaviorsRequest validateSecurityProfileBehaviorsRequest = (ValidateSecurityProfileBehaviorsRequest) obj;
        if ((validateSecurityProfileBehaviorsRequest.getBehaviors() == null) ^ (getBehaviors() == null)) {
            return false;
        }
        return validateSecurityProfileBehaviorsRequest.getBehaviors() == null || validateSecurityProfileBehaviorsRequest.getBehaviors().equals(getBehaviors());
    }

    public List<Behavior> getBehaviors() {
        return this.behaviors;
    }

    public int hashCode() {
        return 31 + (getBehaviors() == null ? 0 : getBehaviors().hashCode());
    }

    public void setBehaviors(Collection<Behavior> collection) {
        if (collection == null) {
            this.behaviors = null;
        } else {
            this.behaviors = new ArrayList(collection);
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        if (getBehaviors() != null) {
            sb.append("behaviors: " + getBehaviors());
        }
        sb.append(StringSubstitutor.DEFAULT_VAR_END);
        return sb.toString();
    }

    public ValidateSecurityProfileBehaviorsRequest withBehaviors(Behavior... behaviorArr) {
        if (getBehaviors() == null) {
            this.behaviors = new ArrayList(behaviorArr.length);
        }
        for (Behavior behavior : behaviorArr) {
            this.behaviors.add(behavior);
        }
        return this;
    }

    public ValidateSecurityProfileBehaviorsRequest withBehaviors(Collection<Behavior> collection) {
        setBehaviors(collection);
        return this;
    }
}
