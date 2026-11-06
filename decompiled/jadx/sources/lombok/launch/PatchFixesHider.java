package lombok.launch;

import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.facebook.react.uimanager.ViewProps;
import defpackage.a$$ExternalSyntheticOutline0;
import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.security.CodeSource;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Stack;
import lombok.eclipse.EcjAugments;
import lombok.eclipse.handlers.EclipseHandlerUtil;
import lombok.permit.Permit;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.adaptor.EclipseStarter;
import org.eclipse.jdt.core.IAnnotatable;
import org.eclipse.jdt.core.IAnnotation;
import org.eclipse.jdt.core.IJavaElement;
import org.eclipse.jdt.core.IMember;
import org.eclipse.jdt.core.IMethod;
import org.eclipse.jdt.core.ISourceRange;
import org.eclipse.jdt.core.IType;
import org.eclipse.jdt.core.JavaModelException;
import org.eclipse.jdt.core.Signature;
import org.eclipse.jdt.core.dom.AST;
import org.eclipse.jdt.core.dom.ASTVisitor;
import org.eclipse.jdt.core.dom.AbstractTypeDeclaration;
import org.eclipse.jdt.core.dom.Annotation;
import org.eclipse.jdt.core.dom.CompilationUnit;
import org.eclipse.jdt.core.dom.IMethodBinding;
import org.eclipse.jdt.core.dom.MethodDeclaration;
import org.eclipse.jdt.core.dom.Name;
import org.eclipse.jdt.core.dom.NodeFinder;
import org.eclipse.jdt.core.dom.NormalAnnotation;
import org.eclipse.jdt.core.dom.QualifiedName;
import org.eclipse.jdt.core.dom.ReturnStatement;
import org.eclipse.jdt.core.dom.SimpleName;
import org.eclipse.jdt.core.dom.SingleMemberAnnotation;
import org.eclipse.jdt.core.dom.SingleVariableDeclaration;
import org.eclipse.jdt.core.dom.Type;
import org.eclipse.jdt.core.dom.rewrite.ListRewrite;
import org.eclipse.jdt.core.search.SearchMatch;
import org.eclipse.jdt.internal.compiler.ISourceElementRequestor;
import org.eclipse.jdt.internal.compiler.ast.ASTNode;
import org.eclipse.jdt.internal.compiler.ast.AbstractMethodDeclaration;
import org.eclipse.jdt.internal.compiler.ast.AbstractVariableDeclaration;
import org.eclipse.jdt.internal.compiler.ast.Expression;
import org.eclipse.jdt.internal.compiler.ast.FieldDeclaration;
import org.eclipse.jdt.internal.compiler.ast.LocalDeclaration;
import org.eclipse.jdt.internal.compiler.ast.TypeDeclaration;
import org.eclipse.jdt.internal.compiler.lookup.BlockScope;
import org.eclipse.jdt.internal.compiler.lookup.TypeBinding;
import org.eclipse.jdt.internal.compiler.parser.Parser;
import org.eclipse.jdt.internal.core.CompilationUnitStructureRequestor;
import org.eclipse.jdt.internal.core.SourceField;
import org.eclipse.jdt.internal.core.SourceFieldElementInfo;
import org.eclipse.jdt.internal.core.dom.rewrite.NodeRewriteEvent;
import org.eclipse.jdt.internal.core.dom.rewrite.RewriteEvent;
import org.eclipse.jdt.internal.core.dom.rewrite.TokenScanner;
import org.eclipse.jdt.internal.corext.refactoring.SearchResultGroup;
import org.eclipse.jdt.internal.corext.refactoring.code.CallContext;
import org.eclipse.jdt.internal.corext.refactoring.code.SourceProvider;
import org.eclipse.jdt.internal.corext.refactoring.structure.MemberVisibilityAdjustor;
import org.osgi.framework.Bundle;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes10.dex */
final class PatchFixesHider {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class Delegate {
        private static final Method ADD_GENERATED_DELEGATE_METHODS;
        private static final Method HANDLE_DELEGATE_FOR_TYPE;
        public static final Method IS_DELEGATE_SOURCE_METHOD;
        public static final Method RETURN_ELEMENT_INFO;

        static {
            Class<?> shadowLoadClass = Util.shadowLoadClass("lombok.eclipse.agent.PatchDelegatePortal");
            HANDLE_DELEGATE_FOR_TYPE = Util.findMethod(shadowLoadClass, "handleDelegateForType", (Class<?>[]) new Class[]{Object.class});
            ADD_GENERATED_DELEGATE_METHODS = Util.findMethod(shadowLoadClass, "addGeneratedDelegateMethods", (Class<?>[]) new Class[]{Object.class, Object.class});
            Class<?> shadowLoadClass2 = Util.shadowLoadClass("lombok.eclipse.agent.PatchDelegate");
            IS_DELEGATE_SOURCE_METHOD = Util.findMethod(shadowLoadClass2, "isDelegateSourceMethod", (Class<?>[]) new Class[]{Object.class});
            RETURN_ELEMENT_INFO = Util.findMethod(shadowLoadClass2, "returnElementInfo", (Class<?>[]) new Class[]{Object.class});
        }

        public static Object[] addGeneratedDelegateMethods(Object obj, Object obj2) {
            return (Object[]) Util.invokeMethod(ADD_GENERATED_DELEGATE_METHODS, obj, obj2);
        }

        public static boolean handleDelegateForType(Object obj) {
            return ((Boolean) Util.invokeMethod(HANDLE_DELEGATE_FOR_TYPE, obj)).booleanValue();
        }

        public static boolean isDelegateSourceMethod(Object obj) {
            return ((Boolean) Util.invokeMethod(IS_DELEGATE_SOURCE_METHOD, obj)).booleanValue();
        }

        public static Object returnElementInfo(Object obj) {
            return Util.invokeMethod(RETURN_ELEMENT_INFO, obj);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class FieldInitializer {
        public static final Field FIELD_INFO;
        public static final Field INFO_STACK;
        public static final Field INITIALIZATION_SOURCE;
        public static final boolean INITIALIZED;
        public static final Field NODE;
        public static final Field SOURCE_FIELD_ELEMENT_INFO;

        static {
            Field permissiveGetField = Permit.permissiveGetField(CompilationUnitStructureRequestor.class, "infoStack");
            INFO_STACK = permissiveGetField;
            Field permissiveGetField2 = Permit.permissiveGetField(CompilationUnitStructureRequestor.class, "$fieldInfo");
            FIELD_INFO = permissiveGetField2;
            Field permissiveGetField3 = Permit.permissiveGetField(CompilationUnitStructureRequestor.class, "$sourceFieldElementInfo");
            SOURCE_FIELD_ELEMENT_INFO = permissiveGetField3;
            Field permissiveGetField4 = Permit.permissiveGetField(SourceFieldElementInfo.class, "initializationSource");
            INITIALIZATION_SOURCE = permissiveGetField4;
            Field permissiveGetField5 = Permit.permissiveGetField(ISourceElementRequestor.FieldInfo.class, "node");
            NODE = permissiveGetField5;
            INITIALIZED = (permissiveGetField == null || permissiveGetField2 == null || permissiveGetField3 == null || permissiveGetField4 == null || permissiveGetField5 == null) ? false : true;
        }

        public static void overwriteInitializer(CompilationUnitStructureRequestor compilationUnitStructureRequestor) {
            try {
                if (INITIALIZED) {
                    Field field = FIELD_INFO;
                    ISourceElementRequestor.FieldInfo fieldInfo = (ISourceElementRequestor.FieldInfo) Permit.get(field, compilationUnitStructureRequestor);
                    Permit.set(field, compilationUnitStructureRequestor, (Object) null);
                    Field field2 = SOURCE_FIELD_ELEMENT_INFO;
                    SourceFieldElementInfo sourceFieldElementInfo = (SourceFieldElementInfo) Permit.get(field2, compilationUnitStructureRequestor);
                    Permit.set(field2, compilationUnitStructureRequestor, (Object) null);
                    if (sourceFieldElementInfo.getInitializationSource() != null) {
                        AbstractVariableDeclaration abstractVariableDeclaration = (AbstractVariableDeclaration) Permit.get(NODE, fieldInfo);
                        if (PatchFixes.isGenerated((ASTNode) abstractVariableDeclaration)) {
                            Permit.set(INITIALIZATION_SOURCE, sourceFieldElementInfo, abstractVariableDeclaration.initialization.toString().toCharArray());
                        }
                    }
                }
            } catch (Exception unused) {
            }
        }

        public static boolean storeFieldInfo(CompilationUnitStructureRequestor compilationUnitStructureRequestor) {
            try {
                if (!INITIALIZED) {
                    return false;
                }
                Permit.set(FIELD_INFO, compilationUnitStructureRequestor, ((Stack) Permit.get(INFO_STACK, compilationUnitStructureRequestor)).peek());
                return false;
            } catch (Exception unused) {
                return false;
            }
        }

        public static void storeSourceFieldElementInfo(SourceFieldElementInfo sourceFieldElementInfo, CompilationUnitStructureRequestor compilationUnitStructureRequestor) {
            try {
                if (INITIALIZED) {
                    Permit.set(SOURCE_FIELD_ELEMENT_INFO, compilationUnitStructureRequestor, sourceFieldElementInfo);
                }
            } catch (Exception unused) {
            }
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class ModuleClassLoading {
        public static void parserClinit() {
            Util.prependToClassLoader(ModuleClassLoading.class.getClassLoader(), Util.findJdtCoreClassLoader(Parser.class.getClassLoader()));
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class Transform {
        private static Method TRANSFORM;
        private static Method TRANSFORM_SWAPPED;

        private static synchronized void init(ClassLoader classLoader) {
            synchronized (Transform.class) {
                if (TRANSFORM != null) {
                    return;
                }
                Main.prependClassLoader(classLoader);
                Util.prependToClassLoader(Transform.class.getClassLoader(), classLoader);
                Class<?> shadowLoadClass = Util.shadowLoadClass("lombok.eclipse.TransformEclipseAST");
                TRANSFORM = Util.findMethodAnyArgs(shadowLoadClass, ViewProps.TRANSFORM);
                TRANSFORM_SWAPPED = Util.findMethodAnyArgs(shadowLoadClass, "transform_swapped");
            }
        }

        public static void transform(Object obj, Object obj2) throws IOException {
            init(obj.getClass().getClassLoader());
            Util.invokeMethod(TRANSFORM, obj, obj2);
        }

        public static void transform_swapped(Object obj, Object obj2) throws IOException {
            init(obj2.getClass().getClassLoader());
            Util.invokeMethod(TRANSFORM_SWAPPED, obj, obj2);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class Val {
        private static final String BLOCK_SCOPE_SIG = "org.eclipse.jdt.internal.compiler.lookup.BlockScope";
        private static final String FOREACH_STATEMENT_SIG = "org.eclipse.jdt.internal.compiler.ast.ForeachStatement";
        private static final Method HANDLE_VAL_FOR_FOR_EACH;
        private static final Method HANDLE_VAL_FOR_LOCAL_DECLARATION;
        private static final String LOCAL_DECLARATION_SIG = "org.eclipse.jdt.internal.compiler.ast.LocalDeclaration";

        static {
            Class<?> shadowLoadClass = Util.shadowLoadClass("lombok.eclipse.agent.PatchVal");
            HANDLE_VAL_FOR_LOCAL_DECLARATION = Util.findMethod(shadowLoadClass, "handleValForLocalDeclaration", LOCAL_DECLARATION_SIG, BLOCK_SCOPE_SIG);
            HANDLE_VAL_FOR_FOR_EACH = Util.findMethod(shadowLoadClass, "handleValForForEach", FOREACH_STATEMENT_SIG, BLOCK_SCOPE_SIG);
        }

        public static boolean handleValForForEach(Object obj, Object obj2) {
            return ((Boolean) Util.invokeMethod(HANDLE_VAL_FOR_FOR_EACH, obj, obj2)).booleanValue();
        }

        public static boolean handleValForLocalDeclaration(Object obj, Object obj2) {
            return ((Boolean) Util.invokeMethod(HANDLE_VAL_FOR_LOCAL_DECLARATION, obj, obj2)).booleanValue();
        }

        public static TypeBinding skipResolveInitializerIfAlreadyCalled(Expression expression, BlockScope blockScope) {
            if (expression.resolvedType != null) {
                return expression.resolvedType;
            }
            try {
                return expression.resolveType(blockScope);
            } catch (ArrayIndexOutOfBoundsException | NullPointerException unused) {
                return null;
            }
        }

        public static TypeBinding skipResolveInitializerIfAlreadyCalled2(Expression expression, BlockScope blockScope, LocalDeclaration localDeclaration) {
            if (localDeclaration != null && LocalDeclaration.class.equals(localDeclaration.getClass()) && expression.resolvedType != null) {
                return expression.resolvedType;
            }
            try {
                return expression.resolveType(blockScope);
            } catch (ArrayIndexOutOfBoundsException | NullPointerException unused) {
                return null;
            }
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class ValPortal {
        private static final Method ADD_FINAL_AND_VAL_ANNOTATION_TO_SINGLE_VARIABLE_DECLARATION;
        private static final Method ADD_FINAL_AND_VAL_ANNOTATION_TO_VARIABLE_DECLARATION_STATEMENT;
        private static final Method COPY_INITIALIZATION_OF_FOR_EACH_ITERABLE;
        private static final Method COPY_INITIALIZATION_OF_LOCAL_DECLARATION;

        static {
            Class<?> shadowLoadClass = Util.shadowLoadClass("lombok.eclipse.agent.PatchValEclipsePortal");
            COPY_INITIALIZATION_OF_FOR_EACH_ITERABLE = Util.findMethod(shadowLoadClass, "copyInitializationOfForEachIterable", (Class<?>[]) new Class[]{Object.class});
            COPY_INITIALIZATION_OF_LOCAL_DECLARATION = Util.findMethod(shadowLoadClass, "copyInitializationOfLocalDeclaration", (Class<?>[]) new Class[]{Object.class});
            ADD_FINAL_AND_VAL_ANNOTATION_TO_VARIABLE_DECLARATION_STATEMENT = Util.findMethod(shadowLoadClass, "addFinalAndValAnnotationToVariableDeclarationStatement", (Class<?>[]) new Class[]{Object.class, Object.class, Object.class});
            ADD_FINAL_AND_VAL_ANNOTATION_TO_SINGLE_VARIABLE_DECLARATION = Util.findMethod(shadowLoadClass, "addFinalAndValAnnotationToSingleVariableDeclaration", (Class<?>[]) new Class[]{Object.class, Object.class, Object.class});
        }

        public static void addFinalAndValAnnotationToSingleVariableDeclaration(Object obj, Object obj2, Object obj3) {
            Util.invokeMethod(ADD_FINAL_AND_VAL_ANNOTATION_TO_SINGLE_VARIABLE_DECLARATION, obj, obj2, obj3);
        }

        public static void addFinalAndValAnnotationToVariableDeclarationStatement(Object obj, Object obj2, Object obj3) {
            Util.invokeMethod(ADD_FINAL_AND_VAL_ANNOTATION_TO_VARIABLE_DECLARATION_STATEMENT, obj, obj2, obj3);
        }

        public static void copyInitializationOfForEachIterable(Object obj) {
            Util.invokeMethod(COPY_INITIALIZATION_OF_FOR_EACH_ITERABLE, obj);
        }

        public static void copyInitializationOfLocalDeclaration(Object obj) {
            Util.invokeMethod(COPY_INITIALIZATION_OF_LOCAL_DECLARATION, obj);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class ExtensionMethod {
        private static final String AST_NODE_SIG = "org.eclipse.jdt.internal.compiler.ast.ASTNode";
        private static final String BLOCK_SCOPE_SIG = "org.eclipse.jdt.internal.compiler.lookup.BlockScope";
        private static final Method ERROR_NO_METHOD_FOR;
        private static final Method INVALID_METHOD;
        private static final Method INVALID_METHOD2;
        private static final String MESSAGE_SEND_SIG = "org.eclipse.jdt.internal.compiler.ast.MessageSend";
        private static final String METHOD_BINDING_SIG = "org.eclipse.jdt.internal.compiler.lookup.MethodBinding";
        private static final Method MODIFY_METHOD_PATTERN;
        private static final Method NON_STATIC_ACCESS_TO_STATIC_METHOD;
        private static final String PROBLEM_REPORTER_SIG = "org.eclipse.jdt.internal.compiler.problem.ProblemReporter";
        private static final Method RESOLVE_TYPE;
        private static final String SCOPE_SIG = "org.eclipse.jdt.internal.compiler.lookup.Scope";
        private static final String TYPE_BINDINGS_SIG = "[Lorg.eclipse.jdt.internal.compiler.lookup.TypeBinding;";
        private static final String TYPE_BINDING_SIG = "org.eclipse.jdt.internal.compiler.lookup.TypeBinding";

        static {
            Class<?> shadowLoadClass = Util.shadowLoadClass("lombok.eclipse.agent.PatchExtensionMethod");
            RESOLVE_TYPE = Util.findMethod(shadowLoadClass, "resolveType", TYPE_BINDING_SIG, MESSAGE_SEND_SIG, BLOCK_SCOPE_SIG);
            ERROR_NO_METHOD_FOR = Util.findMethod(shadowLoadClass, "errorNoMethodFor", PROBLEM_REPORTER_SIG, MESSAGE_SEND_SIG, TYPE_BINDING_SIG, TYPE_BINDINGS_SIG);
            INVALID_METHOD = Util.findMethod(shadowLoadClass, "invalidMethod", PROBLEM_REPORTER_SIG, MESSAGE_SEND_SIG, METHOD_BINDING_SIG);
            INVALID_METHOD2 = Util.findMethod(shadowLoadClass, "invalidMethod", PROBLEM_REPORTER_SIG, MESSAGE_SEND_SIG, METHOD_BINDING_SIG, SCOPE_SIG);
            NON_STATIC_ACCESS_TO_STATIC_METHOD = Util.findMethod(shadowLoadClass, "nonStaticAccessToStaticMethod", PROBLEM_REPORTER_SIG, AST_NODE_SIG, METHOD_BINDING_SIG, MESSAGE_SEND_SIG);
            MODIFY_METHOD_PATTERN = Util.findMethod(shadowLoadClass, "modifyMethodPattern", (Class<?>[]) new Class[]{Object.class});
        }

        public static void errorNoMethodFor(Object obj, Object obj2, Object obj3, Object obj4) {
            Util.invokeMethod(ERROR_NO_METHOD_FOR, obj, obj2, obj3, obj4);
        }

        public static void invalidMethod(Object obj, Object obj2, Object obj3) {
            Util.invokeMethod(INVALID_METHOD, obj, obj2, obj3);
        }

        public static Object modifyMethodPattern(Object obj) {
            return Util.invokeMethod(MODIFY_METHOD_PATTERN, obj);
        }

        public static void nonStaticAccessToStaticMethod(Object obj, Object obj2, Object obj3, Object obj4) {
            Util.invokeMethod(NON_STATIC_ACCESS_TO_STATIC_METHOD, obj, obj2, obj3, obj4);
        }

        public static Object resolveType(Object obj, Object obj2, Object obj3) {
            return Util.invokeMethod(RESOLVE_TYPE, obj, obj2, obj3);
        }

        public static void invalidMethod(Object obj, Object obj2, Object obj3, Object obj4) {
            Util.invokeMethod(INVALID_METHOD2, obj, obj2, obj3, obj4);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class PatchFixes {
        public static final int ALREADY_PROCESSED_FLAG = 8388608;

        public static void addAnnotations(List<Annotation> list, StringBuilder sb) {
            Iterator<Annotation> it2 = list.iterator();
            while (it2.hasNext()) {
                SingleMemberAnnotation singleMemberAnnotation = (Annotation) it2.next();
                ArrayList arrayList = new ArrayList();
                if (singleMemberAnnotation.isSingleMemberAnnotation()) {
                    arrayList.add(singleMemberAnnotation.getValue().toString());
                } else if (singleMemberAnnotation.isNormalAnnotation()) {
                    Iterator it3 = ((NormalAnnotation) singleMemberAnnotation).values().iterator();
                    while (it3.hasNext()) {
                        arrayList.add(it3.next().toString());
                    }
                }
                sb.append("@");
                sb.append(singleMemberAnnotation.getTypeName().getFullyQualifiedName());
                if (!arrayList.isEmpty()) {
                    sb.append(MarkdownConstants.LEFT_PARENTHESIS);
                    Iterator it4 = arrayList.iterator();
                    boolean z = true;
                    while (it4.hasNext()) {
                        String str = (String) it4.next();
                        if (!z) {
                            sb.append(", ");
                        }
                        sb.append('\"');
                        sb.append(str);
                        sb.append('\"');
                        z = false;
                    }
                    sb.append(MarkdownConstants.RIGHT_PARENTHESIS);
                }
                sb.append(" ");
            }
        }

        public static boolean checkBit24(Object obj) throws Exception {
            return (((Integer) obj.getClass().getField("bits").get(obj)).intValue() & 8388608) != 0;
        }

        public static org.eclipse.jdt.internal.compiler.ast.Annotation[] convertAnnotations(org.eclipse.jdt.internal.compiler.ast.Annotation[] annotationArr, IAnnotatable iAnnotatable) {
            try {
                IAnnotation[] annotations = iAnnotatable.getAnnotations();
                if (annotationArr == null) {
                    return null;
                }
                int i = 0;
                for (int i2 = 0; i2 < annotationArr.length; i2++) {
                    String str = new String(annotationArr[i2].type.getLastToken());
                    int length = annotations.length;
                    int i3 = 0;
                    while (true) {
                        if (i3 >= length) {
                            annotationArr[i2] = null;
                            break;
                        }
                        String elementName = annotations[i3].getElementName();
                        int lastIndexOf = elementName.lastIndexOf(46);
                        if (lastIndexOf > -1) {
                            elementName = elementName.substring(lastIndexOf + 1);
                        }
                        if (elementName.equals(str)) {
                            i++;
                            break;
                        }
                        i3++;
                    }
                }
                if (i >= annotationArr.length) {
                    return annotationArr;
                }
                org.eclipse.jdt.internal.compiler.ast.Annotation[] annotationArr2 = new org.eclipse.jdt.internal.compiler.ast.Annotation[i];
                int i4 = 0;
                for (org.eclipse.jdt.internal.compiler.ast.Annotation annotation : annotationArr) {
                    if (annotation != null) {
                        annotationArr2[i4] = annotation;
                        i4++;
                    }
                }
                return annotationArr2;
            } catch (Exception unused) {
                return annotationArr;
            }
        }

        public static SearchResultGroup[] createFakeSearchResult(SearchResultGroup[] searchResultGroupArr, Object obj) throws Exception {
            Field declaredField;
            if ((searchResultGroupArr != null && searchResultGroupArr.length != 0) || (declaredField = obj.getClass().getDeclaredField("fField")) == null) {
                return searchResultGroupArr;
            }
            declaredField.setAccessible(true);
            return ((SourceField) declaredField.get(obj)).getDeclaringType().getAnnotation("Data") != null ? new SearchResultGroup[]{new SearchResultGroup((IResource) null, new SearchMatch[1])} : searchResultGroupArr;
        }

        public static org.eclipse.jdt.core.dom.ASTNode findGeneratedNode(org.eclipse.jdt.core.dom.ASTNode aSTNode, ISourceRange iSourceRange, IMethodBinding iMethodBinding) {
            org.eclipse.jdt.core.dom.ASTNode perform = NodeFinder.perform(aSTNode, iSourceRange);
            return perform instanceof MethodDeclaration ? perform : ((CompilationUnit) aSTNode).findDeclaringNode(iMethodBinding.getKey());
        }

        public static AbstractTypeDeclaration findTypeDeclaration(IType iType, List<?> list) {
            for (Object obj : list) {
                if (obj instanceof AbstractTypeDeclaration) {
                    AbstractTypeDeclaration abstractTypeDeclaration = (AbstractTypeDeclaration) obj;
                    if (abstractTypeDeclaration.getName().toString().equals(iType.getElementName())) {
                        return abstractTypeDeclaration;
                    }
                }
            }
            return null;
        }

        public static int fixRetrieveEllipsisStartPosition(int i, int i2) {
            return i == -1 ? i2 : i;
        }

        public static int fixRetrieveIdentifierEndPosition(int i, int i2, int i3) {
            return (i != -1 && i >= i2) ? i : i3;
        }

        public static int fixRetrieveProperRightBracketPosition(int i, Type type) {
            if (i != -1 || type == null) {
                return i;
            }
            if (isGenerated((org.eclipse.jdt.core.dom.ASTNode) type)) {
                return (type.getStartPosition() + type.getLength()) - 1;
            }
            return -1;
        }

        public static int fixRetrieveRightBraceOrSemiColonPosition(int i, AbstractMethodDeclaration abstractMethodDeclaration) {
            if (i != -1 || abstractMethodDeclaration == null) {
                return i;
            }
            if (EcjAugments.ASTNode_generatedBy.get(abstractMethodDeclaration) != null) {
                return abstractMethodDeclaration.declarationSourceEnd;
            }
            return -1;
        }

        public static int fixRetrieveStartBlockPosition(int i, int i2) {
            return i == -1 ? i2 : i;
        }

        public static int fixRetrieveStartingCatchPosition(int i, int i2) {
            return i == -1 ? i2 : i;
        }

        public static String[] getRealCodeBlocks(String[] strArr, SourceProvider sourceProvider, CallContext callContext) {
            MethodDeclaration declaration = sourceProvider.getDeclaration();
            if (isGenerated((org.eclipse.jdt.core.dom.ASTNode) declaration)) {
                try {
                    AST ast = declaration.getAST();
                    List parameters = declaration.parameters();
                    for (int i = 0; i < parameters.size(); i++) {
                        Object property = ((SingleVariableDeclaration) parameters.get(i)).getProperty("org.eclipse.jdt.internal.corext.refactoring.code.ParameterData");
                        for (SimpleName simpleName : (List) Permit.get(Permit.permissiveGetField(property.getClass(), "fReferences"), property)) {
                            simpleName.getParent().setStructuralProperty(simpleName.getLocationInParent(), org.eclipse.jdt.core.dom.ASTNode.copySubtree(ast, callContext.arguments[i]));
                        }
                    }
                    StringBuilder sb = new StringBuilder();
                    for (Object obj : declaration.getBody().statements()) {
                        if (callContext.callMode == 41 || !(obj instanceof ReturnStatement)) {
                            sb.append(obj);
                        } else {
                            sb.append(((ReturnStatement) obj).getExpression());
                        }
                    }
                    strArr = new String[]{sb.toString().trim()};
                    return strArr;
                } catch (Throwable unused) {
                }
            }
            return strArr;
        }

        public static MethodDeclaration getRealMethodDeclarationNode(MethodDeclaration methodDeclaration, IMethod iMethod, CompilationUnit compilationUnit) throws JavaModelException {
            if (isGenerated((org.eclipse.jdt.core.dom.ASTNode) methodDeclaration)) {
                Stack stack = new Stack();
                for (IType declaringType = iMethod.getDeclaringType(); declaringType != null; declaringType = declaringType.getDeclaringType()) {
                    stack.push(declaringType);
                }
                AbstractTypeDeclaration findTypeDeclaration = findTypeDeclaration((IType) stack.pop(), compilationUnit.types());
                while (!stack.isEmpty() && findTypeDeclaration != null) {
                    findTypeDeclaration = findTypeDeclaration((IType) stack.pop(), findTypeDeclaration.bodyDeclarations());
                }
                String elementName = iMethod.getElementName();
                ArrayList arrayList = new ArrayList();
                String[] parameterTypes = iMethod.getParameterTypes();
                for (String str : parameterTypes) {
                    arrayList.add(Signature.toString(str));
                }
                if (stack.isEmpty() && findTypeDeclaration != null) {
                    for (Object obj : findTypeDeclaration.bodyDeclarations()) {
                        if (obj instanceof MethodDeclaration) {
                            MethodDeclaration methodDeclaration2 = (MethodDeclaration) obj;
                            if (methodDeclaration2.getName().toString().equals(elementName) && methodDeclaration2.parameters().size() == arrayList.size() && isGenerated((org.eclipse.jdt.core.dom.ASTNode) methodDeclaration2)) {
                                for (int i = 0; i < methodDeclaration2.parameters().size(); i++) {
                                    if (!((SingleVariableDeclaration) methodDeclaration2.parameters().get(i)).getType().toString().equals(arrayList.get(i))) {
                                        break;
                                    }
                                }
                                return methodDeclaration2;
                            }
                        }
                    }
                }
            }
            return methodDeclaration;
        }

        public static String getRealMethodDeclarationSource(String str, Object obj, MethodDeclaration methodDeclaration) throws Exception {
            if (!isGenerated((org.eclipse.jdt.core.dom.ASTNode) methodDeclaration)) {
                return str;
            }
            ArrayList arrayList = new ArrayList();
            for (Object obj2 : methodDeclaration.modifiers()) {
                if (obj2 instanceof Annotation) {
                    Annotation annotation = (Annotation) obj2;
                    String qualifiedName = annotation.resolveTypeBinding().getQualifiedName();
                    if (!"java.lang.Override".equals(qualifiedName) && !"java.lang.SuppressWarnings".equals(qualifiedName)) {
                        arrayList.add(annotation);
                    }
                }
            }
            StringBuilder sb = new StringBuilder();
            addAnnotations(arrayList, sb);
            try {
                if (((Boolean) obj.getClass().getDeclaredField("fPublic").get(obj)).booleanValue()) {
                    sb.append("public ");
                }
                if (((Boolean) obj.getClass().getDeclaredField("fAbstract").get(obj)).booleanValue()) {
                    sb.append("abstract ");
                }
            } catch (Throwable unused) {
            }
            sb.append(methodDeclaration.getReturnType2().toString());
            sb.append(" ");
            sb.append(methodDeclaration.getName().getFullyQualifiedName());
            sb.append(MarkdownConstants.LEFT_PARENTHESIS);
            boolean z = true;
            for (Object obj3 : methodDeclaration.parameters()) {
                if (!z) {
                    sb.append(", ");
                }
                sb.append(obj3);
                z = false;
            }
            sb.append(");");
            return sb.toString();
        }

        public static String getRealNodeSource(String str, ASTNode aSTNode) {
            return !isGenerated(aSTNode) ? str : aSTNode.toString();
        }

        public static int getSourceEndFixed(int i, ASTNode aSTNode) throws Exception {
            ASTNode aSTNode2;
            return (i != -1 || (aSTNode2 = (ASTNode) aSTNode.getClass().getField("$generatedBy").get(aSTNode)) == null) ? i : aSTNode2.sourceEnd;
        }

        public static int getTokenEndOffsetFixed(TokenScanner tokenScanner, int i, int i2, Object obj) throws CoreException {
            boolean z;
            try {
                z = ((Boolean) obj.getClass().getField("$isGenerated").get(obj)).booleanValue();
            } catch (Exception unused) {
                z = false;
            }
            if (z) {
                return -1;
            }
            return tokenScanner.getTokenEndOffset(i, i2);
        }

        public static boolean isBlockedVisitorAndGenerated(org.eclipse.jdt.core.dom.ASTNode aSTNode, ASTVisitor aSTVisitor) {
            if (aSTVisitor == null) {
                return false;
            }
            String name = aSTVisitor.getClass().getName();
            if ((name.startsWith("org.eclipse.jdt.internal.corext.fix") || name.startsWith("org.eclipse.jdt.internal.ui.fix") || name.startsWith("org.eclipse.jdt.ls.core.internal.semantictokens.SemanticTokensVisitor")) && !name.equals("org.eclipse.jdt.internal.corext.fix.VariableDeclarationFixCore$WrittenNamesFinder")) {
                return isGenerated(aSTNode);
            }
            return false;
        }

        public static boolean isEmpty(char[] cArr) {
            return cArr.length == 0;
        }

        public static boolean isGenerated(org.eclipse.jdt.core.dom.ASTNode aSTNode) {
            try {
                boolean booleanValue = ((Boolean) aSTNode.getClass().getField("$isGenerated").get(aSTNode)).booleanValue();
                if (!booleanValue) {
                    try {
                        if (aSTNode.getParent() != null && (aSTNode.getParent() instanceof QualifiedName)) {
                            return isGenerated(aSTNode.getParent());
                        }
                    } catch (Exception unused) {
                        return booleanValue;
                    }
                }
                return booleanValue;
            } catch (Exception unused2) {
                return false;
            }
        }

        public static boolean isListRewriteOnGeneratedNode(ListRewrite listRewrite) {
            return isGenerated(listRewrite.getParent());
        }

        public static RewriteEvent[] listRewriteHandleGeneratedMethods(RewriteEvent rewriteEvent) {
            RewriteEvent[] children = rewriteEvent.getChildren();
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            for (RewriteEvent rewriteEvent2 : children) {
                if (isGenerated((org.eclipse.jdt.core.dom.ASTNode) rewriteEvent2.getOriginalValue())) {
                    boolean z = rewriteEvent2.getChangeKind() == 4 || rewriteEvent2.getChangeKind() == 2;
                    boolean z2 = rewriteEvent2.getOriginalValue() instanceof MethodDeclaration;
                    if (z && z2 && rewriteEvent2.getNewValue() != null) {
                        arrayList2.add(new NodeRewriteEvent((Object) null, rewriteEvent2.getNewValue()));
                    }
                } else {
                    arrayList.add(rewriteEvent2);
                }
            }
            arrayList.addAll(arrayList2);
            return (RewriteEvent[]) arrayList.toArray(new RewriteEvent[0]);
        }

        public static IMethod[] removeGeneratedMethods(IMethod[] iMethodArr) throws Exception {
            ArrayList arrayList = new ArrayList();
            for (IMethod iMethod : iMethodArr) {
                if (!isGenerated((IMember) iMethod)) {
                    arrayList.add(iMethod);
                }
            }
            return arrayList.size() == iMethodArr.length ? iMethodArr : (IMethod[]) arrayList.toArray(new IMethod[0]);
        }

        public static Name[] removeGeneratedNames(Name[] nameArr) throws Exception {
            Field field = Name.class.getField("$isGenerated");
            int i = 0;
            for (Name name : nameArr) {
                if (name == null || !((Boolean) field.get(name)).booleanValue()) {
                    i++;
                }
            }
            if (i == nameArr.length) {
                return nameArr;
            }
            Name[] nameArr2 = new Name[i];
            int i2 = 0;
            for (int i3 = 0; i3 < nameArr.length; i3++) {
                Name name2 = nameArr[i3];
                if (name2 == null || !((Boolean) field.get(name2)).booleanValue()) {
                    nameArr2[i2] = nameArr[i3];
                    i2++;
                }
            }
            return nameArr2;
        }

        public static List removeGeneratedNodes(List list) {
            try {
                ArrayList arrayList = new ArrayList(list.size());
                for (Object obj : list) {
                    if (!isGenerated((org.eclipse.jdt.core.dom.ASTNode) obj)) {
                        arrayList.add(obj);
                    }
                }
                return arrayList;
            } catch (Exception unused) {
                return list;
            }
        }

        public static SimpleName[] removeGeneratedSimpleNames(SimpleName[] simpleNameArr) throws Exception {
            Field field = SimpleName.class.getField("$isGenerated");
            int i = 0;
            for (SimpleName simpleName : simpleNameArr) {
                if (simpleName == null || !((Boolean) field.get(simpleName)).booleanValue()) {
                    i++;
                }
            }
            if (i == simpleNameArr.length) {
                return simpleNameArr;
            }
            SimpleName[] simpleNameArr2 = new SimpleName[i];
            int i2 = 0;
            for (int i3 = 0; i3 < simpleNameArr.length; i3++) {
                SimpleName simpleName2 = simpleNameArr[i3];
                if (simpleName2 == null || !((Boolean) field.get(simpleName2)).booleanValue()) {
                    simpleNameArr2[i2] = simpleNameArr[i3];
                    i2++;
                }
            }
            return simpleNameArr2;
        }

        public static boolean returnFalse(Object obj) {
            return false;
        }

        public static Expression returnNullExpression(Object obj) {
            return null;
        }

        public static boolean returnTrue(Object obj) {
            return true;
        }

        public static void setIsGeneratedFlag(org.eclipse.jdt.core.dom.ASTNode aSTNode, ASTNode aSTNode2) throws Exception {
            if (aSTNode2 == null || aSTNode == null || EcjAugments.ASTNode_generatedBy.get(aSTNode2) == null) {
                return;
            }
            aSTNode.getClass().getField("$isGenerated").set(aSTNode, Boolean.TRUE);
        }

        public static void setIsGeneratedFlagForName(Name name, Object obj) throws Exception {
            if (!(obj instanceof ASTNode) || EcjAugments.ASTNode_generatedBy.get((ASTNode) obj) == null) {
                return;
            }
            name.getClass().getField("$isGenerated").set(name, Boolean.TRUE);
        }

        public static boolean skipRewriteVisibility(MemberVisibilityAdjustor.IncomingMemberVisibilityAdjustment incomingMemberVisibilityAdjustment) {
            return isGenerated(incomingMemberVisibilityAdjustment.getMember());
        }

        public static boolean skipRewritingGeneratedNodes(org.eclipse.jdt.core.dom.ASTNode aSTNode) throws Exception {
            return ((Boolean) aSTNode.getClass().getField("$isGenerated").get(aSTNode)).booleanValue();
        }

        public static String getRealNodeSource(String str, org.eclipse.jdt.core.dom.ASTNode aSTNode) throws Exception {
            return !isGenerated(aSTNode) ? str : aSTNode.toString();
        }

        public static int fixRetrieveRightBraceOrSemiColonPosition(int i, int i2) {
            return i == -1 ? i2 : i;
        }

        public static int fixRetrieveRightBraceOrSemiColonPosition(int i, FieldDeclaration fieldDeclaration) {
            if (i != -1 || fieldDeclaration == null) {
                return i;
            }
            if (EcjAugments.ASTNode_generatedBy.get(fieldDeclaration) != null) {
                return fieldDeclaration.declarationSourceEnd;
            }
            return -1;
        }

        public static boolean isGenerated(ASTNode aSTNode) {
            return aSTNode.getClass().getField("$generatedBy").get(aSTNode) != null;
        }

        public static boolean isGenerated(IMember iMember) {
            try {
                if (iMember.getNameRange().getLength() > 0) {
                    return iMember.getNameRange().equals(iMember.getSourceRange());
                }
                return true;
            } catch (JavaModelException unused) {
                return false;
            }
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class LombokDeps {
        public static final Method ADD_LOMBOK_NOTES;
        public static final Method POST_COMPILER_BUFFEREDOUTPUTSTREAM_STRING_STRING;
        public static final Method POST_COMPILER_BYTES_STRING;
        public static final Method POST_COMPILER_OUTPUTSTREAM;

        static {
            Class<?> shadowLoadClass = Util.shadowLoadClass("lombok.eclipse.agent.PatchFixesShadowLoaded");
            ADD_LOMBOK_NOTES = Util.findMethod(shadowLoadClass, "addLombokNotesToEclipseAboutDialog", (Class<?>[]) new Class[]{String.class, String.class});
            POST_COMPILER_BYTES_STRING = Util.findMethod(shadowLoadClass, "runPostCompiler", (Class<?>[]) new Class[]{byte[].class, String.class});
            POST_COMPILER_OUTPUTSTREAM = Util.findMethod(shadowLoadClass, "runPostCompiler", (Class<?>[]) new Class[]{OutputStream.class});
            POST_COMPILER_BUFFEREDOUTPUTSTREAM_STRING_STRING = Util.findMethod(shadowLoadClass, "runPostCompiler", (Class<?>[]) new Class[]{BufferedOutputStream.class, String.class, String.class});
        }

        public static String addLombokNotesToEclipseAboutDialog(String str, String str2) {
            try {
                return (String) Util.invokeMethod(ADD_LOMBOK_NOTES, str, str2);
            } catch (Throwable unused) {
                return str;
            }
        }

        public static byte[] runPostCompiler(byte[] bArr, String str) {
            return (byte[]) Util.invokeMethod(POST_COMPILER_BYTES_STRING, bArr, str);
        }

        public static OutputStream runPostCompiler(OutputStream outputStream) throws IOException {
            return (OutputStream) Util.invokeMethod(POST_COMPILER_OUTPUTSTREAM, outputStream);
        }

        public static BufferedOutputStream runPostCompiler(BufferedOutputStream bufferedOutputStream, String str, String str2) throws IOException {
            return (BufferedOutputStream) Util.invokeMethod(POST_COMPILER_BUFFEREDOUTPUTSTREAM_STRING_STRING, bufferedOutputStream, str, str2);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class Javadoc {
        private static final Method GET_HTML = Util.findMethod(Util.shadowLoadClass("lombok.eclipse.agent.PatchJavadoc"), "getHTMLContentFromSource", (Class<?>[]) new Class[]{Object.class, String.class, Object.class});

        public static String getHTMLContentFromSource(String str, IJavaElement iJavaElement) {
            return (String) Util.invokeMethod(GET_HTML, null, str, iJavaElement);
        }

        public static String getHTMLContentFromSource(String str, Object obj, IJavaElement iJavaElement) {
            return (String) Util.invokeMethod(GET_HTML, obj, str, iJavaElement);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class Util {
        private static ClassLoader shadowLoader;

        /* JADX INFO: Access modifiers changed from: private */
        public static ClassLoader findJdtCoreClassLoader(ClassLoader classLoader) {
            try {
                Object invoke = Permit.invoke(Permit.getMethod(classLoader.getClass(), "getBundle", new Class[0]), classLoader, new Object[0]);
                Object invoke2 = Permit.invoke(Permit.getMethod(invoke.getClass(), "getBundleContext", new Class[0]), invoke, new Object[0]);
                for (Object obj : (Object[]) Permit.invoke(Permit.getMethod(invoke2.getClass(), "getBundles", new Class[0]), invoke2, new Object[0])) {
                    if (obj.toString().startsWith("org.eclipse.jdt.core_")) {
                        return (ClassLoader) Permit.invoke(Permit.getMethod(obj.getClass(), "getModuleClassLoader", new Class[]{Boolean.TYPE}), obj, new Object[]{Boolean.FALSE});
                    }
                }
                return null;
            } catch (Throwable unused) {
                return null;
            }
        }

        public static Method findMethod(Class<?> cls, String str, String... strArr) {
            for (Method method : cls.getDeclaredMethods()) {
                if (str.equals(method.getName()) && sameTypes(method.getParameterTypes(), strArr)) {
                    return method;
                }
            }
            throw sneakyThrow(new NoSuchMethodException(a$$ExternalSyntheticOutline0.m(new StringBuilder(cls.getName()), "::", str)));
        }

        public static Method findMethodAnyArgs(Class<?> cls, String str) {
            for (Method method : cls.getDeclaredMethods()) {
                if (str.equals(method.getName())) {
                    return method;
                }
            }
            throw sneakyThrow(new NoSuchMethodException(a$$ExternalSyntheticOutline0.m(new StringBuilder(cls.getName()), "::", str)));
        }

        public static ClassLoader getShadowLoader() {
            if (shadowLoader == null) {
                try {
                    Class.forName("lombok.core.LombokNode");
                    shadowLoader = Util.class.getClassLoader();
                } catch (ClassNotFoundException unused) {
                    shadowLoader = Main.getShadowClassLoader();
                }
            }
            return shadowLoader;
        }

        public static Object invokeMethod(Method method, Object... objArr) {
            try {
                return method.invoke(null, objArr);
            } catch (IllegalAccessException e) {
                throw sneakyThrow(e);
            } catch (InvocationTargetException e2) {
                throw sneakyThrow(e2.getCause());
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static void prependToClassLoader(ClassLoader classLoader, ClassLoader classLoader2) {
            try {
                Permit.invoke(Permit.getMethod(classLoader.getClass(), "prependParent", new Class[]{ClassLoader.class}), classLoader, new Object[]{classLoader2});
            } catch (Throwable unused) {
            }
        }

        private static boolean sameTypes(Class<?>[] clsArr, String[] strArr) {
            if (clsArr.length != strArr.length) {
                return false;
            }
            for (int i = 0; i < clsArr.length; i++) {
                if (!clsArr[i].getName().equals(strArr[i])) {
                    return false;
                }
            }
            return true;
        }

        public static Class<?> shadowLoadClass(String str) {
            try {
                return Class.forName(str, true, getShadowLoader());
            } catch (ClassNotFoundException e) {
                throw sneakyThrow(e);
            }
        }

        private static RuntimeException sneakyThrow(Throwable th) {
            if (th != null) {
                sneakyThrow0(th);
                return null;
            }
            Single$$ExternalSyntheticBUOutline0.m$1("t");
            return null;
        }

        private static <T extends Throwable> void sneakyThrow0(Throwable th) throws Throwable {
            throw th;
        }

        public static Method findMethod(Class<?> cls, String str, Class<?>... clsArr) {
            try {
                return cls.getDeclaredMethod(str, clsArr);
            } catch (NoSuchMethodException e) {
                throw sneakyThrow(e);
            }
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class Tests {
        public static Object getBundle(Object obj, Class<?> cls) {
            if (obj != null) {
                return obj;
            }
            CodeSource codeSource = cls.getProtectionDomain().getCodeSource();
            if (codeSource == null) {
                return null;
            }
            String file = codeSource.getLocation().getFile();
            String substring = file.substring(file.lastIndexOf("/") + 1, file.indexOf("_"));
            for (Bundle bundle : EclipseStarter.getSystemBundleContext().getBundles()) {
                if (substring.equals(bundle.getSymbolicName())) {
                    return bundle;
                }
            }
            return null;
        }

        public static boolean isImplicitCanonicalConstructor(AbstractMethodDeclaration abstractMethodDeclaration, Object obj) {
            return ((abstractMethodDeclaration.bits & 512) == 0 || (abstractMethodDeclaration.bits & 1024) == 0) ? false : true;
        }

        public static Object printMethod(AbstractMethodDeclaration abstractMethodDeclaration, int i, Object obj, TypeDeclaration typeDeclaration) {
            String str;
            Map map = (Map) EcjAugments.CompilationUnit_javadoc.get(abstractMethodDeclaration.compilationResult.compilationUnit);
            Class<?> cls = obj.getClass();
            Class cls2 = Integer.TYPE;
            Method permissiveGetMethod = Permit.permissiveGetMethod(ASTNode.class, "printIndent", new Class[]{cls2, cls});
            if (map != null && (str = (String) map.get(EclipseHandlerUtil.getSignature(typeDeclaration, abstractMethodDeclaration))) != null) {
                for (String str2 : str.split("\r?\n")) {
                    try {
                        ((Appendable) Permit.invoke(permissiveGetMethod, (Object) null, new Object[]{Integer.valueOf(i), obj})).append(str2).append("\n");
                    } catch (Throwable unused) {
                    }
                }
            }
            Permit.invokeSneaky(Permit.permissiveGetMethod(AbstractMethodDeclaration.class, "print", new Class[]{cls2, obj.getClass()}), abstractMethodDeclaration, new Object[]{Integer.valueOf(i), obj});
            return obj;
        }

        public static StringBuffer returnStringBuffer(Object obj, StringBuffer stringBuffer) {
            return stringBuffer;
        }

        public static StringBuilder returnStringBuilder(Object obj, StringBuilder sb) {
            return sb;
        }

        public static StringBuilder printMethod(AbstractMethodDeclaration abstractMethodDeclaration, int i, StringBuilder sb, TypeDeclaration typeDeclaration) {
            return (StringBuilder) printMethod(abstractMethodDeclaration, i, (Object) sb, typeDeclaration);
        }

        public static StringBuffer printMethod(AbstractMethodDeclaration abstractMethodDeclaration, int i, StringBuffer stringBuffer, TypeDeclaration typeDeclaration) {
            return (StringBuffer) printMethod(abstractMethodDeclaration, i, (Object) stringBuffer, typeDeclaration);
        }
    }
}
