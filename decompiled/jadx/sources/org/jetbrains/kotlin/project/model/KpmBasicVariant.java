package org.jetbrains.kotlin.project.model;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002B!\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\tJ\b\u0010\u000f\u001a\u00020\u0006H\u0016R \u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00060\u000bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0010"}, d2 = {"Lorg/jetbrains/kotlin/project/model/KpmBasicVariant;", "Lorg/jetbrains/kotlin/project/model/KpmBasicFragment;", "Lorg/jetbrains/kotlin/project/model/KpmVariant;", "containingModule", "Lorg/jetbrains/kotlin/project/model/KpmModule;", "fragmentName", "", "languageSettings", "Lorg/jetbrains/kotlin/project/model/LanguageSettings;", "(Lorg/jetbrains/kotlin/project/model/KpmModule;Ljava/lang/String;Lorg/jetbrains/kotlin/project/model/LanguageSettings;)V", "variantAttributes", "", "Lorg/jetbrains/kotlin/project/model/KotlinAttributeKey;", "getVariantAttributes", "()Ljava/util/Map;", "toString", "kotlin-project-model"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes11.dex */
public final class KpmBasicVariant extends KpmBasicFragment implements KpmVariant {

    @NotNull
    private final Map<KotlinAttributeKey, String> variantAttributes;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KpmBasicVariant(@NotNull KpmModule kpmModule, @NotNull String str, @Nullable LanguageSettings languageSettings) {
        super(kpmModule, str, languageSettings);
        kpmModule.getClass();
        str.getClass();
        this.variantAttributes = new LinkedHashMap();
    }

    @Override // org.jetbrains.kotlin.project.model.KpmVariant
    @NotNull
    public Map<KotlinAttributeKey, String> getVariantAttributes() {
        return this.variantAttributes;
    }

    @Override // org.jetbrains.kotlin.project.model.KpmBasicFragment
    @NotNull
    public String toString() {
        return "variant " + getFragmentName();
    }

    public /* synthetic */ KpmBasicVariant(KpmModule kpmModule, String str, LanguageSettings languageSettings, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(kpmModule, str, (i & 4) != 0 ? null : languageSettings);
    }
}
