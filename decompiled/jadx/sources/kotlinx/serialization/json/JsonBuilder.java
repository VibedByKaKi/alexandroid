package kotlinx.serialization.json;

import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;
import dagger.internal.codegen.base.Formatter;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.serialization.ExperimentalSerializationApi;
import kotlinx.serialization.modules.SerializersModule;
import okio.Buffer$$ExternalSyntheticBUOutline0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0010\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0011\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010Q\u001a\u00020RH\u0000¢\u0006\u0002\bSR\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001a\u0010\f\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\t\"\u0004\b\u000e\u0010\u000bR\u001a\u0010\u000f\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\t\"\u0004\b\u0011\u0010\u000bR\u001a\u0010\u0012\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\t\"\u0004\b\u0013\u0010\u000bR\u001a\u0010\u0014\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\t\"\u0004\b\u0016\u0010\u000bR$\u0010\u0017\u001a\u00020\u00188\u0006@\u0006X\u0087\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u001a\u0010\u001f\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010\t\"\u0004\b!\u0010\u000bR\u001a\u0010\"\u001a\u00020\u0018X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010\u001c\"\u0004\b$\u0010\u001eR$\u0010%\u001a\u00020&8\u0006@\u0006X\u0087\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b'\u0010\u001a\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R\u001a\u0010,\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b-\u0010\t\"\u0004\b.\u0010\u000bR&\u0010/\u001a\u0004\u0018\u0001008\u0006@\u0006X\u0087\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b1\u0010\u001a\u001a\u0004\b2\u00103\"\u0004\b4\u00105R$\u00106\u001a\u00020\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b7\u0010\u001a\u001a\u0004\b8\u0010\t\"\u0004\b9\u0010\u000bR$\u0010:\u001a\u00020\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b;\u0010\u001a\u001a\u0004\b<\u0010\t\"\u0004\b=\u0010\u000bR$\u0010>\u001a\u00020\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b?\u0010\u001a\u001a\u0004\b@\u0010\t\"\u0004\bA\u0010\u000bR\u001a\u0010B\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bC\u0010\t\"\u0004\bD\u0010\u000bR\u001a\u0010E\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bF\u0010\t\"\u0004\bG\u0010\u000bR\u001a\u0010H\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bI\u0010\t\"\u0004\bJ\u0010\u000bR\u001a\u0010K\u001a\u00020LX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bM\u0010N\"\u0004\bO\u0010P¨\u0006T"}, d2 = {"Lkotlinx/serialization/json/JsonBuilder;", "", "json", "Lkotlinx/serialization/json/Json;", "<init>", "(Lkotlinx/serialization/json/Json;)V", "encodeDefaults", "", "getEncodeDefaults", "()Z", "setEncodeDefaults", "(Z)V", "explicitNulls", "getExplicitNulls", "setExplicitNulls", "ignoreUnknownKeys", "getIgnoreUnknownKeys", "setIgnoreUnknownKeys", "isLenient", "setLenient", "prettyPrint", "getPrettyPrint", "setPrettyPrint", "prettyPrintIndent", "", "getPrettyPrintIndent$annotations", "()V", "getPrettyPrintIndent", "()Ljava/lang/String;", "setPrettyPrintIndent", "(Ljava/lang/String;)V", "coerceInputValues", "getCoerceInputValues", "setCoerceInputValues", "classDiscriminator", "getClassDiscriminator", "setClassDiscriminator", "classDiscriminatorMode", "Lkotlinx/serialization/json/ClassDiscriminatorMode;", "getClassDiscriminatorMode$annotations", "getClassDiscriminatorMode", "()Lkotlinx/serialization/json/ClassDiscriminatorMode;", "setClassDiscriminatorMode", "(Lkotlinx/serialization/json/ClassDiscriminatorMode;)V", "useAlternativeNames", "getUseAlternativeNames", "setUseAlternativeNames", "namingStrategy", "Lkotlinx/serialization/json/JsonNamingStrategy;", "getNamingStrategy$annotations", "getNamingStrategy", "()Lkotlinx/serialization/json/JsonNamingStrategy;", "setNamingStrategy", "(Lkotlinx/serialization/json/JsonNamingStrategy;)V", "decodeEnumsCaseInsensitive", "getDecodeEnumsCaseInsensitive$annotations", "getDecodeEnumsCaseInsensitive", "setDecodeEnumsCaseInsensitive", "allowTrailingComma", "getAllowTrailingComma$annotations", "getAllowTrailingComma", "setAllowTrailingComma", "allowComments", "getAllowComments$annotations", "getAllowComments", "setAllowComments", "allowSpecialFloatingPointValues", "getAllowSpecialFloatingPointValues", "setAllowSpecialFloatingPointValues", "allowStructuredMapKeys", "getAllowStructuredMapKeys", "setAllowStructuredMapKeys", "useArrayPolymorphism", "getUseArrayPolymorphism", "setUseArrayPolymorphism", "serializersModule", "Lkotlinx/serialization/modules/SerializersModule;", "getSerializersModule", "()Lkotlinx/serialization/modules/SerializersModule;", "setSerializersModule", "(Lkotlinx/serialization/modules/SerializersModule;)V", JsonPOJOBuilder.DEFAULT_BUILD_METHOD, "Lkotlinx/serialization/json/JsonConfiguration;", "build$kotlinx_serialization_json", "kotlinx-serialization-json"}, k = 1, mv = {2, 2, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nJson.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Json.kt\nkotlinx/serialization/json/JsonBuilder\n+ 2 _Strings.kt\nkotlin/text/StringsKt___StringsKt\n*L\n1#1,724:1\n1069#2,2:725\n*S KotlinDebug\n*F\n+ 1 Json.kt\nkotlinx/serialization/json/JsonBuilder\n*L\n687#1:725,2\n*E\n"})
/* loaded from: classes10.dex */
public final class JsonBuilder {
    private boolean allowComments;
    private boolean allowSpecialFloatingPointValues;
    private boolean allowStructuredMapKeys;
    private boolean allowTrailingComma;

    @NotNull
    private String classDiscriminator;

    @NotNull
    private ClassDiscriminatorMode classDiscriminatorMode;
    private boolean coerceInputValues;
    private boolean decodeEnumsCaseInsensitive;
    private boolean encodeDefaults;
    private boolean explicitNulls;
    private boolean ignoreUnknownKeys;
    private boolean isLenient;

    @Nullable
    private JsonNamingStrategy namingStrategy;
    private boolean prettyPrint;

    @NotNull
    private String prettyPrintIndent;

    @NotNull
    private SerializersModule serializersModule;
    private boolean useAlternativeNames;
    private boolean useArrayPolymorphism;

    public JsonBuilder(@NotNull Json json) {
        json.getClass();
        this.encodeDefaults = json.getConfiguration().getEncodeDefaults();
        this.explicitNulls = json.getConfiguration().getExplicitNulls();
        this.ignoreUnknownKeys = json.getConfiguration().getIgnoreUnknownKeys();
        this.isLenient = json.getConfiguration().getIsLenient();
        this.prettyPrint = json.getConfiguration().getPrettyPrint();
        this.prettyPrintIndent = json.getConfiguration().getPrettyPrintIndent();
        this.coerceInputValues = json.getConfiguration().getCoerceInputValues();
        this.classDiscriminator = json.getConfiguration().getClassDiscriminator();
        this.classDiscriminatorMode = json.getConfiguration().getClassDiscriminatorMode();
        this.useAlternativeNames = json.getConfiguration().getUseAlternativeNames();
        this.namingStrategy = json.getConfiguration().getNamingStrategy();
        this.decodeEnumsCaseInsensitive = json.getConfiguration().getDecodeEnumsCaseInsensitive();
        this.allowTrailingComma = json.getConfiguration().getAllowTrailingComma();
        this.allowComments = json.getConfiguration().getAllowComments();
        this.allowSpecialFloatingPointValues = json.getConfiguration().getAllowSpecialFloatingPointValues();
        this.allowStructuredMapKeys = json.getConfiguration().getAllowStructuredMapKeys();
        this.useArrayPolymorphism = json.getConfiguration().getUseArrayPolymorphism();
        this.serializersModule = json.getSerializersModule();
    }

    @NotNull
    public final JsonConfiguration build$kotlinx_serialization_json() {
        if (this.useArrayPolymorphism) {
            if (!Intrinsics.areEqual(this.classDiscriminator, "type")) {
                Single$$ExternalSyntheticBUOutline0.m$3("Class discriminator should not be specified when array polymorphism is specified");
                return null;
            }
            if (this.classDiscriminatorMode != ClassDiscriminatorMode.POLYMORPHIC) {
                Single$$ExternalSyntheticBUOutline0.m$3("useArrayPolymorphism option can only be used if classDiscriminatorMode in a default POLYMORPHIC state.");
                return null;
            }
        }
        boolean z = this.prettyPrint;
        String str = this.prettyPrintIndent;
        if (z) {
            if (!Intrinsics.areEqual(str, Formatter.INDENT)) {
                String str2 = this.prettyPrintIndent;
                for (int i = 0; i < str2.length(); i++) {
                    char charAt = str2.charAt(i);
                    if (charAt != ' ' && charAt != '\t' && charAt != '\r' && charAt != '\n') {
                        Buffer$$ExternalSyntheticBUOutline0.m$4(this.prettyPrintIndent, "Only whitespace, tab, newline and carriage return are allowed as pretty print symbols. Had ");
                        return null;
                    }
                }
            }
        } else if (!Intrinsics.areEqual(str, Formatter.INDENT)) {
            Single$$ExternalSyntheticBUOutline0.m$3("Indent should not be specified when default printing mode is used");
            return null;
        }
        return new JsonConfiguration(this.encodeDefaults, this.ignoreUnknownKeys, this.isLenient, this.allowStructuredMapKeys, this.prettyPrint, this.explicitNulls, this.prettyPrintIndent, this.coerceInputValues, this.useArrayPolymorphism, this.classDiscriminator, this.allowSpecialFloatingPointValues, this.useAlternativeNames, this.namingStrategy, this.decodeEnumsCaseInsensitive, this.allowTrailingComma, this.allowComments, this.classDiscriminatorMode);
    }

    public final boolean getAllowComments() {
        return this.allowComments;
    }

    public final boolean getAllowSpecialFloatingPointValues() {
        return this.allowSpecialFloatingPointValues;
    }

    public final boolean getAllowStructuredMapKeys() {
        return this.allowStructuredMapKeys;
    }

    public final boolean getAllowTrailingComma() {
        return this.allowTrailingComma;
    }

    @NotNull
    public final String getClassDiscriminator() {
        return this.classDiscriminator;
    }

    @NotNull
    public final ClassDiscriminatorMode getClassDiscriminatorMode() {
        return this.classDiscriminatorMode;
    }

    public final boolean getCoerceInputValues() {
        return this.coerceInputValues;
    }

    public final boolean getDecodeEnumsCaseInsensitive() {
        return this.decodeEnumsCaseInsensitive;
    }

    public final boolean getEncodeDefaults() {
        return this.encodeDefaults;
    }

    public final boolean getExplicitNulls() {
        return this.explicitNulls;
    }

    public final boolean getIgnoreUnknownKeys() {
        return this.ignoreUnknownKeys;
    }

    @Nullable
    public final JsonNamingStrategy getNamingStrategy() {
        return this.namingStrategy;
    }

    public final boolean getPrettyPrint() {
        return this.prettyPrint;
    }

    @NotNull
    public final String getPrettyPrintIndent() {
        return this.prettyPrintIndent;
    }

    @NotNull
    public final SerializersModule getSerializersModule() {
        return this.serializersModule;
    }

    public final boolean getUseAlternativeNames() {
        return this.useAlternativeNames;
    }

    public final boolean getUseArrayPolymorphism() {
        return this.useArrayPolymorphism;
    }

    /* renamed from: isLenient, reason: from getter */
    public final boolean getIsLenient() {
        return this.isLenient;
    }

    public final void setAllowComments(boolean z) {
        this.allowComments = z;
    }

    public final void setAllowSpecialFloatingPointValues(boolean z) {
        this.allowSpecialFloatingPointValues = z;
    }

    public final void setAllowStructuredMapKeys(boolean z) {
        this.allowStructuredMapKeys = z;
    }

    public final void setAllowTrailingComma(boolean z) {
        this.allowTrailingComma = z;
    }

    public final void setClassDiscriminator(@NotNull String str) {
        str.getClass();
        this.classDiscriminator = str;
    }

    public final void setClassDiscriminatorMode(@NotNull ClassDiscriminatorMode classDiscriminatorMode) {
        classDiscriminatorMode.getClass();
        this.classDiscriminatorMode = classDiscriminatorMode;
    }

    public final void setCoerceInputValues(boolean z) {
        this.coerceInputValues = z;
    }

    public final void setDecodeEnumsCaseInsensitive(boolean z) {
        this.decodeEnumsCaseInsensitive = z;
    }

    public final void setEncodeDefaults(boolean z) {
        this.encodeDefaults = z;
    }

    public final void setExplicitNulls(boolean z) {
        this.explicitNulls = z;
    }

    public final void setIgnoreUnknownKeys(boolean z) {
        this.ignoreUnknownKeys = z;
    }

    public final void setLenient(boolean z) {
        this.isLenient = z;
    }

    public final void setNamingStrategy(@Nullable JsonNamingStrategy jsonNamingStrategy) {
        this.namingStrategy = jsonNamingStrategy;
    }

    public final void setPrettyPrint(boolean z) {
        this.prettyPrint = z;
    }

    public final void setPrettyPrintIndent(@NotNull String str) {
        str.getClass();
        this.prettyPrintIndent = str;
    }

    public final void setSerializersModule(@NotNull SerializersModule serializersModule) {
        serializersModule.getClass();
        this.serializersModule = serializersModule;
    }

    public final void setUseAlternativeNames(boolean z) {
        this.useAlternativeNames = z;
    }

    public final void setUseArrayPolymorphism(boolean z) {
        this.useArrayPolymorphism = z;
    }

    @ExperimentalSerializationApi
    public static /* synthetic */ void getAllowComments$annotations() {
    }

    @ExperimentalSerializationApi
    public static /* synthetic */ void getAllowTrailingComma$annotations() {
    }

    @ExperimentalSerializationApi
    public static /* synthetic */ void getClassDiscriminatorMode$annotations() {
    }

    @ExperimentalSerializationApi
    public static /* synthetic */ void getDecodeEnumsCaseInsensitive$annotations() {
    }

    @ExperimentalSerializationApi
    public static /* synthetic */ void getNamingStrategy$annotations() {
    }

    @ExperimentalSerializationApi
    public static /* synthetic */ void getPrettyPrintIndent$annotations() {
    }
}
