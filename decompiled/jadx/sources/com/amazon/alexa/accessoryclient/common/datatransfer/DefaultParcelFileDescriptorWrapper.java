package com.amazon.alexa.accessoryclient.common.datatransfer;

import android.os.ParcelFileDescriptor;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÖ\u0003J\b\u0010\u0011\u001a\u00020\u0012H\u0016J\b\u0010\u0013\u001a\u00020\u0014H\u0016J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\nHÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0018"}, d2 = {"Lcom/amazon/alexa/accessoryclient/common/datatransfer/DefaultParcelFileDescriptorWrapper;", "Lcom/amazon/alexa/accessoryclient/common/datatransfer/ParcelFileDescriptorWrapper;", "parcelFileDescriptor", "Landroid/os/ParcelFileDescriptor;", "(Landroid/os/ParcelFileDescriptor;)V", "getParcelFileDescriptor", "()Landroid/os/ParcelFileDescriptor;", "closeWithError", "", "msg", "", "component1", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "", "getAutoCloseInputStream", "Ljava/io/InputStream;", "getAutoCloseOutputStream", "Ljava/io/OutputStream;", "hashCode", "", "toString", "AlexaAccessoryAndroidClient_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes16.dex */
public final /* data */ class DefaultParcelFileDescriptorWrapper implements ParcelFileDescriptorWrapper {

    @Nullable
    private final ParcelFileDescriptor parcelFileDescriptor;

    public /* synthetic */ DefaultParcelFileDescriptorWrapper(ParcelFileDescriptor parcelFileDescriptor, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : parcelFileDescriptor);
    }

    public static /* synthetic */ DefaultParcelFileDescriptorWrapper copy$default(DefaultParcelFileDescriptorWrapper defaultParcelFileDescriptorWrapper, ParcelFileDescriptor parcelFileDescriptor, int i, Object obj) {
        if ((i & 1) != 0) {
            parcelFileDescriptor = defaultParcelFileDescriptorWrapper.parcelFileDescriptor;
        }
        return defaultParcelFileDescriptorWrapper.copy(parcelFileDescriptor);
    }

    @Override // com.amazon.alexa.accessoryclient.common.datatransfer.ParcelFileDescriptorWrapper
    public void closeWithError(@NotNull String msg) {
        msg.getClass();
        ParcelFileDescriptor parcelFileDescriptor = this.parcelFileDescriptor;
        if (parcelFileDescriptor != null) {
            parcelFileDescriptor.closeWithError(msg);
        }
    }

    @Nullable
    /* renamed from: component1, reason: from getter */
    public final ParcelFileDescriptor getParcelFileDescriptor() {
        return this.parcelFileDescriptor;
    }

    @NotNull
    public final DefaultParcelFileDescriptorWrapper copy(@Nullable ParcelFileDescriptor parcelFileDescriptor) {
        return new DefaultParcelFileDescriptorWrapper(parcelFileDescriptor);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof DefaultParcelFileDescriptorWrapper) && Intrinsics.areEqual(this.parcelFileDescriptor, ((DefaultParcelFileDescriptorWrapper) other).parcelFileDescriptor);
    }

    @Override // com.amazon.alexa.accessoryclient.common.datatransfer.ParcelFileDescriptorWrapper
    @NotNull
    public InputStream getAutoCloseInputStream() {
        return this.parcelFileDescriptor != null ? new ParcelFileDescriptor.AutoCloseInputStream(this.parcelFileDescriptor) : new InputStream() { // from class: com.amazon.alexa.accessoryclient.common.datatransfer.DefaultParcelFileDescriptorWrapper$getAutoCloseInputStream$2
            @Override // java.io.InputStream
            public int read() {
                throw new IOException("Could not read from InputStream");
            }
        };
    }

    @Override // com.amazon.alexa.accessoryclient.common.datatransfer.ParcelFileDescriptorWrapper
    @NotNull
    public OutputStream getAutoCloseOutputStream() {
        return this.parcelFileDescriptor != null ? new ParcelFileDescriptor.AutoCloseOutputStream(this.parcelFileDescriptor) : new OutputStream() { // from class: com.amazon.alexa.accessoryclient.common.datatransfer.DefaultParcelFileDescriptorWrapper$getAutoCloseOutputStream$2
            @Override // java.io.OutputStream
            public void write(int b) {
                throw new IOException("Could not write to OutputStream");
            }
        };
    }

    @Nullable
    public final ParcelFileDescriptor getParcelFileDescriptor() {
        return this.parcelFileDescriptor;
    }

    public int hashCode() {
        ParcelFileDescriptor parcelFileDescriptor = this.parcelFileDescriptor;
        if (parcelFileDescriptor == null) {
            return 0;
        }
        return parcelFileDescriptor.hashCode();
    }

    @NotNull
    public String toString() {
        return "DefaultParcelFileDescriptorWrapper(parcelFileDescriptor=" + this.parcelFileDescriptor + MarkdownConstants.RIGHT_PARENTHESIS;
    }

    public DefaultParcelFileDescriptorWrapper(@Nullable ParcelFileDescriptor parcelFileDescriptor) {
        this.parcelFileDescriptor = parcelFileDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public DefaultParcelFileDescriptorWrapper() {
        this(null, 1, 0 == true ? 1 : 0);
    }
}
