package org.bouncycastle.math.field;

/* loaded from: classes11.dex */
public interface ExtensionField extends FiniteField {
    int getDegree();

    FiniteField getSubfield();
}
