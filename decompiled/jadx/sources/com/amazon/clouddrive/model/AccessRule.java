package com.amazon.clouddrive.model;

import java.util.Set;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public final class AccessRule {
    private final Set<NodeAction> allowedNodeActions;
    private final String ruleId;

    public AccessRule(String str, Set<NodeAction> set) {
        this.ruleId = str;
        this.allowedNodeActions = set;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && AccessRule.class == obj.getClass()) {
            AccessRule accessRule = (AccessRule) obj;
            if (getRuleId().equals(accessRule.getRuleId()) && getAllowedNodeActions().equals(accessRule.getAllowedNodeActions())) {
                return true;
            }
        }
        return false;
    }

    public final Set<NodeAction> getAllowedNodeActions() {
        return this.allowedNodeActions;
    }

    public final String getRuleId() {
        return this.ruleId;
    }

    public int hashCode() {
        return getAllowedNodeActions().hashCode() + (getRuleId().hashCode() * 31);
    }

    public String toString() {
        return "AccessRule{ruleId=" + this.ruleId + ", allowedNodeActions=" + this.allowedNodeActions + AbstractJsonLexerKt.END_OBJ;
    }
}
