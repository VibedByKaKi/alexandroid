package com.amazon.clouddrive.extended.model;

import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class EventParent {
    private String id;
    private String kind;
    private GroupCollection parentCollection;
    private Reaction parentReaction;

    public boolean canEqual(Object obj) {
        return obj instanceof EventParent;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof EventParent)) {
            return false;
        }
        EventParent eventParent = (EventParent) obj;
        if (!eventParent.canEqual(this)) {
            return false;
        }
        String id = getId();
        String id2 = eventParent.getId();
        if (id != null ? !id.equals(id2) : id2 != null) {
            return false;
        }
        String kind = getKind();
        String kind2 = eventParent.getKind();
        if (kind != null ? !kind.equals(kind2) : kind2 != null) {
            return false;
        }
        Reaction parentReaction = getParentReaction();
        Reaction parentReaction2 = eventParent.getParentReaction();
        if (parentReaction != null ? !parentReaction.equals(parentReaction2) : parentReaction2 != null) {
            return false;
        }
        GroupCollection parentCollection = getParentCollection();
        GroupCollection parentCollection2 = eventParent.getParentCollection();
        return parentCollection != null ? parentCollection.equals(parentCollection2) : parentCollection2 == null;
    }

    public String getId() {
        return this.id;
    }

    public String getKind() {
        return this.kind;
    }

    public GroupCollection getParentCollection() {
        return this.parentCollection;
    }

    public Reaction getParentReaction() {
        return this.parentReaction;
    }

    public int hashCode() {
        String id = getId();
        int hashCode = id == null ? 43 : id.hashCode();
        String kind = getKind();
        int hashCode2 = ((hashCode + 59) * 59) + (kind == null ? 43 : kind.hashCode());
        Reaction parentReaction = getParentReaction();
        int i = hashCode2 * 59;
        int hashCode3 = parentReaction == null ? 43 : parentReaction.hashCode();
        GroupCollection parentCollection = getParentCollection();
        return ((i + hashCode3) * 59) + (parentCollection != null ? parentCollection.hashCode() : 43);
    }

    public void setId(String str) {
        this.id = str;
    }

    public void setKind(String str) {
        this.kind = str;
    }

    public void setParentCollection(GroupCollection groupCollection) {
        this.parentCollection = groupCollection;
    }

    public void setParentReaction(Reaction reaction) {
        this.parentReaction = reaction;
    }

    public String toString() {
        return "EventParent(id=" + getId() + ", kind=" + getKind() + ", parentReaction=" + getParentReaction() + ", parentCollection=" + getParentCollection() + MarkdownConstants.RIGHT_PARENTHESIS;
    }
}
