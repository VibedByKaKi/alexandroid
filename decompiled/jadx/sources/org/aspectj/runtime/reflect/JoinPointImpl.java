package org.aspectj.runtime.reflect;

import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.reflect.SourceLocation;
import org.aspectj.runtime.internal.AroundClosure;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes11.dex */
class JoinPointImpl implements ProceedingJoinPoint {
    Object _this;
    private AroundClosure arc;
    Object[] args;
    JoinPoint.StaticPart staticPart;
    Object target;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class EnclosingStaticPartImpl extends StaticPartImpl implements JoinPoint.EnclosingStaticPart {
        public EnclosingStaticPartImpl(int i, String str, Signature signature, SourceLocation sourceLocation) {
            super(i, str, signature, sourceLocation);
        }
    }

    public JoinPointImpl(JoinPoint.StaticPart staticPart, Object obj, Object obj2, Object[] objArr) {
        this.staticPart = staticPart;
        this._this = obj;
        this.target = obj2;
        this.args = objArr;
    }

    @Override // org.aspectj.lang.JoinPoint
    public Object[] getArgs() {
        if (this.args == null) {
            this.args = new Object[0];
        }
        Object[] objArr = this.args;
        Object[] objArr2 = new Object[objArr.length];
        System.arraycopy(objArr, 0, objArr2, 0, objArr.length);
        return objArr2;
    }

    @Override // org.aspectj.lang.JoinPoint
    public String getKind() {
        return this.staticPart.getKind();
    }

    @Override // org.aspectj.lang.JoinPoint
    public Signature getSignature() {
        return this.staticPart.getSignature();
    }

    @Override // org.aspectj.lang.JoinPoint
    public SourceLocation getSourceLocation() {
        return this.staticPart.getSourceLocation();
    }

    @Override // org.aspectj.lang.JoinPoint
    public JoinPoint.StaticPart getStaticPart() {
        return this.staticPart;
    }

    @Override // org.aspectj.lang.JoinPoint
    public Object getTarget() {
        return this.target;
    }

    @Override // org.aspectj.lang.JoinPoint
    public Object getThis() {
        return this._this;
    }

    @Override // org.aspectj.lang.ProceedingJoinPoint
    public Object proceed(Object[] objArr) throws Throwable {
        int i;
        AroundClosure aroundClosure = this.arc;
        if (aroundClosure == null) {
            return null;
        }
        int flags = aroundClosure.getFlags();
        int i2 = 0;
        boolean z = (65536 & flags) != 0;
        int i3 = (flags & 4096) != 0 ? 1 : 0;
        int i4 = (flags & 256) != 0 ? 1 : 0;
        boolean z2 = (flags & 16) != 0;
        boolean z3 = (flags & 1) != 0;
        Object[] state = this.arc.getState();
        int i5 = ((!z2 || z) ? 0 : 1) + i3;
        if (i3 == 0 || i4 == 0) {
            i = 0;
        } else {
            state[0] = objArr[0];
            i = 1;
        }
        if (z2 && z3) {
            if (z) {
                i = i4 + 1;
                state[0] = objArr[i4];
            } else {
                char c = (i3 == 0 || i4 == 0) ? (char) 0 : (char) 1;
                int i6 = (i3 == 0 || i4 == 0) ? 0 : 1;
                if (z2 && z3 && !z) {
                    i2 = 1;
                }
                state[i3] = objArr[c];
                i = i6 + i2;
            }
        }
        for (int i7 = i; i7 < objArr.length; i7++) {
            state[(i7 - i) + i5] = objArr[i7];
        }
        return this.arc.run(state);
    }

    @Override // org.aspectj.lang.ProceedingJoinPoint
    public void set$AroundClosure(AroundClosure aroundClosure) {
        this.arc = aroundClosure;
    }

    @Override // org.aspectj.lang.JoinPoint
    public final String toLongString() {
        return this.staticPart.toLongString();
    }

    @Override // org.aspectj.lang.JoinPoint
    public final String toShortString() {
        return this.staticPart.toShortString();
    }

    @Override // org.aspectj.lang.JoinPoint
    public final String toString() {
        return this.staticPart.toString();
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class StaticPartImpl implements JoinPoint.StaticPart {
        private int id;
        String kind;
        Signature signature;
        SourceLocation sourceLocation;

        public StaticPartImpl(int i, String str, Signature signature, SourceLocation sourceLocation) {
            this.kind = str;
            this.signature = signature;
            this.sourceLocation = sourceLocation;
            this.id = i;
        }

        @Override // org.aspectj.lang.JoinPoint.StaticPart
        public int getId() {
            return this.id;
        }

        @Override // org.aspectj.lang.JoinPoint.StaticPart
        public String getKind() {
            return this.kind;
        }

        @Override // org.aspectj.lang.JoinPoint.StaticPart
        public Signature getSignature() {
            return this.signature;
        }

        @Override // org.aspectj.lang.JoinPoint.StaticPart
        public SourceLocation getSourceLocation() {
            return this.sourceLocation;
        }

        @Override // org.aspectj.lang.JoinPoint.StaticPart
        public final String toLongString() {
            return toString(StringMaker.longStringMaker);
        }

        @Override // org.aspectj.lang.JoinPoint.StaticPart
        public final String toShortString() {
            return toString(StringMaker.shortStringMaker);
        }

        public String toString(StringMaker stringMaker) {
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append(stringMaker.makeKindName(getKind()));
            stringBuffer.append(MarkdownConstants.LEFT_PARENTHESIS);
            stringBuffer.append(((SignatureImpl) getSignature()).toString(stringMaker));
            stringBuffer.append(MarkdownConstants.RIGHT_PARENTHESIS);
            return stringBuffer.toString();
        }

        @Override // org.aspectj.lang.JoinPoint.StaticPart
        public final String toString() {
            return toString(StringMaker.middleStringMaker);
        }
    }

    @Override // org.aspectj.lang.ProceedingJoinPoint
    public Object proceed() throws Throwable {
        AroundClosure aroundClosure = this.arc;
        if (aroundClosure == null) {
            return null;
        }
        return aroundClosure.run(aroundClosure.getState());
    }
}
