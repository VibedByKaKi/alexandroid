package com.amazon.coral.model;

import com.amazon.coral.model.Model;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public interface OperationModel extends Model {
    Iterable<Model.Id> getErrors();

    Model.Id getInput();

    Model.Id getOutput();
}
