package com.amazon.coral.model;

import com.amazon.coral.model.Model;
import java.io.Serializable;
import okio.Buffer$$ExternalSyntheticBUOutline0;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public abstract class AbstractTraits implements Traits, Cloneable, Serializable {
    private final String namespace;
    private final String source;
    private final Model.Id target;
    private final Class<? extends Traits> type;

    public AbstractTraits(Class<? extends Traits> cls, Model.Id id, String str, String str2) {
        if (cls == null) {
            Single$$ExternalSyntheticBUOutline0.m$3("type cannot be null");
            throw null;
        }
        this.type = cls;
        this.target = (Model.Id) nullToDefault(id, Model.Id.NONE);
        this.namespace = nullToEmpty(str);
        this.source = (String) nullToDefault(str2, "N/A");
    }

    @Override // com.amazon.coral.model.Traits
    public void accept(TraitsVisitor traitsVisitor) {
        traitsVisitor.visit(this);
    }

    /* renamed from: clone, reason: merged with bridge method [inline-methods] */
    public AbstractTraits m21207clone() {
        try {
            return (AbstractTraits) super.clone();
        } catch (CloneNotSupportedException e) {
            Buffer$$ExternalSyntheticBUOutline0.m((Throwable) e);
            return null;
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractTraits)) {
            return false;
        }
        AbstractTraits abstractTraits = (AbstractTraits) obj;
        return getTarget().equals(abstractTraits.getTarget()) && getTraitsType().equals(abstractTraits.getTraitsType());
    }

    @Override // com.amazon.coral.model.Traits
    public String getNamespace() {
        return this.namespace;
    }

    @Override // com.amazon.coral.model.Traits
    public String getSource() {
        return this.source;
    }

    @Override // com.amazon.coral.model.Traits
    public Model.Id getTarget() {
        return this.target;
    }

    @Override // com.amazon.coral.model.Traits
    public Class<? extends Traits> getTraitsType() {
        return this.type;
    }

    public int hashCode() {
        return this.type.hashCode() + getTarget().hashCode();
    }

    public <T> T nullToDefault(T t, T t2) {
        return t == null ? t2 : t;
    }

    public String nullToEmpty(String str) {
        return (String) nullToDefault(str, "");
    }
}
