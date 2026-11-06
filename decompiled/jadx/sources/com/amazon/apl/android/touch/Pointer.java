package com.amazon.apl.android.touch;

import androidx.annotation.NonNull;
import com.amazon.apl.enums.PointerEventType;
import com.amazon.apl.enums.PointerType;
import java.util.Objects;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public final class Pointer {
    private PointerEventType eventType;
    private final int id;
    private final PointerType pointerType;
    private float x;
    private float y;

    public Pointer(Pointer pointer) {
        this(pointer.id, pointer.pointerType, pointer.eventType, pointer.x, pointer.y);
    }

    public static Pointer create(int i, @NonNull PointerType pointerType, @NonNull PointerEventType pointerEventType, float f, float f2) {
        return new Pointer(i, pointerType, pointerEventType, f, f2);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof Pointer)) {
            return false;
        }
        Pointer pointer = (Pointer) obj;
        return this.id == pointer.id && this.pointerType == pointer.pointerType && this.eventType == pointer.eventType && this.x == pointer.x && this.y == pointer.y;
    }

    public int getId() {
        return this.id;
    }

    @NonNull
    public PointerEventType getPointerEventType() {
        return this.eventType;
    }

    @NonNull
    public PointerType getPointerType() {
        return this.pointerType;
    }

    public float getX() {
        return this.x;
    }

    public float getY() {
        return this.y;
    }

    public int hashCode() {
        return Objects.hash(Integer.valueOf(this.id), this.pointerType, this.eventType, Float.valueOf(this.x), Float.valueOf(this.y));
    }

    @NonNull
    public Pointer toCancel() {
        return update(PointerEventType.kPointerCancel, this.x, this.y);
    }

    @NonNull
    public String toString() {
        return String.format("Pointer[id=%d, type=%s, eventType=%s, x=%f, y=%f]", Integer.valueOf(this.id), this.pointerType, this.eventType, Float.valueOf(this.x), Float.valueOf(this.y));
    }

    public void translate(int i, int i2) {
        this.x += i;
        this.y += i2;
    }

    public Pointer update(@NonNull PointerEventType pointerEventType, float f, float f2) {
        this.eventType = pointerEventType;
        this.x = f;
        this.y = f2;
        return this;
    }

    private Pointer(int i, @NonNull PointerType pointerType, @NonNull PointerEventType pointerEventType, float f, float f2) {
        this.id = i;
        this.pointerType = pointerType;
        this.eventType = pointerEventType;
        this.x = f;
        this.y = f2;
    }
}
