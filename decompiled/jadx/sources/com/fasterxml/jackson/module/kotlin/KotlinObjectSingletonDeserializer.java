package com.fasterxml.jackson.module.kotlin;

import com.amazon.alexa.presence.utils.MetricsUtil;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.deser.ContextualDeserializer;
import com.fasterxml.jackson.databind.deser.NullValueProvider;
import com.fasterxml.jackson.databind.deser.ResolvableDeserializer;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\u00020\u0004B\u0019\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\n\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\u0001¢\u0006\u0002\u0010\u0007J \u0010\b\u001a\u0006\u0012\u0002\b\u00030\u00012\b\u0010\t\u001a\u0004\u0018\u00010\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0016J\u0018\u0010\r\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\t\u001a\u00020\nH\u0016J\u0012\u0010\u0010\u001a\u00020\u00112\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0016R\u0012\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0002X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lcom/fasterxml/jackson/module/kotlin/KotlinObjectSingletonDeserializer;", "Lcom/fasterxml/jackson/databind/JsonDeserializer;", "", "Lcom/fasterxml/jackson/databind/deser/ContextualDeserializer;", "Lcom/fasterxml/jackson/databind/deser/ResolvableDeserializer;", "singletonInstance", "defaultDeserializer", "(Ljava/lang/Object;Lcom/fasterxml/jackson/databind/JsonDeserializer;)V", "createContextual", "ctxt", "Lcom/fasterxml/jackson/databind/DeserializationContext;", "property", "Lcom/fasterxml/jackson/databind/BeanProperty;", "deserialize", "p", "Lcom/fasterxml/jackson/core/JsonParser;", MetricsUtil.MetricsId.RESOLVE, "", "jackson-module-kotlin"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class KotlinObjectSingletonDeserializer extends JsonDeserializer<Object> implements ContextualDeserializer, ResolvableDeserializer {

    @NotNull
    private final JsonDeserializer<?> defaultDeserializer;

    @NotNull
    private final Object singletonInstance;

    public KotlinObjectSingletonDeserializer(@NotNull Object obj, @NotNull JsonDeserializer<?> jsonDeserializer) {
        obj.getClass();
        jsonDeserializer.getClass();
        this.singletonInstance = obj;
        this.defaultDeserializer = jsonDeserializer;
    }

    @Override // com.fasterxml.jackson.databind.deser.ContextualDeserializer
    @NotNull
    public JsonDeserializer<?> createContextual(@Nullable DeserializationContext ctxt, @Nullable BeanProperty property) {
        NullValueProvider nullValueProvider = this.defaultDeserializer;
        if (!(nullValueProvider instanceof ContextualDeserializer)) {
            return this;
        }
        JsonDeserializer<?> createContextual = ((ContextualDeserializer) nullValueProvider).createContextual(ctxt, property);
        createContextual.getClass();
        return KotlinObjectSingletonDeserializerKt.asSingletonDeserializer(createContextual, this.singletonInstance);
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    @NotNull
    public Object deserialize(@NotNull JsonParser p, @NotNull DeserializationContext ctxt) {
        p.getClass();
        ctxt.getClass();
        this.defaultDeserializer.deserialize(p, ctxt);
        return this.singletonInstance;
    }

    @Override // com.fasterxml.jackson.databind.deser.ResolvableDeserializer
    public void resolve(@Nullable DeserializationContext ctxt) {
        NullValueProvider nullValueProvider = this.defaultDeserializer;
        if (nullValueProvider instanceof ResolvableDeserializer) {
            ((ResolvableDeserializer) nullValueProvider).resolve(ctxt);
        }
    }
}
