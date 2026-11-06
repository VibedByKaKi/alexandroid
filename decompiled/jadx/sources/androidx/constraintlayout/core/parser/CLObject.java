package androidx.constraintlayout.core.parser;

import androidx.annotation.NonNull;
import java.util.Iterator;
import org.apache.commons.text.StringSubstitutor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes13.dex */
public class CLObject extends CLContainer implements Iterable<CLKey> {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class CLObjectIterator implements Iterator<CLKey> {
        int mIndex = 0;
        CLObject mObject;

        public CLObjectIterator(CLObject cLObject) {
            this.mObject = cLObject;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.mIndex < this.mObject.size();
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // java.util.Iterator
        public CLKey next() {
            CLKey cLKey = (CLKey) this.mObject.mElements.get(this.mIndex);
            this.mIndex++;
            return cLKey;
        }
    }

    public CLObject(char[] cArr) {
        super(cArr);
    }

    public static CLObject allocate(char[] cArr) {
        return new CLObject(cArr);
    }

    @Override // androidx.constraintlayout.core.parser.CLContainer, androidx.constraintlayout.core.parser.CLElement
    @NonNull
    /* renamed from: clone */
    public CLObject mo7626clone() {
        return (CLObject) super.mo7626clone();
    }

    @Override // java.lang.Iterable
    public Iterator<CLKey> iterator() {
        return new CLObjectIterator(this);
    }

    @Override // androidx.constraintlayout.core.parser.CLElement
    public String toFormattedJSON(int i, int i2) {
        StringBuilder sb = new StringBuilder(getDebugName());
        sb.append("{\n");
        Iterator<CLElement> it2 = this.mElements.iterator();
        boolean z = true;
        while (it2.hasNext()) {
            CLElement next = it2.next();
            if (z) {
                z = false;
            } else {
                sb.append(",\n");
            }
            sb.append(next.toFormattedJSON(CLElement.sBaseIndent + i, i2 - 1));
        }
        sb.append("\n");
        addIndent(sb, i);
        sb.append(StringSubstitutor.DEFAULT_VAR_END);
        return sb.toString();
    }

    @Override // androidx.constraintlayout.core.parser.CLElement
    public String toJSON() {
        StringBuilder sb = new StringBuilder(getDebugName() + "{ ");
        Iterator<CLElement> it2 = this.mElements.iterator();
        boolean z = true;
        while (it2.hasNext()) {
            CLElement next = it2.next();
            if (z) {
                z = false;
            } else {
                sb.append(", ");
            }
            sb.append(next.toJSON());
        }
        sb.append(" }");
        return sb.toString();
    }

    public String toFormattedJSON() {
        return toFormattedJSON(0, 0);
    }
}
