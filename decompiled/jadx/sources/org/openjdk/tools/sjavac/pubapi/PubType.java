package org.openjdk.tools.sjavac.pubapi;

import java.io.Serializable;
import java.util.Set;
import org.openjdk.javax.lang.model.element.Modifier;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes12.dex */
public class PubType implements Serializable {
    private static final long serialVersionUID = -7423416049253889793L;
    public final String fqName;
    public final Set<Modifier> modifiers;
    public final PubApi pubApi;

    public PubType(Set<Modifier> set, String str, PubApi pubApi) {
        this.modifiers = set;
        this.fqName = str;
        this.pubApi = pubApi;
    }

    public boolean equals(Object obj) {
        if (getClass() != obj.getClass()) {
            return false;
        }
        PubType pubType = (PubType) obj;
        return this.modifiers.equals(pubType.modifiers) && this.fqName.equals(pubType.fqName) && this.pubApi.equals(pubType.pubApi);
    }

    public String getFqName() {
        return this.fqName.toString();
    }

    public int hashCode() {
        return this.pubApi.hashCode() ^ (this.modifiers.hashCode() ^ this.fqName.hashCode());
    }

    public String toString() {
        return String.format("%s[modifiers: %s, fqName: %s, pubApi: %s]", getClass().getSimpleName(), this.modifiers, this.fqName, this.pubApi);
    }
}
