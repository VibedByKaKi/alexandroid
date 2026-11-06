package org.openjdk.tools.javac.comp;

import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import org.openjdk.tools.javac.code.Lint;
import org.openjdk.tools.javac.code.Scope;
import org.openjdk.tools.javac.code.Symbol;
import org.openjdk.tools.javac.code.Type;
import org.openjdk.tools.javac.comp.Attr;
import org.openjdk.tools.javac.comp.Resolve;
import org.openjdk.tools.javac.tree.JCTree;
import org.openjdk.tools.javac.util.List;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes12.dex */
public class AttrContext {
    Lint lint;
    JCTree preferredTreeForDiagnostics;
    Scope.WriteableScope scope = null;
    int staticLevel = 0;
    boolean isSelfCall = false;
    boolean selectSuper = false;
    boolean isSerializable = false;
    boolean isLambda = false;
    boolean isSpeculative = false;
    boolean isAnonymousDiamond = false;
    boolean isNewClass = false;
    boolean visitingServiceImplementation = false;
    Resolve.MethodResolutionPhase pendingResolutionPhase = null;
    Symbol enclVar = null;
    Attr.ResultInfo returnResult = null;
    Type defaultSuperCallSite = null;

    public AttrContext dup(Scope.WriteableScope writeableScope) {
        AttrContext attrContext = new AttrContext();
        attrContext.scope = writeableScope;
        attrContext.staticLevel = this.staticLevel;
        attrContext.isSelfCall = this.isSelfCall;
        attrContext.selectSuper = this.selectSuper;
        attrContext.pendingResolutionPhase = this.pendingResolutionPhase;
        attrContext.lint = this.lint;
        attrContext.enclVar = this.enclVar;
        attrContext.returnResult = this.returnResult;
        attrContext.defaultSuperCallSite = this.defaultSuperCallSite;
        attrContext.isSerializable = this.isSerializable;
        attrContext.isLambda = this.isLambda;
        attrContext.isSpeculative = this.isSpeculative;
        attrContext.isAnonymousDiamond = this.isAnonymousDiamond;
        attrContext.isNewClass = this.isNewClass;
        attrContext.preferredTreeForDiagnostics = this.preferredTreeForDiagnostics;
        attrContext.visitingServiceImplementation = this.visitingServiceImplementation;
        return attrContext;
    }

    public Iterable<Symbol> getLocalElements() {
        Scope.WriteableScope writeableScope = this.scope;
        return writeableScope == null ? List.nil() : writeableScope.getSymbols();
    }

    public boolean lastResolveVarargs() {
        Resolve.MethodResolutionPhase methodResolutionPhase = this.pendingResolutionPhase;
        return methodResolutionPhase != null && methodResolutionPhase.isVarargsRequired();
    }

    public String toString() {
        return "AttrContext[" + this.scope.toString() + MarkdownConstants.RIGHT_BRACKET;
    }

    public AttrContext dup() {
        return dup(this.scope);
    }
}
