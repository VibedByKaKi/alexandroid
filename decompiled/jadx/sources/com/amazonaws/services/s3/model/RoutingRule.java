package com.amazonaws.services.s3.model;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class RoutingRule {
    RoutingRuleCondition condition;
    RedirectRule redirect;

    public RoutingRuleCondition getCondition() {
        return this.condition;
    }

    public RedirectRule getRedirect() {
        return this.redirect;
    }

    public void setCondition(RoutingRuleCondition routingRuleCondition) {
        this.condition = routingRuleCondition;
    }

    public void setRedirect(RedirectRule redirectRule) {
        this.redirect = redirectRule;
    }

    public RoutingRule withCondition(RoutingRuleCondition routingRuleCondition) {
        setCondition(routingRuleCondition);
        return this;
    }

    public RoutingRule withRedirect(RedirectRule redirectRule) {
        setRedirect(redirectRule);
        return this;
    }
}
