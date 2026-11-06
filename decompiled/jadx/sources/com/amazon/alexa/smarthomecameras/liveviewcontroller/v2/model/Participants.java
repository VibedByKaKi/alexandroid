package com.amazon.alexa.smarthomecameras.liveviewcontroller.v2.model;

import androidx.annotation.NonNull;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;
import java.util.List;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public class Participants implements Serializable {

    @NonNull
    @SerializedName("cameras")
    private final List<Camera> cameras;

    @NonNull
    @SerializedName("viewers")
    private final List<Viewer> viewers;

    public Participants(List<Camera> list, List<Viewer> list2) {
        this.cameras = list;
        this.viewers = list2;
    }

    public List<Camera> getCameras() {
        return this.cameras;
    }

    public List<Viewer> getViewers() {
        return this.viewers;
    }
}
