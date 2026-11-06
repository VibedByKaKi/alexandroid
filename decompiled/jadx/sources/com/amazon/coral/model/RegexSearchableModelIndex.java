package com.amazon.coral.model;

import com.amazon.coral.model.Model;
import defpackage.a$$ExternalSyntheticOutline0;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.regex.Pattern;
import okio.Path$$ExternalSyntheticBUOutline0;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
class RegexSearchableModelIndex implements SearchableModelIndex {
    private ModelIndex delegateModelIndex;

    public RegexSearchableModelIndex(ModelIndex modelIndex) {
        if (modelIndex != null) {
            this.delegateModelIndex = modelIndex;
        } else {
            Single$$ExternalSyntheticBUOutline0.m$3("ModelIndex cannot be null");
            throw null;
        }
    }

    @Override // com.amazon.coral.model.ModelIndex
    public void accept(ModelVisitor modelVisitor) {
        this.delegateModelIndex.accept(modelVisitor);
    }

    @Override // com.amazon.coral.model.SearchableModelIndex
    public <T extends Model> Collection<T> findModels(String str, Class<T> cls) {
        if (str == null || cls == null) {
            Path$$ExternalSyntheticBUOutline0.m();
            return null;
        }
        Pattern compile = Pattern.compile(str);
        HashSet hashSet = new HashSet();
        for (Model.Id id : getModels(cls)) {
            if (compile.matcher(id.getName()).matches()) {
                Model model = getModel(id);
                if (cls.isInstance(model)) {
                    hashSet.add(model);
                }
            }
        }
        if (hashSet.size() != 0) {
            return Collections.unmodifiableSet(hashSet);
        }
        Single$$ExternalSyntheticBUOutline0.m$3(a$$ExternalSyntheticOutline0.m("Could not find a model for name regex '", str, "' and type '", cls.getCanonicalName(), "'"));
        return null;
    }

    @Override // com.amazon.coral.model.ModelIndex
    public Model getModel(Model.Id id) {
        return this.delegateModelIndex.getModel(id);
    }

    @Override // com.amazon.coral.model.ModelIndex
    public Iterable<Model.Id> getModels(Class<? extends Model> cls) {
        return this.delegateModelIndex.getModels(cls);
    }

    @Override // com.amazon.coral.model.ModelIndex
    public Iterable<Model.Id> getModels() {
        return this.delegateModelIndex.getModels();
    }
}
