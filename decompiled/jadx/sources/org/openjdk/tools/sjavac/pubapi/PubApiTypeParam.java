package org.openjdk.tools.sjavac.pubapi;

import androidx.biometric.ErrorUtils$$ExternalSyntheticOutline0;
import java.io.Serializable;
import java.util.List;
import java.util.stream.Collectors;
import org.openjdk.tools.sjavac.Util$$ExternalSyntheticLambda0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes12.dex */
public class PubApiTypeParam implements Serializable {
    private static final long serialVersionUID = 8899204612014329162L;
    private final List<TypeDesc> bounds;
    private final String identifier;

    public PubApiTypeParam(String str, List<TypeDesc> list) {
        this.identifier = str;
        this.bounds = list;
    }

    public String asString() {
        if (this.bounds.isEmpty()) {
            return this.identifier;
        }
        return ErrorUtils$$ExternalSyntheticOutline0.m(new StringBuilder(), this.identifier, " extends ", (String) this.bounds.stream().map(new Util$$ExternalSyntheticLambda0(6)).collect(Collectors.joining(" & ")));
    }

    public boolean equals(Object obj) {
        if (getClass() != obj.getClass()) {
            return false;
        }
        PubApiTypeParam pubApiTypeParam = (PubApiTypeParam) obj;
        return this.identifier.equals(pubApiTypeParam.identifier) && this.bounds.equals(pubApiTypeParam.bounds);
    }

    public int hashCode() {
        return this.bounds.hashCode() ^ this.identifier.hashCode();
    }

    public String toString() {
        return String.format("%s[id: %s, bounds: %s]", getClass().getSimpleName(), this.identifier, this.bounds);
    }
}
