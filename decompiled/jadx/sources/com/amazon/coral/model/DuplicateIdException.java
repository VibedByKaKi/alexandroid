package com.amazon.coral.model;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public class DuplicateIdException extends RuntimeException {
    public Model conflictingModel;
    public ModelIndex conflictingModelIndex;
    public Model newModel;
    public ModelIndex newModelIndex;

    public DuplicateIdException(String str, Model model, ModelIndex modelIndex, Model model2, ModelIndex modelIndex2) {
        super(str);
        this.newModel = model;
        this.newModelIndex = modelIndex;
        this.conflictingModel = model2;
        this.conflictingModelIndex = modelIndex2;
    }

    @Deprecated
    public DuplicateIdException(String str) {
        super(str);
    }
}
