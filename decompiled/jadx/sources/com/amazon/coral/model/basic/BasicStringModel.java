package com.amazon.coral.model.basic;

import com.amazon.coral.model.ModelVisitor;
import com.amazon.coral.model.StringModel;
import okio.Path$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public class BasicStringModel extends BasicModel implements StringModel {
    public static final String DEFAULT_ENCODING = "utf-8";
    private String encoding;

    public BasicStringModel() {
        super(StringModel.class);
        this.encoding = DEFAULT_ENCODING;
    }

    @Override // com.amazon.coral.model.Model
    public void accept(ModelVisitor modelVisitor) {
        modelVisitor.onStringModel(this);
    }

    @Override // com.amazon.coral.model.basic.BasicModel
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof StringModel)) {
            return false;
        }
        StringModel stringModel = (StringModel) obj;
        if (getEncoding().equals(stringModel.getEncoding())) {
            return super.equals(stringModel);
        }
        return false;
    }

    @Override // com.amazon.coral.model.StringModel
    public String getEncoding() {
        return this.encoding;
    }

    public void setEncoding(String str) {
        if (str != null) {
            this.encoding = str;
        } else {
            Path$$ExternalSyntheticBUOutline0.m();
        }
    }
}
