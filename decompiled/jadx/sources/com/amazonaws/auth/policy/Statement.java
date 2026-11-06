package com.amazonaws.auth.policy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public class Statement {
    private Effect effect;
    private List<Resource> resources;
    private List<Principal> principals = new ArrayList();
    private List<Action> actions = new ArrayList();
    private List<Condition> conditions = new ArrayList();
    private String id = null;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public enum Effect {
        Allow,
        Deny
    }

    public Statement(Effect effect) {
        this.effect = effect;
    }

    public List<Action> getActions() {
        return this.actions;
    }

    public List<Condition> getConditions() {
        return this.conditions;
    }

    public Effect getEffect() {
        return this.effect;
    }

    public String getId() {
        return this.id;
    }

    public List<Principal> getPrincipals() {
        return this.principals;
    }

    public List<Resource> getResources() {
        return this.resources;
    }

    public void setActions(Collection<Action> collection) {
        this.actions = new ArrayList(collection);
    }

    public void setConditions(List<Condition> list) {
        this.conditions = list;
    }

    public void setEffect(Effect effect) {
        this.effect = effect;
    }

    public void setId(String str) {
        this.id = str;
    }

    public void setPrincipals(Principal... principalArr) {
        setPrincipals(new ArrayList(Arrays.asList(principalArr)));
    }

    public void setResources(Collection<Resource> collection) {
        this.resources = new ArrayList(collection);
    }

    public Statement withActions(Action... actionArr) {
        setActions(Arrays.asList(actionArr));
        return this;
    }

    public Statement withConditions(Condition... conditionArr) {
        setConditions(Arrays.asList(conditionArr));
        return this;
    }

    public Statement withId(String str) {
        setId(str);
        return this;
    }

    public Statement withPrincipals(Principal... principalArr) {
        setPrincipals(principalArr);
        return this;
    }

    public Statement withResources(Resource... resourceArr) {
        setResources(Arrays.asList(resourceArr));
        return this;
    }

    public void setPrincipals(Collection<Principal> collection) {
        this.principals = new ArrayList(collection);
    }
}
