package com.amazon.apl.android;

import com.amazon.apl.android.ComponentFactory;
import com.amazon.apl.android.component.ComponentDependencies;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public final /* synthetic */ class ComponentFactory$$ExternalSyntheticLambda0 implements ComponentFactory.ComponentCreator {
    public final /* synthetic */ int $r8$classId;

    @Override // com.amazon.apl.android.ComponentFactory.ComponentCreator
    public final Component create(ComponentDependencies componentDependencies) {
        switch (this.$r8$classId) {
            case 0:
                return new MultiChildComponent(componentDependencies);
            case 1:
                return new Pager(componentDependencies);
            case 2:
                return new Frame(componentDependencies);
            case 3:
                return new ExtensionComponent(componentDependencies);
            case 4:
                return new Image(componentDependencies);
            case 5:
                return new Text(componentDependencies);
            case 6:
                return new VectorGraphic(componentDependencies);
            case 7:
                return new Video(componentDependencies);
            default:
                return new EditText(componentDependencies);
        }
    }
}
