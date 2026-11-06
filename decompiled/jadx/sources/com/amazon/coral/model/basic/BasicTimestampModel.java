package com.amazon.coral.model.basic;

import com.amazon.coral.model.ModelVisitor;
import com.amazon.coral.model.TimestampModel;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public class BasicTimestampModel extends BasicModel implements TimestampModel {
    public BasicTimestampModel() {
        super(TimestampModel.class);
    }

    @Override // com.amazon.coral.model.Model
    public void accept(ModelVisitor modelVisitor) {
        modelVisitor.onTimestampModel(this);
    }
}
