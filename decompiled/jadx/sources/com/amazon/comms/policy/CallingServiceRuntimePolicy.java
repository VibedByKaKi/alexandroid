package com.amazon.comms.policy;

import com.amazon.comms.log.CommsLogger;
import com.amazon.comms.policy.Policy;
import com.amazon.comms.util.ListenerSet;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public abstract class CallingServiceRuntimePolicy implements Policy {
    private static final CommsLogger log = CommsLogger.getLogger(CallingServiceRuntimePolicy.class);
    private CSOutputComponent deviceCallingAndroidServiceComponent = new CSOutputComponent("DeviceCallingAndroidServiceComponent");
    private CSInputComponent callComponent = new CSInputComponent("CallComponent");
    private CSInputComponent showModeComponent = new CSInputComponent("ShowModeComponent");
    private final ListenerSet<Policy.OutputComponentsStateChangeListener> compStateChangeListeners = new ListenerSet<>();

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public class CSInputComponent extends BaseComponent implements Policy.InputComponent {
        public CSInputComponent(String str) {
            super(str);
        }

        @Override // com.amazon.comms.policy.CallingServiceRuntimePolicy.BaseComponent, com.amazon.comms.policy.Policy.Component
        public /* bridge */ /* synthetic */ String getName() {
            return super.getName();
        }

        @Override // com.amazon.comms.policy.CallingServiceRuntimePolicy.BaseComponent, com.amazon.comms.policy.Policy.Component
        public /* bridge */ /* synthetic */ RuntimeState getState() {
            return super.getState();
        }

        @Override // com.amazon.comms.policy.Policy.InputComponent
        public void setState(Policy.ComponentState componentState) {
            if (!(componentState instanceof RuntimeState)) {
                CallingServiceRuntimePolicy.log.e("Not a RuntimeState object");
                return;
            }
            RuntimeState runtimeState = this.state;
            setStateInternal((RuntimeState) componentState);
            CallingServiceRuntimePolicy.this.inputComponentUpdated(this, runtimeState);
        }

        public void setStateInternal(RuntimeState runtimeState) {
            this.state = runtimeState;
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public class CSOutputComponent extends BaseComponent implements Policy.OutputComponent {
        public CSOutputComponent(String str) {
            super(str);
        }

        @Override // com.amazon.comms.policy.CallingServiceRuntimePolicy.BaseComponent, com.amazon.comms.policy.Policy.Component
        public /* bridge */ /* synthetic */ String getName() {
            return super.getName();
        }

        @Override // com.amazon.comms.policy.CallingServiceRuntimePolicy.BaseComponent, com.amazon.comms.policy.Policy.Component
        public /* bridge */ /* synthetic */ RuntimeState getState() {
            return super.getState();
        }

        public void setState(RuntimeState runtimeState) {
            CallingServiceRuntimePolicy.log.i("Component:" + getName() + " set to:" + runtimeState);
            this.state = runtimeState;
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public enum RuntimeState implements Policy.ComponentState {
        Disable,
        Standby,
        Enable
    }

    public CSInputComponent getCallComponent() {
        return this.callComponent;
    }

    public CSOutputComponent getDeviceCallingAndroidServiceComponent() {
        return this.deviceCallingAndroidServiceComponent;
    }

    public CSInputComponent getShowModeComponent() {
        return this.showModeComponent;
    }

    public abstract void inputComponentUpdated(CSInputComponent cSInputComponent, RuntimeState runtimeState);

    public void notifyListeners() {
        this.compStateChangeListeners.notify(new ListenerSet.Notifier<Policy.OutputComponentsStateChangeListener>() { // from class: com.amazon.comms.policy.CallingServiceRuntimePolicy.1
            @Override // com.amazon.comms.util.ListenerSet.Notifier
            public void notify(Policy.OutputComponentsStateChangeListener outputComponentsStateChangeListener) {
                outputComponentsStateChangeListener.onOutputComponentsUpdated();
            }
        });
    }

    @Override // com.amazon.comms.policy.Policy
    public void registerListener(Policy.OutputComponentsStateChangeListener outputComponentsStateChangeListener) {
        this.compStateChangeListeners.add(outputComponentsStateChangeListener);
    }

    @Override // com.amazon.comms.policy.Policy
    public void reset() {
        this.compStateChangeListeners.clear();
        RuntimeState runtimeState = RuntimeState.Disable;
        setAllOutputComponents(runtimeState);
        setAllInputComponents(runtimeState);
    }

    public void setAllInputComponents(RuntimeState runtimeState) {
        this.callComponent.setStateInternal(runtimeState);
        this.showModeComponent.setStateInternal(runtimeState);
    }

    public void setAllOutputComponents(RuntimeState runtimeState) {
        this.deviceCallingAndroidServiceComponent.setState(runtimeState);
    }

    @Override // com.amazon.comms.policy.Policy
    public void unregisterListener(Policy.OutputComponentsStateChangeListener outputComponentsStateChangeListener) {
        this.compStateChangeListeners.remove(outputComponentsStateChangeListener);
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public abstract class BaseComponent implements Policy.Component {
        private String name;
        protected RuntimeState state;

        public BaseComponent(String str) {
            this.name = str;
        }

        @Override // com.amazon.comms.policy.Policy.Component
        public String getName() {
            return this.name;
        }

        @Override // com.amazon.comms.policy.Policy.Component
        public RuntimeState getState() {
            return this.state;
        }
    }
}
