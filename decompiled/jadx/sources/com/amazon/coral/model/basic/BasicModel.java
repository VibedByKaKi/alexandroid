package com.amazon.coral.model.basic;

import com.amazon.coral.model.Model;
import com.amazon.coral.model.Traits;
import com.amazon.coral.model.TraitsVisitor;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import okio.Path$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public abstract class BasicModel implements Model {
    private int hashCode;
    private int hashGen;
    private final Class<? extends Model> type;
    private final HashMap<Class<? extends Traits>, Traits> traits = new HashMap<>();
    private Model.Id id = Model.Id.NONE;
    private int gen = 1;

    public BasicModel(Class<? extends Model> cls) {
        if (cls != null) {
            this.type = cls;
        } else {
            Path$$ExternalSyntheticBUOutline0.m();
            throw null;
        }
    }

    @Override // com.amazon.coral.model.Model
    public void accept(TraitsVisitor traitsVisitor) {
        if (traitsVisitor == null) {
            Path$$ExternalSyntheticBUOutline0.m();
            return;
        }
        Iterator<Traits> it2 = this.traits.values().iterator();
        while (it2.hasNext()) {
            it2.next().accept(traitsVisitor);
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BasicModel)) {
            return false;
        }
        BasicModel basicModel = (BasicModel) obj;
        if (getId().equals(basicModel.getId()) && getModelType().equals(basicModel.getModelType())) {
            return TraitsHelper.compareTraits(this.traits, basicModel.traits);
        }
        return false;
    }

    public int generateHash() {
        return Objects.hash(getId(), getModelType());
    }

    @Override // com.amazon.coral.model.Model
    public Map<Class<? extends Traits>, Traits> getAllTraits() {
        return Collections.unmodifiableMap(this.traits);
    }

    @Override // com.amazon.coral.model.Model
    public Model.Id getId() {
        return this.id;
    }

    @Override // com.amazon.coral.model.Model
    public Class<? extends Model> getModelType() {
        return this.type;
    }

    @Override // com.amazon.coral.model.Model
    public <TRAITS extends Traits> TRAITS getTraits(Class<TRAITS> cls) {
        if (cls != null) {
            return (TRAITS) this.traits.get(cls);
        }
        Path$$ExternalSyntheticBUOutline0.m();
        return null;
    }

    public final int hashCode() {
        if (this.hashGen == this.gen) {
            return this.hashCode;
        }
        int generateHash = generateHash();
        this.hashCode = generateHash;
        this.hashGen = this.gen;
        return generateHash;
    }

    public void setId(Model.Id id) {
        if (id == null) {
            Path$$ExternalSyntheticBUOutline0.m();
        } else {
            this.gen++;
            this.id = id;
        }
    }

    public <TRAITS extends Traits> TRAITS setTraits(TRAITS traits) {
        if (traits == null) {
            Path$$ExternalSyntheticBUOutline0.m();
            return null;
        }
        this.gen++;
        return (TRAITS) this.traits.put(traits.getTraitsType(), traits);
    }

    public String toString() {
        return getModelType().getSimpleName() + " " + getId();
    }
}
