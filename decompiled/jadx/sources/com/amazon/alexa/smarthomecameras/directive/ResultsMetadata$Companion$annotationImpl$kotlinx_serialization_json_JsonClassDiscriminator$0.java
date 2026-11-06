package com.amazon.alexa.smarthomecameras.directive;

import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import defpackage.a$$ExternalSyntheticOutline0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.JsonClassDiscriminator;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes19.dex */
public final /* synthetic */ class ResultsMetadata$Companion$annotationImpl$kotlinx_serialization_json_JsonClassDiscriminator$0 implements JsonClassDiscriminator {
    private final /* synthetic */ String discriminator;

    public ResultsMetadata$Companion$annotationImpl$kotlinx_serialization_json_JsonClassDiscriminator$0(@NotNull String str) {
        str.getClass();
        this.discriminator = str;
    }

    @Override // java.lang.annotation.Annotation
    public final /* synthetic */ Class annotationType() {
        return JsonClassDiscriminator.class;
    }

    @Override // kotlinx.serialization.json.JsonClassDiscriminator
    public final /* synthetic */ String discriminator() {
        return this.discriminator;
    }

    @Override // java.lang.annotation.Annotation
    public final boolean equals(@Nullable Object obj) {
        return (obj instanceof JsonClassDiscriminator) && Intrinsics.areEqual(discriminator(), ((JsonClassDiscriminator) obj).discriminator());
    }

    @Override // java.lang.annotation.Annotation
    public final int hashCode() {
        return this.discriminator.hashCode() ^ 707790692;
    }

    @Override // java.lang.annotation.Annotation
    @NotNull
    public final String toString() {
        return a$$ExternalSyntheticOutline0.m("@kotlinx.serialization.json.JsonClassDiscriminator(discriminator=", this.discriminator, MarkdownConstants.RIGHT_PARENTHESIS);
    }
}
