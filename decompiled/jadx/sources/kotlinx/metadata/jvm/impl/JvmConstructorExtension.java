package kotlinx.metadata.jvm.impl;

import com.amazon.alexa.app.notification.util.PayloadUtils;
import com.mapbox.common.HttpHeaders;
import kotlin.Metadata;
import kotlinx.metadata.KmConstructorExtensionVisitor;
import kotlinx.metadata.impl.extensions.KmConstructorExtension;
import kotlinx.metadata.jvm.JvmConstructorExtensionVisitor;
import kotlinx.metadata.jvm.JvmMethodSignature;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0005¢\u0006\u0002\u0010\u0003J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0016J\u0012\u0010\u000e\u001a\u00020\u000b2\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\t¨\u0006\u000f"}, d2 = {"Lkotlinx/metadata/jvm/impl/JvmConstructorExtension;", "Lkotlinx/metadata/jvm/JvmConstructorExtensionVisitor;", "Lkotlinx/metadata/impl/extensions/KmConstructorExtension;", "()V", PayloadUtils.PayloadKeys.SIGNATURE, "Lkotlinx/metadata/jvm/JvmMethodSignature;", "getSignature", "()Lkotlinx/metadata/jvm/JvmMethodSignature;", "setSignature", "(Lkotlinx/metadata/jvm/JvmMethodSignature;)V", HttpHeaders.ACCEPT, "", "visitor", "Lkotlinx/metadata/KmConstructorExtensionVisitor;", "visit", "kotlinx-metadata-jvm"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes10.dex */
public final class JvmConstructorExtension extends JvmConstructorExtensionVisitor implements KmConstructorExtension {

    @Nullable
    private JvmMethodSignature signature;

    public JvmConstructorExtension() {
        super(null, 1, null);
    }

    @Override // kotlinx.metadata.impl.extensions.KmExtension
    public void accept(@NotNull KmConstructorExtensionVisitor visitor) {
        visitor.getClass();
        if (visitor instanceof JvmConstructorExtensionVisitor) {
            ((JvmConstructorExtensionVisitor) visitor).visit(this.signature);
        } else {
            Single$$ExternalSyntheticBUOutline0.m$3("Failed requirement.");
        }
    }

    @Nullable
    public final JvmMethodSignature getSignature() {
        return this.signature;
    }

    public final void setSignature(@Nullable JvmMethodSignature jvmMethodSignature) {
        this.signature = jvmMethodSignature;
    }

    @Override // kotlinx.metadata.jvm.JvmConstructorExtensionVisitor
    public void visit(@Nullable JvmMethodSignature signature) {
        this.signature = signature;
    }
}
