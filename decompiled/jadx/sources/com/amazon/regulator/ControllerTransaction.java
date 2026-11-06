package com.amazon.regulator;

import ai.onnxruntime.OnnxMap$$ExternalSyntheticBUOutline0;
import android.os.Parcel;
import android.os.Parcelable;
import com.amazon.regulator.internal.Preconditions;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public final class ControllerTransaction implements Parcelable {
    public static final Parcelable.Creator<ControllerTransaction> CREATOR = new Parcelable.Creator<ControllerTransaction>() { // from class: com.amazon.regulator.ControllerTransaction.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public ControllerTransaction createFromParcel(Parcel parcel) {
            return new ControllerTransaction(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public ControllerTransaction[] newArray(int i) {
            return new ControllerTransaction[i];
        }
    };
    private final ViewController controller;
    private final ControllerTransition popTransition;
    private final ControllerTransition pushTransition;
    private final String tag;

    public ControllerTransaction(Parcel parcel) {
        try {
            ViewController viewController = (ViewController) Class.forName(parcel.readString()).newInstance();
            this.controller = viewController;
            ClassLoader classLoader = ControllerTransaction.class.getClassLoader();
            viewController.restoreState(parcel.readBundle(classLoader));
            this.popTransition = (ControllerTransition) parcel.readParcelable(classLoader);
            this.pushTransition = (ControllerTransition) parcel.readParcelable(classLoader);
            this.tag = parcel.readString();
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException e) {
            OnnxMap$$ExternalSyntheticBUOutline0.m("ViewController has to have a public constructor without any parameters", e);
            throw null;
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public ViewController getController() {
        return this.controller;
    }

    public ControllerTransition getPopTransition() {
        return this.popTransition;
    }

    public ControllerTransition getPushTransition() {
        return this.pushTransition;
    }

    public String getTag() {
        return this.tag;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.controller.getClass().getName());
        parcel.writeBundle(this.controller.saveState());
        parcel.writeParcelable(this.popTransition, i);
        parcel.writeParcelable(this.pushTransition, i);
        parcel.writeString(this.tag);
    }

    public ControllerTransaction(ViewController viewController, ControllerTransition controllerTransition, ControllerTransition controllerTransition2, String str) {
        Preconditions.nonNull(viewController, "controller == null");
        this.controller = viewController;
        this.popTransition = controllerTransition;
        this.pushTransition = controllerTransition2;
        this.tag = str;
    }

    public ControllerTransaction(ViewController viewController, ControllerTransition controllerTransition, ControllerTransition controllerTransition2) {
        this(viewController, controllerTransition, controllerTransition2, null);
    }

    public ControllerTransaction(ViewController viewController, ControllerTransition controllerTransition) {
        this(viewController, null, controllerTransition, null);
    }

    public ControllerTransaction(ViewController viewController, ControllerTransition controllerTransition, String str) {
        this(viewController, null, controllerTransition, str);
    }

    public ControllerTransaction(ViewController viewController) {
        this(viewController, null, null, null);
    }

    public ControllerTransaction(ViewController viewController, String str) {
        this(viewController, null, null, str);
    }
}
