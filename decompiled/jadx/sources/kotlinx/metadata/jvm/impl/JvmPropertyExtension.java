package kotlinx.metadata.jvm.impl;

import com.amazon.alexa.app.notification.util.PayloadUtils;
import com.mapbox.common.HttpHeaders;
import kotlin.Metadata;
import kotlinx.metadata.KmPropertyExtensionVisitor;
import kotlinx.metadata.impl.extensions.KmPropertyExtension;
import kotlinx.metadata.jvm.JvmFieldSignature;
import kotlinx.metadata.jvm.JvmMethodSignature;
import kotlinx.metadata.jvm.JvmPropertyExtensionVisitor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0005¢\u0006\u0002\u0010\u0003J\u0010\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020#H\u0016J2\u0010$\u001a\u00020!2\n\u0010\u0010\u001a\u00060\u0011j\u0002`\u00122\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\u0010\u0017\u001a\u0004\u0018\u00010\u000bH\u0016J\u0012\u0010%\u001a\u00020!2\b\u0010&\u001a\u0004\u0018\u00010\u000bH\u0016J\u0012\u0010'\u001a\u00020!2\b\u0010&\u001a\u0004\u0018\u00010\u000bH\u0016R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001c\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001e\u0010\u0010\u001a\u00060\u0011j\u0002`\u0012X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\r\"\u0004\b\u0019\u0010\u000fR\u001c\u0010\u001a\u001a\u0004\u0018\u00010\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\r\"\u0004\b\u001c\u0010\u000fR\u001c\u0010\u001d\u001a\u0004\u0018\u00010\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\r\"\u0004\b\u001f\u0010\u000f¨\u0006("}, d2 = {"Lkotlinx/metadata/jvm/impl/JvmPropertyExtension;", "Lkotlinx/metadata/jvm/JvmPropertyExtensionVisitor;", "Lkotlinx/metadata/impl/extensions/KmPropertyExtension;", "()V", "fieldSignature", "Lkotlinx/metadata/jvm/JvmFieldSignature;", "getFieldSignature", "()Lkotlinx/metadata/jvm/JvmFieldSignature;", "setFieldSignature", "(Lkotlinx/metadata/jvm/JvmFieldSignature;)V", "getterSignature", "Lkotlinx/metadata/jvm/JvmMethodSignature;", "getGetterSignature", "()Lkotlinx/metadata/jvm/JvmMethodSignature;", "setGetterSignature", "(Lkotlinx/metadata/jvm/JvmMethodSignature;)V", "jvmFlags", "", "Lkotlinx/metadata/Flags;", "getJvmFlags", "()I", "setJvmFlags", "(I)V", "setterSignature", "getSetterSignature", "setSetterSignature", "syntheticMethodForAnnotations", "getSyntheticMethodForAnnotations", "setSyntheticMethodForAnnotations", "syntheticMethodForDelegate", "getSyntheticMethodForDelegate", "setSyntheticMethodForDelegate", HttpHeaders.ACCEPT, "", "visitor", "Lkotlinx/metadata/KmPropertyExtensionVisitor;", "visit", "visitSyntheticMethodForAnnotations", PayloadUtils.PayloadKeys.SIGNATURE, "visitSyntheticMethodForDelegate", "kotlinx-metadata-jvm"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes10.dex */
public final class JvmPropertyExtension extends JvmPropertyExtensionVisitor implements KmPropertyExtension {

    @Nullable
    private JvmFieldSignature fieldSignature;

    @Nullable
    private JvmMethodSignature getterSignature;
    private int jvmFlags;

    @Nullable
    private JvmMethodSignature setterSignature;

    @Nullable
    private JvmMethodSignature syntheticMethodForAnnotations;

    @Nullable
    private JvmMethodSignature syntheticMethodForDelegate;

    public JvmPropertyExtension() {
        super(null, 1, null);
    }

    @Override // kotlinx.metadata.impl.extensions.KmExtension
    public void accept(@NotNull KmPropertyExtensionVisitor visitor) {
        visitor.getClass();
        if (!(visitor instanceof JvmPropertyExtensionVisitor)) {
            Single$$ExternalSyntheticBUOutline0.m$3("Failed requirement.");
            return;
        }
        JvmPropertyExtensionVisitor jvmPropertyExtensionVisitor = (JvmPropertyExtensionVisitor) visitor;
        jvmPropertyExtensionVisitor.visit(this.jvmFlags, this.fieldSignature, this.getterSignature, this.setterSignature);
        jvmPropertyExtensionVisitor.visitSyntheticMethodForAnnotations(this.syntheticMethodForAnnotations);
        jvmPropertyExtensionVisitor.visitSyntheticMethodForDelegate(this.syntheticMethodForDelegate);
        jvmPropertyExtensionVisitor.visitEnd();
    }

    @Nullable
    public final JvmFieldSignature getFieldSignature() {
        return this.fieldSignature;
    }

    @Nullable
    public final JvmMethodSignature getGetterSignature() {
        return this.getterSignature;
    }

    public final int getJvmFlags() {
        return this.jvmFlags;
    }

    @Nullable
    public final JvmMethodSignature getSetterSignature() {
        return this.setterSignature;
    }

    @Nullable
    public final JvmMethodSignature getSyntheticMethodForAnnotations() {
        return this.syntheticMethodForAnnotations;
    }

    @Nullable
    public final JvmMethodSignature getSyntheticMethodForDelegate() {
        return this.syntheticMethodForDelegate;
    }

    public final void setFieldSignature(@Nullable JvmFieldSignature jvmFieldSignature) {
        this.fieldSignature = jvmFieldSignature;
    }

    public final void setGetterSignature(@Nullable JvmMethodSignature jvmMethodSignature) {
        this.getterSignature = jvmMethodSignature;
    }

    public final void setJvmFlags(int i) {
        this.jvmFlags = i;
    }

    public final void setSetterSignature(@Nullable JvmMethodSignature jvmMethodSignature) {
        this.setterSignature = jvmMethodSignature;
    }

    public final void setSyntheticMethodForAnnotations(@Nullable JvmMethodSignature jvmMethodSignature) {
        this.syntheticMethodForAnnotations = jvmMethodSignature;
    }

    public final void setSyntheticMethodForDelegate(@Nullable JvmMethodSignature jvmMethodSignature) {
        this.syntheticMethodForDelegate = jvmMethodSignature;
    }

    @Override // kotlinx.metadata.jvm.JvmPropertyExtensionVisitor
    public void visit(int jvmFlags, @Nullable JvmFieldSignature fieldSignature, @Nullable JvmMethodSignature getterSignature, @Nullable JvmMethodSignature setterSignature) {
        this.jvmFlags = jvmFlags;
        this.fieldSignature = fieldSignature;
        this.getterSignature = getterSignature;
        this.setterSignature = setterSignature;
    }

    @Override // kotlinx.metadata.jvm.JvmPropertyExtensionVisitor
    public void visitSyntheticMethodForAnnotations(@Nullable JvmMethodSignature signature) {
        this.syntheticMethodForAnnotations = signature;
    }

    @Override // kotlinx.metadata.jvm.JvmPropertyExtensionVisitor
    public void visitSyntheticMethodForDelegate(@Nullable JvmMethodSignature signature) {
        this.syntheticMethodForDelegate = signature;
    }
}
