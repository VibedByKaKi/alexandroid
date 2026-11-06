package org.openjdk.source.tree;

import java.util.List;
import org.openjdk.javax.lang.model.element.Name;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes11.dex */
public interface ClassTree extends StatementTree {
    Tree getExtendsClause();

    List<? extends Tree> getImplementsClause();

    List<? extends Tree> getMembers();

    ModifiersTree getModifiers();

    Name getSimpleName();

    List<? extends TypeParameterTree> getTypeParameters();
}
