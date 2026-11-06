package com.amazon.alexa.redesign.entity;

import com.amazon.alexa.redesign.entity.ViewModelFactory;
import com.amazon.alexa.redesign.entity.viewtypes.ViewTypeModel;
import org.json.JSONObject;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public final /* synthetic */ class ViewModelFactory$$ExternalSyntheticLambda15 implements ViewModelFactory.Factory {
    @Override // com.amazon.alexa.redesign.entity.ViewModelFactory.Factory
    public final Object create(JSONObject jSONObject) {
        ViewTypeModel emptyModel;
        emptyModel = ViewModelFactoryUtil.getEmptyModel(jSONObject);
        return emptyModel;
    }
}
