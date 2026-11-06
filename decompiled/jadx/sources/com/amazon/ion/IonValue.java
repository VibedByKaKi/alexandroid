package com.amazon.ion;

import com.amazon.ion.system.IonTextWriterBuilder;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public interface IonValue extends Cloneable {
    public static final IonValue[] EMPTY_ARRAY = new IonValue[0];

    void accept(ValueVisitor valueVisitor) throws Exception;

    void addTypeAnnotation(String str);

    void clearTypeAnnotations();

    IonValue clone() throws UnknownSymbolException;

    boolean equals(Object obj);

    IonContainer getContainer();

    @Deprecated
    int getFieldId();

    String getFieldName();

    SymbolToken getFieldNameSymbol();

    SymbolTable getSymbolTable();

    IonSystem getSystem();

    IonType getType();

    SymbolToken[] getTypeAnnotationSymbols();

    String[] getTypeAnnotations();

    boolean hasTypeAnnotation(String str);

    int hashCode();

    boolean isNullValue();

    boolean isReadOnly();

    void makeReadOnly();

    boolean removeFromContainer();

    void removeTypeAnnotation(String str);

    void setTypeAnnotationSymbols(SymbolToken... symbolTokenArr);

    void setTypeAnnotations(String... strArr);

    String toPrettyString();

    String toString();

    String toString(IonTextWriterBuilder ionTextWriterBuilder);

    IonValue topLevelValue();

    void writeTo(IonWriter ionWriter);
}
