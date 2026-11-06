package kotlinx.metadata.jvm.impl;

import com.amazon.alexa.app.notification.util.PayloadUtils;
import com.mapbox.common.HttpHeaders;
import kotlin.Metadata;
import kotlinx.metadata.KmFunctionExtensionVisitor;
import kotlinx.metadata.impl.extensions.KmFunctionExtension;
import kotlinx.metadata.jvm.JvmFunctionExtensionVisitor;
import kotlinx.metadata.jvm.JvmMethodSignature;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0005¢\u0006\u0002\u0010\u0003J\u0010\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0016J\u0012\u0010\u0014\u001a\u00020\u00112\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0016J\u0010\u0010\u0015\u001a\u00020\u00112\u0006\u0010\u0016\u001a\u00020\u0005H\u0016R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001c\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u0006\u0017"}, d2 = {"Lkotlinx/metadata/jvm/impl/JvmFunctionExtension;", "Lkotlinx/metadata/jvm/JvmFunctionExtensionVisitor;", "Lkotlinx/metadata/impl/extensions/KmFunctionExtension;", "()V", "lambdaClassOriginName", "", "getLambdaClassOriginName", "()Ljava/lang/String;", "setLambdaClassOriginName", "(Ljava/lang/String;)V", PayloadUtils.PayloadKeys.SIGNATURE, "Lkotlinx/metadata/jvm/JvmMethodSignature;", "getSignature", "()Lkotlinx/metadata/jvm/JvmMethodSignature;", "setSignature", "(Lkotlinx/metadata/jvm/JvmMethodSignature;)V", HttpHeaders.ACCEPT, "", "visitor", "Lkotlinx/metadata/KmFunctionExtensionVisitor;", "visit", "visitLambdaClassOriginName", "internalName", "kotlinx-metadata-jvm"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes10.dex */
public final class JvmFunctionExtension extends JvmFunctionExtensionVisitor implements KmFunctionExtension {

    @Nullable
    private String lambdaClassOriginName;

    @Nullable
    private JvmMethodSignature signature;

    public JvmFunctionExtension() {
        super(null, 1, null);
    }

    @Override // kotlinx.metadata.impl.extensions.KmExtension
    public void accept(@NotNull KmFunctionExtensionVisitor visitor) {
        visitor.getClass();
        if (!(visitor instanceof JvmFunctionExtensionVisitor)) {
            Single$$ExternalSyntheticBUOutline0.m$3("Failed requirement.");
            return;
        }
        JvmFunctionExtensionVisitor jvmFunctionExtensionVisitor = (JvmFunctionExtensionVisitor) visitor;
        jvmFunctionExtensionVisitor.visit(this.signature);
        String str = this.lambdaClassOriginName;
        if (str != null) {
            jvmFunctionExtensionVisitor.visitLambdaClassOriginName(str);
        }
        jvmFunctionExtensionVisitor.visitEnd();
    }

    @Nullable
    public final String getLambdaClassOriginName() {
        return this.lambdaClassOriginName;
    }

    @Nullable
    public final JvmMethodSignature getSignature() {
        return this.signature;
    }

    public final void setLambdaClassOriginName(@Nullable String str) {
        this.lambdaClassOriginName = str;
    }

    public final void setSignature(@Nullable JvmMethodSignature jvmMethodSignature) {
        this.signature = jvmMethodSignature;
    }

    @Override // kotlinx.metadata.jvm.JvmFunctionExtensionVisitor
    public void visit(@Nullable JvmMethodSignature signature) {
        this.signature = signature;
    }

    @Override // kotlinx.metadata.jvm.JvmFunctionExtensionVisitor
    public void visitLambdaClassOriginName(@NotNull String internalName) {
        internalName.getClass();
        this.lambdaClassOriginName = internalName;
    }
}
