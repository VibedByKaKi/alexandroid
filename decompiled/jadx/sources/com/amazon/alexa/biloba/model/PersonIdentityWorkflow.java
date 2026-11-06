package com.amazon.alexa.biloba.model;

import androidx.core.app.AppLaunchChecker$$ExternalSyntheticOutline0;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public class PersonIdentityWorkflow {

    @SerializedName("id")
    String id;

    @SerializedName("steps")
    List<PersonIdentityStep> steps;

    public String getId() {
        return this.id;
    }

    public List<PersonIdentityStep> getSteps() {
        return this.steps;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("PersonIdentityWorkflow{id='");
        sb.append(this.id);
        sb.append("', steps=");
        return AppLaunchChecker$$ExternalSyntheticOutline0.m(sb, this.steps, AbstractJsonLexerKt.END_OBJ);
    }
}
