package com.amazon.coral.model.basic;

import com.amazon.coral.model.EnvelopeModel;
import com.amazon.coral.model.ModelVisitor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public class BasicEnvelopeModel extends BasicModel implements EnvelopeModel {
    public BasicEnvelopeModel() {
        super(EnvelopeModel.class);
    }

    @Override // com.amazon.coral.model.Model
    public void accept(ModelVisitor modelVisitor) {
        modelVisitor.onEnvelopeModel(this);
    }
}
