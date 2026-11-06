package com.amazon.coral.google.common.graph;

import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.coral.google.common.annotations.Beta;
import com.amazon.coral.google.common.base.Objects;
import com.amazon.coral.google.common.base.Preconditions;
import com.amazon.coral.google.common.collect.Iterators;
import com.amazon.coral.google.common.collect.UnmodifiableIterator;
import com.amazon.coral.google.errorprone.annotations.Immutable;
import com.amazon.credentiallocker.CredentialConfig$$ExternalSyntheticOutline0;
import java.util.Iterator;
import javax.annotation.CheckForNull;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@ElementTypesAreNonnullByDefault
@Beta
@Immutable(containerOf = {"N"})
/* loaded from: classes19.dex */
public abstract class EndpointPair<N> implements Iterable<N> {
    private final N nodeU;
    private final N nodeV;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class Ordered<N> extends EndpointPair<N> {
        private Ordered(N n, N n2) {
            super(n, n2);
        }

        @Override // com.amazon.coral.google.common.graph.EndpointPair
        public boolean equals(@CheckForNull Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof EndpointPair)) {
                return false;
            }
            EndpointPair endpointPair = (EndpointPair) obj;
            return isOrdered() == endpointPair.isOrdered() && source().equals(endpointPair.source()) && target().equals(endpointPair.target());
        }

        @Override // com.amazon.coral.google.common.graph.EndpointPair
        public int hashCode() {
            return Objects.hashCode(source(), target());
        }

        @Override // com.amazon.coral.google.common.graph.EndpointPair
        public boolean isOrdered() {
            return true;
        }

        @Override // com.amazon.coral.google.common.graph.EndpointPair, java.lang.Iterable
        public /* bridge */ /* synthetic */ Iterator iterator() {
            return iterator();
        }

        @Override // com.amazon.coral.google.common.graph.EndpointPair
        public N source() {
            return nodeU();
        }

        @Override // com.amazon.coral.google.common.graph.EndpointPair
        public N target() {
            return nodeV();
        }

        public String toString() {
            String valueOf = String.valueOf(source());
            String valueOf2 = String.valueOf(target());
            StringBuilder m21223m = CredentialConfig$$ExternalSyntheticOutline0.m21223m(valueOf2.length() + valueOf.length() + 6, "<", valueOf, " -> ", valueOf2);
            m21223m.append(">");
            return m21223m.toString();
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class Unordered<N> extends EndpointPair<N> {
        private Unordered(N n, N n2) {
            super(n, n2);
        }

        @Override // com.amazon.coral.google.common.graph.EndpointPair
        public boolean equals(@CheckForNull Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof EndpointPair)) {
                return false;
            }
            EndpointPair endpointPair = (EndpointPair) obj;
            if (isOrdered() != endpointPair.isOrdered()) {
                return false;
            }
            return nodeU().equals(endpointPair.nodeU()) ? nodeV().equals(endpointPair.nodeV()) : nodeU().equals(endpointPair.nodeV()) && nodeV().equals(endpointPair.nodeU());
        }

        @Override // com.amazon.coral.google.common.graph.EndpointPair
        public int hashCode() {
            return nodeV().hashCode() + nodeU().hashCode();
        }

        @Override // com.amazon.coral.google.common.graph.EndpointPair
        public boolean isOrdered() {
            return false;
        }

        @Override // com.amazon.coral.google.common.graph.EndpointPair, java.lang.Iterable
        public /* bridge */ /* synthetic */ Iterator iterator() {
            return iterator();
        }

        @Override // com.amazon.coral.google.common.graph.EndpointPair
        public N source() {
            throw new UnsupportedOperationException("Cannot call source()/target() on a EndpointPair from an undirected graph. Consider calling adjacentNode(node) if you already have a node, or nodeU()/nodeV() if you don't.");
        }

        @Override // com.amazon.coral.google.common.graph.EndpointPair
        public N target() {
            throw new UnsupportedOperationException("Cannot call source()/target() on a EndpointPair from an undirected graph. Consider calling adjacentNode(node) if you already have a node, or nodeU()/nodeV() if you don't.");
        }

        public String toString() {
            String valueOf = String.valueOf(nodeU());
            String valueOf2 = String.valueOf(nodeV());
            StringBuilder m21223m = CredentialConfig$$ExternalSyntheticOutline0.m21223m(valueOf2.length() + valueOf.length() + 4, MarkdownConstants.LEFT_BRACKET, valueOf, ", ", valueOf2);
            m21223m.append(MarkdownConstants.RIGHT_BRACKET);
            return m21223m.toString();
        }
    }

    private EndpointPair(N n, N n2) {
        this.nodeU = (N) Preconditions.checkNotNull(n);
        this.nodeV = (N) Preconditions.checkNotNull(n2);
    }

    public static <N> EndpointPair<N> of(Graph<?> graph, N n, N n2) {
        return graph.isDirected() ? ordered(n, n2) : unordered(n, n2);
    }

    public static <N> EndpointPair<N> ordered(N n, N n2) {
        return new Ordered(n, n2);
    }

    public static <N> EndpointPair<N> unordered(N n, N n2) {
        return new Unordered(n2, n);
    }

    public final N adjacentNode(N n) {
        boolean equals = n.equals(this.nodeU);
        N n2 = this.nodeV;
        if (equals) {
            return n2;
        }
        if (n.equals(n2)) {
            return this.nodeU;
        }
        String valueOf = String.valueOf(this);
        String valueOf2 = String.valueOf(n);
        Single$$ExternalSyntheticBUOutline0.m$3(CredentialConfig$$ExternalSyntheticOutline0.m(valueOf2.length() + valueOf.length() + 36, "EndpointPair ", valueOf, " does not contain node ", valueOf2));
        return null;
    }

    public abstract boolean equals(@CheckForNull Object obj);

    public abstract int hashCode();

    public abstract boolean isOrdered();

    @Override // java.lang.Iterable
    public final UnmodifiableIterator<N> iterator() {
        return Iterators.forArray(this.nodeU, this.nodeV);
    }

    public final N nodeU() {
        return this.nodeU;
    }

    public final N nodeV() {
        return this.nodeV;
    }

    public abstract N source();

    public abstract N target();

    public static <N> EndpointPair<N> of(Network<?, ?> network, N n, N n2) {
        return network.isDirected() ? ordered(n, n2) : unordered(n, n2);
    }
}
