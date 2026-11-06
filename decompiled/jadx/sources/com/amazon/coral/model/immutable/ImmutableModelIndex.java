package com.amazon.coral.model.immutable;

import com.amazon.coral.model.Model;
import com.amazon.coral.model.ModelIndex;
import com.amazon.coral.model.ModelVisitor;
import com.amazon.coral.model.StructureModel;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import okio.Path$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public class ImmutableModelIndex implements ModelIndex {
    private final int hashCode;
    private final HashMap<Model.Id, Model> models = new HashMap<>();
    private final HashMap<Model.Id, Set<Model>> ancestry = new HashMap<>();

    public ImmutableModelIndex(ModelIndex modelIndex) {
        ImmutableModelGenerator immutableModelGenerator = new ImmutableModelGenerator();
        modelIndex.accept(immutableModelGenerator);
        Iterator<ImmutableModel> it2 = immutableModelGenerator.getModels().iterator();
        while (it2.hasNext()) {
            addModel(it2.next());
        }
        this.hashCode = this.models.hashCode();
    }

    private void addModel(Model model) {
        Model.Id id = model.getId();
        this.models.put(id, model);
        if (model instanceof StructureModel) {
            while (!Model.Id.NONE.equals(id)) {
                Set<Model> set = this.ancestry.get(id);
                if (set == null) {
                    set = new HashSet<>();
                    this.ancestry.put(id, set);
                }
                if (set.contains(model)) {
                    return;
                }
                set.add(model);
                StructureModel structureModel = (StructureModel) getModel(id);
                if (structureModel != null) {
                    id = structureModel.getParent();
                }
            }
        }
    }

    @Override // com.amazon.coral.model.ModelIndex
    public void accept(ModelVisitor modelVisitor) {
        if (modelVisitor == null) {
            Path$$ExternalSyntheticBUOutline0.m();
            return;
        }
        modelVisitor.onBegin(this);
        Iterator<Model> it2 = this.models.values().iterator();
        while (it2.hasNext()) {
            it2.next().accept(modelVisitor);
        }
        modelVisitor.onEnd(this);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ImmutableModelIndex) {
            return this.models.equals(((ImmutableModelIndex) obj).models);
        }
        return false;
    }

    public Set<Model> getCompatibleModels(Model.Id id) {
        Set<Model> set = this.ancestry.get(id);
        return set == null ? Collections.EMPTY_SET : set;
    }

    @Override // com.amazon.coral.model.ModelIndex
    public Model getModel(Model.Id id) {
        return this.models.get(id);
    }

    @Override // com.amazon.coral.model.ModelIndex
    public Iterable<Model.Id> getModels(Class<? extends Model> cls) {
        if (cls == null) {
            Path$$ExternalSyntheticBUOutline0.m();
            return null;
        }
        HashSet hashSet = new HashSet();
        for (Model model : this.models.values()) {
            if (cls.isInstance(model)) {
                hashSet.add(model.getId());
            }
        }
        return hashSet;
    }

    public final int hashCode() {
        return this.hashCode;
    }

    public String toString() {
        return this.models.values().toString();
    }

    @Override // com.amazon.coral.model.ModelIndex
    public Iterable<Model.Id> getModels() {
        return Collections.unmodifiableCollection(this.models.keySet());
    }
}
