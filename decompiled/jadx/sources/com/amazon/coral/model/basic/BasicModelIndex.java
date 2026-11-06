package com.amazon.coral.model.basic;

import androidx.core.app.AppLaunchChecker$$ExternalSyntheticOutline0;
import com.amazon.coral.model.DuplicateIdException;
import com.amazon.coral.model.Model;
import com.amazon.coral.model.ModelIndex;
import com.amazon.coral.model.ModelVisitor;
import defpackage.a$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import okio.Path$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public class BasicModelIndex implements ModelIndex {
    private int hash;
    private final HashMap<Model.Id, Model> models = new HashMap<>();
    private int hashGen = 0;
    private int gen = 1;
    private final ConcurrentHashMap<String, Collection<Model.Id>> cache_getModels = new ConcurrentHashMap<>(16, 0.75f, 1);

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

    public void addModel(Model model) {
        this.gen++;
        Model.Id id = model.getId();
        if (this.models.containsKey(id)) {
            Model model2 = this.models.get(id);
            if (!model2.equals(model)) {
                Model.Id id2 = model2.getId();
                throw new DuplicateIdException(a$$ExternalSyntheticOutline0.m("Model conflict discovered on shape ", id2.getName(), " in assembly ", AppLaunchChecker$$ExternalSyntheticOutline0.m(1, 0, id2.getNamespace())), model, null, model2, null);
            }
        }
        this.models.put(id, model);
        this.cache_getModels.clear();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ModelIndex)) {
            return false;
        }
        ModelIndex modelIndex = (ModelIndex) obj;
        int i = 0;
        for (Model.Id id : modelIndex.getModels()) {
            Model model = getModel(id);
            if (model == null || !model.equals(modelIndex.getModel(id))) {
                return false;
            }
            i++;
        }
        return this.models.size() == i;
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
        Collection<Model.Id> collection = this.cache_getModels.get(cls.getName());
        if (collection != null) {
            return collection;
        }
        HashSet hashSet = new HashSet();
        for (Model model : this.models.values()) {
            if (cls.isInstance(model)) {
                hashSet.add(model.getId());
            }
        }
        Collection<Model.Id> unmodifiableCollection = Collections.unmodifiableCollection(new ArrayList(hashSet));
        this.cache_getModels.put(cls.getName(), unmodifiableCollection);
        return unmodifiableCollection;
    }

    public final int hashCode() {
        if (this.hashGen == this.gen) {
            return this.hash;
        }
        int hashCode = this.models.hashCode();
        this.hash = hashCode;
        this.hashGen = this.gen;
        return hashCode;
    }

    public String toString() {
        return this.models.values().toString();
    }

    @Override // com.amazon.coral.model.ModelIndex
    public Iterable<Model.Id> getModels() {
        return Collections.unmodifiableCollection(this.models.keySet());
    }
}
