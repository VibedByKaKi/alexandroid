package com.amazon.alexa.assistant.capability.launcher;

import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import java.net.URL;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/amazon/alexa/assistant/capability/launcher/Domain;", "", "<init>", "()V", "Register", "Deregister", "Lcom/amazon/alexa/assistant/capability/launcher/Domain$Deregister;", "Lcom/amazon/alexa/assistant/capability/launcher/Domain$Register;", "voice_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public abstract class Domain {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/amazon/alexa/assistant/capability/launcher/Domain$Deregister;", "Lcom/amazon/alexa/assistant/capability/launcher/Domain;", "domain", "Ljava/net/URL;", "<init>", "(Ljava/net/URL;)V", "getDomain", "()Ljava/net/URL;", "component1", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "", "hashCode", "", "toString", "", "voice_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Deregister extends Domain {

        @NotNull
        private final URL domain;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Deregister(@NotNull URL url) {
            super(null);
            url.getClass();
            this.domain = url;
        }

        public static /* synthetic */ Deregister copy$default(Deregister deregister, URL url, int i, Object obj) {
            if ((i & 1) != 0) {
                url = deregister.domain;
            }
            return deregister.copy(url);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final URL getDomain() {
            return this.domain;
        }

        @NotNull
        public final Deregister copy(@NotNull URL domain) {
            domain.getClass();
            return new Deregister(domain);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Deregister) && Intrinsics.areEqual(this.domain, ((Deregister) other).domain);
        }

        @NotNull
        public final URL getDomain() {
            return this.domain;
        }

        public int hashCode() {
            return this.domain.hashCode();
        }

        @NotNull
        public String toString() {
            return "Deregister(domain=" + this.domain + MarkdownConstants.RIGHT_PARENTHESIS;
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/amazon/alexa/assistant/capability/launcher/Domain$Register;", "Lcom/amazon/alexa/assistant/capability/launcher/Domain;", "domain", "Ljava/net/URL;", "<init>", "(Ljava/net/URL;)V", "getDomain", "()Ljava/net/URL;", "component1", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "", "hashCode", "", "toString", "", "voice_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Register extends Domain {

        @NotNull
        private final URL domain;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Register(@NotNull URL url) {
            super(null);
            url.getClass();
            this.domain = url;
        }

        public static /* synthetic */ Register copy$default(Register register, URL url, int i, Object obj) {
            if ((i & 1) != 0) {
                url = register.domain;
            }
            return register.copy(url);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final URL getDomain() {
            return this.domain;
        }

        @NotNull
        public final Register copy(@NotNull URL domain) {
            domain.getClass();
            return new Register(domain);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Register) && Intrinsics.areEqual(this.domain, ((Register) other).domain);
        }

        @NotNull
        public final URL getDomain() {
            return this.domain;
        }

        public int hashCode() {
            return this.domain.hashCode();
        }

        @NotNull
        public String toString() {
            return "Register(domain=" + this.domain + MarkdownConstants.RIGHT_PARENTHESIS;
        }
    }

    public /* synthetic */ Domain(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private Domain() {
    }
}
