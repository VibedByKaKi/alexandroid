package com.amazon.dee.app.services.internetsharing.socks5;

import androidx.biometric.ErrorUtils$$ExternalSyntheticOutline0;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import defpackage.a$$ExternalSyntheticOutline0;
import java.util.Arrays;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0005\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u0011\u001a\u00020\u0012H\u0016J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0006HÆ\u0003J'\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0019"}, d2 = {"Lcom/amazon/dee/app/services/internetsharing/socks5/Socks5MethodRequest;", "", "version", "", "numMethods", "methods", "", "<init>", "(BB[B)V", "getVersion", "()B", "getNumMethods", "getMethods", "()[B", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "hashCode", "", "component1", "component2", "component3", "copy", "toString", "", "impl"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class Socks5MethodRequest {

    @NotNull
    private final byte[] methods;
    private final byte numMethods;
    private final byte version;

    public Socks5MethodRequest(byte b, byte b2, @NotNull byte[] bArr) {
        bArr.getClass();
        this.version = b;
        this.numMethods = b2;
        this.methods = bArr;
    }

    public static /* synthetic */ Socks5MethodRequest copy$default(Socks5MethodRequest socks5MethodRequest, byte b, byte b2, byte[] bArr, int i, Object obj) {
        if ((i & 1) != 0) {
            b = socks5MethodRequest.version;
        }
        if ((i & 2) != 0) {
            b2 = socks5MethodRequest.numMethods;
        }
        if ((i & 4) != 0) {
            bArr = socks5MethodRequest.methods;
        }
        return socks5MethodRequest.copy(b, b2, bArr);
    }

    /* renamed from: component1, reason: from getter */
    public final byte getVersion() {
        return this.version;
    }

    /* renamed from: component2, reason: from getter */
    public final byte getNumMethods() {
        return this.numMethods;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final byte[] getMethods() {
        return this.methods;
    }

    @NotNull
    public final Socks5MethodRequest copy(byte version, byte numMethods, @NotNull byte[] methods) {
        methods.getClass();
        return new Socks5MethodRequest(version, numMethods, methods);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Socks5MethodRequest)) {
            return false;
        }
        Socks5MethodRequest socks5MethodRequest = (Socks5MethodRequest) other;
        return this.version == socks5MethodRequest.version && this.numMethods == socks5MethodRequest.numMethods && Arrays.equals(this.methods, socks5MethodRequest.methods);
    }

    @NotNull
    public final byte[] getMethods() {
        return this.methods;
    }

    public final byte getNumMethods() {
        return this.numMethods;
    }

    public final byte getVersion() {
        return this.version;
    }

    public int hashCode() {
        return Arrays.hashCode(this.methods) + (((this.version * 31) + this.numMethods) * 31);
    }

    @NotNull
    public String toString() {
        byte b = this.version;
        byte b2 = this.numMethods;
        return a$$ExternalSyntheticOutline0.m(ErrorUtils$$ExternalSyntheticOutline0.m29m((int) b, (int) b2, "Socks5MethodRequest(version=", ", numMethods=", ", methods="), Arrays.toString(this.methods), MarkdownConstants.RIGHT_PARENTHESIS);
    }
}
