package com.amazon.tarazed.type.annotations;

import androidx.biometric.ErrorUtils$$ExternalSyntheticOutline0;
import androidx.compose.animation.core.ArcMode$$ExternalSyntheticOutline0;
import com.amazon.alexa.accessory.frames.contacts.ContactsModuleConstants;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import defpackage.a$$ExternalSyntheticOutline0;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \"2\u00020\u0001:\u0002!\"B1\b\u0011\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\tB\u001d\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0002\u0010\nJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J'\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J&\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u00002\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001fHÁ\u0001¢\u0006\u0002\b R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\f¨\u0006#"}, d2 = {"Lcom/amazon/tarazed/type/annotations/AnnotationColor;", "", "seen1", "", "r", "g", "b", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(IIIILkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(III)V", "getB", "()I", "getG", "getR", "component1", "component2", "component3", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "hashCode", "toString", "", "write$Self", "", "self", ContactsModuleConstants.OUTPUT, "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$TarazedAndroidLibrary_release", "$serializer", "Companion", "TarazedAndroidLibrary_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@Serializable
/* loaded from: classes19.dex */
public final /* data */ class AnnotationColor {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private final int b;
    private final int g;
    private final int r;

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
    public /* synthetic */ AnnotationColor(int i, int i2, int i3, int i4, SerializationConstructorMarker serializationConstructorMarker) {
        if (7 != (i & 7)) {
            PluginExceptionsKt.throwMissingFieldException(i, 7, AnnotationColor$$serializer.INSTANCE.getDescriptor());
        }
        this.r = i2;
        this.g = i3;
        this.b = i4;
    }

    public static /* synthetic */ AnnotationColor copy$default(AnnotationColor annotationColor, int i, int i2, int i3, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            i = annotationColor.r;
        }
        if ((i4 & 2) != 0) {
            i2 = annotationColor.g;
        }
        if ((i4 & 4) != 0) {
            i3 = annotationColor.b;
        }
        return annotationColor.copy(i, i2, i3);
    }

    @JvmStatic
    public static final /* synthetic */ void write$Self$TarazedAndroidLibrary_release(AnnotationColor self, CompositeEncoder output, SerialDescriptor serialDesc) {
        output.encodeIntElement(serialDesc, 0, self.r);
        output.encodeIntElement(serialDesc, 1, self.g);
        output.encodeIntElement(serialDesc, 2, self.b);
    }

    /* renamed from: component1, reason: from getter */
    public final int getR() {
        return this.r;
    }

    /* renamed from: component2, reason: from getter */
    public final int getG() {
        return this.g;
    }

    /* renamed from: component3, reason: from getter */
    public final int getB() {
        return this.b;
    }

    @NotNull
    public final AnnotationColor copy(int r, int g, int b) {
        return new AnnotationColor(r, g, b);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AnnotationColor)) {
            return false;
        }
        AnnotationColor annotationColor = (AnnotationColor) other;
        return this.r == annotationColor.r && this.g == annotationColor.g && this.b == annotationColor.b;
    }

    public final int getB() {
        return this.b;
    }

    public final int getG() {
        return this.g;
    }

    public final int getR() {
        return this.r;
    }

    public int hashCode() {
        return Integer.hashCode(this.b) + ArcMode$$ExternalSyntheticOutline0.m(this.g, Integer.hashCode(this.r) * 31, 31);
    }

    @NotNull
    public String toString() {
        int i = this.r;
        int i2 = this.g;
        return a$$ExternalSyntheticOutline0.m(ErrorUtils$$ExternalSyntheticOutline0.m29m(i, i2, "AnnotationColor(r=", ", g=", ", b="), this.b, MarkdownConstants.RIGHT_PARENTHESIS);
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/amazon/tarazed/type/annotations/AnnotationColor$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/amazon/tarazed/type/annotations/AnnotationColor;", "TarazedAndroidLibrary_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer<AnnotationColor> serializer() {
            return AnnotationColor$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public AnnotationColor(int i, int i2, int i3) {
        this.r = i;
        this.g = i2;
        this.b = i3;
    }
}
