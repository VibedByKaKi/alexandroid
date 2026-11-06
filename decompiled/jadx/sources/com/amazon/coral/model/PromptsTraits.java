package com.amazon.coral.model;

import com.amazon.coral.annotation.customtrait.Trait;
import com.amazon.coral.model.Model;
import com.amazon.coral.model.validation.PromptsTraitValidator;
import com.amazon.coral.model.xml.PromptsTraitsBuilder;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Trait(name = "prompts", targets = {ServiceModel.class, OperationModel.class})
@UseTraitValidator(PromptsTraitValidator.class)
@UseTraitsBuilder(PromptsTraitsBuilder.class)
/* loaded from: classes19.dex */
public final class PromptsTraits extends AbstractTraits {
    private final Map<String, PromptTemplateDefinition> prompts;

    public PromptsTraits(Class<? extends Traits> cls, Model.Id id, String str, String str2, Map<String, PromptTemplateDefinition> map) {
        super(cls, id, str, str2);
        if (map != null) {
            this.prompts = Collections.unmodifiableMap(new HashMap(map));
        } else {
            Single$$ExternalSyntheticBUOutline0.m$3("Prompts cannot be null");
            throw null;
        }
    }

    @Override // com.amazon.coral.model.AbstractTraits
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof PromptsTraits) && Objects.equals(this.prompts, ((PromptsTraits) obj).prompts)) {
            return super.equals(obj);
        }
        return false;
    }

    public Map<String, PromptTemplateDefinition> getPrompts() {
        return this.prompts;
    }

    @Override // com.amazon.coral.model.AbstractTraits
    public int hashCode() {
        return Objects.hash(Integer.valueOf(super.hashCode()), this.prompts);
    }

    public String toString() {
        return "PromptsTraits{prompts=" + this.prompts + AbstractJsonLexerKt.END_OBJ;
    }

    public PromptsTraits(Map<String, PromptTemplateDefinition> map) {
        this(PromptsTraits.class, Model.Id.NONE, "", "N/A", map);
    }
}
