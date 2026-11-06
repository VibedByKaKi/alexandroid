package com.amazon.coral.model;

import com.amazon.coral.model.Model;
import java.io.Serializable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public interface ModelIndex extends Serializable {
    void accept(ModelVisitor modelVisitor);

    Model getModel(Model.Id id);

    Iterable<Model.Id> getModels();

    Iterable<Model.Id> getModels(Class<? extends Model> cls);
}
