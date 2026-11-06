package com.amazon.apl.android;

import com.amazon.apl.android.component.ComponentDependencies;
import com.amazon.apl.enums.ComponentType;
import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class ComponentFactory {
    private static final ComponentCreator<? extends Component> DEFAULT_CREATOR = new ComponentFactory$$ExternalSyntheticLambda0(0);
    private static final Map<ComponentType, ComponentCreator<? extends Component>> COMPONENT_FACTORY = new HashMap();

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @FunctionalInterface
    public interface ComponentCreator<T extends Component> {
        T create(ComponentDependencies componentDependencies);
    }

    static {
        register();
    }

    public static <T extends Component> T create(ComponentType componentType, ComponentDependencies componentDependencies) {
        return (T) getCreator(componentType).create(componentDependencies);
    }

    private static <T extends Component> ComponentCreator<T> getCreator(ComponentType componentType) {
        Map<ComponentType, ComponentCreator<? extends Component>> map = COMPONENT_FACTORY;
        return map.containsKey(componentType) ? (ComponentCreator) map.get(componentType) : (ComponentCreator<T>) DEFAULT_CREATOR;
    }

    private static void register() {
        registerCreator(ComponentType.kComponentTypePager, new ComponentFactory$$ExternalSyntheticLambda0(1));
        registerCreator(ComponentType.kComponentTypeFrame, new ComponentFactory$$ExternalSyntheticLambda0(2));
        registerCreator(ComponentType.kComponentTypeExtension, new ComponentFactory$$ExternalSyntheticLambda0(3));
        registerCreator(ComponentType.kComponentTypeImage, new ComponentFactory$$ExternalSyntheticLambda0(4));
        registerCreator(ComponentType.kComponentTypeText, new ComponentFactory$$ExternalSyntheticLambda0(5));
        registerCreator(ComponentType.kComponentTypeVectorGraphic, new ComponentFactory$$ExternalSyntheticLambda0(6));
        registerCreator(ComponentType.kComponentTypeVideo, new ComponentFactory$$ExternalSyntheticLambda0(7));
        registerCreator(ComponentType.kComponentTypeEditText, new ComponentFactory$$ExternalSyntheticLambda0(8));
    }

    private static void registerCreator(ComponentType componentType, ComponentCreator<? extends Component> componentCreator) {
        COMPONENT_FACTORY.put(componentType, componentCreator);
    }
}
