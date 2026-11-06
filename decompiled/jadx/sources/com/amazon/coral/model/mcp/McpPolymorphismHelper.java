package com.amazon.coral.model.mcp;

import com.amazon.coral.google.common.math.Stats$$ExternalSyntheticLambda5;
import com.amazon.coral.model.Model;
import com.amazon.coral.model.ModelIndex;
import com.amazon.coral.model.ReferenceModel;
import com.amazon.coral.model.StructureModel;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public final class McpPolymorphismHelper {
    private final Map<Model.Id, List<StructureModel>> childrenIndex;
    private final ModelIndex modelIndex;
    private final Map<Model.Id, List<StructureModel>> subtypeCache;
    private final Map<Model.Id, Map<String, StructureModel>> subtypeNameCache;

    public McpPolymorphismHelper(ModelIndex modelIndex) {
        if (modelIndex == null) {
            Single$$ExternalSyntheticBUOutline0.m$3("modelIndex cannot be null");
            throw null;
        }
        this.modelIndex = modelIndex;
        this.childrenIndex = buildChildrenIndex();
        this.subtypeCache = buildSubtypeCache();
        this.subtypeNameCache = buildSubtypeNameCache();
    }

    private Map<Model.Id, List<StructureModel>> buildChildrenIndex() {
        StructureModel structureModel;
        Model.Id parent;
        HashMap hashMap = new HashMap();
        Iterator<Model.Id> it2 = this.modelIndex.getModels(StructureModel.class).iterator();
        while (it2.hasNext()) {
            Model model = this.modelIndex.getModel(it2.next());
            if ((model instanceof StructureModel) && (parent = (structureModel = (StructureModel) model).getParent()) != null && parent != Model.Id.NONE) {
                ((List) hashMap.computeIfAbsent(parent, new Stats$$ExternalSyntheticLambda5(4))).add(structureModel);
            }
        }
        for (Map.Entry entry : hashMap.entrySet()) {
            entry.setValue(Collections.unmodifiableList((List) entry.getValue()));
        }
        return Collections.unmodifiableMap(hashMap);
    }

    private Map<Model.Id, List<StructureModel>> buildSubtypeCache() {
        HashMap hashMap = new HashMap();
        for (Model.Id id : this.modelIndex.getModels(StructureModel.class)) {
            Model model = this.modelIndex.getModel(id);
            if (model instanceof StructureModel) {
                StructureModel structureModel = (StructureModel) model;
                ArrayList arrayList = new ArrayList();
                if (structureModel.isConcrete()) {
                    arrayList.add(structureModel);
                }
                collectConcreteDescendants(id, arrayList, this.childrenIndex);
                hashMap.put(id, Collections.unmodifiableList(arrayList));
            }
        }
        return Collections.unmodifiableMap(hashMap);
    }

    private Map<Model.Id, Map<String, StructureModel>> buildSubtypeNameCache() {
        HashMap hashMap = new HashMap();
        for (Map.Entry<Model.Id, List<StructureModel>> entry : this.subtypeCache.entrySet()) {
            List<StructureModel> value = entry.getValue();
            if (!value.isEmpty()) {
                HashMap hashMap2 = new HashMap(value.size());
                for (StructureModel structureModel : value) {
                    hashMap2.put(structureModel.getId().getName(), structureModel);
                }
                hashMap.put(entry.getKey(), Collections.unmodifiableMap(hashMap2));
            }
        }
        return Collections.unmodifiableMap(hashMap);
    }

    private void collectConcreteDescendants(Model.Id id, List<StructureModel> list, Map<Model.Id, List<StructureModel>> map) {
        List<StructureModel> list2 = map.get(id);
        if (list2 == null) {
            return;
        }
        for (StructureModel structureModel : list2) {
            if (structureModel.isConcrete()) {
                list.add(structureModel);
            }
            collectConcreteDescendants(structureModel.getId(), list, map);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ List lambda$buildChildrenIndex$0(Model.Id id) {
        return new ArrayList();
    }

    public StructureModel findSubtypeByName(Model model, String str) {
        Model.Id id;
        Map<String, StructureModel> map;
        if (model != null && str != null && !str.isEmpty()) {
            Model resolveModel = resolveModel(model);
            if ((resolveModel instanceof StructureModel) && (id = resolveModel.getId()) != null && id != Model.Id.NONE && (map = this.subtypeNameCache.get(id)) != null) {
                return map.get(str);
            }
        }
        return null;
    }

    public List<StructureModel> getConcreteSubtypes(Model model) {
        if (model == null) {
            return Collections.EMPTY_LIST;
        }
        Model resolveModel = resolveModel(model);
        if (!(resolveModel instanceof StructureModel)) {
            return Collections.EMPTY_LIST;
        }
        Model.Id id = resolveModel.getId();
        if (id == null || id == Model.Id.NONE) {
            return Collections.EMPTY_LIST;
        }
        List<StructureModel> list = this.subtypeCache.get(id);
        return list != null ? list : Collections.EMPTY_LIST;
    }

    public boolean isPolymorphicType(Model model) {
        if (model == null) {
            return false;
        }
        Model resolveModel = resolveModel(model);
        if (!(resolveModel instanceof StructureModel)) {
            return false;
        }
        List<StructureModel> concreteSubtypes = getConcreteSubtypes(resolveModel);
        Model.Id id = resolveModel.getId();
        if (concreteSubtypes.size() > 1) {
            return true;
        }
        return (concreteSubtypes.isEmpty() || concreteSubtypes.get(0).getId().equals(id)) ? false : true;
    }

    public Model resolveModel(Model model) {
        Model.Id target;
        return (!(model instanceof ReferenceModel) || (target = ((ReferenceModel) model).getTarget()) == null || target == Model.Id.NONE) ? model : this.modelIndex.getModel(target);
    }
}
